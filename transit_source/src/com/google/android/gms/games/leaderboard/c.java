// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.leaderboard;

import android.database.CharArrayBuffer;
import android.net.Uri;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.internal.dl;
import com.google.android.gms.internal.dm;
import com.google.android.gms.internal.eg;

// Referenced classes of package com.google.android.gms.games.leaderboard:
//            LeaderboardScore

public final class c
    implements LeaderboardScore
{

    private final long nA;
    private final long nB;
    private final String nC;
    private final Uri nD;
    private final Uri nE;
    private final PlayerEntity nF;
    private final String nG;
    private final long nx;
    private final String ny;
    private final String nz;

    public c(LeaderboardScore leaderboardscore)
    {
        nx = leaderboardscore.getRank();
        ny = (String)dm.e(leaderboardscore.getDisplayRank());
        nz = (String)dm.e(leaderboardscore.getDisplayScore());
        nA = leaderboardscore.getRawScore();
        nB = leaderboardscore.getTimestampMillis();
        nC = leaderboardscore.getScoreHolderDisplayName();
        nD = leaderboardscore.getScoreHolderIconImageUri();
        nE = leaderboardscore.getScoreHolderHiResImageUri();
        Object obj = leaderboardscore.getScoreHolder();
        if (obj == null)
        {
            obj = null;
        } else
        {
            obj = (PlayerEntity)((Player) (obj)).freeze();
        }
        nF = ((PlayerEntity) (obj));
        nG = leaderboardscore.getScoreTag();
    }

    static int a(LeaderboardScore leaderboardscore)
    {
        return dl.hashCode(new Object[] {
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
        if (!dl.equal(Long.valueOf(((LeaderboardScore) (obj)).getRank()), Long.valueOf(leaderboardscore.getRank())) || !dl.equal(((LeaderboardScore) (obj)).getDisplayRank(), leaderboardscore.getDisplayRank()) || !dl.equal(Long.valueOf(((LeaderboardScore) (obj)).getRawScore()), Long.valueOf(leaderboardscore.getRawScore())) || !dl.equal(((LeaderboardScore) (obj)).getDisplayScore(), leaderboardscore.getDisplayScore()) || !dl.equal(Long.valueOf(((LeaderboardScore) (obj)).getTimestampMillis()), Long.valueOf(leaderboardscore.getTimestampMillis())) || !dl.equal(((LeaderboardScore) (obj)).getScoreHolderDisplayName(), leaderboardscore.getScoreHolderDisplayName()) || !dl.equal(((LeaderboardScore) (obj)).getScoreHolderIconImageUri(), leaderboardscore.getScoreHolderIconImageUri()) || !dl.equal(((LeaderboardScore) (obj)).getScoreHolderHiResImageUri(), leaderboardscore.getScoreHolderHiResImageUri()) || !dl.equal(((LeaderboardScore) (obj)).getScoreHolder(), leaderboardscore.getScoreHolder()))
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (dl.equal(((LeaderboardScore) (obj)).getScoreTag(), leaderboardscore.getScoreTag())) goto _L4; else goto _L5
_L5:
        return false;
    }

    static String b(LeaderboardScore leaderboardscore)
    {
        com.google.android.gms.internal.dl.a a1 = dl.d(leaderboardscore).a("Rank", Long.valueOf(leaderboardscore.getRank())).a("DisplayRank", leaderboardscore.getDisplayRank()).a("Score", Long.valueOf(leaderboardscore.getRawScore())).a("DisplayScore", leaderboardscore.getDisplayScore()).a("Timestamp", Long.valueOf(leaderboardscore.getTimestampMillis())).a("DisplayName", leaderboardscore.getScoreHolderDisplayName()).a("IconImageUri", leaderboardscore.getScoreHolderIconImageUri()).a("HiResImageUri", leaderboardscore.getScoreHolderHiResImageUri());
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

    public LeaderboardScore cd()
    {
        return this;
    }

    public boolean equals(Object obj)
    {
        return a(this, obj);
    }

    public Object freeze()
    {
        return cd();
    }

    public String getDisplayRank()
    {
        return ny;
    }

    public void getDisplayRank(CharArrayBuffer chararraybuffer)
    {
        eg.b(ny, chararraybuffer);
    }

    public String getDisplayScore()
    {
        return nz;
    }

    public void getDisplayScore(CharArrayBuffer chararraybuffer)
    {
        eg.b(nz, chararraybuffer);
    }

    public long getRank()
    {
        return nx;
    }

    public long getRawScore()
    {
        return nA;
    }

    public Player getScoreHolder()
    {
        return nF;
    }

    public String getScoreHolderDisplayName()
    {
        if (nF == null)
        {
            return nC;
        } else
        {
            return nF.getDisplayName();
        }
    }

    public void getScoreHolderDisplayName(CharArrayBuffer chararraybuffer)
    {
        if (nF == null)
        {
            eg.b(nC, chararraybuffer);
            return;
        } else
        {
            nF.getDisplayName(chararraybuffer);
            return;
        }
    }

    public Uri getScoreHolderHiResImageUri()
    {
        if (nF == null)
        {
            return nE;
        } else
        {
            return nF.getHiResImageUri();
        }
    }

    public Uri getScoreHolderIconImageUri()
    {
        if (nF == null)
        {
            return nD;
        } else
        {
            return nF.getIconImageUri();
        }
    }

    public String getScoreTag()
    {
        return nG;
    }

    public long getTimestampMillis()
    {
        return nB;
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
