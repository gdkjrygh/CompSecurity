// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.NoSuchElementException;

// Referenced classes of package com.google.common.collect:
//            UnmodifiableIterator, Sets, ImmutableList

private static final class remainingSetBits extends UnmodifiableIterator
{

    final ImmutableList input;
    int remainingSetBits;

    public boolean hasNext()
    {
        return remainingSetBits != 0;
    }

    public Object next()
    {
        int i = Integer.numberOfTrailingZeros(remainingSetBits);
        if (i == 32)
        {
            throw new NoSuchElementException();
        } else
        {
            remainingSetBits = remainingSetBits & ~(1 << i);
            return input.get(i);
        }
    }

    (ImmutableList immutablelist, int i)
    {
        input = immutablelist;
        remainingSetBits = i;
    }
}
