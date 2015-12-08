// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.leaderboard;

import android.database.CharArrayBuffer;
import android.net.Uri;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.common.internal.o;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.internal.jv;

// Referenced classes of package com.google.android.gms.games.leaderboard:
//            LeaderboardScore

public final class LeaderboardScoreEntity
    implements LeaderboardScore
{

    private final String abA;
    private final String abB;
    private final long abC;
    private final long abD;
    private final String abE;
    private final Uri abF;
    private final Uri abG;
    private final PlayerEntity abH;
    private final String abI;
    private final String abJ;
    private final String abK;
    private final long abz;

    public LeaderboardScoreEntity(LeaderboardScore leaderboardscore)
    {
        abz = leaderboardscore.getRank();
        abA = (String)o.i(leaderboardscore.getDisplayRank());
        abB = (String)o.i(leaderboardscore.getDisplayScore());
        abC = leaderboardscore.getRawScore();
        abD = leaderboardscore.getTimestampMillis();
        abE = leaderboardscore.getScoreHolderDisplayName();
        abF = leaderboardscore.getScoreHolderIconImageUri();
        abG = leaderboardscore.getScoreHolderHiResImageUri();
        Object obj = leaderboardscore.getScoreHolder();
        if (obj == null)
        {
            obj = null;
        } else
        {
            obj = (PlayerEntity)((Player) (obj)).freeze();
        }
        abH = ((PlayerEntity) (obj));
        abI = leaderboardscore.getScoreTag();
        abJ = leaderboardscore.getScoreHolderIconImageUrl();
        abK = leaderboardscore.getScoreHolderHiResImageUrl();
    }

    static int a(LeaderboardScore leaderboardscore)
    {
        return n.hashCode(new Object[] {
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
        if (!n.equal(Long.valueOf(((LeaderboardScore) (obj)).getRank()), Long.valueOf(leaderboardscore.getRank())) || !n.equal(((LeaderboardScore) (obj)).getDisplayRank(), leaderboardscore.getDisplayRank()) || !n.equal(Long.valueOf(((LeaderboardScore) (obj)).getRawScore()), Long.valueOf(leaderboardscore.getRawScore())) || !n.equal(((LeaderboardScore) (obj)).getDisplayScore(), leaderboardscore.getDisplayScore()) || !n.equal(Long.valueOf(((LeaderboardScore) (obj)).getTimestampMillis()), Long.valueOf(leaderboardscore.getTimestampMillis())) || !n.equal(((LeaderboardScore) (obj)).getScoreHolderDisplayName(), leaderboardscore.getScoreHolderDisplayName()) || !n.equal(((LeaderboardScore) (obj)).getScoreHolderIconImageUri(), leaderboardscore.getScoreHolderIconImageUri()) || !n.equal(((LeaderboardScore) (obj)).getScoreHolderHiResImageUri(), leaderboardscore.getScoreHolderHiResImageUri()) || !n.equal(((LeaderboardScore) (obj)).getScoreHolder(), leaderboardscore.getScoreHolder()))
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (n.equal(((LeaderboardScore) (obj)).getScoreTag(), leaderboardscore.getScoreTag())) goto _L4; else goto _L5
_L5:
        return false;
    }

    static String b(LeaderboardScore leaderboardscore)
    {
        com.google.android.gms.common.internal.n.a a1 = n.h(leaderboardscore).a("Rank", Long.valueOf(leaderboardscore.getRank())).a("DisplayRank", leaderboardscore.getDisplayRank()).a("Score", Long.valueOf(leaderboardscore.getRawScore())).a("DisplayScore", leaderboardscore.getDisplayScore()).a("Timestamp", Long.valueOf(leaderboardscore.getTimestampMillis())).a("DisplayName", leaderboardscore.getScoreHolderDisplayName()).a("IconImageUri", leaderboardscore.getScoreHolderIconImageUri()).a("IconImageUrl", leaderboardscore.getScoreHolderIconImageUrl()).a("HiResImageUri", leaderboardscore.getScoreHolderHiResImageUri()).a("HiResImageUrl", leaderboardscore.getScoreHolderHiResImageUrl());
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
        return lC();
    }

    public String getDisplayRank()
    {
        return abA;
    }

    public void getDisplayRank(CharArrayBuffer chararraybuffer)
    {
        jv.b(abA, chararraybuffer);
    }

    public String getDisplayScore()
    {
        return abB;
    }

    public void getDisplayScore(CharArrayBuffer chararraybuffer)
    {
        jv.b(abB, chararraybuffer);
    }

    public long getRank()
    {
        return abz;
    }

    public long getRawScore()
    {
        return abC;
    }

    public Player getScoreHolder()
    {
        return abH;
    }

    public String getScoreHolderDisplayName()
    {
        if (abH == null)
        {
            return abE;
        } else
        {
            return abH.getDisplayName();
        }
    }

    public void getScoreHolderDisplayName(CharArrayBuffer chararraybuffer)
    {
        if (abH == null)
        {
            jv.b(abE, chararraybuffer);
            return;
        } else
        {
            abH.getDisplayName(chararraybuffer);
            return;
        }
    }

    public Uri getScoreHolderHiResImageUri()
    {
        if (abH == null)
        {
            return abG;
        } else
        {
            return abH.getHiResImageUri();
        }
    }

    public String getScoreHolderHiResImageUrl()
    {
        if (abH == null)
        {
            return abK;
        } else
        {
            return abH.getHiResImageUrl();
        }
    }

    public Uri getScoreHolderIconImageUri()
    {
        if (abH == null)
        {
            return abF;
        } else
        {
            return abH.getIconImageUri();
        }
    }

    public String getScoreHolderIconImageUrl()
    {
        if (abH == null)
        {
            return abJ;
        } else
        {
            return abH.getIconImageUrl();
        }
    }

    public String getScoreTag()
    {
        return abI;
    }

    public long getTimestampMillis()
    {
        return abD;
    }

    public int hashCode()
    {
        return a(this);
    }

    public boolean isDataValid()
    {
        return true;
    }

    public LeaderboardScore lC()
    {
        return this;
    }

    public String toString()
    {
        return b(this);
    }
}
