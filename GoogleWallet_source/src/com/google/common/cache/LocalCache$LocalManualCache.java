// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.cache;

import com.google.common.base.Preconditions;
import java.io.Serializable;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutionException;

// Referenced classes of package com.google.common.cache:
//            Cache, LocalCache, CacheBuilder, CacheLoader

static class <init>
    implements Cache, Serializable
{

    final LocalCache localCache;

    public final ConcurrentMap asMap()
    {
        return localCache;
    }

    public final Object get(Object obj, final Callable valueLoader)
        throws ExecutionException
    {
        Preconditions.checkNotNull(valueLoader);
        return localCache.get(obj, new CacheLoader() {

            final LocalCache.LocalManualCache this$0;
            final Callable val$valueLoader;

            public final Object load(Object obj1)
                throws Exception
            {
                return valueLoader.call();
            }

            
            {
                this$0 = LocalCache.LocalManualCache.this;
                valueLoader = callable;
                super();
            }
        });
    }

    public final Object getIfPresent(Object obj)
    {
        return localCache.getIfPresent(obj);
    }

    public final void invalidate(Object obj)
    {
        Preconditions.checkNotNull(obj);
        localCache.remove(obj);
    }

    public final void invalidateAll()
    {
        localCache.clear();
    }

    public final void put(Object obj, Object obj1)
    {
        localCache.put(obj, obj1);
    }

    _cls1.val.valueLoader(CacheBuilder cachebuilder)
    {
        this(new LocalCache(cachebuilder, null));
    }

    private <init>(LocalCache localcache)
    {
        localCache = localcache;
    }

    localCache(LocalCache localcache, localCache localcache1)
    {
        this(localcache);
    }
}
