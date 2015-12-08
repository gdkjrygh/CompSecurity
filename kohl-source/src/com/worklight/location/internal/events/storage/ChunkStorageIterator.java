// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.location.internal.events.storage;

import java.util.Iterator;

// Referenced classes of package com.worklight.location.internal.events.storage:
//            Chunk

final class ChunkStorageIterator
    implements Iterator
{

    private final Iterator iterator;
    private final Iterator persistentIterator;

    ChunkStorageIterator(Iterator iterator1, Iterator iterator2)
    {
        iterator = iterator1;
        persistentIterator = iterator2;
    }

    public boolean hasNext()
    {
        return iterator.hasNext() || persistentIterator.hasNext();
    }

    public Chunk next()
    {
        if (iterator.hasNext())
        {
            return (Chunk)iterator.next();
        } else
        {
            return (Chunk)persistentIterator.next();
        }
    }

    public volatile Object next()
    {
        return next();
    }

    public void remove()
    {
        throw new UnsupportedOperationException();
    }
}
