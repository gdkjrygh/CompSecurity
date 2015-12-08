// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.leaderboard;

import android.database.CharArrayBuffer;
import android.net.Uri;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.b;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerRef;

// Referenced classes of package com.google.android.gms.games.leaderboard:
//            LeaderboardScore, LeaderboardScoreEntity

public final class LeaderboardScoreRef extends b
    implements LeaderboardScore
{

    private final PlayerRef Mg;

    LeaderboardScoreRef(DataHolder dataholder, int i)
    {
        super(dataholder, i);
        Mg = new PlayerRef(dataholder, i);
    }

    public boolean equals(Object obj)
    {
        return LeaderboardScoreEntity.a(this, obj);
    }

    public Object freeze()
    {
        return hF();
    }

    public String getDisplayRank()
    {
        return getString("display_rank");
    }

    public void getDisplayRank(CharArrayBuffer chararraybuffer)
    {
        a("display_rank", chararraybuffer);
    }

    public String getDisplayScore()
    {
        return getString("display_score");
    }

    public void getDisplayScore(CharArrayBuffer chararraybuffer)
    {
        a("display_score", chararraybuffer);
    }

    public long getRank()
    {
        return getLong("rank");
    }

    public long getRawScore()
    {
        return getLong("raw_score");
    }

    public Player getScoreHolder()
    {
        if (ai("external_player_id"))
        {
            return null;
        } else
        {
            return Mg;
        }
    }

    public String getScoreHolderDisplayName()
    {
        if (ai("external_player_id"))
        {
            return getString("default_display_name");
        } else
        {
            return Mg.getDisplayName();
        }
    }

    public void getScoreHolderDisplayName(CharArrayBuffer chararraybuffer)
    {
        if (ai("external_player_id"))
        {
            a("default_display_name", chararraybuffer);
            return;
        } else
        {
            Mg.getDisplayName(chararraybuffer);
            return;
        }
    }

    public Uri getScoreHolderHiResImageUri()
    {
        if (ai("external_player_id"))
        {
            return null;
        } else
        {
            return Mg.getHiResImageUri();
        }
    }

    public String getScoreHolderHiResImageUrl()
    {
        if (ai("external_player_id"))
        {
            return null;
        } else
        {
            return Mg.getHiResImageUrl();
        }
    }

    public Uri getScoreHolderIconImageUri()
    {
        if (ai("external_player_id"))
        {
            return ah("default_display_image_uri");
        } else
        {
            return Mg.getIconImageUri();
        }
    }

    public String getScoreHolderIconImageUrl()
    {
        if (ai("external_player_id"))
        {
            return getString("default_display_image_url");
        } else
        {
            return Mg.getIconImageUrl();
        }
    }

    public String getScoreTag()
    {
        return getString("score_tag");
    }

    public long getTimestampMillis()
    {
        return getLong("achieved_timestamp");
    }

    public LeaderboardScore hF()
    {
        return new LeaderboardScoreEntity(this);
    }

    public int hashCode()
    {
        return LeaderboardScoreEntity.a(this);
    }

    public String toString()
    {
        return com.google.android.gms.games.leaderboard.LeaderboardScoreEntity.b(this);
    }
}
