// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.wire;

import gxe;
import gxf;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public class list
    implements Serializable, Cloneable, List, RandomAccess
{

    private final List list;

    public static void a(list list1, Object obj)
    {
        list1.list.add(obj);
    }

    public void add(int i, Object obj)
    {
        throw new UnsupportedOperationException();
    }

    public boolean add(Object obj)
    {
        throw new UnsupportedOperationException();
    }

    public boolean addAll(int i, Collection collection)
    {
        throw new UnsupportedOperationException();
    }

    public boolean addAll(Collection collection)
    {
        throw new UnsupportedOperationException();
    }

    public void clear()
    {
        throw new UnsupportedOperationException();
    }

    public Object clone()
    {
        return new <init>(list);
    }

    public boolean contains(Object obj)
    {
        return list.contains(obj);
    }

    public boolean containsAll(Collection collection)
    {
        return list.containsAll(collection);
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof list)
        {
            return list.equals(((list)obj).list);
        } else
        {
            return list.equals(obj);
        }
    }

    public Object get(int i)
    {
        return list.get(i);
    }

    public int hashCode()
    {
        return list.hashCode();
    }

    public int indexOf(Object obj)
    {
        return list.indexOf(obj);
    }

    public boolean isEmpty()
    {
        return list.isEmpty();
    }

    public Iterator iterator()
    {
        return new gxe(list.iterator());
    }

    public int lastIndexOf(Object obj)
    {
        return list.lastIndexOf(obj);
    }

    public ListIterator listIterator()
    {
        return new gxf(list.listIterator());
    }

    public ListIterator listIterator(int i)
    {
        return new gxf(list.listIterator(i));
    }

    public Object remove(int i)
    {
        throw new UnsupportedOperationException();
    }

    public boolean remove(Object obj)
    {
        throw new UnsupportedOperationException();
    }

    public boolean removeAll(Collection collection)
    {
        throw new UnsupportedOperationException();
    }

    public boolean retainAll(Collection collection)
    {
        throw new UnsupportedOperationException();
    }

    public Object set(int i, Object obj)
    {
        throw new UnsupportedOperationException();
    }

    public int size()
    {
        return list.size();
    }

    public List subList(int i, int j)
    {
        return new <init>(list.subList(i, j));
    }

    public Object[] toArray()
    {
        return list.toArray();
    }

    public Object[] toArray(Object aobj[])
    {
        return list.toArray(aobj);
    }

    public String toString()
    {
        return list.toString();
    }

    public ()
    {
        list = new ArrayList();
    }

    private list(List list1)
    {
        list = list1;
    }
}
