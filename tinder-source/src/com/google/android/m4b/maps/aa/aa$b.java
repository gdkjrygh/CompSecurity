// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.aa;

import java.util.Iterator;

// Referenced classes of package com.google.android.m4b.maps.aa:
//            aa

public static abstract class 
{

    static int a(int i, int j)
    {
        if (j < 0)
        {
            throw new AssertionError("cannot store more than MAX_VALUE elements");
        }
        int k = (i >> 1) + i + 1;
        i = k;
        if (k < j)
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

    public  a(Iterable iterable)
    {
        for (iterable = iterable.iterator(); iterable.hasNext(); b(iterable.next())) { }
        return this;
    }

    public b a(Iterator iterator)
    {
        for (; iterator.hasNext(); b(iterator.next())) { }
        return this;
    }

    public transient b a(Object aobj[])
    {
        int j = aobj.length;
        for (int i = 0; i < j; i++)
        {
            b(aobj[i]);
        }

        return this;
    }

    public abstract b b(Object obj);

    ()
    {
    }
}
