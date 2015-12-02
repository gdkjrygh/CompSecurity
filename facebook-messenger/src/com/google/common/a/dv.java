// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import java.util.Collection;
import java.util.Iterator;

// Referenced classes of package com.google.common.a:
//            dy, jp, gg, ax

public abstract class dv extends dy
    implements Collection
{

    protected dv()
    {
    }

    protected boolean a(Collection collection)
    {
        for (collection = collection.iterator(); collection.hasNext();)
        {
            if (!contains(collection.next()))
            {
                return false;
            }
        }

        return true;
    }

    protected Object[] a(Object aobj[])
    {
        return jp.a(this, aobj);
    }

    public boolean add(Object obj)
    {
        return b().add(obj);
    }

    public boolean addAll(Collection collection)
    {
        return b().addAll(collection);
    }

    protected abstract Collection b();

    protected boolean b(Collection collection)
    {
        return gg.a(iterator(), collection);
    }

    protected Object c()
    {
        return b();
    }

    protected boolean c(Collection collection)
    {
        return gg.b(iterator(), collection);
    }

    public void clear()
    {
        b().clear();
    }

    public boolean contains(Object obj)
    {
        return b().contains(obj);
    }

    public boolean containsAll(Collection collection)
    {
        return b().containsAll(collection);
    }

    protected String e()
    {
        return ax.a(this);
    }

    protected Object[] f()
    {
        return toArray(new Object[size()]);
    }

    public boolean isEmpty()
    {
        return b().isEmpty();
    }

    public Iterator iterator()
    {
        return b().iterator();
    }

    public boolean remove(Object obj)
    {
        return b().remove(obj);
    }

    public boolean removeAll(Collection collection)
    {
        return b().removeAll(collection);
    }

    public boolean retainAll(Collection collection)
    {
        return b().retainAll(collection);
    }

    public int size()
    {
        return b().size();
    }

    public Object[] toArray()
    {
        return b().toArray();
    }

    public Object[] toArray(Object aobj[])
    {
        return b().toArray(aobj);
    }
}
