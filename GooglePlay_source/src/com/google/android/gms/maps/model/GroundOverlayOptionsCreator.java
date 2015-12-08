// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.dynamic.IObjectWrapper;

// Referenced classes of package com.google.android.gms.maps.model:
//            GroundOverlayOptions, BitmapDescriptor, LatLng, LatLngBounds

public final class GroundOverlayOptionsCreator
    implements android.os.Parcelable.Creator
{

    public GroundOverlayOptionsCreator()
    {
    }

    static void writeToParcel(GroundOverlayOptions groundoverlayoptions, Parcel parcel, int i)
    {
        int j = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeInt(parcel, 1, groundoverlayoptions.mVersionCode);
        SafeParcelWriter.writeIBinder$cdac282(parcel, 2, groundoverlayoptions.mImage.mRemoteObject.asBinder());
        SafeParcelWriter.writeParcelable(parcel, 3, groundoverlayoptions.mLocation, i, false);
        SafeParcelWriter.writeFloat(parcel, 4, groundoverlayoptions.mWidth);
        SafeParcelWriter.writeFloat(parcel, 5, groundoverlayoptions.mHeight);
        SafeParcelWriter.writeParcelable(parcel, 6, groundoverlayoptions.mBounds, i, false);
        SafeParcelWriter.writeFloat(parcel, 7, groundoverlayoptions.mBearing);
        SafeParcelWriter.writeFloat(parcel, 8, groundoverlayoptions.mZIndex);
        SafeParcelWriter.writeBoolean(parcel, 9, groundoverlayoptions.mVisible);
        SafeParcelWriter.writeFloat(parcel, 10, groundoverlayoptions.mTransparency);
        SafeParcelWriter.writeFloat(parcel, 11, groundoverlayoptions.mAnchorU);
        SafeParcelWriter.writeFloat(parcel, 12, groundoverlayoptions.mAnchorV);
        SafeParcelWriter.finishVariableData(parcel, j);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        int j = SafeParcelReader.validateObjectHeader(parcel);
        int i = 0;
        android.os.IBinder ibinder = null;
        LatLng latlng = null;
        float f6 = 0.0F;
        float f5 = 0.0F;
        LatLngBounds latlngbounds = null;
        float f4 = 0.0F;
        float f3 = 0.0F;
        boolean flag = false;
        float f2 = 0.0F;
        float f1 = 0.0F;
        float f = 0.0F;
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
                    ibinder = SafeParcelReader.readIBinder(parcel, k);
                    break;

                case 3: // '\003'
                    latlng = (LatLng)SafeParcelReader.createParcelable(parcel, k, LatLng.CREATOR);
                    break;

                case 4: // '\004'
                    f6 = SafeParcelReader.readFloat(parcel, k);
                    break;

                case 5: // '\005'
                    f5 = SafeParcelReader.readFloat(parcel, k);
                    break;

                case 6: // '\006'
                    latlngbounds = (LatLngBounds)SafeParcelReader.createParcelable(parcel, k, LatLngBounds.CREATOR);
                    break;

                case 7: // '\007'
                    f4 = SafeParcelReader.readFloat(parcel, k);
                    break;

                case 8: // '\b'
                    f3 = SafeParcelReader.readFloat(parcel, k);
                    break;

                case 9: // '\t'
                    flag = SafeParcelReader.readBoolean(parcel, k);
                    break;

                case 10: // '\n'
                    f2 = SafeParcelReader.readFloat(parcel, k);
                    break;

                case 11: // '\013'
                    f1 = SafeParcelReader.readFloat(parcel, k);
                    break;

                case 12: // '\f'
                    f = SafeParcelReader.readFloat(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new GroundOverlayOptions(i, ibinder, latlng, f6, f5, latlngbounds, f4, f3, flag, f2, f1, f);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new GroundOverlayOptions[i];
    }
}
