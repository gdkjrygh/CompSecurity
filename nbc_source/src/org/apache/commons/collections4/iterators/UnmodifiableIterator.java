// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.collections4.iterators;

import java.util.Iterator;
import org.apache.commons.collections4.Unmodifiable;

public final class UnmodifiableIterator
    implements Iterator, Unmodifiable
{

    private final Iterator iterator;

    private UnmodifiableIterator(Iterator iterator1)
    {
        iterator = iterator1;
    }

    public static Iterator unmodifiableIterator(Iterator iterator1)
    {
        if (iterator1 == null)
        {
            throw new IllegalArgumentException("Iterator must not be null");
        }
        if (iterator1 instanceof Unmodifiable)
        {
            return iterator1;
        } else
        {
            return new UnmodifiableIterator(iterator1);
        }
    }

    public boolean hasNext()
    {
        return iterator.hasNext();
    }

    public Object next()
    {
        return iterator.next();
    }

    public void remove()
    {
        throw new UnsupportedOperationException("remove() is not supported");
    }
}
