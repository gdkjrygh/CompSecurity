// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.text.format.Time;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

final class exc
    implements ewz
{

    private final Context a;
    private final muz b;
    private final Calendar c = ivc.a();
    private final Calendar d = ivc.a();
    private String e;
    private String f;
    private final Map g = new HashMap();
    private final noz h;

    exc(Context context)
    {
        a = context;
        b = (muz)olm.a(context, muz);
        Locale locale = Locale.getDefault();
        java.util.TimeZone timezone = ivc.b();
        h = noz.a(context, "DateFormatUtilsImpl", new String[0]);
        exe aexe[] = exe.values();
        int j = aexe.length;
        for (int i = 0; i < j; i++)
        {
            exe exe1 = aexe[i];
            DateFormat dateformat = a(context, exe1, locale);
            if (exe1 != exe.a)
            {
                dateformat.setTimeZone(timezone);
            }
            g.put(exe1, dateformat);
        }

    }

    private static int a(Calendar calendar)
    {
        return Time.getJulianDay(calendar.getTimeInMillis(), 0L);
    }

    private DateFormat a(Context context, exe exe1, Locale locale)
    {
        context = context.getResources().getString(exe1.l);
        SimpleDateFormat simpledateformat;
        try
        {
            simpledateformat = new SimpleDateFormat(context, locale);
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            if (h.a())
            {
                noy.a("locale", locale);
                noy.a("localized date pattern", context);
            }
            return new SimpleDateFormat(exe1.m, locale);
        }
        return simpledateformat;
    }

    private void a(int i)
    {
        long l1 = b.a();
        long l = l1;
        if (i != exa.a)
        {
            l = l1 + (ivc.a(l1) - eyr.a);
        }
        d.setTimeInMillis(l);
    }

    private static boolean a(Calendar calendar, Calendar calendar1)
    {
        return d(calendar, calendar1) == 0;
    }

    private static boolean b(Calendar calendar, Calendar calendar1)
    {
        return d(calendar, calendar1) == 1;
    }

    private static boolean c(Calendar calendar, Calendar calendar1)
    {
        int i = d(calendar, calendar1);
        return i >= 0 && i < 7 && calendar.get(3) == calendar1.get(3);
    }

    private static int d(Calendar calendar, Calendar calendar1)
    {
        return a(calendar1) - a(calendar);
    }

    public final String a(long l, int i)
    {
        boolean flag;
        flag = true;
        if (e == null)
        {
            e = a.getResources().getString(b.nt);
        }
        if (f == null)
        {
            f = a.getResources().getString(b.nu);
        }
        a(i);
        c.setTimeInMillis(l);
        if (c.get(1) != d.get(1))
        {
            flag = false;
        }
        exd.a[i - 1];
        JVM INSTR tableswitch 1 6: default 128
    //                   1 153
    //                   2 180
    //                   3 200
    //                   4 220
    //                   5 265
    //                   6 285;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L1:
        DateFormat dateformat;
        if (a(c, d))
        {
            return e;
        }
        if (b(c, d))
        {
            return f;
        }
        if (c(c, d))
        {
            dateformat = (DateFormat)g.get(exe.e);
        } else
        if (flag)
        {
            dateformat = (DateFormat)g.get(exe.c);
        } else
        {
            dateformat = (DateFormat)g.get(exe.d);
        }
          goto _L8
_L2:
        dateformat = (DateFormat)g.get(exe.k);
_L10:
        return dateformat.format(Long.valueOf(l));
_L3:
        dateformat = (DateFormat)g.get(exe.i);
        continue; /* Loop/switch isn't completed */
_L4:
        dateformat = (DateFormat)g.get(exe.j);
        continue; /* Loop/switch isn't completed */
_L5:
        if (flag)
        {
            dateformat = (DateFormat)g.get(exe.f);
        } else
        {
            dateformat = (DateFormat)g.get(exe.g);
        }
        continue; /* Loop/switch isn't completed */
_L6:
        dateformat = (DateFormat)g.get(exe.h);
        continue; /* Loop/switch isn't completed */
_L7:
        if (a(c, d))
        {
            dateformat = (DateFormat)g.get(exe.a);
        } else
        {
            if (b(c, d))
            {
                return f;
            }
            if (flag)
            {
                dateformat = (DateFormat)g.get(exe.h);
            } else
            {
                dateformat = (DateFormat)g.get(exe.b);
            }
        }
        continue; /* Loop/switch isn't completed */
_L8:
        if (true) goto _L10; else goto _L9
_L9:
    }

    public final int b(long l, int i)
    {
        a(i);
        c.setTimeInMillis(l);
        switch (exd.a[i - 1])
        {
        default:
            if (a(c, d) || b(c, d) || c(c, d))
            {
                return exb.c;
            } else
            {
                return exb.b;
            }

        case 1: // '\001'
            return exb.d;

        case 2: // '\002'
            return exb.d;

        case 3: // '\003'
            return exb.d;

        case 4: // '\004'
            return exb.d;

        case 5: // '\005'
            return exb.b;

        case 6: // '\006'
            break;
        }
        if (a(c, d))
        {
            return exb.a;
        }
        if (b(c, d))
        {
            return exb.c;
        } else
        {
            return exb.b;
        }
    }
}
