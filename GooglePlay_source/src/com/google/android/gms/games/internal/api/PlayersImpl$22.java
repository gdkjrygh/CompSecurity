// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.api;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.games.internal.GamesClientImpl;

// Referenced classes of package com.google.android.gms.games.internal.api:
//            PlayersImpl

final class dPlayersImpl extends dPlayersImpl
{

    final PlayersImpl this$0;
    final String val$collection;
    final String val$externalGameId;
    final int val$pageSize;

    protected final volatile void doExecute(com.google.android.gms.common.api.Impl._cls22 _pcls22)
        throws RemoteException
    {
        ((GamesClientImpl)_pcls22).loadPlayersFirstParty(this, val$collection, val$externalGameId, val$pageSize, true, false);
    }

    dPlayersImpl(int i)
    {
        this$0 = final_playersimpl;
        val$collection = s;
        val$externalGameId = String.this;
        val$pageSize = i;
        super(final_googleapiclient, (byte)0);
    }
}
