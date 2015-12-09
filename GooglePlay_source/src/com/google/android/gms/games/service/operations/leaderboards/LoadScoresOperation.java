// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.service.operations.leaderboards;

import android.os.RemoteException;
import com.google.android.gms.auth.GoogleAuthException;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.games.broker.DataBroker;
import com.google.android.gms.games.broker.GamesClientContext;
import com.google.android.gms.games.service.WrappedGamesCallbacks;
import com.google.android.gms.games.service.operations.AbstractMultiDataHolderOperation;

public final class LoadScoresOperation extends AbstractMultiDataHolderOperation
{

    private final WrappedGamesCallbacks mCallbacks;
    private final String mExternalLeaderboardId;
    private final GamesClientContext mGamesContext;
    private final int mLeaderboardCollection;
    private final int mMaxResults;
    private final int mPageType;
    private final int mSpan;

    public LoadScoresOperation(GamesClientContext gamesclientcontext, WrappedGamesCallbacks wrappedgamescallbacks, String s, int i, int j, int k, int l)
    {
        super(gamesclientcontext.mClientContext, 2);
        mCallbacks = wrappedgamescallbacks;
        mGamesContext = gamesclientcontext;
        mExternalLeaderboardId = s;
        mSpan = i;
        mLeaderboardCollection = j;
        mMaxResults = k;
        mPageType = l;
    }

    protected final DataHolder fetchData$b7c4c52(DataBroker databroker, int i)
        throws GoogleAuthException
    {
        if (i == 0)
        {
            if (mPageType == 1)
            {
                return databroker.getPlayerCenteredPage(mGamesContext, mExternalLeaderboardId, mSpan, mLeaderboardCollection, mMaxResults);
            }
            if (mPageType == 0)
            {
                return databroker.getTopScoresPage(mGamesContext, mExternalLeaderboardId, mSpan, mLeaderboardCollection, mMaxResults);
            } else
            {
                throw new IllegalStateException((new StringBuilder("Unknown page type ")).append(mPageType).toString());
            }
        }
        if (i == 1)
        {
            return databroker.getLeaderboard(mGamesContext, mExternalLeaderboardId, true);
        } else
        {
            throw new IllegalArgumentException("Incorrect number of data holders requested!");
        }
    }

    protected final void provideResults(DataHolder adataholder[])
        throws RemoteException
    {
        boolean flag;
        if (adataholder.length == 2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Asserts.checkState(flag);
        mCallbacks.onLeaderboardScoresLoaded(adataholder[1], adataholder[0]);
    }
}
