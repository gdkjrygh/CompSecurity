// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.api;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.leaderboard.ScoreSubmissionData;

// Referenced classes of package com.google.android.gms.games.internal.api:
//            LeaderboardsImpl

protected static abstract class _cls1.DS extends com.google.android.gms.games.mitScoreImpl
{

    public com.google.android.gms.games.leaderboard. X(Status status)
    {
        return new com.google.android.gms.games.leaderboard.Leaderboards.SubmitScoreResult(status) {

            final Status DS;
            final LeaderboardsImpl.SubmitScoreImpl aaQ;

            public ScoreSubmissionData getScoreData()
            {
                return new ScoreSubmissionData(DataHolder.av(14));
            }

            public Status getStatus()
            {
                return DS;
            }

            public void release()
            {
            }

            
            {
                aaQ = LeaderboardsImpl.SubmitScoreImpl.this;
                DS = status;
                super();
            }
        };
    }

    public Result c(Status status)
    {
        return X(status);
    }

    protected _cls1.DS(GoogleApiClient googleapiclient)
    {
        super(googleapiclient);
    }
}
