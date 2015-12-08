// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.snapshot;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.games.snapshot:
//            SnapshotEntity, SnapshotMetadataEntity, SnapshotContentsEntity

public class SnapshotEntityCreator
    implements android.os.Parcelable.Creator
{

    public static final int CONTENT_DESCRIPTION = 0;

    public SnapshotEntityCreator()
    {
    }

    static void a(SnapshotEntity snapshotentity, Parcel parcel, int i)
    {
        int j = b.H(parcel);
        b.a(parcel, 1, snapshotentity.getMetadata(), i, false);
        b.c(parcel, 1000, snapshotentity.getVersionCode());
        b.a(parcel, 3, snapshotentity.getSnapshotContents(), i, false);
        b.H(parcel, j);
    }

    public SnapshotEntity createFromParcel(Parcel parcel)
    {
        SnapshotContentsEntity snapshotcontentsentity = null;
        int j = com.google.android.gms.common.internal.safeparcel.a.G(parcel);
        int i = 0;
        SnapshotMetadataEntity snapshotmetadataentity = null;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = com.google.android.gms.common.internal.safeparcel.a.F(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.aH(k))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, k);
                    break;

                case 1: // '\001'
                    snapshotmetadataentity = (SnapshotMetadataEntity)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, SnapshotMetadataEntity.CREATOR);
                    break;

                case 1000: 
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, k);
                    break;

                case 3: // '\003'
                    snapshotcontentsentity = (SnapshotContentsEntity)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, SnapshotContentsEntity.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new SnapshotEntity(i, snapshotmetadataentity, snapshotcontentsentity);
            }
        } while (true);
    }

    public volatile Object createFromParcel(Parcel parcel)
    {
        return createFromParcel(parcel);
    }

    public SnapshotEntity[] newArray(int i)
    {
        return new SnapshotEntity[i];
    }

    public volatile Object[] newArray(int i)
    {
        return newArray(i);
    }
}
