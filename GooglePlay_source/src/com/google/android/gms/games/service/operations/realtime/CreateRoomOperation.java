// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.service.operations.realtime;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.auth.GoogleAuthException;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.broker.DataBroker;
import com.google.android.gms.games.broker.GamesClientContext;
import com.google.android.gms.games.internal.ConnectionInfo;
import com.google.android.gms.games.service.operations.AbstractDataHolderOperation;

public final class CreateRoomOperation extends AbstractDataHolderOperation
{

    private final Bundle mAutoMatchCriteria;
    private final com.google.android.gms.games.service.PlayGamesAsyncService.RoomEnteredCallback mCallback;
    private final ConnectionInfo mConnectionInfo;
    private final GamesClientContext mGamesContext;
    private final String mInvitedPlayerIds[];
    private final int mVariant;

    public CreateRoomOperation(GamesClientContext gamesclientcontext, com.google.android.gms.games.service.PlayGamesAsyncService.RoomEnteredCallback roomenteredcallback, int i, String as[], Bundle bundle, ConnectionInfo connectioninfo)
    {
        super(gamesclientcontext.mClientContext, false);
        mCallback = roomenteredcallback;
        mGamesContext = gamesclientcontext;
        mVariant = i;
        mInvitedPlayerIds = as;
        mAutoMatchCriteria = bundle;
        mConnectionInfo = connectioninfo;
    }

    protected final DataHolder fetchData(Context context, DataBroker databroker)
        throws GoogleAuthException
    {
        return databroker.createRoom(mGamesContext, mVariant, mInvitedPlayerIds, mAutoMatchCriteria, mConnectionInfo);
    }

    protected final void provideResult(DataHolder dataholder)
        throws RemoteException
    {
        mCallback.onEnteredRoom(dataholder);
    }
}
