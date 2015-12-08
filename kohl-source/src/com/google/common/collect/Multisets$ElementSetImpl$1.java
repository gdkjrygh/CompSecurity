// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Iterator;

// Referenced classes of package com.google.common.collect:
//            Multisets

class val.entryIterator
    implements Iterator
{

    final val.entryIterator this$0;
    final Iterator val$entryIterator;

    public boolean hasNext()
    {
        return val$entryIterator.hasNext();
    }

    public Object next()
    {
        return ((val.entryIterator)val$entryIterator.next()).entryIterator();
    }

    public void remove()
    {
        val$entryIterator.remove();
    }

    ()
    {
        this$0 = final_;
        val$entryIterator = Iterator.this;
        super();
    }
}
