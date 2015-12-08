// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class hrp
{

    public static final String a = hsx.getName();
    public static final String b = hwc.getName();
    public static final String c = hqf.getName();
    public static final String d = hxv.getName();
    public static final String e = myc.getName();
    public static final String f = hso.getName();
    private static hro g;

    public static void a(Context context, olm olm1)
    {
        if (g == null)
        {
            g = new hro();
        }
        olm1.a(hsx, new hsx(context));
    }

    public static void a(olm olm1)
    {
        if (g == null)
        {
            g = new hro();
        }
        olm1.a(myc, new myc[] {
            hxv.a, hso.a, hul.a, hxb.a
        });
    }

    public static void b(Context context, olm olm1)
    {
        if (g == null)
        {
            g = new hro();
        }
        olm1.a(hwc, new hwc(context));
    }

    public static void c(Context context, olm olm1)
    {
        if (g == null)
        {
            g = new hro();
        }
        olm1.a(hqf, new hqf[] {
            new hqi(context, (muz)olm1.a(muz), new hrf(context, (eto)olm1.a(eto)))
        });
    }

    public static void d(Context context, olm olm1)
    {
        if (g == null)
        {
            g = new hro();
        }
        olm1.a(hxv, new hxv(context));
    }

    public static void e(Context context, olm olm1)
    {
        if (g == null)
        {
            g = new hro();
        }
        olm1.a(hso, new hso(context));
    }

}
