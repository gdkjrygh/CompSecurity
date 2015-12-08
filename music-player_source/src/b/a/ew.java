// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package b.a:
//            gx, et, gt, ad, 
//            x, ap, df, l, 
//            cn, eh, cb, bu, 
//            r, aj, gl, gn, 
//            fm

final class ew extends gx
{

    private ew()
    {
    }

    ew(byte byte0)
    {
        this();
    }

    public final void a(gn gn, fm fm)
    {
        fm = (et)fm;
        gn = (gt)gn;
        ((et) (fm)).a.b(gn);
        ((et) (fm)).b.b(gn);
        ((et) (fm)).c.b(gn);
        ((et) (fm)).d.b(gn);
        BitSet bitset = new BitSet();
        if (fm.e())
        {
            bitset.set(0);
        }
        if (fm.j())
        {
            bitset.set(1);
        }
        if (fm.m())
        {
            bitset.set(2);
        }
        if (fm.o())
        {
            bitset.set(3);
        }
        if (fm.q())
        {
            bitset.set(4);
        }
        if (fm.s())
        {
            bitset.set(5);
        }
        if (fm.u())
        {
            bitset.set(6);
        }
        gn.a(bitset, 7);
        if (fm.e())
        {
            ((et) (fm)).e.b(gn);
        }
        if (fm.j())
        {
            gn.a(((et) (fm)).f.size());
            for (Iterator iterator = ((et) (fm)).f.iterator(); iterator.hasNext(); ((cn)iterator.next()).b(gn)) { }
        }
        if (fm.m())
        {
            gn.a(((et) (fm)).g.size());
            for (Iterator iterator1 = ((et) (fm)).g.iterator(); iterator1.hasNext(); ((eh)iterator1.next()).b(gn)) { }
        }
        if (fm.o())
        {
            ((et) (fm)).h.b(gn);
        }
        if (fm.q())
        {
            ((et) (fm)).i.b(gn);
        }
        if (fm.s())
        {
            ((et) (fm)).j.b(gn);
        }
        if (fm.u())
        {
            ((et) (fm)).k.b(gn);
        }
    }

    public final void b(gn gn, fm fm)
    {
        boolean flag = false;
        fm = (et)fm;
        gn = (gt)gn;
        fm.a = new ad();
        ((et) (fm)).a.a(gn);
        et.a();
        fm.b = new x();
        ((et) (fm)).b.a(gn);
        et.b();
        fm.c = new ap();
        ((et) (fm)).c.a(gn);
        et.c();
        fm.d = new df();
        ((et) (fm)).d.a(gn);
        et.d();
        BitSet bitset = gn.b(7);
        if (bitset.get(0))
        {
            fm.e = new l();
            ((et) (fm)).e.a(gn);
            et.f();
        }
        if (bitset.get(1))
        {
            gl gl1 = new gl((byte)12, gn.m());
            fm.f = new ArrayList(gl1.b);
            for (int i = 0; i < gl1.b; i++)
            {
                cn cn1 = new cn();
                cn1.a(gn);
                ((et) (fm)).f.add(cn1);
            }

            et.k();
        }
        if (bitset.get(2))
        {
            gl gl2 = new gl((byte)12, gn.m());
            fm.g = new ArrayList(gl2.b);
            for (int j = ((flag) ? 1 : 0); j < gl2.b; j++)
            {
                eh eh1 = new eh();
                eh1.a(gn);
                ((et) (fm)).g.add(eh1);
            }

            et.n();
        }
        if (bitset.get(3))
        {
            fm.h = new cb();
            ((et) (fm)).h.a(gn);
            et.p();
        }
        if (bitset.get(4))
        {
            fm.i = new bu();
            ((et) (fm)).i.a(gn);
            et.r();
        }
        if (bitset.get(5))
        {
            fm.j = new r();
            ((et) (fm)).j.a(gn);
            et.t();
        }
        if (bitset.get(6))
        {
            fm.k = new aj();
            ((et) (fm)).k.a(gn);
            et.v();
        }
    }
}
