// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Function;
import com.google.common.base.Joiner;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.base.Supplier;
import com.google.common.primitives.Ints;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.EnumMap;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentMap;

// Referenced classes of package com.google.common.collect:
//            Collections2, ImmutableMap, Sets, ImmutableEntry, 
//            MapMaker, Synchronized, MapDifference, BiMap, 
//            Lists, UnmodifiableIterator, ForwardingSet, ForwardingCollection, 
//            ForwardingMapEntry, AbstractMapEntry, ForwardingMap, ForwardingIterator

public final class Maps
{
    private static abstract class AbstractFilteredMap extends AbstractMap
    {

        final Predicate predicate;
        final Map unfiltered;
        Collection values;

        boolean apply(Object obj, Object obj1)
        {
            return predicate.apply(Maps.immutableEntry(obj, obj1));
        }

        public boolean containsKey(Object obj)
        {
            return unfiltered.containsKey(obj) && apply(obj, unfiltered.get(obj));
        }

        public Object get(Object obj)
        {
            Object obj1 = unfiltered.get(obj);
            if (obj1 != null && apply(obj, obj1))
            {
                return obj1;
            } else
            {
                return null;
            }
        }

        public boolean isEmpty()
        {
            return entrySet().isEmpty();
        }

        public Object put(Object obj, Object obj1)
        {
            Preconditions.checkArgument(apply(obj, obj1));
            return unfiltered.put(obj, obj1);
        }

        public void putAll(Map map)
        {
            java.util.Map.Entry entry;
            for (Iterator iterator = map.entrySet().iterator(); iterator.hasNext(); Preconditions.checkArgument(apply(entry.getKey(), entry.getValue())))
            {
                entry = (java.util.Map.Entry)iterator.next();
            }

            unfiltered.putAll(map);
        }

        public Object remove(Object obj)
        {
            if (containsKey(obj))
            {
                return unfiltered.remove(obj);
            } else
            {
                return null;
            }
        }

        public Collection values()
        {
            Collection collection = values;
            Object obj = collection;
            if (collection == null)
            {
                obj = new Values();
                values = ((Collection) (obj));
            }
            return ((Collection) (obj));
        }

        AbstractFilteredMap(Map map, Predicate predicate1)
        {
            unfiltered = map;
            predicate = predicate1;
        }
    }

    class AbstractFilteredMap.Values extends AbstractCollection
    {

        final AbstractFilteredMap this$0;

        public void clear()
        {
            entrySet().clear();
        }

        public boolean isEmpty()
        {
            return entrySet().isEmpty();
        }

        public Iterator iterator()
        {
            return entrySet().iterator(). new UnmodifiableIterator() {

                final AbstractFilteredMap.Values this$1;
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
                this$1 = final_values;
                entryIterator = Iterator.this;
                super();
            }
            };
        }

        public boolean remove(Object obj)
        {
            for (Iterator iterator1 = unfiltered.entrySet().iterator(); iterator1.hasNext();)
            {
                java.util.Map.Entry entry = (java.util.Map.Entry)iterator1.next();
                if (Objects.equal(obj, entry.getValue()) && predicate.apply(entry))
                {
                    iterator1.remove();
                    return true;
                }
            }

            return false;
        }

        public boolean removeAll(Collection collection)
        {
            Preconditions.checkNotNull(collection);
            boolean flag = false;
            Iterator iterator1 = unfiltered.entrySet().iterator();
            do
            {
                if (!iterator1.hasNext())
                {
                    break;
                }
                java.util.Map.Entry entry = (java.util.Map.Entry)iterator1.next();
                if (collection.contains(entry.getValue()) && predicate.apply(entry))
                {
                    iterator1.remove();
                    flag = true;
                }
            } while (true);
            return flag;
        }

        public boolean retainAll(Collection collection)
        {
            Preconditions.checkNotNull(collection);
            boolean flag = false;
            Iterator iterator1 = unfiltered.entrySet().iterator();
            do
            {
                if (!iterator1.hasNext())
                {
                    break;
                }
                java.util.Map.Entry entry = (java.util.Map.Entry)iterator1.next();
                if (!collection.contains(entry.getValue()) && predicate.apply(entry))
                {
                    iterator1.remove();
                    flag = true;
                }
            } while (true);
            return flag;
        }

        public int size()
        {
            return entrySet().size();
        }

