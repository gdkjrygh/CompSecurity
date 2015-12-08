// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.b;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

// Referenced classes of package com.google.a.b:
//            bg, bl, ar, cn, 
//            di

final class af extends bg
{

    af(Comparator comparator)
    {
        super(comparator);
    }

    final int a(Object aobj[], int i)
    {
        return i;
    }

    final bg a(Object obj, boolean flag)
    {
        return this;
    }

    final bg a(Object obj, boolean flag, Object obj1, boolean flag1)
    {
        return this;
    }

    public final di a()
    {
        return bl.a();
    }

    public final ar b()
    {
        return ar.d();
    }

    final bg b(Object obj, boolean flag)
    {
        return this;
    }

    public final di c()
    {
        return bl.a();
    }

    public final boolean contains(Object obj)
    {
        return false;
    }

    public final boolean containsAll(Collection collection)
    {
        return collection.isEmpty();
    }

    final bg d()
    {
        return new af(cn.a(a).a());
    }

    public final Iterator descendingIterator()
    {
        return bl.a();
    }

    final boolean e()
    {
        return false;
    }

    public final boolean equals(Object obj)
    {
        if (obj instanceof Set)
        {
            return ((Set)obj).isEmpty();
        } else
        {
            return false;
        }
    }

    public final Object first()
    {
        throw new NoSuchElementException();
    }

    public final int hashCode()
    {
        return 0;
    }

    public final boolean isEmpty()
    {
        return true;
    }

    public final Iterator iterator()
    {
        return bl.a();
    }

    public final Object last()
    {
        throw new NoSuchElementException();
    }

    public final int size()
    {
        return 0;
    }

    public final String toString()
    {
        return "[]";
    }
}
