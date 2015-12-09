// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.service.operations.requests;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.auth.GoogleAuthException;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.games.broker.Agents;
import com.google.android.gms.games.broker.DataBroker;
import com.google.android.gms.games.broker.GamesClientContext;
import com.google.android.gms.games.internal.constants.RequestType;
import com.google.android.gms.games.service.WrappedGamesCallbacks;
import com.google.android.gms.games.service.operations.AbstractMultiDataHolderOperation;
import java.util.ArrayList;

public final class LoadRequestsOperation extends AbstractMultiDataHolderOperation
{

    private final WrappedGamesCallbacks mCallbacks;
    private final GamesClientContext mGamesContext;
    private final int mRequestDirection;
    private final ArrayList mRequestTypes;
    private final int mSortOrder;
    private int mStatusCode;

    public LoadRequestsOperation(GamesClientContext gamesclientcontext, WrappedGamesCallbacks wrappedgamescallbacks, int i, int j, ArrayList arraylist)
    {
        super(gamesclientcontext.mClientContext, arraylist.size());
        mCallbacks = wrappedgamescallbacks;
        mGamesContext = gamesclientcontext;
        mSortOrder = j;
        mRequestTypes = arraylist;
        mRequestDirection = i;
    }

    protected final DataHolder fetchData$b7c4c52(DataBroker databroker, int i)
        throws GoogleAuthException
    {
        boolean flag;
        if (i >= 0 && i < mRequestTypes.size())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Asserts.checkState(flag);
        if (i == 0)
        {
            mStatusCode = databroker.syncRequests(mGamesContext, new com.google.android.gms.games.service.GamesSyncAdapter.GamesSyncResult());
        }
        i = ((Integer)mRequestTypes.get(i)).intValue();
        return databroker.getLocalRequests(mGamesContext, mRequestDirection, i, mSortOrder, mStatusCode);
    }

    protected final void provideResults(DataHolder adataholder[])
        throws RemoteException
    {
        int j = 0;
        Bundle bundle = new Bundle();
        for (int i = 0; i < adataholder.length; i++)
        {
            bundle.putParcelable(RequestType.fromInt(((Integer)mRequestTypes.get(i)).intValue()), adataholder[i]);
            j += adataholder[i].mRowCount;
        }

        mCallbacks.onRequestsLoaded(Agents.resolveStatusCode(j, mStatusCode), bundle);
    }
}
