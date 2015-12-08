// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class hpz
{

    private final Context a;

    public hpz(Context context)
    {
        a = context;
    }

    public final void a(int i, ds ds1)
    {
        Object obj = ds1.g_();
        qlw qlw1 = ds1.l_();
        obj = new nyy(a, (new nyh()).a(a, i).a(), ((qlr) (obj)), qlw1);
        ((nyy) (obj)).d();
        ((nyy) (obj)).d(ds1.k_());
        if (!((nyy) (obj)).l() && !((nyy) (obj)).u())
        {
            qlr qlr = ds1.f();
            ds1.a((qlw)((owv)((nyy) (obj)).t()).a.a.a(qlr));
            return;
        }
        if (((nyy) (obj)).u())
        {
            obj = hpr.a(((nyy) (obj)).c());
        } else
        {
            obj = hpr.a(((nxx) (obj)));
        }
        ds1.a(((hpr) (obj)));
    }

    public final void b(int i, ds ds1)
    {
        Object obj = new nyx(a, (new nyh()).a(a, i).a());
        qlr qlr = ds1.g_();
        qlw qlw1 = ds1.l_();
        i = ds1.g();
        owz owz1 = new owz();
        owz1.a(qlr, qlw1);
        ((nyx) (obj)).a(nyx.a(qlr), owz1, i);
        ((nyx) (obj)).d();
        ((nyx) (obj)).d(ds1.k_());
        if (!((nyx) (obj)).l() && !((nyx) (obj)).a(0))
        {
            ds1.a(((nyx) (obj)).a(0, ds1.f()));
            return;
        }
        if (((nyx) (obj)).b(ds1.g()) == 0 && ((nyx) (obj)).a(0))
        {
            obj = hpr.a(((owt)((nyx) (obj)).t()).a[0].b);
        } else
        {
            obj = hpr.a(((nxx) (obj)));
        }
        ds1.a(((hpr) (obj)));
    }
}
