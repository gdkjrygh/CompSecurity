// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.base;

import java.io.Serializable;
import java.util.Iterator;

// Referenced classes of package com.google.common.base:
//            Equivalence, Preconditions

final class PairwiseEquivalence
    implements Equivalence, Serializable
{

    private static final long serialVersionUID = 0L;
    final Equivalence elementEquivalence;

    PairwiseEquivalence(Equivalence equivalence)
    {
        elementEquivalence = (Equivalence)Preconditions.checkNotNull(equivalence);
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof PairwiseEquivalence)
        {
            obj = (PairwiseEquivalence)obj;
            return elementEquivalence.equals(((PairwiseEquivalence) (obj)).elementEquivalence);
        } else
        {
            return false;
        }
    }

    public boolean equivalent(Iterable iterable, Iterable iterable1)
    {
        if (iterable != null) goto _L2; else goto _L1
_L1:
        if (iterable1 != null) goto _L4; else goto _L3
_L3:
        return true;
_L4:
        return false;
_L2:
        if (iterable1 == null)
        {
            return false;
        }
        iterable = iterable.iterator();
        iterable1 = iterable1.iterator();
        do
        {
            if (!iterable.hasNext() || !iterable1.hasNext())
            {
                continue; /* Loop/switch isn't completed */
            }
        } while (elementEquivalence.equivalent(iterable.next(), iterable1.next()));
        return false;
        if (!iterable.hasNext() && !iterable1.hasNext()) goto _L3; else goto _L5
_L5:
        return false;
    }

    public volatile boolean equivalent(Object obj, Object obj1)
    {
        return equivalent((Iterable)obj, (Iterable)obj1);
    }

    public int hash(Iterable iterable)
    {
        if (iterable != null) goto _L2; else goto _L1
_L1:
        int j = 0;
_L4:
        return j;
_L2:
        int i = 0x13381;
        iterable = iterable.iterator();
        do
        {
            j = i;
            if (!iterable.hasNext())
            {
                continue;
            }
            Object obj = iterable.next();
            i = i * 24943 + elementEquivalence.hash(obj);
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public volatile int hash(Object obj)
    {
        return hash((Iterable)obj);
    }

    public int hashCode()
    {
        return elementEquivalence.hashCode() ^ 0x46a3eb07;
    }

    public String toString()
    {
        return (new StringBuilder()).append("Equivalences.pairwise(").append(elementEquivalence).append(")").toString();
    }
}
