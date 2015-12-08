// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.a.b;

import com.c.a.a.t;
import com.c.a.a.u;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

// Referenced classes of package com.c.a.b:
//            k, ag, ae, al, 
//            n, w, ao, ap

public abstract class m extends k
    implements List, RandomAccess
{
    public static final class a extends k.a
    {

        public final volatile k.a a(Object obj)
        {
            super.a(obj);
            return this;
        }

        public final volatile k.b a(Iterator iterator1)
        {
            super.a(iterator1);
            return this;
        }

        public final k.b b(Object obj)
        {
            super.a(obj);
            return this;
        }

        public final a b(Iterator iterator1)
        {
            super.a(iterator1);
            return this;
        }

        public final a c(Object obj)
        {
            super.a(obj);
            return this;
        }

        public a()
        {
            this((byte)0);
        }

        private a(byte byte0)
        {
        }
    }

    final class b extends m
    {

        final transient int a;
        final transient int b;
        final m c;

        public final m a(int i, int j)
        {
            u.a(i, j, b);
            return c.a(a + i, a + j);
        }

        final boolean b()
        {
            return true;
        }

        public final Object get(int i)
        {
            u.a(i, b);
            return c.get(a + i);
        }

        public final Iterator iterator()
        {
            return a();
        }

        public final ListIterator listIterator()
        {
            return a(0);
        }

        public final ListIterator listIterator(int i)
        {
            return a(i);
        }

        public final int size()
        {
            return b;
        }

        public final List subList(int i, int j)
        {
            return a(i, j);
        }

        b(int i, int j)
        {
            c = m.this;
            super();
            a = i;
            b = j;
        }
    }


    private static final m a;

    m()
    {
    }

    public static m a(Iterable iterable)
    {
        u.a(iterable);
        if (iterable instanceof Collection)
        {
            iterable = (Collection)iterable;
            if (iterable instanceof k)
            {
                m m1 = ((k)iterable).c();
                iterable = m1;
                if (m1.b())
                {
                    iterable = ((Iterable) (m1.toArray()));
                    iterable = b(iterable, iterable.length);
                }
                return iterable;
            } else
            {
                iterable = ((Iterable) (ae.a(iterable.toArray())));
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
            iterable = (new a()).c(obj).b(iterable);
            return b(((a) (iterable)).a, ((a) (iterable)).b);
        }
    }

    public static m a(Object obj)
    {
        return new al(obj);
    }

    static m a(Object aobj[])
    {
        return b(aobj, aobj.length);
    }

    private static m b(Object aobj[], int i)
    {
        switch (i)
        {
        default:
            Object aobj1[] = aobj;
            if (i < aobj.length)
            {
                aobj1 = ae.b(aobj, i);
            }
            return new ag(aobj1);

        case 0: // '\0'
            return a;

        case 1: // '\001'
            return new al(aobj[0]);
        }
    }

    public static m f()
    {
        return a;
    }

    int a(Object aobj[], int i)
    {
        int l = size();
        for (int j = 0; j < l; j++)
        {
            aobj[i + j] = get(j);
        }

        return i + l;
    }

    public ao a()
    {
        return a(0);
    }

    public ap a(int i)
    {
        return new n(this, size(), i);
    }

    public m a(int i, int j)
    {
        u.a(i, j, size());
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

    public final void add(int i, Object obj)
    {
        throw new UnsupportedOperationException();
    }

    public final boolean addAll(int i, Collection collection)
    {
        throw new UnsupportedOperationException();
    }

    m b(int i, int j)
    {
        return new b(i, j - i);
    }

    public final m c()
    {
        return this;
    }

    public boolean contains(Object obj)
    {
        return indexOf(obj) >= 0;
    }

    public boolean equals(Object obj)
    {
        if (obj != u.a(this))
        {
            if (!(obj instanceof List) || (size() != ((List) (obj = (List)obj)).size() || !w.a(iterator(), ((List) (obj)).iterator())))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        int j = 1;
        int l = size();
        for (int i = 0; i < l; i++)
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
            } while (!t.a(obj, listiterator.next()));
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
            } while (!t.a(obj, listiterator.previous()));
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
        a = new ag(ae.a);
    }
}
