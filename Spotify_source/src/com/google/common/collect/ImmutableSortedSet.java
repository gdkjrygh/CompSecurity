// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import ctz;
import cuv;
import cuw;
import cuz;
import cva;
import cvd;
import cvh;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.SortedSet;

// Referenced classes of package com.google.common.collect:
//            ImmutableSortedSetFauxverideShim, EmptyImmutableSortedSet, RegularImmutableSortedSet, ImmutableList, 
//            DescendingImmutableSortedSet

public abstract class ImmutableSortedSet extends ImmutableSortedSetFauxverideShim
    implements cvd, NavigableSet
{

    private static final Comparator b;
    private static final ImmutableSortedSet c;
    final transient Comparator a;
    private transient ImmutableSortedSet d;

    ImmutableSortedSet(Comparator comparator1)
    {
        a = comparator1;
    }

    static ImmutableSortedSet a(Comparator comparator1)
    {
        if (b.equals(comparator1))
        {
            return c;
        } else
        {
            return new EmptyImmutableSortedSet(comparator1);
        }
    }

    static transient ImmutableSortedSet a(Comparator comparator1, int i, Object aobj[])
    {
        if (i == 0)
        {
            return a(comparator1);
        }
        cuz.c(aobj, i);
        Arrays.sort(aobj, 0, i, comparator1);
        int k = 1;
        int j = 1;
        for (; k < i; k++)
        {
            Object obj = aobj[k];
            if (comparator1.compare(obj, aobj[j - 1]) != 0)
            {
                int l = j + 1;
                aobj[j] = obj;
                j = l;
            }
        }

        Arrays.fill(aobj, j, i, null);
        return new RegularImmutableSortedSet(ImmutableList.b(aobj, j), comparator1);
    }

    private void readObject(ObjectInputStream objectinputstream)
    {
        throw new InvalidObjectException("Use SerializedForm");
    }

    abstract int a(Object obj);

    final int a(Object obj, Object obj1)
    {
        return a.compare(obj, obj1);
    }

    abstract ImmutableSortedSet a(Object obj, boolean flag);

    abstract ImmutableSortedSet a(Object obj, boolean flag, Object obj1, boolean flag1);

    public abstract cvh a();

    abstract ImmutableSortedSet b(Object obj, boolean flag);

    public final ImmutableSortedSet b(Object obj, boolean flag, Object obj1, boolean flag1)
    {
        ctz.a(obj);
        ctz.a(obj1);
        boolean flag2;
        if (a.compare(obj, obj1) <= 0)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        ctz.a(flag2);
        return a(obj, flag, obj1, flag1);
    }

    public final ImmutableSortedSet c(Object obj, boolean flag)
    {
        return a(ctz.a(obj), flag);
    }

    public abstract cvh c();

    public Object ceiling(Object obj)
    {
        return cuv.d(d(obj, true));
    }

    public Comparator comparator()
    {
        return a;
    }

    ImmutableSortedSet d()
    {
        return new DescendingImmutableSortedSet(this);
    }

    public final ImmutableSortedSet d(Object obj, boolean flag)
    {
        return b(ctz.a(obj), flag);
    }

    public Iterator descendingIterator()
    {
        return c();
    }

    public NavigableSet descendingSet()
    {
        return m_();
    }

    public Object first()
    {
        return a().next();
    }

    public Object floor(Object obj)
    {
        return cuw.e(c(obj, true).c());
    }

    public NavigableSet headSet(Object obj, boolean flag)
    {
        return c(obj, flag);
    }

    public SortedSet headSet(Object obj)
    {
        return c(obj, false);
    }

    public Object higher(Object obj)
    {
        return cuv.d(d(obj, false));
    }

    public Iterator iterator()
    {
        return a();
    }

    public Object last()
    {
        return c().next();
    }

    public Object lower(Object obj)
    {
        return cuw.e(c(obj, false).c());
    }

    public ImmutableSortedSet m_()
    {
        ImmutableSortedSet immutablesortedset1 = d;
        ImmutableSortedSet immutablesortedset = immutablesortedset1;
        if (immutablesortedset1 == null)
        {
            immutablesortedset = d();
            d = immutablesortedset;
            immutablesortedset.d = this;
        }
        return immutablesortedset;
    }

    public final Object pollFirst()
    {
        throw new UnsupportedOperationException();
    }

    public final Object pollLast()
    {
        throw new UnsupportedOperationException();
    }

    public NavigableSet subSet(Object obj, boolean flag, Object obj1, boolean flag1)
    {
        return b(obj, flag, obj1, flag1);
    }

    public SortedSet subSet(Object obj, Object obj1)
    {
        return b(obj, true, obj1, false);
    }

    public NavigableSet tailSet(Object obj, boolean flag)
    {
        return d(obj, flag);
    }

    public SortedSet tailSet(Object obj)
    {
        return d(obj, true);
    }

    Object writeReplace()
    {
        return new SerializedForm(a, toArray());
    }

    static 
    {
        b = cva.b();
        c = new EmptyImmutableSortedSet(b);
    }

    private class SerializedForm
        implements Serializable
    {

        private static final long serialVersionUID = 0L;
        final Comparator comparator;
        final Object elements[];

        Object readResolve()
        {
            cuu cuu1 = (new cuu(comparator)).c((Object[])elements);
            Object aobj[] = (Object[])cuu1.a;
            ImmutableSortedSet immutablesortedset = ImmutableSortedSet.a(cuu1.c, cuu1.b, aobj);
            cuu1.b = immutablesortedset.size();
            return immutablesortedset;
        }

        public SerializedForm(Comparator comparator1, Object aobj[])
        {
            comparator = comparator1;
            elements = aobj;
        }
    }

}
