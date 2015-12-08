// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.alarm.ui;

import android.content.Context;
import android.widget.TextView;
import com.fitbit.data.domain.device.Device;
import com.fitbit.data.domain.device.DeviceVersion;
import com.fitbit.savedstate.UISavedState;
import com.fitbit.ui.FitbitActivity;
import com.fitbit.util.p;

// Referenced classes of package com.fitbit.alarm.ui:
//            AlarmHelpSecondActivity_, LogAlarmActivity

public class AlarmHelpSecondActivity extends FitbitActivity
{

    private static final int d = 400;
    protected TextView a;
    protected String b;
    protected String c;

    public AlarmHelpSecondActivity()
    {
    }

    public static void a(Context context, int i, Device device)
    {
        AlarmHelpSecondActivity_.a(context).a(device.h().name()).b(device.d()).b(i);
    }

    public static void a(Context context, int i, String s)
    {
        AlarmHelpSecondActivity_.a(context).a(s).b(i);
    }

    protected void a()
    {
        try
        {
            if (DeviceVersion.valueOf(b) == DeviceVersion.FLEX)
            {
                a.setText(0x7f0802b0);
            }
            return;
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            illegalargumentexception.printStackTrace();
        }
    }

    protected void b()
    {
        UISavedState.b(false);
        LogAlarmActivity.a(this, 400, p.c(c));
    }

    protected void d_(int i)
    {
        setResult(-1);
        finish();
    }
}
