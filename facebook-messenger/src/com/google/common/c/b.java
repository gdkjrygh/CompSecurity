// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.c;

import com.google.common.base.Preconditions;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.google.common.c:
//            c

public final class b
{

    private b()
    {
    }

    public static int a(long l)
    {
        return (int)(l >>> 32 ^ l);
    }

    public static int a(long l, long l1)
    {
        if (l < l1)
        {
            return -1;
        }
        return l <= l1 ? 0 : 1;
    }

    static int a(long al[], long l, int i, int j)
    {
        return c(al, l, i, j);
    }

    public static transient List a(long al[])
    {
        if (al.length == 0)
        {
            return Collections.emptyList();
        } else
        {
            return new c(al);
        }
    }

    public static long[] a(Collection collection)
    {
        if (collection instanceof c)
        {
            return ((c)collection).a();
        }
        collection = ((Collection) (collection.toArray()));
        int j = collection.length;
        long al[] = new long[j];
        for (int i = 0; i < j; i++)
        {
            al[i] = ((Long)Preconditions.checkNotNull(collection[i])).longValue();
        }

        return al;
    }

    static int b(long al[], long l, int i, int j)
    {
        return d(al, l, i, j);
    }

    private static int c(long al[], long l, int i, int j)
    {
        for (; i < j; i++)
        {
            if (al[i] == l)
            {
                return i;
            }
        }

        return -1;
    }

    private static int d(long al[], long l, int i, int j)
    {
        for (j--; j >= i; j--)
        {
            if (al[j] == l)
            {
                return j;
            }
        }

        return -1;
    }
}
