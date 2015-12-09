// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import ctz;
import cuw;
import cvh;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            ImmutableSet

final class SingletonImmutableSet extends ImmutableSet
{

    private transient Object a;
    private transient int b;

    SingletonImmutableSet(Object obj)
    {
        a = ctz.a(obj);
    }

    SingletonImmutableSet(Object obj, int i)
    {
        a = obj;
        b = i;
    }

    final int a(Object aobj[], int i)
    {
        aobj[i] = a;
        return i + 1;
    }

    public final cvh a()
    {
        return cuw.a(a);
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
        return cuw.a(a);
    }

    final boolean n_()
    {
        return b != 0;
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
