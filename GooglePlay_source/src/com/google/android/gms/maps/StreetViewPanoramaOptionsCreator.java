// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.maps.internal.ConversionUtil;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;

// Referenced classes of package com.google.android.gms.maps:
//            StreetViewPanoramaOptions

public final class StreetViewPanoramaOptionsCreator
    implements android.os.Parcelable.Creator
{

    public StreetViewPanoramaOptionsCreator()
    {
    }

    static void writeToParcel(StreetViewPanoramaOptions streetviewpanoramaoptions, Parcel parcel, int i)
    {
        int j = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeInt(parcel, 1, streetviewpanoramaoptions.mVersionCode);
        SafeParcelWriter.writeParcelable(parcel, 2, streetviewpanoramaoptions.mCamera, i, false);
        SafeParcelWriter.writeString(parcel, 3, streetviewpanoramaoptions.mPanoId, false);
        SafeParcelWriter.writeParcelable(parcel, 4, streetviewpanoramaoptions.mPosition, i, false);
        SafeParcelWriter.writeIntegerObject$1ed7098(parcel, 5, streetviewpanoramaoptions.mRadius);
        SafeParcelWriter.writeByte(parcel, 6, ConversionUtil.toByteFromBoxedBoolean(streetviewpanoramaoptions.mUserNavigationEnabled));
        SafeParcelWriter.writeByte(parcel, 7, ConversionUtil.toByteFromBoxedBoolean(streetviewpanoramaoptions.mZoomGesturesEnabled));
        SafeParcelWriter.writeByte(parcel, 8, ConversionUtil.toByteFromBoxedBoolean(streetviewpanoramaoptions.mPanningGesturesEnabled));
        SafeParcelWriter.writeByte(parcel, 9, ConversionUtil.toByteFromBoxedBoolean(streetviewpanoramaoptions.mStreetNamesEnabled));
        SafeParcelWriter.writeByte(parcel, 10, ConversionUtil.toByteFromBoxedBoolean(streetviewpanoramaoptions.mUseViewLifecycleInFragment));
        SafeParcelWriter.finishVariableData(parcel, j);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        Integer integer = null;
        byte byte0 = 0;
        int j = SafeParcelReader.validateObjectHeader(parcel);
        byte byte1 = 0;
        byte byte2 = 0;
        byte byte3 = 0;
        byte byte4 = 0;
        LatLng latlng = null;
        String s = null;
        StreetViewPanoramaCamera streetviewpanoramacamera = null;
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
                    i = SafeParcelReader.readInt(parcel, k);
                    break;

                case 2: // '\002'
                    streetviewpanoramacamera = (StreetViewPanoramaCamera)SafeParcelReader.createParcelable(parcel, k, StreetViewPanoramaCamera.CREATOR);
                    break;

                case 3: // '\003'
                    s = SafeParcelReader.createString(parcel, k);
                    break;

                case 4: // '\004'
                    latlng = (LatLng)SafeParcelReader.createParcelable(parcel, k, LatLng.CREATOR);
                    break;

                case 5: // '\005'
                    integer = SafeParcelReader.readIntegerObject(parcel, k);
                    break;

                case 6: // '\006'
                    byte4 = SafeParcelReader.readByte(parcel, k);
                    break;

                case 7: // '\007'
                    byte3 = SafeParcelReader.readByte(parcel, k);
                    break;

                case 8: // '\b'
                    byte2 = SafeParcelReader.readByte(parcel, k);
                    break;

                case 9: // '\t'
                    byte1 = SafeParcelReader.readByte(parcel, k);
                    break;

                case 10: // '\n'
                    byte0 = SafeParcelReader.readByte(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new StreetViewPanoramaOptions(i, streetviewpanoramacamera, s, latlng, integer, byte4, byte3, byte2, byte1, byte0);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new StreetViewPanoramaOptions[i];
    }
}
