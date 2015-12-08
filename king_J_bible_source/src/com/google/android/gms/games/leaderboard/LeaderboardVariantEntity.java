// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.leaderboard;

import com.google.android.gms.games.internal.constants.LeaderboardCollection;
import com.google.android.gms.games.internal.constants.TimeSpan;
import com.google.android.gms.internal.fo;

// Referenced classes of package com.google.android.gms.games.leaderboard:
//            LeaderboardVariant

public final class LeaderboardVariantEntity
    implements LeaderboardVariant
{

    private final int Mh;
    private final int Mi;
    private final boolean Mj;
    private final long Mk;
    private final String Ml;
    private final long Mm;
    private final String Mn;
    private final String Mo;
    private final long Mp;
    private final String Mq;
    private final String Mr;
    private final String Ms;

    public LeaderboardVariantEntity(LeaderboardVariant leaderboardvariant)
    {
        Mh = leaderboardvariant.getTimeSpan();
        Mi = leaderboardvariant.getCollection();
        Mj = leaderboardvariant.hasPlayerInfo();
        Mk = leaderboardvariant.getRawPlayerScore();
        Ml = leaderboardvariant.getDisplayPlayerScore();
        Mm = leaderboardvariant.getPlayerRank();
        Mn = leaderboardvariant.getDisplayPlayerRank();
        Mo = leaderboardvariant.getPlayerScoreTag();
        Mp = leaderboardvariant.getNumScores();
        Mq = leaderboardvariant.hG();
        Mr = leaderboardvariant.hH();
        Ms = leaderboardvariant.hI();
    }

    static int a(LeaderboardVariant leaderboardvariant)
    {
        return fo.hashCode(new Object[] {
            Integer.valueOf(leaderboardvariant.getTimeSpan()), Integer.valueOf(leaderboardvariant.getCollection()), Boolean.valueOf(leaderboardvariant.hasPlayerInfo()), Long.valueOf(leaderboardvariant.getRawPlayerScore()), leaderboardvariant.getDisplayPlayerScore(), Long.valueOf(leaderboardvariant.getPlayerRank()), leaderboardvariant.getDisplayPlayerRank(), Long.valueOf(leaderboardvariant.getNumScores()), leaderboardvariant.hG(), leaderboardvariant.hI(), 
            leaderboardvariant.hH()
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
        if (!fo.equal(Integer.valueOf(((LeaderboardVariant) (obj)).getTimeSpan()), Integer.valueOf(leaderboardvariant.getTimeSpan())) || !fo.equal(Integer.valueOf(((LeaderboardVariant) (obj)).getCollection()), Integer.valueOf(leaderboardvariant.getCollection())) || !fo.equal(Boolean.valueOf(((LeaderboardVariant) (obj)).hasPlayerInfo()), Boolean.valueOf(leaderboardvariant.hasPlayerInfo())) || !fo.equal(Long.valueOf(((LeaderboardVariant) (obj)).getRawPlayerScore()), Long.valueOf(leaderboardvariant.getRawPlayerScore())) || !fo.equal(((LeaderboardVariant) (obj)).getDisplayPlayerScore(), leaderboardvariant.getDisplayPlayerScore()) || !fo.equal(Long.valueOf(((LeaderboardVariant) (obj)).getPlayerRank()), Long.valueOf(leaderboardvariant.getPlayerRank())) || !fo.equal(((LeaderboardVariant) (obj)).getDisplayPlayerRank(), leaderboardvariant.getDisplayPlayerRank()) || !fo.equal(Long.valueOf(((LeaderboardVariant) (obj)).getNumScores()), Long.valueOf(leaderboardvariant.getNumScores())) || !fo.equal(((LeaderboardVariant) (obj)).hG(), leaderboardvariant.hG()) || !fo.equal(((LeaderboardVariant) (obj)).hI(), leaderboardvariant.hI()))
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (fo.equal(((LeaderboardVariant) (obj)).hH(), leaderboardvariant.hH())) goto _L4; else goto _L5
_L5:
        return false;
    }

    static String b(LeaderboardVariant leaderboardvariant)
    {
        com.google.android.gms.internal.fo.a a1 = fo.e(leaderboardvariant).a("TimeSpan", TimeSpan.bd(leaderboardvariant.getTimeSpan())).a("Collection", LeaderboardCollection.bd(leaderboardvariant.getCollection()));
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
        return a1.a("DisplayPlayerRank", obj).a("NumScores", Long.valueOf(leaderboardvariant.getNumScores())).a("TopPageNextToken", leaderboardvariant.hG()).a("WindowPageNextToken", leaderboardvariant.hI()).a("WindowPagePrevToken", leaderboardvariant.hH()).toString();
    }

    public boolean equals(Object obj)
    {
        return a(this, obj);
    }

    public Object freeze()
    {
        return hJ();
    }

    public int getCollection()
    {
        return Mi;
    }

    public String getDisplayPlayerRank()
    {
        return Mn;
    }

    public String getDisplayPlayerScore()
    {
        return Ml;
    }

    public long getNumScores()
    {
        return Mp;
    }

    public long getPlayerRank()
    {
        return Mm;
    }

    public String getPlayerScoreTag()
    {
        return Mo;
    }

    public long getRawPlayerScore()
    {
        return Mk;
    }

    public int getTimeSpan()
    {
        return Mh;
    }

    public String hG()
    {
        return Mq;
    }

    public String hH()
    {
        return Mr;
    }

    public String hI()
    {
        return Ms;
    }

    public LeaderboardVariant hJ()
    {
        return this;
    }

    public boolean hasPlayerInfo()
    {
        return Mj;
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
