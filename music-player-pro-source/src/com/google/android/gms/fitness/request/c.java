// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.request;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.fitness.data.BleDevice;

// Referenced classes of package com.google.android.gms.fitness.request:
//            b

public class c
    implements android.os.Parcelable.Creator
{

    public c()
    {
    }

    static void a(com.google.android.gms.fitness.request.b b1, Parcel parcel, int i)
    {
        int j = b.H(parcel);
        b.a(parcel, 1, b1.getDeviceAddress(), false);
        b.c(parcel, 1000, b1.getVersionCode());
        b.a(parcel, 2, b1.jQ(), i, false);
        b.H(parcel, j);
    }

    public com.google.android.gms.fitness.request.b bI(Parcel parcel)
    {
        BleDevice bledevice = null;
        int j = com.google.android.gms.common.internal.safeparcel.a.G(parcel);
        int i = 0;
        String s = null;
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
                    s = com.google.android.gms.common.internal.safeparcel.a.o(parcel, k);
                    break;

                case 1000: 
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, k);
                    break;

                case 2: // '\002'
                    bledevice = (BleDevice)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, BleDevice.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new com.google.android.gms.fitness.request.b(i, s, bledevice);
            }
        } while (true);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return bI(parcel);
    }

    public com.google.android.gms.fitness.request.b[] dc(int i)
    {
        return new com.google.android.gms.fitness.request.b[i];
    }

    public Object[] newArray(int i)
    {
        return dc(i);
    }
}
