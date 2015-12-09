// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.maps.model:
//            StreetViewPanoramaCamera

public final class StreetViewPanoramaCameraCreator
    implements android.os.Parcelable.Creator
{

    public StreetViewPanoramaCameraCreator()
    {
    }

    static void writeToParcel$31dd21c(StreetViewPanoramaCamera streetviewpanoramacamera, Parcel parcel)
    {
        int i = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeInt(parcel, 1, streetviewpanoramacamera.mVersionCode);
        SafeParcelWriter.writeFloat(parcel, 2, streetviewpanoramacamera.zoom);
        SafeParcelWriter.writeFloat(parcel, 3, streetviewpanoramacamera.tilt);
        SafeParcelWriter.writeFloat(parcel, 4, streetviewpanoramacamera.bearing);
        SafeParcelWriter.finishVariableData(parcel, i);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        float f2 = 0.0F;
        int j = SafeParcelReader.validateObjectHeader(parcel);
        float f = 0.0F;
        int i = 0;
        float f1 = 0.0F;
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
                    f = SafeParcelReader.readFloat(parcel, k);
                    break;

                case 3: // '\003'
                    f1 = SafeParcelReader.readFloat(parcel, k);
                    break;

                case 4: // '\004'
                    f2 = SafeParcelReader.readFloat(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new StreetViewPanoramaCamera(i, f, f1, f2);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new StreetViewPanoramaCamera[i];
    }
}
