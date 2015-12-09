// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ListIterator;

public abstract class cvg extends cvf
    implements ListIterator
{

    public cvg(ListIterator listiterator)
    {
        super(listiterator);
    }

    public void add(Object obj)
    {
        throw new UnsupportedOperationException();
    }

    public final boolean hasPrevious()
    {
        return cuw.g(a).hasPrevious();
    }

    public final int nextIndex()
    {
        return cuw.g(a).nextIndex();
    }

    public final Object previous()
    {
        return a(cuw.g(a).previous());
    }

    public final int previousIndex()
    {
        return cuw.g(a).previousIndex();
    }

    public void set(Object obj)
    {
        throw new UnsupportedOperationException();
    }
}
