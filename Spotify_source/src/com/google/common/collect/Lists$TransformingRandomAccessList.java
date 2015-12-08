// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import ctv;
import ctz;
import cvg;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

class function extends AbstractList
    implements Serializable, RandomAccess
{

    private static final long serialVersionUID = 0L;
    final List fromList;
    final ctv function;

    public void clear()
    {
        fromList.clear();
    }

    public Object get(int i)
    {
        return function.a(fromList.get(i));
    }

    public boolean isEmpty()
    {
        return fromList.isEmpty();
    }

    public Iterator iterator()
    {
        return listIterator();
    }

    public ListIterator listIterator(int i)
    {
        return new cvg(fromList.listIterator(i)) {

            private Lists.TransformingRandomAccessList b;

            final Object a(Object obj)
            {
                return b.function.a(obj);
            }

            
            {
                b = Lists.TransformingRandomAccessList.this;
                super(listiterator);
            }
        };
    }

    public Object remove(int i)
    {
        return function.a(fromList.remove(i));
    }

    public int size()
    {
        return fromList.size();
    }

    _cls1.b(List list, ctv ctv1)
    {
        fromList = (List)ctz.a(list);
        function = (ctv)ctz.a(ctv1);
    }
}
