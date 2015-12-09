// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.service.operations.snapshots;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.auth.GoogleAuthException;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.DriveContents;
import com.google.android.gms.games.broker.DataBroker;
import com.google.android.gms.games.broker.GamesClientContext;
import com.google.android.gms.games.internal.IGamesCallbacks;
import com.google.android.gms.games.service.ApiClientTracker;
import com.google.android.gms.games.service.WrappedGamesCallbacks;
import com.google.android.gms.games.service.operations.AbstractDataHolderOperation;
import com.google.android.gms.games.snapshot.SnapshotMetadataChange;

public final class CommitSnapshotOperation extends AbstractDataHolderOperation
{

    private final WrappedGamesCallbacks mCallbacks;
    private final DriveContents mDriveContents;
    private final GamesClientContext mGamesContext;
    private final SnapshotMetadataChange mMetadataChange;
    private final String mSnapshotId;
    private final ApiClientTracker mTracker;

    public CommitSnapshotOperation(GamesClientContext gamesclientcontext, WrappedGamesCallbacks wrappedgamescallbacks, ApiClientTracker apiclienttracker, String s, SnapshotMetadataChange snapshotmetadatachange, DriveContents drivecontents)
    {
        super(gamesclientcontext.mClientContext);
        mCallbacks = wrappedgamescallbacks;
        mTracker = apiclienttracker;
        mGamesContext = gamesclientcontext;
        mSnapshotId = s;
        mMetadataChange = snapshotmetadatachange;
        mDriveContents = drivecontents;
    }

    protected final DataHolder fetchData(Context context, DataBroker databroker)
        throws GoogleAuthException
    {
        return databroker.commitSnapshot(mGamesContext, mTracker.getApiClient(), mSnapshotId, mMetadataChange, mDriveContents);
    }

    public final void postExecute()
    {
        mTracker.decRef();
    }

    protected final void provideResult(DataHolder dataholder)
        throws RemoteException
    {
        WrappedGamesCallbacks wrappedgamescallbacks = mCallbacks;
        wrappedgamescallbacks.audit(new DataHolder[] {
            dataholder
        });
        wrappedgamescallbacks.mCallbacks.onSnapshotCommitted(dataholder);
    }
}
