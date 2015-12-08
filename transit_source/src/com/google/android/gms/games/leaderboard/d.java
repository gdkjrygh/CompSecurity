// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.leaderboard;

import android.database.CharArrayBuffer;
import android.net.Uri;
import com.google.android.gms.common.data.b;
import com.google.android.gms.games.Player;

// Referenced classes of package com.google.android.gms.games.leaderboard:
//            LeaderboardScore, c

public final class d extends b
    implements LeaderboardScore
{

    private final com.google.android.gms.games.d nH;

    d(com.google.android.gms.common.data.d d1, int i)
    {
        super(d1, i);
        nH = new com.google.android.gms.games.d(d1, i);
    }

    public LeaderboardScore cd()
    {
        return new c(this);
    }

    public boolean equals(Object obj)
    {
        return c.a(this, obj);
    }

    public Object freeze()
    {
        return cd();
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
        if (v("external_player_id"))
        {
            return null;
        } else
        {
            return nH;
        }
    }

    public String getScoreHolderDisplayName()
    {
        if (v("external_player_id"))
        {
            return getString("default_display_name");
        } else
        {
            return nH.getDisplayName();
        }
    }

    public void getScoreHolderDisplayName(CharArrayBuffer chararraybuffer)
    {
        if (v("external_player_id"))
        {
            a("default_display_name", chararraybuffer);
            return;
        } else
        {
            nH.getDisplayName(chararraybuffer);
            return;
        }
    }

    public Uri getScoreHolderHiResImageUri()
    {
        if (v("external_player_id"))
        {
            return null;
        } else
        {
            return nH.getHiResImageUri();
        }
    }

    public Uri getScoreHolderIconImageUri()
    {
        if (v("external_player_id"))
        {
            return u("default_display_image_uri");
        } else
        {
            return nH.getIconImageUri();
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
        return c.a(this);
    }

    public String toString()
    {
        return com.google.android.gms.games.leaderboard.c.b(this);
    }
}
