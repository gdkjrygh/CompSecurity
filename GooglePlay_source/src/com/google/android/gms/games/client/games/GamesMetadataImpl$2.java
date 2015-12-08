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
    final boolean val$forceReload;
    final int val$pageSize;

    protected final volatile void doExecute(com.google.android.gms.common.api.aImpl._cls2 _pcls2)
        throws RemoteException
    {
        ((PlayGamesClientImpl)_pcls2).loadGameCollection(this, val$pageSize, val$collection, false, val$forceReload);
    }

    adGamesImpl(boolean flag)
    {
        this$0 = final_gamesmetadataimpl;
        val$pageSize = i;
        val$collection = I.this;
        val$forceReload = flag;
        super(final_googleapiclient, (byte)0);
    }
}
