// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.snapshot;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.Contents;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.internal.jx;
import com.google.android.gms.internal.lh;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.channels.FileChannel;

// Referenced classes of package com.google.android.gms.games.snapshot:
//            SnapshotContents, SnapshotContentsEntityCreator

public final class SnapshotContentsEntity
    implements SafeParcelable, SnapshotContents
{

    public static final SnapshotContentsEntityCreator CREATOR = new SnapshotContentsEntityCreator();
    private static final Object aeY = new Object();
    private final int CK;
    private Contents PW;

    SnapshotContentsEntity(int i, Contents contents)
    {
        CK = i;
        PW = contents;
    }

    public SnapshotContentsEntity(Contents contents)
    {
        this(1, contents);
    }

    private boolean a(int i, byte abyte0[], int j, int k, boolean flag)
    {
        Object obj;
        BufferedOutputStream bufferedoutputstream;
        Object obj1;
        boolean flag1;
        if (!isClosed())
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        jx.a(flag1, "Must provide a previously opened SnapshotContents");
        obj = aeY;
        obj;
        JVM INSTR monitorenter ;
        obj1 = new FileOutputStream(PW.getParcelFileDescriptor().getFileDescriptor());
        bufferedoutputstream = new BufferedOutputStream(((OutputStream) (obj1)));
        obj1 = ((FileOutputStream) (obj1)).getChannel();
        ((FileChannel) (obj1)).position(i);
        bufferedoutputstream.write(abyte0, j, k);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_93;
        }
        ((FileChannel) (obj1)).truncate(abyte0.length);
        bufferedoutputstream.flush();
        obj;
        JVM INSTR monitorexit ;
        return true;
        abyte0;
        GamesLog.a("SnapshotContentsEntity", "Failed to write snapshot data", abyte0);
        obj;
        JVM INSTR monitorexit ;
        return false;
        abyte0;
        obj;
        JVM INSTR monitorexit ;
        throw abyte0;
    }

    public void close()
    {
        PW = null;
    }

    public int describeContents()
    {
        return 0;
    }

    public ParcelFileDescriptor getParcelFileDescriptor()
    {
        boolean flag;
        if (!isClosed())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        jx.a(flag, "Cannot mutate closed contents!");
        return PW.getParcelFileDescriptor();
    }

    public int getVersionCode()
    {
        return CK;
    }

    public Contents ir()
    {
        return PW;
    }

    public boolean isClosed()
    {
        return PW == null;
    }

    public boolean modifyBytes(int i, byte abyte0[], int j, int k)
    {
        return a(i, abyte0, j, abyte0.length, false);
    }

    public byte[] readFully()
        throws IOException
    {
        boolean flag = false;
        if (!isClosed())
        {
            flag = true;
        }
        jx.a(flag, "Must provide a previously opened Snapshot");
        Object obj = aeY;
        obj;
        JVM INSTR monitorenter ;
        FileInputStream fileinputstream;
        BufferedInputStream bufferedinputstream;
        fileinputstream = new FileInputStream(PW.getParcelFileDescriptor().getFileDescriptor());
        bufferedinputstream = new BufferedInputStream(fileinputstream);
        byte abyte0[];
        fileinputstream.getChannel().position(0L);
        abyte0 = lh.a(bufferedinputstream, false);
        fileinputstream.getChannel().position(0L);
        return abyte0;
        Object obj1;
        obj1;
        GamesLog.b("SnapshotContentsEntity", "Failed to read snapshot data", ((Throwable) (obj1)));
        throw obj1;
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
    }

    public boolean writeBytes(byte abyte0[])
    {
        return a(0, abyte0, 0, abyte0.length, true);
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        SnapshotContentsEntityCreator.a(this, parcel, i);
    }

}
