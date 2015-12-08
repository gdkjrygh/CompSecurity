// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.client.games;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.games.client.PlayGamesClientImpl;

// Referenced classes of package com.google.android.gms.games.client.games:
//            GamesMetadataImpl

final class dGamesImpl extends dGamesImpl
{

    final GamesMetadataImpl this$0;
    final int val$pageSize;
    final String val$query;

    protected final volatile void doExecute(com.google.android.gms.common.api.Impl._cls13 _pcls13)
        throws RemoteException
    {
        ((PlayGamesClientImpl)_pcls13).searchForGames(this, val$query, val$pageSize, true, false);
    }

    dGamesImpl(int i)
    {
        this$0 = final_gamesmetadataimpl;
        val$query = String.this;
        val$pageSize = i;
        super(final_googleapiclient, (byte)0);
    }
}
