// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.snapshot;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.jv;

// Referenced classes of package com.google.android.gms.games.snapshot:
//            Snapshot, SnapshotEntityCreator, SnapshotMetadataEntity, SnapshotContentsEntity, 
//            SnapshotMetadata, SnapshotContents

public final class SnapshotEntity
    implements SafeParcelable, Snapshot
{

    public static final SnapshotEntityCreator CREATOR = new SnapshotEntityCreator();
    private final int CK;
    private final SnapshotMetadataEntity aeZ;
    private final SnapshotContentsEntity afa;

    SnapshotEntity(int i, SnapshotMetadata snapshotmetadata, SnapshotContentsEntity snapshotcontentsentity)
    {
        CK = i;
        aeZ = new SnapshotMetadataEntity(snapshotmetadata);
        afa = snapshotcontentsentity;
    }

    public SnapshotEntity(SnapshotMetadata snapshotmetadata, SnapshotContentsEntity snapshotcontentsentity)
    {
        this(2, snapshotmetadata, snapshotcontentsentity);
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
        if (!jv.equal(((Snapshot) (obj)).getMetadata(), snapshot.getMetadata()))
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (jv.equal(((Snapshot) (obj)).getSnapshotContents(), snapshot.getSnapshotContents())) goto _L4; else goto _L5
_L5:
        return false;
    }

    static int b(Snapshot snapshot)
    {
        return jv.hashCode(new Object[] {
            snapshot.getMetadata(), snapshot.getSnapshotContents()
        });
    }

    static String c(Snapshot snapshot)
    {
        com.google.android.gms.internal.jv.a a1 = jv.h(snapshot).a("Metadata", snapshot.getMetadata());
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
        return afa.isClosed();
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

    public SnapshotMetadata getMetadata()
    {
        return aeZ;
    }

    public SnapshotContents getSnapshotContents()
    {
        if (isClosed())
        {
            return null;
        } else
        {
            return afa;
        }
    }

    public int getVersionCode()
    {
        return CK;
    }

    public int hashCode()
    {
        return b(this);
    }

    public boolean isDataValid()
    {
        return true;
    }

    public String toString()
    {
        return c(this);
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        SnapshotEntityCreator.a(this, parcel, i);
    }

}
