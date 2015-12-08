// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class fmd
{

    public static final String a = omg.getName();
    public static final String b = amh.getName();
    public static final String c = flk.getName();
    public static final String d = fli.getName();
    public static final String e = mjz.getName();
    public static final String f = omt.getName();
    public static final String g = nck.getName();
    private static fmc h;

    public static void a(Context context, olm olm1)
    {
        if (h == null)
        {
            h = new fmc();
        }
        olm1.a(amh, aly.c(context));
    }

    public static void a(olm olm1)
    {
        if (h == null)
        {
            h = new fmc();
        }
        olm1.a(omg, new omg[] {
            new fma()
        });
    }

    public static void b(Context context, olm olm1)
    {
        if (h == null)
        {
            h = new fmc();
        }
        noz noz1 = noz.a(context, 3, "ThumbSizeCalculator", new String[0]);
        int i = hbg.b(context);
        if (i == 3)
        {
            context = new flm(context);
        } else
        {
            context = new fll(context, new flm(context));
        }
        if (noz1.a())
        {
            noy.a("portrait count", Integer.valueOf(i));
            noy.a("calculator", context);
        }
        olm1.a(flk, context);
    }

    public static void b(olm olm1)
    {
        if (h == null)
        {
            h = new fmc();
        }
        olm1.a(mjz, new flw((flk)olm1.a(flk)));
    }

    public static void c(Context context, olm olm1)
    {
        if (h == null)
        {
            h = new fmc();
        }
        olm1.a(fli, new fln(context, (flk)olm1.a(flk)));
    }

    public static void c(olm olm1)
    {
        if (h == null)
        {
            h = new fmc();
        }
        olm1.a(omt, new omt[] {
            new fmb()
        });
    }

    public static void d(Context context, olm olm1)
    {
        if (h == null)
        {
            h = new fmc();
        }
        context = new ncl(context);
        Object obj = new ncj(((ncl) (context)).b);
        obj.b = 0L;
        obj.c = oqm.c.f * 10L;
        context.b = ((ncj) (obj)).a();
        obj = new ncj(((ncl) (context)).c);
        obj.b = 0L;
        obj.c = oqm.c.f * 10L;
        context.c = ((ncj) (obj)).a();
        obj = new ncn(((ncl) (context)).a);
        obj.a = (int)(2L * oqm.c.f);
        obj.c = (int)(oqm.c.f * 0L);
        obj.f = false;
        context.a = ((ncn) (obj)).a();
        olm1.a(nck, new nck(((ncl) (context)).a, ((ncl) (context)).b, ((ncl) (context)).c));
    }

}
