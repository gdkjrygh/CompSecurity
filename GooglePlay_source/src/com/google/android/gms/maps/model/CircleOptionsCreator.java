// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.maps.model:
//            CircleOptions, LatLng

public final class CircleOptionsCreator
    implements android.os.Parcelable.Creator
{

    public CircleOptionsCreator()
    {
    }

    static void writeToParcel(CircleOptions circleoptions, Parcel parcel, int i)
    {
        int j = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeInt(parcel, 1, circleoptions.mVersionCode);
        SafeParcelWriter.writeParcelable(parcel, 2, circleoptions.mCenter, i, false);
        SafeParcelWriter.writeDouble(parcel, 3, circleoptions.mRadius);
        SafeParcelWriter.writeFloat(parcel, 4, circleoptions.mStrokeWidth);
        SafeParcelWriter.writeInt(parcel, 5, circleoptions.mStrokeColor);
        SafeParcelWriter.writeInt(parcel, 6, circleoptions.mFillColor);
        SafeParcelWriter.writeFloat(parcel, 7, circleoptions.mZIndex);
        SafeParcelWriter.writeBoolean(parcel, 8, circleoptions.mVisible);
        SafeParcelWriter.finishVariableData(parcel, j);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        float f = 0.0F;
        boolean flag = false;
        int l = SafeParcelReader.validateObjectHeader(parcel);
        LatLng latlng = null;
        double d = 0.0D;
        int i = 0;
        int j = 0;
        float f1 = 0.0F;
        int k = 0;
        do
        {
            if (parcel.dataPosition() < l)
            {
                int i1 = parcel.readInt();
                switch (0xffff & i1)
                {
                default:
                    SafeParcelReader.skipUnknownField(parcel, i1);
                    break;

                case 1: // '\001'
                    k = SafeParcelReader.readInt(parcel, i1);
                    break;

                case 2: // '\002'
                    latlng = (LatLng)SafeParcelReader.createParcelable(parcel, i1, LatLng.CREATOR);
                    break;

                case 3: // '\003'
                    d = SafeParcelReader.readDouble(parcel, i1);
                    break;

                case 4: // '\004'
                    f1 = SafeParcelReader.readFloat(parcel, i1);
                    break;

                case 5: // '\005'
                    j = SafeParcelReader.readInt(parcel, i1);
                    break;

                case 6: // '\006'
                    i = SafeParcelReader.readInt(parcel, i1);
                    break;

                case 7: // '\007'
                    f = SafeParcelReader.readFloat(parcel, i1);
                    break;

                case 8: // '\b'
                    flag = SafeParcelReader.readBoolean(parcel, i1);
                    break;
                }
            } else
            if (parcel.dataPosition() != l)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(l).toString(), parcel);
            } else
            {
                return new CircleOptions(k, latlng, d, f1, j, i, f, flag);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new CircleOptions[i];
    }
}
