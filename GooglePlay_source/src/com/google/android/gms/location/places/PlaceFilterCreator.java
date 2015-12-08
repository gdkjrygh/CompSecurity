// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.location.places:
//            PlaceFilter, UserDataType

public final class PlaceFilterCreator
    implements android.os.Parcelable.Creator
{

    public PlaceFilterCreator()
    {
    }

    static void writeToParcel$6e88bb52(PlaceFilter placefilter, Parcel parcel)
    {
        int i = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeIntegerList$62107c48(parcel, 1, placefilter.mPlaceTypesList);
        SafeParcelWriter.writeInt(parcel, 1000, placefilter.mVersionCode);
        SafeParcelWriter.writeBoolean(parcel, 3, placefilter.mRequireOpenNow);
        SafeParcelWriter.writeTypedList(parcel, 4, placefilter.mRequestedUserDataTypesList, false);
        SafeParcelWriter.writeStringList(parcel, 6, placefilter.mPlaceIdsList, false);
        SafeParcelWriter.finishVariableData(parcel, i);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        boolean flag = false;
        java.util.ArrayList arraylist = null;
        int j = SafeParcelReader.validateObjectHeader(parcel);
        java.util.ArrayList arraylist1 = null;
        java.util.ArrayList arraylist2 = null;
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
                    arraylist2 = SafeParcelReader.createIntegerList(parcel, k);
                    break;

                case 1000: 
                    i = SafeParcelReader.readInt(parcel, k);
                    break;

                case 3: // '\003'
                    flag = SafeParcelReader.readBoolean(parcel, k);
                    break;

                case 4: // '\004'
                    arraylist = SafeParcelReader.createTypedList(parcel, k, UserDataType.CREATOR);
                    break;

                case 6: // '\006'
                    arraylist1 = SafeParcelReader.createStringList(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new PlaceFilter(i, arraylist2, flag, arraylist1, arraylist);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new PlaceFilter[i];
    }
}
