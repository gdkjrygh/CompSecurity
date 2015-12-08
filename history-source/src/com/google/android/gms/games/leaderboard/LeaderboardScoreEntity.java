// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.leaderboard;

import android.database.CharArrayBuffer;
import android.net.Uri;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.internal.jv;
import com.google.android.gms.internal.jx;
import com.google.android.gms.internal.le;

// Referenced classes of package com.google.android.gms.games.leaderboard:
//            LeaderboardScore

public final class LeaderboardScoreEntity
    implements LeaderboardScore
{

    private final PlayerEntity adA;
    private final String adB;
    private final String adC;
    private final String adD;
    private final long ads;
    private final String adt;
    private final String adu;
    private final long adv;
    private final long adw;
    private final String adx;
    private final Uri ady;
    private final Uri adz;

    public LeaderboardScoreEntity(LeaderboardScore leaderboardscore)
    {
        ads = leaderboardscore.getRank();
        adt = (String)jx.i(leaderboardscore.getDisplayRank());
        adu = (String)jx.i(leaderboardscore.getDisplayScore());
        adv = leaderboardscore.getRawScore();
        adw = leaderboardscore.getTimestampMillis();
        adx = leaderboardscore.getScoreHolderDisplayName();
        ady = leaderboardscore.getScoreHolderIconImageUri();
        adz = leaderboardscore.getScoreHolderHiResImageUri();
        Object obj = leaderboardscore.getScoreHolder();
        if (obj == null)
        {
            obj = null;
        } else
        {
            obj = (PlayerEntity)((Player) (obj)).freeze();
        }
        adA = ((PlayerEntity) (obj));
        adB = leaderboardscore.getScoreTag();
        adC = leaderboardscore.getScoreHolderIconImageUrl();
        adD = leaderboardscore.getScoreHolderHiResImageUrl();
    }

    static int a(LeaderboardScore leaderboardscore)
    {
        return jv.hashCode(new Object[] {
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
        if (!jv.equal(Long.valueOf(((LeaderboardScore) (obj)).getRank()), Long.valueOf(leaderboardscore.getRank())) || !jv.equal(((LeaderboardScore) (obj)).getDisplayRank(), leaderboardscore.getDisplayRank()) || !jv.equal(Long.valueOf(((LeaderboardScore) (obj)).getRawScore()), Long.valueOf(leaderboardscore.getRawScore())) || !jv.equal(((LeaderboardScore) (obj)).getDisplayScore(), leaderboardscore.getDisplayScore()) || !jv.equal(Long.valueOf(((LeaderboardScore) (obj)).getTimestampMillis()), Long.valueOf(leaderboardscore.getTimestampMillis())) || !jv.equal(((LeaderboardScore) (obj)).getScoreHolderDisplayName(), leaderboardscore.getScoreHolderDisplayName()) || !jv.equal(((LeaderboardScore) (obj)).getScoreHolderIconImageUri(), leaderboardscore.getScoreHolderIconImageUri()) || !jv.equal(((LeaderboardScore) (obj)).getScoreHolderHiResImageUri(), leaderboardscore.getScoreHolderHiResImageUri()) || !jv.equal(((LeaderboardScore) (obj)).getScoreHolder(), leaderboardscore.getScoreHolder()))
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (jv.equal(((LeaderboardScore) (obj)).getScoreTag(), leaderboardscore.getScoreTag())) goto _L4; else goto _L5
_L5:
        return false;
    }

    static String b(LeaderboardScore leaderboardscore)
    {
        com.google.android.gms.internal.jv.a a1 = jv.h(leaderboardscore).a("Rank", Long.valueOf(leaderboardscore.getRank())).a("DisplayRank", leaderboardscore.getDisplayRank()).a("Score", Long.valueOf(leaderboardscore.getRawScore())).a("DisplayScore", leaderboardscore.getDisplayScore()).a("Timestamp", Long.valueOf(leaderboardscore.getTimestampMillis())).a("DisplayName", leaderboardscore.getScoreHolderDisplayName()).a("IconImageUri", leaderboardscore.getScoreHolderIconImageUri()).a("IconImageUrl", leaderboardscore.getScoreHolderIconImageUrl()).a("HiResImageUri", leaderboardscore.getScoreHolderHiResImageUri()).a("HiResImageUrl", leaderboardscore.getScoreHolderHiResImageUrl());
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
        return mJ();
    }

    public String getDisplayRank()
    {
        return adt;
    }

    public void getDisplayRank(CharArrayBuffer chararraybuffer)
    {
        le.b(adt, chararraybuffer);
    }

    public String getDisplayScore()
    {
        return adu;
    }

    public void getDisplayScore(CharArrayBuffer chararraybuffer)
    {
        le.b(adu, chararraybuffer);
    }

    public long getRank()
    {
        return ads;
    }

    public long getRawScore()
    {
        return adv;
    }

    public Player getScoreHolder()
    {
        return adA;
    }

    public String getScoreHolderDisplayName()
    {
        if (adA == null)
        {
            return adx;
        } else
        {
            return adA.getDisplayName();
        }
    }

    public void getScoreHolderDisplayName(CharArrayBuffer chararraybuffer)
    {
        if (adA == null)
        {
            le.b(adx, chararraybuffer);
            return;
        } else
        {
            adA.getDisplayName(chararraybuffer);
            return;
        }
    }

    public Uri getScoreHolderHiResImageUri()
    {
        if (adA == null)
        {
            return adz;
        } else
        {
            return adA.getHiResImageUri();
        }
    }

    public String getScoreHolderHiResImageUrl()
    {
        if (adA == null)
        {
            return adD;
        } else
        {
            return adA.getHiResImageUrl();
        }
    }

    public Uri getScoreHolderIconImageUri()
    {
        if (adA == null)
        {
            return ady;
        } else
        {
            return adA.getIconImageUri();
        }
    }

    public String getScoreHolderIconImageUrl()
    {
        if (adA == null)
        {
            return adC;
        } else
        {
            return adA.getIconImageUrl();
        }
    }

    public String getScoreTag()
    {
        return adB;
    }

    public long getTimestampMillis()
    {
        return adw;
    }

    public int hashCode()
    {
        return a(this);
    }

    public boolean isDataValid()
    {
        return true;
    }

    public LeaderboardScore mJ()
    {
        return this;
    }

    public String toString()
    {
        return b(this);
    }
}
