// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class dqh
{

    public static final String a = esq.getName();
    public static final String b = eru.getName();
    public static final String c = dqi.getName();
    public static final String d = evf.getName();
    public static final String e = dps.getName();
    public static final String f = dqd.getName();
    public static final String g = dpr.getName();
    public static final String h = dpp.getName();
    private static dqg i;

    public static void a(Context context, olm olm1)
    {
        if (i == null)
        {
            i = new dqg();
        }
        olm1.a(dqi, new dqi(context));
    }

    public static void a(olm olm1)
    {
        if (i == null)
        {
            i = new dqg();
        }
        olm1.a(esq, new esq[] {
            dpp.a, dqi.a, dqd.a
        });
    }

    public static void b(Context context, olm olm1)
    {
        if (i == null)
        {
            i = new dqg();
        }
        olm1.a(dps, new dps(context));
    }

    public static void b(olm olm1)
    {
        if (i == null)
        {
            i = new dqg();
        }
        dqi dqi1 = (dqi)olm1.a(dqi);
        dqd dqd1 = (dqd)olm1.a(dqd);
        olm1.a(eru, new eru[] {
            dqi1.b, dqd1.b
        });
    }

    public static void c(Context context, olm olm1)
    {
        if (i == null)
        {
            i = new dqg();
        }
        olm1.a(dqd, new dqd(context));
    }

    public static void c(olm olm1)
    {
        if (i == null)
        {
            i = new dqg();
        }
        olm1.a(evf, new evf[] {
            (dpp)olm1.a(dpp)
        });
    }

    public static void d(Context context, olm olm1)
    {
        if (i == null)
        {
            i = new dqg();
        }
        olm1.a(dpp, new dpp(context));
    }

    public static void d(olm olm1)
    {
        if (i == null)
        {
            i = new dqg();
        }
        olm1.a(dpr, new dpr[] {
            (dqi)olm1.a(dqi), (dqd)olm1.a(dqd)
        });
    }

}
