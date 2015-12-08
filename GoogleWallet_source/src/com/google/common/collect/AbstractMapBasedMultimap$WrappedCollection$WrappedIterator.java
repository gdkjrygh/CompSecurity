// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

// Referenced classes of package com.google.common.collect:
//            AbstractMapBasedMultimap

class delegateIterator
    implements Iterator
{

    final Iterator delegateIterator;
    final Collection originalDelegate;
    final this._cls1 this$1;

    private void validateIterator()
    {
        delegateIterator.this.delegateIterator();
        if (this._cls1.this.delegateIterator != originalDelegate)
        {
            throw new ConcurrentModificationException();
        } else
        {
            return;
        }
    }

    final Iterator getDelegateIterator()
    {
        validateIterator();
        return delegateIterator;
    }

    public boolean hasNext()
    {
        validateIterator();
        return delegateIterator.hasNext();
    }

    public Object next()
    {
        validateIterator();
        return delegateIterator.next();
    }

    public void remove()
    {
        delegateIterator.remove();
        int _tmp = AbstractMapBasedMultimap.access$210(this._cls1.this.delegateIterator);
        _mth1();
    }

    ()
    {
        this$1 = this._cls1.this;
        super();
        originalDelegate = this._cls1.this.originalDelegate;
        delegateIterator = AbstractMapBasedMultimap.access$100(delegateIterator.this.delegateIterator, delegateIterator.this.delegateIterator);
    }

    delegateIterator(Iterator iterator)
    {
        this$1 = this._cls1.this;
        super();
        originalDelegate = this._cls1.this.originalDelegate;
        delegateIterator = iterator;
    }
}
