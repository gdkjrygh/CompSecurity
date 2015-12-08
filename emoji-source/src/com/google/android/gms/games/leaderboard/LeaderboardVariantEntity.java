// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.leaderboard;

import com.google.android.gms.games.internal.constants.LeaderboardCollection;
import com.google.android.gms.games.internal.constants.TimeSpan;
import com.google.android.gms.internal.hk;

// Referenced classes of package com.google.android.gms.games.leaderboard:
//            LeaderboardVariant

public final class LeaderboardVariantEntity
    implements LeaderboardVariant
{

    private final int SH;
    private final int SI;
    private final boolean SJ;
    private final long SK;
    private final String SL;
    private final long SM;
    private final String SN;
    private final String SO;
    private final long SP;
    private final String SQ;
    private final String SR;
    private final String SS;

    public LeaderboardVariantEntity(LeaderboardVariant leaderboardvariant)
    {
        SH = leaderboardvariant.getTimeSpan();
        SI = leaderboardvariant.getCollection();
        SJ = leaderboardvariant.hasPlayerInfo();
        SK = leaderboardvariant.getRawPlayerScore();
        SL = leaderboardvariant.getDisplayPlayerScore();
        SM = leaderboardvariant.getPlayerRank();
        SN = leaderboardvariant.getDisplayPlayerRank();
        SO = leaderboardvariant.getPlayerScoreTag();
        SP = leaderboardvariant.getNumScores();
        SQ = leaderboardvariant.iD();
        SR = leaderboardvariant.iE();
        SS = leaderboardvariant.iF();
    }

    static int a(LeaderboardVariant leaderboardvariant)
    {
        return hk.hashCode(new Object[] {
            Integer.valueOf(leaderboardvariant.getTimeSpan()), Integer.valueOf(leaderboardvariant.getCollection()), Boolean.valueOf(leaderboardvariant.hasPlayerInfo()), Long.valueOf(leaderboardvariant.getRawPlayerScore()), leaderboardvariant.getDisplayPlayerScore(), Long.valueOf(leaderboardvariant.getPlayerRank()), leaderboardvariant.getDisplayPlayerRank(), Long.valueOf(leaderboardvariant.getNumScores()), leaderboardvariant.iD(), leaderboardvariant.iF(), 
            leaderboardvariant.iE()
        });
    }

    static boolean a(LeaderboardVariant leaderboardvariant, Object obj)
    {
        boolean flag1 = true;
        if (obj instanceof LeaderboardVariant) goto _L2; else goto _L1
_L1:
        boolean flag = false;
_L4:
        return flag;
_L2:
        flag = flag1;
        if (leaderboardvariant == obj) goto _L4; else goto _L3
_L3:
        obj = (LeaderboardVariant)obj;
        if (!hk.equal(Integer.valueOf(((LeaderboardVariant) (obj)).getTimeSpan()), Integer.valueOf(leaderboardvariant.getTimeSpan())) || !hk.equal(Integer.valueOf(((LeaderboardVariant) (obj)).getCollection()), Integer.valueOf(leaderboardvariant.getCollection())) || !hk.equal(Boolean.valueOf(((LeaderboardVariant) (obj)).hasPlayerInfo()), Boolean.valueOf(leaderboardvariant.hasPlayerInfo())) || !hk.equal(Long.valueOf(((LeaderboardVariant) (obj)).getRawPlayerScore()), Long.valueOf(leaderboardvariant.getRawPlayerScore())) || !hk.equal(((LeaderboardVariant) (obj)).getDisplayPlayerScore(), leaderboardvariant.getDisplayPlayerScore()) || !hk.equal(Long.valueOf(((LeaderboardVariant) (obj)).getPlayerRank()), Long.valueOf(leaderboardvariant.getPlayerRank())) || !hk.equal(((LeaderboardVariant) (obj)).getDisplayPlayerRank(), leaderboardvariant.getDisplayPlayerRank()) || !hk.equal(Long.valueOf(((LeaderboardVariant) (obj)).getNumScores()), Long.valueOf(leaderboardvariant.getNumScores())) || !hk.equal(((LeaderboardVariant) (obj)).iD(), leaderboardvariant.iD()) || !hk.equal(((LeaderboardVariant) (obj)).iF(), leaderboardvariant.iF()))
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (hk.equal(((LeaderboardVariant) (obj)).iE(), leaderboardvariant.iE())) goto _L4; else goto _L5
_L5:
        return false;
    }

    static String b(LeaderboardVariant leaderboardvariant)
    {
        com.google.android.gms.internal.hk.a a1 = hk.e(leaderboardvariant).a("TimeSpan", TimeSpan.cm(leaderboardvariant.getTimeSpan())).a("Collection", LeaderboardCollection.cm(leaderboardvariant.getCollection()));
        Object obj;
        if (leaderboardvariant.hasPlayerInfo())
        {
            obj = Long.valueOf(leaderboardvariant.getRawPlayerScore());
        } else
        {
            obj = "none";
        }
        a1 = a1.a("RawPlayerScore", obj);
        if (leaderboardvariant.hasPlayerInfo())
        {
            obj = leaderboardvariant.getDisplayPlayerScore();
        } else
        {
            obj = "none";
        }
        a1 = a1.a("DisplayPlayerScore", obj);
        if (leaderboardvariant.hasPlayerInfo())
        {
            obj = Long.valueOf(leaderboardvariant.getPlayerRank());
        } else
        {
            obj = "none";
        }
        a1 = a1.a("PlayerRank", obj);
        if (leaderboardvariant.hasPlayerInfo())
        {
            obj = leaderboardvariant.getDisplayPlayerRank();
        } else
        {
            obj = "none";
        }
        return a1.a("DisplayPlayerRank", obj).a("NumScores", Long.valueOf(leaderboardvariant.getNumScores())).a("TopPageNextToken", leaderboardvariant.iD()).a("WindowPageNextToken", leaderboardvariant.iF()).a("WindowPagePrevToken", leaderboardvariant.iE()).toString();
    }

    public boolean equals(Object obj)
    {
        return a(this, obj);
    }

    public Object freeze()
    {
        return iG();
    }

    public int getCollection()
    {
        return SI;
    }

    public String getDisplayPlayerRank()
    {
        return SN;
    }

    public String getDisplayPlayerScore()
    {
        return SL;
    }

    public long getNumScores()
    {
        return SP;
    }

    public long getPlayerRank()
    {
        return SM;
    }

    public String getPlayerScoreTag()
    {
        return SO;
    }

    public long getRawPlayerScore()
    {
        return SK;
    }

    public int getTimeSpan()
    {
        return SH;
    }

    public boolean hasPlayerInfo()
    {
        return SJ;
    }

    public int hashCode()
    {
        return a(this);
    }

    public String iD()
    {
        return SQ;
    }

    public String iE()
    {
        return SR;
    }

    public String iF()
    {
        return SS;
    }

    public LeaderboardVariant iG()
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
