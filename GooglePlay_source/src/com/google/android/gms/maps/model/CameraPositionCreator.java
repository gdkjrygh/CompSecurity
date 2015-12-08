// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.maps.model:
//            CameraPosition, LatLng

public final class CameraPositionCreator
    implements android.os.Parcelable.Creator
{

    public CameraPositionCreator()
    {
    }

    static void writeToParcel(CameraPosition cameraposition, Parcel parcel, int i)
    {
        int j = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeInt(parcel, 1, cameraposition.mVersionCode);
        SafeParcelWriter.writeParcelable(parcel, 2, cameraposition.target, i, false);
        SafeParcelWriter.writeFloat(parcel, 3, cameraposition.zoom);
        SafeParcelWriter.writeFloat(parcel, 4, cameraposition.tilt);
        SafeParcelWriter.writeFloat(parcel, 5, cameraposition.bearing);
        SafeParcelWriter.finishVariableData(parcel, j);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        float f = 0.0F;
        int j = SafeParcelReader.validateObjectHeader(parcel);
        int i = 0;
        LatLng latlng = null;
        float f1 = 0.0F;
        float f2 = 0.0F;
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
                    f2 = SafeParcelReader.readFloat(parcel, k);
                    break;

                case 4: // '\004'
                    f1 = SafeParcelReader.readFloat(parcel, k);
                    break;

                case 5: // '\005'
                    f = SafeParcelReader.readFloat(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new CameraPosition(i, latlng, f2, f1, f);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new CameraPosition[i];
    }
}
