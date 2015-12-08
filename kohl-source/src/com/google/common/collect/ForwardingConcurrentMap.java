// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Map;
import java.util.concurrent.ConcurrentMap;

// Referenced classes of package com.google.common.collect:
//            ForwardingMap

public abstract class ForwardingConcurrentMap extends ForwardingMap
    implements ConcurrentMap
{

    protected ForwardingConcurrentMap()
    {
    }

    protected volatile Object _mthdelegate()
    {
        return _mthdelegate();
    }

    protected volatile Map _mthdelegate()
    {
        return _mthdelegate();
    }

    protected abstract ConcurrentMap _mthdelegate();

    public Object putIfAbsent(Object obj, Object obj1)
    {
        return _mthdelegate().putIfAbsent(obj, obj1);
    }

    public boolean remove(Object obj, Object obj1)
    {
        return _mthdelegate().remove(obj, obj1);
    }

    public Object replace(Object obj, Object obj1)
    {
        return _mthdelegate().replace(obj, obj1);
    }

    public boolean replace(Object obj, Object obj1, Object obj2)
    {
        return _mthdelegate().replace(obj, obj1, obj2);
    }
}
