// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.drive:
//            DriveFileRange

public final class DriveFileRangeCreator
    implements android.os.Parcelable.Creator
{

    public DriveFileRangeCreator()
    {
    }

    static void writeToParcel$11ed83c(DriveFileRange drivefilerange, Parcel parcel)
    {
        int i = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeInt(parcel, 1, drivefilerange.mVersionCode);
        SafeParcelWriter.writeLong(parcel, 2, drivefilerange.mFromByte);
        SafeParcelWriter.writeLong(parcel, 3, drivefilerange.mToByte);
        SafeParcelWriter.finishVariableData(parcel, i);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        long l = 0L;
        int j = SafeParcelReader.validateObjectHeader(parcel);
        int i = 0;
        long l1 = 0L;
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
                    i = SafeParcelReader.readInt(parcel, k);
                    break;

                case 2: // '\002'
                    l1 = SafeParcelReader.readLong(parcel, k);
                    break;

                case 3: // '\003'
                    l = SafeParcelReader.readLong(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new DriveFileRange(i, l1, l);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new DriveFileRange[i];
    }
}
