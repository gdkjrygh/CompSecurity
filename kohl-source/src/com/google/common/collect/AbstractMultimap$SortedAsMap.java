// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Comparator;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

// Referenced classes of package com.google.common.collect:
//            AbstractMultimap

private class  extends 
    implements SortedMap
{

    SortedSet sortedKeySet;
    final AbstractMultimap this$0;

    public Comparator comparator()
    {
        return sortedMap().comparator();
    }

    public Object firstKey()
    {
        return sortedMap().firstKey();
    }

    public SortedMap headMap(Object obj)
    {
        return new <init>(sortedMap().headMap(obj));
    }

    public volatile Set keySet()
    {
        return keySet();
    }

    public SortedSet keySet()
    {
        SortedSet sortedset = sortedKeySet;
        Object obj = sortedset;
        if (sortedset == null)
        {
            obj = new (AbstractMultimap.this, sortedMap());
            sortedKeySet = ((SortedSet) (obj));
        }
        return ((SortedSet) (obj));
    }

    public Object lastKey()
    {
        return sortedMap().lastKey();
    }

    SortedMap sortedMap()
    {
        return (SortedMap)submap;
    }

    public SortedMap subMap(Object obj, Object obj1)
    {
        return new <init>(sortedMap().subMap(obj, obj1));
    }

    public SortedMap tailMap(Object obj)
    {
        return new <init>(sortedMap().tailMap(obj));
    }

    (SortedMap sortedmap)
    {
        this$0 = AbstractMultimap.this;
        super(AbstractMultimap.this, sortedmap);
    }
}
