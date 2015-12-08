// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.java.collections;

import com.soundcloud.java.checks.Preconditions;
import java.util.ListIterator;
import java.util.NoSuchElementException;

// Referenced classes of package com.soundcloud.java.collections:
//            ReverseList

private class forwardIterator
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
        return ReverseList.access$000(ReverseList.this, forwardIterator.nextIndex());
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

    public (ListIterator listiterator)
    {
        this$0 = ReverseList.this;
        super();
        forwardIterator = listiterator;
    }
}
