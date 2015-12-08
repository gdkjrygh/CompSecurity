// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.util;

import java.util.Iterator;
import java.util.NoSuchElementException;

// Referenced classes of package com.fasterxml.jackson.databind.util:
//            ArrayBuilders

private static final class _index
    implements Iterable, Iterator
{

    private final Object _array[];
    private int _index;

    public final boolean hasNext()
    {
        return _index < _array.length;
    }

    public final Iterator iterator()
    {
        return this;
    }

    public final Object next()
    {
        if (_index >= _array.length)
        {
            throw new NoSuchElementException();
        } else
        {
            Object aobj[] = _array;
            int i = _index;
            _index = i + 1;
            return aobj[i];
        }
    }

    public final void remove()
    {
        throw new UnsupportedOperationException();
    }

    public (Object aobj[])
    {
        _array = aobj;
        _index = 0;
    }
}
