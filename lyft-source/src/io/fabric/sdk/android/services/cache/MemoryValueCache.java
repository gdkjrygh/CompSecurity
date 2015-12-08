// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android.services.cache;

import android.content.Context;

// Referenced classes of package io.fabric.sdk.android.services.cache:
//            AbstractValueCache, ValueCache

public class MemoryValueCache extends AbstractValueCache
{

    private Object a;

    public MemoryValueCache()
    {
        this(null);
    }

    public MemoryValueCache(ValueCache valuecache)
    {
        super(valuecache);
    }

    protected Object a(Context context)
    {
        return a;
    }

    protected void a(Context context, Object obj)
    {
        a = obj;
    }
}
