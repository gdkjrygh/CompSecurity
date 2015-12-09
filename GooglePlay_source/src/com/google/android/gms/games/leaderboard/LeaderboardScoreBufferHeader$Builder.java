// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.leaderboard;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.games.internal.constants.LeaderboardCollection;
import com.google.android.gms.games.internal.constants.TimeSpan;

// Referenced classes of package com.google.android.gms.games.leaderboard:
//            LeaderboardScoreBufferHeader

public static final class <init>
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

    public final <init> withGameId(String s)
    {
        mExternalGameId = (String)Preconditions.checkNotNull(s);
        return this;
    }

    public final mExternalGameId withLeaderboardCollection(int i)
    {
        Preconditions.checkState(LeaderboardCollection.isValid(i));
        mLeaderboardCollection = i;
        return this;
    }

    public final mLeaderboardCollection withLeaderboardId(String s)
    {
        mExternalLeaderboardId = (String)Preconditions.checkNotNull(s);
        return this;
    }

    public final mExternalLeaderboardId withPageType(int i)
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

    public final mPageType withTimeSpan(int i)
    {
        Preconditions.checkState(TimeSpan.isValidTimeSpan(i));
        mTimeSpan = i;
        return this;
    }

    private ()
    {
    }

    (byte byte0)
    {
        this();
    }
}
