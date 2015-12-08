// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Iterator;

// Referenced classes of package com.google.common.collect:
//            AbstractBiMap

class val.iterator
    implements Iterator
{

    final valueToRemove this$1;
    final Iterator val$iterator;
    Object valueToRemove;

    public boolean hasNext()
    {
        return val$iterator.hasNext();
    }

    public Object next()
    {
        Object obj = val$iterator.next();
        valueToRemove = obj;
        return obj;
    }

    public void remove()
    {
        val$iterator.remove();
        AbstractBiMap.access$400(_fld0, valueToRemove);
    }

    ()
    {
        this$1 = final_;
        val$iterator = Iterator.this;
        super();
    }
}
