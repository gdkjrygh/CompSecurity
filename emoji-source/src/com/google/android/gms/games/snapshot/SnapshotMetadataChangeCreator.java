// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.snapshot;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.games.snapshot:
//            SnapshotMetadataChange

public class SnapshotMetadataChangeCreator
    implements android.os.Parcelable.Creator
{

    public static final int CONTENT_DESCRIPTION = 0;

    public SnapshotMetadataChangeCreator()
    {
    }

    static void a(SnapshotMetadataChange snapshotmetadatachange, Parcel parcel, int i)
    {
        int j = b.C(parcel);
        b.a(parcel, 1, snapshotmetadatachange.getDescription(), false);
        b.c(parcel, 1000, snapshotmetadatachange.getVersionCode());
        b.a(parcel, 2, snapshotmetadatachange.getPlayedTimeMillis(), false);
        b.a(parcel, 4, snapshotmetadatachange.getCoverImageUri(), i, false);
        b.a(parcel, 5, snapshotmetadatachange.iN(), i, false);
        b.G(parcel, j);
    }

    public SnapshotMetadataChange createFromParcel(Parcel parcel)
    {
        Uri uri = null;
        int j = com.google.android.gms.common.internal.safeparcel.a.B(parcel);
        int i = 0;
        com.google.android.gms.common.data.a a1 = null;
        Long long1 = null;
        String s = null;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = com.google.android.gms.common.internal.safeparcel.a.A(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.ar(k))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, k);
                    break;

                case 1: // '\001'
                    s = com.google.android.gms.common.internal.safeparcel.a.o(parcel, k);
                    break;

                case 1000: 
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, k);
                    break;

                case 2: // '\002'
                    long1 = com.google.android.gms.common.internal.safeparcel.a.j(parcel, k);
                    break;

                case 4: // '\004'
                    uri = (Uri)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, Uri.CREATOR);
                    break;

                case 5: // '\005'
                    a1 = (com.google.android.gms.common.data.a)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, com.google.android.gms.common.data.a.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new SnapshotMetadataChange(i, s, long1, a1, uri);
            }
        } while (true);
    }

    public volatile Object createFromParcel(Parcel parcel)
    {
        return createFromParcel(parcel);
    }

    public SnapshotMetadataChange[] newArray(int i)
    {
        return new SnapshotMetadataChange[i];
    }

    public volatile Object[] newArray(int i)
    {
        return newArray(i);
    }
}
