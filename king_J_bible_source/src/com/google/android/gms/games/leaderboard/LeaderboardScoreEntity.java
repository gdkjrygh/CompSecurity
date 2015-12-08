// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.leaderboard;

import android.database.CharArrayBuffer;
import android.net.Uri;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.internal.fo;
import com.google.android.gms.internal.fq;
import com.google.android.gms.internal.gm;

// Referenced classes of package com.google.android.gms.games.leaderboard:
//            LeaderboardScore

public final class LeaderboardScoreEntity
    implements LeaderboardScore
{

    private final long LU;
    private final String LV;
    private final String LW;
    private final long LX;
    private final long LY;
    private final String LZ;
    private final Uri Ma;
    private final Uri Mb;
    private final PlayerEntity Mc;
    private final String Md;
    private final String Me;
    private final String Mf;

    public LeaderboardScoreEntity(LeaderboardScore leaderboardscore)
    {
        LU = leaderboardscore.getRank();
        LV = (String)fq.f(leaderboardscore.getDisplayRank());
        LW = (String)fq.f(leaderboardscore.getDisplayScore());
        LX = leaderboardscore.getRawScore();
        LY = leaderboardscore.getTimestampMillis();
        LZ = leaderboardscore.getScoreHolderDisplayName();
        Ma = leaderboardscore.getScoreHolderIconImageUri();
        Mb = leaderboardscore.getScoreHolderHiResImageUri();
        Object obj = leaderboardscore.getScoreHolder();
        if (obj == null)
        {
            obj = null;
        } else
        {
            obj = (PlayerEntity)((Player) (obj)).freeze();
        }
        Mc = ((PlayerEntity) (obj));
        Md = leaderboardscore.getScoreTag();
        Me = leaderboardscore.getScoreHolderIconImageUrl();
        Mf = leaderboardscore.getScoreHolderHiResImageUrl();
    }

    static int a(LeaderboardScore leaderboardscore)
    {
        return fo.hashCode(new Object[] {
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
        if (!fo.equal(Long.valueOf(((LeaderboardScore) (obj)).getRank()), Long.valueOf(leaderboardscore.getRank())) || !fo.equal(((LeaderboardScore) (obj)).getDisplayRank(), leaderboardscore.getDisplayRank()) || !fo.equal(Long.valueOf(((LeaderboardScore) (obj)).getRawScore()), Long.valueOf(leaderboardscore.getRawScore())) || !fo.equal(((LeaderboardScore) (obj)).getDisplayScore(), leaderboardscore.getDisplayScore()) || !fo.equal(Long.valueOf(((LeaderboardScore) (obj)).getTimestampMillis()), Long.valueOf(leaderboardscore.getTimestampMillis())) || !fo.equal(((LeaderboardScore) (obj)).getScoreHolderDisplayName(), leaderboardscore.getScoreHolderDisplayName()) || !fo.equal(((LeaderboardScore) (obj)).getScoreHolderIconImageUri(), leaderboardscore.getScoreHolderIconImageUri()) || !fo.equal(((LeaderboardScore) (obj)).getScoreHolderHiResImageUri(), leaderboardscore.getScoreHolderHiResImageUri()) || !fo.equal(((LeaderboardScore) (obj)).getScoreHolder(), leaderboardscore.getScoreHolder()))
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (fo.equal(((LeaderboardScore) (obj)).getScoreTag(), leaderboardscore.getScoreTag())) goto _L4; else goto _L5
_L5:
        return false;
    }

    static String b(LeaderboardScore leaderboardscore)
    {
        com.google.android.gms.internal.fo.a a1 = fo.e(leaderboardscore).a("Rank", Long.valueOf(leaderboardscore.getRank())).a("DisplayRank", leaderboardscore.getDisplayRank()).a("Score", Long.valueOf(leaderboardscore.getRawScore())).a("DisplayScore", leaderboardscore.getDisplayScore()).a("Timestamp", Long.valueOf(leaderboardscore.getTimestampMillis())).a("DisplayName", leaderboardscore.getScoreHolderDisplayName()).a("IconImageUri", leaderboardscore.getScoreHolderIconImageUri()).a("IconImageUrl", leaderboardscore.getScoreHolderIconImageUrl()).a("HiResImageUri", leaderboardscore.getScoreHolderHiResImageUri()).a("HiResImageUrl", leaderboardscore.getScoreHolderHiResImageUrl());
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
        return hF();
    }

    public String getDisplayRank()
    {
        return LV;
    }

    public void getDisplayRank(CharArrayBuffer chararraybuffer)
    {
        gm.b(LV, chararraybuffer);
    }

    public String getDisplayScore()
    {
        return LW;
    }

    public void getDisplayScore(CharArrayBuffer chararraybuffer)
    {
        gm.b(LW, chararraybuffer);
    }

    public long getRank()
    {
        return LU;
    }

    public long getRawScore()
    {
        return LX;
    }

    public Player getScoreHolder()
    {
        return Mc;
    }

    public String getScoreHolderDisplayName()
    {
        if (Mc == null)
        {
            return LZ;
        } else
        {
            return Mc.getDisplayName();
        }
    }

    public void getScoreHolderDisplayName(CharArrayBuffer chararraybuffer)
    {
        if (Mc == null)
        {
            gm.b(LZ, chararraybuffer);
            return;
        } else
        {
            Mc.getDisplayName(chararraybuffer);
            return;
        }
    }

    public Uri getScoreHolderHiResImageUri()
    {
        if (Mc == null)
        {
            return Mb;
        } else
        {
            return Mc.getHiResImageUri();
        }
    }

    public String getScoreHolderHiResImageUrl()
    {
        if (Mc == null)
        {
            return Mf;
        } else
        {
            return Mc.getHiResImageUrl();
        }
    }

    public Uri getScoreHolderIconImageUri()
    {
        if (Mc == null)
        {
            return Ma;
        } else
        {
            return Mc.getIconImageUri();
        }
    }

    public String getScoreHolderIconImageUrl()
    {
        if (Mc == null)
        {
            return Me;
        } else
        {
            return Mc.getIconImageUrl();
        }
    }

    public String getScoreTag()
    {
        return Md;
    }

    public long getTimestampMillis()
    {
        return LY;
    }

    public LeaderboardScore hF()
    {
        return this;
    }

    public int hashCode()
    {
        return a(this);
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
