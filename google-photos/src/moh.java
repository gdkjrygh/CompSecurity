// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class moh
{

    public static final String a = mnl.getName();
    public static final String b = mng.getName();
    public static final String c = mmv.getName();
    public static final String d = mnh.getName();
    public static final String e = mvx.getName();
    public static final String f = onc.getName();
    private static mog g;

    public static void a(Context context, olm olm1)
    {
        if (g == null)
        {
            g = new mog();
        }
        olm1.a(mng, mog.a(context, (lww)olm1.a(lww)));
    }

    public static void a(olm olm1)
    {
        if (g == null)
        {
            g = new mog();
        }
        olm1.a(mnl, mog.a((mmv)olm1.a(mmv)));
    }

    public static void b(Context context, olm olm1)
    {
        if (g == null)
        {
            g = new mog();
        }
        olm1.a(mmv, mog.a(context));
    }

    public static void b(olm olm1)
    {
        if (g == null)
        {
            g = new mog();
        }
        olm1.a(mvx, mog.b((mnl)olm1.a(mnl)));
    }

    public static void c(Context context, olm olm1)
    {
        if (g == null)
        {
            g = new mog();
        }
        olm1.a(mnh, mog.b(context));
    }

    public static void c(olm olm1)
    {
        if (g == null)
        {
            g = new mog();
        }
        olm1.a(onc, mog.a((mnl)olm1.a(mnl)));
    }

}
