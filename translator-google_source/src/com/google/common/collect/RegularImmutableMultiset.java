// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            ImmutableMultiset, ImmutableMap, ImmutableSet, ImmutableList, 
//            Multisets, dm

class RegularImmutableMultiset extends ImmutableMultiset
{

    private final transient ImmutableMap a;
    private final transient int b;

    RegularImmutableMultiset(ImmutableMap immutablemap, int i)
    {
        a = immutablemap;
        b = i;
    }

    public boolean contains(Object obj)
    {
        return a.containsKey(obj);
    }

    public int count(Object obj)
    {
        obj = (Integer)a.get(obj);
        if (obj == null)
        {
            return 0;
        } else
        {
            return ((Integer) (obj)).intValue();
        }
    }

    public ImmutableSet elementSet()
    {
        return a.keySet();
    }

    public volatile Set elementSet()
    {
        return elementSet();
    }

    dm getEntry(int i)
    {
        java.util.Map.Entry entry = (java.util.Map.Entry)a.entrySet().asList().get(i);
        return Multisets.a(entry.getKey(), ((Integer)entry.getValue()).intValue());
    }

    public int hashCode()
    {
        return a.hashCode();
    }

    boolean isPartialView()
    {
        return a.isPartialView();
    }

    public int size()
    {
        return b;
    }
}
