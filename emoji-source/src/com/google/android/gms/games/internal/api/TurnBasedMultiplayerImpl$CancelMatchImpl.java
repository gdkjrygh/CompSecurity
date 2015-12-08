// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.api;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.games.internal.api:
//            TurnBasedMultiplayerImpl

private static abstract class xG extends com.google.android.gms.games.celMatchImpl
{

    private final String xG;

    static String a(xG xg)
    {
        return xg.xG;
    }

    public com.google.android.gms.games.multiplayer.turnbased.q ad(Status status)
    {
        return new com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer.CancelMatchResult(status) {

            final TurnBasedMultiplayerImpl.CancelMatchImpl Rc;
            final Status yJ;

            public String getMatchId()
            {
                return TurnBasedMultiplayerImpl.CancelMatchImpl.a(Rc);
            }

            public Status getStatus()
            {
                return yJ;
            }

            
            {
                Rc = TurnBasedMultiplayerImpl.CancelMatchImpl.this;
                yJ = status;
                super();
            }
        };
    }

    public Result c(Status status)
    {
        return ad(status);
    }

    public _cls1.yJ(String s)
    {
        xG = s;
    }
}
