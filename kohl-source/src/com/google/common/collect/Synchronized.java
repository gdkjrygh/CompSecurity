// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

// Referenced classes of package com.google.common.collect:
//            BiMap, ListMultimap, Multimap, Multiset, 
//            SetMultimap, SortedSetMultimap, Maps, Collections2, 
//            Sets, Iterators, ObjectArrays, ForwardingIterator, 
//            ForwardingMapEntry

final class Synchronized
{
    private static class SynchronizedAsMap extends SynchronizedMap
    {

        private static final long serialVersionUID = 0L;
        transient Set asMapEntrySet;
        transient Collection asMapValues;

        public boolean containsValue(Object obj)
        {
            return values().contains(obj);
        }

        public Set entrySet()
        {
            Set set1;
            synchronized (mutex)
            {
                if (asMapEntrySet == null)
                {
                    asMapEntrySet = new SynchronizedAsMapEntries(_mthdelegate().entrySet(), mutex);
                }
                set1 = asMapEntrySet;
            }
            return set1;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public volatile Object get(Object obj)
        {
            return get(obj);
        }

        public Collection get(Object obj)
        {
            Object obj1 = mutex;
            obj1;
            JVM INSTR monitorenter ;
            obj = (Collection)super.get(obj);
            if (obj != null) goto _L2; else goto _L1
_L1:
            obj = null;
_L4:
            obj1;
            JVM INSTR monitorexit ;
            return ((Collection) (obj));
_L2:
            obj = Synchronized.typePreservingCollection(((Collection) (obj)), mutex);
            if (true) goto _L4; else goto _L3
_L3:
            obj;
            obj1;
            JVM INSTR monitorexit ;
            throw obj;
        }

        public Collection values()
        {
            Collection collection1;
            synchronized (mutex)
            {
                if (asMapValues == null)
                {
                    asMapValues = new SynchronizedAsMapValues(_mthdelegate().values(), mutex);
                }
                collection1 = asMapValues;
            }
            return collection1;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        SynchronizedAsMap(Map map1, Object obj)
        {
            super(map1, obj);
        }
    }

    private static class SynchronizedAsMapEntries extends SynchronizedSet
    {

        private static final long serialVersionUID = 0L;

        public boolean contains(Object obj)
        {
            boolean flag;
            synchronized (mutex)
            {
                flag = Maps.containsEntryImpl(_mthdelegate(), obj);
            }
            return flag;
            obj;
            obj1;
            JVM INSTR monitorexit ;
            throw obj;
        }

        public boolean containsAll(Collection collection1)
        {
            boolean flag;
            synchronized (mutex)
            {
                flag = Collections2.containsAllImpl(_mthdelegate(), collection1);
            }
            return flag;
            collection1;
            obj;
            JVM INSTR monitorexit ;
            throw collection1;
        }

        public boolean equals(Object obj)
        {
            if (obj == this)
            {
                return true;
            }
            boolean flag;
            synchronized (mutex)
            {
                flag = Sets.equalsImpl(_mthdelegate(), obj);
            }
            return flag;
            obj;
            obj1;
            JVM INSTR monitorexit ;
            throw obj;
        }

        public Iterator iterator()
        {
            return super.iterator(). new ForwardingIterator() {

                final SynchronizedAsMapEntries this$0;
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
                    return ((java.util.Map.Entry)iterator.next()). new ForwardingMapEntry() {

                        final SynchronizedAsMapEntries._cls1 this$1;
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
                            return Synchronized.typePreservingCollection((Collection)entry.getValue(), mutex);
                        }

            
            {
                this$1 = final__pcls1;
                entry = java.util.Map.Entry.this;
                super();
            }
                    };
                }

            
            {
                this$0 = final_synchronizedasmapentries;
                iterator = Iterator.this;
                super();
            }
            };
        }

        public boolean remove(Object obj)
        {
            boolean flag;
            synchronized (mutex)
            {
                flag = Maps.removeEntryImpl(_mthdelegate(), obj);
            }
            return flag;
            obj;
            obj1;
            JVM INSTR monitorexit ;
            throw obj;
        }

        public boolean removeAll(Collection collection1)
        {
            boolean flag;
            synchronized (mutex)
            {
                flag = Iterators.removeAll(_mthdelegate().iterator(), collection1);
            }
            return flag;
            collection1;
            obj;
            JVM INSTR monitorexit ;
            throw collection1;
        }

        public boolean retainAll(Collection collection1)
        {
            boolean flag;
            synchronized (mutex)
            {
                flag = Iterators.retainAll(_mthdelegate().iterator(), collection1);
            }
            return flag;
            collection1;
            obj;
            JVM INSTR monitorexit ;
            throw collection1;
        }

