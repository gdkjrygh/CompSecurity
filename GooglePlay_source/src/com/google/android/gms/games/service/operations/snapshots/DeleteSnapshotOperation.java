// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.service.operations.snapshots;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.auth.GoogleAuthException;
import com.google.android.gms.games.broker.DataBroker;
import com.google.android.gms.games.broker.GamesClientContext;
import com.google.android.gms.games.internal.IGamesCallbacks;
import com.google.android.gms.games.service.ApiClientTracker;
import com.google.android.gms.games.service.WrappedGamesCallbacks;
import com.google.android.gms.games.service.operations.AbstractStatusReportingOperation;

public final class DeleteSnapshotOperation extends AbstractStatusReportingOperation
{

    private final WrappedGamesCallbacks mCallbacks;
    private final GamesClientContext mGamesContext;
    private final String mSnapshotId;
    private final ApiClientTracker mTracker;

    public DeleteSnapshotOperation(GamesClientContext gamesclientcontext, WrappedGamesCallbacks wrappedgamescallbacks, ApiClientTracker apiclienttracker, String s)
    {
        super(gamesclientcontext.mClientContext);
        mCallbacks = wrappedgamescallbacks;
        mTracker = apiclienttracker;
        mSnapshotId = s;
        mGamesContext = gamesclientcontext;
    }

    protected final int performOperation(Context context, DataBroker databroker)
        throws GoogleAuthException
    {
        return databroker.deleteSnapshot(mGamesContext, mTracker.getApiClient(), mSnapshotId);
    }

    public final void postExecute()
    {
        mTracker.decRef();
    }

    protected final void provideResult(int i)
        throws RemoteException
    {
        WrappedGamesCallbacks wrappedgamescallbacks = mCallbacks;
        String s = mSnapshotId;
        wrappedgamescallbacks.mCallbacks.onSnapshotDeleted(i, s);
    }
}
