// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.leaderboard;

import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.games.internal.constants.LeaderboardCollection;
import com.google.android.gms.games.internal.constants.TimeSpan;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.games.leaderboard:
//            LeaderboardVariant

public final class LeaderboardVariantEntity
    implements LeaderboardVariant
{

    private final int mCollection;
    private final String mDisplayPlayerRank;
    private final String mDisplayPlayerScore;
    private final boolean mHasPlayerInfo;
    private final long mNumScores;
    private final String mPlayerScoreTag;
    private final long mRawPlayerRank;
    private final long mRawPlayerScore;
    private final int mTimeSpan;
    private final String mTopPageNextToken;
    private final String mWindowPageNextToken;
    private final String mWindowPagePrevToken;

    public LeaderboardVariantEntity(LeaderboardVariant leaderboardvariant)
    {
        mTimeSpan = leaderboardvariant.getTimeSpan();
        mCollection = leaderboardvariant.getCollection();
        mHasPlayerInfo = leaderboardvariant.hasPlayerInfo();
        mRawPlayerScore = leaderboardvariant.getRawPlayerScore();
        mDisplayPlayerScore = leaderboardvariant.getDisplayPlayerScore();
        mRawPlayerRank = leaderboardvariant.getPlayerRank();
        mDisplayPlayerRank = leaderboardvariant.getDisplayPlayerRank();
        mPlayerScoreTag = leaderboardvariant.getPlayerScoreTag();
        mNumScores = leaderboardvariant.getNumScores();
        mTopPageNextToken = leaderboardvariant.getTopPageNextToken();
        mWindowPagePrevToken = leaderboardvariant.getWindowPagePrevToken();
        mWindowPageNextToken = leaderboardvariant.getWindowPageNextToken();
    }

    static boolean equals(LeaderboardVariant leaderboardvariant, Object obj)
    {
        if (obj instanceof LeaderboardVariant)
        {
            if (leaderboardvariant == obj)
            {
                return true;
            }
            obj = (LeaderboardVariant)obj;
            if (Objects.equal(Integer.valueOf(((LeaderboardVariant) (obj)).getTimeSpan()), Integer.valueOf(leaderboardvariant.getTimeSpan())) && Objects.equal(Integer.valueOf(((LeaderboardVariant) (obj)).getCollection()), Integer.valueOf(leaderboardvariant.getCollection())) && Objects.equal(Boolean.valueOf(((LeaderboardVariant) (obj)).hasPlayerInfo()), Boolean.valueOf(leaderboardvariant.hasPlayerInfo())) && Objects.equal(Long.valueOf(((LeaderboardVariant) (obj)).getRawPlayerScore()), Long.valueOf(leaderboardvariant.getRawPlayerScore())) && Objects.equal(((LeaderboardVariant) (obj)).getDisplayPlayerScore(), leaderboardvariant.getDisplayPlayerScore()) && Objects.equal(Long.valueOf(((LeaderboardVariant) (obj)).getPlayerRank()), Long.valueOf(leaderboardvariant.getPlayerRank())) && Objects.equal(((LeaderboardVariant) (obj)).getDisplayPlayerRank(), leaderboardvariant.getDisplayPlayerRank()) && Objects.equal(Long.valueOf(((LeaderboardVariant) (obj)).getNumScores()), Long.valueOf(leaderboardvariant.getNumScores())) && Objects.equal(((LeaderboardVariant) (obj)).getTopPageNextToken(), leaderboardvariant.getTopPageNextToken()) && Objects.equal(((LeaderboardVariant) (obj)).getWindowPageNextToken(), leaderboardvariant.getWindowPageNextToken()) && Objects.equal(((LeaderboardVariant) (obj)).getWindowPagePrevToken(), leaderboardvariant.getWindowPagePrevToken()))
            {
                return true;
            }
        }
        return false;
    }

    static int hashCode(LeaderboardVariant leaderboardvariant)
    {
        return Arrays.hashCode(new Object[] {
            Integer.valueOf(leaderboardvariant.getTimeSpan()), Integer.valueOf(leaderboardvariant.getCollection()), Boolean.valueOf(leaderboardvariant.hasPlayerInfo()), Long.valueOf(leaderboardvariant.getRawPlayerScore()), leaderboardvariant.getDisplayPlayerScore(), Long.valueOf(leaderboardvariant.getPlayerRank()), leaderboardvariant.getDisplayPlayerRank(), Long.valueOf(leaderboardvariant.getNumScores()), leaderboardvariant.getTopPageNextToken(), leaderboardvariant.getWindowPageNextToken(), 
            leaderboardvariant.getWindowPagePrevToken()
        });
    }

    static String toString(LeaderboardVariant leaderboardvariant)
    {
        com.google.android.gms.common.internal.Objects.ToStringHelper tostringhelper = Objects.toStringHelper(leaderboardvariant).add("TimeSpan", TimeSpan.fromInt(leaderboardvariant.getTimeSpan())).add("Collection", LeaderboardCollection.fromInt(leaderboardvariant.getCollection()));
        Object obj;
        if (leaderboardvariant.hasPlayerInfo())
        {
            obj = Long.valueOf(leaderboardvariant.getRawPlayerScore());
        } else
        {
            obj = "none";
        }
        tostringhelper = tostringhelper.add("RawPlayerScore", obj);
        if (leaderboardvariant.hasPlayerInfo())
        {
            obj = leaderboardvariant.getDisplayPlayerScore();
        } else
        {
            obj = "none";
        }
        tostringhelper = tostringhelper.add("DisplayPlayerScore", obj);
        if (leaderboardvariant.hasPlayerInfo())
        {
            obj = Long.valueOf(leaderboardvariant.getPlayerRank());
        } else
        {
            obj = "none";
        }
        tostringhelper = tostringhelper.add("PlayerRank", obj);
        if (leaderboardvariant.hasPlayerInfo())
        {
            obj = leaderboardvariant.getDisplayPlayerRank();
        } else
        {
            obj = "none";
        }
        return tostringhelper.add("DisplayPlayerRank", obj).add("NumScores", Long.valueOf(leaderboardvariant.getNumScores())).add("TopPageNextToken", leaderboardvariant.getTopPageNextToken()).add("WindowPageNextToken", leaderboardvariant.getWindowPageNextToken()).add("WindowPagePrevToken", leaderboardvariant.getWindowPagePrevToken()).toString();
    }

    public final boolean equals(Object obj)
    {
        return equals(((LeaderboardVariant) (this)), obj);
    }

    public final volatile Object freeze()
    {
        return this;
    }

    public final int getCollection()
    {
        return mCollection;
    }

    public final String getDisplayPlayerRank()
    {
        return mDisplayPlayerRank;
    }

    public final String getDisplayPlayerScore()
    {
        return mDisplayPlayerScore;
    }

    public final long getNumScores()
    {
        return mNumScores;
    }

    public final long getPlayerRank()
    {
        return mRawPlayerRank;
    }

    public final String getPlayerScoreTag()
    {
        return mPlayerScoreTag;
    }

    public final long getRawPlayerScore()
    {
        return mRawPlayerScore;
    }

    public final int getTimeSpan()
    {
        return mTimeSpan;
    }

    public final String getTopPageNextToken()
    {
        return mTopPageNextToken;
    }

    public final String getWindowPageNextToken()
    {
        return mWindowPageNextToken;
    }

    public final String getWindowPagePrevToken()
    {
        return mWindowPagePrevToken;
    }

    public final boolean hasPlayerInfo()
    {
        return mHasPlayerInfo;
    }

    public final int hashCode()
    {
        return hashCode(((LeaderboardVariant) (this)));
    }

    public final boolean isDataValid()
    {
        return true;
    }

    public final String toString()
    {
        return toString(((LeaderboardVariant) (this)));
    }
}
