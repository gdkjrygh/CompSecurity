// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class ehm
{

    public static final String a = jgc.getName();
    public static final String b = egp.getName();
    public static final String c = grl.getName();
    public static final String d = oqy.getName();
    public static final String e = jfz.getName();
    public static final String f = jes.getName();
    public static final String g = omm.getName();
    private static ehl h;

    public static void a(Context context, olm olm1)
    {
        if (h == null)
        {
            h = new ehl();
        }
        olm1.a(egp, new egt(context, (lyl)olm1.a(lyl), (lyo)olm1.a(lyo)));
    }

    public static void a(olm olm1)
    {
        if (h == null)
        {
            h = new ehl();
        }
        olm1.a(jgc, new jgc());
    }

    public static void b(olm olm1)
    {
        if (h == null)
        {
            h = new ehl();
        }
        olm1.a(grl, new grl());
    }

    public static void c(olm olm1)
    {
        if (h == null)
        {
            h = new ehl();
        }
        olm1.a(oqy, new oqy[] {
            new ehk((jes)olm1.a(jes))
        });
    }

    public static void d(olm olm1)
    {
        if (h == null)
        {
            h = new ehl();
        }
        olm1.a(jfz, new jfz());
    }

    public static void e(olm olm1)
    {
        if (h == null)
        {
            h = new ehl();
        }
        olm1.a(jes, new ehn());
    }

    public static void f(olm olm1)
    {
        if (h == null)
        {
            h = new ehl();
        }
        olm1.a(omm, new omm[] {
            new egr()
        });
    }

}
