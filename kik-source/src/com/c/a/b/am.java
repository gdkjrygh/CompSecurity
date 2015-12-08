// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.a.b;

import com.c.a.a.u;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.c.a.b:
//            v, w, ao

final class am extends v
{

    final transient Object a;
    private transient int b;

    am(Object obj)
    {
        a = u.a(obj);
    }

    am(Object obj, int i)
    {
        a = obj;
        b = i;
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

    final boolean b()
    {
        return false;
    }

    public final boolean contains(Object obj)
    {
        return a.equals(obj);
    }

    final boolean d()
    {
        return b != 0;
    }

    public final boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (obj instanceof Set)
            {
                if (((Set) (obj = (Set)obj)).size() != 1 || !a.equals(((Set) (obj)).iterator().next()))
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

    public final int hashCode()
    {
        int j = b;
        int i = j;
        if (j == 0)
        {
            i = a.hashCode();
            b = i;
        }
        return i;
    }

    public final boolean isEmpty()
    {
        return false;
    }

    public final Iterator iterator()
    {
        return w.a(a);
    }

    public final int size()
    {
        return 1;
    }

    public final String toString()
    {
        String s = a.toString();
        return (new StringBuilder(s.length() + 2)).append('[').append(s).append(']').toString();
    }
}
