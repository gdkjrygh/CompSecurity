// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.AbstractSet;
import java.util.Iterator;

// Referenced classes of package com.google.common.collect:
//            MapMakerInternalMap, ch

final class ci extends AbstractSet
{

    final MapMakerInternalMap a;

    ci(MapMakerInternalMap mapmakerinternalmap)
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
        return a.containsKey(obj);
    }

    public final boolean isEmpty()
    {
        return a.isEmpty();
    }

    public final Iterator iterator()
    {
        return new ch(a);
    }

    public final boolean remove(Object obj)
    {
        return a.remove(obj) != null;
    }

    public final int size()
    {
        return a.size();
    }
}
