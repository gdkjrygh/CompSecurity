// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package b.a:
//            gx, cn, gt, av, 
//            bc, gl, gn, fm

final class cq extends gx
{

    private cq()
    {
    }

    cq(byte byte0)
    {
        this();
    }

    public final void a(gn gn, fm fm)
    {
        fm = (cn)fm;
        gn = (gt)gn;
        gn.a(((cn) (fm)).a);
        BitSet bitset = new BitSet();
        if (fm.c())
        {
            bitset.set(0);
        }
        if (fm.e())
        {
            bitset.set(1);
        }
        if (fm.g())
        {
            bitset.set(2);
        }
        gn.a(bitset, 3);
        if (fm.c())
        {
            gn.a(((cn) (fm)).b.size());
            for (Iterator iterator = ((cn) (fm)).b.iterator(); iterator.hasNext(); ((av)iterator.next()).b(gn)) { }
        }
        if (fm.e())
        {
            gn.a(((cn) (fm)).c.size());
            for (Iterator iterator1 = ((cn) (fm)).c.iterator(); iterator1.hasNext(); ((bc)iterator1.next()).b(gn)) { }
        }
        if (fm.g())
        {
            gn.a(((cn) (fm)).d.size());
            for (fm = ((cn) (fm)).d.iterator(); fm.hasNext(); ((bc)fm.next()).b(gn)) { }
        }
    }

    public final void b(gn gn, fm fm)
    {
        boolean flag = false;
        fm = (cn)fm;
        gn = (gt)gn;
        fm.a = gn.p();
        cn.b();
        BitSet bitset = gn.b(3);
        if (bitset.get(0))
        {
            gl gl2 = new gl((byte)12, gn.m());
            fm.b = new ArrayList(gl2.b);
            for (int i = 0; i < gl2.b; i++)
            {
                av av1 = new av();
                av1.a(gn);
                ((cn) (fm)).b.add(av1);
            }

            cn.d();
        }
        if (bitset.get(1))
        {
            gl gl3 = new gl((byte)12, gn.m());
            fm.c = new ArrayList(gl3.b);
            for (int j = 0; j < gl3.b; j++)
            {
                bc bc2 = new bc();
                bc2.a(gn);
                ((cn) (fm)).c.add(bc2);
            }

            cn.f();
        }
        if (bitset.get(2))
        {
            gl gl1 = new gl((byte)12, gn.m());
            fm.d = new ArrayList(gl1.b);
            for (int k = ((flag) ? 1 : 0); k < gl1.b; k++)
            {
                bc bc1 = new bc();
                bc1.a(gn);
                ((cn) (fm)).d.add(bc1);
            }

            cn.h();
        }
    }
}
