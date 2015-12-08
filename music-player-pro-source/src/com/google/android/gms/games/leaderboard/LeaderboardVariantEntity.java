// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.leaderboard;

import com.google.android.gms.games.internal.constants.LeaderboardCollection;
import com.google.android.gms.games.internal.constants.TimeSpan;
import com.google.android.gms.internal.jv;

// Referenced classes of package com.google.android.gms.games.leaderboard:
//            LeaderboardVariant

public final class LeaderboardVariantEntity
    implements LeaderboardVariant
{

    private final int adF;
    private final int adG;
    private final boolean adH;
    private final long adI;
    private final String adJ;
    private final long adK;
    private final String adL;
    private final String adM;
    private final long adN;
    private final String adO;
    private final String adP;
    private final String adQ;

    public LeaderboardVariantEntity(LeaderboardVariant leaderboardvariant)
    {
        adF = leaderboardvariant.getTimeSpan();
        adG = leaderboardvariant.getCollection();
        adH = leaderboardvariant.hasPlayerInfo();
        adI = leaderboardvariant.getRawPlayerScore();
        adJ = leaderboardvariant.getDisplayPlayerScore();
        adK = leaderboardvariant.getPlayerRank();
        adL = leaderboardvariant.getDisplayPlayerRank();
        adM = leaderboardvariant.getPlayerScoreTag();
        adN = leaderboardvariant.getNumScores();
        adO = leaderboardvariant.mK();
        adP = leaderboardvariant.mL();
        adQ = leaderboardvariant.mM();
    }

    static int a(LeaderboardVariant leaderboardvariant)
    {
        return jv.hashCode(new Object[] {
            Integer.valueOf(leaderboardvariant.getTimeSpan()), Integer.valueOf(leaderboardvariant.getCollection()), Boolean.valueOf(leaderboardvariant.hasPlayerInfo()), Long.valueOf(leaderboardvariant.getRawPlayerScore()), leaderboardvariant.getDisplayPlayerScore(), Long.valueOf(leaderboardvariant.getPlayerRank()), leaderboardvariant.getDisplayPlayerRank(), Long.valueOf(leaderboardvariant.getNumScores()), leaderboardvariant.mK(), leaderboardvariant.mM(), 
            leaderboardvariant.mL()
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
        if (!jv.equal(Integer.valueOf(((LeaderboardVariant) (obj)).getTimeSpan()), Integer.valueOf(leaderboardvariant.getTimeSpan())) || !jv.equal(Integer.valueOf(((LeaderboardVariant) (obj)).getCollection()), Integer.valueOf(leaderboardvariant.getCollection())) || !jv.equal(Boolean.valueOf(((LeaderboardVariant) (obj)).hasPlayerInfo()), Boolean.valueOf(leaderboardvariant.hasPlayerInfo())) || !jv.equal(Long.valueOf(((LeaderboardVariant) (obj)).getRawPlayerScore()), Long.valueOf(leaderboardvariant.getRawPlayerScore())) || !jv.equal(((LeaderboardVariant) (obj)).getDisplayPlayerScore(), leaderboardvariant.getDisplayPlayerScore()) || !jv.equal(Long.valueOf(((LeaderboardVariant) (obj)).getPlayerRank()), Long.valueOf(leaderboardvariant.getPlayerRank())) || !jv.equal(((LeaderboardVariant) (obj)).getDisplayPlayerRank(), leaderboardvariant.getDisplayPlayerRank()) || !jv.equal(Long.valueOf(((LeaderboardVariant) (obj)).getNumScores()), Long.valueOf(leaderboardvariant.getNumScores())) || !jv.equal(((LeaderboardVariant) (obj)).mK(), leaderboardvariant.mK()) || !jv.equal(((LeaderboardVariant) (obj)).mM(), leaderboardvariant.mM()))
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (jv.equal(((LeaderboardVariant) (obj)).mL(), leaderboardvariant.mL())) goto _L4; else goto _L5
_L5:
        return false;
    }

    static String b(LeaderboardVariant leaderboardvariant)
    {
        com.google.android.gms.internal.jv.a a1 = jv.h(leaderboardvariant).a("TimeSpan", TimeSpan.dZ(leaderboardvariant.getTimeSpan())).a("Collection", LeaderboardCollection.dZ(leaderboardvariant.getCollection()));
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
        return a1.a("DisplayPlayerRank", obj).a("NumScores", Long.valueOf(leaderboardvariant.getNumScores())).a("TopPageNextToken", leaderboardvariant.mK()).a("WindowPageNextToken", leaderboardvariant.mM()).a("WindowPagePrevToken", leaderboardvariant.mL()).toString();
    }

    public boolean equals(Object obj)
    {
        return a(this, obj);
    }

    public Object freeze()
    {
        return mN();
    }

    public int getCollection()
    {
        return adG;
    }

    public String getDisplayPlayerRank()
    {
        return adL;
    }

    public String getDisplayPlayerScore()
    {
        return adJ;
    }

    public long getNumScores()
    {
        return adN;
    }

    public long getPlayerRank()
    {
        return adK;
    }

    public String getPlayerScoreTag()
    {
        return adM;
    }

    public long getRawPlayerScore()
    {
        return adI;
    }

    public int getTimeSpan()
    {
        return adF;
    }

    public boolean hasPlayerInfo()
    {
        return adH;
    }

    public int hashCode()
    {
        return a(this);
    }

    public boolean isDataValid()
    {
        return true;
    }

    public String mK()
    {
        return adO;
    }

    public String mL()
    {
        return adP;
    }

    public String mM()
    {
        return adQ;
    }

    public LeaderboardVariant mN()
    {
        return this;
    }

    public String toString()
    {
        return b(this);
    }
}
