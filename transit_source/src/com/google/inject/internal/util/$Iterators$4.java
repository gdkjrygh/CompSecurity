// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.internal.util;

import java.util.Iterator;
import java.util.NoSuchElementException;

// Referenced classes of package com.google.inject.internal.util:
//            $Iterators, $Preconditions

static final class ptyIterator
    implements Iterator
{

    Iterator current;
    Iterator removeFrom;
    final Iterator val$inputs;

    public boolean hasNext()
    {
        for (; !current.hasNext() && val$inputs.hasNext(); current = (Iterator)val$inputs.next()) { }
        return current.hasNext();
    }

    public Object next()
    {
        if (!hasNext())
        {
            throw new NoSuchElementException();
        } else
        {
            removeFrom = current;
            return current.next();
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
        $Preconditions.checkState(flag, "no calls to next() since last call to remove()");
        removeFrom.remove();
        removeFrom = null;
    }

    s(Iterator iterator)
    {
        val$inputs = iterator;
        super();
        current = $Iterators.emptyIterator();
    }
}
