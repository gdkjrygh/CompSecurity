// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.maps.model:
//            PolylineOptions, LatLng

public final class PolylineOptionsCreator
    implements android.os.Parcelable.Creator
{

    public PolylineOptionsCreator()
    {
    }

    static void writeToParcel$37f6d9f8(PolylineOptions polylineoptions, Parcel parcel)
    {
        int i = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeInt(parcel, 1, polylineoptions.mVersionCode);
        SafeParcelWriter.writeTypedList(parcel, 2, polylineoptions.mPoints, false);
        SafeParcelWriter.writeFloat(parcel, 3, polylineoptions.mWidth);
        SafeParcelWriter.writeInt(parcel, 4, polylineoptions.mColor);
        SafeParcelWriter.writeFloat(parcel, 5, polylineoptions.mZIndex);
        SafeParcelWriter.writeBoolean(parcel, 6, polylineoptions.mVisible);
        SafeParcelWriter.writeBoolean(parcel, 7, polylineoptions.mGeodesic);
        SafeParcelWriter.finishVariableData(parcel, i);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        float f = 0.0F;
        boolean flag = false;
        int k = SafeParcelReader.validateObjectHeader(parcel);
        java.util.ArrayList arraylist = null;
        boolean flag1 = false;
        int i = 0;
        float f1 = 0.0F;
        int j = 0;
        do
        {
            if (parcel.dataPosition() < k)
            {
                int l = parcel.readInt();
                switch (0xffff & l)
                {
                default:
                    SafeParcelReader.skipUnknownField(parcel, l);
                    break;

                case 1: // '\001'
                    j = SafeParcelReader.readInt(parcel, l);
                    break;

                case 2: // '\002'
                    arraylist = SafeParcelReader.createTypedList(parcel, l, LatLng.CREATOR);
                    break;

                case 3: // '\003'
                    f1 = SafeParcelReader.readFloat(parcel, l);
                    break;

                case 4: // '\004'
                    i = SafeParcelReader.readInt(parcel, l);
                    break;

                case 5: // '\005'
                    f = SafeParcelReader.readFloat(parcel, l);
                    break;

                case 6: // '\006'
                    flag1 = SafeParcelReader.readBoolean(parcel, l);
                    break;

                case 7: // '\007'
                    flag = SafeParcelReader.readBoolean(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
            } else
            {
                return new PolylineOptions(j, arraylist, f1, i, f, flag1, flag);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new PolylineOptions[i];
    }
}
