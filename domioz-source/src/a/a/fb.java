// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

// Referenced classes of package a.a:
//            es, gg, gd, gp, 
//            du, fc, fd, ft, 
//            dt, gs, gt

public abstract class fb extends es
    implements List, RandomAccess
{

    static final fb a;

    fb()
    {
    }

    public static fb a(Object obj)
    {
        return new gp(obj);
    }

    public static fb d()
    {
        return a;
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

    public fb a(int i, int j)
    {
        du.a(i, j, size());
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

    public gs a()
    {
        return a(0);
    }

    public gt a(int i)
    {
        return new fc(this, size(), i);
    }

    public final void add(int i, Object obj)
    {
        throw new UnsupportedOperationException();
    }

    public final boolean addAll(int i, Collection collection)
    {
        throw new UnsupportedOperationException();
    }

    fb b(int i, int j)
    {
        return new fd(this, i, j - i);
    }

    public final fb b_()
    {
        return this;
    }

    public boolean contains(Object obj)
    {
        return indexOf(obj) >= 0;
    }

    public boolean equals(Object obj)
    {
        if (obj != du.a(this))
        {
            if (!(obj instanceof List) || (size() != ((List) (obj = (List)obj)).size() || !ft.a(iterator(), ((List) (obj)).iterator())))
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
            } while (!dt.a(obj, listiterator.next()));
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
            } while (!dt.a(obj, listiterator.previous()));
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
        a = new gg(gd.a);
    }
}
