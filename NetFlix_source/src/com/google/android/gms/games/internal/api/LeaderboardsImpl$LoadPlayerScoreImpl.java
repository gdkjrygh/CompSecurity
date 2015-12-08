// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.api;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.games.leaderboard.LeaderboardScore;

// Referenced classes of package com.google.android.gms.games.internal.api:
//            LeaderboardsImpl

private static abstract class <init> extends com.google.android.gms.games.yerScoreImpl
{

    public com.google.android.gms.games.leaderboard. E(Status status)
    {
        return new com.google.android.gms.games.leaderboard.Leaderboards.LoadPlayerScoreResult(status) {

            final LeaderboardsImpl.LoadPlayerScoreImpl Ky;
            final Status wz;

            public LeaderboardScore getScore()
            {
                return null;
            }

            public Status getStatus()
            {
                return wz;
            }

            
            {
                Ky = LeaderboardsImpl.LoadPlayerScoreImpl.this;
                wz = status;
                super();
            }
        };
    }

    public Result d(Status status)
    {
        return E(status);
    }

    private _cls1.wz()
    {
    }

    _cls1.wz(_cls1.wz wz)
    {
        this();
    }
}
