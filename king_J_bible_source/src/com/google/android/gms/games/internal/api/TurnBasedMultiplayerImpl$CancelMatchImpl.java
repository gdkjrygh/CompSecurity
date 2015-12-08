// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.api;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.games.internal.api:
//            TurnBasedMultiplayerImpl

private static abstract class wp extends com.google.android.gms.games.celMatchImpl
{

    private final String wp;

    static String a(wp wp1)
    {
        return wp1.wp;
    }

    public com.google.android.gms.games.multiplayer.turnbased.q R(Status status)
    {
        return new com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer.CancelMatchResult(status) {

            final TurnBasedMultiplayerImpl.CancelMatchImpl Lj;
            final Status wz;

            public String getMatchId()
            {
                return TurnBasedMultiplayerImpl.CancelMatchImpl.a(Lj);
            }

            public Status getStatus()
            {
                return wz;
            }

            
            {
                Lj = TurnBasedMultiplayerImpl.CancelMatchImpl.this;
                wz = status;
                super();
            }
        };
    }

    public Result d(Status status)
    {
        return R(status);
    }

    public _cls1.wz(String s)
    {
        wp = s;
    }
}
