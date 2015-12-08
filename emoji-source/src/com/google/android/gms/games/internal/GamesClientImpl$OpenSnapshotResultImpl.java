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
import com.google.android.gms.internal.gx;

// Referenced classes of package com.google.android.gms.games.internal:
//            GamesClientImpl

private static final class Oo extends b
    implements com.google.android.gms.games.snapshot.Oo
{

    private final Snapshot Om;
    private final String On;
    private final Snapshot Oo;
    private final Contents Op;

    public String getConflictId()
    {
        return On;
    }

    public Snapshot getConflictingSnapshot()
    {
        return Oo;
    }

    public Contents getResolutionContents()
    {
        return Op;
    }

    public Snapshot getSnapshot()
    {
        return Om;
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
        Om = null;
        Oo = null;
_L3:
        snapshotmetadatabuffer.close();
        On = s;
        Op = contents2;
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
        gx.A(flag);
        Om = new SnapshotEntity(new SnapshotMetadataEntity(snapshotmetadatabuffer.get(0)), contents);
        Oo = null;
          goto _L3
        dataholder;
        snapshotmetadatabuffer.close();
        throw dataholder;
        Om = new SnapshotEntity(new SnapshotMetadataEntity(snapshotmetadatabuffer.get(0)), contents);
        Oo = new SnapshotEntity(new SnapshotMetadataEntity(snapshotmetadatabuffer.get(1)), contents1);
          goto _L3
    }
}
