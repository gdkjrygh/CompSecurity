// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.leaderboard;

import android.database.CharArrayBuffer;
import android.net.Uri;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.d;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerRef;

// Referenced classes of package com.google.android.gms.games.leaderboard:
//            LeaderboardScore, LeaderboardScoreEntity

public final class LeaderboardScoreRef extends d
    implements LeaderboardScore
{

    private final PlayerRef SD;

    LeaderboardScoreRef(DataHolder dataholder, int i)
    {
        super(dataholder, i);
        SD = new PlayerRef(dataholder, i);
    }

    public boolean equals(Object obj)
    {
        return LeaderboardScoreEntity.a(this, obj);
    }

    public Object freeze()
    {
        return ix();
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
        if (ax("external_player_id"))
        {
            return null;
        } else
        {
            return SD;
        }
    }

    public String getScoreHolderDisplayName()
    {
        if (ax("external_player_id"))
        {
            return getString("default_display_name");
        } else
        {
            return SD.getDisplayName();
        }
    }

    public void getScoreHolderDisplayName(CharArrayBuffer chararraybuffer)
    {
        if (ax("external_player_id"))
        {
            a("default_display_name", chararraybuffer);
            return;
        } else
        {
            SD.getDisplayName(chararraybuffer);
            return;
        }
    }

    public Uri getScoreHolderHiResImageUri()
    {
        if (ax("external_player_id"))
        {
            return null;
        } else
        {
            return SD.getHiResImageUri();
        }
    }

    public String getScoreHolderHiResImageUrl()
    {
        if (ax("external_player_id"))
        {
            return null;
        } else
        {
            return SD.getHiResImageUrl();
        }
    }

    public Uri getScoreHolderIconImageUri()
    {
        if (ax("external_player_id"))
        {
            return aw("default_display_image_uri");
        } else
        {
            return SD.getIconImageUri();
        }
    }

    public String getScoreHolderIconImageUrl()
    {
        if (ax("external_player_id"))
        {
            return getString("default_display_image_url");
        } else
        {
            return SD.getIconImageUrl();
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

    public int hashCode()
    {
        return LeaderboardScoreEntity.a(this);
    }

    public LeaderboardScore ix()
    {
        return new LeaderboardScoreEntity(this);
    }

    public String toString()
    {
        return LeaderboardScoreEntity.b(this);
    }
}
