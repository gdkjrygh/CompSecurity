// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.snapshot;

import android.os.Parcel;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.Contents;
import java.io.IOException;

// Referenced classes of package com.google.android.gms.games.snapshot:
//            Snapshot, SnapshotEntityCreator, SnapshotMetadataEntity, SnapshotContents, 
//            SnapshotMetadata

public final class SnapshotEntity
    implements SafeParcelable, Snapshot
{

    public static final SnapshotEntityCreator CREATOR = new SnapshotEntityCreator();
    private final int BR;
    private final SnapshotMetadataEntity adh;
    private final SnapshotContents adi;

    SnapshotEntity(int i, SnapshotMetadata snapshotmetadata, SnapshotContents snapshotcontents)
    {
        BR = i;
        adh = new SnapshotMetadataEntity(snapshotmetadata);
        adi = snapshotcontents;
    }

    public SnapshotEntity(SnapshotMetadata snapshotmetadata, SnapshotContents snapshotcontents)
    {
        this(2, snapshotmetadata, snapshotcontents);
    }

    static boolean a(Snapshot snapshot, Object obj)
    {
        boolean flag1 = true;
        if (obj instanceof Snapshot) goto _L2; else goto _L1
_L1:
        boolean flag = false;
_L4:
        return flag;
_L2:
        flag = flag1;
        if (snapshot == obj) goto _L4; else goto _L3
_L3:
        obj = (Snapshot)obj;
        if (!n.equal(((Snapshot) (obj)).getMetadata(), snapshot.getMetadata()))
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (n.equal(((Snapshot) (obj)).getSnapshotContents(), snapshot.getSnapshotContents())) goto _L4; else goto _L5
_L5:
        return false;
    }

    static int b(Snapshot snapshot)
    {
        return n.hashCode(new Object[] {
            snapshot.getMetadata(), snapshot.getSnapshotContents()
        });
    }

    static String c(Snapshot snapshot)
    {
        com.google.android.gms.common.internal.n.a a1 = n.h(snapshot).a("Metadata", snapshot.getMetadata());
        boolean flag;
        if (snapshot.getSnapshotContents() != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return a1.a("HasContents", Boolean.valueOf(flag)).toString();
    }

    private boolean isClosed()
    {
        return adi.isClosed();
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        return a(this, obj);
    }

    public Snapshot freeze()
    {
        return this;
    }

    public volatile Object freeze()
    {
        return freeze();
    }

    public Contents getContents()
    {
        if (isClosed())
        {
            return null;
        } else
        {
            return adi.getContents();
        }
    }

    public SnapshotMetadata getMetadata()
    {
        return adh;
    }

    public SnapshotContents getSnapshotContents()
    {
        if (isClosed())
        {
            return null;
        } else
        {
            return adi;
        }
    }

    public int getVersionCode()
    {
        return BR;
    }

    public int hashCode()
    {
        return b(this);
    }

    public boolean isDataValid()
    {
        return true;
    }

    public boolean modifyBytes(int i, byte abyte0[], int j, int k)
    {
        return adi.modifyBytes(i, abyte0, j, k);
    }

    public byte[] readFully()
    {
        byte abyte0[];
        try
        {
            abyte0 = adi.readFully();
        }
        catch (IOException ioexception)
        {
            throw new RuntimeException(ioexception);
        }
        return abyte0;
    }

    public String toString()
    {
        return c(this);
    }

    public boolean writeBytes(byte abyte0[])
    {
        return adi.writeBytes(abyte0);
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        SnapshotEntityCreator.a(this, parcel, i);
    }

}
