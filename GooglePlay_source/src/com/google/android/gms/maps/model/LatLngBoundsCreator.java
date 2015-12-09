// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.maps.model:
//            LatLngBounds, LatLng

public final class LatLngBoundsCreator
    implements android.os.Parcelable.Creator
{

    public LatLngBoundsCreator()
    {
    }

    static void writeToParcel(LatLngBounds latlngbounds, Parcel parcel, int i)
    {
        int j = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeInt(parcel, 1, latlngbounds.mVersionCode);
        SafeParcelWriter.writeParcelable(parcel, 2, latlngbounds.southwest, i, false);
        SafeParcelWriter.writeParcelable(parcel, 3, latlngbounds.northeast, i, false);
        SafeParcelWriter.finishVariableData(parcel, j);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        int j = SafeParcelReader.validateObjectHeader(parcel);
        LatLng latlng = null;
        int i = 0;
        LatLng latlng1 = null;
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
                    latlng = (LatLng)SafeParcelReader.createParcelable(parcel, k, LatLng.CREATOR);
                    break;

                case 3: // '\003'
                    latlng1 = (LatLng)SafeParcelReader.createParcelable(parcel, k, LatLng.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new LatLngBounds(i, latlng, latlng1);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new LatLngBounds[i];
    }
}
