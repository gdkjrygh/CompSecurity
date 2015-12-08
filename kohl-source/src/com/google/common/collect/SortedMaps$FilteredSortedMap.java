// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Predicate;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;

// Referenced classes of package com.google.common.collect:
//            SortedMaps

private static class  extends 
    implements SortedMap
{

    public Comparator comparator()
    {
        return sortedMap().comparator();
    }

    public Object firstKey()
    {
        return keySet().iterator().next();
    }

    public SortedMap headMap(Object obj)
    {
        return new <init>(sortedMap().headMap(obj), predicate);
    }

    public Object lastKey()
    {
        Object obj = sortedMap();
        do
        {
            obj = ((SortedMap) (obj)).lastKey();
            if (apply(obj, unfiltered.get(obj)))
            {
                return obj;
            }
            obj = sortedMap().headMap(obj);
        } while (true);
    }

    SortedMap sortedMap()
    {
        return (SortedMap)unfiltered;
    }

    public SortedMap subMap(Object obj, Object obj1)
    {
        return new <init>(sortedMap().subMap(obj, obj1), predicate);
    }

    public SortedMap tailMap(Object obj)
    {
        return new <init>(sortedMap().tailMap(obj), predicate);
    }

    (SortedMap sortedmap, Predicate predicate)
    {
        super(sortedmap, predicate);
    }
}
