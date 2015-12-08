// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class mte
{

    public static final String a = omg.getName();
    public static final String b = mty.getName();
    public static final String c = mth.getName();
    public static final String d = omt.getName();
    public static final String e = onc.getName();
    private static mtd f;

    public static void a(Context context, olm olm1)
    {
        if (f == null)
        {
            f = new mtd();
        }
        olm1.a(mty, new mty(context));
    }

    public static void a(olm olm1)
    {
        if (f == null)
        {
            f = new mtd();
        }
        olm1.a(omg, new omg[] {
            new mtl()
        });
    }

    public static void b(Context context, olm olm1)
    {
        if (f == null)
        {
            f = new mtd();
        }
        olm1.a(mth, new mts(context));
    }

    public static void b(olm olm1)
    {
        if (f == null)
        {
            f = new mtd();
        }
        olm1.a(omt, new omt[] {
            new mtl()
        });
    }

    public static void c(Context context, olm olm1)
    {
        if (f == null)
        {
            f = new mtd();
        }
        olm1.a(onc, new onc[0]);
    }

}
