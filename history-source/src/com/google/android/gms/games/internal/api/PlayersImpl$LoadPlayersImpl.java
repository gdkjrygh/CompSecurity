// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.api;

import com.google.android.gms.common.api.GoogleApiClient;
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

            final Status DS;
            final PlayersImpl.LoadPlayersImpl abg;

            public PlayerBuffer getPlayers()
            {
                return new PlayerBuffer(DataHolder.av(14));
            }

            public Status getStatus()
            {
                return DS;
            }

            public void release()
            {
            }

            
            {
                abg = PlayersImpl.LoadPlayersImpl.this;
                DS = status;
                super();
            }
        };
    }

    public Result c(Status status)
    {
        return ad(status);
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
