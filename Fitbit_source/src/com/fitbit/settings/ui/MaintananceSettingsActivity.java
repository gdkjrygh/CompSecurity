// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.settings.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.fitbit.savedstate.f;
import com.fitbit.ui.FitbitActivity;
import com.fitbit.util.am;
import java.util.Date;

public class MaintananceSettingsActivity extends FitbitActivity
{

    private TextView a;
    private EditText b;
    private EditText c;
    private Button d;
    private Button e;
    private Button f;

    public MaintananceSettingsActivity()
    {
    }

    static EditText a(MaintananceSettingsActivity maintanancesettingsactivity)
    {
        return maintanancesettingsactivity.b;
    }

    public static void a(Context context)
    {
        context.startActivity(new Intent(context, com/fitbit/settings/ui/MaintananceSettingsActivity));
    }

    static EditText b(MaintananceSettingsActivity maintanancesettingsactivity)
    {
        return maintanancesettingsactivity.c;
    }

    static void c(MaintananceSettingsActivity maintanancesettingsactivity)
    {
        maintanancesettingsactivity.f();
    }

    private void f()
    {
        Date date = new Date(com.fitbit.savedstate.f.h());
        a.setText(date.toString());
        b.setText(String.valueOf(com.fitbit.savedstate.f.i()));
        c.setText(String.valueOf(com.fitbit.savedstate.f.j()));
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f040035);
        a = (TextView)findViewById(0x7f11016e);
        b = (EditText)findViewById(0x7f11016f);
        c = (EditText)findViewById(0x7f110170);
        d = (Button)findViewById(0x7f110171);
        e = (Button)findViewById(0x7f110172);
        f = (Button)findViewById(0x7f110173);
        d.setOnClickListener(new android.view.View.OnClickListener() {

            final MaintananceSettingsActivity a;

            public void onClick(View view)
            {
                Integer integer = null;
                long l = Long.parseLong(MaintananceSettingsActivity.a(a).getText().toString());
                view = Long.valueOf(l);
_L1:
                int i = Integer.parseInt(MaintananceSettingsActivity.b(a).getText().toString());
                integer = Integer.valueOf(i);
_L2:
                if (view != null)
                {
                    com.fitbit.savedstate.f.b(view.longValue());
                }
                if (integer != null)
                {
                    com.fitbit.savedstate.f.a(integer.intValue());
                }
                MaintananceSettingsActivity.c(a);
                return;
                view;
                view = null;
                  goto _L1
                NumberFormatException numberformatexception;
                numberformatexception;
                  goto _L2
            }

            
            {
                a = MaintananceSettingsActivity.this;
                super();
            }
        });
        e.setOnClickListener(new android.view.View.OnClickListener() {

            final MaintananceSettingsActivity a;

            public void onClick(View view)
            {
                MaintananceSettingsActivity.c(a);
            }

            
            {
                a = MaintananceSettingsActivity.this;
                super();
            }
        });
        f.setOnClickListener(new android.view.View.OnClickListener() {

            final MaintananceSettingsActivity a;

            public void onClick(View view)
            {
                am.a().a(a, true);
            }

            
            {
                a = MaintananceSettingsActivity.this;
                super();
            }
        });
    }

    protected void onResume()
    {
        super.onResume();
        f();
    }
}
