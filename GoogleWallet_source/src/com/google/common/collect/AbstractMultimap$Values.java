// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.AbstractCollection;
import java.util.Iterator;

// Referenced classes of package com.google.common.collect:
//            AbstractMultimap

final class this._cls0 extends AbstractCollection
{

    final AbstractMultimap this$0;

    public final void clear()
    {
        AbstractMultimap.this.clear();
    }

    public final boolean contains(Object obj)
    {
        return containsValue(obj);
    }

    public final Iterator iterator()
    {
        return valueIterator();
    }

    public final int size()
    {
        return AbstractMultimap.this.size();
    }

    ()
    {
        this$0 = AbstractMultimap.this;
        super();
    }
}
