// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import com.appboy.Constants;
import com.appboy.support.AppboyLogger;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

// Referenced classes of package bo.app:
//            es, af

public final class er
{

    private static final String a;
    private static final Locale b;
    private static final TimeZone c = TimeZone.getTimeZone("UTC");

    public er()
    {
    }

    public static long a()
    {
        return System.currentTimeMillis() / 1000L;
    }

    public static String a(Date date, af af1)
    {
        SimpleDateFormat simpledateformat;
        simpledateformat = new SimpleDateFormat();
        simpledateformat.setTimeZone(c);
        es.a[af1.ordinal()];
        JVM INSTR tableswitch 1 2: default 44
    //                   1 88
    //                   2 101;
           goto _L1 _L2 _L3
_L1:
        AppboyLogger.w(a, (new StringBuilder("Unsupported date format. Defaulting to ")).append(af.b.c).toString());
        simpledateformat.applyPattern(af.b.c);
_L5:
        return simpledateformat.format(date);
_L2:
        simpledateformat.applyPattern(af.a.c);
        continue; /* Loop/switch isn't completed */
_L3:
        simpledateformat.applyPattern(af.b.c);
        if (true) goto _L5; else goto _L4
_L4:
    }

    public static Date a(int i, int j, int k)
    {
        GregorianCalendar gregoriancalendar = new GregorianCalendar(i, j, k, 0, 0, 0);
        gregoriancalendar.setTimeZone(c);
        return gregoriancalendar.getTime();
    }

    public static Date a(long l)
    {
        return new Date(1000L * l);
    }

    public static double b()
    {
        return (double)System.currentTimeMillis() / 1000D;
    }

    public static long c()
    {
        return System.currentTimeMillis();
    }

    static 
    {
        a = String.format("%s.%s", new Object[] {
            Constants.APPBOY_LOG_TAG_PREFIX, bo/app/er.getName()
        });
        b = Locale.US;
    }
}
