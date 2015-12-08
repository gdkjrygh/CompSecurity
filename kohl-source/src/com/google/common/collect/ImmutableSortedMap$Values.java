// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Iterator;

// Referenced classes of package com.google.common.collect:
//            ImmutableCollection, ImmutableSortedMap, UnmodifiableIterator

private static class map extends ImmutableCollection
{

    private final ImmutableSortedMap map;

    public boolean contains(Object obj)
    {
        return map.containsValue(obj);
    }

    boolean isPartialView()
    {
        return true;
    }

    public UnmodifiableIterator iterator()
    {
        return map.valueIterator();
    }

    public volatile Iterator iterator()
    {
        return iterator();
    }

    public int size()
    {
        return map.size();
    }

    Object writeReplace()
    {
        return new erializedForm(map);
    }

    erializedForm(ImmutableSortedMap immutablesortedmap)
    {
        map = immutablesortedmap;
    }
}
