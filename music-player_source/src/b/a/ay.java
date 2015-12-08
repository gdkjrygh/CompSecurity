// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import java.util.BitSet;

// Referenced classes of package b.a:
//            gx, av, gt, bb, 
//            gn, fm

final class ay extends gx
{

    private ay()
    {
    }

    ay(byte byte0)
    {
        this();
    }

    public final void a(gn gn, fm fm)
    {
        fm = (av)fm;
        gn = (gt)gn;
        gn.a(((av) (fm)).a);
        gn.a(((av) (fm)).b);
        BitSet bitset = new BitSet();
        if (fm.d())
        {
            bitset.set(0);
        }
        gn.a(bitset, 1);
        if (fm.d())
        {
            gn.a(((av) (fm)).c.a());
        }
    }

    public final void b(gn gn, fm fm)
    {
        fm = (av)fm;
        gn = (gt)gn;
        fm.a = gn.n();
        fm.b();
        fm.b = gn.p();
        av.c();
        if (gn.b(1).get(0))
        {
            fm.c = bb.a(gn.m());
            av.e();
        }
    }
}
