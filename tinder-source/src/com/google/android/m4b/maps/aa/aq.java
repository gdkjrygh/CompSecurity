// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.aa;

import com.google.android.m4b.maps.y.j;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.SortedSet;

// Referenced classes of package com.google.android.m4b.maps.aa:
//            ar, t, q, p, 
//            j, bk, ae, u, 
//            d, x, al

public abstract class aq extends ar
    implements t, SortedSet
{
    public static final class a extends al.a
    {

        private final Comparator c;

        public final aa.a a(Object obj)
        {
            super.c(obj);
            return this;
        }

        public final aa.b a(Iterable iterable)
        {
            super.b(iterable);
            return this;
        }

        public final aa.b a(Iterator iterator1)
        {
            super.b(iterator1);
            return this;
        }

        public final aa.b a(Object aobj[])
        {
            super.b(aobj);
            return this;
        }

        public final al a()
        {
            return b();
        }

        public final aa.b b(Object obj)
        {
            super.c(obj);
            return this;
        }

        public final al.a b(Iterable iterable)
        {
            super.b(iterable);
            return this;
        }

        public final al.a b(Iterator iterator1)
        {
            super.b(iterator1);
            return this;
        }

        public final al.a b(Object aobj[])
        {
            super.b(aobj);
            return this;
        }

        public final aq b()
        {
            Object aobj[] = (Object[])a;
            aq aq1 = aq.a(c, b, aobj);
            b = aq1.size();
            return aq1;
        }

        public final al.a c(Object obj)
        {
            super.c(obj);
            return this;
        }

        public final transient a c(Object aobj[])
        {
            super.b(aobj);
            return this;
        }

        public a(Comparator comparator1)
        {
            c = (Comparator)j.a(comparator1);
        }
    }

    static final class b
        implements Serializable
    {

        private static final long serialVersionUID = 0L;
        private Comparator a;
        private Object b[];

        final Object readResolve()
        {
            return (new a(a)).c((Object[])b).b();
        }

        public b(Comparator comparator1, Object aobj[])
        {
            a = comparator1;
            b = aobj;
        }
    }


    private static final Comparator b;
    private static final aq c;
    final transient Comparator a;

    aq(Comparator comparator1)
    {
        a = comparator1;
    }

    static aq a(Comparator comparator1)
    {
        if (b.equals(comparator1))
        {
            return c;
        } else
        {
            return new p(comparator1);
        }
    }

    static transient aq a(Comparator comparator1, int i, Object aobj[])
    {
        if (i == 0)
        {
            return a(comparator1);
        }
        j.c(aobj, i);
        Arrays.sort(aobj, 0, i, comparator1);
        int l = 1;
        int k = 1;
        for (; l < i; l++)
        {
            Object obj = aobj[l];
            if (comparator1.compare(obj, aobj[k - 1]) != 0)
            {
                int i1 = k + 1;
                aobj[k] = obj;
                k = i1;
            }
        }

        Arrays.fill(aobj, k, i, null);
        return new bk(ae.b(aobj, k), comparator1);
    }

    public static aq a(Comparator comparator1, Collection collection)
    {
        j.a(comparator1);
        if (u.a(comparator1, collection) && (collection instanceof aq))
        {
            aq aq1 = (aq)collection;
            if (!aq1.d())
            {
                return aq1;
            }
        }
        collection = ((Collection) ((Object[])com.google.android.m4b.maps.aa.d.b(collection)));
        return a(comparator1, collection.length, ((Object []) (collection)));
    }

    private void readObject(ObjectInputStream objectinputstream)
    {
        throw new InvalidObjectException("Use SerializedForm");
    }

    final int a(Object obj, Object obj1)
    {
        return a.compare(obj, obj1);
    }

    public abstract x a();

    abstract aq b(Object obj);

    abstract aq b(Object obj, Object obj1);

    abstract aq c(Object obj);

    public Comparator comparator()
    {
        return a;
    }

    abstract int d(Object obj);

    public abstract x e();

    public Object first()
    {
        return a().next();
    }

    public SortedSet headSet(Object obj)
    {
        return b(j.a(obj));
    }

    public Iterator iterator()
    {
        return a();
    }

    public Object last()
    {
        return e().next();
    }

    public SortedSet subSet(Object obj, Object obj1)
    {
        j.a(obj);
        j.a(obj1);
        boolean flag;
        if (a.compare(obj, obj1) <= 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        j.a(flag);
        return b(obj, obj1);
    }

    public SortedSet tailSet(Object obj)
    {
        return c(j.a(obj));
    }

    Object writeReplace()
    {
        return new b(a, toArray());
    }

    static 
    {
        b = q.b();
        c = new p(b);
    }
}
