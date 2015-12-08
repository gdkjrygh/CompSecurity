// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Function;
import com.google.common.base.Joiner;
import com.google.common.base.Preconditions;
import com.google.common.base.Supplier;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedSet;

// Referenced classes of package com.google.common.collect:
//            ImmutableListMultimap, Multimap, Synchronized, Maps, 
//            SetMultimap, ListMultimap, SortedSetMultimap, AbstractListMultimap, 
//            AbstractMultimap, AbstractSetMultimap, AbstractSortedSetMultimap, Multisets, 
//            Collections2, Multiset, AbstractMapEntry, Lists, 
//            ForwardingSet, ForwardingIterator, ForwardingCollection, ForwardingMultimap, 
//            ForwardingMap

public final class Multimaps
{
    private static class CustomListMultimap extends AbstractListMultimap
    {

        private static final long serialVersionUID = 0L;
        transient Supplier factory;

        private void readObject(ObjectInputStream objectinputstream)
            throws IOException, ClassNotFoundException
        {
            objectinputstream.defaultReadObject();
            factory = (Supplier)objectinputstream.readObject();
            setMap((Map)objectinputstream.readObject());
        }

        private void writeObject(ObjectOutputStream objectoutputstream)
            throws IOException
        {
            objectoutputstream.defaultWriteObject();
            objectoutputstream.writeObject(factory);
            objectoutputstream.writeObject(backingMap());
        }

        protected volatile Collection createCollection()
        {
            return createCollection();
        }

        protected List createCollection()
        {
            return (List)factory.get();
        }

        CustomListMultimap(Map map, Supplier supplier)
        {
            super(map);
            factory = (Supplier)Preconditions.checkNotNull(supplier);
        }
    }

    private static class CustomMultimap extends AbstractMultimap
    {

        private static final long serialVersionUID = 0L;
        transient Supplier factory;

        private void readObject(ObjectInputStream objectinputstream)
            throws IOException, ClassNotFoundException
        {
            objectinputstream.defaultReadObject();
            factory = (Supplier)objectinputstream.readObject();
            setMap((Map)objectinputstream.readObject());
        }

        private void writeObject(ObjectOutputStream objectoutputstream)
            throws IOException
        {
            objectoutputstream.defaultWriteObject();
            objectoutputstream.writeObject(factory);
            objectoutputstream.writeObject(backingMap());
        }

        protected Collection createCollection()
        {
            return (Collection)factory.get();
        }

        CustomMultimap(Map map, Supplier supplier)
        {
            super(map);
            factory = (Supplier)Preconditions.checkNotNull(supplier);
        }
    }

    private static class CustomSetMultimap extends AbstractSetMultimap
    {

        private static final long serialVersionUID = 0L;
        transient Supplier factory;

        private void readObject(ObjectInputStream objectinputstream)
            throws IOException, ClassNotFoundException
        {
            objectinputstream.defaultReadObject();
            factory = (Supplier)objectinputstream.readObject();
            setMap((Map)objectinputstream.readObject());
        }

        private void writeObject(ObjectOutputStream objectoutputstream)
            throws IOException
        {
            objectoutputstream.defaultWriteObject();
            objectoutputstream.writeObject(factory);
            objectoutputstream.writeObject(backingMap());
        }

        protected volatile Collection createCollection()
        {
            return createCollection();
        }

        protected Set createCollection()
        {
            return (Set)factory.get();
        }

        CustomSetMultimap(Map map, Supplier supplier)
        {
            super(map);
            factory = (Supplier)Preconditions.checkNotNull(supplier);
        }
    }

    private static class CustomSortedSetMultimap extends AbstractSortedSetMultimap
    {

        private static final long serialVersionUID = 0L;
        transient Supplier factory;
        transient Comparator valueComparator;

        private void readObject(ObjectInputStream objectinputstream)
            throws IOException, ClassNotFoundException
        {
            objectinputstream.defaultReadObject();
            factory = (Supplier)objectinputstream.readObject();
            valueComparator = ((SortedSet)factory.get()).comparator();
            setMap((Map)objectinputstream.readObject());
        }

        private void writeObject(ObjectOutputStream objectoutputstream)
            throws IOException
        {
            objectoutputstream.defaultWriteObject();
            objectoutputstream.writeObject(factory);
            objectoutputstream.writeObject(backingMap());
        }

        protected volatile Collection createCollection()
        {
            return createCollection();
        }

        protected volatile Set createCollection()
        {
            return createCollection();
        }

        protected SortedSet createCollection()
        {
            return (SortedSet)factory.get();
        }

