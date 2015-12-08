// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class eaw
{

    public static final String a = dzd.getName();
    public static final String b = duq.getName();
    public static final String c = nrc.getName();
    private static eav d;

    public static void a(Context context, olm olm1)
    {
        if (d == null)
        {
            d = new eav();
        }
        olm1.a(dzd, new dzd[] {
            new eao(context, dzv.a(11)), new eao(context, dzv.a(12))
        });
    }

    public static void a(olm olm1)
    {
        if (d == null)
        {
            d = new eav();
        }
        olm1.a(duq, new duq[] {
            new ean(11), new ean(12)
        });
    }

    public static void b(olm olm1)
    {
        if (d == null)
        {
            d = new eav();
        }
        ifj ifj1 = (ifj)olm1.a(ifj);
        est est1 = (est)olm1.a(est);
        eci eci1 = (eci)olm1.a(eci);
        olm1.a(nrc, new nrc[] {
            new eaq(ifj1, eci1), new eal(est1, eci1)
        });
    }

}
