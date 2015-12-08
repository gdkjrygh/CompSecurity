// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;

import com.google.android.gms.common.api.a;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.Contents;
import com.google.android.gms.games.snapshot.Snapshot;
import com.google.android.gms.games.snapshot.SnapshotContents;
import com.google.android.gms.games.snapshot.SnapshotEntity;
import com.google.android.gms.games.snapshot.SnapshotMetadataBuffer;
import com.google.android.gms.games.snapshot.SnapshotMetadataEntity;

// Referenced classes of package com.google.android.gms.games.internal:
//            GamesClientImpl

private static final class Xo extends a
    implements com.google.android.gms.games.snapshot.Xo
{

    private final Snapshot Xm;
    private final String Xn;
    private final Snapshot Xo;
    private final Contents Xp;
    private final SnapshotContents Xq;

    public String getConflictId()
    {
        return Xn;
    }

    public Snapshot getConflictingSnapshot()
    {
        return Xo;
    }

    public Contents getResolutionContents()
    {
        return Xp;
    }

    public SnapshotContents getResolutionSnapshotContents()
    {
        return Xq;
    }

    public Snapshot getSnapshot()
    {
        return Xm;
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
        Xm = null;
        Xo = null;
_L3:
        snapshotmetadatabuffer.release();
        Xn = s;
        Xp = contents2;
        Xq = new SnapshotContents(contents2);
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
        com.google.android.gms.common.internal.a.I(flag);
        Xm = new SnapshotEntity(new SnapshotMetadataEntity(snapshotmetadatabuffer.get(0)), new SnapshotContents(contents));
        Xo = null;
          goto _L3
        dataholder;
        snapshotmetadatabuffer.release();
        throw dataholder;
        Xm = new SnapshotEntity(new SnapshotMetadataEntity(snapshotmetadatabuffer.get(0)), new SnapshotContents(contents));
        Xo = new SnapshotEntity(new SnapshotMetadataEntity(snapshotmetadatabuffer.get(1)), new SnapshotContents(contents1));
          goto _L3
    }
}
