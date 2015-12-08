// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.snapshot;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.games.PlayerEntity;

// Referenced classes of package com.google.android.gms.games.snapshot:
//            SnapshotMetadataEntity

public class SnapshotMetadataEntityCreator
    implements android.os.Parcelable.Creator
{

    public static final int CONTENT_DESCRIPTION = 0;

    public SnapshotMetadataEntityCreator()
    {
    }

    static void a(SnapshotMetadataEntity snapshotmetadataentity, Parcel parcel, int i)
    {
        int j = b.C(parcel);
        b.a(parcel, 1, snapshotmetadataentity.getGame(), i, false);
        b.c(parcel, 1000, snapshotmetadataentity.getVersionCode());
        b.a(parcel, 2, snapshotmetadataentity.getOwner(), i, false);
        b.a(parcel, 3, snapshotmetadataentity.getSnapshotId(), false);
        b.a(parcel, 5, snapshotmetadataentity.getCoverImageUri(), i, false);
        b.a(parcel, 6, snapshotmetadataentity.getCoverImageUrl(), false);
        b.a(parcel, 7, snapshotmetadataentity.getTitle(), false);
        b.a(parcel, 8, snapshotmetadataentity.getDescription(), false);
        b.a(parcel, 9, snapshotmetadataentity.getLastModifiedTimestamp());
        b.a(parcel, 10, snapshotmetadataentity.getPlayedTime());
        b.a(parcel, 11, snapshotmetadataentity.getCoverImageAspectRatio());
        b.a(parcel, 12, snapshotmetadataentity.getUniqueName(), false);
        b.G(parcel, j);
    }

    public SnapshotMetadataEntity createFromParcel(Parcel parcel)
    {
        int j = com.google.android.gms.common.internal.safeparcel.a.B(parcel);
        int i = 0;
        GameEntity gameentity = null;
        PlayerEntity playerentity = null;
        String s4 = null;
        Uri uri = null;
        String s3 = null;
        String s2 = null;
        String s1 = null;
        long l1 = 0L;
        long l = 0L;
        float f = 0.0F;
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
                    gameentity = (GameEntity)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, GameEntity.CREATOR);
                    break;

                case 1000: 
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, k);
                    break;

                case 2: // '\002'
                    playerentity = (PlayerEntity)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, PlayerEntity.CREATOR);
                    break;

                case 3: // '\003'
                    s4 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, k);
                    break;

                case 5: // '\005'
                    uri = (Uri)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, Uri.CREATOR);
                    break;

                case 6: // '\006'
                    s3 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, k);
                    break;

                case 7: // '\007'
                    s2 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, k);
                    break;

                case 8: // '\b'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, k);
                    break;

                case 9: // '\t'
                    l1 = com.google.android.gms.common.internal.safeparcel.a.i(parcel, k);
                    break;

                case 10: // '\n'
                    l = com.google.android.gms.common.internal.safeparcel.a.i(parcel, k);
                    break;

                case 11: // '\013'
                    f = com.google.android.gms.common.internal.safeparcel.a.l(parcel, k);
                    break;

                case 12: // '\f'
                    s = com.google.android.gms.common.internal.safeparcel.a.o(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new SnapshotMetadataEntity(i, gameentity, playerentity, s4, uri, s3, s2, s1, l1, l, f, s);
            }
        } while (true);
    }

    public volatile Object createFromParcel(Parcel parcel)
    {
        return createFromParcel(parcel);
    }

    public SnapshotMetadataEntity[] newArray(int i)
    {
        return new SnapshotMetadataEntity[i];
    }

    public volatile Object[] newArray(int i)
    {
        return newArray(i);
    }
}
