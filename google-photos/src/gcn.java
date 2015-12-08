// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class gcn
{

    public static final String a = gcc.getName();
    public static final String b = hdr.getName();
    public static final String c = hdq.getName();
    public static final String d = hqf.getName();
    public static final String e = gcj.getName();
    public static final String f = gdm.getName();
    public static final String g = gcf.getName();
    public static final String h = flh.getName();
    public static final String i = myc.getName();
    public static final String j = ohf.getName();
    public static final String k = mnb.getName();
    private static gcm l;

    public static void a(Context context, olm olm1)
    {
        if (l == null)
        {
            l = new gcm();
        }
        olm1.a(gcc, new gcc(context, (erj)olm1.a(erj), (gcj)olm1.a(gcj)));
    }

    public static void a(olm olm1)
    {
        if (l == null)
        {
            l = new gcm();
        }
        olm1.a(gdm, (gcc)olm1.a(gcc));
    }

    public static void b(Context context, olm olm1)
    {
        if (l == null)
        {
            l = new gcm();
        }
        olm1.a(hdr, new hdr(context));
    }

    public static void b(olm olm1)
    {
        if (l == null)
        {
            l = new gcm();
        }
        olm1.a(flh, new flh[] {
            (gcc)olm1.a(gcc)
        });
    }

    public static void c(Context context, olm olm1)
    {
        if (l == null)
        {
            l = new gcm();
        }
        olm1.a(hdq, new hdq[] {
            new gce(context, (erj)olm1.a(erj))
        });
    }

    public static void c(olm olm1)
    {
        if (l == null)
        {
            l = new gcm();
        }
        olm1.a(myc, new myc[] {
            gcl.a
        });
    }

    public static void d(Context context, olm olm1)
    {
        if (l == null)
        {
            l = new gcm();
        }
        olm1.a(hqf, new hqf[] {
            new gci(context, (gcf)olm1.a(gcf), (gdn)olm1.a(gdn))
        });
    }

    public static void d(olm olm1)
    {
        if (l == null)
        {
            l = new gcm();
        }
        olm1.a(mnb, new mnb[] {
            (gcc)olm1.a(gcc)
        });
    }

    public static void e(Context context, olm olm1)
    {
        if (l == null)
        {
            l = new gcm();
        }
        olm1.a(gcj, new gcj(context, (gdn)olm1.a(gdn)));
    }

    public static void f(Context context, olm olm1)
    {
        if (l == null)
        {
            l = new gcm();
        }
        olm1.a(gcf, new gcf(context));
    }

    public static void g(Context context, olm olm1)
    {
        if (l == null)
        {
            l = new gcm();
        }
        olm1.a(ohf, new gcl(context));
    }

}
