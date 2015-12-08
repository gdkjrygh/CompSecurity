// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

// Referenced classes of package com.google.common.collect:
//            ImmutableList, UnmodifiableListIterator

private static class size extends ImmutableList
{

    private final transient ImmutableList forwardList;
    private final transient int size;

    private int reverseIndex(int i)
    {
        return size - 1 - i;
    }

    private int reversePosition(int i)
    {
        return size - i;
    }

    public boolean contains(Object obj)
    {
        return forwardList.contains(obj);
    }

    public boolean containsAll(Collection collection)
    {
        return forwardList.containsAll(collection);
    }

    public Object get(int i)
    {
        Preconditions.checkElementIndex(i, size);
        return forwardList.get(reverseIndex(i));
    }

    public int indexOf(Object obj)
    {
        int i = forwardList.lastIndexOf(obj);
        if (i >= 0)
        {
            return reverseIndex(i);
        } else
        {
            return -1;
        }
    }

    public boolean isEmpty()
    {
        return forwardList.isEmpty();
    }

    boolean isPartialView()
    {
        return forwardList.isPartialView();
    }

    public volatile Iterator iterator()
    {
        return super.iterator();
    }

    public int lastIndexOf(Object obj)
    {
        int i = forwardList.indexOf(obj);
        if (i >= 0)
        {
            return reverseIndex(i);
        } else
        {
            return -1;
        }
    }

    public UnmodifiableListIterator listIterator(int i)
    {
        Preconditions.checkPositionIndex(i, size);
        return new UnmodifiableListIterator() {

            final ImmutableList.ReverseImmutableList this$0;
            final UnmodifiableListIterator val$forward;

            public boolean hasNext()
            {
                return forward.hasPrevious();
            }

            public boolean hasPrevious()
            {
                return forward.hasNext();
            }

            public Object next()
            {
                return forward.previous();
            }

            public int nextIndex()
            {
                return reverseIndex(forward.previousIndex());
            }

            public Object previous()
            {
                return forward.next();
            }

            public int previousIndex()
            {
                return reverseIndex(forward.nextIndex());
            }

            
            {
                this$0 = ImmutableList.ReverseImmutableList.this;
                forward = unmodifiablelistiterator;
                super();
            }
        };
    }

    public volatile ListIterator listIterator()
    {
        return super.listIterator();
    }

    public volatile ListIterator listIterator(int i)
    {
        return listIterator(i);
    }

    public ImmutableList reverse()
    {
        return forwardList;
    }

    public int size()
    {
        return size;
    }

    public ImmutableList subList(int i, int j)
    {
        Preconditions.checkPositionIndexes(i, j, size);
        return forwardList.subList(reversePosition(j), reversePosition(i)).reverse();
    }

    public volatile List subList(int i, int j)
    {
        return subList(i, j);
    }


    _cls1.val.forward(ImmutableList immutablelist)
    {
        forwardList = immutablelist;
        size = immutablelist.size();
    }
}
