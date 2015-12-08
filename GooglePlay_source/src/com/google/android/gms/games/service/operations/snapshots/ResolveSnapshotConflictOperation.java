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
import com.google.android.gms.games.service.ApiClientTracker;
import com.google.android.gms.games.service.WrappedGamesCallbacks;
import com.google.android.gms.games.service.operations.AbstractDataHolderOperation;
import com.google.android.gms.games.snapshot.SnapshotMetadataChange;

public final class ResolveSnapshotConflictOperation extends AbstractDataHolderOperation
{

    private final WrappedGamesCallbacks mCallbacks;
    private final String mConflictId;
    private final DriveContents mDriveContents;
    private final GamesClientContext mGamesContext;
    private final SnapshotMetadataChange mMetadataChange;
    private OpenSnapshotOperation.SnapshotOpenData mOpenData;
    private final String mSnapshotId;
    private final ApiClientTracker mTracker;

    public ResolveSnapshotConflictOperation(GamesClientContext gamesclientcontext, WrappedGamesCallbacks wrappedgamescallbacks, ApiClientTracker apiclienttracker, String s, String s1, SnapshotMetadataChange snapshotmetadatachange, DriveContents drivecontents)
    {
        super(gamesclientcontext.mClientContext);
        mCallbacks = wrappedgamescallbacks;
        mTracker = apiclienttracker;
        mGamesContext = gamesclientcontext;
        mConflictId = s;
        mSnapshotId = s1;
        mMetadataChange = snapshotmetadatachange;
        mDriveContents = drivecontents;
    }

    protected final DataHolder fetchData(Context context, DataBroker databroker)
        throws GoogleAuthException
    {
        mOpenData = databroker.resolveSnapshotConflict(mGamesContext, mTracker.getApiClient(), mConflictId, mSnapshotId, mMetadataChange, mDriveContents);
        return mOpenData.holder;
    }

    public final void postExecute()
    {
        mTracker.decRef();
    }

    protected final void provideResult(DataHolder dataholder)
        throws RemoteException
    {
        if (dataholder.mStatusCode == 4004)
        {
            mCallbacks.onSnapshotConflict(mOpenData.holder, mOpenData.conflictId, mOpenData.currentContents, mOpenData.conflictContents, mOpenData.resolutionContents);
            return;
        }
        com.google.android.gms.drive.Contents contents = null;
        if (mOpenData != null)
        {
            dataholder = mOpenData.holder;
            contents = mOpenData.currentContents;
        }
        mCallbacks.onSnapshotOpened(dataholder, contents);
    }
}
