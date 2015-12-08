// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.p;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;

// Referenced classes of package com.google.common.collect:
//            MapMaker, bu

class removalCause extends AbstractMap
    implements Serializable, ConcurrentMap
{

    private static final long serialVersionUID = 0L;
    private final put removalCause;
    private final bu removalListener;

    public boolean containsKey(Object obj)
    {
        return false;
    }

    public boolean containsValue(Object obj)
    {
        return false;
    }

    public Set entrySet()
    {
        return Collections.emptySet();
    }

    public Object get(Object obj)
    {
        return null;
    }

    void notifyRemoval(Object obj, Object obj1)
    {
        obj = new n(obj, obj1, removalCause);
        removalListener.onRemoval(((n) (obj)));
    }

    public Object put(Object obj, Object obj1)
    {
        p.a(obj);
        p.a(obj1);
        notifyRemoval(obj, obj1);
        return null;
    }

    public Object putIfAbsent(Object obj, Object obj1)
    {
        return put(obj, obj1);
    }

    public Object remove(Object obj)
    {
        return null;
    }

    public boolean remove(Object obj, Object obj1)
    {
        return false;
    }

    public Object replace(Object obj, Object obj1)
    {
        p.a(obj);
        p.a(obj1);
        return null;
    }

    public boolean replace(Object obj, Object obj1, Object obj2)
    {
        p.a(obj);
        p.a(obj2);
        return false;
    }

    n(MapMaker mapmaker)
    {
        removalListener = mapmaker.a();
        removalCause = mapmaker.j;
    }
}
