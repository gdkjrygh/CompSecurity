// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.api;

import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.games.internal.api:
//            TurnBasedMultiplayerImpl

class yG
    implements com.google.android.gms.games.multiplayer.turnbased.
{

    final yG QZ;
    final Status yG;

    public String getMatchId()
    {
        return sult(QZ);
    }

    public Status getStatus()
    {
        return yG;
    }

    sult(sult sult, Status status)
    {
        QZ = sult;
        yG = status;
        super();
    }
}
