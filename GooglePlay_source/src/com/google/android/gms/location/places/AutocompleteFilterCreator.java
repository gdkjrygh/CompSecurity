// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.location.places:
//            AutocompleteFilter

public final class AutocompleteFilterCreator
    implements android.os.Parcelable.Creator
{

    public AutocompleteFilterCreator()
    {
    }

    static void writeToParcel$121d2c51(AutocompleteFilter autocompletefilter, Parcel parcel)
    {
        int i = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeBoolean(parcel, 1, autocompletefilter.mRestrictedToPlaces);
        SafeParcelWriter.writeInt(parcel, 1000, autocompletefilter.mVersionCode);
        SafeParcelWriter.writeIntegerList$62107c48(parcel, 2, autocompletefilter.mPlaceTypesList);
        SafeParcelWriter.finishVariableData(parcel, i);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        boolean flag = false;
        int j = SafeParcelReader.validateObjectHeader(parcel);
        java.util.ArrayList arraylist = null;
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
                    flag = SafeParcelReader.readBoolean(parcel, k);
                    break;

                case 1000: 
                    i = SafeParcelReader.readInt(parcel, k);
                    break;

                case 2: // '\002'
                    arraylist = SafeParcelReader.createIntegerList(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new AutocompleteFilter(i, flag, arraylist);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new AutocompleteFilter[i];
    }
}
