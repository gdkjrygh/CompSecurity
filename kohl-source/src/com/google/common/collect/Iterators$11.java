// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;


// Referenced classes of package com.google.common.collect:
//            AbstractIndexedListIterator, Iterators

static final class edListIterator extends AbstractIndexedListIterator
{

    final Object val$array[];

    protected Object get(int i)
    {
        return val$array[i];
    }

    edListIterator(int i, Object aobj[])
    {
        val$array = aobj;
        super(i);
    }
}
