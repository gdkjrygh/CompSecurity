// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.aa;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

// Referenced classes of package com.google.android.m4b.maps.aa:
//            aq, e, ae, x

final class p extends aq
{

    p(Comparator comparator)
    {
        super(comparator);
    }

    final int a(Object aobj[], int i)
    {
        return i;
    }

    public final x a()
    {
        return com.google.android.m4b.maps.aa.e.a();
    }

    public final ae b()
    {
        return ae.e();
    }

    final aq b(Object obj)
    {
        return this;
    }

    final aq b(Object obj, Object obj1)
    {
        return this;
    }

    final aq c(Object obj)
    {
        return this;
    }

    public final boolean contains(Object obj)
    {
        return false;
    }

    public final boolean containsAll(Collection collection)
    {
        return collection.isEmpty();
    }

    final int d(Object obj)
    {
        return -1;
    }

    final boolean d()
    {
        return false;
    }

    public final x e()
    {
        return com.google.android.m4b.maps.aa.e.a();
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
        return com.google.android.m4b.maps.aa.e.a();
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
