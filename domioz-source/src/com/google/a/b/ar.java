// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.b;

import com.google.a.a.ab;
import com.google.a.a.ad;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

// Referenced classes of package com.google.a.b:
//            am, cq, cm, at, 
//            dd, as, au, bl, 
//            di, dj

public abstract class ar extends am
    implements List, RandomAccess
{

    private static final ar a;

    ar()
    {
    }

    public static ar a(Iterable iterable)
    {
        ad.a(iterable);
        if (iterable instanceof Collection)
        {
            iterable = (Collection)iterable;
            if (iterable instanceof am)
            {
                ar ar1 = ((am)iterable).b();
                iterable = ar1;
                if (ar1.e())
                {
                    iterable = ((Iterable) (ar1.toArray()));
                    iterable = b(iterable, iterable.length);
                }
                return iterable;
            } else
            {
                iterable = ((Iterable) (cm.a(iterable.toArray())));
                return b(iterable, iterable.length);
            }
        }
        iterable = iterable.iterator();
        if (!iterable.hasNext())
        {
            return a;
        }
        Object obj = iterable.next();
        if (!iterable.hasNext())
        {
            return a(obj);
        } else
        {
            return (new at()).c(obj).b(iterable).a();
        }
    }

    public static ar a(Object obj)
    {
        return new dd(obj);
    }

    public static ar a(Object obj, Object obj1)
    {
        obj = ((Object) (cm.a(new Object[] {
            obj, obj1
        })));
        return b(((Object []) (obj)), obj.length);
    }

    public static ar a(Object obj, Object obj1, Object obj2, Object obj3, Object obj4)
    {
        obj = ((Object) (cm.a(new Object[] {
            obj, obj1, obj2, obj3, obj4
        })));
        return b(((Object []) (obj)), obj.length);
    }

    public static ar a(Object aobj[])
    {
        switch (aobj.length)
        {
        default:
            return new cq(cm.a((Object[])((Object []) (aobj)).clone()));

        case 0: // '\0'
            return a;

        case 1: // '\001'
            return new dd(aobj[0]);
        }
    }

    static ar b(Object aobj[])
    {
        return b(aobj, aobj.length);
    }

    static ar b(Object aobj[], int i)
    {
        switch (i)
        {
        default:
            Object aobj1[] = aobj;
            if (i < aobj.length)
            {
                aobj1 = cm.b(aobj, i);
            }
            return new cq(aobj1);

        case 0: // '\0'
            return a;

        case 1: // '\001'
            return new dd(aobj[0]);
        }
    }

    public static ar d()
    {
        return a;
    }

    public static at g()
    {
        return new at();
    }

    int a(Object aobj[], int i)
    {
        int k = size();
        for (int j = 0; j < k; j++)
        {
            aobj[i + j] = get(j);
        }

        return i + k;
    }

    public ar a(int i, int j)
    {
        ad.a(i, j, size());
        switch (j - i)
        {
        default:
            return b(i, j);

        case 0: // '\0'
            return a;

        case 1: // '\001'
            return a(get(i));
        }
    }

    public di a()
    {
        return a(0);
    }

    public dj a(int i)
    {
        return new as(this, size(), i);
    }

    public final void add(int i, Object obj)
    {
        throw new UnsupportedOperationException();
    }

    public final boolean addAll(int i, Collection collection)
    {
        throw new UnsupportedOperationException();
    }

    public final ar b()
    {
        return this;
    }

    ar b(int i, int j)
    {
        return new au(this, i, j - i);
    }

    public boolean contains(Object obj)
    {
        return indexOf(obj) >= 0;
    }

    public boolean equals(Object obj)
    {
        if (obj != ad.a(this))
        {
            if (!(obj instanceof List) || (size() != ((List) (obj = (List)obj)).size() || !bl.a(iterator(), ((List) (obj)).iterator())))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        int j = 1;
        int k = size();
        for (int i = 0; i < k; i++)
        {
            j = ~~(j * 31 + get(i).hashCode());
        }

        return j;
    }

    public int indexOf(Object obj)
    {
label0:
        {
            if (obj == null)
            {
                break label0;
            }
            ListIterator listiterator = listIterator();
            do
            {
                if (!listiterator.hasNext())
                {
                    break label0;
                }
            } while (!ab.a(obj, listiterator.next()));
            return listiterator.previousIndex();
        }
        return -1;
    }

    public Iterator iterator()
    {
        return a();
    }

    public int lastIndexOf(Object obj)
    {
label0:
        {
            if (obj == null)
            {
                break label0;
            }
            ListIterator listiterator = listIterator(size());
            do
            {
                if (!listiterator.hasPrevious())
                {
                    break label0;
                }
            } while (!ab.a(obj, listiterator.previous()));
            return listiterator.nextIndex();
        }
        return -1;
    }

    public ListIterator listIterator()
    {
        return a(0);
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

    static 
    {
        a = new cq(cm.a);
    }
}
