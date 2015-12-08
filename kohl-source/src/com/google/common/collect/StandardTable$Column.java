// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import java.util.AbstractCollection;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            StandardTable, ImmutableEntry, AbstractIterator, AbstractMapEntry

private class ll extends Map
{
    class EntrySet extends AbstractSet
    {

        final StandardTable.Column this$1;

        public void clear()
        {
            Predicate predicate = Predicates.alwaysTrue();
            removePredicate(predicate);
        }

        public boolean contains(Object obj)
        {
            if (obj instanceof java.util.Map.Entry)
            {
                obj = (java.util.Map.Entry)obj;
                return StandardTable.access$300(this$0, ((java.util.Map.Entry) (obj)).getKey(), columnKey, ((java.util.Map.Entry) (obj)).getValue());
            } else
            {
                return false;
            }
        }

        public boolean isEmpty()
        {
            return !containsColumn(columnKey);
        }

        public Iterator iterator()
        {
            return new EntrySetIterator();
        }

        public boolean remove(Object obj)
        {
            if (obj instanceof java.util.Map.Entry)
            {
                obj = (java.util.Map.Entry)obj;
                return StandardTable.access$400(this$0, ((java.util.Map.Entry) (obj)).getKey(), columnKey, ((java.util.Map.Entry) (obj)).getValue());
            } else
            {
                return false;
            }
        }

        public boolean removeAll(Collection collection)
        {
            boolean flag = false;
            for (collection = collection.iterator(); collection.hasNext();)
            {
                flag |= remove(collection.next());
            }

            return flag;
        }

        public boolean retainAll(Collection collection)
        {
            return removePredicate(Predicates.not(Predicates.in(collection)));
        }

        public int size()
        {
            int i = 0;
            Iterator iterator1 = backingMap.values().iterator();
            do
            {
                if (!iterator1.hasNext())
                {
                    break;
                }
                if (((Map)iterator1.next()).containsKey(columnKey))
                {
                    i++;
                }
            } while (true);
            return i;
        }

        EntrySet()
        {
            this$1 = StandardTable.Column.this;
            super();
        }
    }

    class EntrySetIterator extends AbstractIterator
    {

        final Iterator iterator;
        final StandardTable.Column this$1;

        protected volatile Object computeNext()
        {
            return computeNext();
        }

        protected java.util.Map.Entry computeNext()
        {
            while (iterator.hasNext()) 
            {
                java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
                if (((Map)entry.getValue()).containsKey(columnKey))
                {
                    return entry. new AbstractMapEntry() {

                        final EntrySetIterator this$2;
                        final java.util.Map.Entry val$entry;

                        public Object getKey()
                        {
                            return entry.getKey();
                        }

                        public Object getValue()
                        {
                            return ((Map)entry.getValue()).get(columnKey);
                        }

                        public Object setValue(Object obj)
                        {
                            return ((Map)entry.getValue()).put(columnKey, Preconditions.checkNotNull(obj));
                        }

            
            {
                this$2 = final_entrysetiterator;
                entry = java.util.Map.Entry.this;
                super();
            }
                    };
                }
            }
            return (java.util.Map.Entry)endOfData();
        }

        EntrySetIterator()
        {
            this$1 = StandardTable.Column.this;
            super();
            iterator = backingMap.entrySet().iterator();
        }
    }

    class KeySet extends AbstractSet
    {

        final StandardTable.Column this$1;

        public void clear()
        {
            entrySet().clear();
        }

        public boolean contains(Object obj)
        {
            return StandardTable.this.contains(obj, columnKey);
        }

        public boolean isEmpty()
        {
            return !containsColumn(columnKey);
        }

        public Iterator iterator()
        {
            return StandardTable.keyIteratorImpl(StandardTable.Column.this);
        }

        public boolean remove(Object obj)
        {
            return StandardTable.this.remove(obj, columnKey) != null;
        }

        public boolean removeAll(Collection collection)
        {
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
            collection = collection. new Predicate() {

                final KeySet this$2;
                final Collection val$c;

                public volatile boolean apply(Object obj)
                {
                    return apply((java.util.Map.Entry)obj);
                }

                public boolean apply(java.util.Map.Entry entry)
                {
                    return !c.contains(entry.getKey());
                }

            
            {
                this$2 = final_keyset;
                c = Collection.this;
                super();
            }
            };
            return removePredicate(collection);
        }

