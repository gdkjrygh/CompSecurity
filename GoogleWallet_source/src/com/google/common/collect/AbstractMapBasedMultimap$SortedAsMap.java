// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Comparator;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

// Referenced classes of package com.google.common.collect:
//            AbstractMapBasedMultimap

public final class  extends 
    implements SortedMap
{

    SortedSet sortedKeySet;
    final AbstractMapBasedMultimap this$0;

    private SortedSet createKeySet()
    {
        return new (AbstractMapBasedMultimap.this, sortedMap());
    }

    private SortedSet keySet()
    {
        SortedSet sortedset1 = sortedKeySet;
        SortedSet sortedset = sortedset1;
        if (sortedset1 == null)
        {
            sortedset = createKeySet();
            sortedKeySet = sortedset;
        }
        return sortedset;
    }

    private SortedMap sortedMap()
    {
        return (SortedMap)submap;
    }

    public final Comparator comparator()
    {
        return sortedMap().comparator();
    }

    final volatile Set createKeySet()
    {
        return createKeySet();
    }

    public final Object firstKey()
    {
        return sortedMap().firstKey();
    }

    public final SortedMap headMap(Object obj)
    {
        return new <init>(sortedMap().headMap(obj));
    }

    public final volatile Set keySet()
    {
        return keySet();
    }

    public final Object lastKey()
    {
        return sortedMap().lastKey();
    }

    public final SortedMap subMap(Object obj, Object obj1)
    {
        return new <init>(sortedMap().subMap(obj, obj1));
    }

    public final SortedMap tailMap(Object obj)
    {
        return new <init>(sortedMap().tailMap(obj));
    }

    (SortedMap sortedmap)
    {
        this$0 = AbstractMapBasedMultimap.this;
        super(AbstractMapBasedMultimap.this, sortedmap);
    }
}
