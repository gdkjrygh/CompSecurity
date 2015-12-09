// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.drive:
//            DriveId

public final class DriveIdCreator
    implements android.os.Parcelable.Creator
{

    public DriveIdCreator()
    {
    }

    static void writeToParcel$1b74a21c(DriveId driveid, Parcel parcel)
    {
        int i = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeInt(parcel, 1, driveid.mVersionCode);
        SafeParcelWriter.writeString(parcel, 2, driveid.mResourceId, false);
        SafeParcelWriter.writeLong(parcel, 3, driveid.mSqlId);
        SafeParcelWriter.writeLong(parcel, 4, driveid.mDatabaseInstanceId);
        SafeParcelWriter.writeInt(parcel, 5, driveid.mResourceType);
        SafeParcelWriter.finishVariableData(parcel, i);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        long l1 = 0L;
        int k = SafeParcelReader.validateObjectHeader(parcel);
        int j = 0;
        String s = null;
        int i = -1;
        long l2 = 0L;
        do
        {
            if (parcel.dataPosition() < k)
            {
                int l = parcel.readInt();
                switch (0xffff & l)
                {
                default:
                    SafeParcelReader.skipUnknownField(parcel, l);
                    break;

                case 1: // '\001'
                    j = SafeParcelReader.readInt(parcel, l);
                    break;

                case 2: // '\002'
                    s = SafeParcelReader.createString(parcel, l);
                    break;

                case 3: // '\003'
                    l2 = SafeParcelReader.readLong(parcel, l);
                    break;

                case 4: // '\004'
                    l1 = SafeParcelReader.readLong(parcel, l);
                    break;

                case 5: // '\005'
                    i = SafeParcelReader.readInt(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
            } else
            {
                return new DriveId(j, s, l2, l1, i);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new DriveId[i];
    }
}
