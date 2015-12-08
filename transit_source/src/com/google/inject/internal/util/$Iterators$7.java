// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.internal.util;

import java.util.NoSuchElementException;

// Referenced classes of package com.google.inject.internal.util:
//            $UnmodifiableIterator, $Iterators

static final class val.offset extends $UnmodifiableIterator
{

    int i;
    final Object val$array[];
    final int val$end;
    final int val$offset;

    public boolean hasNext()
    {
        return i < val$end;
    }

    public Object next()
    {
        if (!hasNext())
        {
            throw new NoSuchElementException();
        } else
        {
            Object aobj[] = val$array;
            int j = i;
            i = j + 1;
            return aobj[j];
        }
    }

    Iterator(int j, int k, Object aobj[])
    {
        val$offset = j;
        val$end = k;
        val$array = aobj;
        super();
        i = val$offset;
    }
}
