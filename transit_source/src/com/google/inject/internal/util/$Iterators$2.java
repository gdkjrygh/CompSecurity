// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.internal.util;

import java.util.ListIterator;
import java.util.NoSuchElementException;

// Referenced classes of package com.google.inject.internal.util:
//            $Iterators

static final class 
    implements ListIterator
{

    public void add(Object obj)
    {
        throw new UnsupportedOperationException();
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
        throw new NoSuchElementException();
    }

    public int nextIndex()
    {
        return 0;
    }

    public Object previous()
    {
        throw new NoSuchElementException();
    }

    public int previousIndex()
    {
        return -1;
    }

    public void remove()
    {
        throw new UnsupportedOperationException();
    }

    public void set(Object obj)
    {
        throw new UnsupportedOperationException();
    }

    ()
    {
    }
}
