// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class fam
{

    public static final String a = fae.getName();
    public static final String b = fai.getName();
    public static final String c = faj.getName();
    public static final String d = fac.getName();
    private static fal e;

    public static void a(Context context, olm olm1)
    {
        if (e == null)
        {
            e = new fal();
        }
        olm1.a(fae, new fak(context));
    }

    public static void a(olm olm1)
    {
        if (e == null)
        {
            e = new fal();
        }
        olm1.a(fac, (fai)olm1.a(fai));
    }

    public static void b(Context context, olm olm1)
    {
        if (e == null)
        {
            e = new fal();
        }
        olm1.a(fai, new fah(context, (faj)olm1.a(faj)));
    }

    public static void c(Context context, olm olm1)
    {
        if (e == null)
        {
            e = new fal();
        }
        olm1.a(faj, new faj(context));
    }

}
