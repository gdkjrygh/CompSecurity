// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Collection;
import java.util.Iterator;

// Referenced classes of package com.google.common.collect:
//            LinkedHashMultimap

class val.delegateIterator
    implements Iterator
{

    final value this$1;
    final Iterator val$delegateIterator;
    Object value;

    public boolean hasNext()
    {
        return val$delegateIterator.hasNext();
    }

    public Object next()
    {
        value = val$delegateIterator.next();
        return value;
    }

    public void remove()
    {
        val$delegateIterator.remove();
        linkedEntries.remove(eateEntry(value));
    }

    A()
    {
        this$1 = final_a;
        val$delegateIterator = Iterator.this;
        super();
    }
}
