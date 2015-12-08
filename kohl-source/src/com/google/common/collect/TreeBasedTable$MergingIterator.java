// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

// Referenced classes of package com.google.common.collect:
//            AbstractIterator, TreeBasedTable, Iterables, Iterators, 
//            PeekingIterator

private static class queue extends AbstractIterator
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


    public _cls1.this._cls0(Iterable iterable, Comparator comparator1)
    {
        lastValue = null;
        comparator = comparator1;
        comparator1 = new Comparator() {

            final TreeBasedTable.MergingIterator this$0;

            public int compare(PeekingIterator peekingiterator, PeekingIterator peekingiterator1)
            {
                return comparator.compare(peekingiterator.peek(), peekingiterator1.peek());
            }

            public volatile int compare(Object obj, Object obj1)
            {
                return compare((PeekingIterator)obj, (PeekingIterator)obj1);
            }

            
            {
                this$0 = TreeBasedTable.MergingIterator.this;
                super();
            }
        };
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
