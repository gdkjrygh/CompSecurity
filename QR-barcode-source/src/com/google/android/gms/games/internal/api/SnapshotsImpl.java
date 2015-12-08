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

                final Status CW;
                final CommitImpl ZU;

                public SnapshotMetadata getSnapshotMetadata()
                {
                    return null;
                }

                public Status getStatus()
                {
                    return CW;
                }

            
            {
                ZU = commitimpl;
                CW = status;
                super();
            }
            };
        }

        public Result c(Status status)
        {
            return ao(status);
        }

        private CommitImpl()
        {
        }

    }

    private static abstract class DeleteImpl extends com.google.android.gms.games.Games.BaseGamesApiMethodImpl
    {

        public com.google.android.gms.games.snapshot.Snapshots.DeleteSnapshotResult ap(Status status)
        {
            return new com.google.android.gms.games.snapshot.Snapshots.DeleteSnapshotResult(this, status) {

                final Status CW;
                final DeleteImpl ZV;

                public String getSnapshotId()
                {
                    return null;
                }

                public Status getStatus()
                {
                    return CW;
                }

            
            {
                ZV = deleteimpl;
                CW = status;
                super();
            }
            };
        }

        public Result c(Status status)
        {
            return ap(status);
        }

        private DeleteImpl()
        {
        }

    }

    private static abstract class LoadImpl extends com.google.android.gms.games.Games.BaseGamesApiMethodImpl
    {

        public com.google.android.gms.games.snapshot.Snapshots.LoadSnapshotsResult aq(Status status)
        {
            return new com.google.android.gms.games.snapshot.Snapshots.LoadSnapshotsResult(this, status) {

                final Status CW;
                final LoadImpl ZW;

                public SnapshotMetadataBuffer getSnapshots()
                {
                    return new SnapshotMetadataBuffer(DataHolder.as(14));
                }

                public Status getStatus()
                {
                    return CW;
                }

                public void release()
                {
                }

            
            {
                ZW = loadimpl;
                CW = status;
                super();
            }
            };
        }

        public Result c(Status status)
        {
            return aq(status);
        }

        private LoadImpl()
        {
        }

    }

    private static abstract class OpenImpl extends com.google.android.gms.games.Games.BaseGamesApiMethodImpl
    {

        public com.google.android.gms.games.snapshot.Snapshots.OpenSnapshotResult ar(Status status)
        {
            return new com.google.android.gms.games.snapshot.Snapshots.OpenSnapshotResult(this, status) {

                final Status CW;
                final OpenImpl ZX;

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
                    return CW;
                }

            
            {
                ZX = openimpl;
                CW = status;
                super();
            }
            };
        }

        public Result c(Status status)
        {
            return ar(status);
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

            final SnapshotsImpl ZL;
            final Snapshot ZO;
            final SnapshotMetadataChange ZP;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((GamesClientImpl)a1);
            }

            protected void a(GamesClientImpl gamesclientimpl)
            {
                gamesclientimpl.a(this, ZO, ZP);
            }

            
            {
                ZL = SnapshotsImpl.this;
                ZO = snapshot;
                ZP = snapshotmetadatachange;
                super();
            }
        });
    }

    public PendingResult delete(GoogleApiClient googleapiclient, SnapshotMetadata snapshotmetadata)
    {
        return googleapiclient.b(new DeleteImpl(snapshotmetadata) {

            final SnapshotsImpl ZL;
            final SnapshotMetadata ZQ;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((GamesClientImpl)a1);
            }

            protected void a(GamesClientImpl gamesclientimpl)
            {
                gamesclientimpl.j(this, ZQ.getSnapshotId());
            }

            
            {
                ZL = SnapshotsImpl.this;
                ZQ = snapshotmetadata;
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
        return Games.c(googleapiclient).kv();
    }

    public int getMaxDataSize(GoogleApiClient googleapiclient)
    {
        return Games.c(googleapiclient).ku();
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

            final boolean Yf;
            final SnapshotsImpl ZL;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((GamesClientImpl)a1);
            }

            protected void a(GamesClientImpl gamesclientimpl)
            {
                gamesclientimpl.e(this, Yf);
            }

            
            {
                ZL = SnapshotsImpl.this;
                Yf = flag;
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

            final SnapshotsImpl ZL;
            final String ZM;
            final boolean ZN;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((GamesClientImpl)a1);
            }

            protected void a(GamesClientImpl gamesclientimpl)
            {
                gamesclientimpl.b(this, ZM, ZN);
            }

            
            {
                ZL = SnapshotsImpl.this;
                ZM = s;
                ZN = flag;
                super();
            }
        });
    }

    public PendingResult resolveConflict(GoogleApiClient googleapiclient, String s, Snapshot snapshot)
    {
        SnapshotMetadata snapshotmetadata = snapshot.getMetadata();
        SnapshotMetadataChange snapshotmetadatachange = (new com.google.android.gms.games.snapshot.SnapshotMetadataChange.Builder()).fromMetadata(snapshotmetadata).build();
        return resolveConflict(googleapiclient, s, snapshotmetadata.getSnapshotId(), snapshotmetadatachange, snapshot.getSnapshotContents());
    }

    public PendingResult resolveConflict(GoogleApiClient googleapiclient, String s, String s1, SnapshotMetadataChange snapshotmetadatachange, Contents contents)
    {
        return googleapiclient.b(new OpenImpl(s, s1, snapshotmetadatachange, new SnapshotContents(contents)) {

            final SnapshotsImpl ZL;
            final SnapshotMetadataChange ZP;
            final String ZR;
            final String ZS;
            final SnapshotContents ZT;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((GamesClientImpl)a1);
            }

            protected void a(GamesClientImpl gamesclientimpl)
                throws RemoteException
            {
                gamesclientimpl.a(this, ZR, ZS, ZP, ZT);
            }

            
            {
                ZL = SnapshotsImpl.this;
                ZR = s;
                ZS = s1;
                ZP = snapshotmetadatachange;
                ZT = snapshotcontents;
                super();
            }
        });
    }

    public PendingResult resolveConflict(GoogleApiClient googleapiclient, String s, String s1, SnapshotMetadataChange snapshotmetadatachange, SnapshotContents snapshotcontents)
    {
        return googleapiclient.b(new OpenImpl(s, s1, snapshotmetadatachange, snapshotcontents) {

            final SnapshotsImpl ZL;
            final SnapshotMetadataChange ZP;
            final String ZR;
            final String ZS;
            final SnapshotContents ZT;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((GamesClientImpl)a1);
            }

            protected void a(GamesClientImpl gamesclientimpl)
                throws RemoteException
            {
                gamesclientimpl.a(this, ZR, ZS, ZP, ZT);
            }

            
            {
                ZL = SnapshotsImpl.this;
                ZR = s;
                ZS = s1;
                ZP = snapshotmetadatachange;
                ZT = snapshotcontents;
                super();
            }
        });
    }

    // Unreferenced inner class com/google/android/gms/games/internal/api/SnapshotsImpl$7

/* anonymous class */
    class _cls7 extends LoadImpl
    {

        final boolean Yf;
        final String Yh;
        final String Yi;

        protected volatile void a(com.google.android.gms.common.api.Api.a a1)
            throws RemoteException
        {
            a((GamesClientImpl)a1);
        }

        protected void a(GamesClientImpl gamesclientimpl)
        {
            gamesclientimpl.c(this, Yh, Yi, Yf);
        }
    }

}
