// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.api;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.GameBuffer;

// Referenced classes of package com.google.android.gms.games.internal.api:
//            GamesMetadataImpl

class yJ
    implements com.google.android.gms.games.dGamesImpl._cls1
{

    final yJ PD;
    final Status yJ;

    public GameBuffer getGames()
    {
        return new GameBuffer(DataHolder.af(14));
    }

    public Status getStatus()
    {
        return yJ;
    }

    public void release()
    {
    }

    Q(Q q, Status status)
    {
        PD = q;
        yJ = status;
        super();
    }
}
