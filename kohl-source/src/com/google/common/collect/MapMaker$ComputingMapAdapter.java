// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.io.Serializable;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;

// Referenced classes of package com.google.common.collect:
//            ForwardingConcurrentMap, MapMaker

static class cache extends ForwardingConcurrentMap
    implements Serializable
{

    private static final long serialVersionUID = 0L;
    final cache cache;

    protected volatile Object _mthdelegate()
    {
        return _mthdelegate();
    }

    protected volatile Map _mthdelegate()
    {
        return _mthdelegate();
    }

    protected ConcurrentMap _mthdelegate()
    {
        return cache.cache();
    }

    public Object get(Object obj)
    {
        return cache.cache(obj);
    }

    ( )
    {
        cache = ;
    }
}
