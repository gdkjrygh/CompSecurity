// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.util.Iterator;
import java.util.NoSuchElementException;

// Referenced classes of package com.google.common.collect:
//            Iterators

static final class ptyIterator
    implements Iterator
{

    Iterator iterator;
    Iterator removeFrom;
    final Iterable val$iterable;

    public boolean hasNext()
    {
        if (!iterator.hasNext())
        {
            iterator = val$iterable.iterator();
        }
        return iterator.hasNext();
    }

    public Object next()
    {
        if (!hasNext())
        {
            throw new NoSuchElementException();
        } else
        {
            removeFrom = iterator;
            return iterator.next();
        }
    }

    public void remove()
    {
        boolean flag;
        if (removeFrom != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag, "no calls to next() since last call to remove()");
        removeFrom.remove();
        removeFrom = null;
    }

    (Iterable iterable1)
    {
        val$iterable = iterable1;
        super();
        iterator = Iterators.emptyIterator();
    }
}
