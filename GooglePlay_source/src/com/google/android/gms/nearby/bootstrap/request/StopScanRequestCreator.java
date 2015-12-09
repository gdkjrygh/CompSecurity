// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.nearby.bootstrap.request;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.nearby.bootstrap.internal.INearbyBootstrapCallback;

// Referenced classes of package com.google.android.gms.nearby.bootstrap.request:
//            StopScanRequest

public final class StopScanRequestCreator
    implements android.os.Parcelable.Creator
{

    public StopScanRequestCreator()
    {
    }

    public static StopScanRequest createFromParcel(Parcel parcel)
    {
        int j = SafeParcelReader.validateObjectHeader(parcel);
        int i = 0;
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
                    ibinder = SafeParcelReader.readIBinder(parcel, k);
                    break;

                case 1000: 
                    i = SafeParcelReader.readInt(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new StopScanRequest(i, ibinder);
            }
        } while (true);
    }

    static void writeToParcel$1d1c3a47(StopScanRequest stopscanrequest, Parcel parcel)
    {
        int i = SafeParcelWriter.beginVariableData(parcel, 20293);
        android.os.IBinder ibinder;
        if (stopscanrequest.callback == null)
        {
            ibinder = null;
        } else
        {
            ibinder = stopscanrequest.callback.asBinder();
        }
        SafeParcelWriter.writeIBinder$cdac282(parcel, 1, ibinder);
        SafeParcelWriter.writeInt(parcel, 1000, stopscanrequest.versionCode);
        SafeParcelWriter.finishVariableData(parcel, i);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        return createFromParcel(parcel);
    }

    public final volatile Object[] newArray(int i)
    {
        return new StopScanRequest[i];
    }
}
