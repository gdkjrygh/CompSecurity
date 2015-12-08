// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.service.operations.games;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.auth.GoogleAuthException;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.broker.DataBroker;
import com.google.android.gms.games.broker.GamesClientContext;
import com.google.android.gms.games.internal.IGamesCallbacks;
import com.google.android.gms.games.service.WrappedGamesCallbacks;
import com.google.android.gms.games.service.operations.AbstractDataHolderOperation;

public final class LoadGameOperation extends AbstractDataHolderOperation
{

    private final WrappedGamesCallbacks mCallbacks;
    private final GamesClientContext mGamesContext;
    private final boolean mLoadExtendedGame = false;

    public LoadGameOperation(GamesClientContext gamesclientcontext, WrappedGamesCallbacks wrappedgamescallbacks, boolean flag)
    {
        super(gamesclientcontext.mClientContext);
        mCallbacks = wrappedgamescallbacks;
        mGamesContext = gamesclientcontext;
    }

    protected final DataHolder fetchData(Context context, DataBroker databroker)
        throws GoogleAuthException
    {
        if (mLoadExtendedGame)
        {
            return databroker.getExtendedGame(mGamesContext);
        } else
        {
            return databroker.getGame(mGamesContext, null);
        }
    }

    protected final void provideResult(DataHolder dataholder)
        throws RemoteException
    {
        if (mLoadExtendedGame)
        {
            WrappedGamesCallbacks wrappedgamescallbacks = mCallbacks;
            wrappedgamescallbacks.audit(new DataHolder[] {
                dataholder
            });
            wrappedgamescallbacks.mCallbacks.onExtendedGamesLoaded(dataholder);
            return;
        } else
        {
            WrappedGamesCallbacks wrappedgamescallbacks1 = mCallbacks;
            wrappedgamescallbacks1.audit(new DataHolder[] {
                dataholder
            });
            wrappedgamescallbacks1.mCallbacks.onGamesLoaded(dataholder);
            return;
        }
    }
}
