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

    public com.google.android.gms.games.dPlayersImpl ad(Status status)
    {
        return new com.google.android.gms.games.Players.LoadPlayersResult(status) {

            final Status CW;
            final PlayersImpl.LoadPlayersImpl Zm;

            public PlayerBuffer getPlayers()
            {
                return new PlayerBuffer(DataHolder.as(14));
            }

            public Status getStatus()
            {
                return CW;
            }

            public void release()
            {
            }

            
            {
                Zm = PlayersImpl.LoadPlayersImpl.this;
                CW = status;
                super();
            }
        };
    }

    public Result c(Status status)
    {
        return ad(status);
    }

    private _cls1.CW()
    {
    }

    _cls1.CW(_cls1.CW cw)
    {
        this();
    }
}
