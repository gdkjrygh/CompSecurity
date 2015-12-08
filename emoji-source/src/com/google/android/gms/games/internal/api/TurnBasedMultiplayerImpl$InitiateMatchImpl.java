// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.api;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatch;

// Referenced classes of package com.google.android.gms.games.internal.api:
//            TurnBasedMultiplayerImpl

private static abstract class <init> extends com.google.android.gms.games.ateMatchImpl
{

    public com.google.android.gms.games.multiplayer.turnbased. ae(Status status)
    {
        return new com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer.InitiateMatchResult(status) {

            final TurnBasedMultiplayerImpl.InitiateMatchImpl Rd;
            final Status yJ;

            public TurnBasedMatch getMatch()
            {
                return null;
            }

            public Status getStatus()
            {
                return yJ;
            }

            
            {
                Rd = TurnBasedMultiplayerImpl.InitiateMatchImpl.this;
                yJ = status;
                super();
            }
        };
    }

    public Result c(Status status)
    {
        return ae(status);
    }

    private _cls1.yJ()
    {
    }

    _cls1.yJ(_cls1.yJ yj)
    {
        this();
    }
}
