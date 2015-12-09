// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.leaderboard;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.b;

// Referenced classes of package com.google.android.gms.games.leaderboard:
//            LeaderboardVariant, LeaderboardVariantEntity

public final class LeaderboardVariantRef extends b
    implements LeaderboardVariant
{

    LeaderboardVariantRef(DataHolder dataholder, int i)
    {
        super(dataholder, i);
    }

    public boolean equals(Object obj)
    {
        return LeaderboardVariantEntity.a(this, obj);
    }

    public Object freeze()
    {
        return hJ();
    }

    public int getCollection()
    {
        return getInteger("collection");
    }

    public String getDisplayPlayerRank()
    {
        return getString("player_display_rank");
    }

    public String getDisplayPlayerScore()
    {
        return getString("player_display_score");
    }

    public long getNumScores()
    {
        if (ai("total_scores"))
        {
            return -1L;
        } else
        {
            return getLong("total_scores");
        }
    }

    public long getPlayerRank()
    {
        if (ai("player_rank"))
        {
            return -1L;
        } else
        {
            return getLong("player_rank");
        }
    }

    public String getPlayerScoreTag()
    {
        return getString("player_score_tag");
    }

    public long getRawPlayerScore()
    {
        if (ai("player_raw_score"))
        {
            return -1L;
        } else
        {
            return getLong("player_raw_score");
        }
    }

    public int getTimeSpan()
    {
        return getInteger("timespan");
    }

    public String hG()
    {
        return getString("top_page_token_next");
    }

    public String hH()
    {
        return getString("window_page_token_prev");
    }

    public String hI()
    {
        return getString("window_page_token_next");
    }

    public LeaderboardVariant hJ()
    {
        return new LeaderboardVariantEntity(this);
    }

    public boolean hasPlayerInfo()
    {
        return !ai("player_raw_score");
    }

    public int hashCode()
    {
        return LeaderboardVariantEntity.a(this);
    }

    public String toString()
    {
        return com.google.android.gms.games.leaderboard.LeaderboardVariantEntity.b(this);
    }
}
