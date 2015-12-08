// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.snapshot;

import android.os.Parcelable;
import com.google.android.gms.common.data.Freezable;
import com.google.android.gms.drive.Contents;

// Referenced classes of package com.google.android.gms.games.snapshot:
//            SnapshotMetadata

public interface Snapshot
    extends Parcelable, Freezable
{

    public abstract Contents getContents();

    public abstract SnapshotMetadata getMetadata();

    public abstract void iM();

    public abstract boolean modifyBytes(int i, byte abyte0[], int j, int k);

    public abstract byte[] readFully();

    public abstract boolean writeBytes(byte abyte0[]);
}
