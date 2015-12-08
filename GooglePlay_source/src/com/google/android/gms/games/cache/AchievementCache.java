// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.cache;

import com.google.android.gms.common.config.GservicesValue;
import com.google.android.gms.games.config.G;

// Referenced classes of package com.google.android.gms.games.cache:
//            TransientDataHolderCache

public final class AchievementCache extends TransientDataHolderCache
{

    public AchievementCache(String as[])
    {
        super(as, ((Long)G.achievementCacheStaleThresholdMillis.get()).longValue(), "player_id", "external_achievement_id");
    }

    protected final String getDebugColumn()
    {
        return "external_achievement_id";
    }
}