        public Comparator valueComparator()
        {
            return valueComparator;
        }

        CustomSortedSetMultimap(Map map, Supplier supplier)
        {
            super(map);
            factory = (Supplier)Preconditions.checkNotNull(supplier);
            valueComparator = ((SortedSet)supplier.get()).comparator();
        }
    }

    private static class MapMultimap
        implements SetMultimap, Serializable
    {

        private static final com.google.common.base.Joiner.MapJoiner JOINER = Joiner.on("], ").withKeyValueSeparator("=[").useForNull("null");
        private static final long serialVersionUID = 0x6cdfd44a398c560fL;
        transient Map asMap;
        final Map map;

        public Map asMap()
        {
            Map map1 = asMap;
            Object obj = map1;
            if (map1 == null)
            {
                obj = new AsMap();
                asMap = ((Map) (obj));
            }
            return ((Map) (obj));
        }

        public void clear()
        {
            map.clear();
        }

        public boolean containsEntry(Object obj, Object obj1)
        {
            return map.entrySet().contains(Maps.immutableEntry(obj, obj1));
        }

        public boolean containsKey(Object obj)
        {
            return map.containsKey(obj);
        }

        public boolean containsValue(Object obj)
        {
            return map.containsValue(obj);
        }

        public volatile Collection entries()
        {
            return entries();
        }

        public Set entries()
        {
            return map.entrySet();
        }

        public boolean equals(Object obj)
        {
            if (obj != this)
            {
                if (obj instanceof Multimap)
                {
                    if (size() != ((Multimap) (obj = (Multimap)obj)).size() || !asMap().equals(((Multimap) (obj)).asMap()))
                    {
                        return false;
                    }
                } else
                {
                    return false;
                }
            }
            return true;
        }

        public volatile Collection get(Object obj)
        {
            return get(obj);
        }

        public Set get(Object obj)
        {
            return ((_cls1) (obj)). new AbstractSet() {

                final MapMultimap this$0;
                final Object val$key;

                public Iterator iterator()
                {
                    return new Iterator() {

                        int i;
                        final MapMultimap._cls1 this$1;

                        public boolean hasNext()
                        {
                            return i == 0 && map.containsKey(key);
                        }

                        public Object next()
                        {
                            if (!hasNext())
                            {
                                throw new NoSuchElementException();
                            } else
                            {
                                i = i + 1;
                                return map.get(key);
                            }
                        }

                        public void remove()
                        {
                            boolean flag = true;
                            if (i != 1)
                            {
                                flag = false;
                            }
                            Preconditions.checkState(flag);
                            i = -1;
                            map.remove(key);
                        }

            
            {
                this$1 = MapMultimap._cls1.this;
                super();
            }
                    };
                }

                public int size()
                {
                    return !map.containsKey(key) ? 0 : 1;
                }

            
            {
                this$0 = final_mapmultimap;
                key = Object.this;
                super();
            }
            };
        }

        public int hashCode()
        {
            return map.hashCode();
        }

        public boolean isEmpty()
        {
            return map.isEmpty();
        }

        public Set keySet()
        {
            return map.keySet();
        }

        public Multiset keys()
        {
            return Multisets.forSet(map.keySet());
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
            return map.entrySet().remove(Maps.immutableEntry(obj, obj1));
        }

        public volatile Collection removeAll(Object obj)
        {
            return removeAll(obj);
        }

        public Set removeAll(Object obj)
        {
            HashSet hashset = new HashSet(2);
            if (!map.containsKey(obj))
            {
                return hashset;
            } else
            {
                hashset.add(map.remove(obj));
                return hashset;
            }
        }

        public volatile Collection replaceValues(Object obj, Iterable iterable)
        {
            return replaceValues(obj, iterable);
        }

        public Set replaceValues(Object obj, Iterable iterable)
        {
            throw new UnsupportedOperationException();
        }

        public int size()
        {
            return map.size();
        }

        public String toString()
        {
            if (map.isEmpty())
            {
                return "{}";
            } else
            {
                StringBuilder stringbuilder = Collections2.newStringBuilderForCollection(map.size()).append('{');
                JOINER.appendTo(stringbuilder, map);
                return stringbuilder.append("]}").toString();
            }
        }

        public Collection values()
        {
            return map.values();
        }


        MapMultimap(Map map1)
        {
            map = (Map)Preconditions.checkNotNull(map1);
        }
    }

    class MapMultimap.AsMap extends Maps.ImprovedAbstractMap
    {

        final MapMultimap this$0;

        public boolean containsKey(Object obj)
        {
            return map.containsKey(obj);
        }

