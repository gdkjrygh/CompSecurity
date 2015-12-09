// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.sleep.ui;

import android.widget.DatePicker;
import java.util.Calendar;

// Referenced classes of package com.fitbit.sleep.ui:
//            LogSleepActivity

class a
    implements android.app.DateSetListener
{

    final LogSleepActivity a;

    public void onDateSet(DatePicker datepicker, int i, int j, int k)
    {
        LogSleepActivity.a(a);
        LogSleepActivity.b(a).set(1, i);
        LogSleepActivity.b(a).set(2, j);
        LogSleepActivity.b(a).set(5, k);
        LogSleepActivity.c(a);
        LogSleepActivity.d(a);
    }

    istener(LogSleepActivity logsleepactivity)
    {
        a = logsleepactivity;
        super();
    }
}
