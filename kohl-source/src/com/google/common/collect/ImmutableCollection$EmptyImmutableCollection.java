// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Iterator;

// Referenced classes of package com.google.common.collect:
//            ImmutableCollection, ImmutableList, Iterators, UnmodifiableIterator

private static class <init> extends ImmutableCollection
{

    private static final Object EMPTY_ARRAY[] = new Object[0];

    public boolean contains(Object obj)
    {
        return false;
    }

    ImmutableList createAsList()
    {
        return ImmutableList.of();
    }

    public boolean isEmpty()
    {
        return true;
    }

    boolean isPartialView()
    {
        return false;
    }

    public UnmodifiableIterator iterator()
    {
        return Iterators.EMPTY_ITERATOR;
    }

    public volatile Iterator iterator()
    {
        return iterator();
    }

    public int size()
    {
        return 0;
    }

    public Object[] toArray()
    {
        return EMPTY_ARRAY;
    }

    public Object[] toArray(Object aobj[])
    {
        if (aobj.length > 0)
        {
            aobj[0] = null;
        }
        return aobj;
    }


    private ()
    {
    }

    ( )
    {
        this();
    }
}
