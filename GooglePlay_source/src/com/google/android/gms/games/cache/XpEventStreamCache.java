// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.cache;

import com.google.android.gms.common.config.GservicesValue;
import com.google.android.gms.games.config.G;

// Referenced classes of package com.google.android.gms.games.cache:
//            TransientDataHolderCache

public final class XpEventStreamCache extends TransientDataHolderCache
{

    public XpEventStreamCache(String as[])
    {
        super(as, ((Long)G.experienceEventCacheStaleThresholdMillis.get()).longValue(), "created_timestamp", false, "external_experience_id");
    }

    protected final String getDebugColumn()
    {
        return "external_experience_id";
    }
}
