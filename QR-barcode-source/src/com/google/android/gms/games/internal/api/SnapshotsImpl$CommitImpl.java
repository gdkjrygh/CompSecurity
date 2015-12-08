// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.api;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.games.snapshot.SnapshotMetadata;

// Referenced classes of package com.google.android.gms.games.internal.api:
//            SnapshotsImpl

private static abstract class <init> extends com.google.android.gms.games.mpl
{

    public com.google.android.gms.games.snapshot.esult ao(Status status)
    {
        return new com.google.android.gms.games.snapshot.Snapshots.CommitSnapshotResult(status) {

            final Status CW;
            final SnapshotsImpl.CommitImpl ZU;

            public SnapshotMetadata getSnapshotMetadata()
            {
                return null;
            }

            public Status getStatus()
            {
                return CW;
            }

            
            {
                ZU = SnapshotsImpl.CommitImpl.this;
                CW = status;
                super();
            }
        };
    }

    public Result c(Status status)
    {
        return ao(status);
    }

    private _cls1.CW()
    {
    }

    _cls1.CW(_cls1.CW cw)
    {
        this();
    }
}
