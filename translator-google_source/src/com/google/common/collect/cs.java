// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.AbstractCollection;
import java.util.Iterator;

// Referenced classes of package com.google.common.collect:
//            MapMakerInternalMap, cq

final class cs extends AbstractCollection
{

    final MapMakerInternalMap a;

    cs(MapMakerInternalMap mapmakerinternalmap)
    {
        a = mapmakerinternalmap;
        super();
    }

    public final void clear()
    {
        a.clear();
    }

    public final boolean contains(Object obj)
    {
        return a.containsValue(obj);
    }

    public final boolean isEmpty()
    {
        return a.isEmpty();
    }

    public final Iterator iterator()
    {
        return new cq(a);
    }

    public final int size()
    {
        return a.size();
    }
}
