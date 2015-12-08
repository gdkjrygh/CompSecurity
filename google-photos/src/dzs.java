// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class dzs
{

    public static final String a = gsk.getName();
    public static final String b = dur.getName();
    public static final String c = ngs.getName();
    public static final String d = nrf.getName();
    public static final String e = eci.getName();
    public static final String f = dzq.getName();
    public static final String g = dze.getName();
    public static final String h = nqz.getName();
    public static final String i = dxy.getName();
    public static final String j = dzn.getName();
    public static final String k = nrc.getName();
    public static final String l = omt.getName();
    private static dzr m;

    public static void a(Context context, olm olm1)
    {
        if (m == null)
        {
            m = new dzr();
        }
        olm1.a(dur, new dur[] {
            (dur)olm.a(context, dzn)
        });
    }

    public static void a(olm olm1)
    {
        if (m == null)
        {
            m = new dzr();
        }
        olm1.a(gsk, (dzn)olm1.a(dzn));
    }

    public static void b(Context context, olm olm1)
    {
        if (m == null)
        {
            m = new dzr();
        }
        olm1.a(ngs, new ngs[] {
            new dzb(context)
        });
    }

    public static void b(olm olm1)
    {
        if (m == null)
        {
            m = new dzr();
        }
        olm1.a(eci, new dzu());
    }

    public static void c(Context context, olm olm1)
    {
        if (m == null)
        {
            m = new dzr();
        }
        olm1.a(nrf, new dzc(context));
    }

    public static void c(olm olm1)
    {
        if (m == null)
        {
            m = new dzr();
        }
        olm1.a(dzq, new dzq());
    }

    public static void d(Context context, olm olm1)
    {
        if (m == null)
        {
            m = new dzr();
        }
        olm1.a(dze, new dze(context));
    }

    public static void d(olm olm1)
    {
        if (m == null)
        {
            m = new dzr();
        }
        olm1.a(nqz, new dzf());
    }

    public static void e(Context context, olm olm1)
    {
        if (m == null)
        {
            m = new dzr();
        }
        olm1.a(dzn, new dzn(context, (mmv)olm1.a(mmv)));
    }

    public static void e(olm olm1)
    {
        if (m == null)
        {
            m = new dzr();
        }
        olm1.a(dxy, new dxy[] {
            new dzh()
        });
    }

    public static void f(Context context, olm olm1)
    {
        if (m == null)
        {
            m = new dzr();
        }
        ics ics1 = (ics)olm1.a(ics);
        eci eci1 = (eci)olm1.a(eci);
        olm1.a(nrc, new nrc[] {
            new dzx(ics1), new dza(context), new dzw(eci1)
        });
    }

    public static void f(olm olm1)
    {
        if (m == null)
        {
            m = new dzr();
        }
        olm1.a(omt, new omt[] {
            new dyy()
        });
    }

}
