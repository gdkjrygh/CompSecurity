// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.service.operations.appcontent;

import android.os.RemoteException;
import com.google.android.gms.auth.GoogleAuthException;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.games.broker.AppContentContext;
import com.google.android.gms.games.broker.DataBroker;
import com.google.android.gms.games.broker.GamesClientContext;
import com.google.android.gms.games.internal.IGamesCallbacks;
import com.google.android.gms.games.service.WrappedGamesCallbacks;
import com.google.android.gms.games.service.operations.AbstractMultiDataHolderOperation;

public final class LoadAppContentOperation extends AbstractMultiDataHolderOperation
{

    private final AppContentContext mAppContentContext;
    private DataHolder mAppContentData[];
    private final WrappedGamesCallbacks mCallbacks;
    private final GamesClientContext mGamesContext;

    public LoadAppContentOperation(GamesClientContext gamesclientcontext, WrappedGamesCallbacks wrappedgamescallbacks, AppContentContext appcontentcontext)
    {
        super(gamesclientcontext.mClientContext, 6);
        mGamesContext = gamesclientcontext;
        mCallbacks = wrappedgamescallbacks;
        mAppContentContext = appcontentcontext;
    }

    protected final DataHolder fetchData$b7c4c52(DataBroker databroker, int i)
        throws GoogleAuthException
    {
        boolean flag;
        if (i < 6)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "Index exceeds maximum value");
        if (mAppContentData == null)
        {
            mAppContentData = databroker.loadCardStream(mGamesContext, mAppContentContext);
        }
        return mAppContentData[i];
    }

    protected final void provideResults(DataHolder adataholder[])
        throws RemoteException
    {
        WrappedGamesCallbacks wrappedgamescallbacks;
        boolean flag;
        if (adataholder.length == 6)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag, "Length should always be 6");
        wrappedgamescallbacks = mCallbacks;
        wrappedgamescallbacks.audit(adataholder);
        wrappedgamescallbacks.mCallbacks.onLoadAppContent(adataholder);
    }
}
