// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import com.appboy.d;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

// Referenced classes of package bo.app:
//            em, ab

public final class el
{

    private static final String a;
    private static final Locale b;
    private static final TimeZone c = TimeZone.getTimeZone("UTC");

    public el()
    {
    }

    public static long a()
    {
        return System.currentTimeMillis() / 1000L;
    }

    public static String a(Date date, ab ab1)
    {
        SimpleDateFormat simpledateformat;
        simpledateformat = new SimpleDateFormat();
        simpledateformat.setTimeZone(c);
        em.a[ab1.ordinal()];
        JVM INSTR tableswitch 1 2: default 44
    //                   1 79
    //                   2 92;
           goto _L1 _L2 _L3
_L1:
        (new StringBuilder("Unsupported date format. Defaulting to ")).append(ab.b.c);
        simpledateformat.applyPattern(ab.b.c);
_L5:
        return simpledateformat.format(date);
_L2:
        simpledateformat.applyPattern(ab.a.c);
        continue; /* Loop/switch isn't completed */
_L3:
        simpledateformat.applyPattern(ab.b.c);
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
            d.a, bo/app/el.getName()
        });
        b = Locale.US;
    }
}
