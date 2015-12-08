// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.internal.util;

import java.util.NoSuchElementException;

// Referenced classes of package com.google.inject.internal.util:
//            $UnmodifiableIterator, $Iterators

static final class i extends $UnmodifiableIterator
{

    int i;
    final int length;
    final Object val$array[];

    public boolean hasNext()
    {
        return i < length;
    }

    public Object next()
    {
        Object obj;
        try
        {
            obj = val$array[i];
            i = i + 1;
        }
        catch (ArrayIndexOutOfBoundsException arrayindexoutofboundsexception)
        {
            throw new NoSuchElementException();
        }
        return obj;
    }

    Iterator(Object aobj[])
    {
        val$array = aobj;
        super();
        length = val$array.length;
        i = 0;
    }
}
