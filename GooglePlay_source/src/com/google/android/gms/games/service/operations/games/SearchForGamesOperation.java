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
import com.google.android.gms.games.client.IPlayGamesCallbacks;
import com.google.android.gms.games.service.operations.AbstractDataHolderOperation;

public final class SearchForGamesOperation extends AbstractDataHolderOperation
{

    private final IPlayGamesCallbacks mCallbacks;
    private final boolean mExpandCachedData;
    private final GamesClientContext mGamesContext;
    private final int mPageSize;
    private final String mQuery;

    public SearchForGamesOperation(GamesClientContext gamesclientcontext, IPlayGamesCallbacks iplaygamescallbacks, String s, int i, boolean flag)
    {
        super(gamesclientcontext.mClientContext);
        mCallbacks = iplaygamescallbacks;
        mQuery = s;
        mPageSize = i;
        mExpandCachedData = flag;
        mGamesContext = gamesclientcontext;
    }

    protected final DataHolder fetchData(Context context, DataBroker databroker)
        throws GoogleAuthException
    {
        return databroker.searchForGames(mGamesContext, mQuery, mPageSize, mExpandCachedData);
    }

    protected final void provideResult(DataHolder dataholder)
        throws RemoteException
    {
        mCallbacks.onGamesLoaded(dataholder);
    }
}
