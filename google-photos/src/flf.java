// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class flf
{

    public static final String a = fky.getName();
    public static final String b = flb.getName();
    public static final String c = fla.getName();
    private static fle d;

    public static void a(Context context, olm olm1)
    {
        if (d == null)
        {
            d = new fle();
        }
        olm1.a(fky, new fky(context));
    }

    public static void b(Context context, olm olm1)
    {
        if (d == null)
        {
            d = new fle();
        }
        mmv mmv1 = (mmv)olm1.a(mmv);
        olm1.a(flb, new flb(context, (fky)olm1.a(fky), (fla)olm1.a(fla), mmv1, olm1.c(flh)));
    }

    public static void c(Context context, olm olm1)
    {
        if (d == null)
        {
            d = new fle();
        }
        olm1.a(fla, new fla(context, (mmv)olm1.a(mmv), (fky)olm1.a(fky), (mhh)olm1.a(mhh)));
    }

}
