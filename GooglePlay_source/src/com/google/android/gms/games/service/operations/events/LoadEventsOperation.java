// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.service.operations.events;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.auth.GoogleAuthException;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.broker.DataBroker;
import com.google.android.gms.games.broker.GamesClientContext;
import com.google.android.gms.games.service.WrappedGamesCallbacks;
import com.google.android.gms.games.service.operations.AbstractDataHolderOperation;

public final class LoadEventsOperation extends AbstractDataHolderOperation
{

    private final WrappedGamesCallbacks mCallbacks;
    private final GamesClientContext mGamesContext;

    public LoadEventsOperation(GamesClientContext gamesclientcontext, WrappedGamesCallbacks wrappedgamescallbacks)
    {
        super(gamesclientcontext.mClientContext);
        mGamesContext = gamesclientcontext;
        mCallbacks = wrappedgamescallbacks;
    }

    protected final DataHolder fetchData(Context context, DataBroker databroker)
        throws GoogleAuthException
    {
        return databroker.getEvents(mGamesContext);
    }

    protected final void provideResult(DataHolder dataholder)
        throws RemoteException
    {
        mCallbacks.onEventsLoaded(dataholder);
    }
}
