// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.tinder.utils:
//            v

public final class DateUtils extends android.text.format.DateUtils
{
    private static class PooledDateFormat extends SimpleDateFormat
    {

        private static final android.support.v4.g.h.c a = new android.support.v4.g.h.c();

        public static SimpleDateFormat a()
        {
            SimpleDateFormat simpledateformat1 = (SimpleDateFormat)a.a();
            SimpleDateFormat simpledateformat = simpledateformat1;
            if (simpledateformat1 == null)
            {
                simpledateformat = new SimpleDateFormat("yy-MM-dd'T'HH:mm:ss.SSS'Z'");
                simpledateformat.setTimeZone(TimeZone.getTimeZone("Etc/UTC"));
            }
            return simpledateformat;
        }

    }


    private static final SimpleDateFormat a;

    public static int a(Date date)
    {
        Calendar calendar;
        int j;
        calendar = Calendar.getInstance();
        calendar.setTime(date);
        date = Calendar.getInstance();
        j = date.get(1) - calendar.get(1);
        if (date.get(2) >= calendar.get(2)) goto _L2; else goto _L1
_L1:
        int i = j - 1;
_L4:
        j = i;
        if (i < 0)
        {
            j = 0;
        }
        return j;
_L2:
        i = j;
        if (date.get(2) == calendar.get(2))
        {
            i = j;
            if (date.get(5) < calendar.get(5))
            {
                i = j - 1;
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static long a(String s)
    {
        com/tinder/utils/DateUtils;
        JVM INSTR monitorenter ;
        long l = System.currentTimeMillis();
        if (s != null) goto _L2; else goto _L1
_L1:
        com/tinder/utils/DateUtils;
        JVM INSTR monitorexit ;
        return l;
_L2:
        long l1 = a.parse(s).getTime();
        l = l1;
        continue; /* Loop/switch isn't completed */
        ParseException parseexception;
        parseexception;
        v.a((new StringBuilder("Failed to get time from String date ")).append(s).toString(), parseexception);
        if (true) goto _L1; else goto _L3
_L3:
        s;
        throw s;
    }

    public static String a(long l)
    {
        SimpleDateFormat simpledateformat = new SimpleDateFormat("MMM d, yyyy hh:mm:ss aaa");
        simpledateformat.setTimeZone(TimeZone.getDefault());
        return simpledateformat.format(new Date(l));
    }

    public static DateFormat a()
    {
        return PooledDateFormat.a();
    }

    public static boolean a(Date date, Date date1)
    {
        Calendar calendar = Calendar.getInstance();
        Calendar calendar1 = Calendar.getInstance();
        calendar.setTime(date);
        calendar1.setTime(date1);
        return calendar.get(1) == calendar1.get(1) && calendar.get(6) == calendar1.get(6);
    }

    public static String b(long l)
    {
        return String.format("%02d:%02d:%02d", new Object[] {
            Integer.valueOf((int)TimeUnit.MILLISECONDS.toHours(l) % 24), Integer.valueOf((int)TimeUnit.MILLISECONDS.toMinutes(l) % 60), Integer.valueOf((int)TimeUnit.MILLISECONDS.toSeconds(l) % 60)
        });
    }

    public static DateFormat b()
    {
        SimpleDateFormat simpledateformat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        simpledateformat.setTimeZone(TimeZone.getTimeZone("Etc/UTC"));
        return simpledateformat;
    }

    static 
    {
        SimpleDateFormat simpledateformat = new SimpleDateFormat("yy-MM-dd'T'HH:mm:ss.SSS'Z'");
        a = simpledateformat;
        simpledateformat.setTimeZone(TimeZone.getTimeZone("Etc/UTC"));
    }
}
