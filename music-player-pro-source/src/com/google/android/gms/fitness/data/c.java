// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.data;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.fitness.data:
//            BleDevice, DataType

public class c
    implements android.os.Parcelable.Creator
{

    public c()
    {
    }

    static void a(BleDevice bledevice, Parcel parcel, int i)
    {
        i = b.H(parcel);
        b.a(parcel, 1, bledevice.getAddress(), false);
        b.c(parcel, 1000, bledevice.getVersionCode());
        b.a(parcel, 2, bledevice.getName(), false);
        b.b(parcel, 3, bledevice.getSupportedProfiles(), false);
        b.c(parcel, 4, bledevice.getDataTypes(), false);
        b.H(parcel, i);
    }

    public BleDevice br(Parcel parcel)
    {
        java.util.ArrayList arraylist = null;
        int j = com.google.android.gms.common.internal.safeparcel.a.G(parcel);
        int i = 0;
        java.util.ArrayList arraylist1 = null;
        String s = null;
        String s1 = null;
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
                    s1 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, k);
                    break;

                case 1000: 
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, k);
                    break;

                case 2: // '\002'
                    s = com.google.android.gms.common.internal.safeparcel.a.o(parcel, k);
                    break;

                case 3: // '\003'
                    arraylist1 = com.google.android.gms.common.internal.safeparcel.a.C(parcel, k);
                    break;

                case 4: // '\004'
                    arraylist = com.google.android.gms.common.internal.safeparcel.a.c(parcel, k, DataType.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new BleDevice(i, s1, s, arraylist1, arraylist);
            }
        } while (true);
    }

    public BleDevice[] cI(int i)
    {
        return new BleDevice[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return br(parcel);
    }

    public Object[] newArray(int i)
    {
        return cI(i);
    }
}
