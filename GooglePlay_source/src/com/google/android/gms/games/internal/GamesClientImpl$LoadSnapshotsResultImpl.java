// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.snapshot.SnapshotMetadataBuffer;

// Referenced classes of package com.google.android.gms.games.internal:
//            GamesClientImpl

private static final class nit> extends nit>
    implements com.google.android.gms.games.snapshot.nit>
{

    public final SnapshotMetadataBuffer getSnapshots()
    {
        return new SnapshotMetadataBuffer(mDataHolder);
    }

    (DataHolder dataholder)
    {
        super(dataholder);
    }
}
