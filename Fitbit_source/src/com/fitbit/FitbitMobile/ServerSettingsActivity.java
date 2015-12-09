// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.FitbitMobile;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import com.fitbit.savedstate.ServerSavedState;
import com.fitbit.savedstate.p;
import com.fitbit.ui.FitbitActivity;

public class ServerSettingsActivity extends FitbitActivity
{

    public ServerSettingsActivity()
    {
    }

    public static void a(Context context)
    {
        context.startActivity(new Intent(context, com/fitbit/FitbitMobile/ServerSettingsActivity));
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f040046);
        bundle = (EditText)findViewById(0x7f1101aa);
        bundle.setText(ServerSavedState.h());
        EditText edittext = (EditText)findViewById(0x7f1101ab);
        edittext.setText(ServerSavedState.i());
        findViewById(0x7f1101ac).setOnClickListener(new android.view.View.OnClickListener(bundle, edittext) {

            final EditText a;
            final EditText b;
            final ServerSettingsActivity c;

            public void onClick(View view)
            {
                ServerSavedState.a(a.getText().toString());
                ServerSavedState.b(b.getText().toString());
                p.b();
                System.exit(0);
            }

            
            {
                c = ServerSettingsActivity.this;
                a = edittext;
                b = edittext1;
                super();
            }
        });
    }
}
