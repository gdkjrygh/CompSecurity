// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.location:
//            LocationSettingsStates

public final class LocationSettingsStatesCreator
    implements android.os.Parcelable.Creator
{

    public LocationSettingsStatesCreator()
    {
    }

    static void writeToParcel$511ad450(LocationSettingsStates locationsettingsstates, Parcel parcel)
    {
        int i = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeBoolean(parcel, 1, locationsettingsstates.mGpsUsable);
        SafeParcelWriter.writeInt(parcel, 1000, locationsettingsstates.mVersionCode);
        SafeParcelWriter.writeBoolean(parcel, 2, locationsettingsstates.mNlpUsable);
        SafeParcelWriter.writeBoolean(parcel, 3, locationsettingsstates.mBleUsable);
        SafeParcelWriter.writeBoolean(parcel, 4, locationsettingsstates.mGpsPresent);
        SafeParcelWriter.writeBoolean(parcel, 5, locationsettingsstates.mNlpPresent);
        SafeParcelWriter.writeBoolean(parcel, 6, locationsettingsstates.mBlePresent);
        SafeParcelWriter.finishVariableData(parcel, i);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        boolean flag = false;
        int j = SafeParcelReader.validateObjectHeader(parcel);
        boolean flag1 = false;
        boolean flag2 = false;
        boolean flag3 = false;
        boolean flag4 = false;
        boolean flag5 = false;
        int i = 0;
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
                    flag5 = SafeParcelReader.readBoolean(parcel, k);
                    break;

                case 1000: 
                    i = SafeParcelReader.readInt(parcel, k);
                    break;

                case 2: // '\002'
                    flag4 = SafeParcelReader.readBoolean(parcel, k);
                    break;

                case 3: // '\003'
                    flag3 = SafeParcelReader.readBoolean(parcel, k);
                    break;

                case 4: // '\004'
                    flag2 = SafeParcelReader.readBoolean(parcel, k);
                    break;

                case 5: // '\005'
                    flag1 = SafeParcelReader.readBoolean(parcel, k);
                    break;

                case 6: // '\006'
                    flag = SafeParcelReader.readBoolean(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new LocationSettingsStates(i, flag5, flag4, flag3, flag2, flag1, flag);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new LocationSettingsStates[i];
    }
}
