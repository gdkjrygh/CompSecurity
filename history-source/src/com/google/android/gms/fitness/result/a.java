// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.result;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.fitness.data.BleDevice;

// Referenced classes of package com.google.android.gms.fitness.result:
//            BleDevicesResult

public class a
    implements android.os.Parcelable.Creator
{

    public a()
    {
    }

    static void a(BleDevicesResult bledevicesresult, Parcel parcel, int i)
    {
        int j = b.H(parcel);
        b.c(parcel, 1, bledevicesresult.getClaimedBleDevices(), false);
        b.c(parcel, 1000, bledevicesresult.getVersionCode());
        b.a(parcel, 2, bledevicesresult.getStatus(), i, false);
        b.H(parcel, j);
    }

    public BleDevicesResult cd(Parcel parcel)
    {
        Status status = null;
        int j = com.google.android.gms.common.internal.safeparcel.a.G(parcel);
        int i = 0;
        java.util.ArrayList arraylist = null;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = com.google.android.gms.common.internal.safeparcel.a.F(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.aH(k))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, k);
                    break;

                case 1: // '\001'
                    arraylist = com.google.android.gms.common.internal.safeparcel.a.c(parcel, k, BleDevice.CREATOR);
                    break;

                case 1000: 
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, k);
                    break;

                case 2: // '\002'
                    status = (Status)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, Status.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new BleDevicesResult(i, arraylist, status);
            }
        } while (true);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return cd(parcel);
    }

    public BleDevicesResult[] dy(int i)
    {
        return new BleDevicesResult[i];
    }

    public Object[] newArray(int i)
    {
        return dy(i);
    }
}
