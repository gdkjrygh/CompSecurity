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

    public com.google.android.gms.games.leaderboard.sult D(Status status)
    {
        return new com.google.android.gms.games.leaderboard.Leaderboards.LeaderboardMetadataResult(status) {

            final LeaderboardsImpl.LoadMetadataImpl Kx;
            final Status wz;

            public LeaderboardBuffer getLeaderboards()
            {
                return new LeaderboardBuffer(DataHolder.empty(14));
            }

            public Status getStatus()
            {
                return wz;
            }

            public void release()
            {
            }

            
            {
                Kx = LeaderboardsImpl.LoadMetadataImpl.this;
                wz = status;
                super();
            }
        };
    }

    public Result d(Status status)
    {
        return D(status);
    }

    private _cls1.wz()
    {
    }

    _cls1.wz(_cls1.wz wz)
    {
        this();
    }
}
