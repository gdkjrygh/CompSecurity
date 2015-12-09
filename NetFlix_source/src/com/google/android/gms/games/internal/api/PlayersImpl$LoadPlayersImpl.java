// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.api;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.PlayerBuffer;

// Referenced classes of package com.google.android.gms.games.internal.api:
//            PlayersImpl

private static abstract class <init> extends com.google.android.gms.games.
{

    public com.google.android.gms.games.dPlayersImpl M(Status status)
    {
        return new com.google.android.gms.games.Players.LoadPlayersResult(status) {

            final PlayersImpl.LoadPlayersImpl KN;
            final Status wz;

            public PlayerBuffer getPlayers()
            {
                return new PlayerBuffer(DataHolder.empty(14));
            }

            public Status getStatus()
            {
                return wz;
            }

            public void release()
            {
            }

            
            {
                KN = PlayersImpl.LoadPlayersImpl.this;
                wz = status;
                super();
            }
        };
    }

    public Result d(Status status)
    {
        return M(status);
    }

    private _cls1.wz()
    {
    }

    _cls1.wz(_cls1.wz wz)
    {
        this();
    }
}
