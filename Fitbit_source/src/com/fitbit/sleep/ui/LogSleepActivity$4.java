// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.sleep.ui;

import android.widget.TimePicker;
import java.util.Calendar;

// Referenced classes of package com.fitbit.sleep.ui:
//            LogSleepActivity

class a
    implements android.app.TimeSetListener
{

    final LogSleepActivity a;

    public void onTimeSet(TimePicker timepicker, int i, int j)
    {
        LogSleepActivity.a(a);
        LogSleepActivity.e(a).set(11, i);
        LogSleepActivity.e(a).set(12, j);
        if (i == LogSleepActivity.b(a).get(11) && j == LogSleepActivity.b(a).get(12))
        {
            LogSleepActivity.b(a).add(12, -1);
        }
        LogSleepActivity.f(a);
        LogSleepActivity.d(a);
    }

    istener(LogSleepActivity logsleepactivity)
    {
        a = logsleepactivity;
        super();
    }
}
