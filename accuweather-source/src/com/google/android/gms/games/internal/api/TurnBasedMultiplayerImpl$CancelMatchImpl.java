// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.api;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.games.internal.api:
//            TurnBasedMultiplayerImpl

private static abstract class xD extends com.google.android.gms.games.celMatchImpl
{

    private final String xD;

    static String a(xD xd)
    {
        return xd.xD;
    }

    public com.google.android.gms.games.multiplayer.turnbased.q ad(Status status)
    {
        return new com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer.CancelMatchResult(status) {

            final TurnBasedMultiplayerImpl.CancelMatchImpl QZ;
            final Status yG;

            public String getMatchId()
            {
                return TurnBasedMultiplayerImpl.CancelMatchImpl.a(QZ);
            }

            public Status getStatus()
            {
                return yG;
            }

            
            {
                QZ = TurnBasedMultiplayerImpl.CancelMatchImpl.this;
                yG = status;
                super();
            }
        };
    }

    public Result c(Status status)
    {
        return ad(status);
    }

    public _cls1.yG(String s)
    {
        xD = s;
    }
}
