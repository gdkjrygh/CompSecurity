// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

// Referenced classes of package com.google.common.collect:
//            AbstractMultimap

class delegateIterator
    implements Iterator
{

    final Iterator delegateIterator;
    final Collection originalDelegate;
    final originalDelegate this$1;

    Iterator getDelegateIterator()
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
        int _tmp = AbstractMultimap.access$210(this._cls1.this.delegateIterator);
        _mth1();
    }

    void validateIterator()
    {
        _mth1();
        if (_fld1 != originalDelegate)
        {
            throw new ConcurrentModificationException();
        } else
        {
            return;
        }
    }

    ()
    {
        this$1 = this._cls1.this;
        super();
        originalDelegate = this._cls1.this.originalDelegate;
        delegateIterator = AbstractMultimap.access$100(delegateIterator.this.delegateIterator, delegateIterator.this.delegateIterator);
    }

    delegateIterator(Iterator iterator)
    {
        this$1 = this._cls1.this;
        super();
        originalDelegate = this._cls1.this.originalDelegate;
        delegateIterator = iterator;
    }
}
