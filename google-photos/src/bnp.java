// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import java.util.Map;

class bnp extends bmb
{

    private static final String a = bnp.getSimpleName();
    private final bod b = new bnq(this);
    private final bsr e = new bnr(this, "LoadPosterHandler");
    private final bsr f = new bns(this, "LoadCloudStoryboardHandler");
    private final bsr g = new bnt(this, "LookUpCloudMediaUriHandler");
    private final Context h;
    private final noj i;
    private final bnl j;
    private final cah k;
    private final blw l;
    private final bqa m;
    private final bxj n;
    private final brv o;
    private final bnm p;
    private final noq q;
    private final mmr r;
    private final bxp s;
    private final bsm t;
    private boolean u;

    bnp(bmb bmb1, Bundle bundle, Context context, noj noj1, bnl bnl1, cah cah1, blw blw1, 
            cag cag, bqa bqa1, bxj bxj1, brv brv1, bnm bnm1)
    {
        super(bmb1);
        h = (Context)b.a(context, "context", null);
        i = (noj)b.a(noj1, "plusDataProvider", null);
        j = (bnl)b.a(bnl1, "gservicesSettings", null);
        k = (cah)b.a(cah1, "connectivityChecker", null);
        l = (blw)b.a(blw1, "display", null);
        m = (bqa)b.a(bqa1, "playerController", null);
        n = (bxj)b.a(bxj1, "assetDownloadController", null);
        o = (brv)b.a(brv1, "storageController", null);
        p = (bnm)b.a(bnm1, "initEditorFlow", null);
        q = (noq)olm.a(context, noq);
        r = (mmr)olm.a(context, mmr);
        s = (bxp)olm.a(context, bxp);
        t = (new bsp()).a(e).a(f).a(g).a(this, a, bundle, cag);
    }

    static bqa a(bnp bnp1)
    {
        return bnp1.m;
    }

    static void a(bnp bnp1, bxf bxf1)
    {
        boolean flag1 = true;
        if (!bnp1.c.b.ac)
        {
            boolean flag;
            if (ddy.b.a() && bnp1.c.B() && bnp1.c.b.n != null && bnp1.c.b.m != null && bnp1.k.a())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                bnp1.c.a(bxf1);
                return;
            }
            if (bxf1 == bxf.g)
            {
                bnp1.m.g();
                bnp1.q.b(20);
                return;
            }
            if (bxf1 == bxf.h)
            {
                bnp1.c.a(bxd.b);
                int i1 = bnp1.c.y().size();
                bxf1 = bnp1.m;
                if (i1 <= 0)
                {
                    flag1 = false;
                }
                bxf1.a(flag1);
            }
        }
        bnp1.p.b();
    }

    static void a(String s1)
    {
    }

    static Context b(bnp bnp1)
    {
        return bnp1.h;
    }

    static noj c(bnp bnp1)
    {
        return bnp1.i;
    }

    static brv d(bnp bnp1)
    {
        return bnp1.o;
    }

    static bod e(bnp bnp1)
    {
        return bnp1.b;
    }

    static mmr f(bnp bnp1)
    {
        return bnp1.r;
    }

    static bxp g(bnp bnp1)
    {
        return bnp1.s;
    }

    static blw h(bnp bnp1)
    {
        return bnp1.l;
    }

    static void i(bnp bnp1)
    {
        bnp1.c.a(bxf.f);
        bnp1.q.b(20);
    }

    static bnl j(bnp bnp1)
    {
        return bnp1.j;
    }

    static boolean k(bnp bnp1)
    {
        return bnp1.u;
    }

    static bnm l(bnp bnp1)
    {
        return bnp1.p;
    }

    static bxj m(bnp bnp1)
    {
        return bnp1.n;
    }

    public final void C_()
    {
        t.b();
        super.C_();
    }

    public final void a(boolean flag)
    {
        u = flag;
        t.a(a);
    }

}
