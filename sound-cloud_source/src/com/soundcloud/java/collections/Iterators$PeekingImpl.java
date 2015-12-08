// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.java.collections;

import com.soundcloud.java.checks.Preconditions;
import java.util.Iterator;

// Referenced classes of package com.soundcloud.java.collections:
//            PeekingIterator, Iterators

private static class iterator
    implements PeekingIterator
{

    private boolean hasPeeked;
    private final Iterator iterator;
    private Object peekedElement;

    public boolean hasNext()
    {
        return hasPeeked || iterator.hasNext();
    }

    public Object next()
    {
        if (!hasPeeked)
        {
            return iterator.next();
        } else
        {
            Object obj = peekedElement;
            hasPeeked = false;
            peekedElement = null;
            return obj;
        }
    }

    public Object peek()
    {
        if (!hasPeeked)
        {
            peekedElement = iterator.next();
            hasPeeked = true;
        }
        return peekedElement;
    }

    public void remove()
    {
        boolean flag;
        if (!hasPeeked)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag, "Can't remove after you've peeked at next");
        iterator.remove();
    }

    public (Iterator iterator1)
    {
        iterator = (Iterator)Preconditions.checkNotNull(iterator1);
    }
}
