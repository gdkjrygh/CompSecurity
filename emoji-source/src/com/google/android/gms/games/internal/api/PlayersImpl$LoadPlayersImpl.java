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

    public com.google.android.gms.games.dPlayersImpl P(Status status)
    {
        return new com.google.android.gms.games.Players.LoadPlayersResult(status) {

            final PlayersImpl.LoadPlayersImpl Qk;
            final Status yJ;

            public PlayerBuffer getPlayers()
            {
                return new PlayerBuffer(DataHolder.af(14));
            }

            public Status getStatus()
            {
                return yJ;
            }

            public void release()
            {
            }

            
            {
                Qk = PlayersImpl.LoadPlayersImpl.this;
                yJ = status;
                super();
            }
        };
    }

    public Result c(Status status)
    {
        return P(status);
    }

    private _cls1.yJ()
    {
    }

    _cls1.yJ(_cls1.yJ yj)
    {
        this();
    }
}
