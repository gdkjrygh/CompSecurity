// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.service.operations.turnbased;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.auth.GoogleAuthException;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.games.broker.Agents;
import com.google.android.gms.games.broker.DataBroker;
import com.google.android.gms.games.broker.GamesClientContext;
import com.google.android.gms.games.internal.constants.TurnBasedMatchTurnStatus;
import com.google.android.gms.games.service.WrappedGamesCallbacks;
import com.google.android.gms.games.service.operations.AbstractMultiDataHolderOperation;

public final class LoadTurnBasedMatchesOperation extends AbstractMultiDataHolderOperation
{

    private final WrappedGamesCallbacks mCallbacks;
    private final GamesClientContext mGamesContext;
    private final int mMatchTurnStatuses[];
    private final int mSortOrder;
    private int mStatusCode;

    public LoadTurnBasedMatchesOperation(GamesClientContext gamesclientcontext, WrappedGamesCallbacks wrappedgamescallbacks, int i, int ai[])
    {
        super(gamesclientcontext.mClientContext, ai.length);
        mCallbacks = wrappedgamescallbacks;
        mGamesContext = gamesclientcontext;
        mSortOrder = i;
        mMatchTurnStatuses = ai;
        mStatusCode = 1;
    }

    protected final DataHolder fetchData$b7c4c52(DataBroker databroker, int i)
        throws GoogleAuthException
    {
        boolean flag;
        if (i >= 0 && i < mMatchTurnStatuses.length)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Asserts.checkState(flag);
        if (i == 0)
        {
            mStatusCode = databroker.syncMatches(mGamesContext, new com.google.android.gms.games.service.GamesSyncAdapter.GamesSyncResult());
        }
        i = mMatchTurnStatuses[i];
        if (i == 0)
        {
            return databroker.getLocalInvitations(mGamesContext, mSortOrder, mStatusCode);
        } else
        {
            return databroker.getLocalTurnBasedMatches(mGamesContext, i, mStatusCode);
        }
    }

    protected final void provideResults(DataHolder adataholder[])
        throws RemoteException
    {
        Bundle bundle;
        int j;
        boolean flag;
        if (mMatchTurnStatuses.length == adataholder.length)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Asserts.checkState(flag);
        j = 0;
        bundle = new Bundle();
        for (int i = 0; i < mMatchTurnStatuses.length; i++)
        {
            bundle.putParcelable(TurnBasedMatchTurnStatus.fromInt(mMatchTurnStatuses[i]), adataholder[i]);
            j += adataholder[i].mRowCount;
        }

        mCallbacks.onTurnBasedMatchesLoaded(Agents.resolveStatusCode(j, mStatusCode), bundle);
    }
}
