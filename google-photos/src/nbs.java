// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class nbs
{

    public static final String a = nbj.getName();
    public static final String b = mvv.getName();
    public static final String c = nba.getName();
    public static final String d = onc.getName();
    private static nbr e;

    public static void a(Context context, olm olm1)
    {
        if (e == null)
        {
            e = new nbr();
        }
        olm1.a(nbj, nbr.a(context));
    }

    public static void a(olm olm1)
    {
        if (e == null)
        {
            e = new nbr();
        }
        olm1.a(mvv, new mvv[] {
            new nbi()
        });
    }

    public static void b(olm olm1)
    {
        if (e == null)
        {
            e = new nbr();
        }
        olm1.a(nba, new nba[] {
            new nax()
        });
    }

    public static void c(olm olm1)
    {
        if (e == null)
        {
            e = new nbr();
        }
        olm1.a(onc, new onc[0]);
    }

}
