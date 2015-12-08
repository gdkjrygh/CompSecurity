// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

// Referenced classes of package com.google.common.collect:
//            Lists, TransformedListIterator

static final class function extends AbstractList
    implements Serializable, RandomAccess
{

    final List fromList;
    final Function function;

    public final void clear()
    {
        fromList.clear();
    }

    public final Object get(int i)
    {
        return function.apply(fromList.get(i));
    }

    public final boolean isEmpty()
    {
        return fromList.isEmpty();
    }

    public final Iterator iterator()
    {
        return listIterator();
    }

    public final ListIterator listIterator(int i)
    {
        return new TransformedListIterator(fromList.listIterator(i)) {

            final Lists.TransformingRandomAccessList this$0;

            final Object transform(Object obj)
            {
                return function.apply(obj);
            }

            
            {
                this$0 = Lists.TransformingRandomAccessList.this;
                super(listiterator);
            }
        };
    }

    public final Object remove(int i)
    {
        return function.apply(fromList.remove(i));
    }

    public final int size()
    {
        return fromList.size();
    }

    _cls1.this._cls0(List list, Function function1)
    {
        fromList = (List)Preconditions.checkNotNull(list);
        function = (Function)Preconditions.checkNotNull(function1);
    }
}
