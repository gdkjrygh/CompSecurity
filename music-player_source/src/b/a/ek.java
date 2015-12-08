// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package b.a:
//            gx, eh, gt, dl, 
//            cz, en, gl, gn, 
//            fm

final class ek extends gx
{

    private ek()
    {
    }

    ek(byte byte0)
    {
        this();
    }

    public final void a(gn gn, fm fm)
    {
        fm = (eh)fm;
        gn = (gt)gn;
        gn.a(((eh) (fm)).a);
        gn.a(((eh) (fm)).b);
        gn.a(((eh) (fm)).c);
        gn.a(((eh) (fm)).d);
        BitSet bitset = new BitSet();
        if (fm.i())
        {
            bitset.set(0);
        }
        if (fm.k())
        {
            bitset.set(1);
        }
        if (fm.m())
        {
            bitset.set(2);
        }
        gn.a(bitset, 3);
        if (fm.i())
        {
            gn.a(((eh) (fm)).e.size());
            for (Iterator iterator = ((eh) (fm)).e.iterator(); iterator.hasNext(); ((dl)iterator.next()).b(gn)) { }
        }
        if (fm.k())
        {
            gn.a(((eh) (fm)).f.size());
            for (Iterator iterator1 = ((eh) (fm)).f.iterator(); iterator1.hasNext(); ((cz)iterator1.next()).b(gn)) { }
        }
        if (fm.m())
        {
            ((eh) (fm)).g.b(gn);
        }
    }

    public final void b(gn gn, fm fm)
    {
        boolean flag = false;
        fm = (eh)fm;
        gn = (gt)gn;
        fm.a = gn.p();
        eh.a();
        fm.b = gn.n();
        fm.c();
        fm.c = gn.n();
        fm.e();
        fm.d = gn.n();
        fm.g();
        BitSet bitset = gn.b(3);
        if (bitset.get(0))
        {
            gl gl1 = new gl((byte)12, gn.m());
            fm.e = new ArrayList(gl1.b);
            for (int i = 0; i < gl1.b; i++)
            {
                dl dl1 = new dl();
                dl1.a(gn);
                ((eh) (fm)).e.add(dl1);
            }

            eh.j();
        }
        if (bitset.get(1))
        {
            gl gl2 = new gl((byte)12, gn.m());
            fm.f = new ArrayList(gl2.b);
            for (int j = ((flag) ? 1 : 0); j < gl2.b; j++)
            {
                cz cz1 = new cz();
                cz1.a(gn);
                ((eh) (fm)).f.add(cz1);
            }

            eh.l();
        }
        if (bitset.get(2))
        {
            fm.g = new en();
            ((eh) (fm)).g.a(gn);
            eh.n();
        }
    }
}
