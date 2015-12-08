// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;
import android.os.Bundle;

final class bns extends bsr
{

    private bnp a;

    bns(bnp bnp1, String s)
    {
        a = bnp1;
        super(s);
    }

    public final mtf a(String s)
    {
        return new btv(s, a.c, bnp.f(a).d(), bnp.c(a), bnp.g(a));
    }

    public final boolean a(String s, mue mue1)
    {
        Object obj;
        boolean flag;
        obj = null;
        flag = true;
        if (mue1.b != 1) goto _L2; else goto _L1
_L1:
        bnp.h(a).j();
        bnp.i(a);
        bnp.a("finished after loadCloudStoryboard with get error");
        flag = false;
_L9:
        return flag;
_L2:
        int i;
        if (mue1.b == 2)
        {
            bnp.a(a).g();
            bnp.i(a);
            bnp.a("finished after loadCloudStoryboard with validation error");
            return false;
        }
        s = a.c;
        Object obj1 = (Uri)mue1.a().getParcelable("videoStreamUri");
        ((bww) (s)).b.n = ((Uri) (obj1));
        obj1 = (nom)mue1.a().getParcelable("storyboard");
        bww bww1 = a.c;
        bww1.b.m = ((nom) (obj1));
        if (obj1 != null)
        {
            s = ((nom) (obj1)).b;
        } else
        {
            s = null;
        }
        if (s != null)
        {
            s = b.a(s);
        } else
        {
            s = null;
        }
        mue1 = obj;
        if (obj1 != null)
        {
            mue1 = ((nom) (obj1)).c;
        }
        bww1.a(mue1, s);
        bww1.b.r = false;
        if (((nom) (obj1)).b.f != null)
        {
            a.c.a(((nom) (obj1)).b.f);
        }
        bnp.a(a).d();
        s = cyy.a(((nom) (obj1)).b.h.a);
        if (s != null && s == cyy.l)
        {
            ((bqv)bnp.a(a).a.b).f();
        }
        s = bnp.j(a);
        mue1 = ((nom) (obj1)).b;
        if (mue1 == null) goto _L4; else goto _L3
_L3:
        if (((pye) (mue1)).a == null)
        {
            i = 1;
        } else
        {
            i = ((pye) (mue1)).a.intValue();
        }
        if (s.p() < i) goto _L4; else goto _L5
_L5:
        i = 1;
_L7:
        if (i == 0)
        {
            bnp.a(a, bxf.g);
            bnp.a("finished after loadCloudStoryboard with render version error");
            return false;
        }
        break; /* Loop/switch isn't completed */
_L4:
        i = 0;
        if (true) goto _L7; else goto _L6
_L6:
        bnp.a("finished after loadCloudStoryboard");
        if (!bnp.k(a))
        {
            bnp.l(a).b();
            return false;
        }
        if (true) goto _L9; else goto _L8
_L8:
    }
}
