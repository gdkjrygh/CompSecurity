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
//            SendDataRequest

public final class SendDataRequestCreator
    implements android.os.Parcelable.Creator
{

    public SendDataRequestCreator()
    {
    }

    public static SendDataRequest createFromParcel(Parcel parcel)
    {
        int j = SafeParcelReader.validateObjectHeader(parcel);
        int i = 0;
        Device device = null;
        byte abyte0[] = null;
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
                    abyte0 = SafeParcelReader.createByteArray(parcel, k);
                    break;

                case 3: // '\003'
                    ibinder = SafeParcelReader.readIBinder(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new SendDataRequest(i, device, abyte0, ibinder);
            }
        } while (true);
    }

    static void writeToParcel(SendDataRequest senddatarequest, Parcel parcel, int i)
    {
        int j = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeParcelable(parcel, 1, senddatarequest.device, i, false);
        SafeParcelWriter.writeInt(parcel, 1000, senddatarequest.versionCode);
        SafeParcelWriter.writeByteArray(parcel, 2, senddatarequest.data, false);
        if (senddatarequest.callback == null)
        {
            senddatarequest = null;
        } else
        {
            senddatarequest = senddatarequest.callback.asBinder();
        }
        SafeParcelWriter.writeIBinder$cdac282(parcel, 3, senddatarequest);
        SafeParcelWriter.finishVariableData(parcel, j);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        return createFromParcel(parcel);
    }

    public final volatile Object[] newArray(int i)
    {
        return new SendDataRequest[i];
    }
}
