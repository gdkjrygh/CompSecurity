// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            AbstractListMultimap

public final class ArrayListMultimap extends AbstractListMultimap
{

    transient int expectedValuesPerKey;

    private ArrayListMultimap()
    {
        super(new HashMap());
        expectedValuesPerKey = 3;
    }

    public static ArrayListMultimap create()
    {
        return new ArrayListMultimap();
    }

    public final volatile Map asMap()
    {
        return super.asMap();
    }

    public final volatile void clear()
    {
        super.clear();
    }

    public final volatile boolean containsEntry(Object obj, Object obj1)
    {
        return super.containsEntry(obj, obj1);
    }

    public final volatile boolean containsKey(Object obj)
    {
        return super.containsKey(obj);
    }

    public final volatile boolean containsValue(Object obj)
    {
        return super.containsValue(obj);
    }

    final volatile Collection createCollection()
    {
        return createCollection();
    }

    final List createCollection()
    {
        return new ArrayList(expectedValuesPerKey);
    }

    public final volatile Collection entries()
    {
        return super.entries();
    }

    public final volatile boolean equals(Object obj)
    {
        return super.equals(obj);
    }

    public final volatile List get(Object obj)
    {
        return super.get(obj);
    }

    public final volatile int hashCode()
    {
        return super.hashCode();
    }

    public final volatile boolean isEmpty()
    {
        return super.isEmpty();
    }

    public final volatile Set keySet()
    {
        return super.keySet();
    }

    public final volatile boolean put(Object obj, Object obj1)
    {
        return super.put(obj, obj1);
    }

    public final volatile boolean putAll(Object obj, Iterable iterable)
    {
        return super.putAll(obj, iterable);
    }

    public final volatile boolean remove(Object obj, Object obj1)
    {
        return super.remove(obj, obj1);
    }

    public final volatile List removeAll(Object obj)
    {
        return super.removeAll(obj);
    }

    public final volatile int size()
    {
        return super.size();
    }

    public final volatile String toString()
    {
        return super.toString();
    }

    public final volatile Collection values()
    {
        return super.values();
    }
}
