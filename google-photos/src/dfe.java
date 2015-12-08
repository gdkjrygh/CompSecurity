// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class dfe
{

    public static final String a = dfj.getName();
    public static final String b = dfk.getName();
    public static final String c = dfn.getName();
    private static dfc d;

    public static void a(Context context, olm olm1)
    {
        if (d == null)
        {
            d = new dfc();
        }
        olm1.a(dfj, new dfj(context));
    }

    public static void a(olm olm1)
    {
        if (d == null)
        {
            d = new dfc();
        }
        olm1.a(dfk, new dfd(d, (dfn)olm1.a(dfn)));
    }

    public static void b(Context context, olm olm1)
    {
        if (d == null)
        {
            d = new dfc();
        }
        olm1.a(dfn, new dfn(context));
    }

}
