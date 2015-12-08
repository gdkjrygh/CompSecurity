// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.java.collections;

import com.soundcloud.java.checks.Preconditions;
import com.soundcloud.java.functions.Function;
import java.io.Serializable;
import java.util.AbstractSequentialList;
import java.util.List;
import java.util.ListIterator;

class TransformingSequentialList extends AbstractSequentialList
    implements Serializable
{

    private static final long serialVersionUID = 0L;
    final List fromList;
    final Function function;

    TransformingSequentialList(List list, Function function1)
    {
        fromList = (List)Preconditions.checkNotNull(list);
        function = (Function)Preconditions.checkNotNull(function1);
    }

    public void clear()
    {
        fromList.clear();
    }

    public ListIterator listIterator(int i)
    {
        return new _cls1(fromList.listIterator(i));
    }

    public int size()
    {
        return fromList.size();
    }

    private class _cls1 extends TransformedListIterator
    {

        final TransformingSequentialList this$0;

        Object transform(Object obj)
        {
            return function.apply(obj);
        }

        _cls1(ListIterator listiterator)
        {
            this$0 = TransformingSequentialList.this;
            super(listiterator);
        }
    }

}
