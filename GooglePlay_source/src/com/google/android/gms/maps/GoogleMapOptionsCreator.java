// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.maps.internal.ConversionUtil;
import com.google.android.gms.maps.model.CameraPosition;

// Referenced classes of package com.google.android.gms.maps:
//            GoogleMapOptions

public final class GoogleMapOptionsCreator
    implements android.os.Parcelable.Creator
{

    public GoogleMapOptionsCreator()
    {
    }

    static void writeToParcel(GoogleMapOptions googlemapoptions, Parcel parcel, int i)
    {
        int j = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeInt(parcel, 1, googlemapoptions.mVersionCode);
        SafeParcelWriter.writeByte(parcel, 2, ConversionUtil.toByteFromBoxedBoolean(googlemapoptions.mZOrderOnTop));
        SafeParcelWriter.writeByte(parcel, 3, ConversionUtil.toByteFromBoxedBoolean(googlemapoptions.mUseViewLifecycleInFragment));
        SafeParcelWriter.writeInt(parcel, 4, googlemapoptions.mMapType);
        SafeParcelWriter.writeParcelable(parcel, 5, googlemapoptions.mCamera, i, false);
        SafeParcelWriter.writeByte(parcel, 6, ConversionUtil.toByteFromBoxedBoolean(googlemapoptions.mZoomControlsEnabled));
        SafeParcelWriter.writeByte(parcel, 7, ConversionUtil.toByteFromBoxedBoolean(googlemapoptions.mCompassEnabled));
        SafeParcelWriter.writeByte(parcel, 8, ConversionUtil.toByteFromBoxedBoolean(googlemapoptions.mScrollGesturesEnabled));
        SafeParcelWriter.writeByte(parcel, 9, ConversionUtil.toByteFromBoxedBoolean(googlemapoptions.mZoomGesturesEnabled));
        SafeParcelWriter.writeByte(parcel, 10, ConversionUtil.toByteFromBoxedBoolean(googlemapoptions.mTiltGesturesEnabled));
        SafeParcelWriter.writeByte(parcel, 11, ConversionUtil.toByteFromBoxedBoolean(googlemapoptions.mRotateGesturesEnabled));
        SafeParcelWriter.writeByte(parcel, 12, ConversionUtil.toByteFromBoxedBoolean(googlemapoptions.mLiteMode));
        SafeParcelWriter.writeByte(parcel, 14, ConversionUtil.toByteFromBoxedBoolean(googlemapoptions.mMapToolbarEnabled));
        SafeParcelWriter.writeByte(parcel, 15, ConversionUtil.toByteFromBoxedBoolean(googlemapoptions.mAmbientEnabled));
        SafeParcelWriter.finishVariableData(parcel, j);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        int k = SafeParcelReader.validateObjectHeader(parcel);
        int j = 0;
        byte byte10 = -1;
        byte byte9 = -1;
        int i = 0;
        CameraPosition cameraposition = null;
        byte byte8 = -1;
        byte byte7 = -1;
        byte byte6 = -1;
        byte byte5 = -1;
        byte byte4 = -1;
        byte byte3 = -1;
        byte byte2 = -1;
        byte byte1 = -1;
        byte byte0 = -1;
        do
        {
            if (parcel.dataPosition() < k)
            {
                int l = parcel.readInt();
                switch (0xffff & l)
                {
                case 13: // '\r'
                default:
                    SafeParcelReader.skipUnknownField(parcel, l);
                    break;

                case 1: // '\001'
                    j = SafeParcelReader.readInt(parcel, l);
                    break;

                case 2: // '\002'
                    byte10 = SafeParcelReader.readByte(parcel, l);
                    break;

                case 3: // '\003'
                    byte9 = SafeParcelReader.readByte(parcel, l);
                    break;

                case 4: // '\004'
                    i = SafeParcelReader.readInt(parcel, l);
                    break;

                case 5: // '\005'
                    cameraposition = (CameraPosition)SafeParcelReader.createParcelable(parcel, l, CameraPosition.CREATOR);
                    break;

                case 6: // '\006'
                    byte8 = SafeParcelReader.readByte(parcel, l);
                    break;

                case 7: // '\007'
                    byte7 = SafeParcelReader.readByte(parcel, l);
                    break;

                case 8: // '\b'
                    byte6 = SafeParcelReader.readByte(parcel, l);
                    break;

                case 9: // '\t'
                    byte5 = SafeParcelReader.readByte(parcel, l);
                    break;

                case 10: // '\n'
                    byte4 = SafeParcelReader.readByte(parcel, l);
                    break;

                case 11: // '\013'
                    byte3 = SafeParcelReader.readByte(parcel, l);
                    break;

                case 12: // '\f'
                    byte2 = SafeParcelReader.readByte(parcel, l);
                    break;

                case 14: // '\016'
                    byte1 = SafeParcelReader.readByte(parcel, l);
                    break;

                case 15: // '\017'
                    byte0 = SafeParcelReader.readByte(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
            } else
            {
                return new GoogleMapOptions(j, byte10, byte9, i, cameraposition, byte8, byte7, byte6, byte5, byte4, byte3, byte2, byte1, byte0);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new GoogleMapOptions[i];
    }
}
