// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package b.a:
//            gx, bu, gt, bo, 
//            bi, gm, gl, gn, 
//            fm

final class bx extends gx
{

    private bx()
    {
    }

    bx(byte byte0)
    {
        this();
    }

    public final void a(gn gn, fm fm)
    {
        fm = (bu)fm;
        gn = (gt)gn;
        gn.a(((bu) (fm)).a.size());
        java.util.Map.Entry entry;
        for (Iterator iterator = ((bu) (fm)).a.entrySet().iterator(); iterator.hasNext(); ((bo)entry.getValue()).b(gn))
        {
            entry = (java.util.Map.Entry)iterator.next();
            gn.a((String)entry.getKey());
        }

        BitSet bitset = new BitSet();
        if (fm.d())
        {
            bitset.set(0);
        }
        if (fm.e())
        {
            bitset.set(1);
        }
        gn.a(bitset, 2);
        if (fm.d())
        {
            gn.a(((bu) (fm)).b.size());
            for (Iterator iterator1 = ((bu) (fm)).b.iterator(); iterator1.hasNext(); ((bi)iterator1.next()).b(gn)) { }
        }
        if (fm.e())
        {
            gn.a(((bu) (fm)).c);
        }
    }

    public final void b(gn gn, fm fm)
    {
        boolean flag = false;
        fm = (bu)fm;
        gn = (gt)gn;
        Object obj = new gm((byte)11, (byte)12, gn.m());
        fm.a = new HashMap(((gm) (obj)).c * 2);
        for (int i = 0; i < ((gm) (obj)).c; i++)
        {
            String s = gn.p();
            bo bo1 = new bo();
            bo1.a(gn);
            ((bu) (fm)).a.put(s, bo1);
        }

        bu.b();
        obj = gn.b(2);
        if (((BitSet) (obj)).get(0))
        {
            gl gl1 = new gl((byte)12, gn.m());
            fm.b = new ArrayList(gl1.b);
            for (int j = ((flag) ? 1 : 0); j < gl1.b; j++)
            {
                bi bi1 = new bi();
                bi1.a(gn);
                ((bu) (fm)).b.add(bi1);
            }

            fm.a(true);
        }
        if (((BitSet) (obj)).get(1))
        {
            fm.c = gn.p();
            bu.f();
        }
    }
}
