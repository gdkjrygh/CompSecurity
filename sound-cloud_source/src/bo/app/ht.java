// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import java.util.Iterator;
import java.util.List;

// Referenced classes of package bo.app:
//            gg, fa, gy, hw

final class ht extends gg
{

    final transient Object b;

    ht(Object obj)
    {
        b = fa.a(obj);
    }

    final int a(Object aobj[], int i)
    {
        aobj[i] = b;
        return i + 1;
    }

    public final gg a(int i, int j)
    {
        fa.a(i, j, 1);
        Object obj = this;
        if (i == j)
        {
            obj = gg.a;
        }
        return ((gg) (obj));
    }

    public final hw a()
    {
        return gy.a(b);
    }

    public final boolean contains(Object obj)
    {
        return b.equals(obj);
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

    public final Object get(int i)
    {
        fa.a(i, 1);
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
        return gy.a(b);
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
        String s = b.toString();
        return (new StringBuilder(s.length() + 2)).append('[').append(s).append(']').toString();
    }
}
