// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class gub
{

    public static final String a = gty.getName();
    public static final String b = gtx.getName();
    public static final String c = gtz.getName();
    private static gua d;

    public static void a(Context context, olm olm1)
    {
        if (d == null)
        {
            d = new gua();
        }
        olm1.a(gty, new gty(context));
    }

    public static void b(Context context, olm olm1)
    {
        if (d == null)
        {
            d = new gua();
        }
        olm1.a(gtx, new gtx(context));
    }

    public static void c(Context context, olm olm1)
    {
        if (d == null)
        {
            d = new gua();
        }
        olm1.a(gtz, new gtz(context));
    }

}
