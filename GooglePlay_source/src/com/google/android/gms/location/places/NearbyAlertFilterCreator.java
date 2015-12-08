// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.location.places:
//            NearbyAlertFilter, UserDataType

public final class NearbyAlertFilterCreator
    implements android.os.Parcelable.Creator
{

    public NearbyAlertFilterCreator()
    {
    }

    static void writeToParcel$53f94818(NearbyAlertFilter nearbyalertfilter, Parcel parcel)
    {
        int i = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeStringList(parcel, 1, nearbyalertfilter.mPlaceIdsList, false);
        SafeParcelWriter.writeInt(parcel, 1000, nearbyalertfilter.mVersionCode);
        SafeParcelWriter.writeIntegerList$62107c48(parcel, 2, nearbyalertfilter.mPlaceTypesList);
        SafeParcelWriter.writeTypedList(parcel, 3, nearbyalertfilter.mRequestedUserDataTypesList, false);
        SafeParcelWriter.finishVariableData(parcel, i);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        java.util.ArrayList arraylist2 = null;
        int j = SafeParcelReader.validateObjectHeader(parcel);
        java.util.ArrayList arraylist = null;
        int i = 0;
        java.util.ArrayList arraylist1 = null;
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
                    arraylist = SafeParcelReader.createStringList(parcel, k);
                    break;

                case 1000: 
                    i = SafeParcelReader.readInt(parcel, k);
                    break;

                case 2: // '\002'
                    arraylist1 = SafeParcelReader.createIntegerList(parcel, k);
                    break;

                case 3: // '\003'
                    arraylist2 = SafeParcelReader.createTypedList(parcel, k, UserDataType.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new NearbyAlertFilter(i, arraylist, arraylist1, arraylist2);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new NearbyAlertFilter[i];
    }
}