        public int size()
        {
            return entrySet().size();
        }

        KeySet()
        {
            this$1 = StandardTable.Column.this;
            super();
        }
    }

    class Values extends AbstractCollection
    {

        final StandardTable.Column this$1;

        public void clear()
        {
            entrySet().clear();
        }

        public boolean isEmpty()
        {
            return !containsColumn(columnKey);
        }

        public Iterator iterator()
        {
            return StandardTable.valueIteratorImpl(StandardTable.Column.this);
        }

        public boolean remove(Object obj)
        {
            if (obj != null) goto _L2; else goto _L1
_L1:
            return false;
_L2:
            Iterator iterator1;
            Map map;
            iterator1 = backingMap.values().iterator();
            do
            {
                if (!iterator1.hasNext())
                {
                    continue; /* Loop/switch isn't completed */
                }
                map = (Map)iterator1.next();
            } while (!map.entrySet().remove(new ImmutableEntry(columnKey, obj)));
            break; /* Loop/switch isn't completed */
            if (true) goto _L1; else goto _L3
_L3:
            if (map.isEmpty())
            {
                iterator1.remove();
            }
            return true;
        }

        public boolean removeAll(Collection collection)
        {
            Preconditions.checkNotNull(collection);
            collection = collection. new Predicate() {

                final Values this$2;
                final Collection val$c;

                public volatile boolean apply(Object obj)
                {
                    return apply((java.util.Map.Entry)obj);
                }

                public boolean apply(java.util.Map.Entry entry)
                {
                    return c.contains(entry.getValue());
                }

            
            {
                this$2 = final_values1;
                c = Collection.this;
                super();
            }
            };
            return removePredicate(collection);
        }

        public boolean retainAll(Collection collection)
        {
            Preconditions.checkNotNull(collection);
            collection = collection. new Predicate() {

                final Values this$2;
                final Collection val$c;

                public volatile boolean apply(Object obj)
                {
                    return apply((java.util.Map.Entry)obj);
                }

                public boolean apply(java.util.Map.Entry entry)
                {
                    return !c.contains(entry.getValue());
                }

            
            {
                this$2 = final_values1;
                c = Collection.this;
                super();
            }
            };
            return removePredicate(collection);
        }

        public int size()
        {
            return entrySet().size();
        }

        Values()
        {
            this$1 = StandardTable.Column.this;
            super();
        }
    }


    final Object columnKey;
    Values columnValues;
    KeySet keySet;
    final StandardTable this$0;

    public boolean containsKey(Object obj)
    {
        return contains(obj, columnKey);
    }

    public Set createEntrySet()
    {
        return new EntrySet();
    }

    public Object get(Object obj)
    {
        return StandardTable.this.get(obj, columnKey);
    }

    public Set keySet()
    {
        KeySet keyset1 = keySet;
        KeySet keyset = keyset1;
        if (keyset1 == null)
        {
            keyset = new KeySet();
            keySet = keyset;
        }
        return keyset;
    }

    public Object put(Object obj, Object obj1)
    {
        return StandardTable.this.put(obj, columnKey, obj1);
    }

    public Object remove(Object obj)
    {
        return StandardTable.this.remove(obj, columnKey);
    }

    boolean removePredicate(Predicate predicate)
    {
        boolean flag = false;
        Iterator iterator = backingMap.entrySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            java.util.e e = (java.util.ardTable.backingMap)iterator.next();
            Map map = (Map)e.backingMap();
            Object obj = map.get(columnKey);
            if (obj != null && predicate.apply(new ImmutableEntry(e.ableEntry(), obj)))
            {
                map.remove(columnKey);
                boolean flag1 = true;
                flag = flag1;
                if (map.isEmpty())
                {
                    iterator.remove();
                    flag = flag1;
                }
            }
        } while (true);
        return flag;
    }

    public Collection values()
    {
        Values values2 = columnValues;
        Values values1 = values2;
        if (values2 == null)
        {
            values1 = new Values();
            columnValues = values1;
        }
        return values1;
    }

    Values.this._cls1(Object obj)
    {
        this$0 = StandardTable.this;
        super();
        columnKey = Preconditions.checkNotNull(obj);
    }
}