        protected Set createEntrySet()
        {
            return new MapMultimap.AsMapEntries();
        }

        public volatile Object get(Object obj)
        {
            return get(obj);
        }

        public Collection get(Object obj)
        {
            Set set = MapMultimap.this.get(obj);
            obj = set;
            if (set.isEmpty())
            {
                obj = null;
            }
            return ((Collection) (obj));
        }

        public volatile Object remove(Object obj)
        {
            return remove(obj);
        }

        public Collection remove(Object obj)
        {
            Set set = removeAll(obj);
            obj = set;
            if (set.isEmpty())
            {
                obj = null;
            }
            return ((Collection) (obj));
        }

        MapMultimap.AsMap()
        {
            this$0 = MapMultimap.this;
            super();
        }
    }

    class MapMultimap.AsMapEntries extends AbstractSet
    {

        final MapMultimap this$0;

        public boolean contains(Object obj)
        {
            boolean flag = true;
            if (obj instanceof java.util.Map.Entry)
            {
                if (((java.util.Map.Entry) (obj = (java.util.Map.Entry)obj)).getValue() instanceof Set)
                {
                    Set set = (Set)((java.util.Map.Entry) (obj)).getValue();
                    if (set.size() != 1 || !containsEntry(((java.util.Map.Entry) (obj)).getKey(), set.iterator().next()))
                    {
                        flag = false;
                    }
                    return flag;
                }
            }
            return false;
        }

        public Iterator iterator()
        {
            return new Iterator() {

                final Iterator keys;
                final MapMultimap.AsMapEntries this$1;

                public boolean hasNext()
                {
                    return keys.hasNext();
                }

                public volatile Object next()
                {
                    return next();
                }

                public java.util.Map.Entry next()
                {
                    return ((_cls1) (keys.next())). new AbstractMapEntry() {

                        final MapMultimap.AsMapEntries._cls1 this$2;
                        final Object val$key;

                        public Object getKey()
                        {
                            return key;
                        }

                        public volatile Object getValue()
                        {
                            return getValue();
                        }

                        public Collection getValue()
                        {
                            return get(key);
                        }

            
            {
                this$2 = final__pcls1;
                key = Object.this;
                super();
            }
                    };
                }

                public void remove()
                {
                    keys.remove();
                }

            
            {
                this$1 = MapMultimap.AsMapEntries.this;
                super();
                keys = map.keySet().iterator();
            }
            };
        }

        public boolean remove(Object obj)
        {
            boolean flag = true;
            if (obj instanceof java.util.Map.Entry)
            {
                if (((java.util.Map.Entry) (obj = (java.util.Map.Entry)obj)).getValue() instanceof Set)
                {
                    Set set = (Set)((java.util.Map.Entry) (obj)).getValue();
                    if (set.size() != 1 || !map.entrySet().remove(Maps.immutableEntry(((java.util.Map.Entry) (obj)).getKey(), set.iterator().next())))
                    {
                        flag = false;
                    }
                    return flag;
                }
            }
            return false;
        }

        public int size()
        {
            return map.size();
        }

        MapMultimap.AsMapEntries()
        {
            this$0 = MapMultimap.this;
            super();
        }
    }

    private static final class TransformedEntriesListMultimap extends TransformedEntriesMultimap
        implements ListMultimap
    {

        public volatile Collection get(Object obj)
        {
            return get(obj);
        }

        public List get(Object obj)
        {
            return transform(obj, fromMultimap.get(obj));
        }

        public volatile Collection removeAll(Object obj)
        {
            return removeAll(obj);
        }

        public List removeAll(Object obj)
        {
            return transform(obj, fromMultimap.removeAll(obj));
        }

        public volatile Collection replaceValues(Object obj, Iterable iterable)
        {
            return replaceValues(obj, iterable);
        }

        public List replaceValues(Object obj, Iterable iterable)
        {
            throw new UnsupportedOperationException();
        }

        volatile Collection transform(Object obj, Collection collection)
        {
            return transform(obj, collection);
        }

        List transform(Object obj, Collection collection)
        {
            return Lists.transform((List)collection, ((_cls1) (obj)). new Function() {

                final TransformedEntriesListMultimap this$0;
                final Object val$key;

                public Object apply(Object obj)
                {
                    return transformer.transformEntry(key, obj);
                }

            
            {
                this$0 = final_transformedentrieslistmultimap;
                key = Object.this;
                super();
            }
            });
        }

        TransformedEntriesListMultimap(ListMultimap listmultimap, Maps.EntryTransformer entrytransformer)
        {
            super(listmultimap, entrytransformer);
        }
    }

