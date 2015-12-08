// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.api;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.drive.Contents;
import com.google.android.gms.games.snapshot.Snapshot;

// Referenced classes of package com.google.android.gms.games.internal.api:
//            SnapshotsImpl

class yJ
    implements com.google.android.gms.games.snapshot.ult
{

    final yJ QT;
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

    ( , Status status)
    {
        QT = ;
        yJ = status;
        super();
    }
}
