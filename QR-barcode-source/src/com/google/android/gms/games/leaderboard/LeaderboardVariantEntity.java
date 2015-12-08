// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.leaderboard;

import com.google.android.gms.common.internal.n;
import com.google.android.gms.games.internal.constants.LeaderboardCollection;
import com.google.android.gms.games.internal.constants.TimeSpan;

// Referenced classes of package com.google.android.gms.games.leaderboard:
//            LeaderboardVariant

public final class LeaderboardVariantEntity
    implements LeaderboardVariant
{

    private final int abM;
    private final int abN;
    private final boolean abO;
    private final long abP;
    private final String abQ;
    private final long abR;
    private final String abS;
    private final String abT;
    private final long abU;
    private final String abV;
    private final String abW;
    private final String abX;

    public LeaderboardVariantEntity(LeaderboardVariant leaderboardvariant)
    {
        abM = leaderboardvariant.getTimeSpan();
        abN = leaderboardvariant.getCollection();
        abO = leaderboardvariant.hasPlayerInfo();
        abP = leaderboardvariant.getRawPlayerScore();
        abQ = leaderboardvariant.getDisplayPlayerScore();
        abR = leaderboardvariant.getPlayerRank();
        abS = leaderboardvariant.getDisplayPlayerRank();
        abT = leaderboardvariant.getPlayerScoreTag();
        abU = leaderboardvariant.getNumScores();
        abV = leaderboardvariant.lD();
        abW = leaderboardvariant.lE();
        abX = leaderboardvariant.lF();
    }

    static int a(LeaderboardVariant leaderboardvariant)
    {
        return n.hashCode(new Object[] {
            Integer.valueOf(leaderboardvariant.getTimeSpan()), Integer.valueOf(leaderboardvariant.getCollection()), Boolean.valueOf(leaderboardvariant.hasPlayerInfo()), Long.valueOf(leaderboardvariant.getRawPlayerScore()), leaderboardvariant.getDisplayPlayerScore(), Long.valueOf(leaderboardvariant.getPlayerRank()), leaderboardvariant.getDisplayPlayerRank(), Long.valueOf(leaderboardvariant.getNumScores()), leaderboardvariant.lD(), leaderboardvariant.lF(), 
            leaderboardvariant.lE()
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
        if (!n.equal(Integer.valueOf(((LeaderboardVariant) (obj)).getTimeSpan()), Integer.valueOf(leaderboardvariant.getTimeSpan())) || !n.equal(Integer.valueOf(((LeaderboardVariant) (obj)).getCollection()), Integer.valueOf(leaderboardvariant.getCollection())) || !n.equal(Boolean.valueOf(((LeaderboardVariant) (obj)).hasPlayerInfo()), Boolean.valueOf(leaderboardvariant.hasPlayerInfo())) || !n.equal(Long.valueOf(((LeaderboardVariant) (obj)).getRawPlayerScore()), Long.valueOf(leaderboardvariant.getRawPlayerScore())) || !n.equal(((LeaderboardVariant) (obj)).getDisplayPlayerScore(), leaderboardvariant.getDisplayPlayerScore()) || !n.equal(Long.valueOf(((LeaderboardVariant) (obj)).getPlayerRank()), Long.valueOf(leaderboardvariant.getPlayerRank())) || !n.equal(((LeaderboardVariant) (obj)).getDisplayPlayerRank(), leaderboardvariant.getDisplayPlayerRank()) || !n.equal(Long.valueOf(((LeaderboardVariant) (obj)).getNumScores()), Long.valueOf(leaderboardvariant.getNumScores())) || !n.equal(((LeaderboardVariant) (obj)).lD(), leaderboardvariant.lD()) || !n.equal(((LeaderboardVariant) (obj)).lF(), leaderboardvariant.lF()))
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (n.equal(((LeaderboardVariant) (obj)).lE(), leaderboardvariant.lE())) goto _L4; else goto _L5
_L5:
        return false;
    }

    static String b(LeaderboardVariant leaderboardvariant)
    {
        com.google.android.gms.common.internal.n.a a1 = n.h(leaderboardvariant).a("TimeSpan", TimeSpan.dH(leaderboardvariant.getTimeSpan())).a("Collection", LeaderboardCollection.dH(leaderboardvariant.getCollection()));
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
        return a1.a("DisplayPlayerRank", obj).a("NumScores", Long.valueOf(leaderboardvariant.getNumScores())).a("TopPageNextToken", leaderboardvariant.lD()).a("WindowPageNextToken", leaderboardvariant.lF()).a("WindowPagePrevToken", leaderboardvariant.lE()).toString();
    }

    public boolean equals(Object obj)
    {
        return a(this, obj);
    }

    public Object freeze()
    {
        return lG();
    }

    public int getCollection()
    {
        return abN;
    }

    public String getDisplayPlayerRank()
    {
        return abS;
    }

    public String getDisplayPlayerScore()
    {
        return abQ;
    }

    public long getNumScores()
    {
        return abU;
    }

    public long getPlayerRank()
    {
        return abR;
    }

    public String getPlayerScoreTag()
    {
        return abT;
    }

    public long getRawPlayerScore()
    {
        return abP;
    }

    public int getTimeSpan()
    {
        return abM;
    }

    public boolean hasPlayerInfo()
    {
        return abO;
    }

    public int hashCode()
    {
        return a(this);
    }

    public boolean isDataValid()
    {
        return true;
    }

    public String lD()
    {
        return abV;
    }

    public String lE()
    {
        return abW;
    }

    public String lF()
    {
        return abX;
    }

    public LeaderboardVariant lG()
    {
        return this;
    }

    public String toString()
    {
        return b(this);
    }
}
