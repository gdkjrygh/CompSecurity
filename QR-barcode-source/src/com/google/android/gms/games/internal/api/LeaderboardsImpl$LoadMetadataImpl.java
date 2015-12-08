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

    public com.google.android.gms.games.leaderboard.sult U(Status status)
    {
        return new com.google.android.gms.games.leaderboard.Leaderboards.LeaderboardMetadataResult(status) {

            final Status CW;
            final LeaderboardsImpl.LoadMetadataImpl YS;

            public LeaderboardBuffer getLeaderboards()
            {
                return new LeaderboardBuffer(DataHolder.as(14));
            }

            public Status getStatus()
            {
                return CW;
            }

            public void release()
            {
            }

            
            {
                YS = LeaderboardsImpl.LoadMetadataImpl.this;
                CW = status;
                super();
            }
        };
    }

    public Result c(Status status)
    {
        return U(status);
    }

    private _cls1.CW()
    {
    }

    _cls1.CW(_cls1.CW cw)
    {
        this();
    }
}