        public Object[] toArray()
        {
            return Lists.newArrayList(iterator()).toArray();
        }

        public Object[] toArray(Object aobj[])
        {
            return Lists.newArrayList(iterator()).toArray(aobj);
        }

        AbstractFilteredMap.Values()
        {
            this$0 = AbstractFilteredMap.this;
            super();
        }
    }

    private static final class AbstractMapWrapper extends ImprovedAbstractMap
    {

        private final Map map;

        public void clear()
        {
            map.clear();
        }

        public boolean containsKey(Object obj)
        {
            return map.containsKey(obj);
        }

        public boolean containsValue(Object obj)
        {
            return map.containsValue(obj);
        }

        protected Set createEntrySet()
        {
            return map.entrySet();
        }

        public boolean isEmpty()
        {
            return map.isEmpty();
        }

        public Object remove(Object obj)
        {
            return map.remove(obj);
        }

        public int size()
        {
            return map.size();
        }

        AbstractMapWrapper(Map map1)
        {
            map = (Map)Preconditions.checkNotNull(map1);
        }
    }

    private static class EntrySetImpl extends AbstractSet
    {

        private final Supplier entryIteratorSupplier;
        private final Map map;

        public void clear()
        {
            map.clear();
        }

        public boolean contains(Object obj)
        {
            if (obj instanceof java.util.Map.Entry)
            {
                obj = (java.util.Map.Entry)obj;
                Object obj1 = ((java.util.Map.Entry) (obj)).getKey();
                if (map.containsKey(obj1))
                {
                    return Objects.equal(map.get(((java.util.Map.Entry) (obj)).getKey()), ((java.util.Map.Entry) (obj)).getValue());
                }
            }
            return false;
        }

        public int hashCode()
        {
            return map.hashCode();
        }

        public boolean isEmpty()
        {
            return map.isEmpty();
        }

        public Iterator iterator()
        {
            return (Iterator)entryIteratorSupplier.get();
        }

        public boolean remove(Object obj)
        {
            if (contains(obj))
            {
                obj = (java.util.Map.Entry)obj;
                map.remove(((java.util.Map.Entry) (obj)).getKey());
                return true;
            } else
            {
                return false;
            }
        }

        public int size()
        {
            return map.size();
        }

        EntrySetImpl(Map map1, Supplier supplier)
        {
            map = (Map)Preconditions.checkNotNull(map1);
            entryIteratorSupplier = (Supplier)Preconditions.checkNotNull(supplier);
        }
    }

    public static interface EntryTransformer
    {

        public abstract Object transformEntry(Object obj, Object obj1);
    }

    static class FilteredEntryMap extends AbstractFilteredMap
    {

        Set entrySet;
        final Set filteredEntrySet;
        Set keySet;

        public Set entrySet()
        {
            Set set = entrySet;
            Object obj = set;
            if (set == null)
            {
                obj = new EntrySet();
                entrySet = ((Set) (obj));
            }
            return ((Set) (obj));
        }

        public Set keySet()
        {
            Set set = keySet;
            Object obj = set;
            if (set == null)
            {
                obj = new KeySet();
                keySet = ((Set) (obj));
            }
            return ((Set) (obj));
        }

        FilteredEntryMap(Map map, Predicate predicate)
        {
            super(map, predicate);
            filteredEntrySet = Sets.filter(map.entrySet(), this.predicate);
        }
    }

    private class FilteredEntryMap.EntrySet extends ForwardingSet
    {

        final FilteredEntryMap this$0;

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
            return filteredEntrySet;
        }

        public Iterator iterator()
        {
            return filteredEntrySet.iterator(). new UnmodifiableIterator() {

                final FilteredEntryMap.EntrySet this$1;
                final Iterator val$iterator;

                public boolean hasNext()
                {
                    return iterator.hasNext();
                }

                public volatile Object next()
                {
                    return next();
                }

                public java.util.Map.Entry next()
                {
                    return ((java.util.Map.Entry)iterator.next()). new ForwardingMapEntry() {

                        final FilteredEntryMap.EntrySet._cls1 this$2;
                        final java.util.Map.Entry val$entry;

                        protected volatile Object _mthdelegate()
                        {
                            return _mthdelegate();
                        }

                        protected java.util.Map.Entry _mthdelegate()
                        {
                            return entry;
                        }

                        public Object setValue(Object obj)
                        {
                            Preconditions.checkArgument(apply(entry.getKey(), obj));
                            return super.setValue(obj);
                        }

            
            {
                this$2 = final__pcls1;
                entry = java.util.Map.Entry.this;
                super();
            }
                    };
                }

            
            {
                this$1 = final_entryset;
                iterator = Iterator.this;
                super();
            }
            };
        }

        private FilteredEntryMap.EntrySet()
        {
            this$0 = FilteredEntryMap.this;
            super();
        }

    }

    private class FilteredEntryMap.KeySet extends AbstractSet
    {

        final FilteredEntryMap this$0;

        public void clear()
        {
            filteredEntrySet.clear();
        }

        public boolean contains(Object obj)
        {
            return containsKey(obj);
        }

        public Iterator iterator()
        {
            return filteredEntrySet.iterator(). new UnmodifiableIterator() {

                final FilteredEntryMap.KeySet this$1;
                final Iterator val$iterator;

                public boolean hasNext()
                {
                    return iterator.hasNext();
                }

                public Object next()
                {
                    return ((java.util.Map.Entry)iterator.next()).getKey();
                }

            
            {
                this$1 = final_keyset;
                iterator = Iterator.this;
                super();
            }
            };
        }

        public boolean remove(Object obj)
        {
            if (containsKey(obj))
            {
                unfiltered.remove(obj);
                return true;
            } else
            {
                return false;
            }
        }

        public boolean removeAll(Collection collection)
        {
            Preconditions.checkNotNull(collection);
            boolean flag = false;
            for (collection = collection.iterator(); collection.hasNext();)
            {
                flag |= remove(collection.next());
            }

            return flag;
        }

        public boolean retainAll(Collection collection)
        {
            Preconditions.checkNotNull(collection);
            boolean flag = false;
            Iterator iterator1 = unfiltered.entrySet().iterator();
            do
            {
                if (!iterator1.hasNext())
                {
                    break;
                }
                java.util.Map.Entry entry = (java.util.Map.Entry)iterator1.next();
                if (!collection.contains(entry.getKey()) && predicate.apply(entry))
                {
                    iterator1.remove();
                    flag = true;
                }
            } while (true);
            return flag;
        }

        public int size()
        {
            return filteredEntrySet.size();
        }

        public Object[] toArray()
        {
            return Lists.newArrayList(iterator()).toArray();
        }

        public Object[] toArray(Object aobj[])
        {
            return Lists.newArrayList(iterator()).toArray(aobj);
        }

        private FilteredEntryMap.KeySet()
        {
            this$0 = FilteredEntryMap.this;
            super();
        }

    }

    private static class FilteredKeyMap extends AbstractFilteredMap
    {

        Set entrySet;
        Predicate keyPredicate;
        Set keySet;

        public boolean containsKey(Object obj)
        {
            return unfiltered.containsKey(obj) && keyPredicate.apply(obj);
        }

        public Set entrySet()
        {
            Set set1 = entrySet;
            Set set = set1;
            if (set1 == null)
            {
                set = Sets.filter(unfiltered.entrySet(), predicate);
                entrySet = set;
            }
            return set;
        }

        public Set keySet()
        {
            Set set1 = keySet;
            Set set = set1;
            if (set1 == null)
            {
                set = Sets.filter(unfiltered.keySet(), keyPredicate);
                keySet = set;
            }
            return set;
        }

        FilteredKeyMap(Map map, Predicate predicate, Predicate predicate1)
        {
            super(map, predicate1);
            keyPredicate = predicate;
        }
    }

    static abstract class ImprovedAbstractMap extends AbstractMap
    {

        private Set entrySet;
        private Set keySet;
        private Collection values;

        protected abstract Set createEntrySet();

        public Set entrySet()
        {
            Set set1 = entrySet;
            Set set = set1;
            if (set1 == null)
            {
                set = createEntrySet();
                entrySet = set;
            }
            return set;
        }

        public boolean isEmpty()
        {
            return entrySet().isEmpty();
        }

        public Set keySet()
        {
            Set set = keySet;
            Object obj = set;
            if (set == null)
            {
                obj = super.keySet(). new ForwardingSet() {

                    final ImprovedAbstractMap this$0;
                    final Set val$delegate;

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
                        return delegate;
                    }

                    public boolean isEmpty()
                    {
                        return ImprovedAbstractMap.this.isEmpty();
                    }

                    public boolean remove(Object obj)
                    {
                        if (contains(obj))
                        {
                            ImprovedAbstractMap.this.remove(obj);
                            return true;
                        } else
                        {
                            return false;
                        }
                    }

            
            {
                this$0 = final_improvedabstractmap;
                delegate = Set.this;
                super();
            }
                };
                keySet = ((Set) (obj));
            }
            return ((Set) (obj));
        }

        public Collection values()
        {
            Collection collection = values;
            Object obj = collection;
            if (collection == null)
            {
                obj = super.values(). new ForwardingCollection() {

                    final ImprovedAbstractMap this$0;
                    final Collection val$delegate;

                    protected volatile Object _mthdelegate()
                    {
                        return _mthdelegate();
                    }

                    protected Collection _mthdelegate()
                    {
                        return delegate;
                    }

                    public boolean isEmpty()
                    {
                        return ImprovedAbstractMap.this.isEmpty();
                    }

            
            {
                this$0 = final_improvedabstractmap;
                delegate = Collection.this;
                super();
            }
                };
                values = ((Collection) (obj));
            }
            return ((Collection) (obj));
        }

        ImprovedAbstractMap()
        {
        }
    }

    static class MapDifferenceImpl
        implements MapDifference
    {

        final boolean areEqual;
        final Map differences;
        final Map onBoth;
        final Map onlyOnLeft;
        final Map onlyOnRight;

        public boolean areEqual()
        {
            return areEqual;
        }

        public Map entriesDiffering()
        {
            return differences;
        }

        public Map entriesInCommon()
        {
            return onBoth;
        }

        public Map entriesOnlyOnLeft()
        {
            return onlyOnLeft;
        }

        public Map entriesOnlyOnRight()
        {
            return onlyOnRight;
        }

        public boolean equals(Object obj)
        {
            if (obj != this)
            {
                if (obj instanceof MapDifference)
                {
                    if (!entriesOnlyOnLeft().equals(((MapDifference) (obj = (MapDifference)obj)).entriesOnlyOnLeft()) || !entriesOnlyOnRight().equals(((MapDifference) (obj)).entriesOnlyOnRight()) || !entriesInCommon().equals(((MapDifference) (obj)).entriesInCommon()) || !entriesDiffering().equals(((MapDifference) (obj)).entriesDiffering()))
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

        public int hashCode()
        {
            return Objects.hashCode(new Object[] {
                entriesOnlyOnLeft(), entriesOnlyOnRight(), entriesInCommon(), entriesDiffering()
            });
        }

        public String toString()
        {
            if (areEqual)
            {
                return "equal";
            }
            StringBuilder stringbuilder = new StringBuilder("not equal");
            if (!onlyOnLeft.isEmpty())
            {
                stringbuilder.append(": only on left=").append(onlyOnLeft);
            }
            if (!onlyOnRight.isEmpty())
            {
                stringbuilder.append(": only on right=").append(onlyOnRight);
            }
            if (!differences.isEmpty())
            {
                stringbuilder.append(": value differences=").append(differences);
            }
            return stringbuilder.toString();
        }

        MapDifferenceImpl(boolean flag, Map map, Map map1, Map map2, Map map3)
        {
            areEqual = flag;
            onlyOnLeft = map;
            onlyOnRight = map1;
            onBoth = map2;
            differences = map3;
        }
    }

    static class TransformedEntriesMap extends AbstractMap
    {

        EntrySet entrySet;
        final Map fromMap;
        final EntryTransformer transformer;

        public void clear()
        {
            fromMap.clear();
        }

        public boolean containsKey(Object obj)
        {
            return fromMap.containsKey(obj);
        }

        public Set entrySet()
        {
            EntrySet entryset1 = entrySet;
            EntrySet entryset = entryset1;
            if (entryset1 == null)
            {
                entryset = new EntrySet();
                entrySet = entryset;
            }
            return entryset;
        }

        public Object get(Object obj)
        {
            Object obj1 = fromMap.get(obj);
            if (obj1 != null || fromMap.containsKey(obj))
            {
                return transformer.transformEntry(obj, obj1);
            } else
            {
                return null;
            }
        }

        public Object remove(Object obj)
        {
            if (fromMap.containsKey(obj))
            {
                return transformer.transformEntry(obj, fromMap.remove(obj));
            } else
            {
                return null;
            }
        }

        public int size()
        {
            return fromMap.size();
        }

        TransformedEntriesMap(Map map, EntryTransformer entrytransformer)
        {
            fromMap = (Map)Preconditions.checkNotNull(map);
            transformer = (EntryTransformer)Preconditions.checkNotNull(entrytransformer);
        }
    }

    class TransformedEntriesMap.EntrySet extends AbstractSet
    {

        final TransformedEntriesMap this$0;

        public void clear()
        {
            fromMap.clear();
        }

        public boolean contains(Object obj)
        {
            if (obj instanceof java.util.Map.Entry)
            {
                Object obj1 = (java.util.Map.Entry)obj;
                obj = ((java.util.Map.Entry) (obj1)).getKey();
                obj1 = ((java.util.Map.Entry) (obj1)).getValue();
                Object obj2 = get(obj);
                if (obj2 != null)
                {
                    return obj2.equals(obj1);
                }
                if (obj1 == null && containsKey(obj))
                {
                    return true;
                }
            }
            return false;
        }

        public Iterator iterator()
        {
            return fromMap.entrySet().iterator(). new Iterator() {

                final TransformedEntriesMap.EntrySet this$1;
                final Iterator val$mapIterator;

                public boolean hasNext()
                {
                    return mapIterator.hasNext();
                }

                public volatile Object next()
                {
                    return next();
                }

                public java.util.Map.Entry next()
                {
                    return ((java.util.Map.Entry)mapIterator.next()). new AbstractMapEntry() {

                        final TransformedEntriesMap.EntrySet._cls1 this$2;
                        final java.util.Map.Entry val$entry;

                        public Object getKey()
                        {
                            return entry.getKey();
                        }

                        public Object getValue()
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

                public void remove()
                {
                    mapIterator.remove();
                }

            
            {
                this$1 = final_entryset;
                mapIterator = Iterator.this;
                super();
            }
            };
        }

        public boolean remove(Object obj)
        {
            if (contains(obj))
            {
                obj = ((java.util.Map.Entry)obj).getKey();
                fromMap.remove(obj);
                return true;
            } else
            {
                return false;
            }
        }

        public int size()
        {
            return TransformedEntriesMap.this.size();
        }

        TransformedEntriesMap.EntrySet()
        {
            this$0 = TransformedEntriesMap.this;
            super();
        }
    }

    private static class UnmodifiableBiMap extends ForwardingMap
        implements BiMap, Serializable
    {

        private static final long serialVersionUID = 0L;
        final BiMap _flddelegate;
        transient BiMap inverse;
        final Map unmodifiableMap;
        transient Set values;

        protected volatile Object _mthdelegate()
        {
            return _mthdelegate();
        }

        protected Map _mthdelegate()
        {
            return unmodifiableMap;
        }

        public Object forcePut(Object obj, Object obj1)
        {
            throw new UnsupportedOperationException();
        }

        public BiMap inverse()
        {
            BiMap bimap = inverse;
            Object obj = bimap;
            if (bimap == null)
            {
                obj = new UnmodifiableBiMap(_flddelegate.inverse(), this);
                inverse = ((BiMap) (obj));
            }
            return ((BiMap) (obj));
        }

        public volatile Collection values()
        {
            return values();
        }

        public Set values()
        {
            Set set1 = values;
            Set set = set1;
            if (set1 == null)
            {
                set = Collections.unmodifiableSet(_flddelegate.values());
                values = set;
            }
            return set;
        }

        UnmodifiableBiMap(BiMap bimap, BiMap bimap1)
        {
            unmodifiableMap = Collections.unmodifiableMap(bimap);
            _flddelegate = bimap;
            inverse = bimap1;
        }
    }

    static class UnmodifiableEntries extends ForwardingCollection
    {

        private final Collection entries;

        public volatile boolean add(Object obj)
        {
            return add((java.util.Map.Entry)obj);
        }

        public boolean add(java.util.Map.Entry entry)
        {
            throw new UnsupportedOperationException();
        }

        public boolean addAll(Collection collection)
        {
            throw new UnsupportedOperationException();
        }

        public void clear()
        {
            throw new UnsupportedOperationException();
        }

        protected volatile Object _mthdelegate()
        {
            return _mthdelegate();
        }

        protected Collection _mthdelegate()
        {
            return entries;
        }

        public Iterator iterator()
        {
            return super.iterator(). new ForwardingIterator() {

                final UnmodifiableEntries this$0;
                final Iterator val$delegate;

                protected volatile Object _mthdelegate()
                {
                    return _mthdelegate();
                }

                protected Iterator _mthdelegate()
                {
                    return delegate;
                }

                public volatile Object next()
                {
                    return next();
                }

                public java.util.Map.Entry next()
                {
                    return Maps.unmodifiableEntry((java.util.Map.Entry)super.next());
                }

                public void remove()
                {
                    throw new UnsupportedOperationException();
                }

            
            {
                this$0 = final_unmodifiableentries;
                delegate = Iterator.this;
                super();
            }
            };
        }

        public boolean remove(Object obj)
        {
            throw new UnsupportedOperationException();
        }

        public boolean removeAll(Collection collection)
        {
            throw new UnsupportedOperationException();
        }

        public boolean retainAll(Collection collection)
        {
            throw new UnsupportedOperationException();
        }

        public Object[] toArray()
        {
            return standardToArray();
        }

        public Object[] toArray(Object aobj[])
        {
            return standardToArray(aobj);
        }

        UnmodifiableEntries(Collection collection)
        {
            entries = collection;
        }
    }

    static class UnmodifiableEntrySet extends UnmodifiableEntries
        implements Set
    {

        public boolean equals(Object obj)
        {
            return Sets.equalsImpl(this, obj);
        }

        public int hashCode()
        {
            return Sets.hashCodeImpl(this);
        }

        UnmodifiableEntrySet(Set set)
        {
            super(set);
        }
    }

    static class ValueDifferenceImpl
        implements MapDifference.ValueDifference
    {

        private final Object left;
        private final Object right;

        public boolean equals(Object obj)
        {
            boolean flag1 = false;
            boolean flag = flag1;
            if (obj instanceof MapDifference.ValueDifference)
            {
                obj = (MapDifference.ValueDifference)obj;
                flag = flag1;
                if (Objects.equal(left, ((MapDifference.ValueDifference) (obj)).leftValue()))
                {
                    flag = flag1;
                    if (Objects.equal(right, ((MapDifference.ValueDifference) (obj)).rightValue()))
                    {
                        flag = true;
                    }
                }
            }
            return flag;
        }

        public int hashCode()
        {
            return Objects.hashCode(new Object[] {
                left, right
            });
        }

        public Object leftValue()
        {
            return left;
        }

        public Object rightValue()
        {
            return right;
        }

        public String toString()
        {
            return (new StringBuilder()).append("(").append(left).append(", ").append(right).append(")").toString();
        }

        ValueDifferenceImpl(Object obj, Object obj1)
        {
            left = obj;
            right = obj1;
        }
    }


    static final com.google.common.base.Joiner.MapJoiner STANDARD_JOINER;

    private Maps()
    {
    }

    static int capacity(int i)
    {
        boolean flag;
        if (i >= 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        return Ints.saturatedCast(Math.max((long)i * 2L, 16L));
    }

    static boolean containsEntryImpl(Collection collection, Object obj)
    {
        if (!(obj instanceof java.util.Map.Entry))
        {
            return false;
        } else
        {
            return collection.contains(unmodifiableEntry((java.util.Map.Entry)obj));
        }
    }

    static boolean containsKeyImpl(Map map, Object obj)
    {
        for (map = map.entrySet().iterator(); map.hasNext();)
        {
            if (Objects.equal(((java.util.Map.Entry)map.next()).getKey(), obj))
            {
                return true;
            }
        }

        return false;
    }

    static boolean containsValueImpl(Map map, Object obj)
    {
        for (map = map.entrySet().iterator(); map.hasNext();)
        {
            if (Objects.equal(((java.util.Map.Entry)map.next()).getValue(), obj))
            {
                return true;
            }
        }

        return false;
    }

    public static MapDifference difference(Map map, Map map1)
    {
        HashMap hashmap = newHashMap();
        HashMap hashmap1 = new HashMap(map1);
        HashMap hashmap2 = newHashMap();
        HashMap hashmap3 = newHashMap();
        boolean flag = true;
        for (map = map.entrySet().iterator(); map.hasNext();)
        {
            Object obj1 = (java.util.Map.Entry)map.next();
            Object obj = ((java.util.Map.Entry) (obj1)).getKey();
            obj1 = ((java.util.Map.Entry) (obj1)).getValue();
            if (map1.containsKey(obj))
            {
                Object obj2 = hashmap1.remove(obj);
                if (Objects.equal(obj1, obj2))
                {
                    hashmap2.put(obj, obj1);
                } else
                {
                    flag = false;
                    hashmap3.put(obj, new ValueDifferenceImpl(obj1, obj2));
                }
            } else
            {
                flag = false;
                hashmap.put(obj, obj1);
            }
        }

        boolean flag1;
        if (flag && hashmap1.isEmpty())
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        return mapDifference(flag1, hashmap, hashmap1, hashmap2, hashmap3);
    }

    static Set entrySetImpl(Map map, Supplier supplier)
    {
        return new EntrySetImpl(map, supplier);
    }

    static boolean equalsImpl(Map map, Object obj)
    {
        if (map == obj)
        {
            return true;
        }
        if (obj instanceof Map)
        {
            obj = (Map)obj;
            return map.entrySet().equals(((Map) (obj)).entrySet());
        } else
        {
            return false;
        }
    }

    public static Map filterEntries(Map map, Predicate predicate)
    {
        Preconditions.checkNotNull(predicate);
        if (map instanceof AbstractFilteredMap)
        {
            return filterFiltered((AbstractFilteredMap)map, predicate);
        } else
        {
            return new FilteredEntryMap((Map)Preconditions.checkNotNull(map), predicate);
        }
    }

    private static Map filterFiltered(AbstractFilteredMap abstractfilteredmap, Predicate predicate)
    {
        predicate = Predicates.and(abstractfilteredmap.predicate, predicate);
        return new FilteredEntryMap(abstractfilteredmap.unfiltered, predicate);
    }

    public static Map filterKeys(Map map, Predicate predicate)
    {
        Preconditions.checkNotNull(predicate);
        Predicate predicate1 = new Predicate(predicate) {

            final Predicate val$keyPredicate;

            public volatile boolean apply(Object obj)
            {
                return apply((java.util.Map.Entry)obj);
            }

            public boolean apply(java.util.Map.Entry entry)
            {
                return keyPredicate.apply(entry.getKey());
            }

            
            {
                keyPredicate = predicate;
                super();
            }
        };
        if (map instanceof AbstractFilteredMap)
        {
            return filterFiltered((AbstractFilteredMap)map, predicate1);
        } else
        {
            return new FilteredKeyMap((Map)Preconditions.checkNotNull(map), predicate, predicate1);
        }
    }

    public static Map filterValues(Map map, Predicate predicate)
    {
        Preconditions.checkNotNull(predicate);
        return filterEntries(map, new Predicate(predicate) {

            final Predicate val$valuePredicate;

            public volatile boolean apply(Object obj)
            {
                return apply((java.util.Map.Entry)obj);
            }

            public boolean apply(java.util.Map.Entry entry)
            {
                return valuePredicate.apply(entry.getValue());
            }

            
            {
                valuePredicate = predicate;
                super();
            }
        });
    }

    public static ImmutableMap fromProperties(Properties properties)
    {
        ImmutableMap.Builder builder = ImmutableMap.builder();
        String s;
        for (Enumeration enumeration = properties.propertyNames(); enumeration.hasMoreElements(); builder.put(s, properties.getProperty(s)))
        {
            s = (String)enumeration.nextElement();
        }

        return builder.build();
    }

    static int hashCodeImpl(Map map)
    {
        return Sets.hashCodeImpl(map.entrySet());
    }

    public static java.util.Map.Entry immutableEntry(Object obj, Object obj1)
    {
        return new ImmutableEntry(obj, obj1);
    }

    static Set keySetImpl(Map map)
    {
        return (new AbstractMapWrapper(map)).keySet();
    }

    private static MapDifference mapDifference(boolean flag, Map map, Map map1, Map map2, Map map3)
    {
        return new MapDifferenceImpl(flag, Collections.unmodifiableMap(map), Collections.unmodifiableMap(map1), Collections.unmodifiableMap(map2), Collections.unmodifiableMap(map3));
    }

    public static ConcurrentMap newConcurrentMap()
    {
        return (new MapMaker()).makeMap();
    }

    public static EnumMap newEnumMap(Class class1)
    {
        return new EnumMap((Class)Preconditions.checkNotNull(class1));
    }

    public static EnumMap newEnumMap(Map map)
    {
        return new EnumMap(map);
    }

    public static HashMap newHashMap()
    {
        return new HashMap();
    }

    public static HashMap newHashMap(Map map)
    {
        return new HashMap(map);
    }

    public static HashMap newHashMapWithExpectedSize(int i)
    {
        return new HashMap(capacity(i));
    }

    public static IdentityHashMap newIdentityHashMap()
    {
        return new IdentityHashMap();
    }

    public static LinkedHashMap newLinkedHashMap()
    {
        return new LinkedHashMap();
    }

    public static LinkedHashMap newLinkedHashMap(Map map)
    {
        return new LinkedHashMap(map);
    }

    public static TreeMap newTreeMap()
    {
        return new TreeMap();
    }

    public static TreeMap newTreeMap(Comparator comparator)
    {
        return new TreeMap(comparator);
    }

    public static TreeMap newTreeMap(SortedMap sortedmap)
    {
        return new TreeMap(sortedmap);
    }

    static void putAllImpl(Map map, Map map1)
    {
        java.util.Map.Entry entry;
        for (map1 = map1.entrySet().iterator(); map1.hasNext(); map.put(entry.getKey(), entry.getValue()))
        {
            entry = (java.util.Map.Entry)map1.next();
        }

    }

    static boolean removeEntryImpl(Collection collection, Object obj)
    {
        if (!(obj instanceof java.util.Map.Entry))
        {
            return false;
        } else
        {
            return collection.remove(unmodifiableEntry((java.util.Map.Entry)obj));
        }
    }

    static boolean safeContainsKey(Map map, Object obj)
    {
        boolean flag;
        try
        {
            flag = map.containsKey(obj);
        }
        // Misplaced declaration of an exception variable
        catch (Map map)
        {
            return false;
        }
        return flag;
    }

    static Object safeGet(Map map, Object obj)
    {
        try
        {
            map = ((Map) (map.get(obj)));
        }
        // Misplaced declaration of an exception variable
        catch (Map map)
        {
            return null;
        }
        return map;
    }

    public static BiMap synchronizedBiMap(BiMap bimap)
    {
        return Synchronized.biMap(bimap, null);
    }

    static String toStringImpl(Map map)
    {
        StringBuilder stringbuilder = Collections2.newStringBuilderForCollection(map.size()).append('{');
        STANDARD_JOINER.appendTo(stringbuilder, map);
        return stringbuilder.append('}').toString();
    }

    public static Map transformEntries(Map map, EntryTransformer entrytransformer)
    {
        return new TransformedEntriesMap(map, entrytransformer);
    }

    public static Map transformValues(Map map, Function function)
    {
        Preconditions.checkNotNull(function);
        return transformEntries(map, new EntryTransformer(function) {

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

    public static ImmutableMap uniqueIndex(Iterable iterable, Function function)
    {
        Preconditions.checkNotNull(function);
        ImmutableMap.Builder builder = ImmutableMap.builder();
        Object obj;
        for (iterable = iterable.iterator(); iterable.hasNext(); builder.put(function.apply(obj), obj))
        {
            obj = iterable.next();
        }

        return builder.build();
    }

    public static BiMap unmodifiableBiMap(BiMap bimap)
    {
        return new UnmodifiableBiMap(bimap, null);
    }

    static java.util.Map.Entry unmodifiableEntry(java.util.Map.Entry entry)
    {
        Preconditions.checkNotNull(entry);
        return new AbstractMapEntry(entry) {

            final java.util.Map.Entry val$entry;

            public Object getKey()
            {
                return entry.getKey();
            }

            public Object getValue()
            {
                return entry.getValue();
            }

            
            {
                entry = entry1;
                super();
            }
        };
    }

    static Set unmodifiableEntrySet(Set set)
    {
        return new UnmodifiableEntrySet(Collections.unmodifiableSet(set));
    }

    static Collection valuesImpl(Map map)
    {
        return (new AbstractMapWrapper(map)).values();
    }

    static 
    {
        STANDARD_JOINER = Collections2.STANDARD_JOINER.withKeyValueSeparator("=");
    }
}
