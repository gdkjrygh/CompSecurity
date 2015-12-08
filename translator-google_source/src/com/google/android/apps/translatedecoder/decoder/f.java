// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translatedecoder.decoder;

import com.google.android.apps.translatedecoder.lm.a;
import com.google.android.apps.translatedecoder.pt.PhrasePair;
import com.google.android.apps.translatedecoder.util.SymbolTable;
import com.google.android.apps.translatedecoder.util.b;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;

// Referenced classes of package com.google.android.apps.translatedecoder.decoder:
//            q, w, o, r

public final class f
{

    private static final Logger f = Logger.getLogger("translate");
    private final a a;
    private final r b;
    private final b c;
    private final SymbolTable d;
    private double e[];

    public f(a a1, r r1, b b1, SymbolTable symboltable)
    {
        e = new double[1];
        a = a1;
        b = r1;
        c = b1;
        d = symboltable;
    }

    private static int a(BitSet bitset, int i, int j)
    {
        for (i++; i <= j; i++)
        {
            if (!bitset.get(i))
            {
                return i;
            }
        }

        return -1;
    }

    private void a(q q1, w w1, q q2, double d1, double d2)
    {
        d1 = q1.a() + w1.cost() + c.l * d2 + d1;
        boolean flag;
        if (q2.a == null || d1 < q2.a.b)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            q2.a = new o(q1, d1, w1);
        }
    }

    private static boolean a(int i, int j, int k)
    {
        if (i > j) goto _L2; else goto _L1
_L1:
        if (j - i > k + 1) goto _L4; else goto _L3
_L3:
        return true;
_L4:
        return false;
_L2:
        if (i - j >= k)
        {
            return false;
        }
        if (true) goto _L3; else goto _L5
_L5:
    }

    private static boolean a(BitSet bitset)
    {
        int i = 0;
        int j;
        int k;
        for (k = 0; i < bitset.length() - 1; k = j)
        {
            int l = i;
            j = k;
            if (bitset.get(i))
            {
                l = i;
                j = k;
                if (!bitset.get(i + 1))
                {
                    j = k + 1;
                    l = i + 1;
                }
            }
            i = l + 1;
        }

        return k < 2;
    }

    private static boolean a(BitSet bitset, int i, int j, int k)
    {
        int i1 = a(bitset, -1, k);
        int l = i;
        for (i = i1; i >= 0 && a(l, i, j); i = i1)
        {
            bitset.set(i);
            i1 = a(bitset, i, k);
            l = i;
        }

        return i < 0;
    }

    public final q a(List list, PhrasePair phrasepair, int i, int j)
    {
        Object obj = null;
        Iterator iterator = list.iterator();
        list = obj;
        while (iterator.hasNext()) 
        {
            Object obj1 = (q)iterator.next();
            q q1 = new q(a.a(((q) (obj1)).b, phrasepair.tgtWords(), e), new BitSet(), j);
            a(((q) (obj1)), ((w) (phrasepair)), q1, c.E * (double)(i - ((q) (obj1)).d - 1), e[0]);
            obj1 = q1;
            if (list != null)
            {
                if (list.a() > q1.a())
                {
                    obj1 = q1;
                } else
                {
                    obj1 = list;
                }
            }
            list = ((List) (obj1));
        }
        return list;
    }

    public final List a(q q1, int i, int j, int k)
    {
        BitSet bitset = q1.c;
        int i1 = q1.d;
        q1 = new ArrayList();
        int l = a(bitset, -1, k);
        int j1 = c.j;
        for (; l >= 0 && l <= k - j; l = a(bitset, l, k))
        {
            if (!a(i1, l, i) || !bitset.get(l, l + j).isEmpty())
            {
                continue;
            }
            BitSet bitset1 = (BitSet)bitset.clone();
            bitset1.set(l, l + j);
            if (a(bitset1) && a(bitset1, (l + j) - 1, i, k))
            {
                q1.add(Integer.valueOf(l));
            }
        }

        return q1;
    }

    public final void a(q q1, List list, int i, int j)
    {
        double d1;
        Object obj;
        int k;
        d1 = 0.0D;
        obj = c;
        k = a(q1.c, -1, q1.c.size() - 1);
        if (k != -1) goto _L2; else goto _L1
_L1:
        d1 = 0.0D;
_L4:
        int ai[];
        BitSet bitset;
        for (list = list.iterator(); list.hasNext(); a(q1, ((w) (obj)), b.a(ai, bitset, j, bitset.cardinality()), d1, e[0]))
        {
            obj = (PhrasePair)list.next();
            ai = a.a(q1.b, ((w) (obj)).tgtWords(), e);
            bitset = (BitSet)q1.c.clone();
            bitset.set(i, j + 1);
        }

        break MISSING_BLOCK_LABEL_217;
_L2:
        int l;
        l = q1.d;
        if (k != i)
        {
            break; /* Loop/switch isn't completed */
        }
_L5:
        d1 *= ((b) (obj)).E;
        if (true) goto _L4; else goto _L3
_L3:
        if (i >= l && l > 0 && l < k)
        {
            d1 = ((j - k) + 1) * 2;
        } else
        {
            d1 = (j - l) * 2;
        }
          goto _L5
        if (true) goto _L4; else goto _L6
_L6:
    }

}
