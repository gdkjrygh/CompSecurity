// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.c;

import com.google.common.base.Preconditions;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

// Referenced classes of package com.google.common.c:
//            b

class c extends AbstractList
    implements Serializable, RandomAccess
{

    final long a[];
    final int b;
    final int c;

    c(long al[])
    {
        this(al, 0, al.length);
    }

    c(long al[], int i, int j)
    {
        a = al;
        b = i;
        c = j;
    }

    public Long a(int i)
    {
        Preconditions.checkElementIndex(i, size());
        return Long.valueOf(a[b + i]);
    }

    public Long a(int i, Long long1)
    {
        Preconditions.checkElementIndex(i, size());
        long l = a[b + i];
        a[b + i] = ((Long)Preconditions.checkNotNull(long1)).longValue();
        return Long.valueOf(l);
    }

    long[] a()
    {
        int i = size();
        long al[] = new long[i];
        System.arraycopy(a, b, al, 0, i);
        return al;
    }

    public boolean contains(Object obj)
    {
        return (obj instanceof Long) && com.google.common.c.b.a(a, ((Long)obj).longValue(), b, c) != -1;
    }

    public boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (obj instanceof c)
            {
                obj = (c)obj;
                int j = size();
                if (((c) (obj)).size() != j)
                {
                    return false;
                }
                int i = 0;
                while (i < j) 
                {
                    if (a[b + i] != ((c) (obj)).a[((c) (obj)).b + i])
                    {
                        return false;
                    }
                    i++;
                }
            } else
            {
                return super.equals(obj);
            }
        }
        return true;
    }

    public Object get(int i)
    {
        return a(i);
    }

    public int hashCode()
    {
        int j = 1;
        for (int i = b; i < c; i++)
        {
            j = j * 31 + com.google.common.c.b.a(a[i]);
        }

        return j;
    }

    public int indexOf(Object obj)
    {
        if (obj instanceof Long)
        {
            int i = com.google.common.c.b.a(a, ((Long)obj).longValue(), b, c);
            if (i >= 0)
            {
                return i - b;
            }
        }
        return -1;
    }

    public boolean isEmpty()
    {
        return false;
    }

    public int lastIndexOf(Object obj)
    {
        if (obj instanceof Long)
        {
            int i = com.google.common.c.b.b(a, ((Long)obj).longValue(), b, c);
            if (i >= 0)
            {
                return i - b;
            }
        }
        return -1;
    }

    public Object set(int i, Object obj)
    {
        return a(i, (Long)obj);
    }

    public int size()
    {
        return c - b;
    }

    public List subList(int i, int j)
    {
        Preconditions.checkPositionIndexes(i, j, size());
        if (i == j)
        {
            return Collections.emptyList();
        } else
        {
            return new c(a, b + i, b + j);
        }
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder(size() * 10);
        stringbuilder.append('[').append(a[b]);
        for (int i = b + 1; i < c; i++)
        {
            stringbuilder.append(", ").append(a[i]);
        }

        return stringbuilder.append(']').toString();
    }
}
