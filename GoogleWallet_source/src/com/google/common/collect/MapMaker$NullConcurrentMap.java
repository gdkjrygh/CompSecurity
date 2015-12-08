// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;

// Referenced classes of package com.google.common.collect:
//            MapMaker

static final class removalCause extends AbstractMap
    implements Serializable, ConcurrentMap
{

    private final put removalCause;
    private final put removalListener;

    private void notifyRemoval(Object obj, Object obj1)
    {
        new n(obj, obj1, removalCause);
        obj = removalListener;
    }

    public final boolean containsKey(Object obj)
    {
        return false;
    }

    public final boolean containsValue(Object obj)
    {
        return false;
    }

    public final Set entrySet()
    {
        return Collections.emptySet();
    }

    public final Object get(Object obj)
    {
        return null;
    }

    public final Object put(Object obj, Object obj1)
    {
        Preconditions.checkNotNull(obj);
        Preconditions.checkNotNull(obj1);
        notifyRemoval(obj, obj1);
        return null;
    }

    public final Object putIfAbsent(Object obj, Object obj1)
    {
        return put(obj, obj1);
    }

    public final Object remove(Object obj)
    {
        return null;
    }

    public final boolean remove(Object obj, Object obj1)
    {
        return false;
    }

    public final Object replace(Object obj, Object obj1)
    {
        Preconditions.checkNotNull(obj);
        Preconditions.checkNotNull(obj1);
        return null;
    }

    public final boolean replace(Object obj, Object obj1, Object obj2)
    {
        Preconditions.checkNotNull(obj);
        Preconditions.checkNotNull(obj2);
        return false;
    }

    n(MapMaker mapmaker)
    {
        removalListener = mapmaker.getRemovalListener();
        removalCause = mapmaker.nullRemovalCause;
    }
}
