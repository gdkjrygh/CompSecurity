// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class mah
{

    public static final String a = lzr.getName();
    public static final String b = lzs.getName();
    public static final String c = lzz.getName();
    private static mag d;

    public static void a(Context context, olm olm1)
    {
        if (d == null)
        {
            d = new mag();
        }
        olm1.a(lzr, new mae(context));
    }

    public static void a(olm olm1)
    {
        if (d == null)
        {
            d = new mag();
        }
        olm1.a(lzs, new maf());
    }

    public static void b(olm olm1)
    {
        if (d == null)
        {
            d = new mag();
        }
        olm1.a(lzz, new map());
    }

}
