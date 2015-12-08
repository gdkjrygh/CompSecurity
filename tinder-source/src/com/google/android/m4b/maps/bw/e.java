// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bw;

import java.util.HashMap;
import java.util.Iterator;

public class e
{
    public static final class a
        implements Iterator
    {

        private c a;

        public final b a()
        {
            b b1 = new b(a.c, a.d);
            a = a.b;
            return b1;
        }

        public final boolean hasNext()
        {
            return a != null;
        }

        public final Object next()
        {
            return a();
        }

        public final void remove()
        {
            throw new UnsupportedOperationException();
        }

        public a(c c1)
        {
            a = c1;
        }
    }

    public static final class b
    {

        public Object a;
        public Object b;

        public b(Object obj, Object obj1)
        {
            a = obj;
            b = obj1;
        }
    }

    public static final class c
    {

        public c a;
        public c b;
        public Object c;
        public Object d;

        c()
        {
        }
    }


    public final HashMap a = new HashMap();
    public c b;
    public c c;
    private int d;

    public e(int i)
    {
        d = i;
    }

    private void a(c c1)
    {
        if (c == null)
        {
            b = c1;
            c = c1;
            return;
        } else
        {
            c c2 = c;
            c1.a = c2;
            c2.b = c1;
            c = c1;
            return;
        }
    }

    private void b(c c1)
    {
        c c2 = c1.a;
        c c3 = c1.b;
        if (c2 != null)
        {
            c2.b = c3;
        }
        if (c3 != null)
        {
            c3.a = c2;
        }
        c1.a = null;
        c1.b = null;
        if (b == c1)
        {
            b = c3;
        }
        if (c == c1)
        {
            c = c2;
        }
    }

    public final void a()
    {
        a(0);
    }

    public final void a(int i)
    {
        for (; a.size() > i; a(d(b.c))) { }
    }

    public void a(Object obj)
    {
    }

    public void a(Object obj, Object obj1)
    {
    }

    public final a b()
    {
        return new a(b);
    }

    public final Object b(Object obj)
    {
        obj = (c)a.get(obj);
        if (obj == null)
        {
            return null;
        } else
        {
            return ((c) (obj)).d;
        }
    }

    public final void b(Object obj, Object obj1)
    {
        c c1 = (c)a.get(obj);
        if (c1 == null)
        {
            a(d - 1);
        }
        c c2 = new c();
        c2.d = obj1;
        c2.c = obj;
        if (c1 != null)
        {
            b(c1);
            a(obj, c1.d);
            a(c1.d);
        }
        a.put(c2.c, c2);
        a(c2);
    }

    public final Object c(Object obj)
    {
        obj = (c)a.get(obj);
        if (obj == null)
        {
            return null;
        } else
        {
            b(((c) (obj)));
            a(((c) (obj)));
            return ((c) (obj)).d;
        }
    }

    public final Object d(Object obj)
    {
        c c1 = (c)a.remove(obj);
        if (c1 == null)
        {
            return null;
        } else
        {
            b(c1);
            a(obj, c1.d);
            return c1.d;
        }
    }
}
