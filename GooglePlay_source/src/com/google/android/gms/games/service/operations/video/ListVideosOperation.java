// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.service.operations.video;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.broker.DataBroker;
import com.google.android.gms.games.broker.GamesClientContext;
import com.google.android.gms.games.client.IPlayGamesCallbacks;
import com.google.android.gms.games.internal.IGamesCallbacks;
import com.google.android.gms.games.service.WrappedGamesCallbacks;
import com.google.android.gms.games.service.operations.AbstractDataHolderOperation;

public final class ListVideosOperation extends AbstractDataHolderOperation
{

    private final IPlayGamesCallbacks mCallbacksFirstParty;
    private final WrappedGamesCallbacks mCallbacksThirdParty;
    private final GamesClientContext mGamesContext;

    public ListVideosOperation(GamesClientContext gamesclientcontext, IPlayGamesCallbacks iplaygamescallbacks)
    {
        super(gamesclientcontext.mClientContext);
        mGamesContext = gamesclientcontext;
        mCallbacksFirstParty = iplaygamescallbacks;
        mCallbacksThirdParty = null;
    }

    public ListVideosOperation(GamesClientContext gamesclientcontext, WrappedGamesCallbacks wrappedgamescallbacks)
    {
        super(gamesclientcontext.mClientContext);
        mGamesContext = gamesclientcontext;
        mCallbacksFirstParty = null;
        mCallbacksThirdParty = wrappedgamescallbacks;
    }

    protected final DataHolder fetchData(Context context, DataBroker databroker)
    {
        return databroker.listVideos(mGamesContext);
    }

    protected final void provideResult(DataHolder dataholder)
        throws RemoteException
    {
        if (mCallbacksFirstParty == null)
        {
            WrappedGamesCallbacks wrappedgamescallbacks = mCallbacksThirdParty;
            wrappedgamescallbacks.audit(new DataHolder[] {
                dataholder
            });
            wrappedgamescallbacks.mCallbacks.onVideosLoaded(dataholder);
            return;
        } else
        {
            mCallbacksFirstParty.onVideosLoaded(dataholder);
            return;
        }
    }
}