    private static class TransformedEntriesMultimap
        implements Multimap
    {

        private transient Map asMap;
        private transient Collection entries;
        final Multimap fromMultimap;
        final Maps.EntryTransformer transformer;
        private transient Collection values;

        public Map asMap()
        {
            if (asMap == null)
            {
                Map map = Maps.transformEntries(fromMultimap.asMap(), new Maps.EntryTransformer() {

                    final TransformedEntriesMultimap this$0;

                    public volatile Object transformEntry(Object obj, Object obj1)
                    {
                        return transformEntry(obj, (Collection)obj1);
                    }

                    public Collection transformEntry(Object obj, Collection collection)
                    {
                        return transform(obj, collection);
                    }

            
            {
                this$0 = TransformedEntriesMultimap.this;
                super();
            }
                });
                asMap = map;
                return map;
            } else
            {
                return asMap;
            }
        }

        public void clear()
        {
            fromMultimap.clear();
        }

        public boolean containsEntry(Object obj, Object obj1)
        {
            return get(obj).contains(obj1);
        }

        public boolean containsKey(Object obj)
        {
            return fromMultimap.containsKey(obj);
        }

        public boolean containsValue(Object obj)
        {
            return values().contains(obj);
        }

        public Collection entries()
        {
            if (entries == null)
            {
                TransformedEntries transformedentries = new TransformedEntries(transformer);
                entries = transformedentries;
                return transformedentries;
            } else
            {
                return entries;
            }
        }

        public boolean equals(Object obj)
        {
            if (obj instanceof Multimap)
            {
                obj = (Multimap)obj;
                return asMap().equals(((Multimap) (obj)).asMap());
            } else
            {
                return false;
            }
        }

        public Collection get(Object obj)
        {
            return transform(obj, fromMultimap.get(obj));
        }

        public int hashCode()
        {
            return asMap().hashCode();
        }

        public boolean isEmpty()
        {
            return fromMultimap.isEmpty();
        }

        public Set keySet()
        {
            return fromMultimap.keySet();
        }

        public Multiset keys()
        {
            return fromMultimap.keys();
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
            return get(obj).remove(obj1);
        }

        public Collection removeAll(Object obj)
        {
            return transform(obj, fromMultimap.removeAll(obj));
        }

        public Collection replaceValues(Object obj, Iterable iterable)
        {
            throw new UnsupportedOperationException();
        }

        public int size()
        {
            return fromMultimap.size();
        }

        public String toString()
        {
            return asMap().toString();
        }

        Collection transform(Object obj, Collection collection)
        {
            return Collections2.transform(collection, ((_cls1) (obj)). new Function() {

                final TransformedEntriesMultimap this$0;
                final Object val$key;

                public Object apply(Object obj)
                {
                    return transformer.transformEntry(key, obj);
                }

            
            {
                this$0 = final_transformedentriesmultimap;
                key = Object.this;
                super();
            }
            });
        }

        public Collection values()
        {
            if (values == null)
            {
                Collection collection = Collections2.transform(fromMultimap.entries(), new Function() {

                    final TransformedEntriesMultimap this$0;

                    public volatile Object apply(Object obj)
                    {
                        return apply((java.util.Map.Entry)obj);
                    }

                    public Object apply(java.util.Map.Entry entry)
                    {
                        return transformer.transformEntry(entry.getKey(), entry.getValue());
                    }

            
            {
                this$0 = TransformedEntriesMultimap.this;
                super();
            }
                });
                values = collection;
                return collection;
            } else
            {
                return values;
            }
        }

        TransformedEntriesMultimap(Multimap multimap, Maps.EntryTransformer entrytransformer)
        {
            fromMultimap = (Multimap)Preconditions.checkNotNull(multimap);
            transformer = (Maps.EntryTransformer)Preconditions.checkNotNull(entrytransformer);
        }
    }

    private class TransformedEntriesMultimap.TransformedEntries extends Collections2.TransformedCollection
    {

        final TransformedEntriesMultimap this$0;

        public boolean contains(Object obj)
        {
            if (obj instanceof java.util.Map.Entry)
            {
                obj = (java.util.Map.Entry)obj;
                return containsEntry(((java.util.Map.Entry) (obj)).getKey(), ((java.util.Map.Entry) (obj)).getValue());
            } else
            {
                return false;
            }
        }

