// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.java.collections;

import com.soundcloud.java.checks.Preconditions;
import com.soundcloud.java.functions.Function;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

class TransformingRandomAccessList extends AbstractList
    implements Serializable, RandomAccess
{

    private static final long serialVersionUID = 0L;
    final List fromList;
    final Function function;

    TransformingRandomAccessList(List list, Function function1)
    {
        fromList = (List)Preconditions.checkNotNull(list);
        function = (Function)Preconditions.checkNotNull(function1);
    }

    public void clear()
    {
        fromList.clear();
    }

    public Object get(int i)
    {
        return function.apply(fromList.get(i));
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
        return new _cls1(fromList.listIterator(i));
    }

    public Object remove(int i)
    {
        return function.apply(fromList.remove(i));
    }

    public int size()
    {
        return fromList.size();
    }

    private class _cls1 extends TransformedListIterator
    {

        final TransformingRandomAccessList this$0;

        Object transform(Object obj)
        {
            return function.apply(obj);
        }

        _cls1(ListIterator listiterator)
        {
            this$0 = TransformingRandomAccessList.this;
            super(listiterator);
        }
    }

}