        public Object[] toArray()
        {
            Object aobj[];
            synchronized (mutex)
            {
                aobj = ObjectArrays.toArrayImpl(_mthdelegate());
            }
            return aobj;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public Object[] toArray(Object aobj[])
        {
            synchronized (mutex)
            {
                aobj = ObjectArrays.toArrayImpl(_mthdelegate(), aobj);
            }
            return aobj;
            aobj;
            obj;
            JVM INSTR monitorexit ;
            throw aobj;
        }

        SynchronizedAsMapEntries(Set set1, Object obj)
        {
            super(set1, obj);
        }
    }

    private static class SynchronizedAsMapValues extends SynchronizedCollection
    {

        private static final long serialVersionUID = 0L;

        public Iterator iterator()
        {
            return super.iterator(). new ForwardingIterator() {

                final SynchronizedAsMapValues this$0;
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

                public Collection next()
                {
                    return Synchronized.typePreservingCollection((Collection)iterator.next(), mutex);
                }

            
            {
                this$0 = final_synchronizedasmapvalues;
                iterator = Iterator.this;
                super();
            }
            };
        }

        SynchronizedAsMapValues(Collection collection1, Object obj)
        {
            super(collection1, obj);
        }
    }

    static class SynchronizedBiMap extends SynchronizedMap
        implements BiMap, Serializable
    {

        private static final long serialVersionUID = 0L;
        private transient BiMap inverse;
        private transient Set valueSet;

        BiMap _mthdelegate()
        {
            return (BiMap)super._mthdelegate();
        }

        volatile Object _mthdelegate()
        {
            return _mthdelegate();
        }

        volatile Map _mthdelegate()
        {
            return _mthdelegate();
        }

        public Object forcePut(Object obj, Object obj1)
        {
            synchronized (mutex)
            {
                obj = _mthdelegate().forcePut(obj, obj1);
            }
            return obj;
            obj;
            obj2;
            JVM INSTR monitorexit ;
            throw obj;
        }

        public BiMap inverse()
        {
            BiMap bimap;
            synchronized (mutex)
            {
                if (inverse == null)
                {
                    inverse = new SynchronizedBiMap(_mthdelegate().inverse(), mutex, this);
                }
                bimap = inverse;
            }
            return bimap;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public volatile Collection values()
        {
            return values();
        }

        public Set values()
        {
            Set set1;
            synchronized (mutex)
            {
                if (valueSet == null)
                {
                    valueSet = Synchronized.set(_mthdelegate().values(), mutex);
                }
                set1 = valueSet;
            }
            return set1;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        private SynchronizedBiMap(BiMap bimap, Object obj, BiMap bimap1)
        {
            super(bimap, obj);
            inverse = bimap1;
        }

    }

    static class SynchronizedCollection extends SynchronizedObject
        implements Collection
    {

        private static final long serialVersionUID = 0L;

        public boolean add(Object obj)
        {
            boolean flag;
            synchronized (mutex)
            {
                flag = _mthdelegate().add(obj);
            }
            return flag;
            obj;
            obj1;
            JVM INSTR monitorexit ;
            throw obj;
        }

        public boolean addAll(Collection collection1)
        {
            boolean flag;
            synchronized (mutex)
            {
                flag = _mthdelegate().addAll(collection1);
            }
            return flag;
            collection1;
            obj;
            JVM INSTR monitorexit ;
            throw collection1;
        }

        public void clear()
        {
            synchronized (mutex)
            {
                _mthdelegate().clear();
            }
            return;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public boolean contains(Object obj)
        {
            boolean flag;
            synchronized (mutex)
            {
                flag = _mthdelegate().contains(obj);
            }
            return flag;
            obj;
            obj1;
            JVM INSTR monitorexit ;
            throw obj;
        }

        public boolean containsAll(Collection collection1)
        {
            boolean flag;
            synchronized (mutex)
            {
                flag = _mthdelegate().containsAll(collection1);
            }
            return flag;
            collection1;
            obj;
            JVM INSTR monitorexit ;
            throw collection1;
        }

        volatile Object _mthdelegate()
        {
            return _mthdelegate();
        }

        Collection _mthdelegate()
        {
            return (Collection)super._mthdelegate();
        }

        public boolean isEmpty()
        {
            boolean flag;
            synchronized (mutex)
            {
                flag = _mthdelegate().isEmpty();
            }
            return flag;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public Iterator iterator()
        {
            return _mthdelegate().iterator();
        }

        public boolean remove(Object obj)
        {
            boolean flag;
            synchronized (mutex)
            {
                flag = _mthdelegate().remove(obj);
            }
            return flag;
            obj;
            obj1;
            JVM INSTR monitorexit ;
            throw obj;
        }

        public boolean removeAll(Collection collection1)
        {
            boolean flag;
            synchronized (mutex)
            {
                flag = _mthdelegate().removeAll(collection1);
            }
            return flag;
            collection1;
            obj;
            JVM INSTR monitorexit ;
            throw collection1;
        }

        public boolean retainAll(Collection collection1)
        {
            boolean flag;
            synchronized (mutex)
            {
                flag = _mthdelegate().retainAll(collection1);
            }
            return flag;
            collection1;
            obj;
            JVM INSTR monitorexit ;
            throw collection1;
        }

        public int size()
        {
            int i;
            synchronized (mutex)
            {
                i = _mthdelegate().size();
            }
            return i;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public Object[] toArray()
        {
            Object aobj[];
            synchronized (mutex)
            {
                aobj = _mthdelegate().toArray();
            }
            return aobj;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public Object[] toArray(Object aobj[])
        {
            synchronized (mutex)
            {
                aobj = _mthdelegate().toArray(aobj);
            }
            return aobj;
            aobj;
            obj;
            JVM INSTR monitorexit ;
            throw aobj;
        }

        private SynchronizedCollection(Collection collection1, Object obj)
        {
            super(collection1, obj);
        }

    }

    private static class SynchronizedList extends SynchronizedCollection
        implements List
    {

        private static final long serialVersionUID = 0L;

        public void add(int i, Object obj)
        {
            synchronized (mutex)
            {
                _mthdelegate().add(i, obj);
            }
            return;
            obj;
            obj1;
            JVM INSTR monitorexit ;
            throw obj;
        }

        public boolean addAll(int i, Collection collection1)
        {
            boolean flag;
            synchronized (mutex)
            {
                flag = _mthdelegate().addAll(i, collection1);
            }
            return flag;
            collection1;
            obj;
            JVM INSTR monitorexit ;
            throw collection1;
        }

        volatile Object _mthdelegate()
        {
            return _mthdelegate();
        }

        volatile Collection _mthdelegate()
        {
            return _mthdelegate();
        }

        List _mthdelegate()
        {
            return (List)super._mthdelegate();
        }

        public boolean equals(Object obj)
        {
            if (obj == this)
            {
                return true;
            }
            boolean flag;
            synchronized (mutex)
            {
                flag = _mthdelegate().equals(obj);
            }
            return flag;
            obj;
            obj1;
            JVM INSTR monitorexit ;
            throw obj;
        }

        public Object get(int i)
        {
            Object obj1;
            synchronized (mutex)
            {
                obj1 = _mthdelegate().get(i);
            }
            return obj1;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public int hashCode()
        {
            int i;
            synchronized (mutex)
            {
                i = _mthdelegate().hashCode();
            }
            return i;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public int indexOf(Object obj)
        {
            int i;
            synchronized (mutex)
            {
                i = _mthdelegate().indexOf(obj);
            }
            return i;
            obj;
            obj1;
            JVM INSTR monitorexit ;
            throw obj;
        }

        public int lastIndexOf(Object obj)
        {
            int i;
            synchronized (mutex)
            {
                i = _mthdelegate().lastIndexOf(obj);
            }
            return i;
            obj;
            obj1;
            JVM INSTR monitorexit ;
            throw obj;
        }

        public ListIterator listIterator()
        {
            return _mthdelegate().listIterator();
        }

        public ListIterator listIterator(int i)
        {
            return _mthdelegate().listIterator(i);
        }

        public Object remove(int i)
        {
            Object obj1;
            synchronized (mutex)
            {
                obj1 = _mthdelegate().remove(i);
            }
            return obj1;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public Object set(int i, Object obj)
        {
            synchronized (mutex)
            {
                obj = _mthdelegate().set(i, obj);
            }
            return obj;
            obj;
            obj1;
            JVM INSTR monitorexit ;
            throw obj;
        }

        public List subList(int i, int j)
        {
            List list1;
            synchronized (mutex)
            {
                list1 = Synchronized.list(_mthdelegate().subList(i, j), mutex);
            }
            return list1;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        SynchronizedList(List list1, Object obj)
        {
            super(list1, obj);
        }
    }

    private static class SynchronizedListMultimap extends SynchronizedMultimap
        implements ListMultimap
    {

        private static final long serialVersionUID = 0L;

        ListMultimap _mthdelegate()
        {
            return (ListMultimap)super._mthdelegate();
        }

        volatile Multimap _mthdelegate()
        {
            return _mthdelegate();
        }

        volatile Object _mthdelegate()
        {
            return _mthdelegate();
        }

        public volatile Collection get(Object obj)
        {
            return get(obj);
        }

        public List get(Object obj)
        {
            synchronized (mutex)
            {
                obj = Synchronized.list(_mthdelegate().get(obj), mutex);
            }
            return ((List) (obj));
            obj;
            obj1;
            JVM INSTR monitorexit ;
            throw obj;
        }

        public volatile Collection removeAll(Object obj)
        {
            return removeAll(obj);
        }

        public List removeAll(Object obj)
        {
            synchronized (mutex)
            {
                obj = _mthdelegate().removeAll(obj);
            }
            return ((List) (obj));
            obj;
            obj1;
            JVM INSTR monitorexit ;
            throw obj;
        }

        public volatile Collection replaceValues(Object obj, Iterable iterable)
        {
            return replaceValues(obj, iterable);
        }

        public List replaceValues(Object obj, Iterable iterable)
        {
            synchronized (mutex)
            {
                obj = _mthdelegate().replaceValues(obj, iterable);
            }
            return ((List) (obj));
            obj;
            obj1;
            JVM INSTR monitorexit ;
            throw obj;
        }

        SynchronizedListMultimap(ListMultimap listmultimap, Object obj)
        {
            super(listmultimap, obj);
        }
    }

    private static class SynchronizedMap extends SynchronizedObject
        implements Map
    {

        private static final long serialVersionUID = 0L;
        transient Set entrySet;
        transient Set keySet;
        transient Collection values;

        public void clear()
        {
            synchronized (mutex)
            {
                _mthdelegate().clear();
            }
            return;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public boolean containsKey(Object obj)
        {
            boolean flag;
            synchronized (mutex)
            {
                flag = _mthdelegate().containsKey(obj);
            }
            return flag;
            obj;
            obj1;
            JVM INSTR monitorexit ;
            throw obj;
        }

        public boolean containsValue(Object obj)
        {
            boolean flag;
            synchronized (mutex)
            {
                flag = _mthdelegate().containsValue(obj);
            }
            return flag;
            obj;
            obj1;
            JVM INSTR monitorexit ;
            throw obj;
        }

        volatile Object _mthdelegate()
        {
            return _mthdelegate();
        }

        Map _mthdelegate()
        {
            return (Map)super._mthdelegate();
        }

        public Set entrySet()
        {
            Set set1;
            synchronized (mutex)
            {
                if (entrySet == null)
                {
                    entrySet = Synchronized.set(_mthdelegate().entrySet(), mutex);
                }
                set1 = entrySet;
            }
            return set1;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public boolean equals(Object obj)
        {
            if (obj == this)
            {
                return true;
            }
            boolean flag;
            synchronized (mutex)
            {
                flag = _mthdelegate().equals(obj);
            }
            return flag;
            obj;
            obj1;
            JVM INSTR monitorexit ;
            throw obj;
        }

        public Object get(Object obj)
        {
            synchronized (mutex)
            {
                obj = _mthdelegate().get(obj);
            }
            return obj;
            obj;
            obj1;
            JVM INSTR monitorexit ;
            throw obj;
        }

        public int hashCode()
        {
            int i;
            synchronized (mutex)
            {
                i = _mthdelegate().hashCode();
            }
            return i;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public boolean isEmpty()
        {
            boolean flag;
            synchronized (mutex)
            {
                flag = _mthdelegate().isEmpty();
            }
            return flag;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public Set keySet()
        {
            Set set1;
            synchronized (mutex)
            {
                if (keySet == null)
                {
                    keySet = Synchronized.set(_mthdelegate().keySet(), mutex);
                }
                set1 = keySet;
            }
            return set1;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public Object put(Object obj, Object obj1)
        {
            synchronized (mutex)
            {
                obj = _mthdelegate().put(obj, obj1);
            }
            return obj;
            obj;
            obj2;
            JVM INSTR monitorexit ;
            throw obj;
        }

        public void putAll(Map map1)
        {
            synchronized (mutex)
            {
                _mthdelegate().putAll(map1);
            }
            return;
            map1;
            obj;
            JVM INSTR monitorexit ;
            throw map1;
        }

        public Object remove(Object obj)
        {
            synchronized (mutex)
            {
                obj = _mthdelegate().remove(obj);
            }
            return obj;
            obj;
            obj1;
            JVM INSTR monitorexit ;
            throw obj;
        }

        public int size()
        {
            int i;
            synchronized (mutex)
            {
                i = _mthdelegate().size();
            }
            return i;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public Collection values()
        {
            Collection collection1;
            synchronized (mutex)
            {
                if (values == null)
                {
                    values = Synchronized.collection(_mthdelegate().values(), mutex);
                }
                collection1 = values;
            }
            return collection1;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        SynchronizedMap(Map map1, Object obj)
        {
            super(map1, obj);
        }
    }

    private static class SynchronizedMultimap extends SynchronizedObject
        implements Multimap
    {

        private static final long serialVersionUID = 0L;
        transient Map asMap;
        transient Collection entries;
        transient Set keySet;
        transient Multiset keys;
        transient Collection valuesCollection;

        public Map asMap()
        {
            Map map1;
            synchronized (mutex)
            {
                if (asMap == null)
                {
                    asMap = new SynchronizedAsMap(_mthdelegate().asMap(), mutex);
                }
                map1 = asMap;
            }
            return map1;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public void clear()
        {
            synchronized (mutex)
            {
                _mthdelegate().clear();
            }
            return;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public boolean containsEntry(Object obj, Object obj1)
        {
            boolean flag;
            synchronized (mutex)
            {
                flag = _mthdelegate().containsEntry(obj, obj1);
            }
            return flag;
            obj;
            obj2;
            JVM INSTR monitorexit ;
            throw obj;
        }

        public boolean containsKey(Object obj)
        {
            boolean flag;
            synchronized (mutex)
            {
                flag = _mthdelegate().containsKey(obj);
            }
            return flag;
            obj;
            obj1;
            JVM INSTR monitorexit ;
            throw obj;
        }

        public boolean containsValue(Object obj)
        {
            boolean flag;
            synchronized (mutex)
            {
                flag = _mthdelegate().containsValue(obj);
            }
            return flag;
            obj;
            obj1;
            JVM INSTR monitorexit ;
            throw obj;
        }

        Multimap _mthdelegate()
        {
            return (Multimap)super._mthdelegate();
        }

        volatile Object _mthdelegate()
        {
            return _mthdelegate();
        }

        public Collection entries()
        {
            Collection collection1;
            synchronized (mutex)
            {
                if (entries == null)
                {
                    entries = Synchronized.typePreservingCollection(_mthdelegate().entries(), mutex);
                }
                collection1 = entries;
            }
            return collection1;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public boolean equals(Object obj)
        {
            if (obj == this)
            {
                return true;
            }
            boolean flag;
            synchronized (mutex)
            {
                flag = _mthdelegate().equals(obj);
            }
            return flag;
            obj;
            obj1;
            JVM INSTR monitorexit ;
            throw obj;
        }

        public Collection get(Object obj)
        {
            synchronized (mutex)
            {
                obj = Synchronized.typePreservingCollection(_mthdelegate().get(obj), mutex);
            }
            return ((Collection) (obj));
            obj;
            obj1;
            JVM INSTR monitorexit ;
            throw obj;
        }

        public int hashCode()
        {
            int i;
            synchronized (mutex)
            {
                i = _mthdelegate().hashCode();
            }
            return i;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public boolean isEmpty()
        {
            boolean flag;
            synchronized (mutex)
            {
                flag = _mthdelegate().isEmpty();
            }
            return flag;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public Set keySet()
        {
            Set set1;
            synchronized (mutex)
            {
                if (keySet == null)
                {
                    keySet = Synchronized.typePreservingSet(_mthdelegate().keySet(), mutex);
                }
                set1 = keySet;
            }
            return set1;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public Multiset keys()
        {
            Multiset multiset1;
            synchronized (mutex)
            {
                if (keys == null)
                {
                    keys = Synchronized.multiset(_mthdelegate().keys(), mutex);
                }
                multiset1 = keys;
            }
            return multiset1;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public boolean put(Object obj, Object obj1)
        {
            boolean flag;
            synchronized (mutex)
            {
                flag = _mthdelegate().put(obj, obj1);
            }
            return flag;
            obj;
            obj2;
            JVM INSTR monitorexit ;
            throw obj;
        }

        public boolean putAll(Multimap multimap1)
        {
            boolean flag;
            synchronized (mutex)
            {
                flag = _mthdelegate().putAll(multimap1);
            }
            return flag;
            multimap1;
            obj;
            JVM INSTR monitorexit ;
            throw multimap1;
        }

        public boolean putAll(Object obj, Iterable iterable)
        {
            boolean flag;
            synchronized (mutex)
            {
                flag = _mthdelegate().putAll(obj, iterable);
            }
            return flag;
            obj;
            obj1;
            JVM INSTR monitorexit ;
            throw obj;
        }

        public boolean remove(Object obj, Object obj1)
        {
            boolean flag;
            synchronized (mutex)
            {
                flag = _mthdelegate().remove(obj, obj1);
            }
            return flag;
            obj;
            obj2;
            JVM INSTR monitorexit ;
            throw obj;
        }

        public Collection removeAll(Object obj)
        {
            synchronized (mutex)
            {
                obj = _mthdelegate().removeAll(obj);
            }
            return ((Collection) (obj));
            obj;
            obj1;
            JVM INSTR monitorexit ;
            throw obj;
        }

        public Collection replaceValues(Object obj, Iterable iterable)
        {
            synchronized (mutex)
            {
                obj = _mthdelegate().replaceValues(obj, iterable);
            }
            return ((Collection) (obj));
            obj;
            obj1;
            JVM INSTR monitorexit ;
            throw obj;
        }

        public int size()
        {
            int i;
            synchronized (mutex)
            {
                i = _mthdelegate().size();
            }
            return i;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public Collection values()
        {
            Collection collection1;
            synchronized (mutex)
            {
                if (valuesCollection == null)
                {
                    valuesCollection = Synchronized.collection(_mthdelegate().values(), mutex);
                }
                collection1 = valuesCollection;
            }
            return collection1;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        SynchronizedMultimap(Multimap multimap1, Object obj)
        {
            super(multimap1, obj);
        }
    }

    private static class SynchronizedMultiset extends SynchronizedCollection
        implements Multiset
    {

        private static final long serialVersionUID = 0L;
        transient Set elementSet;
        transient Set entrySet;

        public int add(Object obj, int i)
        {
            synchronized (mutex)
            {
                i = _mthdelegate().add(obj, i);
            }
            return i;
            obj;
            obj1;
            JVM INSTR monitorexit ;
            throw obj;
        }

        public int count(Object obj)
        {
            int i;
            synchronized (mutex)
            {
                i = _mthdelegate().count(obj);
            }
            return i;
            obj;
            obj1;
            JVM INSTR monitorexit ;
            throw obj;
        }

        Multiset _mthdelegate()
        {
            return (Multiset)super._mthdelegate();
        }

        volatile Object _mthdelegate()
        {
            return _mthdelegate();
        }

        volatile Collection _mthdelegate()
        {
            return _mthdelegate();
        }

        public Set elementSet()
        {
            Set set1;
            synchronized (mutex)
            {
                if (elementSet == null)
                {
                    elementSet = Synchronized.typePreservingSet(_mthdelegate().elementSet(), mutex);
                }
                set1 = elementSet;
            }
            return set1;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public Set entrySet()
        {
            Set set1;
            synchronized (mutex)
            {
                if (entrySet == null)
                {
                    entrySet = Synchronized.typePreservingSet(_mthdelegate().entrySet(), mutex);
                }
                set1 = entrySet;
            }
            return set1;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public boolean equals(Object obj)
        {
            if (obj == this)
            {
                return true;
            }
            boolean flag;
            synchronized (mutex)
            {
                flag = _mthdelegate().equals(obj);
            }
            return flag;
            obj;
            obj1;
            JVM INSTR monitorexit ;
            throw obj;
        }

        public int hashCode()
        {
            int i;
            synchronized (mutex)
            {
                i = _mthdelegate().hashCode();
            }
            return i;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public int remove(Object obj, int i)
        {
            synchronized (mutex)
            {
                i = _mthdelegate().remove(obj, i);
            }
            return i;
            obj;
            obj1;
            JVM INSTR monitorexit ;
            throw obj;
        }

        public int setCount(Object obj, int i)
        {
            synchronized (mutex)
            {
                i = _mthdelegate().setCount(obj, i);
            }
            return i;
            obj;
            obj1;
            JVM INSTR monitorexit ;
            throw obj;
        }

        public boolean setCount(Object obj, int i, int j)
        {
            boolean flag;
            synchronized (mutex)
            {
                flag = _mthdelegate().setCount(obj, i, j);
            }
            return flag;
            obj;
            obj1;
            JVM INSTR monitorexit ;
            throw obj;
        }

        SynchronizedMultiset(Multiset multiset1, Object obj)
        {
            super(multiset1, obj);
        }
    }

    static class SynchronizedObject
        implements Serializable
    {

        private static final long serialVersionUID = 0L;
        final Object _flddelegate;
        final Object mutex;

        private void writeObject(ObjectOutputStream objectoutputstream)
            throws IOException
        {
            synchronized (mutex)
            {
                objectoutputstream.defaultWriteObject();
            }
            return;
            objectoutputstream;
            obj;
            JVM INSTR monitorexit ;
            throw objectoutputstream;
        }

        Object _mthdelegate()
        {
            return _flddelegate;
        }

        public String toString()
        {
            String s;
            synchronized (mutex)
            {
                s = _flddelegate.toString();
            }
            return s;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        SynchronizedObject(Object obj, Object obj1)
        {
            _flddelegate = Preconditions.checkNotNull(obj);
            obj = obj1;
            if (obj1 == null)
            {
                obj = this;
            }
            mutex = obj;
        }
    }

    private static class SynchronizedRandomAccessList extends SynchronizedList
        implements RandomAccess
    {

        private static final long serialVersionUID = 0L;

        SynchronizedRandomAccessList(List list1, Object obj)
        {
            super(list1, obj);
        }
    }

    static class SynchronizedSet extends SynchronizedCollection
        implements Set
    {

        private static final long serialVersionUID = 0L;

        volatile Object _mthdelegate()
        {
            return _mthdelegate();
        }

        volatile Collection _mthdelegate()
        {
            return _mthdelegate();
        }

        Set _mthdelegate()
        {
            return (Set)super._mthdelegate();
        }

        public boolean equals(Object obj)
        {
            if (obj == this)
            {
                return true;
            }
            boolean flag;
            synchronized (mutex)
            {
                flag = _mthdelegate().equals(obj);
            }
            return flag;
            obj;
            obj1;
            JVM INSTR monitorexit ;
            throw obj;
        }

        public int hashCode()
        {
            int i;
            synchronized (mutex)
            {
                i = _mthdelegate().hashCode();
            }
            return i;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        SynchronizedSet(Set set1, Object obj)
        {
            super(set1, obj);
        }
    }

    private static class SynchronizedSetMultimap extends SynchronizedMultimap
        implements SetMultimap
    {

        private static final long serialVersionUID = 0L;
        transient Set entrySet;

        volatile Multimap _mthdelegate()
        {
            return _mthdelegate();
        }

        SetMultimap _mthdelegate()
        {
            return (SetMultimap)super._mthdelegate();
        }

        volatile Object _mthdelegate()
        {
            return _mthdelegate();
        }

        public volatile Collection entries()
        {
            return entries();
        }

        public Set entries()
        {
            Set set1;
            synchronized (mutex)
            {
                if (entrySet == null)
                {
                    entrySet = Synchronized.set(_mthdelegate().entries(), mutex);
                }
                set1 = entrySet;
            }
            return set1;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public volatile Collection get(Object obj)
        {
            return get(obj);
        }

        public Set get(Object obj)
        {
            synchronized (mutex)
            {
                obj = Synchronized.set(_mthdelegate().get(obj), mutex);
            }
            return ((Set) (obj));
            obj;
            obj1;
            JVM INSTR monitorexit ;
            throw obj;
        }

        public volatile Collection removeAll(Object obj)
        {
            return removeAll(obj);
        }

        public Set removeAll(Object obj)
        {
            synchronized (mutex)
            {
                obj = _mthdelegate().removeAll(obj);
            }
            return ((Set) (obj));
            obj;
            obj1;
            JVM INSTR monitorexit ;
            throw obj;
        }

        public volatile Collection replaceValues(Object obj, Iterable iterable)
        {
            return replaceValues(obj, iterable);
        }

        public Set replaceValues(Object obj, Iterable iterable)
        {
            synchronized (mutex)
            {
                obj = _mthdelegate().replaceValues(obj, iterable);
            }
            return ((Set) (obj));
            obj;
            obj1;
            JVM INSTR monitorexit ;
            throw obj;
        }

        SynchronizedSetMultimap(SetMultimap setmultimap, Object obj)
        {
            super(setmultimap, obj);
        }
    }

    static class SynchronizedSortedMap extends SynchronizedMap
        implements SortedMap
    {

        private static final long serialVersionUID = 0L;

        public Comparator comparator()
        {
            Comparator comparator1;
            synchronized (mutex)
            {
                comparator1 = _mthdelegate().comparator();
            }
            return comparator1;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        volatile Object _mthdelegate()
        {
            return _mthdelegate();
        }

        volatile Map _mthdelegate()
        {
            return _mthdelegate();
        }

        SortedMap _mthdelegate()
        {
            return (SortedMap)super._mthdelegate();
        }

        public Object firstKey()
        {
            Object obj1;
            synchronized (mutex)
            {
                obj1 = _mthdelegate().firstKey();
            }
            return obj1;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public SortedMap headMap(Object obj)
        {
            synchronized (mutex)
            {
                obj = Synchronized.sortedMap(_mthdelegate().headMap(obj), mutex);
            }
            return ((SortedMap) (obj));
            obj;
            obj1;
            JVM INSTR monitorexit ;
            throw obj;
        }

        public Object lastKey()
        {
            Object obj1;
            synchronized (mutex)
            {
                obj1 = _mthdelegate().lastKey();
            }
            return obj1;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public SortedMap subMap(Object obj, Object obj1)
        {
            synchronized (mutex)
            {
                obj = Synchronized.sortedMap(_mthdelegate().subMap(obj, obj1), mutex);
            }
            return ((SortedMap) (obj));
            obj;
            obj2;
            JVM INSTR monitorexit ;
            throw obj;
        }

        public SortedMap tailMap(Object obj)
        {
            synchronized (mutex)
            {
                obj = Synchronized.sortedMap(_mthdelegate().tailMap(obj), mutex);
            }
            return ((SortedMap) (obj));
            obj;
            obj1;
            JVM INSTR monitorexit ;
            throw obj;
        }

        SynchronizedSortedMap(SortedMap sortedmap, Object obj)
        {
            super(sortedmap, obj);
        }
    }

    static class SynchronizedSortedSet extends SynchronizedSet
        implements SortedSet
    {

        private static final long serialVersionUID = 0L;

        public Comparator comparator()
        {
            Comparator comparator1;
            synchronized (mutex)
            {
                comparator1 = _mthdelegate().comparator();
            }
            return comparator1;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        volatile Object _mthdelegate()
        {
            return _mthdelegate();
        }

        volatile Collection _mthdelegate()
        {
            return _mthdelegate();
        }

        volatile Set _mthdelegate()
        {
            return _mthdelegate();
        }

        SortedSet _mthdelegate()
        {
            return (SortedSet)super._mthdelegate();
        }

        public Object first()
        {
            Object obj1;
            synchronized (mutex)
            {
                obj1 = _mthdelegate().first();
            }
            return obj1;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public SortedSet headSet(Object obj)
        {
            synchronized (mutex)
            {
                obj = Synchronized.sortedSet(_mthdelegate().headSet(obj), mutex);
            }
            return ((SortedSet) (obj));
            obj;
            obj1;
            JVM INSTR monitorexit ;
            throw obj;
        }

        public Object last()
        {
            Object obj1;
            synchronized (mutex)
            {
                obj1 = _mthdelegate().last();
            }
            return obj1;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public SortedSet subSet(Object obj, Object obj1)
        {
            synchronized (mutex)
            {
                obj = Synchronized.sortedSet(_mthdelegate().subSet(obj, obj1), mutex);
            }
            return ((SortedSet) (obj));
            obj;
            obj2;
            JVM INSTR monitorexit ;
            throw obj;
        }

        public SortedSet tailSet(Object obj)
        {
            synchronized (mutex)
            {
                obj = Synchronized.sortedSet(_mthdelegate().tailSet(obj), mutex);
            }
            return ((SortedSet) (obj));
            obj;
            obj1;
            JVM INSTR monitorexit ;
            throw obj;
        }

        SynchronizedSortedSet(SortedSet sortedset, Object obj)
        {
            super(sortedset, obj);
        }
    }

    private static class SynchronizedSortedSetMultimap extends SynchronizedSetMultimap
        implements SortedSetMultimap
    {

        private static final long serialVersionUID = 0L;

        volatile Multimap _mthdelegate()
        {
            return _mthdelegate();
        }

        volatile SetMultimap _mthdelegate()
        {
            return _mthdelegate();
        }

        SortedSetMultimap _mthdelegate()
        {
            return (SortedSetMultimap)super._mthdelegate();
        }

        volatile Object _mthdelegate()
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
            synchronized (mutex)
            {
                obj = Synchronized.sortedSet(_mthdelegate().get(obj), mutex);
            }
            return ((SortedSet) (obj));
            obj;
            obj1;
            JVM INSTR monitorexit ;
            throw obj;
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
            synchronized (mutex)
            {
                obj = _mthdelegate().removeAll(obj);
            }
            return ((SortedSet) (obj));
            obj;
            obj1;
            JVM INSTR monitorexit ;
            throw obj;
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
            synchronized (mutex)
            {
                obj = _mthdelegate().replaceValues(obj, iterable);
            }
            return ((SortedSet) (obj));
            obj;
            obj1;
            JVM INSTR monitorexit ;
            throw obj;
        }

        public Comparator valueComparator()
        {
            Comparator comparator;
            synchronized (mutex)
            {
                comparator = _mthdelegate().valueComparator();
            }
            return comparator;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        SynchronizedSortedSetMultimap(SortedSetMultimap sortedsetmultimap, Object obj)
        {
            super(sortedsetmultimap, obj);
        }
    }


    private Synchronized()
    {
    }

    static BiMap biMap(BiMap bimap, Object obj)
    {
        return new SynchronizedBiMap(bimap, obj, null);
    }

    private static Collection collection(Collection collection1, Object obj)
    {
        return new SynchronizedCollection(collection1, obj);
    }

    private static List list(List list1, Object obj)
    {
        if (list1 instanceof RandomAccess)
        {
            return new SynchronizedRandomAccessList(list1, obj);
        } else
        {
            return new SynchronizedList(list1, obj);
        }
    }

    static ListMultimap listMultimap(ListMultimap listmultimap, Object obj)
    {
        return new SynchronizedListMultimap(listmultimap, obj);
    }

    static Map map(Map map1, Object obj)
    {
        return new SynchronizedMap(map1, obj);
    }

    static Multimap multimap(Multimap multimap1, Object obj)
    {
        return new SynchronizedMultimap(multimap1, obj);
    }

    static Multiset multiset(Multiset multiset1, Object obj)
    {
        return new SynchronizedMultiset(multiset1, obj);
    }

    static Set set(Set set1, Object obj)
    {
        return new SynchronizedSet(set1, obj);
    }

    static SetMultimap setMultimap(SetMultimap setmultimap, Object obj)
    {
        return new SynchronizedSetMultimap(setmultimap, obj);
    }

    static SortedMap sortedMap(SortedMap sortedmap, Object obj)
    {
        return new SynchronizedSortedMap(sortedmap, obj);
    }

    private static SortedSet sortedSet(SortedSet sortedset, Object obj)
    {
        return new SynchronizedSortedSet(sortedset, obj);
    }

    static SortedSetMultimap sortedSetMultimap(SortedSetMultimap sortedsetmultimap, Object obj)
    {
        return new SynchronizedSortedSetMultimap(sortedsetmultimap, obj);
    }

    private static Collection typePreservingCollection(Collection collection1, Object obj)
    {
        if (collection1 instanceof SortedSet)
        {
            return sortedSet((SortedSet)collection1, obj);
        }
        if (collection1 instanceof Set)
        {
            return set((Set)collection1, obj);
        }
        if (collection1 instanceof List)
        {
            return list((List)collection1, obj);
        } else
        {
            return collection(collection1, obj);
        }
    }

    private static Set typePreservingSet(Set set1, Object obj)
    {
        if (set1 instanceof SortedSet)
        {
            return sortedSet((SortedSet)set1, obj);
        } else
        {
            return set(set1, obj);
        }
    }





}
