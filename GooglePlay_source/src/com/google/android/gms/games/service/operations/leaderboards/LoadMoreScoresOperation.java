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
import com.google.android.gms.games.leaderboard.LeaderboardScoreBufferHeader;
import com.google.android.gms.games.service.WrappedGamesCallbacks;
import com.google.android.gms.games.service.operations.AbstractMultiDataHolderOperation;

public final class LoadMoreScoresOperation extends AbstractMultiDataHolderOperation
{

    private final WrappedGamesCallbacks mCallbacks;
    private final GamesClientContext mGamesContext;
    private final int mMaxResults;
    private final int mPageDirection;
    private final LeaderboardScoreBufferHeader mPreviousHeader;

    public LoadMoreScoresOperation(GamesClientContext gamesclientcontext, WrappedGamesCallbacks wrappedgamescallbacks, LeaderboardScoreBufferHeader leaderboardscorebufferheader, int i, int j)
    {
        super(gamesclientcontext.mClientContext, 2);
        mCallbacks = wrappedgamescallbacks;
        mGamesContext = gamesclientcontext;
        mPreviousHeader = leaderboardscorebufferheader;
        mMaxResults = i;
        mPageDirection = j;
    }

    protected final DataHolder fetchData$b7c4c52(DataBroker databroker, int i)
        throws GoogleAuthException
    {
        if (i == 0)
        {
            return databroker.getAdditionalScores(mGamesContext, mPreviousHeader, mMaxResults, mPageDirection);
        }
        if (i == 1)
        {
            return databroker.getLeaderboard(mGamesContext, mPreviousHeader.getExternalLeaderboardId(), true);
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
