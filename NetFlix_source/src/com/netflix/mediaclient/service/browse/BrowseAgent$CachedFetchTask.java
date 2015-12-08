// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.browse;

import com.netflix.mediaclient.service.browse.cache.BrowseCache;

// Referenced classes of package com.netflix.mediaclient.service.browse:
//            BrowseAgent, BrowseAgentCallback

private abstract class Key extends Key
{

    private static final String TAG = "CachedFetchTask";
    private final String cacheKey;
    private Object cacheVal;
    private final BrowseCache primaryCache;
    private final BrowseCache secondaryCache;
    final BrowseAgent this$0;

    protected String getCacheKey()
    {
        return cacheKey;
    }

    protected Object getCachedValue()
    {
        cacheVal = primaryCache.get(cacheKey);
        if (cacheVal == null)
        {
            cacheVal = secondaryCache.get(cacheKey);
        }
        return cacheVal;
    }

    protected void updateCacheIfNecessary(Object obj, int i)
    {
        if (cacheVal == null && i == 0)
        {
            primaryCache.put(cacheKey, obj);
        }
    }

    public (String s, int i, int j, BrowseAgentCallback browseagentcallback)
    {
        this(s, i, j, browseagentcallback, true);
    }

    public <init>(String s, int i, int j, BrowseAgentCallback browseagentcallback, boolean flag)
    {
        this$0 = BrowseAgent.this;
        super(s, i, j, browseagentcallback);
        if (flag)
        {
            browseagentcallback = BrowseAgent.access$700(BrowseAgent.this);
        } else
        {
            browseagentcallback = BrowseAgent.access$600(BrowseAgent.this);
        }
        primaryCache = browseagentcallback;
        if (flag)
        {
            browseagent = BrowseAgent.access$600(BrowseAgent.this);
        } else
        {
            browseagent = BrowseAgent.access$700(BrowseAgent.this);
        }
        secondaryCache = BrowseAgent.this;
        cacheKey = BrowseAgent.buildBrowseCacheKey(BrowseAgent.access$6000(getClass()), s, String.valueOf(i), String.valueOf(j));
    }
}
