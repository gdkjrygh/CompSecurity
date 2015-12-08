// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

// Referenced classes of package com.google.common.collect:
//            Multimap, ImmutableListMultimap, ImmutableMultiset, ImmutableMap, 
//            ImmutableSet, ImmutableCollection, Multiset, AbstractMultimap, 
//            Lists, UnmodifiableIterator, Maps, Serialization

public abstract class ImmutableMultimap
    implements Multimap, Serializable
{
    public static class Builder
    {

        Multimap builderMultimap;
        Comparator valueComparator;

        public ImmutableMultimap build()
        {
            if (valueComparator != null)
            {
                for (Iterator iterator = builderMultimap.asMap().values().iterator(); iterator.hasNext(); Collections.sort((List)(Collection)iterator.next(), valueComparator)) { }
            }
            return ImmutableMultimap.copyOf(builderMultimap);
        }

        public Builder orderKeysBy(Comparator comparator)
        {
            builderMultimap = new SortedKeyBuilderMultimap((Comparator)Preconditions.checkNotNull(comparator), builderMultimap);
            return this;
        }

        public Builder orderValuesBy(Comparator comparator)
        {
            valueComparator = (Comparator)Preconditions.checkNotNull(comparator);
            return this;
        }

        public Builder put(Object obj, Object obj1)
        {
            builderMultimap.put(Preconditions.checkNotNull(obj), Preconditions.checkNotNull(obj1));
            return this;
        }

        public Builder putAll(Multimap multimap)
        {
            java.util.Map.Entry entry;
            for (multimap = multimap.asMap().entrySet().iterator(); multimap.hasNext(); putAll(entry.getKey(), (Iterable)entry.getValue()))
            {
                entry = (java.util.Map.Entry)multimap.next();
            }

            return this;
        }

        public Builder putAll(Object obj, Iterable iterable)
        {
            obj = builderMultimap.get(Preconditions.checkNotNull(obj));
            for (iterable = iterable.iterator(); iterable.hasNext(); ((Collection) (obj)).add(Preconditions.checkNotNull(iterable.next()))) { }
            return this;
        }

        public transient Builder putAll(Object obj, Object aobj[])
        {
            return putAll(obj, ((Iterable) (Arrays.asList(aobj))));
        }

        public Builder()
        {
            builderMultimap = new BuilderMultimap();
        }
    }

    private static class BuilderMultimap extends AbstractMultimap
    {

        private static final long serialVersionUID = 0L;

        Collection createCollection()
        {
            return Lists.newArrayList();
        }

        BuilderMultimap()
        {
            super(new LinkedHashMap());
        }
    }

    private static class EntryCollection extends ImmutableCollection
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

        public UnmodifiableIterator iterator()
        {
            return multimap.map.entrySet().iterator(). new UnmodifiableIterator() {

                Object key;
                final EntryCollection this$0;
                final Iterator val$mapIterator;
                Iterator valueIterator;

                public boolean hasNext()
                {
                    return key != null && valueIterator.hasNext() || mapIterator.hasNext();
                }

                public volatile Object next()
                {
                    return next();
                }

                public java.util.Map.Entry next()
                {
                    if (key == null || !valueIterator.hasNext())
                    {
                        java.util.Map.Entry entry = (java.util.Map.Entry)mapIterator.next();
                        key = entry.getKey();
                        valueIterator = ((ImmutableCollection)entry.getValue()).iterator();
                    }
                    return Maps.immutableEntry(key, valueIterator.next());
                }

            
            {
                this$0 = final_entrycollection;
                mapIterator = Iterator.this;
                super();
            }
            };
        }

        public volatile Iterator iterator()
        {
            return iterator();
        }

        public int size()
        {
            return multimap.size();
        }

        EntryCollection(ImmutableMultimap immutablemultimap)
        {
            multimap = immutablemultimap;
        }
    }

    static class FieldSettersHolder
    {

        static final Serialization.FieldSetter MAP_FIELD_SETTER = Serialization.getFieldSetter(com/google/common/collect/ImmutableMultimap, "map");
        static final Serialization.FieldSetter SIZE_FIELD_SETTER = Serialization.getFieldSetter(com/google/common/collect/ImmutableMultimap, "size");


        FieldSettersHolder()
        {
        }
    }

    private static class SortedKeyBuilderMultimap extends AbstractMultimap
    {

        private static final long serialVersionUID = 0L;

        Collection createCollection()
        {
            return Lists.newArrayList();
        }

        SortedKeyBuilderMultimap(Comparator comparator, Multimap multimap)
        {
            super(new TreeMap(comparator));
            putAll(multimap);
        }
    }

    private static class Values extends ImmutableCollection
    {

        private static final long serialVersionUID = 0L;
        final ImmutableMultimap multimap;

        boolean isPartialView()
        {
            return true;
        }

        public UnmodifiableIterator iterator()
        {
            return multimap.entries().iterator(). new UnmodifiableIterator() {

                final Values this$0;
                final Iterator val$entryIterator;

                public boolean hasNext()
                {
                    return entryIterator.hasNext();
                }

                public Object next()
                {
                    return ((java.util.Map.Entry)entryIterator.next()).getValue();
                }

            
            {
                this$0 = final_values1;
                entryIterator = Iterator.this;
                super();
            }
            };
        }

        public volatile Iterator iterator()
        {
            return iterator();
        }

        public int size()
        {
            return multimap.size();
        }

        Values(ImmutableMultimap immutablemultimap)
        {
            multimap = immutablemultimap;
        }
    }


    private static final long serialVersionUID = 0L;
    private transient ImmutableCollection entries;
    private transient ImmutableMultiset keys;
    final transient ImmutableMap map;
    final transient int size;
    private transient ImmutableCollection values;

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

    private ImmutableMultiset createKeys()
    {
        ImmutableMultiset.Builder builder1 = ImmutableMultiset.builder();
        java.util.Map.Entry entry;
        for (Iterator iterator = map.entrySet().iterator(); iterator.hasNext(); builder1.addCopies(entry.getKey(), ((ImmutableCollection)entry.getValue()).size()))
        {
            entry = (java.util.Map.Entry)iterator.next();
        }

        return builder1.build();
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

    public boolean containsEntry(Object obj, Object obj1)
    {
        obj = (Collection)map.get(obj);
        return obj != null && ((Collection) (obj)).contains(obj1);
    }

    public boolean containsKey(Object obj)
    {
        return map.containsKey(obj);
    }

    public boolean containsValue(Object obj)
    {
        for (Iterator iterator = map.values().iterator(); iterator.hasNext();)
        {
            if (((ImmutableCollection)iterator.next()).contains(obj))
            {
                return true;
            }
        }

        return false;
    }

    public ImmutableCollection entries()
    {
        ImmutableCollection immutablecollection = entries;
        Object obj = immutablecollection;
        if (immutablecollection == null)
        {
            obj = new EntryCollection(this);
            entries = ((ImmutableCollection) (obj));
        }
        return ((ImmutableCollection) (obj));
    }

    public volatile Collection entries()
    {
        return entries();
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof Multimap)
        {
            obj = (Multimap)obj;
            return map.equals(((Multimap) (obj)).asMap());
        } else
        {
            return false;
        }
    }

    public abstract ImmutableCollection get(Object obj);

    public volatile Collection get(Object obj)
    {
        return get(obj);
    }

    public int hashCode()
    {
        return map.hashCode();
    }

    public boolean isEmpty()
    {
        return size == 0;
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
        ImmutableMultiset immutablemultiset1 = keys;
        ImmutableMultiset immutablemultiset = immutablemultiset1;
        if (immutablemultiset1 == null)
        {
            immutablemultiset = createKeys();
            keys = immutablemultiset;
        }
        return immutablemultiset;
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

    public String toString()
    {
        return map.toString();
    }

    public ImmutableCollection values()
    {
        ImmutableCollection immutablecollection = values;
        Object obj = immutablecollection;
        if (immutablecollection == null)
        {
            obj = new Values(this);
            values = ((ImmutableCollection) (obj));
        }
        return ((ImmutableCollection) (obj));
    }

    public volatile Collection values()
    {
        return values();
    }
}
