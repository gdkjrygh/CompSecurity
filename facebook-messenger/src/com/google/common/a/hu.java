// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import com.google.common.base.Preconditions;
import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

// Referenced classes of package com.google.common.a:
//            hv, hq

class hu extends AbstractList
{

    private final List a;

    hu(List list)
    {
        a = (List)Preconditions.checkNotNull(list);
    }

    private int a(int i)
    {
        int j = size();
        Preconditions.checkElementIndex(i, j);
        return j - 1 - i;
    }

    static int a(hu hu1, int i)
    {
        return hu1.b(i);
    }

    private int b(int i)
    {
        int j = size();
        Preconditions.checkPositionIndex(i, j);
        return j - i;
    }

    List a()
    {
        return a;
    }

    public void add(int i, Object obj)
    {
        a.add(b(i), obj);
    }

    public void clear()
    {
        a.clear();
    }

    public boolean contains(Object obj)
    {
        return a.contains(obj);
    }

    public boolean containsAll(Collection collection)
    {
        return a.containsAll(collection);
    }

    public Object get(int i)
    {
        return a.get(a(i));
    }

    public int indexOf(Object obj)
    {
        int i = a.lastIndexOf(obj);
        if (i >= 0)
        {
            return a(i);
        } else
        {
            return -1;
        }
    }

    public boolean isEmpty()
    {
        return a.isEmpty();
    }

    public Iterator iterator()
    {
        return listIterator();
    }

    public int lastIndexOf(Object obj)
    {
        int i = a.indexOf(obj);
        if (i >= 0)
        {
            return a(i);
        } else
        {
            return -1;
        }
    }

    public ListIterator listIterator(int i)
    {
        i = b(i);
        return new hv(this, a.listIterator(i));
    }

    public Object remove(int i)
    {
        return a.remove(a(i));
    }

    protected void removeRange(int i, int j)
    {
        subList(i, j).clear();
    }

    public Object set(int i, Object obj)
    {
        return a.set(a(i), obj);
    }

    public int size()
    {
        return a.size();
    }

    public List subList(int i, int j)
    {
        Preconditions.checkPositionIndexes(i, j, size());
        return hq.a(a.subList(b(j), b(i)));
    }
}
