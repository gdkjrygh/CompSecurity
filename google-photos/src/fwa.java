// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class fwa
{

    public static final String a = ekr.getName();
    public static final String b = fvl.getName();
    public static final String c = fvg.getName();
    public static final String d = ekv.getName();
    public static final String e = fva.getName();
    public static final String f = ezy.getName();
    private static fvz g;

    public static void a(Context context, olm olm1)
    {
        if (g == null)
        {
            g = new fvz();
        }
        olm1.a(ekr, new ekr[] {
            new fve(context, (fvg)olm1.a(fvg))
        });
    }

    public static void b(Context context, olm olm1)
    {
        if (g == null)
        {
            g = new fvz();
        }
        gbd gbd1 = (gbd)olm1.a(gbd);
        olm1.a(fvl, new fvl[] {
            new fvu(), new fvx(gbd1), new fuq(context), new fwc(), new fwb(context), new fup(context, gbd1), new fuo(context), new fvw(context), new fus(context), new fvv(), 
            new fum(), new fur(context), new fvy(context)
        });
    }

    public static void c(Context context, olm olm1)
    {
        if (g == null)
        {
            g = new fvz();
        }
        olm1.a(fvg, new fvg(context));
    }

    public static void d(Context context, olm olm1)
    {
        if (g == null)
        {
            g = new fvz();
        }
        olm1.a(ekv, new ekv[] {
            new fvo(context, (fvg)olm1.a(fvg))
        });
    }

    public static void e(Context context, olm olm1)
    {
        if (g == null)
        {
            g = new fvz();
        }
        olm1.a(fva, new fva[] {
            new fun(context)
        });
    }

    public static void f(Context context, olm olm1)
    {
        if (g == null)
        {
            g = new fvz();
        }
        olm1.a(ezy, new ezy[] {
            new fvk(context)
        });
    }

}
