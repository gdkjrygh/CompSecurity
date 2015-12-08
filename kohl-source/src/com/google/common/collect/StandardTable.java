// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.base.Supplier;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            Table, Maps, Iterators, Tables, 
//            ImmutableEntry, AbstractIterator, AbstractMapEntry, Lists, 
//            UnmodifiableIterator, ForwardingMapEntry, Collections2

class StandardTable
    implements Table, Serializable
{
    private class CellIterator
        implements Iterator
    {

        Iterator columnIterator;
        java.util.Map.Entry rowEntry;
        final Iterator rowIterator;
        final StandardTable this$0;

        public boolean hasNext()
        {
            return rowIterator.hasNext() || columnIterator.hasNext();
        }

        public Table.Cell next()
        {
            if (!columnIterator.hasNext())
            {
                rowEntry = (java.util.Map.Entry)rowIterator.next();
                columnIterator = ((Map)rowEntry.getValue()).entrySet().iterator();
            }
            java.util.Map.Entry entry = (java.util.Map.Entry)columnIterator.next();
            return Tables.immutableCell(rowEntry.getKey(), entry.getKey(), entry.getValue());
        }

        public volatile Object next()
        {
            return next();
        }

        public void remove()
        {
            columnIterator.remove();
            if (((Map)rowEntry.getValue()).isEmpty())
            {
                rowIterator.remove();
            }
        }

        private CellIterator()
        {
            this$0 = StandardTable.this;
            super();
            rowIterator = backingMap.entrySet().iterator();
            columnIterator = Iterators.emptyModifiableIterator();
        }

    }

    private class CellSet extends TableSet
    {

        final StandardTable this$0;

        public boolean contains(Object obj)
        {
            if (obj instanceof Table.Cell)
            {
                obj = (Table.Cell)obj;
                return containsMapping(((Table.Cell) (obj)).getRowKey(), ((Table.Cell) (obj)).getColumnKey(), ((Table.Cell) (obj)).getValue());
            } else
            {
                return false;
            }
        }

        public Iterator iterator()
        {
            return new CellIterator();
        }

        public boolean remove(Object obj)
        {
            if (obj instanceof Table.Cell)
            {
                obj = (Table.Cell)obj;
                return removeMapping(((Table.Cell) (obj)).getRowKey(), ((Table.Cell) (obj)).getColumnKey(), ((Table.Cell) (obj)).getValue());
            } else
            {
                return false;
            }
        }

        public int size()
        {
            return StandardTable.this.size();
        }

        private CellSet()
        {
            this$0 = StandardTable.this;
            super();
        }

    }

    private class Column extends Maps.ImprovedAbstractMap
    {

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
                java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
                Map map = (Map)entry.getValue();
                Object obj = map.get(columnKey);
                if (obj != null && predicate.apply(new ImmutableEntry(entry.getKey(), obj)))
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

        Column(Object obj)
        {
            this$0 = StandardTable.this;
            super();
            columnKey = Preconditions.checkNotNull(obj);
        }
    }

    class Column.EntrySet extends AbstractSet
    {

        final Column this$1;

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
                return containsMapping(((java.util.Map.Entry) (obj)).getKey(), columnKey, ((java.util.Map.Entry) (obj)).getValue());
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
            return new Column.EntrySetIterator();
        }

        public boolean remove(Object obj)
        {
            if (obj instanceof java.util.Map.Entry)
            {
                obj = (java.util.Map.Entry)obj;
                return removeMapping(((java.util.Map.Entry) (obj)).getKey(), columnKey, ((java.util.Map.Entry) (obj)).getValue());
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

        Column.EntrySet()
        {
            this$1 = Column.this;
            super();
        }
    }

    class Column.EntrySetIterator extends AbstractIterator
    {

        final Iterator iterator;
        final Column this$1;

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

                        final Column.EntrySetIterator this$2;
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

        Column.EntrySetIterator()
        {
            this$1 = Column.this;
            super();
            iterator = backingMap.entrySet().iterator();
        }
    }

    class Column.KeySet extends AbstractSet
    {

        final Column this$1;

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
            return StandardTable.keyIteratorImpl(Column.this);
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

                final Column.KeySet this$2;
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

        Column.KeySet()
        {
            this$1 = Column.this;
            super();
        }
    }

    class Column.Values extends AbstractCollection
    {

        final Column this$1;

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
            return StandardTable.valueIteratorImpl(Column.this);
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

                final Column.Values this$2;
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

                final Column.Values this$2;
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

        Column.Values()
        {
            this$1 = Column.this;
            super();
        }
    }

    private class ColumnKeyIterator extends AbstractIterator
    {

        Iterator entryIterator;
        final Iterator mapIterator;
        final Map seen;
        final StandardTable this$0;

        protected Object computeNext()
        {
            do
            {
                if (entryIterator.hasNext())
                {
                    java.util.Map.Entry entry = (java.util.Map.Entry)entryIterator.next();
                    if (!seen.containsKey(entry.getKey()))
                    {
                        seen.put(entry.getKey(), entry.getValue());
                        return entry.getKey();
                    }
                } else
                if (mapIterator.hasNext())
                {
                    entryIterator = ((Map)mapIterator.next()).entrySet().iterator();
                } else
                {
                    return endOfData();
                }
            } while (true);
        }

        private ColumnKeyIterator()
        {
            this$0 = StandardTable.this;
            super();
            seen = (Map)factory.get();
            mapIterator = backingMap.values().iterator();
            entryIterator = Iterators.emptyIterator();
        }

    }

    private class ColumnKeySet extends TableSet
    {

        final StandardTable this$0;

        public boolean contains(Object obj)
        {
            if (obj != null)
            {
                Iterator iterator1 = backingMap.values().iterator();
                while (iterator1.hasNext()) 
                {
                    if (((Map)iterator1.next()).containsKey(obj))
                    {
                        return true;
                    }
                }
            }
            return false;
        }

        public Iterator iterator()
        {
            return createColumnKeyIterator();
        }

        public boolean remove(Object obj)
        {
            if (obj != null) goto _L2; else goto _L1
_L1:
            boolean flag1 = false;
_L4:
            return flag1;
_L2:
            boolean flag = false;
            Iterator iterator1 = backingMap.values().iterator();
            do
            {
                flag1 = flag;
                if (!iterator1.hasNext())
                {
                    continue;
                }
                Map map = (Map)iterator1.next();
                if (map.keySet().remove(obj))
                {
                    boolean flag2 = true;
                    flag = flag2;
                    if (map.isEmpty())
                    {
                        iterator1.remove();
                        flag = flag2;
                    }
                }
            } while (true);
            if (true) goto _L4; else goto _L3
_L3:
        }

        public boolean removeAll(Collection collection)
        {
            Preconditions.checkNotNull(collection);
            boolean flag = false;
            Iterator iterator1 = backingMap.values().iterator();
            do
            {
                if (!iterator1.hasNext())
                {
                    break;
                }
                Map map = (Map)iterator1.next();
                if (Iterators.removeAll(map.keySet().iterator(), collection))
                {
                    boolean flag1 = true;
                    flag = flag1;
                    if (map.isEmpty())
                    {
                        iterator1.remove();
                        flag = flag1;
                    }
                }
            } while (true);
            return flag;
        }

        public boolean retainAll(Collection collection)
        {
            Preconditions.checkNotNull(collection);
            boolean flag = false;
            Iterator iterator1 = backingMap.values().iterator();
            do
            {
                if (!iterator1.hasNext())
                {
                    break;
                }
                Map map = (Map)iterator1.next();
                if (map.keySet().retainAll(collection))
                {
                    boolean flag1 = true;
                    flag = flag1;
                    if (map.isEmpty())
                    {
                        iterator1.remove();
                        flag = flag1;
                    }
                }
            } while (true);
            return flag;
        }

        public int size()
        {
            return Iterators.size(iterator());
        }

        private ColumnKeySet()
        {
            this$0 = StandardTable.this;
            super();
        }

    }

    private class ColumnMap extends Maps.ImprovedAbstractMap
    {

        ColumnMapValues columnMapValues;
        final StandardTable this$0;

        public boolean containsKey(Object obj)
        {
            return containsColumn(obj);
        }

        public Set createEntrySet()
        {
            return new ColumnMapEntrySet();
        }

        public volatile Object get(Object obj)
        {
            return get(obj);
        }

        public Map get(Object obj)
        {
            if (containsColumn(obj))
            {
                return column(obj);
            } else
            {
                return null;
            }
        }

        public Set keySet()
        {
            return columnKeySet();
        }

        public volatile Object remove(Object obj)
        {
            return remove(obj);
        }

        public Map remove(Object obj)
        {
            if (containsColumn(obj))
            {
                return removeColumn(obj);
            } else
            {
                return null;
            }
        }

        public Collection values()
        {
            ColumnMapValues columnmapvalues1 = columnMapValues;
            ColumnMapValues columnmapvalues = columnmapvalues1;
            if (columnmapvalues1 == null)
            {
                columnmapvalues = new ColumnMapValues();
                columnMapValues = columnmapvalues;
            }
            return columnmapvalues;
        }

        private ColumnMap()
        {
            this$0 = StandardTable.this;
            super();
        }

    }

    class ColumnMap.ColumnMapEntrySet extends TableSet
    {

        final ColumnMap this$1;

        public boolean contains(Object obj)
        {
            if (obj instanceof java.util.Map.Entry)
            {
                obj = (java.util.Map.Entry)obj;
                if (containsColumn(((java.util.Map.Entry) (obj)).getKey()))
                {
                    Object obj1 = ((java.util.Map.Entry) (obj)).getKey();
                    return get(obj1).equals(((java.util.Map.Entry) (obj)).getValue());
                }
            }
            return false;
        }

        public Iterator iterator()
        {
            return columnKeySet().iterator(). new UnmodifiableIterator() {

                final ColumnMap.ColumnMapEntrySet this$2;
                final Iterator val$columnIterator;

                public boolean hasNext()
                {
                    return columnIterator.hasNext();
                }

                public volatile Object next()
                {
                    return next();
                }

                public java.util.Map.Entry next()
                {
                    Object obj = columnIterator.next();
                    return new ImmutableEntry(obj, column(obj));
                }

            
            {
                this$2 = final_columnmapentryset;
                columnIterator = Iterator.this;
                super();
            }
            };
        }

        public boolean remove(Object obj)
        {
            if (contains(obj))
            {
                obj = (java.util.Map.Entry)obj;
                removeColumn(((java.util.Map.Entry) (obj)).getKey());
                return true;
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
            boolean flag = false;
            Iterator iterator1 = Lists.newArrayList(columnKeySet().iterator()).iterator();
            do
            {
                if (!iterator1.hasNext())
                {
                    break;
                }
                Object obj = iterator1.next();
                if (!collection.contains(new ImmutableEntry(obj, column(obj))))
                {
                    removeColumn(obj);
                    flag = true;
                }
            } while (true);
            return flag;
        }

        public int size()
        {
            return columnKeySet().size();
        }

        ColumnMap.ColumnMapEntrySet()
        {
            this$1 = ColumnMap.this;
            super();
        }
    }

    private class ColumnMap.ColumnMapValues extends TableCollection
    {

        final ColumnMap this$1;

        public Iterator iterator()
        {
            return StandardTable.valueIteratorImpl(ColumnMap.this);
        }

        public boolean remove(Object obj)
        {
            for (Iterator iterator1 = entrySet().iterator(); iterator1.hasNext();)
            {
                java.util.Map.Entry entry = (java.util.Map.Entry)iterator1.next();
                if (((Map)entry.getValue()).equals(obj))
                {
                    removeColumn(entry.getKey());
                    return true;
                }
            }

            return false;
        }

        public boolean removeAll(Collection collection)
        {
            Preconditions.checkNotNull(collection);
            boolean flag = false;
            Iterator iterator1 = Lists.newArrayList(columnKeySet().iterator()).iterator();
            do
            {
                if (!iterator1.hasNext())
                {
                    break;
                }
                Object obj = iterator1.next();
                if (collection.contains(column(obj)))
                {
                    removeColumn(obj);
                    flag = true;
                }
            } while (true);
            return flag;
        }

        public boolean retainAll(Collection collection)
        {
            Preconditions.checkNotNull(collection);
            boolean flag = false;
            Iterator iterator1 = Lists.newArrayList(columnKeySet().iterator()).iterator();
            do
            {
                if (!iterator1.hasNext())
                {
                    break;
                }
                Object obj = iterator1.next();
                if (!collection.contains(column(obj)))
                {
                    removeColumn(obj);
                    flag = true;
                }
            } while (true);
            return flag;
        }

        public int size()
        {
            return columnKeySet().size();
        }

        private ColumnMap.ColumnMapValues()
        {
            this$1 = ColumnMap.this;
            super();
        }

    }

    private class Row extends Maps.ImprovedAbstractMap
    {

        final Object rowKey;
        final StandardTable this$0;

        public boolean containsKey(Object obj)
        {
            return contains(rowKey, obj);
        }

        protected Set createEntrySet()
        {
            return new RowEntrySet();
        }

        public Object get(Object obj)
        {
            return StandardTable.this.get(rowKey, obj);
        }

        public Object put(Object obj, Object obj1)
        {
            return StandardTable.this.put(rowKey, obj, obj1);
        }

        public Object remove(Object obj)
        {
            return StandardTable.this.remove(rowKey, obj);
        }

        Row(Object obj)
        {
            this$0 = StandardTable.this;
            super();
            rowKey = Preconditions.checkNotNull(obj);
        }
    }

    private class Row.RowEntrySet extends AbstractSet
    {

        final Row this$1;

        public void clear()
        {
            backingMap.remove(rowKey);
        }

        public boolean contains(Object obj)
        {
            if (obj instanceof java.util.Map.Entry)
            {
                obj = (java.util.Map.Entry)obj;
                return containsMapping(rowKey, ((java.util.Map.Entry) (obj)).getKey(), ((java.util.Map.Entry) (obj)).getValue());
            } else
            {
                return false;
            }
        }

        public Iterator iterator()
        {
            Map map = (Map)backingMap.get(rowKey);
            if (map == null)
            {
                return Iterators.emptyModifiableIterator();
            } else
            {
                return map. new Iterator() {

                    final Row.RowEntrySet this$2;
                    final Iterator val$iterator;
                    final Map val$map;

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

                            final Row.RowEntrySet._cls1 this$3;
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
                                return super.setValue(Preconditions.checkNotNull(obj));
                            }

            
            {
                this$3 = final__pcls1;
                entry = java.util.Map.Entry.this;
                super();
            }
                        };
                    }

                    public void remove()
                    {
                        iterator.remove();
                        if (map.isEmpty())
                        {
                            backingMap.remove(rowKey);
                        }
                    }

            
            {
                this$2 = final_rowentryset;
                iterator = iterator1;
                map = Map.this;
                super();
            }
                };
            }
        }

        public boolean remove(Object obj)
        {
            if (obj instanceof java.util.Map.Entry)
            {
                obj = (java.util.Map.Entry)obj;
                return removeMapping(rowKey, ((java.util.Map.Entry) (obj)).getKey(), ((java.util.Map.Entry) (obj)).getValue());
            } else
            {
                return false;
            }
        }

        public int size()
        {
            Map map = (Map)backingMap.get(rowKey);
            if (map == null)
            {
                return 0;
            } else
            {
                return map.size();
            }
        }

        private Row.RowEntrySet()
        {
            this$1 = Row.this;
            super();
        }

    }

    class RowKeySet extends TableSet
    {

        final StandardTable this$0;

        public boolean contains(Object obj)
        {
            return containsRow(obj);
        }

        public Iterator iterator()
        {
            return StandardTable.keyIteratorImpl(rowMap());
        }

        public boolean remove(Object obj)
        {
            return obj != null && backingMap.remove(obj) != null;
        }

        public int size()
        {
            return backingMap.size();
        }

        RowKeySet()
        {
            this$0 = StandardTable.this;
            super();
        }
    }

    class RowMap extends Maps.ImprovedAbstractMap
    {

        final StandardTable this$0;

        public boolean containsKey(Object obj)
        {
            return containsRow(obj);
        }

        protected Set createEntrySet()
        {
            return new EntrySet();
        }

        public volatile Object get(Object obj)
        {
            return get(obj);
        }

        public Map get(Object obj)
        {
            if (containsRow(obj))
            {
                return row(obj);
            } else
            {
                return null;
            }
        }

        public Set keySet()
        {
            return rowKeySet();
        }

        public volatile Object remove(Object obj)
        {
            return remove(obj);
        }

        public Map remove(Object obj)
        {
            if (obj == null)
            {
                return null;
            } else
            {
                return (Map)backingMap.remove(obj);
            }
        }

        RowMap()
        {
            this$0 = StandardTable.this;
            super();
        }
    }

    class RowMap.EntryIterator
        implements Iterator
    {

        final Iterator _flddelegate;
        final RowMap this$1;

        public boolean hasNext()
        {
            return _flddelegate.hasNext();
        }

        public volatile Object next()
        {
            return next();
        }

        public java.util.Map.Entry next()
        {
            Object obj = _flddelegate.next();
            return new ImmutableEntry(obj, row(obj));
        }

        public void remove()
        {
            _flddelegate.remove();
        }

        RowMap.EntryIterator()
        {
            this$1 = RowMap.this;
            super();
            _flddelegate = backingMap.keySet().iterator();
        }
    }

    class RowMap.EntrySet extends TableSet
    {

        final RowMap this$1;

        public boolean contains(Object obj)
        {
            boolean flag1 = false;
            boolean flag = flag1;
            if (obj instanceof java.util.Map.Entry)
            {
                obj = (java.util.Map.Entry)obj;
                flag = flag1;
                if (((java.util.Map.Entry) (obj)).getKey() != null)
                {
                    flag = flag1;
                    if (((java.util.Map.Entry) (obj)).getValue() instanceof Map)
                    {
                        flag = flag1;
                        if (Collections2.safeContains(backingMap.entrySet(), obj))
                        {
                            flag = true;
                        }
                    }
                }
            }
            return flag;
        }

        public Iterator iterator()
        {
            return new RowMap.EntryIterator();
        }

        public boolean remove(Object obj)
        {
            boolean flag1 = false;
            boolean flag = flag1;
            if (obj instanceof java.util.Map.Entry)
            {
                obj = (java.util.Map.Entry)obj;
                flag = flag1;
                if (((java.util.Map.Entry) (obj)).getKey() != null)
                {
                    flag = flag1;
                    if (((java.util.Map.Entry) (obj)).getValue() instanceof Map)
                    {
                        flag = flag1;
                        if (backingMap.entrySet().remove(obj))
                        {
                            flag = true;
                        }
                    }
                }
            }
            return flag;
        }

        public int size()
        {
            return backingMap.size();
        }

        RowMap.EntrySet()
        {
            this$1 = RowMap.this;
            super();
        }
    }

    private abstract class TableCollection extends AbstractCollection
    {

        final StandardTable this$0;

        public void clear()
        {
            backingMap.clear();
        }

        public boolean isEmpty()
        {
            return backingMap.isEmpty();
        }

        private TableCollection()
        {
            this$0 = StandardTable.this;
            super();
        }

    }

    private abstract class TableSet extends AbstractSet
    {

        final StandardTable this$0;

        public void clear()
        {
            backingMap.clear();
        }

        public boolean isEmpty()
        {
            return backingMap.isEmpty();
        }

        private TableSet()
        {
            this$0 = StandardTable.this;
            super();
        }

    }

    private class Values extends TableCollection
    {

        final StandardTable this$0;

        public Iterator iterator()
        {
            return cellSet().iterator(). new Iterator() {

                final Values this$1;
                final Iterator val$cellIterator;

                public boolean hasNext()
                {
                    return cellIterator.hasNext();
                }

                public Object next()
                {
                    return ((Table.Cell)cellIterator.next()).getValue();
                }

                public void remove()
                {
                    cellIterator.remove();
                }

            
            {
                this$1 = final_values1;
                cellIterator = Iterator.this;
                super();
            }
            };
        }

        public int size()
        {
            return StandardTable.this.size();
        }

        private Values()
        {
            this$0 = StandardTable.this;
            super();
        }

    }


    private static final long serialVersionUID = 0L;
    final Map backingMap;
    private transient CellSet cellSet;
    private transient Set columnKeySet;
    private transient ColumnMap columnMap;
    final Supplier factory;
    private transient RowKeySet rowKeySet;
    private transient RowMap rowMap;
    private transient Values values;

    StandardTable(Map map, Supplier supplier)
    {
        backingMap = map;
        factory = supplier;
    }

    private boolean containsMapping(Object obj, Object obj1, Object obj2)
    {
        return obj2 != null && obj2.equals(get(obj, obj1));
    }

    private Map getOrCreate(Object obj)
    {
        Map map1 = (Map)backingMap.get(obj);
        Map map = map1;
        if (map1 == null)
        {
            map = (Map)factory.get();
            backingMap.put(obj, map);
        }
        return map;
    }

    static Iterator keyIteratorImpl(Map map)
    {
        return new Iterator(map.entrySet().iterator()) {

            final Iterator val$entryIterator;

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

            
            {
                entryIterator = iterator;
                super();
            }
        };
    }

    private Map removeColumn(Object obj)
    {
        LinkedHashMap linkedhashmap = new LinkedHashMap();
        Iterator iterator = backingMap.entrySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
            Object obj1 = ((Map)entry.getValue()).remove(obj);
            if (obj1 != null)
            {
                linkedhashmap.put(entry.getKey(), obj1);
                if (((Map)entry.getValue()).isEmpty())
                {
                    iterator.remove();
                }
            }
        } while (true);
        return linkedhashmap;
    }

    private boolean removeMapping(Object obj, Object obj1, Object obj2)
    {
        if (containsMapping(obj, obj1, obj2))
        {
            remove(obj, obj1);
            return true;
        } else
        {
            return false;
        }
    }

    static Iterator valueIteratorImpl(Map map)
    {
        return new Iterator(map.entrySet().iterator()) {

            final Iterator val$entryIterator;

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

            
            {
                entryIterator = iterator;
                super();
            }
        };
    }

    public Set cellSet()
    {
        CellSet cellset1 = cellSet;
        CellSet cellset = cellset1;
        if (cellset1 == null)
        {
            cellset = new CellSet();
            cellSet = cellset;
        }
        return cellset;
    }

    public void clear()
    {
        backingMap.clear();
    }

    public Map column(Object obj)
    {
        return new Column(obj);
    }

    public Set columnKeySet()
    {
        Set set = columnKeySet;
        Object obj = set;
        if (set == null)
        {
            obj = new ColumnKeySet();
            columnKeySet = ((Set) (obj));
        }
        return ((Set) (obj));
    }

    public Map columnMap()
    {
        ColumnMap columnmap1 = columnMap;
        ColumnMap columnmap = columnmap1;
        if (columnmap1 == null)
        {
            columnmap = new ColumnMap();
            columnMap = columnmap;
        }
        return columnmap;
    }

    public boolean contains(Object obj, Object obj1)
    {
        if (obj != null && obj1 != null)
        {
            if ((obj = (Map)Maps.safeGet(backingMap, obj)) != null && Maps.safeContainsKey(((Map) (obj)), obj1))
            {
                return true;
            }
        }
        return false;
    }

    public boolean containsColumn(Object obj)
    {
        if (obj != null)
        {
            Iterator iterator = backingMap.values().iterator();
            while (iterator.hasNext()) 
            {
                if (Maps.safeContainsKey((Map)iterator.next(), obj))
                {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean containsRow(Object obj)
    {
        return obj != null && Maps.safeContainsKey(backingMap, obj);
    }

    public boolean containsValue(Object obj)
    {
        if (obj != null)
        {
            Iterator iterator = backingMap.values().iterator();
            while (iterator.hasNext()) 
            {
                if (((Map)iterator.next()).containsValue(obj))
                {
                    return true;
                }
            }
        }
        return false;
    }

    Iterator createColumnKeyIterator()
    {
        return new ColumnKeyIterator();
    }

    public boolean equals(Object obj)
    {
        if (obj == this)
        {
            return true;
        }
        if (obj instanceof Table)
        {
            obj = (Table)obj;
            return cellSet().equals(((Table) (obj)).cellSet());
        } else
        {
            return false;
        }
    }

    public Object get(Object obj, Object obj1)
    {
        if (obj != null && obj1 != null)
        {
            if ((obj = (Map)Maps.safeGet(backingMap, obj)) != null)
            {
                return Maps.safeGet(((Map) (obj)), obj1);
            }
        }
        return null;
    }

    public int hashCode()
    {
        return cellSet().hashCode();
    }

    public boolean isEmpty()
    {
        return backingMap.isEmpty();
    }

    public Object put(Object obj, Object obj1, Object obj2)
    {
        Preconditions.checkNotNull(obj);
        Preconditions.checkNotNull(obj1);
        Preconditions.checkNotNull(obj2);
        return getOrCreate(obj).put(obj1, obj2);
    }

    public void putAll(Table table)
    {
        Table.Cell cell;
        for (table = table.cellSet().iterator(); table.hasNext(); put(cell.getRowKey(), cell.getColumnKey(), cell.getValue()))
        {
            cell = (Table.Cell)table.next();
        }

    }

    public Object remove(Object obj, Object obj1)
    {
        Object obj3 = null;
        Object obj2 = obj3;
        if (obj != null)
        {
            if (obj1 == null)
            {
                obj2 = obj3;
            } else
            {
                Map map = (Map)Maps.safeGet(backingMap, obj);
                obj2 = obj3;
                if (map != null)
                {
                    obj1 = map.remove(obj1);
                    obj2 = obj1;
                    if (map.isEmpty())
                    {
                        backingMap.remove(obj);
                        return obj1;
                    }
                }
            }
        }
        return obj2;
    }

    public Map row(Object obj)
    {
        return new Row(obj);
    }

    public Set rowKeySet()
    {
        RowKeySet rowkeyset1 = rowKeySet;
        RowKeySet rowkeyset = rowkeyset1;
        if (rowkeyset1 == null)
        {
            rowkeyset = new RowKeySet();
            rowKeySet = rowkeyset;
        }
        return rowkeyset;
    }

    public Map rowMap()
    {
        RowMap rowmap1 = rowMap;
        RowMap rowmap = rowmap1;
        if (rowmap1 == null)
        {
            rowmap = new RowMap();
            rowMap = rowmap;
        }
        return rowmap;
    }

    public int size()
    {
        int i = 0;
        for (Iterator iterator = backingMap.values().iterator(); iterator.hasNext();)
        {
            i += ((Map)iterator.next()).size();
        }

        return i;
    }

    public String toString()
    {
        return rowMap().toString();
    }

    public Collection values()
    {
        Values values2 = values;
        Values values1 = values2;
        if (values2 == null)
        {
            values1 = new Values();
            values = values1;
        }
        return values1;
    }



}
