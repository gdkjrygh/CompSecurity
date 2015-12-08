// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;

// Referenced classes of package com.google.common.collect:
//            MapConstraint, Lists, BiMap, ListMultimap, 
//            Multimap, SetMultimap, SortedSetMultimap, ForwardingSet, 
//            Maps, ForwardingIterator, ForwardingCollection, ForwardingMap, 
//            Sets, ForwardingMultimap, Constraints, Constraint, 
//            ForwardingMapEntry

public final class MapConstraints
{
    static class ConstrainedAsMapEntries extends ForwardingSet
    {

        private final MapConstraint constraint;
        private final Set entries;

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
            return entries;
        }

        public boolean equals(Object obj)
        {
            return standardEquals(obj);
        }

        public int hashCode()
        {
            return standardHashCode();
        }

        public Iterator iterator()
        {
            return entries.iterator(). new ForwardingIterator() {

                final ConstrainedAsMapEntries this$0;
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
                    return MapConstraints.constrainedAsMapEntry((java.util.Map.Entry)iterator.next(), constraint);
                }

            
            {
                this$0 = final_constrainedasmapentries;
                iterator = Iterator.this;
                super();
            }
            };
        }

        public boolean remove(Object obj)
        {
            return Maps.removeEntryImpl(_mthdelegate(), obj);
        }

        public boolean removeAll(Collection collection)
        {
            return standardRemoveAll(collection);
        }

        public boolean retainAll(Collection collection)
        {
            return standardRetainAll(collection);
        }

        public Object[] toArray()
        {
            return standardToArray();
        }

        public Object[] toArray(Object aobj[])
        {
            return standardToArray(aobj);
        }


        ConstrainedAsMapEntries(Set set, MapConstraint mapconstraint)
        {
            entries = set;
            constraint = mapconstraint;
        }
    }

    private static class ConstrainedAsMapValues extends ForwardingCollection
    {

        final Collection _flddelegate;
        final Set entrySet;

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
            return entrySet.iterator(). new Iterator() {

                final ConstrainedAsMapValues this$0;
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
                    return (Collection)((java.util.Map.Entry)iterator.next()).getValue();
                }

                public void remove()
                {
                    iterator.remove();
                }

            
            {
                this$0 = final_constrainedasmapvalues;
                iterator = Iterator.this;
                super();
            }
            };
        }

        public boolean remove(Object obj)
        {
            return standardRemove(obj);
        }

        public boolean removeAll(Collection collection)
        {
            return standardRemoveAll(collection);
        }

        public boolean retainAll(Collection collection)
        {
            return standardRetainAll(collection);
        }

        public Object[] toArray()
        {
            return standardToArray();
        }

        public Object[] toArray(Object aobj[])
        {
            return standardToArray(aobj);
        }

        ConstrainedAsMapValues(Collection collection, Set set)
        {
            _flddelegate = collection;
            entrySet = set;
        }
    }

    private static class ConstrainedBiMap extends ConstrainedMap
        implements BiMap
    {

        volatile BiMap inverse;

        protected BiMap _mthdelegate()
        {
            return (BiMap)super._mthdelegate();
        }

        protected volatile Object _mthdelegate()
        {
            return _mthdelegate();
        }

        protected volatile Map _mthdelegate()
        {
            return _mthdelegate();
        }

        public Object forcePut(Object obj, Object obj1)
        {
            constraint.checkKeyValue(obj, obj1);
            return _mthdelegate().forcePut(obj, obj1);
        }

        public BiMap inverse()
        {
            if (inverse == null)
            {
                inverse = new ConstrainedBiMap(_mthdelegate().inverse(), this, new InverseConstraint(constraint));
            }
            return inverse;
        }

        public volatile Collection values()
        {
            return values();
        }

        public Set values()
        {
            return _mthdelegate().values();
        }

        ConstrainedBiMap(BiMap bimap, BiMap bimap1, MapConstraint mapconstraint)
        {
            super(bimap, mapconstraint);
            inverse = bimap1;
        }
    }

    private static class ConstrainedEntries extends ForwardingCollection
    {

        final MapConstraint constraint;
        final Collection entries;

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

        protected Collection _mthdelegate()
        {
            return entries;
        }

        public Iterator iterator()
        {
            return entries.iterator(). new ForwardingIterator() {

                final ConstrainedEntries this$0;
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
                    return MapConstraints.constrainedEntry((java.util.Map.Entry)iterator.next(), constraint);
                }

            
            {
                this$0 = final_constrainedentries;
                iterator = Iterator.this;
                super();
            }
            };
        }

        public boolean remove(Object obj)
        {
            return Maps.removeEntryImpl(_mthdelegate(), obj);
        }

        public boolean removeAll(Collection collection)
        {
            return standardRemoveAll(collection);
        }

        public boolean retainAll(Collection collection)
        {
            return standardRetainAll(collection);
        }

        public Object[] toArray()
        {
            return standardToArray();
        }

        public Object[] toArray(Object aobj[])
        {
            return standardToArray(aobj);
        }

        ConstrainedEntries(Collection collection, MapConstraint mapconstraint)
        {
            entries = collection;
            constraint = mapconstraint;
        }
    }

    static class ConstrainedEntrySet extends ConstrainedEntries
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

        ConstrainedEntrySet(Set set, MapConstraint mapconstraint)
        {
            super(set, mapconstraint);
        }
    }

    private static class ConstrainedListMultimap extends ConstrainedMultimap
        implements ListMultimap
    {

        public volatile Collection get(Object obj)
        {
            return get(obj);
        }

        public List get(Object obj)
        {
            return (List)super.get(obj);
        }

        public volatile Collection removeAll(Object obj)
        {
            return removeAll(obj);
        }

        public List removeAll(Object obj)
        {
            return (List)super.removeAll(obj);
        }

        public volatile Collection replaceValues(Object obj, Iterable iterable)
        {
            return replaceValues(obj, iterable);
        }

        public List replaceValues(Object obj, Iterable iterable)
        {
            return (List)super.replaceValues(obj, iterable);
        }

        ConstrainedListMultimap(ListMultimap listmultimap, MapConstraint mapconstraint)
        {
            super(listmultimap, mapconstraint);
        }
    }

    static class ConstrainedMap extends ForwardingMap
    {

        final MapConstraint constraint;
        private final Map _flddelegate;
        private transient Set entrySet;

        protected volatile Object _mthdelegate()
        {
            return _mthdelegate();
        }

        protected Map _mthdelegate()
        {
            return _flddelegate;
        }

        public Set entrySet()
        {
            Set set1 = entrySet;
            Set set = set1;
            if (set1 == null)
            {
                set = MapConstraints.constrainedEntrySet(_flddelegate.entrySet(), constraint);
                entrySet = set;
            }
            return set;
        }

        public Object put(Object obj, Object obj1)
        {
            constraint.checkKeyValue(obj, obj1);
            return _flddelegate.put(obj, obj1);
        }

        public void putAll(Map map)
        {
            _flddelegate.putAll(MapConstraints.checkMap(map, constraint));
        }

        ConstrainedMap(Map map, MapConstraint mapconstraint)
        {
            _flddelegate = (Map)Preconditions.checkNotNull(map);
            constraint = (MapConstraint)Preconditions.checkNotNull(mapconstraint);
        }
    }

    private static class ConstrainedMultimap extends ForwardingMultimap
    {

        transient Map asMap;
        final MapConstraint constraint;
        final Multimap _flddelegate;
        transient Collection entries;

        public Map asMap()
        {
            Map map = asMap;
            Object obj = map;
            if (map == null)
            {
                obj = _flddelegate.asMap(). new ForwardingMap() {

                    Set entrySet;
                    final ConstrainedMultimap this$0;
                    final Map val$asMapDelegate;
                    Collection values;

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
                        return asMapDelegate;
                    }

                    public Set entrySet()
                    {
                        Set set1 = entrySet;
                        Set set = set1;
                        if (set1 == null)
                        {
                            set = MapConstraints.constrainedAsMapEntries(asMapDelegate.entrySet(), constraint);
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
                        boolean flag;
                        try
                        {
                            obj = ConstrainedMultimap.this.get(obj);
                            flag = ((Collection) (obj)).isEmpty();
                        }
                        // Misplaced declaration of an exception variable
                        catch (Object obj)
                        {
                            return null;
                        }
                        if (flag)
                        {
                            obj = null;
                        }
                        return ((Collection) (obj));
                    }

                    public Collection values()
                    {
                        Collection collection = values;
                        Object obj = collection;
                        if (collection == null)
                        {
                            obj = new ConstrainedAsMapValues(_mthdelegate().values(), entrySet());
                            values = ((Collection) (obj));
                        }
                        return ((Collection) (obj));
                    }

            
            {
                this$0 = final_constrainedmultimap;
                asMapDelegate = Map.this;
                super();
            }
                };
                asMap = ((Map) (obj));
            }
            return ((Map) (obj));
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
                collection = MapConstraints.constrainedEntries(_flddelegate.entries(), constraint);
                entries = collection;
            }
            return collection;
        }

        public Collection get(Object obj)
        {
            return Constraints.constrainedTypePreservingCollection(_flddelegate.get(obj), ((_cls2) (obj)). new Constraint() {

                final ConstrainedMultimap this$0;
                final Object val$key;

                public Object checkElement(Object obj)
                {
                    constraint.checkKeyValue(key, obj);
                    return obj;
                }

            
            {
                this$0 = final_constrainedmultimap;
                key = Object.this;
                super();
            }
            });
        }

        public boolean put(Object obj, Object obj1)
        {
            constraint.checkKeyValue(obj, obj1);
            return _flddelegate.put(obj, obj1);
        }

        public boolean putAll(Multimap multimap)
        {
            boolean flag = false;
            for (multimap = multimap.entries().iterator(); multimap.hasNext();)
            {
                java.util.Map.Entry entry = (java.util.Map.Entry)multimap.next();
                flag |= put(entry.getKey(), entry.getValue());
            }

            return flag;
        }

        public boolean putAll(Object obj, Iterable iterable)
        {
            return _flddelegate.putAll(obj, MapConstraints.checkValues(obj, iterable, constraint));
        }

        public Collection replaceValues(Object obj, Iterable iterable)
        {
            return _flddelegate.replaceValues(obj, MapConstraints.checkValues(obj, iterable, constraint));
        }

        public ConstrainedMultimap(Multimap multimap, MapConstraint mapconstraint)
        {
            _flddelegate = (Multimap)Preconditions.checkNotNull(multimap);
            constraint = (MapConstraint)Preconditions.checkNotNull(mapconstraint);
        }
    }

    private static class ConstrainedSetMultimap extends ConstrainedMultimap
        implements SetMultimap
    {

        public volatile Collection entries()
        {
            return entries();
        }

        public Set entries()
        {
            return (Set)super.entries();
        }

        public volatile Collection get(Object obj)
        {
            return get(obj);
        }

        public Set get(Object obj)
        {
            return (Set)super.get(obj);
        }

        public volatile Collection removeAll(Object obj)
        {
            return removeAll(obj);
        }

        public Set removeAll(Object obj)
        {
            return (Set)super.removeAll(obj);
        }

        public volatile Collection replaceValues(Object obj, Iterable iterable)
        {
            return replaceValues(obj, iterable);
        }

        public Set replaceValues(Object obj, Iterable iterable)
        {
            return (Set)super.replaceValues(obj, iterable);
        }

        ConstrainedSetMultimap(SetMultimap setmultimap, MapConstraint mapconstraint)
        {
            super(setmultimap, mapconstraint);
        }
    }

    private static class ConstrainedSortedSetMultimap extends ConstrainedSetMultimap
        implements SortedSetMultimap
    {

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
            return (SortedSet)super.get(obj);
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
            return (SortedSet)super.removeAll(obj);
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
            return (SortedSet)super.replaceValues(obj, iterable);
        }

        public Comparator valueComparator()
        {
            return ((SortedSetMultimap)_mthdelegate()).valueComparator();
        }

        ConstrainedSortedSetMultimap(SortedSetMultimap sortedsetmultimap, MapConstraint mapconstraint)
        {
            super(sortedsetmultimap, mapconstraint);
        }
    }

    private static class InverseConstraint
        implements MapConstraint
    {

        final MapConstraint constraint;

        public void checkKeyValue(Object obj, Object obj1)
        {
            constraint.checkKeyValue(obj1, obj);
        }

        public InverseConstraint(MapConstraint mapconstraint)
        {
            constraint = (MapConstraint)Preconditions.checkNotNull(mapconstraint);
        }
    }

    private static final class NotNullMapConstraint extends Enum
        implements MapConstraint
    {

        private static final NotNullMapConstraint $VALUES[];
        public static final NotNullMapConstraint INSTANCE;

        public static NotNullMapConstraint valueOf(String s)
        {
            return (NotNullMapConstraint)Enum.valueOf(com/google/common/collect/MapConstraints$NotNullMapConstraint, s);
        }

        public static NotNullMapConstraint[] values()
        {
            return (NotNullMapConstraint[])$VALUES.clone();
        }

        public void checkKeyValue(Object obj, Object obj1)
        {
            Preconditions.checkNotNull(obj);
            Preconditions.checkNotNull(obj1);
        }

        public String toString()
        {
            return "Not null";
        }

        static 
        {
            INSTANCE = new NotNullMapConstraint("INSTANCE", 0);
            $VALUES = (new NotNullMapConstraint[] {
                INSTANCE
            });
        }

        private NotNullMapConstraint(String s, int i)
        {
            super(s, i);
        }
    }


    private MapConstraints()
    {
    }

    private static Map checkMap(Map map, MapConstraint mapconstraint)
    {
        map = new LinkedHashMap(map);
        java.util.Map.Entry entry;
        for (Iterator iterator = map.entrySet().iterator(); iterator.hasNext(); mapconstraint.checkKeyValue(entry.getKey(), entry.getValue()))
        {
            entry = (java.util.Map.Entry)iterator.next();
        }

        return map;
    }

    private static Collection checkValues(Object obj, Iterable iterable, MapConstraint mapconstraint)
    {
        iterable = Lists.newArrayList(iterable);
        for (Iterator iterator = iterable.iterator(); iterator.hasNext(); mapconstraint.checkKeyValue(obj, iterator.next())) { }
        return iterable;
    }

    private static Set constrainedAsMapEntries(Set set, MapConstraint mapconstraint)
    {
        return new ConstrainedAsMapEntries(set, mapconstraint);
    }

    private static java.util.Map.Entry constrainedAsMapEntry(java.util.Map.Entry entry, MapConstraint mapconstraint)
    {
        Preconditions.checkNotNull(entry);
        Preconditions.checkNotNull(mapconstraint);
        return new ForwardingMapEntry(entry, mapconstraint) {

            final MapConstraint val$constraint;
            final java.util.Map.Entry val$entry;

            protected volatile Object _mthdelegate()
            {
                return _mthdelegate();
            }

            protected java.util.Map.Entry _mthdelegate()
            {
                return entry;
            }

            public volatile Object getValue()
            {
                return getValue();
            }

            public Collection getValue()
            {
                return Constraints.constrainedTypePreservingCollection((Collection)entry.getValue(), new Constraint() {

                    final _cls2 this$0;

                    public Object checkElement(Object obj)
                    {
                        constraint.checkKeyValue(getKey(), obj);
                        return obj;
                    }

            
            {
                this$0 = _cls2.this;
                super();
            }
                });
            }

            
            {
                entry = entry1;
                constraint = mapconstraint;
                super();
            }
        };
    }

    public static BiMap constrainedBiMap(BiMap bimap, MapConstraint mapconstraint)
    {
        return new ConstrainedBiMap(bimap, null, mapconstraint);
    }

    private static Collection constrainedEntries(Collection collection, MapConstraint mapconstraint)
    {
        if (collection instanceof Set)
        {
            return constrainedEntrySet((Set)collection, mapconstraint);
        } else
        {
            return new ConstrainedEntries(collection, mapconstraint);
        }
    }

    private static java.util.Map.Entry constrainedEntry(java.util.Map.Entry entry, MapConstraint mapconstraint)
    {
        Preconditions.checkNotNull(entry);
        Preconditions.checkNotNull(mapconstraint);
        return new ForwardingMapEntry(entry, mapconstraint) {

            final MapConstraint val$constraint;
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
                constraint.checkKeyValue(getKey(), obj);
                return entry.setValue(obj);
            }

            
            {
                entry = entry1;
                constraint = mapconstraint;
                super();
            }
        };
    }

    private static Set constrainedEntrySet(Set set, MapConstraint mapconstraint)
    {
        return new ConstrainedEntrySet(set, mapconstraint);
    }

    public static ListMultimap constrainedListMultimap(ListMultimap listmultimap, MapConstraint mapconstraint)
    {
        return new ConstrainedListMultimap(listmultimap, mapconstraint);
    }

    public static Map constrainedMap(Map map, MapConstraint mapconstraint)
    {
        return new ConstrainedMap(map, mapconstraint);
    }

    public static Multimap constrainedMultimap(Multimap multimap, MapConstraint mapconstraint)
    {
        return new ConstrainedMultimap(multimap, mapconstraint);
    }

    public static SetMultimap constrainedSetMultimap(SetMultimap setmultimap, MapConstraint mapconstraint)
    {
        return new ConstrainedSetMultimap(setmultimap, mapconstraint);
    }

    public static SortedSetMultimap constrainedSortedSetMultimap(SortedSetMultimap sortedsetmultimap, MapConstraint mapconstraint)
    {
        return new ConstrainedSortedSetMultimap(sortedsetmultimap, mapconstraint);
    }

    public static MapConstraint notNull()
    {
        return NotNullMapConstraint.INSTANCE;
    }







}
