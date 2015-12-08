// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import java.util.BitSet;

// Referenced classes of package b.a:
//            gx, df, gt, k, 
//            gn, fm

final class di extends gx
{

    private di()
    {
    }

    di(byte byte0)
    {
        this();
    }

    public final void a(gn gn, fm fm)
    {
        fm = (df)fm;
        gn = (gt)gn;
        BitSet bitset = new BitSet();
        if (fm.a())
        {
            bitset.set(0);
        }
        if (fm.c())
        {
            bitset.set(1);
        }
        if (fm.e())
        {
            bitset.set(2);
        }
        if (fm.g())
        {
            bitset.set(3);
        }
        if (fm.i())
        {
            bitset.set(4);
        }
        if (fm.k())
        {
            bitset.set(5);
        }
        if (fm.m())
        {
            bitset.set(6);
        }
        if (fm.o())
        {
            bitset.set(7);
        }
        if (fm.q())
        {
            bitset.set(8);
        }
        if (fm.s())
        {
            bitset.set(9);
        }
        gn.a(bitset, 10);
        if (fm.a())
        {
            gn.a(((df) (fm)).a);
        }
        if (fm.c())
        {
            gn.a(((df) (fm)).b);
        }
        if (fm.e())
        {
            gn.a(((df) (fm)).c);
        }
        if (fm.g())
        {
            gn.a(((df) (fm)).d);
        }
        if (fm.i())
        {
            gn.a(((df) (fm)).e);
        }
        if (fm.k())
        {
            gn.a(((df) (fm)).f);
        }
        if (fm.m())
        {
            gn.a(((df) (fm)).g);
        }
        if (fm.o())
        {
            gn.a(((df) (fm)).h);
        }
        if (fm.q())
        {
            gn.a(((df) (fm)).i.a());
        }
        if (fm.s())
        {
            gn.a(((df) (fm)).j);
        }
    }

    public final void b(gn gn, fm fm)
    {
        fm = (df)fm;
        gn = (gt)gn;
        BitSet bitset = gn.b(10);
        if (bitset.get(0))
        {
            fm.a = gn.m();
            fm.b();
        }
        if (bitset.get(1))
        {
            fm.b = gn.p();
            df.d();
        }
        if (bitset.get(2))
        {
            fm.c = gn.p();
            df.f();
        }
        if (bitset.get(3))
        {
            fm.d = gn.o();
            fm.h();
        }
        if (bitset.get(4))
        {
            fm.e = gn.o();
            fm.j();
        }
        if (bitset.get(5))
        {
            fm.f = gn.p();
            df.l();
        }
        if (bitset.get(6))
        {
            fm.g = gn.m();
            fm.n();
        }
        if (bitset.get(7))
        {
            fm.h = gn.p();
            df.p();
        }
        if (bitset.get(8))
        {
            fm.i = k.a(gn.m());
            df.r();
        }
        if (bitset.get(9))
        {
            fm.j = gn.p();
            df.t();
        }
    }
}
