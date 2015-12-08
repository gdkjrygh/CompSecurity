// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.collections4.iterators;

import java.util.NoSuchElementException;

abstract class AbstractEmptyIterator
{

    protected AbstractEmptyIterator()
    {
    }

    public void add(Object obj)
    {
        throw new UnsupportedOperationException("add() not supported for empty Iterator");
    }

    public boolean hasNext()
    {
        return false;
    }

    public boolean hasPrevious()
    {
        return false;
    }

    public Object next()
    {
        throw new NoSuchElementException("Iterator contains no elements");
    }

    public int nextIndex()
    {
        return 0;
    }

    public Object previous()
    {
        throw new NoSuchElementException("Iterator contains no elements");
    }

    public int previousIndex()
    {
        return -1;
    }

    public void remove()
    {
        throw new IllegalStateException("Iterator contains no elements");
    }

    public void set(Object obj)
    {
        throw new IllegalStateException("Iterator contains no elements");
    }
}
