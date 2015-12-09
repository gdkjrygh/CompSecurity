// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.leaderboard;

import android.database.CharArrayBuffer;
import android.net.Uri;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.DataUtils;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerEntity;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.games.leaderboard:
//            LeaderboardScore

public final class LeaderboardScoreEntity
    implements LeaderboardScore
{

    private final String mDisplayRank;
    private final String mDisplayScore;
    private final long mRank;
    private final long mRawScore;
    private final PlayerEntity mScoreHolder;
    private final String mScoreHolderDisplayName;
    private final Uri mScoreHolderHiResImageUri;
    private final String mScoreHolderHiResImageUrl;
    private final Uri mScoreHolderIconImageUri;
    private final String mScoreHolderIconImageUrl;
    private final String mScoreTag;
    private final long mTimestampMillis;

    public LeaderboardScoreEntity(LeaderboardScore leaderboardscore)
    {
        mRank = leaderboardscore.getRank();
        mDisplayRank = (String)Preconditions.checkNotNull(leaderboardscore.getDisplayRank());
        mDisplayScore = (String)Preconditions.checkNotNull(leaderboardscore.getDisplayScore());
        mRawScore = leaderboardscore.getRawScore();
        mTimestampMillis = leaderboardscore.getTimestampMillis();
        mScoreHolderDisplayName = leaderboardscore.getScoreHolderDisplayName();
        mScoreHolderIconImageUri = leaderboardscore.getScoreHolderIconImageUri();
        mScoreHolderHiResImageUri = leaderboardscore.getScoreHolderHiResImageUri();
        Object obj = leaderboardscore.getScoreHolder();
        if (obj == null)
        {
            obj = null;
        } else
        {
            obj = (PlayerEntity)((Player) (obj)).freeze();
        }
        mScoreHolder = ((PlayerEntity) (obj));
        mScoreTag = leaderboardscore.getScoreTag();
        mScoreHolderIconImageUrl = leaderboardscore.getScoreHolderIconImageUrl();
        mScoreHolderHiResImageUrl = leaderboardscore.getScoreHolderHiResImageUrl();
    }

    static boolean equals(LeaderboardScore leaderboardscore, Object obj)
    {
        if (obj instanceof LeaderboardScore)
        {
            if (leaderboardscore == obj)
            {
                return true;
            }
            obj = (LeaderboardScore)obj;
            if (Objects.equal(Long.valueOf(((LeaderboardScore) (obj)).getRank()), Long.valueOf(leaderboardscore.getRank())) && Objects.equal(((LeaderboardScore) (obj)).getDisplayRank(), leaderboardscore.getDisplayRank()) && Objects.equal(Long.valueOf(((LeaderboardScore) (obj)).getRawScore()), Long.valueOf(leaderboardscore.getRawScore())) && Objects.equal(((LeaderboardScore) (obj)).getDisplayScore(), leaderboardscore.getDisplayScore()) && Objects.equal(Long.valueOf(((LeaderboardScore) (obj)).getTimestampMillis()), Long.valueOf(leaderboardscore.getTimestampMillis())) && Objects.equal(((LeaderboardScore) (obj)).getScoreHolderDisplayName(), leaderboardscore.getScoreHolderDisplayName()) && Objects.equal(((LeaderboardScore) (obj)).getScoreHolderIconImageUri(), leaderboardscore.getScoreHolderIconImageUri()) && Objects.equal(((LeaderboardScore) (obj)).getScoreHolderHiResImageUri(), leaderboardscore.getScoreHolderHiResImageUri()) && Objects.equal(((LeaderboardScore) (obj)).getScoreHolder(), leaderboardscore.getScoreHolder()) && Objects.equal(((LeaderboardScore) (obj)).getScoreTag(), leaderboardscore.getScoreTag()))
            {
                return true;
            }
        }
        return false;
    }

    static int hashCode(LeaderboardScore leaderboardscore)
    {
        return Arrays.hashCode(new Object[] {
            Long.valueOf(leaderboardscore.getRank()), leaderboardscore.getDisplayRank(), Long.valueOf(leaderboardscore.getRawScore()), leaderboardscore.getDisplayScore(), Long.valueOf(leaderboardscore.getTimestampMillis()), leaderboardscore.getScoreHolderDisplayName(), leaderboardscore.getScoreHolderIconImageUri(), leaderboardscore.getScoreHolderHiResImageUri(), leaderboardscore.getScoreHolder()
        });
    }

    static String toString(LeaderboardScore leaderboardscore)
    {
        com.google.android.gms.common.internal.Objects.ToStringHelper tostringhelper = Objects.toStringHelper(leaderboardscore).add("Rank", Long.valueOf(leaderboardscore.getRank())).add("DisplayRank", leaderboardscore.getDisplayRank()).add("Score", Long.valueOf(leaderboardscore.getRawScore())).add("DisplayScore", leaderboardscore.getDisplayScore()).add("Timestamp", Long.valueOf(leaderboardscore.getTimestampMillis())).add("DisplayName", leaderboardscore.getScoreHolderDisplayName()).add("IconImageUri", leaderboardscore.getScoreHolderIconImageUri()).add("IconImageUrl", leaderboardscore.getScoreHolderIconImageUrl()).add("HiResImageUri", leaderboardscore.getScoreHolderHiResImageUri()).add("HiResImageUrl", leaderboardscore.getScoreHolderHiResImageUrl());
        Player player;
        if (leaderboardscore.getScoreHolder() == null)
        {
            player = null;
        } else
        {
            player = leaderboardscore.getScoreHolder();
        }
        return tostringhelper.add("Player", player).add("ScoreTag", leaderboardscore.getScoreTag()).toString();
    }

    public final boolean equals(Object obj)
    {
        return equals(((LeaderboardScore) (this)), obj);
    }

    public final volatile Object freeze()
    {
        return this;
    }

    public final String getDisplayRank()
    {
        return mDisplayRank;
    }

    public final String getDisplayScore()
    {
        return mDisplayScore;
    }

    public final void getDisplayScore(CharArrayBuffer chararraybuffer)
    {
        DataUtils.copyStringToBuffer(mDisplayScore, chararraybuffer);
    }

    public final long getRank()
    {
        return mRank;
    }

    public final long getRawScore()
    {
        return mRawScore;
    }

    public final Player getScoreHolder()
    {
        return mScoreHolder;
    }

    public final String getScoreHolderDisplayName()
    {
        if (mScoreHolder == null)
        {
            return mScoreHolderDisplayName;
        } else
        {
            return mScoreHolder.mDisplayName;
        }
    }

    public final void getScoreHolderDisplayName(CharArrayBuffer chararraybuffer)
    {
        if (mScoreHolder == null)
        {
            DataUtils.copyStringToBuffer(mScoreHolderDisplayName, chararraybuffer);
            return;
        } else
        {
            mScoreHolder.getDisplayName(chararraybuffer);
            return;
        }
    }

    public final Uri getScoreHolderHiResImageUri()
    {
        if (mScoreHolder == null)
        {
            return mScoreHolderHiResImageUri;
        } else
        {
            return mScoreHolder.mHiResImageUri;
        }
    }

    public final String getScoreHolderHiResImageUrl()
    {
        if (mScoreHolder == null)
        {
            return mScoreHolderHiResImageUrl;
        } else
        {
            return mScoreHolder.mHiResImageUrl;
        }
    }

    public final Uri getScoreHolderIconImageUri()
    {
        if (mScoreHolder == null)
        {
            return mScoreHolderIconImageUri;
        } else
        {
            return mScoreHolder.mIconImageUri;
        }
    }

    public final String getScoreHolderIconImageUrl()
    {
        if (mScoreHolder == null)
        {
            return mScoreHolderIconImageUrl;
        } else
        {
            return mScoreHolder.mIconImageUrl;
        }
    }

    public final String getScoreTag()
    {
        return mScoreTag;
    }

    public final long getTimestampMillis()
    {
        return mTimestampMillis;
    }

    public final int hashCode()
    {
        return hashCode(((LeaderboardScore) (this)));
    }

    public final boolean isDataValid()
    {
        return true;
    }

    public final String toString()
    {
        return toString(((LeaderboardScore) (this)));
    }
}
