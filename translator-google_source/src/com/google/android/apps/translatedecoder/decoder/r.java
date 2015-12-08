// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translatedecoder.decoder;

import com.google.android.apps.translatedecoder.util.SymbolTable;
import com.google.android.apps.translatedecoder.util.b;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.logging.Logger;

// Referenced classes of package com.google.android.apps.translatedecoder.decoder:
//            q, s, o, w

public final class r
{

    private static final Logger d = Logger.getLogger("translate");
    final List a = new ArrayList();
    final List b = new ArrayList();
    q c;
    private final b e;

    public r(b b1)
    {
        c = null;
        e = b1;
    }

    static b a(r r1)
    {
        return r1.e;
    }

    private void a(q q1, int i)
    {
        ((Map)b.get(i)).remove(q1.b());
    }

    static void a(r r1, q q1, int i)
    {
        r1.a(q1, i);
    }

    public final q a(int ai[], BitSet bitset, int i, int j)
    {
        Object obj = null;
        Object obj1;
        Object obj2;
        q q1;
        if (j >= b.size())
        {
            obj1 = new HashMap();
            b.add(obj1);
            obj2 = new HashMap();
            a.add(obj2);
        } else
        {
            obj1 = (Map)b.get(j);
            obj2 = (Map)a.get(j);
            obj = (q)((Map) (obj1)).get(q.a(ai, bitset, i));
        }
        q1 = ((q) (obj));
        if (obj == null)
        {
            q1 = new q(ai, bitset, i);
            obj = (s)((Map) (obj2)).get(bitset);
            ai = ((int []) (obj));
            if (obj == null)
            {
                ai = new s(this);
                ((Map) (obj2)).put(bitset, ai);
            }
            ai.a(q1);
            ((Map) (obj1)).put(q1.b(), q1);
        }
        return q1;
    }

    public final Map a(int i)
    {
        return (Map)b.get(i);
    }

    final void a(q q1, boolean flag, SymbolTable symboltable, StringBuilder stringbuilder)
    {
        if (q1.a != null)
        {
            a(q1.a.a, flag, symboltable, stringbuilder);
            if (flag)
            {
                stringbuilder.append("[ ");
            }
            stringbuilder.append(symboltable.getWords(q1.a.c.tgtWords()));
            stringbuilder.append(" ");
            if (flag)
            {
                stringbuilder.append("] ");
            }
        }
    }

    public final void b(int i)
    {
        PriorityQueue priorityqueue = new PriorityQueue();
        PriorityQueue priorityqueue1 = new PriorityQueue();
        for (Iterator iterator = ((Map)a.get(i)).entrySet().iterator(); iterator.hasNext(); priorityqueue1.clear())
        {
            ((s)((java.util.Map.Entry)iterator.next()).getValue()).a(priorityqueue1, priorityqueue, i);
        }

        q q1;
        for (; priorityqueue.size() > e.B; a(q1, i))
        {
            q1 = (q)priorityqueue.poll();
            if (((s)((Map)a.get(i)).get(q1.c)).b(q1))
            {
                ((Map)a.get(i)).remove(q1.c);
            }
        }

        priorityqueue.clear();
    }

}
