// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.leaderboard;

import android.database.CharArrayBuffer;
import android.net.Uri;
import com.google.android.gms.common.data.DataBufferRef;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerRef;

// Referenced classes of package com.google.android.gms.games.leaderboard:
//            LeaderboardScore, LeaderboardScoreEntity

public final class LeaderboardScoreRef extends DataBufferRef
    implements LeaderboardScore
{

    private final PlayerRef mPlayerRef;

    LeaderboardScoreRef(DataHolder dataholder, int i)
    {
        super(dataholder, i);
        mPlayerRef = new PlayerRef(dataholder, i);
    }

    public final boolean equals(Object obj)
    {
        return LeaderboardScoreEntity.equals(this, obj);
    }

    public final volatile Object freeze()
    {
        return new LeaderboardScoreEntity(this);
    }

    public final String getDisplayRank()
    {
        return getString("display_rank");
    }

    public final String getDisplayScore()
    {
        return getString("display_score");
    }

    public final void getDisplayScore(CharArrayBuffer chararraybuffer)
    {
        copyToBuffer("display_score", chararraybuffer);
    }

    public final long getRank()
    {
        return getLong("rank");
    }

    public final long getRawScore()
    {
        return getLong("raw_score");
    }

    public final Player getScoreHolder()
    {
        if (hasNull("external_player_id"))
        {
            return null;
        } else
        {
            return mPlayerRef;
        }
    }

    public final String getScoreHolderDisplayName()
    {
        if (hasNull("external_player_id"))
        {
            return getString("default_display_name");
        } else
        {
            return mPlayerRef.getDisplayName();
        }
    }

    public final void getScoreHolderDisplayName(CharArrayBuffer chararraybuffer)
    {
        if (hasNull("external_player_id"))
        {
            copyToBuffer("default_display_name", chararraybuffer);
            return;
        } else
        {
            mPlayerRef.getDisplayName(chararraybuffer);
            return;
        }
    }

    public final Uri getScoreHolderHiResImageUri()
    {
        if (hasNull("external_player_id"))
        {
            return null;
        } else
        {
            return mPlayerRef.getHiResImageUri();
        }
    }

    public final String getScoreHolderHiResImageUrl()
    {
        if (hasNull("external_player_id"))
        {
            return null;
        } else
        {
            return mPlayerRef.getHiResImageUrl();
        }
    }

    public final Uri getScoreHolderIconImageUri()
    {
        if (hasNull("external_player_id"))
        {
            return parseUri("default_display_image_uri");
        } else
        {
            return mPlayerRef.getIconImageUri();
        }
    }

    public final String getScoreHolderIconImageUrl()
    {
        if (hasNull("external_player_id"))
        {
            return getString("default_display_image_url");
        } else
        {
            return mPlayerRef.getIconImageUrl();
        }
    }

    public final String getScoreTag()
    {
        return getString("score_tag");
    }

    public final long getTimestampMillis()
    {
        return getLong("achieved_timestamp");
    }

    public final int hashCode()
    {
        return LeaderboardScoreEntity.hashCode(this);
    }

    public final String toString()
    {
        return LeaderboardScoreEntity.toString(this);
    }
}
