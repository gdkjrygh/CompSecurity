// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.a.b;

import com.c.a.a.u;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.c.a.b:
//            m, w, ao

final class al extends m
{

    final transient Object a;

    al(Object obj)
    {
        a = u.a(obj);
    }

    final int a(Object aobj[], int i)
    {
        aobj[i] = a;
        return i + 1;
    }

    public final ao a()
    {
        return w.a(a);
    }

    public final m a(int i, int j)
    {
        u.a(i, j, 1);
        Object obj = this;
        if (i == j)
        {
            obj = m.f();
        }
        return ((m) (obj));
    }

    final boolean b()
    {
        return false;
    }

    public final boolean contains(Object obj)
    {
        return a.equals(obj);
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
        u.a(i, 1);
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
        return w.a(a);
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