        public boolean remove(Object obj)
        {
            if (obj instanceof java.util.Map.Entry)
            {
                obj = (java.util.Map.Entry)obj;
                return get(((java.util.Map.Entry) (obj)).getKey()).remove(((java.util.Map.Entry) (obj)).getValue());
            } else
            {
                return false;
            }
        }

        TransformedEntriesMultimap.TransformedEntries(final Maps.EntryTransformer transformer)
        {
            this.this$0 = TransformedEntriesMultimap.this;
            super(fromMultimap.entries(), new _cls1());
        }
    }

    static class UnmodifiableAsMapEntries extends ForwardingSet
    {

        private final Set _flddelegate;

        public boolean contains(Object obj)
        {
            return Maps.containsEntryImpl(_mthdelegate(), obj);
        }

        public boolean containsAll(Collection collection)
        {
            return standardContainsAll(collection);
        }

        protected volatile Object _mthdelegate()
        {
            return _mthdelegate();
        }

        protected volatile Collection _mthdelegate()
        {
            return _mthdelegate();
        }

        protected Set _mthdelegate()
        {
            return _flddelegate;
        }

        public boolean equals(Object obj)
        {
            return standardEquals(obj);
        }

        public Iterator iterator()
        {
            return _flddelegate.iterator(). new ForwardingIterator() {

                final UnmodifiableAsMapEntries this$0;
                final Iterator val$iterator;

                protected volatile Object _mthdelegate()
                {
                    return _mthdelegate();
                }

                protected Iterator _mthdelegate()
                {
                    return iterator;
                }

                public volatile Object next()
                {
                    return next();
                }

                public java.util.Map.Entry next()
                {
                    return Multimaps.unmodifiableAsMapEntry((java.util.Map.Entry)iterator.next());
                }

            
            {
                this$0 = final_unmodifiableasmapentries;
                iterator = Iterator.this;
                super();
            }
            };
        }

        public Object[] toArray()
        {
            return standardToArray();
        }

        public Object[] toArray(Object aobj[])
        {
            return standardToArray(aobj);
        }

        UnmodifiableAsMapEntries(Set set)
        {
            _flddelegate = set;
        }
    }

    private static class UnmodifiableAsMapValues extends ForwardingCollection
    {

        final Collection _flddelegate;

        public boolean contains(Object obj)
        {
            return standardContains(obj);
        }

        public boolean containsAll(Collection collection)
        {
            return standardContainsAll(collection);
        }

        protected volatile Object _mthdelegate()
        {
            return _mthdelegate();
        }

        protected Collection _mthdelegate()
        {
            return _flddelegate;
        }

        public Iterator iterator()
        {
            return _flddelegate.iterator(). new Iterator() {

                final UnmodifiableAsMapValues this$0;
                final Iterator val$iterator;

                public boolean hasNext()
                {
                    return iterator.hasNext();
                }

                public volatile Object next()
                {
                    return next();
                }

                public Collection next()
                {
                    return Multimaps.unmodifiableValueCollection((Collection)iterator.next());
                }

                public void remove()
                {
                    throw new UnsupportedOperationException();
                }

            
            {
                this$0 = final_unmodifiableasmapvalues;
                iterator = Iterator.this;
                super();
            }
            };
        }

        public Object[] toArray()
        {
            return standardToArray();
        }

        public Object[] toArray(Object aobj[])
        {
            return standardToArray(aobj);
        }

        UnmodifiableAsMapValues(Collection collection)
        {
            _flddelegate = Collections.unmodifiableCollection(collection);
        }
    }

    private static class UnmodifiableListMultimap extends UnmodifiableMultimap
        implements ListMultimap
    {

        private static final long serialVersionUID = 0L;

        public ListMultimap _mthdelegate()
        {
            return (ListMultimap)super._mthdelegate();
        }

        public volatile Multimap _mthdelegate()
        {
            return _mthdelegate();
        }

        public volatile Object _mthdelegate()
        {
            return _mthdelegate();
        }

        public volatile Collection get(Object obj)
        {
            return get(obj);
        }

        public List get(Object obj)
        {
            return Collections.unmodifiableList(_mthdelegate().get(obj));
        }

        public volatile Collection removeAll(Object obj)
        {
            return removeAll(obj);
        }

        public List removeAll(Object obj)
        {
            throw new UnsupportedOperationException();
        }

        public volatile Collection replaceValues(Object obj, Iterable iterable)
        {
            return replaceValues(obj, iterable);
        }

        public List replaceValues(Object obj, Iterable iterable)
        {
            throw new UnsupportedOperationException();
        }

        UnmodifiableListMultimap(ListMultimap listmultimap)
        {
            super(listmultimap);
        }
    }

