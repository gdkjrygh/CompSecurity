// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import android.util.Log;
import java.util.List;

public class bxr extends bmb
{

    private static final String e = bxr.getSimpleName();
    public final bsm a;
    public boolean b;
    private final bsr f = new bxs(this, "GetMaximumTargetDuration");
    private final bsr g = new bxv(this, "GenerateStoryboard");
    private final cyz h;
    private final czd i;
    private final czc j;
    private final int k;
    private bxn l;

    public bxr(bmb bmb1, Bundle bundle, cag cag, cyz cyz1, czd czd1, czc czc1, bwn bwn1, 
            int i1)
    {
        super(bmb1);
        new bxw(this, this, new bxg[] {
            bxg.b
        });
        new bxx(this, this, new bxg[] {
            bxg.a
        });
        new bxy(this, this, new bxg[] {
            bxg.e
        });
        new bxz(this, this, new bxg[] {
            bxg.d
        });
        new bya(this, this, new bxg[] {
            bxg.g
        });
        new byb(this, this, new bxg[] {
            bxg.j
        });
        new byc(this, this, new bxg[] {
            bxg.i
        });
        new bxt(this, this, new bxg[] {
            bxg.h
        });
        new bxu(this, this, new bxg[] {
            bxg.l
        });
        h = (cyz)b.a(cyz1, "themesLibrary", null);
        i = (czd)b.a(czd1, "clipSelectorLimits", null);
        j = (czc)b.a(czc1, "localClipSelector", null);
        k = i1;
        a = (new bsp()).a(bwn1.b).a(f).a(g).a(bwn1.e).a(this, e, bundle, cag);
    }

    static bww a(bxr bxr1)
    {
        return bxr1.c;
    }

    static bxn a(bxr bxr1, bxn bxn)
    {
        bxr1.l = bxn;
        return bxn;
    }

    static void a(bxr bxr1, cyu cyu1)
    {
        bxr1.c();
        Object obj = cyu1.a;
        if (obj != null)
        {
            long l1 = ((cqf) (obj)).h;
            long l2 = ((cqf) (obj)).i;
            if (l1 != l2)
            {
                Log.w(e, (new StringBuilder(90)).append("Video duration ").append(l1).append("us does not match audio duration ").append(l2).append("us").toString());
            }
        }
        bww bww1 = bxr1.c;
        List list = cyu1.c;
        bww1.b.C = (List)b.a(list, "immutableClipsBeforeUserEdits", null);
        bww1 = bxr1.c;
        bww1.c.e = ((cqf) (obj));
        bww1.c.d = true;
        bww1.c.A = false;
        bww1.c.z = false;
        obj = bww1.c;
        boolean flag;
        if (!bww1.d())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        obj.m = flag;
        bww1.o();
        bww1.a(new bxg[] {
            bxg.c, bxg.e, bxg.q
        });
        obj = bxr1.c;
        flag = cyu1.d;
        ((bww) (obj)).b.r = flag;
        bxr1.c.a(cyu1.b);
    }

    static void a(bxr bxr1, cyy cyy1)
    {
        bxr1.a(cyy1);
    }

    private void a(cyy cyy1)
    {
        Object obj1 = c.c(k);
        b.a(cyy1, "theme", null);
        synchronized (((cyt) (obj1)).b)
        {
            if (!cyy1.equals(((cyt) (obj1)).g))
            {
                obj1.g = cyy1;
                ((cyt) (obj1)).a(cys.d);
            }
        }
        obj = c.c(k);
        obj1 = h;
        czl czl = cyy1.t.a(((cyz) (obj1)).a, cyy1);
        b.a(czl, "effectApplier", null);
        synchronized (((cyt) (obj)).b)
        {
            if (!czl.equals(((cyt) (obj)).j))
            {
                obj.j = czl;
                ((cyt) (obj)).a(cys.e);
            }
        }
        synchronized (((cyt) (obj)).b)
        {
            ((cyt) (obj)).a.a = cyy1.u;
            ((cyt) (obj)).a.b = cyy1.v;
            ((cyt) (obj)).a(cys.f);
        }
        return;
        cyy1;
        obj;
        JVM INSTR monitorexit ;
        throw cyy1;
        cyy1;
        obj2;
        JVM INSTR monitorexit ;
        throw cyy1;
        cyy1;
        obj2;
        JVM INSTR monitorexit ;
        throw cyy1;
    }

    static int b(bxr bxr1)
    {
        return bxr1.k;
    }

    static String b()
    {
        return e;
    }

    static bww c(bxr bxr1)
    {
        return bxr1.c;
    }

    static bww d(bxr bxr1)
    {
        return bxr1.c;
    }

    private void d()
    {
        Object obj;
        Object obj1;
        c();
        obj1 = c.c(k);
        if (c.x() != bxd.b)
        {
            break MISSING_BLOCK_LABEL_143;
        }
        obj = c.b.m;
        if (obj == null) goto _L2; else goto _L1
_L1:
        pye pye1;
        ((cyt) (obj1)).a(new cze(((nom) (obj)), c.y()));
        pye1 = ((nom) (obj)).b;
        obj = ((cyt) (obj1)).b;
        obj;
        JVM INSTR monitorenter ;
        if (b.e(((cyt) (obj1)).k, pye1)) goto _L4; else goto _L3
_L3:
        if (pye1 != null)
        {
            break MISSING_BLOCK_LABEL_105;
        }
        obj1.k = null;
_L5:
        ((cyt) (obj1)).a(cys.d);
_L4:
        obj;
        JVM INSTR monitorexit ;
_L2:
        return;
        obj1.k = (pye)qlw.a(new pye(), qlw.a(pye1));
          goto _L5
        obj1;
        throw c.a("Couldn't copy cloud storyboard proto", ((Throwable) (obj1)));
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
        ((cyt) (obj1)).a(j);
        return;
    }

    static void e(bxr bxr1)
    {
        bxr1.d();
    }

    static bww f(bxr bxr1)
    {
        return bxr1.c;
    }

    static bxn g(bxr bxr1)
    {
        return bxr1.l;
    }

    static void h(bxr bxr1)
    {
        boolean flag1;
        flag1 = false;
        bxr1.c();
        if (bxr1.b) goto _L2; else goto _L1
_L1:
        bxr1.c();
        if (bxr1.c.x() == bxd.b) goto _L4; else goto _L3
_L3:
        boolean flag = flag1;
_L6:
        if (flag)
        {
            bxr1.a.b();
            bxr1.a.a(e);
        }
_L2:
        return;
_L4:
        flag = flag1;
        if (bxr1.c.b.m != null)
        {
            flag = flag1;
            if (bxr1.c.b.m.a == noo.a)
            {
                flag = flag1;
                if (bxr1.c.b.z.d != -1L)
                {
                    flag = true;
                }
            }
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public final void C_()
    {
        a.b();
        super.C_();
    }

    public final void e()
    {
        super.e();
        cyt cyt1 = c.c(k);
        cyt1.a(c.b.z);
        cyt1.a(c.i());
        cyt1.a(c.b.x);
        cyt1.a(c.c.l);
        cyt1.a(c.b.Q);
        a(c.b.t);
        cyt1.a(i);
        d();
    }

}
