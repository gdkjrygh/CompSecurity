// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.api;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.games.internal.api:
//            TurnBasedMultiplayerImpl

private static abstract class BL extends com.google.android.gms.games.celMatchImpl
{

    private final String BL;

    static String a(BL bl)
    {
        return bl.BL;
    }

    public com.google.android.gms.games.multiplayer.turnbased.q as(Status status)
    {
        return new com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer.CancelMatchResult(status) {

            final Status CW;
            final TurnBasedMultiplayerImpl.CancelMatchImpl aag;

            public String getMatchId()
            {
                return TurnBasedMultiplayerImpl.CancelMatchImpl.a(aag);
            }

            public Status getStatus()
            {
                return CW;
            }

            
            {
                aag = TurnBasedMultiplayerImpl.CancelMatchImpl.this;
                CW = status;
                super();
            }
        };
    }

    public Result c(Status status)
    {
        return as(status);
    }

    public _cls1.CW(String s)
    {
        BL = s;
    }
}
