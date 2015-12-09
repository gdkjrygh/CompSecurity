// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.leaderboard;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.games.internal.constants.LeaderboardCollection;
import com.google.android.gms.games.internal.constants.TimeSpan;

public final class LeaderboardScoreBufferHeader
{
    public static final class Builder
    {

        String mExternalGameId;
        String mExternalLeaderboardId;
        int mLeaderboardCollection;
        int mPageType;
        int mTimeSpan;

        public final LeaderboardScoreBufferHeader build()
        {
            return new LeaderboardScoreBufferHeader(this, (byte)0);
        }

        public final Builder withGameId(String s)
        {
            mExternalGameId = (String)Preconditions.checkNotNull(s);
            return this;
        }

        public final Builder withLeaderboardCollection(int i)
        {
            Preconditions.checkState(LeaderboardCollection.isValid(i));
            mLeaderboardCollection = i;
            return this;
        }

        public final Builder withLeaderboardId(String s)
        {
            mExternalLeaderboardId = (String)Preconditions.checkNotNull(s);
            return this;
        }

        public final Builder withPageType(int i)
        {
            boolean flag1 = true;
            boolean flag = flag1;
            if (i != 0)
            {
                if (i == 1)
                {
                    flag = flag1;
                } else
                {
                    flag = false;
                }
            }
            Preconditions.checkState(flag);
            mPageType = i;
            return this;
        }

        public final Builder withTimeSpan(int i)
        {
            Preconditions.checkState(TimeSpan.isValidTimeSpan(i));
            mTimeSpan = i;
            return this;
        }

        private Builder()
        {
        }

        Builder(byte byte0)
        {
            this();
        }
    }


    public final Bundle mBundle;

    public LeaderboardScoreBufferHeader(Bundle bundle)
    {
        Bundle bundle1 = bundle;
        if (bundle == null)
        {
            bundle1 = new Bundle();
        }
        mBundle = bundle1;
    }

    private LeaderboardScoreBufferHeader(Builder builder1)
    {
        mBundle = new Bundle();
        mBundle.putString("external_game_id", builder1.mExternalGameId);
        mBundle.putString("external_leaderboard_id", builder1.mExternalLeaderboardId);
        mBundle.putInt("time_span", builder1.mTimeSpan);
        mBundle.putInt("leaderboard_collection", builder1.mLeaderboardCollection);
        mBundle.putInt("page_type", builder1.mPageType);
        mBundle.putString("next_page_token", null);
        mBundle.putString("prev_page_token", null);
    }

    LeaderboardScoreBufferHeader(Builder builder1, byte byte0)
    {
        this(builder1);
    }

    public static Builder builder()
    {
        return new Builder((byte)0);
    }

    public final String getExternalLeaderboardId()
    {
        return mBundle.getString("external_leaderboard_id");
    }
}
