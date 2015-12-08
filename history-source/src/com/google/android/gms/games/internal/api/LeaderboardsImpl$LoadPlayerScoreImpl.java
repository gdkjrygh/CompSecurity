// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.api;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.games.leaderboard.LeaderboardScore;

// Referenced classes of package com.google.android.gms.games.internal.api:
//            LeaderboardsImpl

private static abstract class <init> extends com.google.android.gms.games.yerScoreImpl
{

    public com.google.android.gms.games.leaderboard. V(Status status)
    {
        return new com.google.android.gms.games.leaderboard.Leaderboards.LoadPlayerScoreResult(status) {

            final Status DS;
            final LeaderboardsImpl.LoadPlayerScoreImpl aaO;

            public LeaderboardScore getScore()
            {
                return null;
            }

            public Status getStatus()
            {
                return DS;
            }

            
            {
                aaO = LeaderboardsImpl.LoadPlayerScoreImpl.this;
                DS = status;
                super();
            }
        };
    }

    public Result c(Status status)
    {
        return V(status);
    }

    private _cls1.DS(GoogleApiClient googleapiclient)
    {
        super(googleapiclient);
    }

    _cls1.DS(GoogleApiClient googleapiclient, _cls1.DS ds)
    {
        this(googleapiclient);
    }
}
