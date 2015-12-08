// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class dyd
{

    public static final String a = dya.getName();
    public static final String b = dxz.getName();
    public static final String c = dye.getName();
    private static dyc d;

    public static void a(Context context, olm olm1)
    {
        if (d == null)
        {
            d = new dyc();
        }
        olm1.a(dya, new dya(context));
    }

    public static void a(olm olm1)
    {
        if (d == null)
        {
            d = new dyc();
        }
        olm1.a(dye, new dye());
    }

    public static void b(Context context, olm olm1)
    {
        if (d == null)
        {
            d = new dyc();
        }
        olm1.a(dxz, new dxz(context));
    }

}
