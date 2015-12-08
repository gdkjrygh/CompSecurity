// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.p;
import java.io.Serializable;
import java.util.Iterator;

// Referenced classes of package com.google.common.collect:
//            Ordering, NaturalOrdering

final class ReverseNaturalOrdering extends Ordering
    implements Serializable
{

    static final ReverseNaturalOrdering INSTANCE = new ReverseNaturalOrdering();
    private static final long serialVersionUID = 0L;

    private ReverseNaturalOrdering()
    {
    }

    private Object readResolve()
    {
        return INSTANCE;
    }

    public final int compare(Comparable comparable, Comparable comparable1)
    {
        p.a(comparable);
        if (comparable == comparable1)
        {
            return 0;
        } else
        {
            return comparable1.compareTo(comparable);
        }
    }

    public final volatile int compare(Object obj, Object obj1)
    {
        return compare((Comparable)obj, (Comparable)obj1);
    }

    public final Comparable max(Comparable comparable, Comparable comparable1)
    {
        return (Comparable)NaturalOrdering.INSTANCE.min(comparable, comparable1);
    }

    public final transient Comparable max(Comparable comparable, Comparable comparable1, Comparable comparable2, Comparable acomparable[])
    {
        return (Comparable)NaturalOrdering.INSTANCE.min(comparable, comparable1, comparable2, acomparable);
    }

    public final Comparable max(Iterable iterable)
    {
        return (Comparable)NaturalOrdering.INSTANCE.min(iterable);
    }

    public final Comparable max(Iterator iterator)
    {
        return (Comparable)NaturalOrdering.INSTANCE.min(iterator);
    }

    public final volatile Object max(Iterable iterable)
    {
        return max(iterable);
    }

    public final volatile Object max(Object obj, Object obj1)
    {
        return max((Comparable)obj, (Comparable)obj1);
    }

    public final volatile Object max(Object obj, Object obj1, Object obj2, Object aobj[])
    {
        return max((Comparable)obj, (Comparable)obj1, (Comparable)obj2, (Comparable[])aobj);
    }

    public final volatile Object max(Iterator iterator)
    {
        return max(iterator);
    }

    public final Comparable min(Comparable comparable, Comparable comparable1)
    {
        return (Comparable)NaturalOrdering.INSTANCE.max(comparable, comparable1);
    }

    public final transient Comparable min(Comparable comparable, Comparable comparable1, Comparable comparable2, Comparable acomparable[])
    {
        return (Comparable)NaturalOrdering.INSTANCE.max(comparable, comparable1, comparable2, acomparable);
    }

    public final Comparable min(Iterable iterable)
    {
        return (Comparable)NaturalOrdering.INSTANCE.max(iterable);
    }

    public final Comparable min(Iterator iterator)
    {
        return (Comparable)NaturalOrdering.INSTANCE.max(iterator);
    }

    public final volatile Object min(Iterable iterable)
    {
        return min(iterable);
    }

    public final volatile Object min(Object obj, Object obj1)
    {
        return min((Comparable)obj, (Comparable)obj1);
    }

    public final volatile Object min(Object obj, Object obj1, Object obj2, Object aobj[])
    {
        return min((Comparable)obj, (Comparable)obj1, (Comparable)obj2, (Comparable[])aobj);
    }

    public final volatile Object min(Iterator iterator)
    {
        return min(iterator);
    }

    public final Ordering reverse()
    {
        return Ordering.natural();
    }

    public final String toString()
    {
        return "Ordering.natural().reverse()";
    }

}
