// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.api;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.GameBuffer;

// Referenced classes of package com.google.android.gms.games.internal.api:
//            GamesMetadataImpl

private static abstract class <init> extends com.google.android.gms.games.oadGamesImpl
{

    public com.google.android.gms.games.oadGamesImpl E(Status status)
    {
        return new com.google.android.gms.games.GamesMetadata.LoadGamesResult(status) {

            final GamesMetadataImpl.LoadGamesImpl PD;
            final Status yJ;

            public GameBuffer getGames()
            {
                return new GameBuffer(DataHolder.af(14));
            }

            public Status getStatus()
            {
                return yJ;
            }

            public void release()
            {
            }

            
            {
                PD = GamesMetadataImpl.LoadGamesImpl.this;
                yJ = status;
                super();
            }
        };
    }

    public Result c(Status status)
    {
        return E(status);
    }

    private _cls1.yJ()
    {
    }

    _cls1.yJ(_cls1.yJ yj)
    {
        this();
    }
}
