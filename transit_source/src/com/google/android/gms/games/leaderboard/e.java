// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.leaderboard;

import com.google.android.gms.common.data.b;
import com.google.android.gms.common.data.d;
import com.google.android.gms.internal.dl;
import com.google.android.gms.internal.eu;
import com.google.android.gms.internal.ev;

// Referenced classes of package com.google.android.gms.games.leaderboard:
//            LeaderboardVariant

public final class e extends b
    implements LeaderboardVariant
{

    e(d d, int i)
    {
        super(d, i);
    }

    public String ce()
    {
        return getString("top_page_token_next");
    }

    public String cf()
    {
        return getString("window_page_token_prev");
    }

    public String cg()
    {
        return getString("window_page_token_next");
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
        if (v("total_scores"))
        {
            return -1L;
        } else
        {
            return getLong("total_scores");
        }
    }

    public long getPlayerRank()
    {
        if (v("player_rank"))
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
        if (v("player_raw_score"))
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

    public boolean hasPlayerInfo()
    {
        return !v("player_raw_score");
    }

    public String toString()
    {
        com.google.android.gms.internal.dl.a a = dl.d(this).a("TimeSpan", ev.R(getTimeSpan())).a("Collection", eu.R(getCollection()));
        Object obj;
        if (hasPlayerInfo())
        {
            obj = Long.valueOf(getRawPlayerScore());
        } else
        {
            obj = "none";
        }
        a = a.a("RawPlayerScore", obj);
        if (hasPlayerInfo())
        {
            obj = getDisplayPlayerScore();
        } else
        {
            obj = "none";
        }
        a = a.a("DisplayPlayerScore", obj);
        if (hasPlayerInfo())
        {
            obj = Long.valueOf(getPlayerRank());
        } else
        {
            obj = "none";
        }
        a = a.a("PlayerRank", obj);
        if (hasPlayerInfo())
        {
            obj = getDisplayPlayerRank();
        } else
        {
            obj = "none";
        }
        return a.a("DisplayPlayerRank", obj).a("NumScores", Long.valueOf(getNumScores())).a("TopPageNextToken", ce()).a("WindowPageNextToken", cg()).a("WindowPagePrevToken", cf()).toString();
    }
}
