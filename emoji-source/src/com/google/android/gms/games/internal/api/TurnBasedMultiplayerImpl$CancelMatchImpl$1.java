// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.api;

import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.games.internal.api:
//            TurnBasedMultiplayerImpl

class yJ
    implements com.google.android.gms.games.multiplayer.turnbased.
{

    final yJ Rc;
    final Status yJ;

    public String getMatchId()
    {
        return sult(Rc);
    }

    public Status getStatus()
    {
        return yJ;
    }

    sult(sult sult, Status status)
    {
        Rc = sult;
        yJ = status;
        super();
    }
}
