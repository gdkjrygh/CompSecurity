// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.snapshot;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.common.api.Result;

// Referenced classes of package com.google.android.gms.games.snapshot:
//            SnapshotMetadata, SnapshotMetadataBuffer

public interface Snapshots
{
    public static interface DeleteSnapshotResult
        extends Result
    {

        public abstract String getSnapshotId();
    }

    public static interface LoadSnapshotsResult
        extends Releasable, Result
    {

        public abstract SnapshotMetadataBuffer getSnapshots();
    }


    public abstract PendingResult delete(GoogleApiClient googleapiclient, SnapshotMetadata snapshotmetadata);

    public abstract PendingResult load(GoogleApiClient googleapiclient, boolean flag);

    public abstract PendingResult loadFirstParty$29b9cb1d(GoogleApiClient googleapiclient, String s, String s1);
}
