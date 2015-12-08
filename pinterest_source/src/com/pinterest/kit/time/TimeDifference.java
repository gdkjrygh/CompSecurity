// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.kit.time;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

// Referenced classes of package com.pinterest.kit.time:
//            TimeUnit

public class TimeDifference
{

    private static Calendar a;
    private TimeUnit b;
    private int c;

    private TimeDifference(TimeUnit timeunit, int i)
    {
        b = timeunit;
        c = i;
    }

    public static TimeDifference a(Date date)
    {
        int i;
        int j;
        i = 0;
        if (date == null)
        {
            throw new IllegalArgumentException("Parameter \"date\" should not be null!");
        }
        j = (int)(date.getTime() / 1000L);
        j = Math.max(0, (int)(d().getTimeInMillis() / 1000L) - j);
        date = TimeUnit.values();
_L3:
        if (i >= date.length)
        {
            break MISSING_BLOCK_LABEL_104;
        }
        if (i + 1 != date.length && (long)j >= date[i + 1].a()) goto _L2; else goto _L1
_L1:
        date = date[i];
_L4:
        return new TimeDifference(date, (int)((long)j / date.a()));
_L2:
        i++;
          goto _L3
        date = null;
          goto _L4
    }

    public static String c()
    {
        return d().getTimeZone().getID();
    }

    private static Calendar d()
    {
        if (a == null)
        {
            a = Calendar.getInstance();
        }
        a.setTimeInMillis(System.currentTimeMillis());
        return a;
    }

    public final TimeUnit a()
    {
        return b;
    }

    public final int b()
    {
        return c;
    }
}
