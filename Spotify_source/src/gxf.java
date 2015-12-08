// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ListIterator;

public final class gxf
    implements ListIterator
{

    private final ListIterator a;

    public gxf(ListIterator listiterator)
    {
        a = listiterator;
    }

    public final void add(Object obj)
    {
        throw new UnsupportedOperationException();
    }

    public final boolean hasNext()
    {
        return a.hasNext();
    }

    public final boolean hasPrevious()
    {
        return a.hasPrevious();
    }

    public final Object next()
    {
        return a.next();
    }

    public final int nextIndex()
    {
        return a.nextIndex();
    }

    public final Object previous()
    {
        return a.previous();
    }

    public final int previousIndex()
    {
        return a.previousIndex();
    }

    public final void remove()
    {
        throw new UnsupportedOperationException();
    }

    public final void set(Object obj)
    {
        throw new UnsupportedOperationException();
    }
}
