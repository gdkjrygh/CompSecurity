// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.b;

import java.util.AbstractList;
import java.util.Collection;

abstract class d extends AbstractList
    implements au.c
{

    private boolean a;

    d()
    {
        a = true;
    }

    public boolean a()
    {
        return a;
    }

    public void add(int i, Object obj)
    {
        c();
        super.add(i, obj);
    }

    public boolean add(Object obj)
    {
        c();
        return super.add(obj);
    }

    public boolean addAll(int i, Collection collection)
    {
        c();
        return super.addAll(i, collection);
    }

    public boolean addAll(Collection collection)
    {
        c();
        return super.addAll(collection);
    }

    public final void b()
    {
        a = false;
    }

    protected final void c()
    {
        if (!a)
        {
            throw new UnsupportedOperationException();
        } else
        {
            return;
        }
    }

    public void clear()
    {
        c();
        super.clear();
    }

    public Object remove(int i)
    {
        c();
        return super.remove(i);
    }

    public boolean remove(Object obj)
    {
        c();
        return super.remove(obj);
    }

    public boolean removeAll(Collection collection)
    {
        c();
        return super.removeAll(collection);
    }

    public boolean retainAll(Collection collection)
    {
        c();
        return super.retainAll(collection);
    }

    public Object set(int i, Object obj)
    {
        c();
        return super.set(i, obj);
    }
}
