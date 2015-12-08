// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.client.games;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;

// Referenced classes of package com.google.android.gms.games.client.games:
//            GamesMetadataImpl, GameFirstPartyBuffer

private static abstract class <init> extends com.google.android.gms.games.client.Impl
{

    public final volatile Result createFailedResult(final Status status)
    {
        return new GamesMetadata.LoadGamesResult() {

            final GamesMetadataImpl.LoadGamesImpl this$0;
            final Status val$status;

            public final GameFirstPartyBuffer getGames()
            {
                return new GameFirstPartyBuffer(DataHolder.empty(14));
            }

            public final Status getStatus()
            {
                return status;
            }

            public final void release()
            {
            }

            
            {
                this$0 = GamesMetadataImpl.LoadGamesImpl.this;
                status = status1;
                super();
            }
        };
    }

    private _cls1.val.status(GoogleApiClient googleapiclient)
    {
        super(googleapiclient);
    }

    init>(GoogleApiClient googleapiclient, byte byte0)
    {
        this(googleapiclient);
    }
}
