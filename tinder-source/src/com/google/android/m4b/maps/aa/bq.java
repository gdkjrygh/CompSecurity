// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.aa;

import com.google.android.m4b.maps.y.j;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.m4b.maps.aa:
//            ae, e, x

final class bq extends ae
{

    private transient Object b;

    bq(Object obj)
    {
        b = j.a(obj);
    }

    final int a(Object aobj[], int i)
    {
        aobj[i] = b;
        return i + 1;
    }

    public final ae a(int i, int k)
    {
        j.a(i, k, 1);
        Object obj = this;
        if (i == k)
        {
            obj = ae.a;
        }
        return ((ae) (obj));
    }

    public final x a()
    {
        return e.a(b);
    }

    public final boolean contains(Object obj)
    {
        return b.equals(obj);
    }

    final boolean d()
    {
        return false;
    }

    public final boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (obj instanceof List)
            {
                if (((List) (obj = (List)obj)).size() != 1 || !b.equals(((List) (obj)).get(0)))
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

    public final ae f()
    {
        return this;
    }

    public final Object get(int i)
    {
        j.a(i, 1);
        return b;
    }

    public final int hashCode()
    {
        return b.hashCode() + 31;
    }

    public final int indexOf(Object obj)
    {
        return !b.equals(obj) ? -1 : 0;
    }

    public final boolean isEmpty()
    {
        return false;
    }

    public final Iterator iterator()
    {
        return e.a(b);
    }

    public final int lastIndexOf(Object obj)
    {
        return indexOf(obj);
    }

    public final int size()
    {
        return 1;
    }

    public final List subList(int i, int k)
    {
        return a(i, k);
    }

    public final String toString()
    {
        String s = b.toString();
        return (new StringBuilder(s.length() + 2)).append('[').append(s).append(']').toString();
    }
}
