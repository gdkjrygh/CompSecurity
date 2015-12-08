// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.snapshot;

import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.drive.Contents;
import java.io.IOException;

public interface SnapshotContents
    extends Parcelable
{

    public abstract void close();

    public abstract ParcelFileDescriptor getParcelFileDescriptor();

    public abstract Contents ir();

    public abstract boolean isClosed();

    public abstract boolean modifyBytes(int i, byte abyte0[], int j, int k);

    public abstract byte[] readFully()
        throws IOException;

    public abstract boolean writeBytes(byte abyte0[]);
}
