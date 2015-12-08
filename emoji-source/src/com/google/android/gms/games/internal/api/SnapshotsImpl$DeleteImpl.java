// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.api;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.games.internal.api:
//            SnapshotsImpl

private static abstract class <init> extends com.google.android.gms.games.mpl
{

    public com.google.android.gms.games.snapshot.esult aa(Status status)
    {
        return new com.google.android.gms.games.snapshot.Snapshots.DeleteSnapshotResult(status) {

            final SnapshotsImpl.DeleteImpl QR;
            final Status yJ;

            public String getSnapshotId()
            {
                return null;
            }

            public Status getStatus()
            {
                return yJ;
            }

            
            {
                QR = SnapshotsImpl.DeleteImpl.this;
                yJ = status;
                super();
            }
        };
    }

    public Result c(Status status)
    {
        return aa(status);
    }

    private _cls1.yJ()
    {
    }

    _cls1.yJ(_cls1.yJ yj)
    {
        this();
    }
}
