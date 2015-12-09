// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.maps.model:
//            LatLng

public final class LatLngCreator
    implements android.os.Parcelable.Creator
{

    public LatLngCreator()
    {
    }

    static void writeToParcel$7afccc40(LatLng latlng, Parcel parcel)
    {
        int i = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeInt(parcel, 1, latlng.mVersionCode);
        SafeParcelWriter.writeDouble(parcel, 2, latlng.latitude);
        SafeParcelWriter.writeDouble(parcel, 3, latlng.longitude);
        SafeParcelWriter.finishVariableData(parcel, i);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        double d = 0.0D;
        int j = SafeParcelReader.validateObjectHeader(parcel);
        int i = 0;
        double d1 = 0.0D;
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
                    d1 = SafeParcelReader.readDouble(parcel, k);
                    break;

                case 3: // '\003'
                    d = SafeParcelReader.readDouble(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new LatLng(i, d1, d);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new LatLng[i];
    }
}
