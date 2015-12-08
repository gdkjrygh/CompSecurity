// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.nearby.messages.devices;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.nearby.messages.devices:
//            NearbyDevice, NearbyDeviceId

public final class NearbyDeviceCreator
    implements android.os.Parcelable.Creator
{

    public NearbyDeviceCreator()
    {
    }

    static void writeToParcel(NearbyDevice nearbydevice, Parcel parcel, int i)
    {
        int j = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeParcelable(parcel, 1, nearbydevice.mId, i, false);
        SafeParcelWriter.writeInt(parcel, 1000, nearbydevice.mVersionCode);
        SafeParcelWriter.writeString(parcel, 2, nearbydevice.mUrl, false);
        SafeParcelWriter.finishVariableData(parcel, j);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        int j = SafeParcelReader.validateObjectHeader(parcel);
        NearbyDeviceId nearbydeviceid = null;
        int i = 0;
        String s = null;
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
                    nearbydeviceid = (NearbyDeviceId)SafeParcelReader.createParcelable(parcel, k, NearbyDeviceId.CREATOR);
                    break;

                case 1000: 
                    i = SafeParcelReader.readInt(parcel, k);
                    break;

                case 2: // '\002'
                    s = SafeParcelReader.createString(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new NearbyDevice(i, nearbydeviceid, s);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new NearbyDevice[i];
    }
}
