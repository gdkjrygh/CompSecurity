// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.api;

import android.os.Bundle;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.games.multiplayer.turnbased.LoadMatchesResponse;

// Referenced classes of package com.google.android.gms.games.internal.api:
//            TurnBasedMultiplayerImpl

private static abstract class <init> extends com.google.android.gms.games.dMatchesImpl
{

    public com.google.android.gms.games.multiplayer.turnbased.Q ah(Status status)
    {
        return new com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer.LoadMatchesResult(status) {

            final TurnBasedMultiplayerImpl.LoadMatchesImpl Rg;
            final Status yJ;

            public LoadMatchesResponse getMatches()
            {
                return new LoadMatchesResponse(new Bundle());
            }

            public Status getStatus()
            {
                return yJ;
            }

            public void release()
            {
            }

            
            {
                Rg = TurnBasedMultiplayerImpl.LoadMatchesImpl.this;
                yJ = status;
                super();
            }
        };
    }

    public Result c(Status status)
    {
        return ah(status);
    }

    private _cls1.yJ()
    {
    }

    _cls1.yJ(_cls1.yJ yj)
    {
        this();
    }
}
