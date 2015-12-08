// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.cache;

import com.google.android.gms.common.config.GservicesValue;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.config.G;
import com.google.android.gms.games.leaderboard.LeaderboardScoreBufferHeader;

// Referenced classes of package com.google.android.gms.games.cache:
//            TransientDataHolderCache, ScoreCacheKey

public final class LeaderboardScoreCache extends TransientDataHolderCache
{

    public LeaderboardScoreCache(String as[])
    {
        super(as, ((Long)G.leaderboardCacheStaleThresholdMillis.get()).longValue(), "rank", "external_player_id");
    }

    protected final String getDebugColumn()
    {
        return "profile_name";
    }

    public final DataHolder getRootPage(ScoreCacheKey scorecachekey, LeaderboardScoreBufferHeader leaderboardscorebufferheader, int i)
    {
        leaderboardscorebufferheader = leaderboardscorebufferheader.mBundle;
        if (findEntry(scorecachekey) == null)
        {
            return DataHolder.empty(4, leaderboardscorebufferheader);
        } else
        {
            return getData(scorecachekey, leaderboardscorebufferheader, i);
        }
    }
}
