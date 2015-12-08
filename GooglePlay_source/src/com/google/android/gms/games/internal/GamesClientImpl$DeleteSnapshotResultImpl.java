// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.games.GamesStatusCodes;

// Referenced classes of package com.google.android.gms.games.internal:
//            GamesClientImpl

private static final class mSnapshotId
    implements com.google.android.gms.games.snapshot.mSnapshotId
{

    private final String mSnapshotId;
    private final Status mStatus;

    public final String getSnapshotId()
    {
        return mSnapshotId;
    }

    public final Status getStatus()
    {
        return mStatus;
    }

    (int i, String s)
    {
        mStatus = GamesStatusCodes.create(i);
        mSnapshotId = s;
    }
}
