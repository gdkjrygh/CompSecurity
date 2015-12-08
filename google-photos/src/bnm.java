// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import java.util.Map;

class bnm extends bmb
{

    private static final String e = bnm.getSimpleName();
    final bsm a;
    boolean b;
    private final mti f = new bnn(this);
    private final Context g;
    private final cag h;
    private final bqa i;
    private final bxr j;
    private final brl k;
    private final btq l;
    private final bty m;
    private final noq n;

    bnm(bmb bmb1, Bundle bundle, Context context, blw blw, cag cag1, bny bny, bqa bqa1, 
            brv brv, bwn bwn1, bxr bxr1, brl brl1, btq btq1)
    {
        super(bmb1);
        b = false;
        g = (Context)b.a(context, "context", null);
        h = (cag)b.a(cag1, "backgroundTaskManager", null);
        i = (bqa)b.a(bqa1, "playerController", null);
        j = (bxr)b.a(bxr1, "storyboardController", null);
        k = (brl)b.a(brl1, "saveFlow", null);
        l = (btq)b.a(btq1, "updateCoverFlow", null);
        m = (bty)olm.a(context, nnw);
        n = (noq)olm.a(context, noq);
        bmb1 = new boa(c, context, blw, bny, bqa1, brv);
        a = (new bsp()).a(bwn1.a).a(bmb1).a(bxr1.a).a(this, e, bundle, cag1).a(new bno(this));
    }

    static void a(bnm bnm1)
    {
        boolean flag = true;
        if (bnm1.c.b.a == bxf.h)
        {
            int i1 = bnm1.c.y().size();
            bnm1 = bnm1.i;
            if (i1 <= 0)
            {
                flag = false;
            }
            bnm1.a(flag);
            return;
        }
        if (bnm1.c.b.a == bxf.g)
        {
            bnm1.i.g();
            return;
        } else
        {
            bnm1.c.a(bxd.b);
            bnm1.j.b = true;
            return;
        }
    }

    static void a(bnm bnm1, mue mue1)
    {
        String s = String.valueOf("cover check done - error:");
        boolean flag = mue1.c();
        boolean flag1 = mue1.a().getBoolean("entry_missing");
        (new StringBuilder(String.valueOf(s).length() + 20)).append(s).append(flag).append(", missing:").append(flag1);
        if (mue1.c() || mue1.a().getBoolean("entry_missing"))
        {
            bnm1.l.b();
            bnm1 = bnm1.l;
            mue1 = String.valueOf("add to cover table - mediaKey:");
            String s1 = String.valueOf(((btq) (bnm1)).c.b.X);
            String s2 = String.valueOf(((btq) (bnm1)).c.b.p);
            (new StringBuilder(String.valueOf(mue1).length() + 12 + String.valueOf(s1).length() + String.valueOf(s2).length())).append(mue1).append(s1).append(", versionId:").append(s2);
            ((btq) (bnm1)).f.a(btq.a);
            return;
        } else
        {
            bnm1.n.a(20);
            return;
        }
    }

    static bxr b(bnm bnm1)
    {
        return bnm1.j;
    }

    static void c(bnm bnm1)
    {
        bnm1.d();
    }

    public final void C_()
    {
        a.b();
        j.b = false;
        h.b(f);
        super.C_();
    }

    public final void b()
    {
        a.a(e);
    }

    void d()
    {
        boolean flag = false;
        if (c.b.a != bxf.b || !c.c.d || c.c.p == null)
        {
            return;
        }
        c.a(bxf.d);
        if (b)
        {
            b = false;
            k.b();
            return;
        }
        Object obj = String.valueOf("running cover check - mediaKey:");
        Object obj1 = String.valueOf(c.b.X);
        Object obj2 = String.valueOf(c.b.p);
        String s = String.valueOf(c.b.n);
        (new StringBuilder(String.valueOf(obj).length() + 24 + String.valueOf(obj1).length() + String.valueOf(obj2).length() + String.valueOf(s).length())).append(((String) (obj))).append(((String) (obj1))).append(", versionId:").append(((String) (obj2))).append(", streamUri:").append(s);
        obj = m;
        obj1 = g;
        obj2 = h;
        s = c.b.X;
        String s1 = c.b.p;
        if (c.b.n != null)
        {
            flag = true;
        }
        ((cag) (obj2)).a(new bub(((Context) (obj1)), ((bty) (obj)), s, s1, flag));
    }

    public final void e()
    {
        super.e();
        h.a(f);
    }

}
