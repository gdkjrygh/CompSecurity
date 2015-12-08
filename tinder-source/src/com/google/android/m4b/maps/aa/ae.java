// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.aa;

import com.google.android.m4b.maps.y.h;
import com.google.android.m4b.maps.y.j;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

// Referenced classes of package com.google.android.m4b.maps.aa:
//            aa, bg, j, bq, 
//            e, as, x, a

public abstract class ae extends aa
    implements List, RandomAccess
{
    public static final class a extends aa.a
    {

        public final aa.a a(Object obj)
        {
            super.a(obj);
            return this;
        }

        public final aa.b a(Iterable iterable)
        {
            super.a(iterable);
            return this;
        }

        public final aa.b a(Iterator iterator1)
        {
            super.a(iterator1);
            return this;
        }

        public final aa.b a(Object aobj[])
        {
            super.a(aobj);
            return this;
        }

        public final ae a()
        {
            return ae.b(a, b);
        }

        public final aa.b b(Object obj)
        {
            super.a(obj);
            return this;
        }

        public final a b(Iterable iterable)
        {
            super.a(iterable);
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

    static final class b extends ae
    {

        private final transient ae b;

        private int b(int i)
        {
            return size() - 1 - i;
        }

        public final ae a(int i, int k)
        {
            j.a(i, k, size());
            return b.a(size() - k, size() - i).f();
        }

        public final boolean contains(Object obj)
        {
            return b.contains(obj);
        }

        final boolean d()
        {
            return b.d();
        }

        public final ae f()
        {
            return b;
        }

        public final Object get(int i)
        {
            j.a(i, size());
            return b.get(b(i));
        }

        public final int indexOf(Object obj)
        {
            int i = b.lastIndexOf(obj);
            if (i >= 0)
            {
                return b(i);
            } else
            {
                return -1;
            }
        }

        public final Iterator iterator()
        {
            return a();
        }

        public final int lastIndexOf(Object obj)
        {
            int i = b.indexOf(obj);
            if (i >= 0)
            {
                return b(i);
            } else
            {
                return -1;
            }
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
            return b.size();
        }

        public final List subList(int i, int k)
        {
            return a(i, k);
        }

        b(ae ae1)
        {
            b = ae1;
        }
    }

    static final class c
        implements Serializable
    {

        private static final long serialVersionUID = 0L;
        private Object a[];

        final Object readResolve()
        {
            return ae.a(a);
        }

        c(Object aobj[])
        {
            a = aobj;
        }
    }

    final class d extends ae
    {

        private transient int b;
        private transient int c;
        private ae d;

        public final ae a(int i, int k)
        {
            j.a(i, k, c);
            return d.a(b + i, b + k);
        }

        final boolean d()
        {
            return true;
        }

        public final Object get(int i)
        {
            j.a(i, c);
            return d.get(b + i);
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
            return c;
        }

        public final List subList(int i, int k)
        {
            return a(i, k);
        }

        d(int i, int k)
        {
            d = ae.this;
            super();
            b = i;
            c = k;
        }
    }


    static final ae a;

    ae()
    {
    }

    public static ae a(Object obj)
    {
        return new bq(obj);
    }

    public static ae a(Collection collection)
    {
        if (collection instanceof aa)
        {
            ae ae1 = ((aa)collection).b();
            collection = ae1;
            if (ae1.d())
            {
                collection = ((Collection) (ae1.toArray()));
                collection = b(collection, collection.length);
            }
            return collection;
        } else
        {
            collection = ((Collection) (j.a(collection.toArray())));
            return b(collection, collection.length);
        }
    }

    public static ae a(Object aobj[])
    {
        switch (aobj.length)
        {
        default:
            return new bg(j.a((Object[])((Object []) (aobj)).clone()));

        case 0: // '\0'
            return a;

        case 1: // '\001'
            return new bq(aobj[0]);
        }
    }

    public static ae b(Object aobj[])
    {
        return b(aobj, aobj.length);
    }

    static ae b(Object aobj[], int i)
    {
        switch (i)
        {
        default:
            Object aobj1[] = aobj;
            if (i < aobj.length)
            {
                aobj1 = j.b(aobj, i);
            }
            return new bg(aobj1);

        case 0: // '\0'
            return a;

        case 1: // '\001'
            return new bq(aobj[0]);
        }
    }

    public static ae e()
    {
        return a;
    }

    public static a g()
    {
        return new a();
    }

    private void readObject(ObjectInputStream objectinputstream)
    {
        throw new InvalidObjectException("Use SerializedForm");
    }

    int a(Object aobj[], int i)
    {
        int l = size();
        for (int k = 0; k < l; k++)
        {
            aobj[i + k] = get(k);
        }

        return i + l;
    }

    public ae a(int i, int k)
    {
        j.a(i, k, size());
        switch (k - i)
        {
        default:
            return b(i, k);

        case 0: // '\0'
            return a;

        case 1: // '\001'
            return a(get(i));
        }
    }

    public as a(int i)
    {
        return new com.google.android.m4b.maps.aa.a(size(), i) {

            private ae a;

            protected final Object a(int k)
            {
                return a.get(k);
            }

            
            {
                a = ae.this;
                super(i, k);
            }
        };
    }

    public x a()
    {
        return a(0);
    }

    public final void add(int i, Object obj)
    {
        throw new UnsupportedOperationException();
    }

    public final boolean addAll(int i, Collection collection)
    {
        throw new UnsupportedOperationException();
    }

    public final ae b()
    {
        return this;
    }

    ae b(int i, int k)
    {
        return new d(i, k - i);
    }

    public boolean contains(Object obj)
    {
        return indexOf(obj) >= 0;
    }

    public boolean equals(Object obj)
    {
        if (obj != j.a(this))
        {
            if (!(obj instanceof List) || (size() != ((List) (obj = (List)obj)).size() || !com.google.android.m4b.maps.aa.e.a(iterator(), ((List) (obj)).iterator())))
            {
                return false;
            }
        }
        return true;
    }

    public ae f()
    {
        return new b(this);
    }

    public int hashCode()
    {
        int k = 1;
        int l = size();
        for (int i = 0; i < l; i++)
        {
            k = ~~(k * 31 + get(i).hashCode());
        }

        return k;
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
            } while (!h.a(obj, listiterator.next()));
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
            } while (!h.a(obj, listiterator.previous()));
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

    public List subList(int i, int k)
    {
        return a(i, k);
    }

    Object writeReplace()
    {
        return new c(toArray());
    }

    static 
    {
        a = new bg(j.a);
    }
}
