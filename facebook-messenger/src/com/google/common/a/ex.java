// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.common.a:
//            iw, fe, ev, fi, 
//            em, fg, eu, ey, 
//            fa, fc, jf

public abstract class ex
    implements iw, Serializable
{

    private transient em a;
    final transient ev b;
    final transient int c;
    private transient fe d;
    private transient em e;

    ex(ev ev1, int i1)
    {
        b = ev1;
        c = i1;
    }

    private fe a()
    {
        fg fg1 = fe.k();
        java.util.Map.Entry entry;
        for (Iterator iterator = b.a().iterator(); iterator.hasNext(); fg1.a(entry.getKey(), ((em)entry.getValue()).size()))
        {
            entry = (java.util.Map.Entry)iterator.next();
        }

        return fg1.b();
    }

    public static ex b(iw iw1)
    {
        if (iw1 instanceof ex)
        {
            ex ex1 = (ex)iw1;
            if (!ex1.k())
            {
                return ex1;
            }
        }
        return eu.a(iw1);
    }

    public static ex c()
    {
        return eu.a();
    }

    public static ey j()
    {
        return new ey();
    }

    public boolean a(Object obj, Object obj1)
    {
        throw new UnsupportedOperationException();
    }

    public Map b()
    {
        return m();
    }

    public boolean b(Object obj, Object obj1)
    {
        obj = (Collection)b.get(obj);
        return obj != null && ((Collection) (obj)).contains(obj1);
    }

    public Collection c(Object obj)
    {
        return e(obj);
    }

    public boolean c(Object obj, Iterable iterable)
    {
        throw new UnsupportedOperationException();
    }

    public boolean c(Object obj, Object obj1)
    {
        throw new UnsupportedOperationException();
    }

    public int d()
    {
        return c;
    }

    public Collection d(Object obj)
    {
        return g(obj);
    }

    public abstract em e(Object obj);

    public boolean e()
    {
        return c == 0;
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof iw)
        {
            obj = (iw)obj;
            return b.equals(((iw) (obj)).b());
        } else
        {
            return false;
        }
    }

    public void f()
    {
        throw new UnsupportedOperationException();
    }

    public boolean f(Object obj)
    {
        return b.containsKey(obj);
    }

    public em g(Object obj)
    {
        throw new UnsupportedOperationException();
    }

    public Set g()
    {
        return l();
    }

    public jf h()
    {
        return o();
    }

    public int hashCode()
    {
        return b.hashCode();
    }

    public Collection i()
    {
        return n();
    }

    boolean k()
    {
        return b.d();
    }

    public fi l()
    {
        return b.i_();
    }

    public ev m()
    {
        return b;
    }

    public em n()
    {
        em em1 = a;
        Object obj = em1;
        if (em1 == null)
        {
            obj = new fa(this);
            a = ((em) (obj));
        }
        return ((em) (obj));
    }

    public fe o()
    {
        fe fe2 = d;
        fe fe1 = fe2;
        if (fe2 == null)
        {
            fe1 = a();
            d = fe1;
        }
        return fe1;
    }

    public em p()
    {
        em em1 = e;
        Object obj = em1;
        if (em1 == null)
        {
            obj = new fc(this);
            e = ((em) (obj));
        }
        return ((em) (obj));
    }

    public String toString()
    {
        return b.toString();
    }
}
