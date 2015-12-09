// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.location:
//            LocationAvailability

public final class LocationAvailabilityCreator
    implements android.os.Parcelable.Creator
{

    public LocationAvailabilityCreator()
    {
    }

    public static LocationAvailability createFromParcel(Parcel parcel)
    {
        int i1 = SafeParcelReader.validateObjectHeader(parcel);
        int l = 0;
        int k = 1000;
        int j = 1;
        int i = 1;
        long l1 = 0L;
        do
        {
            if (parcel.dataPosition() < i1)
            {
                int j1 = parcel.readInt();
                switch (0xffff & j1)
                {
                default:
                    SafeParcelReader.skipUnknownField(parcel, j1);
                    break;

                case 1: // '\001'
                    j = SafeParcelReader.readInt(parcel, j1);
                    break;

                case 1000: 
                    l = SafeParcelReader.readInt(parcel, j1);
                    break;

                case 2: // '\002'
                    i = SafeParcelReader.readInt(parcel, j1);
                    break;

                case 3: // '\003'
                    l1 = SafeParcelReader.readLong(parcel, j1);
                    break;

                case 4: // '\004'
                    k = SafeParcelReader.readInt(parcel, j1);
                    break;
                }
            } else
            if (parcel.dataPosition() != i1)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(i1).toString(), parcel);
            } else
            {
                return new LocationAvailability(l, k, j, i, l1);
            }
        } while (true);
    }

    static void writeToParcel$13ba70a6(LocationAvailability locationavailability, Parcel parcel)
    {
        int i = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeInt(parcel, 1, locationavailability.mCellStatus);
        SafeParcelWriter.writeInt(parcel, 1000, locationavailability.mVersionCode);
        SafeParcelWriter.writeInt(parcel, 2, locationavailability.mWifiStatus);
        SafeParcelWriter.writeLong(parcel, 3, locationavailability.mElapsedRealtimeNs);
        SafeParcelWriter.writeInt(parcel, 4, locationavailability.mLocationStatus);
        SafeParcelWriter.finishVariableData(parcel, i);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        return createFromParcel(parcel);
    }

    public final volatile Object[] newArray(int i)
    {
        return new LocationAvailability[i];
    }
}
