// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.api;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.internal.GamesClientImpl;
import com.google.android.gms.games.internal.IGamesService;
import com.google.android.gms.games.snapshot.SnapshotMetadata;
import com.google.android.gms.games.snapshot.SnapshotMetadataBuffer;
import com.google.android.gms.games.snapshot.Snapshots;

public final class SnapshotsImpl
    implements Snapshots
{
    private static abstract class DeleteImpl extends com.google.android.gms.games.Games.BaseGamesApiMethodImpl
    {

        public final volatile Result createFailedResult(Status status)
        {
            return status. new com.google.android.gms.games.snapshot.Snapshots.DeleteSnapshotResult() {

                final DeleteImpl this$0;
                final Status val$status;

                public final String getSnapshotId()
                {
                    return null;
                }

                public final Status getStatus()
                {
                    return status;
                }

            
            {
                this$0 = final_deleteimpl;
                status = Status.this;
                super();
            }
            };
        }

        private DeleteImpl(GoogleApiClient googleapiclient)
        {
            super(googleapiclient);
        }

        DeleteImpl(GoogleApiClient googleapiclient, byte byte0)
        {
            this(googleapiclient);
        }
    }

    private static abstract class LoadImpl extends com.google.android.gms.games.Games.BaseGamesApiMethodImpl
    {

        public final volatile Result createFailedResult(Status status)
        {
            return status. new com.google.android.gms.games.snapshot.Snapshots.LoadSnapshotsResult() {

                final LoadImpl this$0;
                final Status val$status;

                public final SnapshotMetadataBuffer getSnapshots()
                {
                    return new SnapshotMetadataBuffer(DataHolder.empty(14));
                }

                public final Status getStatus()
                {
                    return status;
                }

                public final void release()
                {
                }

            
            {
                this$0 = final_loadimpl;
                status = Status.this;
                super();
            }
            };
        }

        private LoadImpl(GoogleApiClient googleapiclient)
        {
            super(googleapiclient);
        }

        LoadImpl(GoogleApiClient googleapiclient, byte byte0)
        {
            this(googleapiclient);
        }
    }


    public SnapshotsImpl()
    {
    }

    public final PendingResult delete(final GoogleApiClient final_googleapiclient, SnapshotMetadata snapshotmetadata)
    {
        return final_googleapiclient.execute(new DeleteImpl(snapshotmetadata) {

            final SnapshotsImpl this$0;
            final SnapshotMetadata val$metadata;

            protected final volatile void doExecute(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                client = (GamesClientImpl)client;
                String s = metadata.getSnapshotId();
                ((IGamesService)client.getService()).deleteSnapshot(new com.google.android.gms.games.internal.GamesClientImpl.SnapshotDeletedBinderCallbacks(this), s);
            }

            
            {
                this$0 = SnapshotsImpl.this;
                metadata = snapshotmetadata;
                super(final_googleapiclient, (byte)0);
            }
        });
    }

    public final PendingResult load(final GoogleApiClient final_googleapiclient, boolean flag)
    {
        return final_googleapiclient.enqueue(new LoadImpl(flag) {

            final SnapshotsImpl this$0;
            final boolean val$forceReload;

            protected final volatile void doExecute(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                client = (GamesClientImpl)client;
                boolean flag1 = forceReload;
                ((IGamesService)client.getService()).loadSnapshots(new com.google.android.gms.games.internal.GamesClientImpl.SnapshotsLoadedBinderCallbacks(this), flag1);
            }

            
            {
                this$0 = SnapshotsImpl.this;
                forceReload = flag;
                super(final_googleapiclient, (byte)0);
            }
        });
    }

    public final PendingResult loadFirstParty$29b9cb1d(final GoogleApiClient final_googleapiclient, final String playerId, final String gameId)
    {
        return final_googleapiclient.enqueue(new LoadImpl(false) {

            final SnapshotsImpl this$0;
            final boolean val$forceReload = false;
            final String val$gameId;
            final String val$playerId;

            protected final volatile void doExecute(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                client = (GamesClientImpl)client;
                String s = playerId;
                String s1 = gameId;
                boolean flag = forceReload;
                ((IGamesService)client.getService()).loadSnapshotsFirstParty(new com.google.android.gms.games.internal.GamesClientImpl.SnapshotsLoadedBinderCallbacks(this), s, s1, flag);
            }

            
            {
                this$0 = SnapshotsImpl.this;
                playerId = s;
                gameId = s1;
                super(final_googleapiclient, (byte)0);
            }
        });
    }
}
