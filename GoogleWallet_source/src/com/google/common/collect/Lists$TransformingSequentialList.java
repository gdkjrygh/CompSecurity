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
//            Lists, TransformedListIterator

static final class function extends AbstractSequentialList
    implements Serializable
{

    final List fromList;
    final Function function;

    public final void clear()
    {
        fromList.clear();
    }

    public final ListIterator listIterator(int i)
    {
        return new TransformedListIterator(fromList.listIterator(i)) {

            final Lists.TransformingSequentialList this$0;

            final Object transform(Object obj)
            {
                return function.apply(obj);
            }

            
            {
                this$0 = Lists.TransformingSequentialList.this;
                super(listiterator);
            }
        };
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
