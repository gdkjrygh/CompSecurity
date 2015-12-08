// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import java.io.Serializable;
import java.util.AbstractSequentialList;
import java.util.List;
import java.util.ListIterator;

// Referenced classes of package com.google.common.collect:
//            Lists

private static class function extends AbstractSequentialList
    implements Serializable
{

    private static final long serialVersionUID = 0L;
    final List fromList;
    final Function function;

    public void clear()
    {
        fromList.clear();
    }

    public ListIterator listIterator(int i)
    {
        return new ListIterator() {

            final Lists.TransformingSequentialList this$0;
            final ListIterator val$delegate;

            public void add(Object obj)
            {
                throw new UnsupportedOperationException();
            }

            public boolean hasNext()
            {
                return delegate.hasNext();
            }

            public boolean hasPrevious()
            {
                return delegate.hasPrevious();
            }

            public Object next()
            {
                return function.apply(delegate.next());
            }

            public int nextIndex()
            {
                return delegate.nextIndex();
            }

            public Object previous()
            {
                return function.apply(delegate.previous());
            }

            public int previousIndex()
            {
                return delegate.previousIndex();
            }

            public void remove()
            {
                delegate.remove();
            }

            public void set(Object obj)
            {
                throw new UnsupportedOperationException("not supported");
            }

            
            {
                this$0 = Lists.TransformingSequentialList.this;
                delegate = listiterator;
                super();
            }
        };
    }

    public int size()
    {
        return fromList.size();
    }

    _cls1.val.delegate(List list, Function function1)
    {
        fromList = (List)Preconditions.checkNotNull(list);
        function = (Function)Preconditions.checkNotNull(function1);
    }
}
