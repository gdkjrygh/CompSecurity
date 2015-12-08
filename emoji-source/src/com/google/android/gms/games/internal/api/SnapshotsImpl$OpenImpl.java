// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.api;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.drive.Contents;
import com.google.android.gms.games.snapshot.Snapshot;

// Referenced classes of package com.google.android.gms.games.internal.api:
//            SnapshotsImpl

private static abstract class <init> extends com.google.android.gms.games.dImpl
{

    public com.google.android.gms.games.snapshot.esult ac(Status status)
    {
        return new com.google.android.gms.games.snapshot.Snapshots.OpenSnapshotResult(status) {

            final SnapshotsImpl.OpenImpl QT;
            final Status yJ;

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
                return yJ;
            }

            
            {
                QT = SnapshotsImpl.OpenImpl.this;
                yJ = status;
                super();
            }
        };
    }

    public Result c(Status status)
    {
        return ac(status);
    }

    private _cls1.yJ()
    {
    }

    _cls1.yJ(_cls1.yJ yj)
    {
        this();
    }
}
