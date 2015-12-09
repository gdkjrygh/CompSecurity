// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.debug;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import com.fitbit.savedstate.ServerSavedState;
import com.fitbit.ui.FitbitActivity;

public class ProxySettings extends FitbitActivity
{

    public ProxySettings()
    {
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f04001a);
        bundle = (EditText)findViewById(0x7f1100e7);
        bundle.setText(ServerSavedState.j());
        ((Button)findViewById(0x7f1100e8)).setOnClickListener(new android.view.View.OnClickListener(bundle) {

            final EditText a;
            final ProxySettings b;

            public void onClick(View view)
            {
                ServerSavedState.c(a.getText().toString());
            }

            
            {
                b = ProxySettings.this;
                a = edittext;
                super();
            }
        });
    }
}
