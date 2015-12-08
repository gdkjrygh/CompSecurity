// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android.services.cache;

import android.content.Context;

// Referenced classes of package io.fabric.sdk.android.services.cache:
//            ValueCache, ValueLoader

public abstract class AbstractValueCache
    implements ValueCache
{

    private final ValueCache childCache;

    public AbstractValueCache()
    {
        this(null);
    }

    public AbstractValueCache(ValueCache valuecache)
    {
        childCache = valuecache;
    }

    private void cache(Context context, Object obj)
    {
        if (obj == null)
        {
            throw new NullPointerException();
        } else
        {
            cacheValue(context, obj);
            return;
        }
    }

    protected abstract void cacheValue(Context context, Object obj);

    protected abstract void doInvalidate(Context context);

    public final Object get(Context context, ValueLoader valueloader)
        throws Exception
    {
        this;
        JVM INSTR monitorenter ;
        Object obj1 = getCached(context);
        Object obj = obj1;
        if (obj1 != null) goto _L2; else goto _L1
_L1:
        if (childCache == null)
        {
            break MISSING_BLOCK_LABEL_48;
        }
        valueloader = ((ValueLoader) (childCache.get(context, valueloader)));
_L3:
        cache(context, valueloader);
        obj = valueloader;
_L2:
        this;
        JVM INSTR monitorexit ;
        return obj;
        valueloader = ((ValueLoader) (valueloader.load(context)));
          goto _L3
        context;
        throw context;
    }

    protected abstract Object getCached(Context context);

    public final void invalidate(Context context)
    {
        this;
        JVM INSTR monitorenter ;
        doInvalidate(context);
        this;
        JVM INSTR monitorexit ;
        return;
        context;
        throw context;
    }
}
