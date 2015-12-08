// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.snapshot;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.games.snapshot:
//            SnapshotMetadataChangeEntity

public final class SnapshotMetadataChangeCreator
    implements android.os.Parcelable.Creator
{

    public SnapshotMetadataChangeCreator()
    {
    }

    public static SnapshotMetadataChangeEntity createFromParcel(Parcel parcel)
    {
        int j = SafeParcelReader.validateObjectHeader(parcel);
        int i = 0;
        String s = null;
        Long long2 = null;
        BitmapTeleporter bitmapteleporter = null;
        Uri uri = null;
        Long long1 = null;
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
                    s = SafeParcelReader.createString(parcel, k);
                    break;

                case 1000: 
                    i = SafeParcelReader.readInt(parcel, k);
                    break;

                case 2: // '\002'
                    long2 = SafeParcelReader.readLongObject(parcel, k);
                    break;

                case 4: // '\004'
                    uri = (Uri)SafeParcelReader.createParcelable(parcel, k, Uri.CREATOR);
                    break;

                case 5: // '\005'
                    bitmapteleporter = (BitmapTeleporter)SafeParcelReader.createParcelable(parcel, k, BitmapTeleporter.CREATOR);
                    break;

                case 6: // '\006'
                    long1 = SafeParcelReader.readLongObject(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new SnapshotMetadataChangeEntity(i, s, long2, bitmapteleporter, uri, long1);
            }
        } while (true);
    }

    static void writeToParcel(SnapshotMetadataChangeEntity snapshotmetadatachangeentity, Parcel parcel, int i)
    {
        int j = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeString(parcel, 1, snapshotmetadatachangeentity.mDescription, false);
        SafeParcelWriter.writeInt(parcel, 1000, snapshotmetadatachangeentity.mVersionCode);
        SafeParcelWriter.writeLongObject$53422a(parcel, 2, snapshotmetadatachangeentity.mPlayedTime);
        SafeParcelWriter.writeParcelable(parcel, 4, snapshotmetadatachangeentity.mCoverImageUri, i, false);
        SafeParcelWriter.writeParcelable(parcel, 5, snapshotmetadatachangeentity.mCoverImageTeleporter, i, false);
        SafeParcelWriter.writeLongObject$53422a(parcel, 6, snapshotmetadatachangeentity.mProgressValue);
        SafeParcelWriter.finishVariableData(parcel, j);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        return createFromParcel(parcel);
    }

    public final volatile Object[] newArray(int i)
    {
        return new SnapshotMetadataChangeEntity[i];
    }
}
