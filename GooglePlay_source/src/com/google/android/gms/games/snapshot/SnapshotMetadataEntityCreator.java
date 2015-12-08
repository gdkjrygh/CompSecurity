// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.snapshot;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.games.PlayerEntity;

// Referenced classes of package com.google.android.gms.games.snapshot:
//            SnapshotMetadataEntity

public final class SnapshotMetadataEntityCreator
    implements android.os.Parcelable.Creator
{

    public SnapshotMetadataEntityCreator()
    {
    }

    static void writeToParcel(SnapshotMetadataEntity snapshotmetadataentity, Parcel parcel, int i)
    {
        int j = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeParcelable(parcel, 1, snapshotmetadataentity.mGame, i, false);
        SafeParcelWriter.writeInt(parcel, 1000, snapshotmetadataentity.mVersionCode);
        SafeParcelWriter.writeParcelable(parcel, 2, snapshotmetadataentity.mOwner, i, false);
        SafeParcelWriter.writeString(parcel, 3, snapshotmetadataentity.mSnapshotId, false);
        SafeParcelWriter.writeParcelable(parcel, 5, snapshotmetadataentity.mCoverImageUri, i, false);
        SafeParcelWriter.writeString(parcel, 6, snapshotmetadataentity.mCoverImageUrl, false);
        SafeParcelWriter.writeString(parcel, 7, snapshotmetadataentity.mTitle, false);
        SafeParcelWriter.writeString(parcel, 8, snapshotmetadataentity.mDescription, false);
        SafeParcelWriter.writeLong(parcel, 9, snapshotmetadataentity.mLastModifiedTimestamp);
        SafeParcelWriter.writeLong(parcel, 10, snapshotmetadataentity.mPlayedTime);
        SafeParcelWriter.writeFloat(parcel, 11, snapshotmetadataentity.mCoverImageAspectRatio);
        SafeParcelWriter.writeString(parcel, 12, snapshotmetadataentity.mUniqueName, false);
        SafeParcelWriter.writeBoolean(parcel, 13, snapshotmetadataentity.mChangePending);
        SafeParcelWriter.writeLong(parcel, 14, snapshotmetadataentity.mProgressValue);
        SafeParcelWriter.writeString(parcel, 15, snapshotmetadataentity.mDeviceName, false);
        SafeParcelWriter.finishVariableData(parcel, j);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        int j = SafeParcelReader.validateObjectHeader(parcel);
        int i = 0;
        GameEntity gameentity = null;
        PlayerEntity playerentity = null;
        String s5 = null;
        Uri uri = null;
        String s4 = null;
        String s3 = null;
        String s2 = null;
        long l2 = 0L;
        long l1 = 0L;
        float f = 0.0F;
        String s1 = null;
        boolean flag = false;
        long l = 0L;
        String s = null;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = parcel.readInt();
                switch (0xffff & k)
                {
                default:
                    SafeParcelReader.skipUnknownField(parcel, k);
                    break;

                case 1: // '\001'
                    gameentity = (GameEntity)SafeParcelReader.createParcelable(parcel, k, GameEntity.CREATOR);
                    break;

                case 1000: 
                    i = SafeParcelReader.readInt(parcel, k);
                    break;

                case 2: // '\002'
                    playerentity = (PlayerEntity)SafeParcelReader.createParcelable(parcel, k, PlayerEntity.CREATOR);
                    break;

                case 3: // '\003'
                    s5 = SafeParcelReader.createString(parcel, k);
                    break;

                case 5: // '\005'
                    uri = (Uri)SafeParcelReader.createParcelable(parcel, k, Uri.CREATOR);
                    break;

                case 6: // '\006'
                    s4 = SafeParcelReader.createString(parcel, k);
                    break;

                case 7: // '\007'
                    s3 = SafeParcelReader.createString(parcel, k);
                    break;

                case 8: // '\b'
                    s2 = SafeParcelReader.createString(parcel, k);
                    break;

                case 9: // '\t'
                    l2 = SafeParcelReader.readLong(parcel, k);
                    break;

                case 10: // '\n'
                    l1 = SafeParcelReader.readLong(parcel, k);
                    break;

                case 11: // '\013'
                    f = SafeParcelReader.readFloat(parcel, k);
                    break;

                case 12: // '\f'
                    s1 = SafeParcelReader.createString(parcel, k);
                    break;

                case 13: // '\r'
                    flag = SafeParcelReader.readBoolean(parcel, k);
                    break;

                case 14: // '\016'
                    l = SafeParcelReader.readLong(parcel, k);
                    break;

                case 15: // '\017'
                    s = SafeParcelReader.createString(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new SnapshotMetadataEntity(i, gameentity, playerentity, s5, uri, s4, s3, s2, l2, l1, f, s1, flag, l, s);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new SnapshotMetadataEntity[i];
    }
}
