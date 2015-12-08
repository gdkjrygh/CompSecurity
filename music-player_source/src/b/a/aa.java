// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import java.util.BitSet;

// Referenced classes of package b.a:
//            gx, x, gt, eg, 
//            gn, fm

final class aa extends gx
{

    private aa()
    {
    }

    aa(byte byte0)
    {
        this();
    }

    public final void a(gn gn, fm fm)
    {
        fm = (x)fm;
        gn = (gt)gn;
        gn.a(((x) (fm)).a);
        gn.a(((x) (fm)).e.a());
        gn.a(((x) (fm)).f);
        gn.a(((x) (fm)).g);
        BitSet bitset = new BitSet();
        if (fm.b())
        {
            bitset.set(0);
        }
        if (fm.d())
        {
            bitset.set(1);
        }
        if (fm.f())
        {
            bitset.set(2);
        }
        if (fm.k())
        {
            bitset.set(3);
        }
        if (fm.m())
        {
            bitset.set(4);
        }
        if (fm.o())
        {
            bitset.set(5);
        }
        gn.a(bitset, 6);
        if (fm.b())
        {
            gn.a(((x) (fm)).b);
        }
        if (fm.d())
        {
            gn.a(((x) (fm)).c);
        }
        if (fm.f())
        {
            gn.a(((x) (fm)).d);
        }
        if (fm.k())
        {
            gn.a(((x) (fm)).h);
        }
        if (fm.m())
        {
            gn.a(((x) (fm)).i);
        }
        if (fm.o())
        {
            gn.a(((x) (fm)).j);
        }
    }

    public final void b(gn gn, fm fm)
    {
        fm = (x)fm;
        gn = (gt)gn;
        fm.a = gn.p();
        x.a();
        fm.e = eg.a(gn.m());
        x.h();
        fm.f = gn.p();
        x.i();
        fm.g = gn.p();
        x.j();
        BitSet bitset = gn.b(6);
        if (bitset.get(0))
        {
            fm.b = gn.p();
            x.c();
        }
        if (bitset.get(1))
        {
            fm.c = gn.m();
            fm.e();
        }
        if (bitset.get(2))
        {
            fm.d = gn.p();
            x.g();
        }
        if (bitset.get(3))
        {
            fm.h = gn.p();
            x.l();
        }
        if (bitset.get(4))
        {
            fm.i = gn.p();
            x.n();
        }
        if (bitset.get(5))
        {
            fm.j = gn.m();
            fm.p();
        }
    }
}
