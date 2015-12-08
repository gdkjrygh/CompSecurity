// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.api;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.snapshot.SnapshotMetadataBuffer;

// Referenced classes of package com.google.android.gms.games.internal.api:
//            SnapshotsImpl

private static abstract class <init> extends com.google.android.gms.games.dImpl
{

    public com.google.android.gms.games.snapshot.Result ab(Status status)
    {
        return new com.google.android.gms.games.snapshot.Snapshots.LoadSnapshotsResult(status) {

            final SnapshotsImpl.LoadImpl QS;
            final Status yJ;

            public SnapshotMetadataBuffer getSnapshots()
            {
                return new SnapshotMetadataBuffer(DataHolder.af(14));
            }

            public Status getStatus()
            {
                return yJ;
            }

            public void release()
            {
            }

            
            {
                QS = SnapshotsImpl.LoadImpl.this;
                yJ = status;
                super();
            }
        };
    }

    public Result c(Status status)
    {
        return ab(status);
    }

    private _cls1.yJ()
    {
    }

    _cls1.yJ(_cls1.yJ yj)
    {
        this();
    }
}
