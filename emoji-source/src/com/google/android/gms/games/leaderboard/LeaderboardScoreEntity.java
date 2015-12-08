// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.leaderboard;

import android.database.CharArrayBuffer;
import android.net.Uri;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.internal.hk;
import com.google.android.gms.internal.hm;
import com.google.android.gms.internal.ik;

// Referenced classes of package com.google.android.gms.games.leaderboard:
//            LeaderboardScore

public final class LeaderboardScoreEntity
    implements LeaderboardScore
{

    private final Uri SA;
    private final Uri SB;
    private final PlayerEntity SC;
    private final String SD;
    private final String SE;
    private final String SF;
    private final long Su;
    private final String Sv;
    private final String Sw;
    private final long Sx;
    private final long Sy;
    private final String Sz;

    public LeaderboardScoreEntity(LeaderboardScore leaderboardscore)
    {
        Su = leaderboardscore.getRank();
        Sv = (String)hm.f(leaderboardscore.getDisplayRank());
        Sw = (String)hm.f(leaderboardscore.getDisplayScore());
        Sx = leaderboardscore.getRawScore();
        Sy = leaderboardscore.getTimestampMillis();
        Sz = leaderboardscore.getScoreHolderDisplayName();
        SA = leaderboardscore.getScoreHolderIconImageUri();
        SB = leaderboardscore.getScoreHolderHiResImageUri();
        Object obj = leaderboardscore.getScoreHolder();
        if (obj == null)
        {
            obj = null;
        } else
        {
            obj = (PlayerEntity)((Player) (obj)).freeze();
        }
        SC = ((PlayerEntity) (obj));
        SD = leaderboardscore.getScoreTag();
        SE = leaderboardscore.getScoreHolderIconImageUrl();
        SF = leaderboardscore.getScoreHolderHiResImageUrl();
    }

    static int a(LeaderboardScore leaderboardscore)
    {
        return hk.hashCode(new Object[] {
            Long.valueOf(leaderboardscore.getRank()), leaderboardscore.getDisplayRank(), Long.valueOf(leaderboardscore.getRawScore()), leaderboardscore.getDisplayScore(), Long.valueOf(leaderboardscore.getTimestampMillis()), leaderboardscore.getScoreHolderDisplayName(), leaderboardscore.getScoreHolderIconImageUri(), leaderboardscore.getScoreHolderHiResImageUri(), leaderboardscore.getScoreHolder()
        });
    }

    static boolean a(LeaderboardScore leaderboardscore, Object obj)
    {
        boolean flag1 = true;
        if (obj instanceof LeaderboardScore) goto _L2; else goto _L1
_L1:
        boolean flag = false;
_L4:
        return flag;
_L2:
        flag = flag1;
        if (leaderboardscore == obj) goto _L4; else goto _L3
_L3:
        obj = (LeaderboardScore)obj;
        if (!hk.equal(Long.valueOf(((LeaderboardScore) (obj)).getRank()), Long.valueOf(leaderboardscore.getRank())) || !hk.equal(((LeaderboardScore) (obj)).getDisplayRank(), leaderboardscore.getDisplayRank()) || !hk.equal(Long.valueOf(((LeaderboardScore) (obj)).getRawScore()), Long.valueOf(leaderboardscore.getRawScore())) || !hk.equal(((LeaderboardScore) (obj)).getDisplayScore(), leaderboardscore.getDisplayScore()) || !hk.equal(Long.valueOf(((LeaderboardScore) (obj)).getTimestampMillis()), Long.valueOf(leaderboardscore.getTimestampMillis())) || !hk.equal(((LeaderboardScore) (obj)).getScoreHolderDisplayName(), leaderboardscore.getScoreHolderDisplayName()) || !hk.equal(((LeaderboardScore) (obj)).getScoreHolderIconImageUri(), leaderboardscore.getScoreHolderIconImageUri()) || !hk.equal(((LeaderboardScore) (obj)).getScoreHolderHiResImageUri(), leaderboardscore.getScoreHolderHiResImageUri()) || !hk.equal(((LeaderboardScore) (obj)).getScoreHolder(), leaderboardscore.getScoreHolder()))
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (hk.equal(((LeaderboardScore) (obj)).getScoreTag(), leaderboardscore.getScoreTag())) goto _L4; else goto _L5
_L5:
        return false;
    }

    static String b(LeaderboardScore leaderboardscore)
    {
        com.google.android.gms.internal.hk.a a1 = hk.e(leaderboardscore).a("Rank", Long.valueOf(leaderboardscore.getRank())).a("DisplayRank", leaderboardscore.getDisplayRank()).a("Score", Long.valueOf(leaderboardscore.getRawScore())).a("DisplayScore", leaderboardscore.getDisplayScore()).a("Timestamp", Long.valueOf(leaderboardscore.getTimestampMillis())).a("DisplayName", leaderboardscore.getScoreHolderDisplayName()).a("IconImageUri", leaderboardscore.getScoreHolderIconImageUri()).a("IconImageUrl", leaderboardscore.getScoreHolderIconImageUrl()).a("HiResImageUri", leaderboardscore.getScoreHolderHiResImageUri()).a("HiResImageUrl", leaderboardscore.getScoreHolderHiResImageUrl());
        Player player;
        if (leaderboardscore.getScoreHolder() == null)
        {
            player = null;
        } else
        {
            player = leaderboardscore.getScoreHolder();
        }
        return a1.a("Player", player).a("ScoreTag", leaderboardscore.getScoreTag()).toString();
    }

    public boolean equals(Object obj)
    {
        return a(this, obj);
    }

    public Object freeze()
    {
        return iC();
    }

    public String getDisplayRank()
    {
        return Sv;
    }

    public void getDisplayRank(CharArrayBuffer chararraybuffer)
    {
        ik.b(Sv, chararraybuffer);
    }

    public String getDisplayScore()
    {
        return Sw;
    }

    public void getDisplayScore(CharArrayBuffer chararraybuffer)
    {
        ik.b(Sw, chararraybuffer);
    }

    public long getRank()
    {
        return Su;
    }

    public long getRawScore()
    {
        return Sx;
    }

    public Player getScoreHolder()
    {
        return SC;
    }

    public String getScoreHolderDisplayName()
    {
        if (SC == null)
        {
            return Sz;
        } else
        {
            return SC.getDisplayName();
        }
    }

    public void getScoreHolderDisplayName(CharArrayBuffer chararraybuffer)
    {
        if (SC == null)
        {
            ik.b(Sz, chararraybuffer);
            return;
        } else
        {
            SC.getDisplayName(chararraybuffer);
            return;
        }
    }

    public Uri getScoreHolderHiResImageUri()
    {
        if (SC == null)
        {
            return SB;
        } else
        {
            return SC.getHiResImageUri();
        }
    }

    public String getScoreHolderHiResImageUrl()
    {
        if (SC == null)
        {
            return SF;
        } else
        {
            return SC.getHiResImageUrl();
        }
    }

    public Uri getScoreHolderIconImageUri()
    {
        if (SC == null)
        {
            return SA;
        } else
        {
            return SC.getIconImageUri();
        }
    }

    public String getScoreHolderIconImageUrl()
    {
        if (SC == null)
        {
            return SE;
        } else
        {
            return SC.getIconImageUrl();
        }
    }

    public String getScoreTag()
    {
        return SD;
    }

    public long getTimestampMillis()
    {
        return Sy;
    }

    public int hashCode()
    {
        return a(this);
    }

    public LeaderboardScore iC()
    {
        return this;
    }

    public boolean isDataValid()
    {
        return true;
    }

    public String toString()
    {
        return b(this);
    }
}
