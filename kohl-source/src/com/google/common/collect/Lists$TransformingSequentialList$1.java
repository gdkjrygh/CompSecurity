// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Function;
import java.util.ListIterator;

// Referenced classes of package com.google.common.collect:
//            Lists

class val.delegate
    implements ListIterator
{

    final val.delegate this$0;
    final ListIterator val$delegate;

    public void add(Object obj)
    {
        throw new UnsupportedOperationException();
    }

    public boolean hasNext()
    {
        return val$delegate.hasNext();
    }

    public boolean hasPrevious()
    {
        return val$delegate.hasPrevious();
    }

    public Object next()
    {
        return nction.apply(val$delegate.next());
    }

    public int nextIndex()
    {
        return val$delegate.nextIndex();
    }

    public Object previous()
    {
        return nction.apply(val$delegate.previous());
    }

    public int previousIndex()
    {
        return val$delegate.previousIndex();
    }

    public void remove()
    {
        val$delegate.remove();
    }

    public void set(Object obj)
    {
        throw new UnsupportedOperationException("not supported");
    }

    ()
    {
        this$0 = final_;
        val$delegate = ListIterator.this;
        super();
    }
}
