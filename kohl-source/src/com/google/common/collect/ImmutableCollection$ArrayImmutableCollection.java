// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Iterator;

// Referenced classes of package com.google.common.collect:
//            ImmutableCollection, SingletonImmutableList, RegularImmutableList, Iterators, 
//            ImmutableList, UnmodifiableIterator

private static class elements extends ImmutableCollection
{

    private final Object elements[];

    ImmutableList createAsList()
    {
        if (elements.length == 1)
        {
            return new SingletonImmutableList(elements[0]);
        } else
        {
            return new RegularImmutableList(elements);
        }
    }

    public boolean isEmpty()
    {
        return false;
    }

    boolean isPartialView()
    {
        return false;
    }

    public UnmodifiableIterator iterator()
    {
        return Iterators.forArray(elements);
    }

    public volatile Iterator iterator()
    {
        return iterator();
    }

    public int size()
    {
        return elements.length;
    }

    (Object aobj[])
    {
        elements = aobj;
    }
}
