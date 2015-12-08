// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bv;

import java.util.HashMap;

public class v
{
    static final class a
    {

        public a a;
        public a b;
        public Object c;
        public Object d;

        a()
        {
        }
    }


    private final HashMap a = new HashMap();
    protected final int b;
    private a c;
    private a d;

    public v(int i)
    {
        b = i;
    }

    private void a(a a1)
    {
        if (d == null)
        {
            c = a1;
            d = a1;
            return;
        } else
        {
            a a2 = d;
            a1.a = a2;
            a2.b = a1;
            d = a1;
            return;
        }
    }

    private void b(a a1)
    {
        a a2 = a1.a;
        a a3 = a1.b;
        if (a2 != null)
        {
            a2.b = a3;
        }
        if (a3 != null)
        {
            a3.a = a2;
        }
        a1.a = null;
        a1.b = null;
        if (c == a1)
        {
            c = a3;
        }
        if (d == a1)
        {
            d = a2;
        }
    }

    final void a(int i)
    {
        for (; a.size() > i; c(c.c)) { }
    }

    protected void a(Object obj)
    {
    }

    public final void a(Object obj, Object obj1)
    {
        a a1 = (a)a.get(obj);
        if (a1 == null)
        {
            a(b - 1);
        }
        a a2 = new a();
        a2.d = obj1;
        a2.c = obj;
        if (a1 != null)
        {
            b(a1);
            a(a1.d);
        }
        a.put(a2.c, a2);
        a(a2);
    }

    public final Object b(Object obj)
    {
        obj = (a)a.get(obj);
        if (obj == null)
        {
            return null;
        } else
        {
            b(((a) (obj)));
            a(((a) (obj)));
            return ((a) (obj)).d;
        }
    }

    protected final void b()
    {
        a(b - 1);
    }

    public final Object c(Object obj)
    {
        obj = (a)a.remove(obj);
        if (obj == null)
        {
            return null;
        } else
        {
            b(((a) (obj)));
            a(((a) (obj)).d);
            return ((a) (obj)).d;
        }
    }
}
