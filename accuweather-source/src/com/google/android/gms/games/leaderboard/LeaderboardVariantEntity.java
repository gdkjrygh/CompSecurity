// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.leaderboard;

import com.google.android.gms.games.internal.constants.LeaderboardCollection;
import com.google.android.gms.games.internal.constants.TimeSpan;
import com.google.android.gms.internal.hl;

// Referenced classes of package com.google.android.gms.games.leaderboard:
//            LeaderboardVariant

public final class LeaderboardVariantEntity
    implements LeaderboardVariant
{

    private final int SE;
    private final int SF;
    private final boolean SG;
    private final long SH;
    private final String SI;
    private final long SJ;
    private final String SK;
    private final String SL;
    private final long SM;
    private final String SN;
    private final String SO;
    private final String SP;

    public LeaderboardVariantEntity(LeaderboardVariant leaderboardvariant)
    {
        SE = leaderboardvariant.getTimeSpan();
        SF = leaderboardvariant.getCollection();
        SG = leaderboardvariant.hasPlayerInfo();
        SH = leaderboardvariant.getRawPlayerScore();
        SI = leaderboardvariant.getDisplayPlayerScore();
        SJ = leaderboardvariant.getPlayerRank();
        SK = leaderboardvariant.getDisplayPlayerRank();
        SL = leaderboardvariant.getPlayerScoreTag();
        SM = leaderboardvariant.getNumScores();
        SN = leaderboardvariant.iy();
        SO = leaderboardvariant.iz();
        SP = leaderboardvariant.iA();
    }

    static int a(LeaderboardVariant leaderboardvariant)
    {
        return hl.hashCode(new Object[] {
            Integer.valueOf(leaderboardvariant.getTimeSpan()), Integer.valueOf(leaderboardvariant.getCollection()), Boolean.valueOf(leaderboardvariant.hasPlayerInfo()), Long.valueOf(leaderboardvariant.getRawPlayerScore()), leaderboardvariant.getDisplayPlayerScore(), Long.valueOf(leaderboardvariant.getPlayerRank()), leaderboardvariant.getDisplayPlayerRank(), Long.valueOf(leaderboardvariant.getNumScores()), leaderboardvariant.iy(), leaderboardvariant.iA(), 
            leaderboardvariant.iz()
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
        if (!hl.equal(Integer.valueOf(((LeaderboardVariant) (obj)).getTimeSpan()), Integer.valueOf(leaderboardvariant.getTimeSpan())) || !hl.equal(Integer.valueOf(((LeaderboardVariant) (obj)).getCollection()), Integer.valueOf(leaderboardvariant.getCollection())) || !hl.equal(Boolean.valueOf(((LeaderboardVariant) (obj)).hasPlayerInfo()), Boolean.valueOf(leaderboardvariant.hasPlayerInfo())) || !hl.equal(Long.valueOf(((LeaderboardVariant) (obj)).getRawPlayerScore()), Long.valueOf(leaderboardvariant.getRawPlayerScore())) || !hl.equal(((LeaderboardVariant) (obj)).getDisplayPlayerScore(), leaderboardvariant.getDisplayPlayerScore()) || !hl.equal(Long.valueOf(((LeaderboardVariant) (obj)).getPlayerRank()), Long.valueOf(leaderboardvariant.getPlayerRank())) || !hl.equal(((LeaderboardVariant) (obj)).getDisplayPlayerRank(), leaderboardvariant.getDisplayPlayerRank()) || !hl.equal(Long.valueOf(((LeaderboardVariant) (obj)).getNumScores()), Long.valueOf(leaderboardvariant.getNumScores())) || !hl.equal(((LeaderboardVariant) (obj)).iy(), leaderboardvariant.iy()) || !hl.equal(((LeaderboardVariant) (obj)).iA(), leaderboardvariant.iA()))
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (hl.equal(((LeaderboardVariant) (obj)).iz(), leaderboardvariant.iz())) goto _L4; else goto _L5
_L5:
        return false;
    }

    static String b(LeaderboardVariant leaderboardvariant)
    {
        com.google.android.gms.internal.hl.a a1 = hl.e(leaderboardvariant).a("TimeSpan", TimeSpan.cm(leaderboardvariant.getTimeSpan())).a("Collection", LeaderboardCollection.cm(leaderboardvariant.getCollection()));
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
        return a1.a("DisplayPlayerRank", obj).a("NumScores", Long.valueOf(leaderboardvariant.getNumScores())).a("TopPageNextToken", leaderboardvariant.iy()).a("WindowPageNextToken", leaderboardvariant.iA()).a("WindowPagePrevToken", leaderboardvariant.iz()).toString();
    }

    public boolean equals(Object obj)
    {
        return a(this, obj);
    }

    public Object freeze()
    {
        return iB();
    }

    public int getCollection()
    {
        return SF;
    }

    public String getDisplayPlayerRank()
    {
        return SK;
    }

    public String getDisplayPlayerScore()
    {
        return SI;
    }

    public long getNumScores()
    {
        return SM;
    }

    public long getPlayerRank()
    {
        return SJ;
    }

    public String getPlayerScoreTag()
    {
        return SL;
    }

    public long getRawPlayerScore()
    {
        return SH;
    }

    public int getTimeSpan()
    {
        return SE;
    }

    public boolean hasPlayerInfo()
    {
        return SG;
    }

    public int hashCode()
    {
        return a(this);
    }

    public String iA()
    {
        return SP;
    }

    public LeaderboardVariant iB()
    {
        return this;
    }

    public boolean isDataValid()
    {
        return true;
    }

    public String iy()
    {
        return SN;
    }

    public String iz()
    {
        return SO;
    }

    public String toString()
    {
        return b(this);
    }
}
