// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.snapshot;

import android.os.Parcel;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.games.snapshot:
//            Snapshot, SnapshotEntityCreator, SnapshotMetadataEntity, SnapshotContentsEntity, 
//            SnapshotMetadata, SnapshotContents

public final class SnapshotEntity
    implements SafeParcelable, Snapshot
{

    public static final android.os.Parcelable.Creator CREATOR = new SnapshotEntityCreator();
    final SnapshotMetadataEntity mMetadata;
    private final SnapshotContentsEntity mSnapshotContents;
    final int mVersionCode;

    SnapshotEntity(int i, SnapshotMetadata snapshotmetadata, SnapshotContentsEntity snapshotcontentsentity)
    {
        mVersionCode = i;
        mMetadata = new SnapshotMetadataEntity(snapshotmetadata);
        mSnapshotContents = snapshotcontentsentity;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        if (!(obj instanceof Snapshot)) goto _L2; else goto _L1
_L1:
        if (this != obj) goto _L4; else goto _L3
_L3:
        return true;
_L4:
        if (Objects.equal(((Snapshot) (obj = (Snapshot)obj)).getMetadata(), getMetadata()) && Objects.equal(((Snapshot) (obj)).getSnapshotContents(), getSnapshotContents())) goto _L3; else goto _L2
_L2:
        return false;
    }

    public final volatile Object freeze()
    {
        return this;
    }

    public final SnapshotMetadata getMetadata()
    {
        return mMetadata;
    }

    public final SnapshotContents getSnapshotContents()
    {
        boolean flag;
        if (mSnapshotContents.mContents == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            return null;
        } else
        {
            return mSnapshotContents;
        }
    }

    public final int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            getMetadata(), getSnapshotContents()
        });
    }

    public final boolean isDataValid()
    {
        return true;
    }

    public final String toString()
    {
        com.google.android.gms.common.internal.Objects.ToStringHelper tostringhelper = Objects.toStringHelper(this).add("Metadata", getMetadata());
        boolean flag;
        if (getSnapshotContents() != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return tostringhelper.add("HasContents", Boolean.valueOf(flag)).toString();
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        SnapshotEntityCreator.writeToParcel(this, parcel, i);
    }

}
