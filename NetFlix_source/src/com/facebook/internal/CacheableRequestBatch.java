// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.internal;

import com.facebook.Request;
import com.facebook.RequestBatch;

public class CacheableRequestBatch extends RequestBatch
{

    private String cacheKey;
    private boolean forceRoundTrip;

    public CacheableRequestBatch()
    {
    }

    public transient CacheableRequestBatch(Request arequest[])
    {
        super(arequest);
    }

    public final String getCacheKeyOverride()
    {
        return cacheKey;
    }

    public final boolean getForceRoundTrip()
    {
        return forceRoundTrip;
    }

    public final void setCacheKeyOverride(String s)
    {
        cacheKey = s;
    }

    public final void setForceRoundTrip(boolean flag)
    {
        forceRoundTrip = flag;
    }
}
