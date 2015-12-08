// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Iterator;

public abstract class cup
{

    cup()
    {
    }

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

    public cup a(Iterable iterable)
    {
        for (iterable = iterable.iterator(); iterable.hasNext(); b(iterable.next())) { }
        return this;
    }

    public transient cup a(Object aobj[])
    {
        int j = aobj.length;
        for (int i = 0; i < j; i++)
        {
            b(aobj[i]);
        }

        return this;
    }

    public abstract cup b(Object obj);
}
