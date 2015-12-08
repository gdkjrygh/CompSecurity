// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import java.util.BitSet;

// Referenced classes of package b.a:
//            gx, ap, gt, du, 
//            gn, fm

final class as extends gx
{

    private as()
    {
    }

    as(byte byte0)
    {
        this();
    }

    public final void a(gn gn, fm fm)
    {
        fm = (ap)fm;
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
        if (fm.u())
        {
            bitset.set(10);
        }
        if (fm.w())
        {
            bitset.set(11);
        }
        if (fm.y())
        {
            bitset.set(12);
        }
        if (fm.A())
        {
            bitset.set(13);
        }
        if (fm.C())
        {
            bitset.set(14);
        }
        if (fm.E())
        {
            bitset.set(15);
        }
        if (fm.G())
        {
            bitset.set(16);
        }
        gn.a(bitset, 17);
        if (fm.a())
        {
            gn.a(((ap) (fm)).a);
        }
        if (fm.c())
        {
            gn.a(((ap) (fm)).b);
        }
        if (fm.e())
        {
            gn.a(((ap) (fm)).c);
        }
        if (fm.g())
        {
            gn.a(((ap) (fm)).d);
        }
        if (fm.i())
        {
            gn.a(((ap) (fm)).e);
        }
        if (fm.k())
        {
            gn.a(((ap) (fm)).f);
        }
        if (fm.m())
        {
            gn.a(((ap) (fm)).g);
        }
        if (fm.o())
        {
            gn.a(((ap) (fm)).h);
        }
        if (fm.q())
        {
            ((ap) (fm)).i.b(gn);
        }
        if (fm.s())
        {
            gn.a(((ap) (fm)).j);
        }
        if (fm.u())
        {
            gn.a(((ap) (fm)).k);
        }
        if (fm.w())
        {
            gn.a(((ap) (fm)).l);
        }
        if (fm.y())
        {
            gn.a(((ap) (fm)).m);
        }
        if (fm.A())
        {
            gn.a(((ap) (fm)).n);
        }
        if (fm.C())
        {
            gn.a(((ap) (fm)).o);
        }
        if (fm.E())
        {
            gn.a(((ap) (fm)).p);
        }
        if (fm.G())
        {
            gn.a(((ap) (fm)).q);
        }
    }

    public final void b(gn gn, fm fm)
    {
        fm = (ap)fm;
        gn = (gt)gn;
        BitSet bitset = gn.b(17);
        if (bitset.get(0))
        {
            fm.a = gn.p();
            ap.b();
        }
        if (bitset.get(1))
        {
            fm.b = gn.p();
            ap.d();
        }
        if (bitset.get(2))
        {
            fm.c = gn.p();
            ap.f();
        }
        if (bitset.get(3))
        {
            fm.d = gn.p();
            ap.h();
        }
        if (bitset.get(4))
        {
            fm.e = gn.p();
            ap.j();
        }
        if (bitset.get(5))
        {
            fm.f = gn.p();
            ap.l();
        }
        if (bitset.get(6))
        {
            fm.g = gn.p();
            ap.n();
        }
        if (bitset.get(7))
        {
            fm.h = gn.p();
            ap.p();
        }
        if (bitset.get(8))
        {
            fm.i = new du();
            ((ap) (fm)).i.a(gn);
            ap.r();
        }
        if (bitset.get(9))
        {
            fm.j = gn.j();
            fm.t();
        }
        if (bitset.get(10))
        {
            fm.k = gn.j();
            fm.v();
        }
        if (bitset.get(11))
        {
            fm.l = gn.p();
            ap.x();
        }
        if (bitset.get(12))
        {
            fm.m = gn.p();
            ap.z();
        }
        if (bitset.get(13))
        {
            fm.n = gn.n();
            fm.B();
        }
        if (bitset.get(14))
        {
            fm.o = gn.p();
            ap.D();
        }
        if (bitset.get(15))
        {
            fm.p = gn.p();
            ap.F();
        }
        if (bitset.get(16))
        {
            fm.q = gn.p();
            ap.H();
        }
    }
}
