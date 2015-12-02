// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;

// Referenced classes of package com.google.common.a:
//            ep, gg, ax, ei, 
//            es, mh, jp

public abstract class em
    implements Serializable, Collection
{

    static final em c = new ep(null);
    private transient es a;

    em()
    {
    }

    abstract boolean a();

    public final boolean add(Object obj)
    {
        throw new UnsupportedOperationException();
    }

    public final boolean addAll(Collection collection)
    {
        throw new UnsupportedOperationException();
    }

    public final void clear()
    {
        throw new UnsupportedOperationException();
    }

    public boolean contains(Object obj)
    {
        return obj != null && gg.a(h_(), obj);
    }

    public boolean containsAll(Collection collection)
    {
        return ax.a(this, collection);
    }

    public es h()
    {
        es es2 = a;
        es es1 = es2;
        if (es2 == null)
        {
            es1 = i();
            a = es1;
        }
        return es1;
    }

    public abstract mh h_();

    es i()
    {
        switch (size())
        {
        default:
            return new ei(toArray(), this);

        case 0: // '\0'
            return es.d();

        case 1: // '\001'
            return es.a(h_().next());
        }
    }

    public boolean isEmpty()
    {
        return size() == 0;
    }

    public Iterator iterator()
    {
        return h_();
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

    public Object[] toArray()
    {
        return jp.a(this);
    }

    public Object[] toArray(Object aobj[])
    {
        return jp.a(this, aobj);
    }

    public String toString()
    {
        return ax.a(this);
    }

}
