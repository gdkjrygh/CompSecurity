// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;

import com.google.android.gms.common.api.b;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.Contents;
import com.google.android.gms.games.snapshot.Snapshot;
import com.google.android.gms.games.snapshot.SnapshotEntity;
import com.google.android.gms.games.snapshot.SnapshotMetadataBuffer;
import com.google.android.gms.games.snapshot.SnapshotMetadataEntity;
import com.google.android.gms.internal.gy;

// Referenced classes of package com.google.android.gms.games.internal:
//            GamesClientImpl

private static final class Ol extends b
    implements com.google.android.gms.games.snapshot.Ol
{

    private final Snapshot Oj;
    private final String Ok;
    private final Snapshot Ol;
    private final Contents Om;

    public String getConflictId()
    {
        return Ok;
    }

    public Snapshot getConflictingSnapshot()
    {
        return Ol;
    }

    public Contents getResolutionContents()
    {
        return Om;
    }

    public Snapshot getSnapshot()
    {
        return Oj;
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
        Oj = null;
        Ol = null;
_L3:
        snapshotmetadatabuffer.close();
        Ok = s;
        Om = contents2;
        return;
_L2:
        if (snapshotmetadatabuffer.getCount() != 1)
        {
            break MISSING_BLOCK_LABEL_124;
        }
        if (dataholder.getStatusCode() == 4004)
        {
            flag = false;
        }
        gy.A(flag);
        Oj = new SnapshotEntity(new SnapshotMetadataEntity(snapshotmetadatabuffer.get(0)), contents);
        Ol = null;
          goto _L3
        dataholder;
        snapshotmetadatabuffer.close();
        throw dataholder;
        Oj = new SnapshotEntity(new SnapshotMetadataEntity(snapshotmetadatabuffer.get(0)), contents);
        Ol = new SnapshotEntity(new SnapshotMetadataEntity(snapshotmetadatabuffer.get(1)), contents1);
          goto _L3
    }
}
