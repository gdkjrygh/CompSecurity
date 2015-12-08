// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.utilities;

import java.util.Calendar;
import java.util.TimeZone;

// Referenced classes of package com.accuweather.android.utilities:
//            IClock

public class SystemClock
    implements IClock
{

    public SystemClock()
    {
    }

    public static long getSystemMillisecondsForTopOfNextMinute()
    {
        return getSystemMillisecondsForTopOfNextMinute(Calendar.getInstance());
    }

    public static long getSystemMillisecondsForTopOfNextMinute(Calendar calendar)
    {
        calendar.add(12, 1);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar.getTimeInMillis();
    }

    public Calendar getCalendar()
    {
        return Calendar.getInstance();
    }

    public Calendar getCalendar(TimeZone timezone)
    {
        return Calendar.getInstance(timezone);
    }

    public long getCurrentTimeInMillis()
    {
        return System.currentTimeMillis();
    }
}
