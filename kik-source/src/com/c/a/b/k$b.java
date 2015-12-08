// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.a.b;

import java.util.Iterator;

// Referenced classes of package com.c.a.b:
//            k

public static abstract class ct
{

    static int a(int i, int j)
    {
        if (j < 0)
        {
            throw new AssertionError("cannot store more than MAX_VALUE elements");
        }
        int l = (i >> 1) + i + 1;
        i = l;
        if (l < j)
        {
            i = Integer.highestOneBit(j - 1) << 1;
        }
        j = i;
        if (i < 0)
        {
            j = 0x7fffffff;
        }
        return j;
    }

    public ator a(Iterator iterator)
    {
        for (; iterator.hasNext(); b(iterator.next())) { }
        return this;
    }

    public abstract ct b(Object obj);

    ct()
    {
    }
}
