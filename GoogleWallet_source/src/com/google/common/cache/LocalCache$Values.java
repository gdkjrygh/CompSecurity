// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.cache;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.concurrent.ConcurrentMap;

// Referenced classes of package com.google.common.cache:
//            LocalCache

final class map extends AbstractCollection
{

    private final ConcurrentMap map;
    final LocalCache this$0;

    public final void clear()
    {
        map.clear();
    }

    public final boolean contains(Object obj)
    {
        return map.containsValue(obj);
    }

    public final boolean isEmpty()
    {
        return map.isEmpty();
    }

    public final Iterator iterator()
    {
        return new erator(LocalCache.this);
    }

    public final int size()
    {
        return map.size();
    }

    erator(ConcurrentMap concurrentmap)
    {
        this$0 = LocalCache.this;
        super();
        map = concurrentmap;
    }
}
