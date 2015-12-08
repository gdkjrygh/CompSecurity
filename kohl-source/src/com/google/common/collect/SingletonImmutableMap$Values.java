// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Iterator;

// Referenced classes of package com.google.common.collect:
//            ImmutableCollection, SingletonImmutableMap, Iterators, UnmodifiableIterator

private static class singleValue extends ImmutableCollection
{

    final Object singleValue;

    public boolean contains(Object obj)
    {
        return singleValue.equals(obj);
    }

    public boolean isEmpty()
    {
        return false;
    }

    boolean isPartialView()
    {
        return true;
    }

    public UnmodifiableIterator iterator()
    {
        return Iterators.singletonIterator(singleValue);
    }

    public volatile Iterator iterator()
    {
        return iterator();
    }

    public int size()
    {
        return 1;
    }

    (Object obj)
    {
        singleValue = obj;
    }
}
