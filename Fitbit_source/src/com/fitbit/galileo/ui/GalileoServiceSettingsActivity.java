// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.galileo.ui;

import android.content.Context;
import android.content.Intent;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import com.fitbit.multipledevice.a;
import com.fitbit.savedstate.TrackerSyncPreferencesSavedState;
import com.fitbit.ui.FitbitActivity;

// Referenced classes of package com.fitbit.galileo.ui:
//            GalileoServiceSettingsActivity_

public class GalileoServiceSettingsActivity extends FitbitActivity
{

    protected EditText a;
    protected EditText b;
    protected CheckBox c;

    public GalileoServiceSettingsActivity()
    {
    }

    public static void a(Context context)
    {
        context.startActivity(new Intent(context, com/fitbit/galileo/ui/GalileoServiceSettingsActivity_));
    }

    protected void c()
    {
        a.setText((new StringBuilder()).append("").append(TrackerSyncPreferencesSavedState.v()).toString());
        b.setText((new StringBuilder()).append("").append(TrackerSyncPreferencesSavedState.J()).toString());
        c.setChecked(TrackerSyncPreferencesSavedState.t());
        c.setOnCheckedChangeListener(new android.widget.CompoundButton.OnCheckedChangeListener() {

            final GalileoServiceSettingsActivity a;

            public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
            {
                TrackerSyncPreferencesSavedState.e(flag);
            }

            
            {
                a = GalileoServiceSettingsActivity.this;
                super();
            }
        });
    }

    protected void d()
    {
        Integer integer;
        Integer integer2;
        try
        {
            integer = Integer.valueOf(a.getText().toString());
        }
        catch (Exception exception)
        {
            exception = null;
        }
        if (integer != null)
        {
            Integer integer1 = integer;
            if (integer.intValue() < 3)
            {
                integer1 = Integer.valueOf(3);
            }
            TrackerSyncPreferencesSavedState.c(integer1.intValue());
            TrackerSyncPreferencesSavedState.d(integer1.intValue() - 1);
        }
        try
        {
            integer2 = Integer.valueOf(b.getText().toString());
        }
        catch (Exception exception1)
        {
            integer2 = null;
        }
        if (integer2 != null)
        {
            integer = integer2;
            if (integer2.intValue() < 1)
            {
                integer = Integer.valueOf(1);
            }
            integer2 = integer;
            if (integer.intValue() > 1000)
            {
                integer2 = Integer.valueOf(1000);
            }
            TrackerSyncPreferencesSavedState.a(integer2.intValue());
        }
        com.fitbit.multipledevice.a.a().g();
        finish();
    }
}
