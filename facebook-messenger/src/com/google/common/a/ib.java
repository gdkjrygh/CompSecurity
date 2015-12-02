// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import com.google.common.base.Preconditions;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;

// Referenced classes of package com.google.common.a:
//            hy, ij, ii, ic

class ib extends AbstractMap
    implements Serializable, ConcurrentMap
{

    private final ii a;
    private final ic b;

    ib(hy hy1)
    {
        a = hy1.a();
        b = hy1.j;
    }

    void a(Object obj, Object obj1)
    {
        obj = new ij(obj, obj1, b);
        a.onRemoval(((ij) (obj)));
    }

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

    public Object put(Object obj, Object obj1)
    {
        Preconditions.checkNotNull(obj);
        Preconditions.checkNotNull(obj1);
        a(obj, obj1);
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
        Preconditions.checkNotNull(obj);
        Preconditions.checkNotNull(obj1);
        return null;
    }

    public boolean replace(Object obj, Object obj1, Object obj2)
    {
        Preconditions.checkNotNull(obj);
        Preconditions.checkNotNull(obj2);
        return false;
    }
}
