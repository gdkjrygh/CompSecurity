// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.service.operations.snapshots;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.auth.GoogleAuthException;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.drive.Contents;
import com.google.android.gms.drive.DriveContents;
import com.google.android.gms.games.broker.DataBroker;
import com.google.android.gms.games.broker.GamesClientContext;
import com.google.android.gms.games.service.ApiClientTracker;
import com.google.android.gms.games.service.WrappedGamesCallbacks;
import com.google.android.gms.games.service.operations.AbstractDataHolderOperation;

public final class OpenSnapshotOperation extends AbstractDataHolderOperation
{
    public static final class SnapshotOpenData
    {

        public final Contents conflictContents;
        public final String conflictId;
        public final Contents currentContents;
        public final DataHolder holder;
        public final Contents resolutionContents;

        private static Contents getContents(DriveContents drivecontents)
        {
            if (drivecontents == null)
            {
                return null;
            }
            drivecontents = drivecontents.getContents();
            boolean flag;
            if (((Contents) (drivecontents)).mMode == 0x30000000)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkState(flag, "Contents returned must be read-write");
            return drivecontents;
        }

        public SnapshotOpenData(int i)
        {
            holder = DataHolder.empty(i);
            conflictId = null;
            currentContents = null;
            conflictContents = null;
            resolutionContents = null;
        }

        public SnapshotOpenData(DataHolder dataholder, DriveContents drivecontents)
        {
            holder = dataholder;
            conflictId = null;
            currentContents = getContents(drivecontents);
            conflictContents = null;
            resolutionContents = null;
        }

        public SnapshotOpenData(DataHolder dataholder, String s, DriveContents drivecontents, DriveContents drivecontents1, DriveContents drivecontents2)
        {
            holder = dataholder;
            conflictId = s;
            currentContents = getContents(drivecontents);
            conflictContents = getContents(drivecontents1);
            resolutionContents = getContents(drivecontents2);
        }
    }


    private final WrappedGamesCallbacks mCallbacks;
    private final int mConflictPolicy;
    private final boolean mCreateIfNotFound;
    private final String mFileName;
    private final GamesClientContext mGamesContext;
    private SnapshotOpenData mOpenData;
    private final ApiClientTracker mTracker;

    public OpenSnapshotOperation(GamesClientContext gamesclientcontext, WrappedGamesCallbacks wrappedgamescallbacks, ApiClientTracker apiclienttracker, String s, boolean flag, int i)
    {
        super(gamesclientcontext.mClientContext);
        mCallbacks = wrappedgamescallbacks;
        mTracker = apiclienttracker;
        mGamesContext = gamesclientcontext;
        mFileName = s;
        mCreateIfNotFound = flag;
        mConflictPolicy = i;
    }

    protected final DataHolder fetchData(Context context, DataBroker databroker)
        throws GoogleAuthException
    {
        mOpenData = databroker.openSnapshot(mGamesContext, mTracker.getApiClient(), mFileName, mCreateIfNotFound, mConflictPolicy);
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
        Contents contents = null;
        if (mOpenData != null)
        {
            dataholder = mOpenData.holder;
            contents = mOpenData.currentContents;
        }
        mCallbacks.onSnapshotOpened(dataholder, contents);
    }
}
