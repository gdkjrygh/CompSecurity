// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.client.games;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.games.client.PlayGamesClientImpl;

// Referenced classes of package com.google.android.gms.games.client.games:
//            GamesMetadataImpl

final class adGamesImpl extends adGamesImpl
{

    final GamesMetadataImpl this$0;
    final int val$pageSize;
    final String val$playerId;

    protected final volatile void doExecute(com.google.android.gms.common.api.aImpl._cls7 _pcls7)
        throws RemoteException
    {
        ((PlayGamesClientImpl)_pcls7).loadRecentlyPlayedGamesForPlayer(this, val$playerId, val$pageSize, true, false);
    }

    adGamesImpl(int i)
    {
        this$0 = final_gamesmetadataimpl;
        val$playerId = String.this;
        val$pageSize = i;
        super(final_googleapiclient, (byte)0);
    }
}
