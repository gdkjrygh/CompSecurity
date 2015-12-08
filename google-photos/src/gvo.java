// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class gvo
{

    public static final String a = gvk.getName();
    public static final String b = gvf.getName();
    public static final String c = gvg.getName();
    public static final String d = gva.getName();
    private static gvn e;

    public static void a(Context context, olm olm1)
    {
        if (e == null)
        {
            e = new gvn();
        }
        olm1.a(gvk, new gvk(context));
    }

    public static void b(Context context, olm olm1)
    {
        if (e == null)
        {
            e = new gvn();
        }
        olm1.a(gvf, new gvf(context));
    }

    public static void c(Context context, olm olm1)
    {
        if (e == null)
        {
            e = new gvn();
        }
        olm1.a(gvg, new gvg(context));
    }

    public static void d(Context context, olm olm1)
    {
        if (e == null)
        {
            e = new gvn();
        }
        olm1.a(gva, new gva(context));
    }

}
