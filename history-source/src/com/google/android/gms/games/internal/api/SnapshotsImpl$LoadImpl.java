// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.api;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.snapshot.SnapshotMetadataBuffer;

// Referenced classes of package com.google.android.gms.games.internal.api:
//            SnapshotsImpl

private static abstract class <init> extends com.google.android.gms.games.dImpl
{

    public com.google.android.gms.games.snapshot.Result aq(Status status)
    {
        return new com.google.android.gms.games.snapshot.Snapshots.LoadSnapshotsResult(status) {

            final Status DS;
            final SnapshotsImpl.LoadImpl abQ;

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
                abQ = SnapshotsImpl.LoadImpl.this;
                DS = status;
                super();
            }
        };
    }

    public Result c(Status status)
    {
        return aq(status);
    }

    private _cls1.DS(GoogleApiClient googleapiclient)
    {
        super(googleapiclient);
    }

    _cls1.DS(GoogleApiClient googleapiclient, _cls1.DS ds)
    {
        this(googleapiclient);
    }
}
