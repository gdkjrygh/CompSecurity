// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.snapshot;

import com.google.android.gms.common.data.DataBuffer;
import com.google.android.gms.common.data.DataHolder;

// Referenced classes of package com.google.android.gms.games.snapshot:
//            SnapshotMetadataRef, SnapshotMetadata

public final class SnapshotMetadataBuffer extends DataBuffer
{

    public SnapshotMetadataBuffer(DataHolder dataholder)
    {
        super(dataholder);
    }

    public SnapshotMetadata get(int i)
    {
        return new SnapshotMetadataRef(DG, i);
    }

    public volatile Object get(int i)
    {
        return get(i);
    }
}
