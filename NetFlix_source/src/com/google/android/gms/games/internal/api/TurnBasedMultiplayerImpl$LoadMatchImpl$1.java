// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.api;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatch;

// Referenced classes of package com.google.android.gms.games.internal.api:
//            TurnBasedMultiplayerImpl

class wz
    implements com.google.android.gms.games.multiplayer.turnbased.Y
{

    final wz Lm;
    final Status wz;

    public TurnBasedMatch getMatch()
    {
        return null;
    }

    public Status getStatus()
    {
        return wz;
    }

    sult(sult sult, Status status)
    {
        Lm = sult;
        wz = status;
        super();
    }
}
