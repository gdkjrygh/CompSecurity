// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

// Referenced classes of package a.a:
//            fq, ft, fb, ge, 
//            gs

final class eo extends fq
{

    eo(Comparator comparator)
    {
        super(comparator);
    }

    final int a(Object aobj[], int i)
    {
        return i;
    }

    final fq a(Object obj, boolean flag)
    {
        return this;
    }

    final fq a(Object obj, boolean flag, Object obj1, boolean flag1)
    {
        return this;
    }

    public final gs a()
    {
        return ft.a();
    }

    public final gs a_()
    {
        return ft.a();
    }

    final fq b(Object obj, boolean flag)
    {
        return this;
    }

    public final fb b_()
    {
        return fb.d();
    }

    public final boolean contains(Object obj)
    {
        return false;
    }

    public final boolean containsAll(Collection collection)
    {
        return collection.isEmpty();
    }

    final fq d()
    {
        return new eo(ge.a(a).a());
    }

    public final Iterator descendingIterator()
    {
        return ft.a();
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
        return ft.a();
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
