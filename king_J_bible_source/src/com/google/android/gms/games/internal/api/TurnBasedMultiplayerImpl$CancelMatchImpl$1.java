// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.api;

import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.games.internal.api:
//            TurnBasedMultiplayerImpl

class wz
    implements com.google.android.gms.games.multiplayer.turnbased.
{

    final wz Lj;
    final Status wz;

    public String getMatchId()
    {
        return sult(Lj);
    }

    public Status getStatus()
    {
        return wz;
    }

    sult(sult sult, Status status)
    {
        Lj = sult;
        wz = status;
        super();
    }
}
