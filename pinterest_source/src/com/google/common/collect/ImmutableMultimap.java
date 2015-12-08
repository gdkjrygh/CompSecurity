// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            AbstractMultimap, ImmutableListMultimap, ImmutableMap, ImmutableCollection, 
//            ImmutableMultiset, Multimap, Multiset, UnmodifiableIterator, 
//            ImmutableSet

public abstract class ImmutableMultimap extends AbstractMultimap
    implements Serializable
{

    private static final long serialVersionUID = 0L;
    final transient ImmutableMap map;
    final transient int size;

    ImmutableMultimap(ImmutableMap immutablemap, int i)
    {
        map = immutablemap;
        size = i;
    }

    public static Builder builder()
    {
        return new Builder();
    }

    public static ImmutableMultimap copyOf(Multimap multimap)
    {
        if (multimap instanceof ImmutableMultimap)
        {
            ImmutableMultimap immutablemultimap = (ImmutableMultimap)multimap;
            if (!immutablemultimap.isPartialView())
            {
                return immutablemultimap;
            }
        }
        return ImmutableListMultimap.copyOf(multimap);
    }

    public static ImmutableMultimap of()
    {
        return ImmutableListMultimap.of();
    }

    public static ImmutableMultimap of(Object obj, Object obj1)
    {
        return ImmutableListMultimap.of(obj, obj1);
    }

    public static ImmutableMultimap of(Object obj, Object obj1, Object obj2, Object obj3)
    {
        return ImmutableListMultimap.of(obj, obj1, obj2, obj3);
    }

    public static ImmutableMultimap of(Object obj, Object obj1, Object obj2, Object obj3, Object obj4, Object obj5)
    {
        return ImmutableListMultimap.of(obj, obj1, obj2, obj3, obj4, obj5);
    }

    public static ImmutableMultimap of(Object obj, Object obj1, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7)
    {
        return ImmutableListMultimap.of(obj, obj1, obj2, obj3, obj4, obj5, obj6, obj7);
    }

    public static ImmutableMultimap of(Object obj, Object obj1, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, 
            Object obj8, Object obj9)
    {
        return ImmutableListMultimap.of(obj, obj1, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9);
    }

    public ImmutableMap asMap()
    {
        return map;
    }

    public volatile Map asMap()
    {
        return asMap();
    }

    public void clear()
    {
        throw new UnsupportedOperationException();
    }

    public volatile boolean containsEntry(Object obj, Object obj1)
    {
        return super.containsEntry(obj, obj1);
    }

    public boolean containsKey(Object obj)
    {
        return map.containsKey(obj);
    }

    public boolean containsValue(Object obj)
    {
        return obj != null && super.containsValue(obj);
    }

    Map createAsMap()
    {
        throw new AssertionError("should never be called");
    }

    ImmutableCollection createEntries()
    {
        return new EntryCollection();
    }

    volatile Collection createEntries()
    {
        return createEntries();
    }

    ImmutableMultiset createKeys()
    {
        return new Keys();
    }

    volatile Multiset createKeys()
    {
        return createKeys();
    }

    ImmutableCollection createValues()
    {
        return new Values();
    }

    volatile Collection createValues()
    {
        return createValues();
    }

    public ImmutableCollection entries()
    {
        return (ImmutableCollection)super.entries();
    }

    public volatile Collection entries()
    {
        return entries();
    }

    UnmodifiableIterator entryIterator()
    {
        return new _cls1();
    }

    volatile Iterator entryIterator()
    {
        return entryIterator();
    }

    public volatile boolean equals(Object obj)
    {
        return super.equals(obj);
    }

    public abstract ImmutableCollection get(Object obj);

    public volatile Collection get(Object obj)
    {
        return get(obj);
    }

    public volatile int hashCode()
    {
        return super.hashCode();
    }

    public abstract ImmutableMultimap inverse();

    public volatile boolean isEmpty()
    {
        return super.isEmpty();
    }

    boolean isPartialView()
    {
        return map.isPartialView();
    }

    public ImmutableSet keySet()
    {
        return map.keySet();
    }

    public volatile Set keySet()
    {
        return keySet();
    }

    public ImmutableMultiset keys()
    {
        return (ImmutableMultiset)super.keys();
    }

    public volatile Multiset keys()
    {
        return keys();
    }

    public boolean put(Object obj, Object obj1)
    {
        throw new UnsupportedOperationException();
    }

    public boolean putAll(Multimap multimap)
    {
        throw new UnsupportedOperationException();
    }

    public boolean putAll(Object obj, Iterable iterable)
    {
        throw new UnsupportedOperationException();
    }

    public boolean remove(Object obj, Object obj1)
    {
        throw new UnsupportedOperationException();
    }

    public ImmutableCollection removeAll(Object obj)
    {
        throw new UnsupportedOperationException();
    }

    public volatile Collection removeAll(Object obj)
    {
        return removeAll(obj);
    }

    public ImmutableCollection replaceValues(Object obj, Iterable iterable)
    {
        throw new UnsupportedOperationException();
    }

    public volatile Collection replaceValues(Object obj, Iterable iterable)
    {
        return replaceValues(obj, iterable);
    }

    public int size()
    {
        return size;
    }

    public volatile String toString()
    {
        return super.toString();
    }

    UnmodifiableIterator valueIterator()
    {
        return new _cls2();
    }

    volatile Iterator valueIterator()
    {
        return valueIterator();
    }

    public ImmutableCollection values()
    {
        return (ImmutableCollection)super.values();
    }

    public volatile Collection values()
    {
        return values();
    }

    /* member class not found */
    class Builder {}


    /* member class not found */
    class EntryCollection {}


    /* member class not found */
    class Keys {}


    /* member class not found */
    class Values {}


    /* member class not found */
    class _cls1 {}


    /* member class not found */
    class _cls2 {}

}
