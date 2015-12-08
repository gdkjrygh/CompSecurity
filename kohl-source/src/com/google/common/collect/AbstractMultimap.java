// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

// Referenced classes of package com.google.common.collect:
//            Multimap, SetMultimap, Collections2, Multiset, 
//            Maps, Iterators, Sets, AbstractMultiset

abstract class AbstractMultimap
    implements Multimap, Serializable
{
    class AsMap.AsMapEntries extends AbstractSet
    {

        final AsMap this$1;

        public boolean contains(Object obj)
        {
            return Collections2.safeContains(submap.entrySet(), obj);
        }

        public Iterator iterator()
        {
            return new AsMapIterator();
        }

        public boolean remove(Object obj)
        {
            if (!contains(obj))
            {
                return false;
            } else
            {
                obj = (java.util.Map.Entry)obj;
                removeValuesForKey(((java.util.Map.Entry) (obj)).getKey());
                return true;
            }
        }

        public int size()
        {
            return submap.size();
        }

        AsMap.AsMapEntries()
        {
            this$1 = AsMap.this;
            super();
        }
    }

    private class Entries extends AbstractCollection
    {

        final AbstractMultimap this$0;

        public void clear()
        {
            AbstractMultimap.this.clear();
        }

        public boolean contains(Object obj)
        {
            if (!(obj instanceof java.util.Map.Entry))
            {
                return false;
            } else
            {
                obj = (java.util.Map.Entry)obj;
                return containsEntry(((java.util.Map.Entry) (obj)).getKey(), ((java.util.Map.Entry) (obj)).getValue());
            }
        }

        public Iterator iterator()
        {
            return createEntryIterator();
        }

        public boolean remove(Object obj)
        {
            if (!(obj instanceof java.util.Map.Entry))
            {
                return false;
            } else
            {
                obj = (java.util.Map.Entry)obj;
                return AbstractMultimap.this.remove(((java.util.Map.Entry) (obj)).getKey(), ((java.util.Map.Entry) (obj)).getValue());
            }
        }

        public int size()
        {
            return totalSize;
        }

        private Entries()
        {
            this$0 = AbstractMultimap.this;
            super();
        }

    }

    private class EntrySet extends Entries
        implements Set
    {

        final AbstractMultimap this$0;

        public boolean equals(Object obj)
        {
            return Sets.equalsImpl(this, obj);
        }

        public int hashCode()
        {
            return Sets.hashCodeImpl(this);
        }

        private EntrySet()
        {
            this$0 = AbstractMultimap.this;
            super();
        }

    }

    private class MultisetEntry extends Multisets.AbstractEntry
    {

        final java.util.Map.Entry entry;
        final AbstractMultimap this$0;

        public int getCount()
        {
            return ((Collection)entry.getValue()).size();
        }

        public Object getElement()
        {
            return entry.getKey();
        }

        public MultisetEntry(java.util.Map.Entry entry1)
        {
            this$0 = AbstractMultimap.this;
            super();
            entry = entry1;
        }
    }

    private class MultisetEntryIterator
        implements Iterator
    {

        final Iterator asMapIterator;
        final AbstractMultimap this$0;

        public boolean hasNext()
        {
            return asMapIterator.hasNext();
        }

        public Multiset.Entry next()
        {
            return new MultisetEntry((java.util.Map.Entry)asMapIterator.next());
        }

        public volatile Object next()
        {
            return next();
        }

        public void remove()
        {
            asMapIterator.remove();
        }

        private MultisetEntryIterator()
        {
            this$0 = AbstractMultimap.this;
            super();
            asMapIterator = asMap().entrySet().iterator();
        }

    }

    private class MultisetKeyIterator
        implements Iterator
    {

        final Iterator entryIterator;
        final AbstractMultimap this$0;

        public boolean hasNext()
        {
            return entryIterator.hasNext();
        }

        public Object next()
        {
            return ((java.util.Map.Entry)entryIterator.next()).getKey();
        }

        public void remove()
        {
            entryIterator.remove();
        }

        private MultisetKeyIterator()
        {
            this$0 = AbstractMultimap.this;
            super();
            entryIterator = entries().iterator();
        }

    }

    private class MultisetView.EntrySet extends AbstractSet
    {

        final MultisetView this$1;

        public void clear()
        {
            AbstractMultimap.this.clear();
        }

        public boolean contains(Object obj)
        {
            if (obj instanceof Multiset.Entry)
            {
                obj = (Multiset.Entry)obj;
                Collection collection = (Collection)map.get(((Multiset.Entry) (obj)).getElement());
                if (collection != null && collection.size() == ((Multiset.Entry) (obj)).getCount())
                {
                    return true;
                }
            }
            return false;
        }

        public Iterator iterator()
        {
            return new MultisetEntryIterator();
        }

        public boolean remove(Object obj)
        {
            return contains(obj) && removeValuesForKey(((Multiset.Entry)obj).getElement()) > 0;
        }

        public int size()
        {
            return map.size();
        }

        private MultisetView.EntrySet()
        {
            this$1 = MultisetView.this;
            super();
        }

    }

    private class RandomAccessWrappedList extends WrappedList
        implements RandomAccess
    {

        final AbstractMultimap this$0;

        RandomAccessWrappedList(Object obj, List list, WrappedCollection wrappedcollection)
        {
            this$0 = AbstractMultimap.this;
            super(obj, list, wrappedcollection);
        }
    }

    private class SortedAsMap extends AsMap
        implements SortedMap
    {

        SortedSet sortedKeySet;
        final AbstractMultimap this$0;

        public Comparator comparator()
        {
            return sortedMap().comparator();
        }

        public Object firstKey()
        {
            return sortedMap().firstKey();
        }

        public SortedMap headMap(Object obj)
        {
            return new SortedAsMap(sortedMap().headMap(obj));
        }

        public volatile Set keySet()
        {
            return keySet();
        }

        public SortedSet keySet()
        {
            SortedSet sortedset = sortedKeySet;
            Object obj = sortedset;
            if (sortedset == null)
            {
                obj = new SortedKeySet(sortedMap());
                sortedKeySet = ((SortedSet) (obj));
            }
            return ((SortedSet) (obj));
        }

        public Object lastKey()
        {
            return sortedMap().lastKey();
        }

        SortedMap sortedMap()
        {
            return (SortedMap)submap;
        }

        public SortedMap subMap(Object obj, Object obj1)
        {
            return new SortedAsMap(sortedMap().subMap(obj, obj1));
        }

        public SortedMap tailMap(Object obj)
        {
            return new SortedAsMap(sortedMap().tailMap(obj));
        }

        SortedAsMap(SortedMap sortedmap)
        {
            this$0 = AbstractMultimap.this;
            super(sortedmap);
        }
    }

    private class SortedKeySet extends KeySet
        implements SortedSet
    {

        final AbstractMultimap this$0;

        public Comparator comparator()
        {
            return sortedMap().comparator();
        }

        public Object first()
        {
            return sortedMap().firstKey();
        }

        public SortedSet headSet(Object obj)
        {
            return new SortedKeySet(sortedMap().headMap(obj));
        }

        public Object last()
        {
            return sortedMap().lastKey();
        }

        SortedMap sortedMap()
        {
            return (SortedMap)subMap;
        }

        public SortedSet subSet(Object obj, Object obj1)
        {
            return new SortedKeySet(sortedMap().subMap(obj, obj1));
        }

        public SortedSet tailSet(Object obj)
        {
            return new SortedKeySet(sortedMap().tailMap(obj));
        }

        SortedKeySet(SortedMap sortedmap)
        {
            this$0 = AbstractMultimap.this;
            super(sortedmap);
        }
    }

    private class ValueIterator
        implements Iterator
    {

        final Iterator entryIterator;
        final AbstractMultimap this$0;

        public boolean hasNext()
        {
            return entryIterator.hasNext();
        }

        public Object next()
        {
            return ((java.util.Map.Entry)entryIterator.next()).getValue();
        }

        public void remove()
        {
            entryIterator.remove();
        }

        private ValueIterator()
        {
            this$0 = AbstractMultimap.this;
            super();
            entryIterator = createEntryIterator();
        }

    }

    private class Values extends AbstractCollection
    {

        final AbstractMultimap this$0;

        public void clear()
        {
            AbstractMultimap.this.clear();
        }

        public boolean contains(Object obj)
        {
            return containsValue(obj);
        }

        public Iterator iterator()
        {
            return new ValueIterator();
        }

        public int size()
        {
            return totalSize;
        }

        private Values()
        {
            this$0 = AbstractMultimap.this;
            super();
        }

    }

    private class WrappedCollection extends AbstractCollection
    {

        final WrappedCollection ancestor;
        final Collection ancestorDelegate;
        Collection _flddelegate;
        final Object key;
        final AbstractMultimap this$0;

        public boolean add(Object obj)
        {
            refreshIfEmpty();
            boolean flag = _flddelegate.isEmpty();
            boolean flag1 = _flddelegate.add(obj);
            if (flag1)
            {
                int i = 
// JavaClassFileOutputException: get_constant: invalid tag

        public boolean addAll(Collection collection)
        {
            boolean flag;
            if (collection.isEmpty())
            {
                flag = false;
            } else
            {
                int i = size();
                boolean flag1 = _flddelegate.addAll(collection);
                flag = flag1;
                if (flag1)
                {
                    int j = _flddelegate.size();
                    collection = 
// JavaClassFileOutputException: get_constant: invalid tag

        void addToMap()
        {
            if (ancestor != null)
            {
                ancestor.addToMap();
                return;
            } else
            {
                map.put(key, _flddelegate);
                return;
            }
        }

        public void clear()
        {
            int i = size();
            if (i == 0)
            {
                return;
            } else
            {
                _flddelegate.clear();
                i = 
// JavaClassFileOutputException: get_constant: invalid tag

        public boolean contains(Object obj)
        {
            refreshIfEmpty();
            return _flddelegate.contains(obj);
        }

        public boolean containsAll(Collection collection)
        {
            refreshIfEmpty();
            return _flddelegate.containsAll(collection);
        }

        public boolean equals(Object obj)
        {
            if (obj == this)
            {
                return true;
            } else
            {
                refreshIfEmpty();
                return _flddelegate.equals(obj);
            }
        }

        WrappedCollection getAncestor()
        {
            return ancestor;
        }

        Collection getDelegate()
        {
            return _flddelegate;
        }

        Object getKey()
        {
            return key;
        }

        public int hashCode()
        {
            refreshIfEmpty();
            return _flddelegate.hashCode();
        }

        public Iterator iterator()
        {
            refreshIfEmpty();
            return new WrappedIterator();
        }

        void refreshIfEmpty()
        {
            if (ancestor != null)
            {
                ancestor.refreshIfEmpty();
                if (ancestor.getDelegate() != ancestorDelegate)
                {
                    throw new ConcurrentModificationException();
                }
            } else
            if (_flddelegate.isEmpty())
            {
                Collection collection = (Collection)map.get(key);
                if (collection != null)
                {
                    _flddelegate = collection;
                }
            }
        }

        public boolean remove(Object obj)
        {
            refreshIfEmpty();
            boolean flag = _flddelegate.remove(obj);
            if (flag)
            {
                int i = 
// JavaClassFileOutputException: get_constant: invalid tag

        public boolean removeAll(Collection collection)
        {
            boolean flag;
            if (collection.isEmpty())
            {
                flag = false;
            } else
            {
                int i = size();
                boolean flag1 = _flddelegate.removeAll(collection);
                flag = flag1;
                if (flag1)
                {
                    int j = _flddelegate.size();
                    collection = 
// JavaClassFileOutputException: get_constant: invalid tag

        void removeIfEmpty()
        {
            if (ancestor != null)
            {
                ancestor.removeIfEmpty();
            } else
            if (_flddelegate.isEmpty())
            {
                map.remove(key);
                return;
            }
        }

        public boolean retainAll(Collection collection)
        {
            Preconditions.checkNotNull(collection);
            int i = size();
            boolean flag = _flddelegate.retainAll(collection);
            if (flag)
            {
                int j = _flddelegate.size();
                collection = 
// JavaClassFileOutputException: get_constant: invalid tag

        public int size()
        {
            refreshIfEmpty();
            return _flddelegate.size();
        }

        public String toString()
        {
            refreshIfEmpty();
            return _flddelegate.toString();
        }

        WrappedCollection(Object obj, Collection collection, WrappedCollection wrappedcollection)
        {
            this$0 = AbstractMultimap.this;
            super();
            key = obj;
            _flddelegate = collection;
            ancestor = wrappedcollection;
            if (wrappedcollection == null)
            {
                abstractmultimap = null;
            } else
            {
                abstractmultimap = wrappedcollection.getDelegate();
            }
            ancestorDelegate = AbstractMultimap.this;
        }
    }

    private class WrappedSet extends WrappedCollection
        implements Set
    {

        final AbstractMultimap this$0;

        WrappedSet(Object obj, Set set)
        {
            this$0 = AbstractMultimap.this;
            super(obj, set, null);
        }
    }

    private class WrappedSortedSet extends WrappedCollection
        implements SortedSet
    {

        final AbstractMultimap this$0;

        public Comparator comparator()
        {
            return getSortedSetDelegate().comparator();
        }

        public Object first()
        {
            refreshIfEmpty();
            return getSortedSetDelegate().first();
        }

        SortedSet getSortedSetDelegate()
        {
            return (SortedSet)getDelegate();
        }

        public SortedSet headSet(Object obj)
        {
            refreshIfEmpty();
            AbstractMultimap abstractmultimap = AbstractMultimap.this;
            Object obj1 = getKey();
            SortedSet sortedset = getSortedSetDelegate().headSet(obj);
            if (getAncestor() == null)
            {
                obj = this;
            } else
            {
                obj = getAncestor();
            }
            return abstractmultimap. new WrappedSortedSet(obj1, sortedset, ((WrappedCollection) (obj)));
        }

        public Object last()
        {
            refreshIfEmpty();
            return getSortedSetDelegate().last();
        }

        public SortedSet subSet(Object obj, Object obj1)
        {
            refreshIfEmpty();
            AbstractMultimap abstractmultimap = AbstractMultimap.this;
            Object obj2 = getKey();
            obj1 = getSortedSetDelegate().subSet(obj, obj1);
            if (getAncestor() == null)
            {
                obj = this;
            } else
            {
                obj = getAncestor();
            }
            return abstractmultimap. new WrappedSortedSet(obj2, ((SortedSet) (obj1)), ((WrappedCollection) (obj)));
        }

        public SortedSet tailSet(Object obj)
        {
            refreshIfEmpty();
            AbstractMultimap abstractmultimap = AbstractMultimap.this;
            Object obj1 = getKey();
            SortedSet sortedset = getSortedSetDelegate().tailSet(obj);
            if (getAncestor() == null)
            {
                obj = this;
            } else
            {
                obj = getAncestor();
            }
            return abstractmultimap. new WrappedSortedSet(obj1, sortedset, ((WrappedCollection) (obj)));
        }

        WrappedSortedSet(Object obj, SortedSet sortedset, WrappedCollection wrappedcollection)
        {
            this$0 = AbstractMultimap.this;
            super(obj, sortedset, wrappedcollection);
        }
    }


    private static final long serialVersionUID = 0x21f766b1f568c81dL;
    private transient Map asMap;
    private transient Collection entries;
    private transient Set keySet;
    private transient Map map;
    private transient Multiset multiset;
    private transient int totalSize;
    private transient Collection valuesCollection;

    protected AbstractMultimap(Map map1)
    {
        Preconditions.checkArgument(map1.isEmpty());
        map = map1;
    }

    private Map createAsMap()
    {
        if (map instanceof SortedMap)
        {
            return new SortedAsMap((SortedMap)map);
        } else
        {
            return new AsMap(map);
        }
    }

    private Collection createEntries()
    {
        if (this instanceof SetMultimap)
        {
            return new EntrySet();
        } else
        {
            return new Entries();
        }
    }

    private Set createKeySet()
    {
        if (map instanceof SortedMap)
        {
            return new SortedKeySet((SortedMap)map);
        } else
        {
            return new KeySet(map);
        }
    }

    private Collection getOrCreateCollection(Object obj)
    {
        Collection collection1 = (Collection)map.get(obj);
        Collection collection = collection1;
        if (collection1 == null)
        {
            collection = createCollection(obj);
            map.put(obj, collection);
        }
        return collection;
    }

    private Iterator iteratorOrListIterator(Collection collection)
    {
        if (collection instanceof List)
        {
            return ((List)collection).listIterator();
        } else
        {
            return collection.iterator();
        }
    }

    private int removeValuesForKey(Object obj)
    {
        int i;
        try
        {
            obj = (Collection)map.remove(obj);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return 0;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return 0;
        }
        i = 0;
        if (obj != null)
        {
            i = ((Collection) (obj)).size();
            ((Collection) (obj)).clear();
            totalSize = totalSize - i;
        }
        return i;
    }

    private Collection unmodifiableCollectionSubclass(Collection collection)
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

    private Collection wrapCollection(Object obj, Collection collection)
    {
        if (collection instanceof SortedSet)
        {
            return new WrappedSortedSet(obj, (SortedSet)collection, null);
        }
        if (collection instanceof Set)
        {
            return new WrappedSet(obj, (Set)collection);
        }
        if (collection instanceof List)
        {
            return wrapList(obj, (List)collection, null);
        } else
        {
            return new WrappedCollection(obj, collection, null);
        }
    }

    private List wrapList(Object obj, List list, WrappedCollection wrappedcollection)
    {
        if (list instanceof RandomAccess)
        {
            return new RandomAccessWrappedList(obj, list, wrappedcollection);
        } else
        {
            return new WrappedList(obj, list, wrappedcollection);
        }
    }

    public Map asMap()
    {
        Map map2 = asMap;
        Map map1 = map2;
        if (map2 == null)
        {
            map1 = createAsMap();
            asMap = map1;
        }
        return map1;
    }

    Map backingMap()
    {
        return map;
    }

    public void clear()
    {
        for (Iterator iterator = map.values().iterator(); iterator.hasNext(); ((Collection)iterator.next()).clear()) { }
        map.clear();
        totalSize = 0;
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
            if (((Collection)iterator.next()).contains(obj))
            {
                return true;
            }
        }

        return false;
    }

    abstract Collection createCollection();

    Collection createCollection(Object obj)
    {
        return createCollection();
    }

    Iterator createEntryIterator()
    {
        return new EntryIterator();
    }

    public Collection entries()
    {
        Collection collection1 = entries;
        Collection collection = collection1;
        if (collection1 == null)
        {
            collection = createEntries();
            entries = collection;
        }
        return collection;
    }

    public boolean equals(Object obj)
    {
        if (obj == this)
        {
            return true;
        }
        if (obj instanceof Multimap)
        {
            obj = (Multimap)obj;
            return map.equals(((Multimap) (obj)).asMap());
        } else
        {
            return false;
        }
    }

    public Collection get(Object obj)
    {
        Collection collection1 = (Collection)map.get(obj);
        Collection collection = collection1;
        if (collection1 == null)
        {
            collection = createCollection(obj);
        }
        return wrapCollection(obj, collection);
    }

    public int hashCode()
    {
        return map.hashCode();
    }

    public boolean isEmpty()
    {
        return totalSize == 0;
    }

    public Set keySet()
    {
        Set set1 = keySet;
        Set set = set1;
        if (set1 == null)
        {
            set = createKeySet();
            keySet = set;
        }
        return set;
    }

    public Multiset keys()
    {
        Multiset multiset1 = multiset;
        Object obj = multiset1;
        if (multiset1 == null)
        {
            obj = new MultisetView();
            multiset = ((Multiset) (obj));
        }
        return ((Multiset) (obj));
    }

    public boolean put(Object obj, Object obj1)
    {
        if (getOrCreateCollection(obj).add(obj1))
        {
            totalSize = totalSize + 1;
            return true;
        } else
        {
            return false;
        }
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
        int i;
        boolean flag;
        if (!iterable.iterator().hasNext())
        {
            return false;
        }
        obj = getOrCreateCollection(obj);
        i = ((Collection) (obj)).size();
        flag = false;
        if (!(iterable instanceof Collection)) goto _L2; else goto _L1
_L1:
        boolean flag1 = ((Collection) (obj)).addAll(Collections2.cast(iterable));
_L4:
        totalSize = totalSize + (((Collection) (obj)).size() - i);
        return flag1;
_L2:
        iterable = iterable.iterator();
        do
        {
            flag1 = flag;
            if (!iterable.hasNext())
            {
                continue;
            }
            flag |= ((Collection) (obj)).add(iterable.next());
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public boolean remove(Object obj, Object obj1)
    {
        Collection collection = (Collection)map.get(obj);
        boolean flag;
        if (collection == null)
        {
            flag = false;
        } else
        {
            boolean flag1 = collection.remove(obj1);
            flag = flag1;
            if (flag1)
            {
                totalSize = totalSize - 1;
                flag = flag1;
                if (collection.isEmpty())
                {
                    map.remove(obj);
                    return flag1;
                }
            }
        }
        return flag;
    }

    public Collection removeAll(Object obj)
    {
        obj = (Collection)map.remove(obj);
        Collection collection = createCollection();
        if (obj != null)
        {
            collection.addAll(((Collection) (obj)));
            totalSize = totalSize - ((Collection) (obj)).size();
            ((Collection) (obj)).clear();
        }
        return unmodifiableCollectionSubclass(collection);
    }

    public Collection replaceValues(Object obj, Iterable iterable)
    {
        iterable = iterable.iterator();
        if (!iterable.hasNext())
        {
            return removeAll(obj);
        }
        obj = getOrCreateCollection(obj);
        Collection collection = createCollection();
        collection.addAll(((Collection) (obj)));
        totalSize = totalSize - ((Collection) (obj)).size();
        ((Collection) (obj)).clear();
        do
        {
            if (!iterable.hasNext())
            {
                break;
            }
            if (((Collection) (obj)).add(iterable.next()))
            {
                totalSize = totalSize + 1;
            }
        } while (true);
        return unmodifiableCollectionSubclass(collection);
    }

    final void setMap(Map map1)
    {
        map = map1;
        totalSize = 0;
        map1 = map1.values().iterator();
        while (map1.hasNext()) 
        {
            Collection collection = (Collection)map1.next();
            boolean flag;
            if (!collection.isEmpty())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkArgument(flag);
            totalSize = totalSize + collection.size();
        }
    }

    public int size()
    {
        return totalSize;
    }

    public String toString()
    {
        return map.toString();
    }

    public Collection values()
    {
        Collection collection = valuesCollection;
        Object obj = collection;
        if (collection == null)
        {
            obj = new Values();
            valuesCollection = ((Collection) (obj));
        }
        return ((Collection) (obj));
    }






/*
    static int access$208(AbstractMultimap abstractmultimap)
    {
        int i = abstractmultimap.totalSize;
        abstractmultimap.totalSize = i + 1;
        return i;
    }

*/


/*
    static int access$210(AbstractMultimap abstractmultimap)
    {
        int i = abstractmultimap.totalSize;
        abstractmultimap.totalSize = i - 1;
        return i;
    }

*/


/*
    static int access$212(AbstractMultimap abstractmultimap, int i)
    {
        i = abstractmultimap.totalSize + i;
        abstractmultimap.totalSize = i;
        return i;
    }

*/


/*
    static int access$220(AbstractMultimap abstractmultimap, int i)
    {
        i = abstractmultimap.totalSize - i;
        abstractmultimap.totalSize = i;
        return i;
    }

*/


}
