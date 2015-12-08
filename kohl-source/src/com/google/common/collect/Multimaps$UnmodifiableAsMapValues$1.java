// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Collection;
import java.util.Iterator;

// Referenced classes of package com.google.common.collect:
//            Multimaps

class val.iterator
    implements Iterator
{

    final val.iterator this$0;
    final Iterator val$iterator;

    public boolean hasNext()
    {
        return val$iterator.hasNext();
    }

    public volatile Object next()
    {
        return next();
    }

    public Collection next()
    {
        return Multimaps.access$100((Collection)val$iterator.next());
    }

    public void remove()
    {
        throw new UnsupportedOperationException();
    }

    ()
    {
        this$0 = final_;
        val$iterator = Iterator.this;
        super();
    }
}
