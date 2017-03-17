package com.reserva;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.cecyt9.reserva10.R;

/**
 * Created by CECyT9 on 16/03/2017.
 */

public class Login  extends Activity {
        String txtUsuario = "Nadia";
        String txtContra = "123abc";
        TextView Login;

@Override
protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        Login = (TextView) findViewById(R.id.Login);

        Bundle recibe = new Bundle();
        recibe = this.getIntent().getExtras();

        txtUsuario = recibe.getString("txtUsuario");
        txtContra = recibe.getString("txtContra");

        if(txtUsuario.equalsIgnoreCase("Nadia") && txtContra.equalsIgnoreCase("123abc")){
            Intent envia = new Intent(this, MainActivity.class);
            finish();
            startActivity(envia);

        }
        else{
        Login.setText("Estas mal, morro");
    }


}