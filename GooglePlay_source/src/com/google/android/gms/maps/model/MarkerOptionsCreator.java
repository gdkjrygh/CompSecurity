// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.dynamic.IObjectWrapper;

// Referenced classes of package com.google.android.gms.maps.model:
//            MarkerOptions, BitmapDescriptor, LatLng

public final class MarkerOptionsCreator
    implements android.os.Parcelable.Creator
{

    public MarkerOptionsCreator()
    {
    }

    static void writeToParcel(MarkerOptions markeroptions, Parcel parcel, int i)
    {
        int j = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeInt(parcel, 1, markeroptions.mVersionCode);
        SafeParcelWriter.writeParcelable(parcel, 2, markeroptions.mPosition, i, false);
        SafeParcelWriter.writeString(parcel, 3, markeroptions.mTitle, false);
        SafeParcelWriter.writeString(parcel, 4, markeroptions.mSnippet, false);
        android.os.IBinder ibinder;
        if (markeroptions.mIcon == null)
        {
            ibinder = null;
        } else
        {
            ibinder = markeroptions.mIcon.mRemoteObject.asBinder();
        }
        SafeParcelWriter.writeIBinder$cdac282(parcel, 5, ibinder);
        SafeParcelWriter.writeFloat(parcel, 6, markeroptions.mAnchorU);
        SafeParcelWriter.writeFloat(parcel, 7, markeroptions.mAnchorV);
        SafeParcelWriter.writeBoolean(parcel, 8, markeroptions.mDraggable);
        SafeParcelWriter.writeBoolean(parcel, 9, markeroptions.mVisible);
        SafeParcelWriter.writeBoolean(parcel, 10, markeroptions.mFlat);
        SafeParcelWriter.writeFloat(parcel, 11, markeroptions.mRotation);
        SafeParcelWriter.writeFloat(parcel, 12, markeroptions.mInfoWindowAnchorU);
        SafeParcelWriter.writeFloat(parcel, 13, markeroptions.mInfoWindowAnchorV);
        SafeParcelWriter.writeFloat(parcel, 14, markeroptions.mAlpha);
        SafeParcelWriter.finishVariableData(parcel, j);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        int j = SafeParcelReader.validateObjectHeader(parcel);
        int i = 0;
        LatLng latlng = null;
        String s1 = null;
        String s = null;
        android.os.IBinder ibinder = null;
        float f5 = 0.0F;
        float f4 = 0.0F;
        boolean flag2 = false;
        boolean flag1 = false;
        boolean flag = false;
        float f3 = 0.0F;
        float f2 = 0.5F;
        float f1 = 0.0F;
        float f = 1.0F;
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
                    s1 = SafeParcelReader.createString(parcel, k);
                    break;

                case 4: // '\004'
                    s = SafeParcelReader.createString(parcel, k);
                    break;

                case 5: // '\005'
                    ibinder = SafeParcelReader.readIBinder(parcel, k);
                    break;

                case 6: // '\006'
                    f5 = SafeParcelReader.readFloat(parcel, k);
                    break;

                case 7: // '\007'
                    f4 = SafeParcelReader.readFloat(parcel, k);
                    break;

                case 8: // '\b'
                    flag2 = SafeParcelReader.readBoolean(parcel, k);
                    break;

                case 9: // '\t'
                    flag1 = SafeParcelReader.readBoolean(parcel, k);
                    break;

                case 10: // '\n'
                    flag = SafeParcelReader.readBoolean(parcel, k);
                    break;

                case 11: // '\013'
                    f3 = SafeParcelReader.readFloat(parcel, k);
                    break;

                case 12: // '\f'
                    f2 = SafeParcelReader.readFloat(parcel, k);
                    break;

                case 13: // '\r'
                    f1 = SafeParcelReader.readFloat(parcel, k);
                    break;

                case 14: // '\016'
                    f = SafeParcelReader.readFloat(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new MarkerOptions(i, latlng, s1, s, ibinder, f5, f4, flag2, flag1, flag, f3, f2, f1, f);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new MarkerOptions[i];
    }
}
