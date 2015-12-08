// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.api;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.leaderboard.Leaderboard;
import com.google.android.gms.games.leaderboard.LeaderboardScoreBuffer;

// Referenced classes of package com.google.android.gms.games.internal.api:
//            LeaderboardsImpl

private static abstract class <init> extends com.google.android.gms.games.adScoresImpl
{

    public com.google.android.gms.games.leaderboard. I(Status status)
    {
        return new com.google.android.gms.games.leaderboard.Leaderboards.LoadScoresResult(status) {

            final LeaderboardsImpl.LoadScoresImpl PQ;
            final Status yG;

            public Leaderboard getLeaderboard()
            {
                return null;
            }

            public LeaderboardScoreBuffer getScores()
            {
                return new LeaderboardScoreBuffer(DataHolder.af(14));
            }

            public Status getStatus()
            {
                return yG;
            }

            public void release()
            {
            }

            
            {
                PQ = LeaderboardsImpl.LoadScoresImpl.this;
                yG = status;
                super();
            }
        };
    }

    public Result c(Status status)
    {
        return I(status);
    }

    private _cls1.yG()
    {
    }

    _cls1.yG(_cls1.yG yg)
    {
        this();
    }
}
