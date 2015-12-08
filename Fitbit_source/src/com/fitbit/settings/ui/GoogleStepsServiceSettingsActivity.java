// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.settings.ui;

import android.content.Context;
import android.widget.EditText;
import com.fitbit.savedstate.j;
import com.fitbit.ui.FitbitActivity;

// Referenced classes of package com.fitbit.settings.ui:
//            GoogleStepsServiceSettingsActivity_

public class GoogleStepsServiceSettingsActivity extends FitbitActivity
{

    protected EditText a;

    public GoogleStepsServiceSettingsActivity()
    {
    }

    public static void a(Context context)
    {
        context.startActivity(GoogleStepsServiceSettingsActivity_.b(context).a());
    }

    private long g()
    {
        long l;
        try
        {
            l = Long.parseLong(a.getText().toString());
        }
        catch (NumberFormatException numberformatexception)
        {
            return 0L;
        }
        return l;
    }

    protected void e()
    {
        long l = j.h();
        a.setText(String.valueOf(l));
    }

    protected void f()
    {
        j.a(g());
    }
}
