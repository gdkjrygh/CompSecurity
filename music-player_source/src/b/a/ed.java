// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import java.util.BitSet;

// Referenced classes of package b.a:
//            gx, ea, gt, cb, 
//            gn, fm

final class ed extends gx
{

    private ed()
    {
    }

    ed(byte byte0)
    {
        this();
    }

    public final void a(gn gn, fm fm)
    {
        fm = (ea)fm;
        gn = (gt)gn;
        gn.a(((ea) (fm)).a);
        BitSet bitset = new BitSet();
        if (fm.d())
        {
            bitset.set(0);
        }
        if (fm.g())
        {
            bitset.set(1);
        }
        gn.a(bitset, 2);
        if (fm.d())
        {
            gn.a(((ea) (fm)).b);
        }
        if (fm.g())
        {
            ((ea) (fm)).c.b(gn);
        }
    }

    public final void b(gn gn, fm fm)
    {
        fm = (ea)fm;
        gn = (gt)gn;
        fm.a = gn.m();
        fm.b();
        BitSet bitset = gn.b(2);
        if (bitset.get(0))
        {
            fm.b = gn.p();
            ea.e();
        }
        if (bitset.get(1))
        {
            fm.c = new cb();
            ((ea) (fm)).c.a(gn);
            ea.h();
        }
    }
}
