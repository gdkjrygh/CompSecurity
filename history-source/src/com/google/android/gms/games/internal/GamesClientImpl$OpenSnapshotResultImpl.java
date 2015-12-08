// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;

import com.google.android.gms.common.api.b;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.Contents;
import com.google.android.gms.games.snapshot.Snapshot;
import com.google.android.gms.games.snapshot.SnapshotContents;
import com.google.android.gms.games.snapshot.SnapshotContentsEntity;
import com.google.android.gms.games.snapshot.SnapshotEntity;
import com.google.android.gms.games.snapshot.SnapshotMetadataBuffer;
import com.google.android.gms.games.snapshot.SnapshotMetadataEntity;
import com.google.android.gms.internal.je;

// Referenced classes of package com.google.android.gms.games.internal:
//            GamesClientImpl

private static final class Zh extends b
    implements com.google.android.gms.games.snapshot.Zh
{

    private final Snapshot Zf;
    private final String Zg;
    private final Snapshot Zh;
    private final Contents Zi;
    private final SnapshotContents Zj;

    public String getConflictId()
    {
        return Zg;
    }

    public Snapshot getConflictingSnapshot()
    {
        return Zh;
    }

    public SnapshotContents getResolutionSnapshotContents()
    {
        return Zj;
    }

    public Snapshot getSnapshot()
    {
        return Zf;
    }

    (DataHolder dataholder, Contents contents)
    {
        this(dataholder, null, contents, null, null);
    }

    <init>(DataHolder dataholder, String s, Contents contents, Contents contents1, Contents contents2)
    {
        SnapshotMetadataBuffer snapshotmetadatabuffer;
        boolean flag;
        flag = true;
        super(dataholder);
        snapshotmetadatabuffer = new SnapshotMetadataBuffer(dataholder);
        if (snapshotmetadatabuffer.getCount() != 0) goto _L2; else goto _L1
_L1:
        Zf = null;
        Zh = null;
_L3:
        snapshotmetadatabuffer.release();
        Zg = s;
        Zi = contents2;
        Zj = new SnapshotContentsEntity(contents2);
        return;
_L2:
        if (snapshotmetadatabuffer.getCount() != 1)
        {
            break MISSING_BLOCK_LABEL_144;
        }
        if (dataholder.getStatusCode() == 4004)
        {
            flag = false;
        }
        je.K(flag);
        Zf = new SnapshotEntity(new SnapshotMetadataEntity(snapshotmetadatabuffer.get(0)), new SnapshotContentsEntity(contents));
        Zh = null;
          goto _L3
        dataholder;
        snapshotmetadatabuffer.release();
        throw dataholder;
        Zf = new SnapshotEntity(new SnapshotMetadataEntity(snapshotmetadatabuffer.get(0)), new SnapshotContentsEntity(contents));
        Zh = new SnapshotEntity(new SnapshotMetadataEntity(snapshotmetadatabuffer.get(1)), new SnapshotContentsEntity(contents1));
          goto _L3
    }
}
