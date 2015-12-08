// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.nearby.bootstrap.request;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.nearby.bootstrap.internal.INearbyBootstrapCallback;
import com.google.android.gms.nearby.bootstrap.internal.IScanListener;

// Referenced classes of package com.google.android.gms.nearby.bootstrap.request:
//            StartScanRequest

public final class StartScanRequestCreator
    implements android.os.Parcelable.Creator
{

    public StartScanRequestCreator()
    {
    }

    public static StartScanRequest createFromParcel(Parcel parcel)
    {
        int j = SafeParcelReader.validateObjectHeader(parcel);
        int i = 0;
        android.os.IBinder ibinder = null;
        android.os.IBinder ibinder1 = null;
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

                case 2: // '\002'
                    ibinder1 = SafeParcelReader.readIBinder(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new StartScanRequest(i, ibinder, ibinder1);
            }
        } while (true);
    }

    static void writeToParcel$dea6f23(StartScanRequest startscanrequest, Parcel parcel)
    {
        Object obj = null;
        int i = SafeParcelWriter.beginVariableData(parcel, 20293);
        android.os.IBinder ibinder;
        if (startscanrequest.scanListener == null)
        {
            ibinder = null;
        } else
        {
            ibinder = startscanrequest.scanListener.asBinder();
        }
        SafeParcelWriter.writeIBinder$cdac282(parcel, 1, ibinder);
        SafeParcelWriter.writeInt(parcel, 1000, startscanrequest.versionCode);
        if (startscanrequest.callback == null)
        {
            startscanrequest = obj;
        } else
        {
            startscanrequest = startscanrequest.callback.asBinder();
        }
        SafeParcelWriter.writeIBinder$cdac282(parcel, 2, startscanrequest);
        SafeParcelWriter.finishVariableData(parcel, i);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        return createFromParcel(parcel);
    }

    public final volatile Object[] newArray(int i)
    {
        return new StartScanRequest[i];
    }
}
