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
import com.google.android.gms.drive.Contents;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.internal.GamesClientImpl;
import com.google.android.gms.games.snapshot.Snapshot;
import com.google.android.gms.games.snapshot.SnapshotMetadata;
import com.google.android.gms.games.snapshot.SnapshotMetadataBuffer;
import com.google.android.gms.games.snapshot.SnapshotMetadataChange;
import com.google.android.gms.games.snapshot.Snapshots;

public final class SnapshotsImpl
    implements Snapshots
{
    private static abstract class CommitImpl extends com.google.android.gms.games.Games.BaseGamesApiMethodImpl
    {

        public com.google.android.gms.games.snapshot.Snapshots.CommitSnapshotResult Z(Status status)
        {
            return new com.google.android.gms.games.snapshot.Snapshots.CommitSnapshotResult(this, status) {

                final CommitImpl QN;
                final Status yG;

                public SnapshotMetadata getSnapshotMetadata()
                {
                    return null;
                }

                public Status getStatus()
                {
                    return yG;
                }

            
            {
                QN = commitimpl;
                yG = status;
                super();
            }
            };
        }

        public Result c(Status status)
        {
            return Z(status);
        }

        private CommitImpl()
        {
        }

    }

    private static abstract class DeleteImpl extends com.google.android.gms.games.Games.BaseGamesApiMethodImpl
    {

        public com.google.android.gms.games.snapshot.Snapshots.DeleteSnapshotResult aa(Status status)
        {
            return new com.google.android.gms.games.snapshot.Snapshots.DeleteSnapshotResult(this, status) {

                final DeleteImpl QO;
                final Status yG;

                public String getSnapshotId()
                {
                    return null;
                }

                public Status getStatus()
                {
                    return yG;
                }

            
            {
                QO = deleteimpl;
                yG = status;
                super();
            }
            };
        }

        public Result c(Status status)
        {
            return aa(status);
        }

        private DeleteImpl()
        {
        }

    }

    private static abstract class LoadImpl extends com.google.android.gms.games.Games.BaseGamesApiMethodImpl
    {

        public com.google.android.gms.games.snapshot.Snapshots.LoadSnapshotsResult ab(Status status)
        {
            return new com.google.android.gms.games.snapshot.Snapshots.LoadSnapshotsResult(this, status) {

                final LoadImpl QP;
                final Status yG;

                public SnapshotMetadataBuffer getSnapshots()
                {
                    return new SnapshotMetadataBuffer(DataHolder.af(14));
                }

                public Status getStatus()
                {
                    return yG;
                }

                public void release()
                {
                }

            
            {
                QP = loadimpl;
                yG = status;
                super();
            }
            };
        }

        public Result c(Status status)
        {
            return ab(status);
        }

        private LoadImpl()
        {
        }

    }

    private static abstract class OpenImpl extends com.google.android.gms.games.Games.BaseGamesApiMethodImpl
    {

        public com.google.android.gms.games.snapshot.Snapshots.OpenSnapshotResult ac(Status status)
        {
            return new com.google.android.gms.games.snapshot.Snapshots.OpenSnapshotResult(this, status) {

                final OpenImpl QQ;
                final Status yG;

                public String getConflictId()
                {
                    return null;
                }

                public Snapshot getConflictingSnapshot()
                {
                    return null;
                }

                public Contents getResolutionContents()
                {
                    return null;
                }

                public Snapshot getSnapshot()
                {
                    return null;
                }

                public Status getStatus()
                {
                    return yG;
                }

            
            {
                QQ = openimpl;
                yG = status;
                super();
            }
            };
        }

        public Result c(Status status)
        {
            return ac(status);
        }

        private OpenImpl()
        {
        }

    }


    public SnapshotsImpl()
    {
    }

    public PendingResult commitAndClose(GoogleApiClient googleapiclient, Snapshot snapshot, SnapshotMetadataChange snapshotmetadatachange)
    {
        return googleapiclient.b(new CommitImpl(snapshot, snapshotmetadatachange) {

            final SnapshotsImpl QF;
            final Snapshot QI;
            final SnapshotMetadataChange QJ;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((GamesClientImpl)a1);
            }

            protected void a(GamesClientImpl gamesclientimpl)
            {
                gamesclientimpl.a(this, QI, QJ);
            }

            
            {
                QF = SnapshotsImpl.this;
                QI = snapshot;
                QJ = snapshotmetadatachange;
                super();
            }
        });
    }

    public PendingResult delete(GoogleApiClient googleapiclient, SnapshotMetadata snapshotmetadata)
    {
        return googleapiclient.b(new DeleteImpl(snapshotmetadata) {

            final SnapshotsImpl QF;
            final SnapshotMetadata QK;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((GamesClientImpl)a1);
            }

            protected void a(GamesClientImpl gamesclientimpl)
            {
                gamesclientimpl.j(this, QK.getSnapshotId());
            }

            
            {
                QF = SnapshotsImpl.this;
                QK = snapshotmetadata;
                super();
            }
        });
    }

    public void discardAndClose(GoogleApiClient googleapiclient, Snapshot snapshot)
    {
        Games.c(googleapiclient).a(snapshot);
    }

    public int getMaxCoverImageSize(GoogleApiClient googleapiclient)
    {
        return Games.c(googleapiclient).hp();
    }

    public int getMaxDataSize(GoogleApiClient googleapiclient)
    {
        return Games.c(googleapiclient).ho();
    }

    public Intent getSelectSnapshotIntent(GoogleApiClient googleapiclient, String s, boolean flag, boolean flag1, int i)
    {
        return Games.c(googleapiclient).a(s, flag, flag1, i);
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
        return googleapiclient.a(new LoadImpl(flag) {

            final boolean Pb;
            final SnapshotsImpl QF;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((GamesClientImpl)a1);
            }

            protected void a(GamesClientImpl gamesclientimpl)
            {
                gamesclientimpl.e(this, Pb);
            }

            
            {
                QF = SnapshotsImpl.this;
                Pb = flag;
                super();
            }
        });
    }

    public PendingResult open(GoogleApiClient googleapiclient, SnapshotMetadata snapshotmetadata)
    {
        return open(googleapiclient, snapshotmetadata.getUniqueName(), false);
    }

    public PendingResult open(GoogleApiClient googleapiclient, String s, boolean flag)
    {
        return googleapiclient.b(new OpenImpl(s, flag) {

            final SnapshotsImpl QF;
            final String QG;
            final boolean QH;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((GamesClientImpl)a1);
            }

            protected void a(GamesClientImpl gamesclientimpl)
            {
                gamesclientimpl.b(this, QG, QH);
            }

            
            {
                QF = SnapshotsImpl.this;
                QG = s;
                QH = flag;
                super();
            }
        });
    }

    public PendingResult resolveConflict(GoogleApiClient googleapiclient, String s, Snapshot snapshot)
    {
        SnapshotMetadata snapshotmetadata = snapshot.getMetadata();
        SnapshotMetadataChange snapshotmetadatachange = (new com.google.android.gms.games.snapshot.SnapshotMetadataChange.Builder()).fromMetadata(snapshotmetadata).build();
        return resolveConflict(googleapiclient, s, snapshotmetadata.getSnapshotId(), snapshotmetadatachange, snapshot.getContents());
    }

    public PendingResult resolveConflict(GoogleApiClient googleapiclient, String s, String s1, SnapshotMetadataChange snapshotmetadatachange, Contents contents)
    {
        return googleapiclient.b(new OpenImpl(s, s1, snapshotmetadatachange, contents) {

            final Contents IJ;
            final SnapshotsImpl QF;
            final SnapshotMetadataChange QJ;
            final String QL;
            final String QM;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((GamesClientImpl)a1);
            }

            protected void a(GamesClientImpl gamesclientimpl)
                throws RemoteException
            {
                gamesclientimpl.a(this, QL, QM, QJ, IJ);
            }

            
            {
                QF = SnapshotsImpl.this;
                QL = s;
                QM = s1;
                QJ = snapshotmetadatachange;
                IJ = contents;
                super();
            }
        });
    }

    // Unreferenced inner class com/google/android/gms/games/internal/api/SnapshotsImpl$6

/* anonymous class */
    class _cls6 extends LoadImpl
    {

        final boolean Pb;
        final String Pd;
        final String Pe;

        protected volatile void a(com.google.android.gms.common.api.Api.a a1)
            throws RemoteException
        {
            a((GamesClientImpl)a1);
        }

        protected void a(GamesClientImpl gamesclientimpl)
        {
            gamesclientimpl.c(this, Pd, Pe, Pb);
        }
    }

}
