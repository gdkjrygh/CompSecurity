// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.api;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.leaderboard.LeaderboardBuffer;

// Referenced classes of package com.google.android.gms.games.internal.api:
//            LeaderboardsImpl

private static abstract class <init> extends com.google.android.gms.games.MetadataImpl
{

    public com.google.android.gms.games.leaderboard.sult G(Status status)
    {
        return new com.google.android.gms.games.leaderboard.Leaderboards.LeaderboardMetadataResult(status) {

            final LeaderboardsImpl.LoadMetadataImpl PR;
            final Status yJ;

            public LeaderboardBuffer getLeaderboards()
            {
                return new LeaderboardBuffer(DataHolder.af(14));
            }

            public Status getStatus()
            {
                return yJ;
            }

            public void release()
            {
            }

            
            {
                PR = LeaderboardsImpl.LoadMetadataImpl.this;
                yJ = status;
                super();
            }
        };
    }

    public Result c(Status status)
    {
        return G(status);
    }

    private _cls1.yJ()
    {
    }

    _cls1.yJ(_cls1.yJ yj)
    {
        this();
    }
}
