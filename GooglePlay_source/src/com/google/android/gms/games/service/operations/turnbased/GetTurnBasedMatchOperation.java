// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.service.operations.turnbased;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.auth.GoogleAuthException;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.broker.DataBroker;
import com.google.android.gms.games.broker.GamesClientContext;
import com.google.android.gms.games.internal.IGamesCallbacks;
import com.google.android.gms.games.service.WrappedGamesCallbacks;
import com.google.android.gms.games.service.operations.AbstractDataHolderOperation;

public final class GetTurnBasedMatchOperation extends AbstractDataHolderOperation
{

    private final WrappedGamesCallbacks mCallbacks;
    private final String mExternalMatchId;
    private final GamesClientContext mGamesContext;

    public GetTurnBasedMatchOperation(GamesClientContext gamesclientcontext, WrappedGamesCallbacks wrappedgamescallbacks, String s)
    {
        super(gamesclientcontext.mClientContext);
        mGamesContext = gamesclientcontext;
        mCallbacks = wrappedgamescallbacks;
        mExternalMatchId = s;
    }

    protected final DataHolder fetchData(Context context, DataBroker databroker)
        throws GoogleAuthException
    {
        return databroker.getTurnBasedMatch(mGamesContext, mExternalMatchId);
    }

    protected final void provideResult(DataHolder dataholder)
        throws RemoteException
    {
        WrappedGamesCallbacks wrappedgamescallbacks = mCallbacks;
        wrappedgamescallbacks.audit(new DataHolder[] {
            dataholder
        });
        wrappedgamescallbacks.mCallbacks.onTurnBasedMatchLoaded(dataholder);
    }
}
