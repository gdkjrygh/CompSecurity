// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Iterator;

// Referenced classes of package com.google.common.collect:
//            ImmutableCollection

static abstract class 
{

    public abstract  add(Object obj);

    public transient  add(Object aobj[])
    {
        int j = aobj.length;
        for (int i = 0; i < j; i++)
        {
            add(aobj[i]);
        }

        return this;
    }

    public add addAll(Iterable iterable)
    {
        for (iterable = iterable.iterator(); iterable.hasNext(); add(iterable.next())) { }
        return this;
    }

    public add addAll(Iterator iterator)
    {
        for (; iterator.hasNext(); add(iterator.next())) { }
        return this;
    }

    public abstract ImmutableCollection build();

    ()
    {
    }
}
