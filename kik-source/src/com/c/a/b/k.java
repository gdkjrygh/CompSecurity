// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.a.b;

import com.c.a.a.u;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

// Referenced classes of package com.c.a.b:
//            af, m, ao, ae, 
//            d

public abstract class k extends AbstractCollection
    implements Serializable
{
    static abstract class a extends b
    {

        Object a[];
        int b;

        public a a(Object obj)
        {
            u.a(obj);
            int i = b + 1;
            if (a.length < i)
            {
                a = ae.b(a, a(a.length, i));
            }
            Object aobj[] = a;
            i = b;
            b = i + 1;
            aobj[i] = obj;
            return this;
        }

        public b b(Object obj)
        {
            return a(obj);
        }

        a()
        {
            d.a(4, "initialCapacity");
            a = new Object[4];
            b = 0;
        }
    }

    public static abstract class b
    {

        static int a(int i, int j)
        {
            if (j < 0)
            {
                throw new AssertionError("cannot store more than MAX_VALUE elements");
            }
            int l = (i >> 1) + i + 1;
            i = l;
            if (l < j)
            {
                i = Integer.highestOneBit(j - 1) << 1;
            }
            j = i;
            if (i < 0)
            {
                j = 0x7fffffff;
            }
            return j;
        }

        public b a(Iterator iterator1)
        {
            for (; iterator1.hasNext(); b(iterator1.next())) { }
            return this;
        }

        public abstract b b(Object obj);

        b()
        {
        }
    }


    private transient m a;

    k()
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

    public abstract ao a();

    public final boolean add(Object obj)
    {
        throw new UnsupportedOperationException();
    }

    public final boolean addAll(Collection collection)
    {
        throw new UnsupportedOperationException();
    }

    abstract boolean b();

    public m c()
    {
        m m2 = a;
        m m1 = m2;
        if (m2 == null)
        {
            m1 = e();
            a = m1;
        }
        return m1;
    }

    public final void clear()
    {
        throw new UnsupportedOperationException();
    }

    public boolean contains(Object obj)
    {
        return obj != null && super.contains(obj);
    }

    m e()
    {
        switch (size())
        {
        default:
            return new af(this, toArray());

        case 0: // '\0'
            return m.f();

        case 1: // '\001'
            return m.a(a().next());
        }
    }

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
        int i = size();
        if (i == 0)
        {
            return ae.a;
        } else
        {
            Object aobj[] = new Object[i];
            a(aobj, 0);
            return aobj;
        }
    }

    public final Object[] toArray(Object aobj[])
    {
        int i;
        u.a(((Object) (aobj)));
        i = size();
        if (aobj.length >= i) goto _L2; else goto _L1
_L1:
        Object aobj1[] = ae.a(aobj, i);
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
}
