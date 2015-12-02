// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import com.google.common.base.Objects;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.common.a:
//            jf, jg, jh, gg, 
//            ar, as

abstract class aq extends AbstractCollection
    implements jf
{

    private transient Set a;
    private transient Set b;

    aq()
    {
    }

    public int a(Object obj)
    {
        for (Iterator iterator1 = b().iterator(); iterator1.hasNext();)
        {
            jg jg1 = (jg)iterator1.next();
            if (Objects.equal(jg1.a(), obj))
            {
                return jg1.b();
            }
        }

        return 0;
    }

    public int a(Object obj, int i)
    {
        throw new UnsupportedOperationException();
    }

    public boolean add(Object obj)
    {
        a(obj, 1);
        return true;
    }

    public boolean addAll(Collection collection)
    {
        return jh.a(this, collection);
    }

    public int b(Object obj, int i)
    {
        throw new UnsupportedOperationException();
    }

    public Set b()
    {
        Set set1 = b;
        Set set = set1;
        if (set1 == null)
        {
            set = g();
            b = set;
        }
        return set;
    }

    abstract Iterator c();

    public void clear()
    {
        gg.f(c());
    }

    public boolean contains(Object obj)
    {
        return a(obj) > 0;
    }

    abstract int d();

    Set e()
    {
        return new ar(this);
    }

    public boolean equals(Object obj)
    {
        return jh.a(this, obj);
    }

    public Set f()
    {
        Set set1 = a;
        Set set = set1;
        if (set1 == null)
        {
            set = e();
            a = set;
        }
        return set;
    }

    Set g()
    {
        return new as(this);
    }

    public int hashCode()
    {
        return b().hashCode();
    }

    public boolean isEmpty()
    {
        return b().isEmpty();
    }

    public Iterator iterator()
    {
        return jh.a(this);
    }

    public boolean remove(Object obj)
    {
        return b(obj, 1) > 0;
    }

    public boolean removeAll(Collection collection)
    {
        return jh.b(this, collection);
    }

    public boolean retainAll(Collection collection)
    {
        return jh.c(this, collection);
    }

    public int size()
    {
        return jh.b(this);
    }

    public String toString()
    {
        return b().toString();
    }
}
