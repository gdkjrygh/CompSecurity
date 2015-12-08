// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.nearby.messages.devices;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.nearby.messages.devices:
//            NearbyDeviceFilter

public final class NearbyDeviceFilterCreator
    implements android.os.Parcelable.Creator
{

    public NearbyDeviceFilterCreator()
    {
    }

    static void writeToParcel$1746553a(NearbyDeviceFilter nearbydevicefilter, Parcel parcel)
    {
        int i = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeInt(parcel, 1, nearbydevicefilter.mIdPrefixType);
        SafeParcelWriter.writeInt(parcel, 1000, nearbydevicefilter.mVersionCode);
        SafeParcelWriter.writeByteArray(parcel, 2, nearbydevicefilter.mIdPrefix, false);
        SafeParcelWriter.writeBoolean(parcel, 3, nearbydevicefilter.mShouldMatchUrls);
        SafeParcelWriter.finishVariableData(parcel, i);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        boolean flag = false;
        int k = SafeParcelReader.validateObjectHeader(parcel);
        byte abyte0[] = null;
        int j = 0;
        int i = 0;
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

                case 1000: 
                    i = SafeParcelReader.readInt(parcel, l);
                    break;

                case 2: // '\002'
                    abyte0 = SafeParcelReader.createByteArray(parcel, l);
                    break;

                case 3: // '\003'
                    flag = SafeParcelReader.readBoolean(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
            } else
            {
                return new NearbyDeviceFilter(i, j, abyte0, flag);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new NearbyDeviceFilter[i];
    }
}
