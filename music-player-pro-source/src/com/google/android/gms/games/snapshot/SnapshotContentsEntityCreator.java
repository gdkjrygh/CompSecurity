// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.snapshot;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.drive.Contents;

// Referenced classes of package com.google.android.gms.games.snapshot:
//            SnapshotContentsEntity

public class SnapshotContentsEntityCreator
    implements android.os.Parcelable.Creator
{

    public SnapshotContentsEntityCreator()
    {
    }

    static void a(SnapshotContentsEntity snapshotcontentsentity, Parcel parcel, int i)
    {
        int j = b.H(parcel);
        b.a(parcel, 1, snapshotcontentsentity.ir(), i, false);
        b.c(parcel, 1000, snapshotcontentsentity.getVersionCode());
        b.H(parcel, j);
    }

    public SnapshotContentsEntity cD(Parcel parcel)
    {
        int j = com.google.android.gms.common.internal.safeparcel.a.G(parcel);
        int i = 0;
        Contents contents = null;
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
                    contents = (Contents)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, Contents.CREATOR);
                    break;

                case 1000: 
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new SnapshotContentsEntity(i, contents);
            }
        } while (true);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return cD(parcel);
    }

    public SnapshotContentsEntity[] eq(int i)
    {
        return new SnapshotContentsEntity[i];
    }

    public Object[] newArray(int i)
    {
        return eq(i);
    }
}
