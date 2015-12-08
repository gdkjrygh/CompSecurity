// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.api;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.games.internal.api:
//            TurnBasedMultiplayerImpl

private static abstract class CE extends com.google.android.gms.games.celMatchImpl
{

    private final String CE;

    static String a(CE ce)
    {
        return ce.CE;
    }

    public com.google.android.gms.games.multiplayer.turnbased.Q as(Status status)
    {
        return new com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer.CancelMatchResult(status) {

            final Status DS;
            final TurnBasedMultiplayerImpl.CancelMatchImpl aca;

            public String getMatchId()
            {
                return TurnBasedMultiplayerImpl.CancelMatchImpl.a(aca);
            }

            public Status getStatus()
            {
                return DS;
            }

            
            {
                aca = TurnBasedMultiplayerImpl.CancelMatchImpl.this;
                DS = status;
                super();
            }
        };
    }

    public Result c(Status status)
    {
        return as(status);
    }

    public _cls1.DS(String s, GoogleApiClient googleapiclient)
    {
        super(googleapiclient);
        CE = s;
    }
}
