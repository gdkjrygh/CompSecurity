// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import com.google.common.base.Preconditions;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

// Referenced classes of package com.google.common.a:
//            em, ax, kq, hq, 
//            ju, dl, et, mi, 
//            mh

public abstract class es extends em
    implements List, RandomAccess
{

    es()
    {
    }

    public static es a(Iterable iterable)
    {
        Preconditions.checkNotNull(iterable);
        if (iterable instanceof Collection)
        {
            return a(ax.a(iterable));
        } else
        {
            return a(iterable.iterator());
        }
    }

    public static es a(Object obj)
    {
        return new kq(obj);
    }

    public static es a(Object obj, Object obj1)
    {
        return b(new Object[] {
            obj, obj1
        });
    }

    public static es a(Object obj, Object obj1, Object obj2)
    {
        return b(new Object[] {
            obj, obj1, obj2
        });
    }

    public static es a(Object obj, Object obj1, Object obj2, Object obj3, Object obj4)
    {
        return b(new Object[] {
            obj, obj1, obj2, obj3, obj4
        });
    }

    public static transient es a(Object obj, Object obj1, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, 
            Object obj8, Object obj9, Object obj10, Object obj11, Object aobj[])
    {
        Object aobj1[] = new Object[aobj.length + 12];
        aobj1[0] = obj;
        aobj1[1] = obj1;
        aobj1[2] = obj2;
        aobj1[3] = obj3;
        aobj1[4] = obj4;
        aobj1[5] = obj5;
        aobj1[6] = obj6;
        aobj1[7] = obj7;
        aobj1[8] = obj8;
        aobj1[9] = obj9;
        aobj1[10] = obj10;
        aobj1[11] = obj11;
        System.arraycopy(((Object) (aobj)), 0, ((Object) (aobj1)), 12, aobj.length);
        return b(aobj1);
    }

    public static es a(Collection collection)
    {
        if (collection instanceof em)
        {
            es es1 = ((em)collection).h();
            collection = es1;
            if (es1.a())
            {
                collection = b(es1);
            }
            return collection;
        } else
        {
            return b(collection);
        }
    }

    public static es a(Iterator iterator1)
    {
        return b(hq.a(iterator1));
    }

    public static es a(Object aobj[])
    {
        switch (aobj.length)
        {
        default:
            return b((Object[])((Object []) (aobj)).clone());

        case 0: // '\0'
            return d();

        case 1: // '\001'
            return new kq(aobj[0]);
        }
    }

    private static Object a(Object obj, int i)
    {
        if (obj == null)
        {
            throw new NullPointerException((new StringBuilder()).append("at index ").append(i).toString());
        } else
        {
            return obj;
        }
    }

    private static es b(Collection collection)
    {
        collection = ((Collection) (collection.toArray()));
        switch (collection.length)
        {
        default:
            return b(((Object []) (collection)));

        case 0: // '\0'
            return d();

        case 1: // '\001'
            return new kq(collection[0]);
        }
    }

    private static transient es b(Object aobj[])
    {
        for (int i = 0; i < aobj.length; i++)
        {
            a(aobj[i], i);
        }

        return new ju(aobj);
    }

    public static es d()
    {
        return dl.a;
    }

    public static et e()
    {
        return new et();
    }

    public abstract es a(int i, int j);

    public abstract mi a(int i);

    public final void add(int i, Object obj)
    {
        throw new UnsupportedOperationException();
    }

    public final boolean addAll(int i, Collection collection)
    {
        throw new UnsupportedOperationException();
    }

    public mi c()
    {
        return a(0);
    }

    public boolean equals(Object obj)
    {
        return hq.a(this, obj);
    }

    public es h()
    {
        return this;
    }

    public mh h_()
    {
        return c();
    }

    public int hashCode()
    {
        return hq.b(this);
    }

    public abstract int indexOf(Object obj);

    public Iterator iterator()
    {
        return h_();
    }

    public ListIterator listIterator()
    {
        return c();
    }

    public ListIterator listIterator(int i)
    {
        return a(i);
    }

    public final Object remove(int i)
    {
        throw new UnsupportedOperationException();
    }

    public final Object set(int i, Object obj)
    {
        throw new UnsupportedOperationException();
    }

    public List subList(int i, int j)
    {
        return a(i, j);
    }
}