    private static class UnmodifiableMultimap extends ForwardingMultimap
        implements Serializable
    {

        private static final long serialVersionUID = 0L;
        final Multimap _flddelegate;
        transient Collection entries;
        transient Set keySet;
        transient Multiset keys;
        transient Map map;
        transient Collection values;

        public Map asMap()
        {
            Map map1 = map;
            Object obj = map1;
            if (map1 == null)
            {
                obj = Collections.unmodifiableMap(_flddelegate.asMap()). new ForwardingMap() {

                    Collection asMapValues;
                    Set entrySet;
                    final UnmodifiableMultimap this$0;
                    final Map val$unmodifiableMap;

                    public boolean containsValue(Object obj)
                    {
                        return values().contains(obj);
                    }

                    protected volatile Object _mthdelegate()
                    {
                        return _mthdelegate();
                    }

                    protected Map _mthdelegate()
                    {
                        return unmodifiableMap;
                    }

                    public Set entrySet()
                    {
                        Set set1 = entrySet;
                        Set set = set1;
                        if (set1 == null)
                        {
                            set = Multimaps.unmodifiableAsMapEntries(unmodifiableMap.entrySet());
                            entrySet = set;
                        }
                        return set;
                    }

                    public volatile Object get(Object obj)
                    {
                        return get(obj);
                    }

                    public Collection get(Object obj)
                    {
                        obj = (Collection)unmodifiableMap.get(obj);
                        if (obj == null)
                        {
                            return null;
                        } else
                        {
                            return Multimaps.unmodifiableValueCollection(((Collection) (obj)));
                        }
                    }

                    public Collection values()
                    {
                        Collection collection = asMapValues;
                        Object obj = collection;
                        if (collection == null)
                        {
                            obj = new UnmodifiableAsMapValues(unmodifiableMap.values());
                            asMapValues = ((Collection) (obj));
                        }
                        return ((Collection) (obj));
                    }

            
            {
                this$0 = final_unmodifiablemultimap;
                unmodifiableMap = Map.this;
                super();
            }
                };
                map = ((Map) (obj));
            }
            return ((Map) (obj));
        }

        public void clear()
        {
            throw new UnsupportedOperationException();
        }

        protected Multimap _mthdelegate()
        {
            return _flddelegate;
        }

        protected volatile Object _mthdelegate()
        {
            return _mthdelegate();
        }

        public Collection entries()
        {
            Collection collection1 = entries;
            Collection collection = collection1;
            if (collection1 == null)
            {
                collection = Multimaps.unmodifiableEntries(_flddelegate.entries());
                entries = collection;
            }
            return collection;
        }

        public Collection get(Object obj)
        {
            return Multimaps.unmodifiableValueCollection(_flddelegate.get(obj));
        }

        public Set keySet()
        {
            Set set1 = keySet;
            Set set = set1;
            if (set1 == null)
            {
                set = Collections.unmodifiableSet(_flddelegate.keySet());
                keySet = set;
            }
            return set;
        }

        public Multiset keys()
        {
            Multiset multiset1 = keys;
            Multiset multiset = multiset1;
            if (multiset1 == null)
            {
                multiset = Multisets.unmodifiableMultiset(_flddelegate.keys());
                keys = multiset;
            }
            return multiset;
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

        public Collection removeAll(Object obj)
        {
            throw new UnsupportedOperationException();
        }

        public Collection replaceValues(Object obj, Iterable iterable)
        {
            throw new UnsupportedOperationException();
        }

        public Collection values()
        {
            Collection collection1 = values;
            Collection collection = collection1;
            if (collection1 == null)
            {
                collection = Collections.unmodifiableCollection(_flddelegate.values());
                values = collection;
            }
            return collection;
        }

        UnmodifiableMultimap(Multimap multimap)
        {
            _flddelegate = (Multimap)Preconditions.checkNotNull(multimap);
        }
    }

    private static class UnmodifiableSetMultimap extends UnmodifiableMultimap
        implements SetMultimap
    {

        private static final long serialVersionUID = 0L;

        public volatile Multimap _mthdelegate()
        {
            return _mthdelegate();
        }

        public SetMultimap _mthdelegate()
        {
            return (SetMultimap)super._mthdelegate();
        }

        public volatile Object _mthdelegate()
        {
            return _mthdelegate();
        }

        public volatile Collection entries()
        {
            return entries();
        }

        public Set entries()
        {
            return Maps.unmodifiableEntrySet(_mthdelegate().entries());
        }

        public volatile Collection get(Object obj)
        {
            return get(obj);
        }

        public Set get(Object obj)
        {
            return Collections.unmodifiableSet(_mthdelegate().get(obj));
        }

        public volatile Collection removeAll(Object obj)
        {
            return removeAll(obj);
        }

        public Set removeAll(Object obj)
        {
            throw new UnsupportedOperationException();
        }

        public volatile Collection replaceValues(Object obj, Iterable iterable)
        {
            return replaceValues(obj, iterable);
        }

        public Set replaceValues(Object obj, Iterable iterable)
        {
            throw new UnsupportedOperationException();
        }

        UnmodifiableSetMultimap(SetMultimap setmultimap)
        {
            super(setmultimap);
        }
    }

    private static class UnmodifiableSortedSetMultimap extends UnmodifiableSetMultimap
        implements SortedSetMultimap
    {

        private static final long serialVersionUID = 0L;

        public volatile Multimap _mthdelegate()
        {
            return _mthdelegate();
        }

        public volatile SetMultimap _mthdelegate()
        {
            return _mthdelegate();
        }

        public SortedSetMultimap _mthdelegate()
        {
            return (SortedSetMultimap)super._mthdelegate();
        }

        public volatile Object _mthdelegate()
        {
            return _mthdelegate();
        }

        public volatile Collection get(Object obj)
        {
            return get(obj);
        }

        public volatile Set get(Object obj)
        {
            return get(obj);
        }

        public SortedSet get(Object obj)
        {
            return Collections.unmodifiableSortedSet(_mthdelegate().get(obj));
        }

        public volatile Collection removeAll(Object obj)
        {
            return removeAll(obj);
        }

        public volatile Set removeAll(Object obj)
        {
            return removeAll(obj);
        }

        public SortedSet removeAll(Object obj)
        {
            throw new UnsupportedOperationException();
        }

        public volatile Collection replaceValues(Object obj, Iterable iterable)
        {
            return replaceValues(obj, iterable);
        }

        public volatile Set replaceValues(Object obj, Iterable iterable)
        {
            return replaceValues(obj, iterable);
        }

        public SortedSet replaceValues(Object obj, Iterable iterable)
        {
            throw new UnsupportedOperationException();
        }

        public Comparator valueComparator()
        {
            return _mthdelegate().valueComparator();
        }

        UnmodifiableSortedSetMultimap(SortedSetMultimap sortedsetmultimap)
        {
            super(sortedsetmultimap);
        }
    }


    private Multimaps()
    {
    }

    public static SetMultimap forMap(Map map)
    {
        return new MapMultimap(map);
    }

    public static ImmutableListMultimap index(Iterable iterable, Function function)
    {
        Preconditions.checkNotNull(function);
        ImmutableListMultimap.Builder builder = ImmutableListMultimap.builder();
        Object obj;
        for (Iterator iterator = iterable.iterator(); iterator.hasNext(); builder.put(function.apply(obj), obj))
        {
            obj = iterator.next();
            Preconditions.checkNotNull(obj, iterable);
        }

        return builder.build();
    }

    public static Multimap invertFrom(Multimap multimap, Multimap multimap1)
    {
        Preconditions.checkNotNull(multimap1);
        java.util.Map.Entry entry;
        for (multimap = multimap.entries().iterator(); multimap.hasNext(); multimap1.put(entry.getValue(), entry.getKey()))
        {
            entry = (java.util.Map.Entry)multimap.next();
        }

        return multimap1;
    }

    public static ListMultimap newListMultimap(Map map, Supplier supplier)
    {
        return new CustomListMultimap(map, supplier);
    }

    public static Multimap newMultimap(Map map, Supplier supplier)
    {
        return new CustomMultimap(map, supplier);
    }

    public static SetMultimap newSetMultimap(Map map, Supplier supplier)
    {
        return new CustomSetMultimap(map, supplier);
    }

    public static SortedSetMultimap newSortedSetMultimap(Map map, Supplier supplier)
    {
        return new CustomSortedSetMultimap(map, supplier);
    }

    public static ListMultimap synchronizedListMultimap(ListMultimap listmultimap)
    {
        return Synchronized.listMultimap(listmultimap, null);
    }

    public static Multimap synchronizedMultimap(Multimap multimap)
    {
        return Synchronized.multimap(multimap, null);
    }

    public static SetMultimap synchronizedSetMultimap(SetMultimap setmultimap)
    {
        return Synchronized.setMultimap(setmultimap, null);
    }

    public static SortedSetMultimap synchronizedSortedSetMultimap(SortedSetMultimap sortedsetmultimap)
    {
        return Synchronized.sortedSetMultimap(sortedsetmultimap, null);
    }

    public static ListMultimap transformEntries(ListMultimap listmultimap, Maps.EntryTransformer entrytransformer)
    {
        return new TransformedEntriesListMultimap(listmultimap, entrytransformer);
    }

    public static Multimap transformEntries(Multimap multimap, Maps.EntryTransformer entrytransformer)
    {
        return new TransformedEntriesMultimap(multimap, entrytransformer);
    }

    public static ListMultimap transformValues(ListMultimap listmultimap, Function function)
    {
        Preconditions.checkNotNull(function);
        return transformEntries(listmultimap, new Maps.EntryTransformer(function) {

            final Function val$function;

            public Object transformEntry(Object obj, Object obj1)
            {
                return function.apply(obj1);
            }

            
            {
                function = function1;
                super();
            }
        });
    }

    public static Multimap transformValues(Multimap multimap, Function function)
    {
        Preconditions.checkNotNull(function);
        return transformEntries(multimap, new Maps.EntryTransformer(function) {

            final Function val$function;

            public Object transformEntry(Object obj, Object obj1)
            {
                return function.apply(obj1);
            }

            
            {
                function = function1;
                super();
            }
        });
    }

    private static Set unmodifiableAsMapEntries(Set set)
    {
        return new UnmodifiableAsMapEntries(Collections.unmodifiableSet(set));
    }

    private static java.util.Map.Entry unmodifiableAsMapEntry(java.util.Map.Entry entry)
    {
        Preconditions.checkNotNull(entry);
        return new AbstractMapEntry(entry) {

            final java.util.Map.Entry val$entry;

            public Object getKey()
            {
                return entry.getKey();
            }

            public volatile Object getValue()
            {
                return getValue();
            }

            public Collection getValue()
            {
                return Multimaps.unmodifiableValueCollection((Collection)entry.getValue());
            }

            
            {
                entry = entry1;
                super();
            }
        };
    }

    private static Collection unmodifiableEntries(Collection collection)
    {
        if (collection instanceof Set)
        {
            return Maps.unmodifiableEntrySet((Set)collection);
        } else
        {
            return new Maps.UnmodifiableEntries(Collections.unmodifiableCollection(collection));
        }
    }

    public static ListMultimap unmodifiableListMultimap(ListMultimap listmultimap)
    {
        return new UnmodifiableListMultimap(listmultimap);
    }

    public static Multimap unmodifiableMultimap(Multimap multimap)
    {
        return new UnmodifiableMultimap(multimap);
    }

    public static SetMultimap unmodifiableSetMultimap(SetMultimap setmultimap)
    {
        return new UnmodifiableSetMultimap(setmultimap);
    }

    public static SortedSetMultimap unmodifiableSortedSetMultimap(SortedSetMultimap sortedsetmultimap)
    {
        return new UnmodifiableSortedSetMultimap(sortedsetmultimap);
    }

    private static Collection unmodifiableValueCollection(Collection collection)
    {
        if (collection instanceof SortedSet)
        {
            return Collections.unmodifiableSortedSet((SortedSet)collection);
        }
        if (collection instanceof Set)
        {
            return Collections.unmodifiableSet((Set)collection);
        }
        if (collection instanceof List)
        {
            return Collections.unmodifiableList((List)collection);
        } else
        {
            return Collections.unmodifiableCollection(collection);
        }
    }





    // Unreferenced inner class com/google/common/collect/Multimaps$TransformedEntriesMultimap$TransformedEntries$1

/* anonymous class */
    class TransformedEntriesMultimap.TransformedEntries._cls1
        implements Function
    {

        final TransformedEntriesMultimap val$this$0;
        final Maps.EntryTransformer val$transformer;

        public volatile Object apply(Object obj)
        {
            return apply((java.util.Map.Entry)obj);
        }

        public java.util.Map.Entry apply(java.util.Map.Entry entry)
        {
            return entry. new AbstractMapEntry() {

                final TransformedEntriesMultimap.TransformedEntries._cls1 this$2;
                final java.util.Map.Entry val$entry;

                public Object getKey()
                {
                    return entry.getKey();
                }

                public Object getValue()
                {
    class TransformedEntriesMultimap.TransformedEntries._cls1
        implements Function
    {
                    return transformer.transformEntry(entry.getKey(), entry.getValue());
                }

            
            {
                this$2 = final__pcls1;
                entry = java.util.Map.Entry.this;
                super();
            }
            };
        }

            
            {
                this$0 = transformedentriesmultimap;
                transformer = entrytransformer;
                super();
            }
    }

}
