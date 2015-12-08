// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.aa;

import com.google.android.m4b.maps.y.j;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

// Referenced classes of package com.google.android.m4b.maps.aa:
//            be, ae, x, j, 
//            bb

public abstract class aa extends AbstractCollection
    implements Serializable
{
    static class a extends b
    {

        Object a[];
        int b;

        private void a(int i)
        {
            if (a.length < i)
            {
                a = j.b(a, a(a.length, i));
            }
        }

        public a a(Object obj)
        {
            j.a(obj);
            a(b + 1);
            Object aobj[] = a;
            int i = b;
            b = i + 1;
            aobj[i] = obj;
            return this;
        }

        public b a(Iterable iterable)
        {
            if (iterable instanceof Collection)
            {
                Collection collection = (Collection)iterable;
                int i = b;
                a(collection.size() + i);
            }
            super.a(iterable);
            return this;
        }

        public transient b a(Object aobj[])
        {
            j.a(aobj);
            a(b + aobj.length);
            System.arraycopy(((Object) (aobj)), 0, ((Object) (a)), b, aobj.length);
            b = b + aobj.length;
            return this;
        }

        public b b(Object obj)
        {
            return a(obj);
        }

        a()
        {
            bb.a(4, "initialCapacity");
            a = new Object[4];
            b = 0;
        }
    }

    public static abstract class b
    {

        static int a(int i, int k)
        {
            if (k < 0)
            {
                throw new AssertionError("cannot store more than MAX_VALUE elements");
            }
            int l = (i >> 1) + i + 1;
            i = l;
            if (l < k)
            {
                i = Integer.highestOneBit(k - 1) << 1;
            }
            k = i;
            if (i < 0)
            {
                k = 0x7fffffff;
            }
            return k;
        }

        public b a(Iterable iterable)
        {
            for (iterable = iterable.iterator(); iterable.hasNext(); b(iterable.next())) { }
            return this;
        }

        public b a(Iterator iterator1)
        {
            for (; iterator1.hasNext(); b(iterator1.next())) { }
            return this;
        }

        public transient b a(Object aobj[])
        {
            int k = aobj.length;
            for (int i = 0; i < k; i++)
            {
                b(aobj[i]);
            }

            return this;
        }

        public abstract b b(Object obj);

        b()
        {
        }
    }


    private transient ae a;

    aa()
    {
    }

    int a(Object aobj[], int i)
    {
        for (Iterator iterator1 = iterator(); iterator1.hasNext();)
        {
            aobj[i] = iterator1.next();
            i++;
        }

        return i;
    }

    public abstract x a();

    public final boolean add(Object obj)
    {
        throw new UnsupportedOperationException();
    }

    public final boolean addAll(Collection collection)
    {
        throw new UnsupportedOperationException();
    }

    public ae b()
    {
        ae ae2 = a;
        ae ae1 = ae2;
        if (ae2 == null)
        {
            ae1 = c();
            a = ae1;
        }
        return ae1;
    }

    ae c()
    {
        switch (size())
        {
        default:
            return new be(this, toArray());

        case 0: // '\0'
            return ae.e();

        case 1: // '\001'
            return ae.a(a().next());
        }
    }

    public final void clear()
    {
        throw new UnsupportedOperationException();
    }

    public boolean contains(Object obj)
    {
        return obj != null && super.contains(obj);
    }

    abstract boolean d();

    public Iterator iterator()
    {
        return a();
    }

    public final boolean remove(Object obj)
    {
        throw new UnsupportedOperationException();
    }

    public final boolean removeAll(Collection collection)
    {
        throw new UnsupportedOperationException();
    }

    public final boolean retainAll(Collection collection)
    {
        throw new UnsupportedOperationException();
    }

    public final Object[] toArray()
    {
        if (size() == 0)
        {
            return j.a;
        } else
        {
            Object aobj[] = new Object[size()];
            a(aobj, 0);
            return aobj;
        }
    }

    public final Object[] toArray(Object aobj[])
    {
        int i;
        j.a(((Object) (aobj)));
        i = size();
        if (aobj.length >= i) goto _L2; else goto _L1
_L1:
        Object aobj1[] = j.a(aobj, i);
_L4:
        a(aobj1, 0);
        return aobj1;
_L2:
        aobj1 = aobj;
        if (aobj.length > i)
        {
            aobj[i] = null;
            aobj1 = aobj;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    Object writeReplace()
    {
        return new ae.c(toArray());
    }
}
