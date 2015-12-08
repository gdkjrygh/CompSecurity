// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class gdv
{

    public static final String a = omg.getName();
    public static final String b = gec.getName();
    public static final String c = gdl.getName();
    public static final String d = myc.getName();
    public static final String e = gdn.getName();
    public static final String f = gdg.getName();
    public static final String g = geg.getName();
    private static gdu h;

    public static void a(Context context, olm olm1)
    {
        if (h == null)
        {
            h = new gdu();
        }
        olm1.a(gdl, new gdl(context));
    }

    public static void a(olm olm1)
    {
        if (h == null)
        {
            h = new gdu();
        }
        olm1.a(omg, new omg[] {
            new gdx()
        });
    }

    public static void b(Context context, olm olm1)
    {
        if (h == null)
        {
            h = new gdu();
        }
        olm1.a(gdn, new gdn(context, (gec)olm1.a(gec), (gev)olm1.a(gev), (gdl)olm1.a(gdl), (gdg)olm1.a(gdg)));
    }

    public static void b(olm olm1)
    {
        if (h == null)
        {
            h = new gdu();
        }
        olm1.a(gec, new gec((mmv)olm1.a(mmv), (ngc)olm1.a(ngc), (geg)olm1.a(geg)));
    }

    public static void c(Context context, olm olm1)
    {
        if (h == null)
        {
            h = new gdu();
        }
        olm1.a(gdg, new gdg(context));
    }

    public static void c(olm olm1)
    {
        if (h == null)
        {
            h = new gdu();
        }
        olm1.a(myc, new myc[] {
            gdh.a, gdi.g, gdi.a, gdi.c, gdi.d, gdi.e, gdi.f, gdi.b
        });
    }

    public static void d(Context context, olm olm1)
    {
        if (h == null)
        {
            h = new gdu();
        }
        olm1.a(geg, new geg(context));
    }

}
