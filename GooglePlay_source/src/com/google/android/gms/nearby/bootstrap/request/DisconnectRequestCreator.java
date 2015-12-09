// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.nearby.bootstrap.request;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.nearby.bootstrap.Device;
import com.google.android.gms.nearby.bootstrap.internal.INearbyBootstrapCallback;

// Referenced classes of package com.google.android.gms.nearby.bootstrap.request:
//            DisconnectRequest

public final class DisconnectRequestCreator
    implements android.os.Parcelable.Creator
{

    public DisconnectRequestCreator()
    {
    }

    public static DisconnectRequest createFromParcel(Parcel parcel)
    {
        int j = SafeParcelReader.validateObjectHeader(parcel);
        int i = 0;
        Device device = null;
        android.os.IBinder ibinder = null;
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
                    device = (Device)SafeParcelReader.createParcelable(parcel, k, Device.CREATOR);
                    break;

                case 1000: 
                    i = SafeParcelReader.readInt(parcel, k);
                    break;

                case 2: // '\002'
                    ibinder = SafeParcelReader.readIBinder(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new DisconnectRequest(i, device, ibinder);
            }
        } while (true);
    }

    static void writeToParcel(DisconnectRequest disconnectrequest, Parcel parcel, int i)
    {
        int j = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeParcelable(parcel, 1, disconnectrequest.device, i, false);
        SafeParcelWriter.writeInt(parcel, 1000, disconnectrequest.versionCode);
        SafeParcelWriter.writeIBinder$cdac282(parcel, 2, disconnectrequest.callback.asBinder());
        SafeParcelWriter.finishVariableData(parcel, j);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        return createFromParcel(parcel);
    }

    public final volatile Object[] newArray(int i)
    {
        return new DisconnectRequest[i];
    }
}
