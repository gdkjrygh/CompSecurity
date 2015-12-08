// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.java.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.soundcloud.java.collections:
//            MultiMap, Iterables

public class ListMultiMap
    implements MultiMap
{

    private static final int DEFAULT_VALUES_PER_KEY = 3;
    private final int expectedValuesPerKey;
    private final HashMap internalMap;

    public ListMultiMap()
    {
        this(3);
    }

    public ListMultiMap(int i)
    {
        this(i, ((Map) (new HashMap())));
    }

    ListMultiMap(int i, Map map)
    {
        expectedValuesPerKey = i;
        internalMap = new HashMap(map);
    }

    public ListMultiMap(Map map)
    {
        this(3, map);
    }

    private List internalGetMutableValues(Object obj)
    {
        List list = (List)internalMap.get(obj);
        Object obj1 = list;
        if (list == null)
        {
            obj1 = new ArrayList(expectedValuesPerKey);
            internalMap.put(obj, obj1);
        }
        return ((List) (obj1));
    }

    public boolean equals(Object obj)
    {
        return (obj instanceof ListMultiMap) && ((ListMultiMap)obj).internalMap.equals(internalMap);
    }

    public volatile Collection get(Object obj)
    {
        return get(obj);
    }

    public List get(Object obj)
    {
        List list = (List)internalMap.get(obj);
        obj = list;
        if (list == null)
        {
            obj = Collections.emptyList();
        }
        return ((List) (obj));
    }

    public int hashCode()
    {
        return internalMap.hashCode();
    }

    public boolean isEmpty()
    {
        return internalMap.isEmpty();
    }

    public Set keySet()
    {
        return Collections.unmodifiableSet(internalMap.keySet());
    }

    public ListMultiMap put(Object obj, Object obj1)
    {
        internalGetMutableValues(obj).add(obj1);
        return this;
    }

    public volatile MultiMap put(Object obj, Object obj1)
    {
        return put(obj, obj1);
    }

    public ListMultiMap putAll(Object obj, Iterable iterable)
    {
        Iterables.addAll(internalGetMutableValues(obj), iterable);
        return this;
    }

    public volatile MultiMap putAll(Object obj, Iterable iterable)
    {
        return putAll(obj, iterable);
    }

    public int size()
    {
        return internalMap.size();
    }

    public Map toMap()
    {
        return Collections.unmodifiableMap(internalMap);
    }
}
