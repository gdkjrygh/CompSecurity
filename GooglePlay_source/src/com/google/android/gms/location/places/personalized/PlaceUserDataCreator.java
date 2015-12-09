// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places.personalized;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.location.places.personalized:
//            PlaceUserData, PlaceAlias

public final class PlaceUserDataCreator
    implements android.os.Parcelable.Creator
{

    public PlaceUserDataCreator()
    {
    }

    static void writeToParcel$328ccc6e(PlaceUserData placeuserdata, Parcel parcel)
    {
        int i = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeString(parcel, 1, placeuserdata.mAccountName, false);
        SafeParcelWriter.writeInt(parcel, 1000, placeuserdata.mVersionCode);
        SafeParcelWriter.writeString(parcel, 2, placeuserdata.mPlaceId, false);
        SafeParcelWriter.writeTypedList(parcel, 6, placeuserdata.mPlaceAliases, false);
        SafeParcelWriter.finishVariableData(parcel, i);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        java.util.ArrayList arraylist = null;
        int j = SafeParcelReader.validateObjectHeader(parcel);
        String s = null;
        int i = 0;
        String s1 = null;
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
                    s1 = SafeParcelReader.createString(parcel, k);
                    break;

                case 6: // '\006'
                    arraylist = SafeParcelReader.createTypedList(parcel, k, PlaceAlias.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new PlaceUserData(i, s, s1, arraylist);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new PlaceUserData[i];
    }
}
