// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class hqm
{

    public static final String a = hqj.getName();
    public static final String b = hqg.getName();
    public static final String c = hqn.getName();
    private static hql d;

    public static void a(Context context, olm olm1)
    {
        if (d == null)
        {
            d = new hql();
        }
        olm1.a(hqj, new hqj(context, (hqn)olm1.a(hqn), (muz)olm1.a(muz), (hfk)olm1.a(hfk)));
    }

    public static void a(olm olm1)
    {
        if (d == null)
        {
            d = new hql();
        }
        olm1.a(hqn, new hqn());
    }

    public static void b(Context context, olm olm1)
    {
        if (d == null)
        {
            d = new hql();
        }
        olm1.a(hqg, new hqg(context));
    }

}
