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
    final int val$collection;
    final int val$pageSize;

    protected final volatile void doExecute(com.google.android.gms.common.api.aImpl._cls3 _pcls3)
        throws RemoteException
    {
        ((PlayGamesClientImpl)_pcls3).loadGameCollection(this, val$pageSize, val$collection, true, false);
    }

    adGamesImpl(int j)
    {
        this$0 = final_gamesmetadataimpl;
        val$pageSize = I.this;
        val$collection = j;
        super(final_googleapiclient, (byte)0);
    }
}
