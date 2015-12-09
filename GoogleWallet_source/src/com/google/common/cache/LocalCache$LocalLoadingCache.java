// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.cache;

import com.google.common.base.Preconditions;
import com.google.common.util.concurrent.UncheckedExecutionException;
import java.util.concurrent.ExecutionException;

// Referenced classes of package com.google.common.cache:
//            LoadingCache, LocalCache, CacheLoader, CacheBuilder

static final class init> extends init>
    implements LoadingCache
{

    private Object getUnchecked(Object obj)
    {
        try
        {
            obj = get(obj);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new UncheckedExecutionException(((ExecutionException) (obj)).getCause());
        }
        return obj;
    }

    public final Object apply(Object obj)
    {
        return getUnchecked(obj);
    }

    public final Object get(Object obj)
        throws ExecutionException
    {
        return localCache.getOrLoad(obj);
    }

    xception(CacheBuilder cachebuilder, CacheLoader cacheloader)
    {
        super(new LocalCache(cachebuilder, (CacheLoader)Preconditions.checkNotNull(cacheloader)), null);
    }
}
