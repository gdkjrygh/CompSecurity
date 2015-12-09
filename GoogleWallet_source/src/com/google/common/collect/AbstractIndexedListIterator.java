// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.util.NoSuchElementException;

// Referenced classes of package com.google.common.collect:
//            UnmodifiableListIterator

abstract class AbstractIndexedListIterator extends UnmodifiableListIterator
{

    private int position;
    private final int size;

    protected AbstractIndexedListIterator(int i, int j)
    {
        Preconditions.checkPositionIndex(j, i);
        size = i;
        position = j;
    }

    protected abstract Object get(int i);

    public final boolean hasNext()
    {
        return position < size;
    }

    public final boolean hasPrevious()
    {
        return position > 0;
    }

    public final Object next()
    {
        if (!hasNext())
        {
            throw new NoSuchElementException();
        } else
        {
            int i = position;
            position = i + 1;
            return get(i);
        }
    }

    public final int nextIndex()
    {
        return position;
    }

    public final Object previous()
    {
        if (!hasPrevious())
        {
            throw new NoSuchElementException();
        } else
        {
            int i = position - 1;
            position = i;
            return get(i);
        }
    }

    public final int previousIndex()
    {
        return position - 1;
    }
}
