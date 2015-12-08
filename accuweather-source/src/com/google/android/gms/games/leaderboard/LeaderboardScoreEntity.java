// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.leaderboard;

import android.database.CharArrayBuffer;
import android.net.Uri;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.internal.hl;
import com.google.android.gms.internal.hn;
import com.google.android.gms.internal.il;

// Referenced classes of package com.google.android.gms.games.leaderboard:
//            LeaderboardScore

public final class LeaderboardScoreEntity
    implements LeaderboardScore
{

    private final String SA;
    private final String SB;
    private final String SC;
    private final long Sr;
    private final String Ss;
    private final String St;
    private final long Su;
    private final long Sv;
    private final String Sw;
    private final Uri Sx;
    private final Uri Sy;
    private final PlayerEntity Sz;

    public LeaderboardScoreEntity(LeaderboardScore leaderboardscore)
    {
        Sr = leaderboardscore.getRank();
        Ss = (String)hn.f(leaderboardscore.getDisplayRank());
        St = (String)hn.f(leaderboardscore.getDisplayScore());
        Su = leaderboardscore.getRawScore();
        Sv = leaderboardscore.getTimestampMillis();
        Sw = leaderboardscore.getScoreHolderDisplayName();
        Sx = leaderboardscore.getScoreHolderIconImageUri();
        Sy = leaderboardscore.getScoreHolderHiResImageUri();
        Object obj = leaderboardscore.getScoreHolder();
        if (obj == null)
        {
            obj = null;
        } else
        {
            obj = (PlayerEntity)((Player) (obj)).freeze();
        }
        Sz = ((PlayerEntity) (obj));
        SA = leaderboardscore.getScoreTag();
        SB = leaderboardscore.getScoreHolderIconImageUrl();
        SC = leaderboardscore.getScoreHolderHiResImageUrl();
    }

    static int a(LeaderboardScore leaderboardscore)
    {
        return hl.hashCode(new Object[] {
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
        if (!hl.equal(Long.valueOf(((LeaderboardScore) (obj)).getRank()), Long.valueOf(leaderboardscore.getRank())) || !hl.equal(((LeaderboardScore) (obj)).getDisplayRank(), leaderboardscore.getDisplayRank()) || !hl.equal(Long.valueOf(((LeaderboardScore) (obj)).getRawScore()), Long.valueOf(leaderboardscore.getRawScore())) || !hl.equal(((LeaderboardScore) (obj)).getDisplayScore(), leaderboardscore.getDisplayScore()) || !hl.equal(Long.valueOf(((LeaderboardScore) (obj)).getTimestampMillis()), Long.valueOf(leaderboardscore.getTimestampMillis())) || !hl.equal(((LeaderboardScore) (obj)).getScoreHolderDisplayName(), leaderboardscore.getScoreHolderDisplayName()) || !hl.equal(((LeaderboardScore) (obj)).getScoreHolderIconImageUri(), leaderboardscore.getScoreHolderIconImageUri()) || !hl.equal(((LeaderboardScore) (obj)).getScoreHolderHiResImageUri(), leaderboardscore.getScoreHolderHiResImageUri()) || !hl.equal(((LeaderboardScore) (obj)).getScoreHolder(), leaderboardscore.getScoreHolder()))
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (hl.equal(((LeaderboardScore) (obj)).getScoreTag(), leaderboardscore.getScoreTag())) goto _L4; else goto _L5
_L5:
        return false;
    }

    static String b(LeaderboardScore leaderboardscore)
    {
        com.google.android.gms.internal.hl.a a1 = hl.e(leaderboardscore).a("Rank", Long.valueOf(leaderboardscore.getRank())).a("DisplayRank", leaderboardscore.getDisplayRank()).a("Score", Long.valueOf(leaderboardscore.getRawScore())).a("DisplayScore", leaderboardscore.getDisplayScore()).a("Timestamp", Long.valueOf(leaderboardscore.getTimestampMillis())).a("DisplayName", leaderboardscore.getScoreHolderDisplayName()).a("IconImageUri", leaderboardscore.getScoreHolderIconImageUri()).a("IconImageUrl", leaderboardscore.getScoreHolderIconImageUrl()).a("HiResImageUri", leaderboardscore.getScoreHolderHiResImageUri()).a("HiResImageUrl", leaderboardscore.getScoreHolderHiResImageUrl());
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
        return ix();
    }

    public String getDisplayRank()
    {
        return Ss;
    }

    public void getDisplayRank(CharArrayBuffer chararraybuffer)
    {
        il.b(Ss, chararraybuffer);
    }

    public String getDisplayScore()
    {
        return St;
    }

    public void getDisplayScore(CharArrayBuffer chararraybuffer)
    {
        il.b(St, chararraybuffer);
    }

    public long getRank()
    {
        return Sr;
    }

    public long getRawScore()
    {
        return Su;
    }

    public Player getScoreHolder()
    {
        return Sz;
    }

    public String getScoreHolderDisplayName()
    {
        if (Sz == null)
        {
            return Sw;
        } else
        {
            return Sz.getDisplayName();
        }
    }

    public void getScoreHolderDisplayName(CharArrayBuffer chararraybuffer)
    {
        if (Sz == null)
        {
            il.b(Sw, chararraybuffer);
            return;
        } else
        {
            Sz.getDisplayName(chararraybuffer);
            return;
        }
    }

    public Uri getScoreHolderHiResImageUri()
    {
        if (Sz == null)
        {
            return Sy;
        } else
        {
            return Sz.getHiResImageUri();
        }
    }

    public String getScoreHolderHiResImageUrl()
    {
        if (Sz == null)
        {
            return SC;
        } else
        {
            return Sz.getHiResImageUrl();
        }
    }

    public Uri getScoreHolderIconImageUri()
    {
        if (Sz == null)
        {
            return Sx;
        } else
        {
            return Sz.getIconImageUri();
        }
    }

    public String getScoreHolderIconImageUrl()
    {
        if (Sz == null)
        {
            return SB;
        } else
        {
            return Sz.getIconImageUrl();
        }
    }

    public String getScoreTag()
    {
        return SA;
    }

    public long getTimestampMillis()
    {
        return Sv;
    }

    public int hashCode()
    {
        return a(this);
    }

    public boolean isDataValid()
    {
        return true;
    }

    public LeaderboardScore ix()
    {
        return this;
    }

    public String toString()
    {
        return b(this);
    }
}
