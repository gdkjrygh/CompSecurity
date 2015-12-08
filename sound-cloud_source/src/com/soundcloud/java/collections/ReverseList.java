// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.java.collections;

import com.soundcloud.java.checks.Preconditions;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;

// Referenced classes of package com.soundcloud.java.collections:
//            Lists

class ReverseList extends AbstractList
{
    private class ReverseListIterator
        implements ListIterator
    {

        boolean canRemoveOrSet;
        private final ListIterator forwardIterator;
        final ReverseList this$0;

        public void add(Object obj)
        {
            forwardIterator.add(obj);
            forwardIterator.previous();
            canRemoveOrSet = false;
        }

        public boolean hasNext()
        {
            return forwardIterator.hasPrevious();
        }

        public boolean hasPrevious()
        {
            return forwardIterator.hasNext();
        }

        public Object next()
        {
            if (!hasNext())
            {
                throw new NoSuchElementException();
            } else
            {
                canRemoveOrSet = true;
                return forwardIterator.previous();
            }
        }

        public int nextIndex()
        {
            return reversePosition(forwardIterator.nextIndex());
        }

        public Object previous()
        {
            if (!hasPrevious())
            {
                throw new NoSuchElementException();
            } else
            {
                canRemoveOrSet = true;
                return forwardIterator.next();
            }
        }

        public int previousIndex()
        {
            return nextIndex() - 1;
        }

        public void remove()
        {
            forwardIterator.remove();
            canRemoveOrSet = false;
        }

        public void set(Object obj)
        {
            Preconditions.checkState(canRemoveOrSet);
            forwardIterator.set(obj);
        }

        public ReverseListIterator(ListIterator listiterator)
        {
            this$0 = ReverseList.this;
            super();
            forwardIterator = listiterator;
        }
    }


    private final List forwardList;

    ReverseList(List list)
    {
        forwardList = (List)Preconditions.checkNotNull(list);
    }

    private int reverseIndex(int i)
    {
        int j = size();
        Preconditions.checkElementIndex(i, j);
        return j - 1 - i;
    }

    private int reversePosition(int i)
    {
        int j = size();
        Preconditions.checkPositionIndex(i, j);
        return j - i;
    }

    public void add(int i, Object obj)
    {
        forwardList.add(reversePosition(i), obj);
    }

    public void clear()
    {
        forwardList.clear();
    }

    public Object get(int i)
    {
        return forwardList.get(reverseIndex(i));
    }

    List getForwardList()
    {
        return forwardList;
    }

    public Iterator iterator()
    {
        return listIterator();
    }

    public ListIterator listIterator(int i)
    {
        i = reversePosition(i);
        return new ReverseListIterator(forwardList.listIterator(i));
    }

    public Object remove(int i)
    {
        return forwardList.remove(reverseIndex(i));
    }

    protected void removeRange(int i, int j)
    {
        subList(i, j).clear();
    }

    public Object set(int i, Object obj)
    {
        return forwardList.set(reverseIndex(i), obj);
    }

    public int size()
    {
        return forwardList.size();
    }

    public List subList(int i, int j)
    {
        Preconditions.checkPositionIndexes(i, j, size());
        return Lists.reverse(forwardList.subList(reversePosition(j), reversePosition(i)));
    }

}
