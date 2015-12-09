// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.artfulbits.aiCharts.Base;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ChartCollection extends ArrayList
{
    public static interface a
    {

        public abstract void a(Object obj, Object obj1, int i);
    }


    private static final long serialVersionUID = 0x7c10e0dcdfd3c507L;
    private transient a a;

    public ChartCollection(a a1)
    {
        a = a1;
    }

    protected void a(Object obj)
    {
    }

    protected void a(Object obj, Object obj1, int i)
    {
        if (a != null)
        {
            a.a(obj, obj1, i);
        }
    }

    public void add(int i, Object obj)
    {
        a(obj);
        super.add(i, obj);
        a(obj, null, i);
    }

    public final boolean add(Object obj)
    {
        a(obj);
        if (super.add(obj))
        {
            a(obj, null, size());
            return true;
        } else
        {
            return false;
        }
    }

    public boolean addAll(int i, Collection collection)
    {
        for (Iterator iterator = collection.iterator(); iterator.hasNext(); a(iterator.next())) { }
        if (super.addAll(i, collection))
        {
            for (collection = collection.iterator(); collection.hasNext();)
            {
                Object obj = collection.next();
                a.a(obj, null, i);
                i++;
            }

            return true;
        } else
        {
            return false;
        }
    }

    public void clear()
    {
        int j = 0;
        Object aobj[] = (Object[])toArray();
        super.clear();
        int k = aobj.length;
        for (int i = 0; j < k; i++)
        {
            a(null, aobj[j], i);
            j++;
        }

    }

    public Object remove(int i)
    {
        Object obj = super.remove(i);
        a(null, obj, i);
        return obj;
    }

    public boolean remove(Object obj)
    {
        int i = indexOf(obj);
        if (super.remove(obj))
        {
            a(null, obj, i);
            return true;
        } else
        {
            return false;
        }
    }

    public boolean removeAll(Collection collection)
    {
        int i = 0;
        for (Iterator iterator = collection.iterator(); iterator.hasNext();)
        {
            a(null, iterator.next(), i);
            i++;
        }

        return super.removeAll(collection);
    }

    public Object set(int i, Object obj)
    {
        a(obj);
        Object obj1 = super.set(i, obj);
        a(obj, obj1, i);
        return obj1;
    }
}
