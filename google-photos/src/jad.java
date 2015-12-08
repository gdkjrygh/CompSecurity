// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class jad
{

    public static final String a = izr.getName();
    public static final String b = izz.getName();
    public static final String c = jae.getName();
    public static final String d = izo.getName();
    public static final String e = izs.getName();
    public static final String f = izu.getName();
    private static jac g;

    public static void a(Context context, olm olm1)
    {
        if (g == null)
        {
            g = new jac();
        }
        olm1.a(izr, new izr(context));
    }

    public static void b(Context context, olm olm1)
    {
        if (g == null)
        {
            g = new jac();
        }
        olm1.a(izz, new izz(context));
    }

    public static void c(Context context, olm olm1)
    {
        if (g == null)
        {
            g = new jac();
        }
        olm1.a(jae, new jae(context));
    }

    public static void d(Context context, olm olm1)
    {
        if (g == null)
        {
            g = new jac();
        }
        olm1.a(izo, new izp(context));
    }

    public static void e(Context context, olm olm1)
    {
        if (g == null)
        {
            g = new jac();
        }
        olm1.a(izs, new izs(context));
    }

    public static void f(Context context, olm olm1)
    {
        if (g == null)
        {
            g = new jac();
        }
        olm1.a(izu, new izu(context, (izs)olm1.a(izs)));
    }

}
