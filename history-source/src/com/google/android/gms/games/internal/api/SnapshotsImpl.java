// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.api;

import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.internal.GamesClientImpl;
import com.google.android.gms.games.snapshot.Snapshot;
import com.google.android.gms.games.snapshot.SnapshotContents;
import com.google.android.gms.games.snapshot.SnapshotMetadata;
import com.google.android.gms.games.snapshot.SnapshotMetadataBuffer;
import com.google.android.gms.games.snapshot.SnapshotMetadataChange;
import com.google.android.gms.games.snapshot.Snapshots;

public final class SnapshotsImpl
    implements Snapshots
{
    private static abstract class CommitImpl extends com.google.android.gms.games.Games.BaseGamesApiMethodImpl
    {

        public com.google.android.gms.games.snapshot.Snapshots.CommitSnapshotResult ao(Status status)
        {
            return new com.google.android.gms.games.snapshot.Snapshots.CommitSnapshotResult(this, status) {

                final Status DS;
                final CommitImpl abO;

                public SnapshotMetadata getSnapshotMetadata()
                {
                    return null;
                }

                public Status getStatus()
                {
                    return DS;
                }

            
            {
                abO = commitimpl;
                DS = status;
                super();
            }
            };
        }

        public Result c(Status status)
        {
            return ao(status);
        }

        private CommitImpl(GoogleApiClient googleapiclient)
        {
            super(googleapiclient);
        }

    }

    private static abstract class DeleteImpl extends com.google.android.gms.games.Games.BaseGamesApiMethodImpl
    {

        public com.google.android.gms.games.snapshot.Snapshots.DeleteSnapshotResult ap(Status status)
        {
            return new com.google.android.gms.games.snapshot.Snapshots.DeleteSnapshotResult(this, status) {

                final Status DS;
                final DeleteImpl abP;

                public String getSnapshotId()
                {
                    return null;
                }

                public Status getStatus()
                {
                    return DS;
                }

            
            {
                abP = deleteimpl;
                DS = status;
                super();
            }
            };
        }

        public Result c(Status status)
        {
            return ap(status);
        }

        private DeleteImpl(GoogleApiClient googleapiclient)
        {
            super(googleapiclient);
        }

    }

    private static abstract class LoadImpl extends com.google.android.gms.games.Games.BaseGamesApiMethodImpl
    {

        public com.google.android.gms.games.snapshot.Snapshots.LoadSnapshotsResult aq(Status status)
        {
            return new com.google.android.gms.games.snapshot.Snapshots.LoadSnapshotsResult(this, status) {

                final Status DS;
                final LoadImpl abQ;

                public SnapshotMetadataBuffer getSnapshots()
                {
                    return new SnapshotMetadataBuffer(DataHolder.av(14));
                }

                public Status getStatus()
                {
                    return DS;
                }

                public void release()
                {
                }

            
            {
                abQ = loadimpl;
                DS = status;
                super();
            }
            };
        }

        public Result c(Status status)
        {
            return aq(status);
        }

        private LoadImpl(GoogleApiClient googleapiclient)
        {
            super(googleapiclient);
        }

    }

    private static abstract class OpenImpl extends com.google.android.gms.games.Games.BaseGamesApiMethodImpl
    {

        public com.google.android.gms.games.snapshot.Snapshots.OpenSnapshotResult ar(Status status)
        {
            return new com.google.android.gms.games.snapshot.Snapshots.OpenSnapshotResult(this, status) {

                final Status DS;
                final OpenImpl abR;

                public String getConflictId()
                {
                    return null;
                }

                public Snapshot getConflictingSnapshot()
                {
                    return null;
                }

                public SnapshotContents getResolutionSnapshotContents()
                {
                    return null;
                }

                public Snapshot getSnapshot()
                {
                    return null;
                }

                public Status getStatus()
                {
                    return DS;
                }

            
            {
                abR = openimpl;
                DS = status;
                super();
            }
            };
        }

        public Result c(Status status)
        {
            return ar(status);
        }

        private OpenImpl(GoogleApiClient googleapiclient)
        {
            super(googleapiclient);
        }

    }


    public SnapshotsImpl()
    {
    }

    public PendingResult commitAndClose(GoogleApiClient googleapiclient, Snapshot snapshot, SnapshotMetadataChange snapshotmetadatachange)
    {
        return googleapiclient.b(new CommitImpl(googleapiclient, snapshot, snapshotmetadatachange) {

            final SnapshotsImpl abF;
            final Snapshot abI;
            final SnapshotMetadataChange abJ;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((GamesClientImpl)a1);
            }

            protected void a(GamesClientImpl gamesclientimpl)
            {
                gamesclientimpl.a(this, abI, abJ);
            }

            
            {
                abF = SnapshotsImpl.this;
                abI = snapshot;
                abJ = snapshotmetadatachange;
                super(googleapiclient);
            }
        });
    }

    public PendingResult delete(GoogleApiClient googleapiclient, SnapshotMetadata snapshotmetadata)
    {
        return googleapiclient.b(new DeleteImpl(googleapiclient, snapshotmetadata) {

            final SnapshotsImpl abF;
            final SnapshotMetadata abK;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((GamesClientImpl)a1);
            }

            protected void a(GamesClientImpl gamesclientimpl)
            {
                gamesclientimpl.i(this, abK.getSnapshotId());
            }

            
            {
                abF = SnapshotsImpl.this;
                abK = snapshotmetadata;
                super(googleapiclient);
            }
        });
    }

    public void discardAndClose(GoogleApiClient googleapiclient, Snapshot snapshot)
    {
        Games.d(googleapiclient).a(snapshot);
    }

    public int getMaxCoverImageSize(GoogleApiClient googleapiclient)
    {
        return Games.d(googleapiclient).lC();
    }

    public int getMaxDataSize(GoogleApiClient googleapiclient)
    {
        return Games.d(googleapiclient).lB();
    }

    public Intent getSelectSnapshotIntent(GoogleApiClient googleapiclient, String s, boolean flag, boolean flag1, int i)
    {
        return Games.d(googleapiclient).a(s, flag, flag1, i);
    }

    public SnapshotMetadata getSnapshotFromBundle(Bundle bundle)
    {
        if (bundle == null || !bundle.containsKey("com.google.android.gms.games.SNAPSHOT_METADATA"))
        {
            return null;
        } else
        {
            return (SnapshotMetadata)bundle.getParcelable("com.google.android.gms.games.SNAPSHOT_METADATA");
        }
    }

    public PendingResult load(GoogleApiClient googleapiclient, boolean flag)
    {
        return googleapiclient.a(new LoadImpl(googleapiclient, flag) {

            final boolean ZW;
            final SnapshotsImpl abF;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((GamesClientImpl)a1);
            }

            protected void a(GamesClientImpl gamesclientimpl)
            {
                gamesclientimpl.e(this, ZW);
            }

            
            {
                abF = SnapshotsImpl.this;
                ZW = flag;
                super(googleapiclient);
            }
        });
    }

    public PendingResult open(GoogleApiClient googleapiclient, SnapshotMetadata snapshotmetadata)
    {
        return open(googleapiclient, snapshotmetadata.getUniqueName(), false);
    }

    public PendingResult open(GoogleApiClient googleapiclient, String s, boolean flag)
    {
        return googleapiclient.b(new OpenImpl(googleapiclient, s, flag) {

            final SnapshotsImpl abF;
            final String abG;
            final boolean abH;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((GamesClientImpl)a1);
            }

            protected void a(GamesClientImpl gamesclientimpl)
            {
                gamesclientimpl.c(this, abG, abH);
            }

            
            {
                abF = SnapshotsImpl.this;
                abG = s;
                abH = flag;
                super(googleapiclient);
            }
        });
    }

    public PendingResult resolveConflict(GoogleApiClient googleapiclient, String s, Snapshot snapshot)
    {
        SnapshotMetadata snapshotmetadata = snapshot.getMetadata();
        SnapshotMetadataChange snapshotmetadatachange = (new com.google.android.gms.games.snapshot.SnapshotMetadataChange.Builder()).fromMetadata(snapshotmetadata).build();
        return resolveConflict(googleapiclient, s, snapshotmetadata.getSnapshotId(), snapshotmetadatachange, snapshot.getSnapshotContents());
    }

    public PendingResult resolveConflict(GoogleApiClient googleapiclient, String s, String s1, SnapshotMetadataChange snapshotmetadatachange, SnapshotContents snapshotcontents)
    {
        return googleapiclient.b(new OpenImpl(googleapiclient, s, s1, snapshotmetadatachange, snapshotcontents) {

            final SnapshotsImpl abF;
            final SnapshotMetadataChange abJ;
            final String abL;
            final String abM;
            final SnapshotContents abN;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((GamesClientImpl)a1);
            }

            protected void a(GamesClientImpl gamesclientimpl)
                throws RemoteException
            {
                gamesclientimpl.a(this, abL, abM, abJ, abN);
            }

            
            {
                abF = SnapshotsImpl.this;
                abL = s;
                abM = s1;
                abJ = snapshotmetadatachange;
                abN = snapshotcontents;
                super(googleapiclient);
            }
        });
    }

    // Unreferenced inner class com/google/android/gms/games/internal/api/SnapshotsImpl$6

/* anonymous class */
    class _cls6 extends LoadImpl
    {

        final boolean ZW;
        final String ZY;
        final String ZZ;

        protected volatile void a(com.google.android.gms.common.api.Api.a a1)
            throws RemoteException
        {
            a((GamesClientImpl)a1);
        }

        protected void a(GamesClientImpl gamesclientimpl)
        {
            gamesclientimpl.c(this, ZY, ZZ, ZW);
        }
    }

}
