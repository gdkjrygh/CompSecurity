// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import java.util.BitSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package b.a:
//            gx, bc, gt, dr, 
//            gm, gn, fm

final class bf extends gx
{

    private bf()
    {
    }

    bf(byte byte0)
    {
        this();
    }

    public final void a(gn gn, fm fm)
    {
        fm = (bc)fm;
        gn = (gt)gn;
        gn.a(((bc) (fm)).a);
        gn.a(((bc) (fm)).b.size());
        java.util.Map.Entry entry;
        for (Iterator iterator = ((bc) (fm)).b.entrySet().iterator(); iterator.hasNext(); ((dr)entry.getValue()).b(gn))
        {
            entry = (java.util.Map.Entry)iterator.next();
            gn.a((String)entry.getKey());
        }

        gn.a(((bc) (fm)).e);
        BitSet bitset = new BitSet();
        if (fm.c())
        {
            bitset.set(0);
        }
        if (fm.e())
        {
            bitset.set(1);
        }
        gn.a(bitset, 2);
        if (fm.c())
        {
            gn.a(((bc) (fm)).c);
        }
        if (fm.e())
        {
            gn.a(((bc) (fm)).d);
        }
    }

    public final void b(gn gn, fm fm)
    {
        fm = (bc)fm;
        gn = (gt)gn;
        fm.a = gn.p();
        bc.a();
        Object obj = new gm((byte)11, (byte)12, gn.m());
        fm.b = new HashMap(((gm) (obj)).c * 2);
        for (int i = 0; i < ((gm) (obj)).c; i++)
        {
            String s = gn.p();
            dr dr1 = new dr();
            dr1.a(gn);
            ((bc) (fm)).b.put(s, dr1);
        }

        bc.b();
        fm.e = gn.n();
        fm.h();
        obj = gn.b(2);
        if (((BitSet) (obj)).get(0))
        {
            fm.c = gn.n();
            fm.d();
        }
        if (((BitSet) (obj)).get(1))
        {
            fm.d = gn.m();
            fm.f();
        }
    }
}
