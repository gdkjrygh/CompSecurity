// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.util;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class ArrayIterator
    implements Iterable, Iterator
{

    private final Object _a[];
    private int _index;

    public ArrayIterator(Object aobj[])
    {
        _a = aobj;
        _index = 0;
    }

    public boolean hasNext()
    {
        return _index < _a.length;
    }

    public Iterator iterator()
    {
        return this;
    }

    public Object next()
    {
        if (_index >= _a.length)
        {
            throw new NoSuchElementException();
        } else
        {
            Object aobj[] = _a;
            int i = _index;
            _index = i + 1;
            return aobj[i];
        }
    }

    public void remove()
    {
        throw new UnsupportedOperationException();
    }
}
