// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.base.Supplier;
import java.io.Serializable;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;

// Referenced classes of package com.google.common.collect:
//            StandardRowSortedTable, Ordering, Iterables, Table, 
//            AbstractIterator, Iterators, PeekingIterator

public class TreeBasedTable extends StandardRowSortedTable
{
    private static class Factory
        implements Supplier, Serializable
    {

        private static final long serialVersionUID = 0L;
        final Comparator comparator;

        public volatile Object get()
        {
            return get();
        }

        public TreeMap get()
        {
            return new TreeMap(comparator);
        }

        Factory(Comparator comparator1)
        {
            comparator = comparator1;
        }
    }

    private static class MergingIterator extends AbstractIterator
    {

        private final Comparator comparator;
        private Object lastValue;
        private final Queue queue;

        protected Object computeNext()
        {
            while (!queue.isEmpty()) 
            {
                PeekingIterator peekingiterator = (PeekingIterator)queue.poll();
                Object obj = peekingiterator.next();
                boolean flag;
                if (lastValue != null && comparator.compare(obj, lastValue) == 0)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (peekingiterator.hasNext())
                {
                    queue.add(peekingiterator);
                }
                if (!flag)
                {
                    lastValue = obj;
                    return lastValue;
                }
            }
            lastValue = null;
            return endOfData();
        }


        public MergingIterator(Iterable iterable, Comparator comparator1)
        {
            lastValue = null;
            comparator = comparator1;
            comparator1 = new _cls1();
            queue = new PriorityQueue(Math.max(1, Iterables.size(iterable)), comparator1);
            iterable = iterable.iterator();
            do
            {
                if (!iterable.hasNext())
                {
                    break;
                }
                comparator1 = (Iterator)iterable.next();
                if (comparator1.hasNext())
                {
                    queue.add(Iterators.peekingIterator(comparator1));
                }
            } while (true);
        }
    }


    private static final long serialVersionUID = 0L;
    private final Comparator columnComparator;

    TreeBasedTable(Comparator comparator, Comparator comparator1)
    {
        super(new TreeMap(comparator), new Factory(comparator1));
        columnComparator = comparator1;
    }

    public static TreeBasedTable create()
    {
        return new TreeBasedTable(Ordering.natural(), Ordering.natural());
    }

    public static TreeBasedTable create(TreeBasedTable treebasedtable)
    {
        TreeBasedTable treebasedtable1 = new TreeBasedTable(treebasedtable.rowComparator(), treebasedtable.columnComparator());
        treebasedtable1.putAll(treebasedtable);
        return treebasedtable1;
    }

    public static TreeBasedTable create(Comparator comparator, Comparator comparator1)
    {
        Preconditions.checkNotNull(comparator);
        Preconditions.checkNotNull(comparator1);
        return new TreeBasedTable(comparator, comparator1);
    }

    public volatile Set cellSet()
    {
        return super.cellSet();
    }

    public volatile void clear()
    {
        super.clear();
    }

    public volatile Map column(Object obj)
    {
        return super.column(obj);
    }

    public Comparator columnComparator()
    {
        return columnComparator;
    }

    public volatile Set columnKeySet()
    {
        return super.columnKeySet();
    }

    public volatile Map columnMap()
    {
        return super.columnMap();
    }

    public boolean contains(Object obj, Object obj1)
    {
        return super.contains(obj, obj1);
    }

    public boolean containsColumn(Object obj)
    {
        return super.containsColumn(obj);
    }

    public boolean containsRow(Object obj)
    {
        return super.containsRow(obj);
    }

    public boolean containsValue(Object obj)
    {
        return super.containsValue(obj);
    }

    Iterator createColumnKeyIterator()
    {
        return new MergingIterator(Iterables.transform(backingMap.values(), new Function() {

            final TreeBasedTable this$0;

            public volatile Object apply(Object obj)
            {
                return apply((Map)obj);
            }

            public Iterator apply(Map map)
            {
                return map.keySet().iterator();
            }

            
            {
                this$0 = TreeBasedTable.this;
                super();
            }
        }), columnComparator());
    }

    public boolean equals(Object obj)
    {
        return super.equals(obj);
    }

    public Object get(Object obj, Object obj1)
    {
        return super.get(obj, obj1);
    }

    public volatile int hashCode()
    {
        return super.hashCode();
    }

    public volatile boolean isEmpty()
    {
        return super.isEmpty();
    }

    public volatile Object put(Object obj, Object obj1, Object obj2)
    {
        return super.put(obj, obj1, obj2);
    }

    public volatile void putAll(Table table)
    {
        super.putAll(table);
    }

    public Object remove(Object obj, Object obj1)
    {
        return super.remove(obj, obj1);
    }

    public volatile Map row(Object obj)
    {
        return super.row(obj);
    }

    public Comparator rowComparator()
    {
        return rowKeySet().comparator();
    }

    public volatile Set rowKeySet()
    {
        return rowKeySet();
    }

    public SortedSet rowKeySet()
    {
        return super.rowKeySet();
    }

    public volatile Map rowMap()
    {
        return rowMap();
    }

    public SortedMap rowMap()
    {
        return super.rowMap();
    }

    public volatile int size()
    {
        return super.size();
    }

    public volatile String toString()
    {
        return super.toString();
    }

    public volatile Collection values()
    {
        return super.values();
    }

    // Unreferenced inner class com/google/common/collect/TreeBasedTable$MergingIterator$1

/* anonymous class */
    class MergingIterator._cls1
        implements Comparator
    {

        final MergingIterator this$0;

        public int compare(PeekingIterator peekingiterator, PeekingIterator peekingiterator1)
        {
            return comparator.compare(peekingiterator.peek(), peekingiterator1.peek());
        }

        public volatile int compare(Object obj, Object obj1)
        {
            return compare((PeekingIterator)obj, (PeekingIterator)obj1);
        }

            
            {
                this$0 = MergingIterator.this;
                super();
            }
    }

}
