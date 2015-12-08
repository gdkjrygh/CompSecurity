// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.settings.ui;

import android.content.Context;
import android.content.Intent;
import android.widget.EditText;
import com.fitbit.savedstate.BackgroundRequestSavedState;
import com.fitbit.ui.FitbitActivity;

// Referenced classes of package com.fitbit.settings.ui:
//            ClientBackOffSettingsActivity_

public class ClientBackOffSettingsActivity extends FitbitActivity
{

    protected EditText a;
    protected EditText b;
    protected EditText c;
    protected EditText d;

    public ClientBackOffSettingsActivity()
    {
    }

    public static void a(Context context)
    {
        context.startActivity(new Intent(context, com/fitbit/settings/ui/ClientBackOffSettingsActivity_));
    }

    protected void e()
    {
        int i = BackgroundRequestSavedState.a(com.fitbit.savedstate.BackgroundRequestSavedState.FilterTypes.b, 3);
        long l = BackgroundRequestSavedState.a(com.fitbit.savedstate.BackgroundRequestSavedState.FilterTypes.b, 60000L);
        a.setText(String.valueOf(i));
        b.setText(String.valueOf(l));
        i = BackgroundRequestSavedState.a(com.fitbit.savedstate.BackgroundRequestSavedState.FilterTypes.a, 40);
        l = BackgroundRequestSavedState.a(com.fitbit.savedstate.BackgroundRequestSavedState.FilterTypes.a, 0x927c0L);
        c.setText(String.valueOf(i));
        d.setText(String.valueOf(l));
    }

    protected void f()
    {
        Integer integer1 = null;
        long l = Long.parseLong(b.getText().toString());
        Long long1 = Long.valueOf(l);
_L1:
        int i = Integer.parseInt(a.getText().toString());
        Integer integer = Integer.valueOf(i);
_L2:
        l = Long.parseLong(d.getText().toString());
        Long long2 = Long.valueOf(l);
_L3:
        i = Integer.parseInt(c.getText().toString());
        integer1 = Integer.valueOf(i);
_L4:
        if (long1 != null && integer != null && long2 != null && integer1 != null)
        {
            BackgroundRequestSavedState.a(com.fitbit.savedstate.BackgroundRequestSavedState.FilterTypes.b, long1.longValue(), integer.intValue());
            BackgroundRequestSavedState.a(com.fitbit.savedstate.BackgroundRequestSavedState.FilterTypes.a, long2.longValue(), integer1.intValue());
            finish();
        }
        return;
        NumberFormatException numberformatexception;
        numberformatexception;
        numberformatexception = null;
          goto _L1
        NumberFormatException numberformatexception1;
        numberformatexception1;
        numberformatexception1 = null;
          goto _L2
        NumberFormatException numberformatexception2;
        numberformatexception2;
        numberformatexception2 = null;
          goto _L3
        NumberFormatException numberformatexception3;
        numberformatexception3;
          goto _L4
    }
}
