// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.b;

import com.google.a.a.ad;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.a.b:
//            ar, bl, di

final class dd extends ar
{

    final transient Object a;

    dd(Object obj)
    {
        a = ad.a(obj);
    }

    final int a(Object aobj[], int i)
    {
        aobj[i] = a;
        return i + 1;
    }

    public final ar a(int i, int j)
    {
        ad.a(i, j, 1);
        Object obj = this;
        if (i == j)
        {
            obj = ar.d();
        }
        return ((ar) (obj));
    }

    public final di a()
    {
        return bl.a(a);
    }

    public final boolean contains(Object obj)
    {
        return a.equals(obj);
    }

    final boolean e()
    {
        return false;
    }

    public final boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (obj instanceof List)
            {
                if (((List) (obj = (List)obj)).size() != 1 || !a.equals(((List) (obj)).get(0)))
                {
                    return false;
                }
            } else
            {
                return false;
            }
        }
        return true;
    }

    public final Object get(int i)
    {
        ad.a(i, 1);
        return a;
    }

    public final int hashCode()
    {
        return a.hashCode() + 31;
    }

    public final int indexOf(Object obj)
    {
        return !a.equals(obj) ? -1 : 0;
    }

    public final boolean isEmpty()
    {
        return false;
    }

    public final Iterator iterator()
    {
        return bl.a(a);
    }

    public final int lastIndexOf(Object obj)
    {
        return indexOf(obj);
    }

    public final int size()
    {
        return 1;
    }

    public final List subList(int i, int j)
    {
        return a(i, j);
    }

    public final String toString()
    {
        String s = a.toString();
        return (new StringBuilder(s.length() + 2)).append('[').append(s).append(']').toString();
    }
}
