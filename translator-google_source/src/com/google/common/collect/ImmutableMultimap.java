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
//            w, bb, ImmutableListMultimap, ImmutableMap, 
//            ImmutableCollection, az, ImmutableMultiset, ba, 
//            de, dl, ej, ImmutableSet

public abstract class ImmutableMultimap extends w
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

    public static bb builder()
    {
        return new bb();
    }

    public static ImmutableMultimap copyOf(de de)
    {
        if (de instanceof ImmutableMultimap)
        {
            ImmutableMultimap immutablemultimap = (ImmutableMultimap)de;
            if (!immutablemultimap.isPartialView())
            {
                return immutablemultimap;
            }
        }
        return ImmutableListMultimap.copyOf(de);
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

    volatile dl createKeys()
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

    ej entryIterator()
    {
        return new az(this);
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

    public volatile dl keys()
    {
        return keys();
    }

    public boolean put(Object obj, Object obj1)
    {
        throw new UnsupportedOperationException();
    }

    public boolean putAll(de de)
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

    ej valueIterator()
    {
        return new ba(this);
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

    private class EntryCollection extends ImmutableCollection
    {

        private static final long serialVersionUID = 0L;
        final ImmutableMultimap multimap;

        public boolean contains(Object obj)
        {
            if (obj instanceof java.util.Map.Entry)
            {
                obj = (java.util.Map.Entry)obj;
                return multimap.containsEntry(((java.util.Map.Entry) (obj)).getKey(), ((java.util.Map.Entry) (obj)).getValue());
            } else
            {
                return false;
            }
        }

        boolean isPartialView()
        {
            return multimap.isPartialView();
        }

        public ej iterator()
        {
            return multimap.entryIterator();
        }

        public volatile Iterator iterator()
        {
            return iterator();
        }

        public int size()
        {
            return multimap.size();
        }

        EntryCollection()
        {
            multimap = ImmutableMultimap.this;
        }
    }


    private class Keys extends ImmutableMultiset
    {

        final ImmutableMultimap this$0;

        public boolean contains(Object obj)
        {
            return containsKey(obj);
        }

        public int count(Object obj)
        {
            obj = (Collection)map.get(obj);
            if (obj == null)
            {
                return 0;
            } else
            {
                return ((Collection) (obj)).size();
            }
        }

        public Set elementSet()
        {
            return keySet();
        }

        dm getEntry(int i)
        {
            java.util.Map.Entry entry = (java.util.Map.Entry)map.entrySet().asList().get(i);
            return Multisets.a(entry.getKey(), ((Collection)entry.getValue()).size());
        }

        boolean isPartialView()
        {
            return true;
        }

        public int size()
        {
            return ImmutableMultimap.this.size();
        }

        Keys()
        {
            this$0 = ImmutableMultimap.this;
            super();
        }
    }


    private class Values extends ImmutableCollection
    {

        private static final long serialVersionUID = 0L;
        private final transient ImmutableMultimap a;

        public final boolean contains(Object obj)
        {
            return a.containsValue(obj);
        }

        final int copyIntoArray(Object aobj[], int i)
        {
            for (Iterator iterator1 = a.map.values().iterator(); iterator1.hasNext();)
            {
                i = ((ImmutableCollection)iterator1.next()).copyIntoArray(aobj, i);
            }

            return i;
        }

        final boolean isPartialView()
        {
            return true;
        }

        public final ej iterator()
        {
            return a.valueIterator();
        }

        public final volatile Iterator iterator()
        {
            return iterator();
        }

        public final int size()
        {
            return a.size();
        }

        Values()
        {
            a = ImmutableMultimap.this;
        }
    }

}
