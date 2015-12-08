// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.data;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.fitness.data:
//            Device

public class i
    implements android.os.Parcelable.Creator
{

    public i()
    {
    }

    static void a(Device device, Parcel parcel, int j)
    {
        j = b.H(parcel);
        b.a(parcel, 1, device.getManufacturer(), false);
        b.c(parcel, 1000, device.getVersionCode());
        b.a(parcel, 2, device.getModel(), false);
        b.a(parcel, 3, device.getVersion(), false);
        b.a(parcel, 4, device.jF(), false);
        b.c(parcel, 5, device.getType());
        b.c(parcel, 6, device.jC());
        b.H(parcel, j);
    }

    public Device bx(Parcel parcel)
    {
        int j = 0;
        String s = null;
        int i1 = com.google.android.gms.common.internal.safeparcel.a.G(parcel);
        int k = 0;
        String s1 = null;
        String s2 = null;
        String s3 = null;
        int l = 0;
        do
        {
            if (parcel.dataPosition() < i1)
            {
                int j1 = com.google.android.gms.common.internal.safeparcel.a.F(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.aH(j1))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, j1);
                    break;

                case 1: // '\001'
                    s3 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, j1);
                    break;

                case 1000: 
                    l = com.google.android.gms.common.internal.safeparcel.a.g(parcel, j1);
                    break;

                case 2: // '\002'
                    s2 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, j1);
                    break;

                case 3: // '\003'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, j1);
                    break;

                case 4: // '\004'
                    s = com.google.android.gms.common.internal.safeparcel.a.o(parcel, j1);
                    break;

                case 5: // '\005'
                    k = com.google.android.gms.common.internal.safeparcel.a.g(parcel, j1);
                    break;

                case 6: // '\006'
                    j = com.google.android.gms.common.internal.safeparcel.a.g(parcel, j1);
                    break;
                }
            } else
            if (parcel.dataPosition() != i1)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(i1).toString(), parcel);
            } else
            {
                return new Device(l, s3, s2, s1, s, k, j);
            }
        } while (true);
    }

    public Device[] cQ(int j)
    {
        return new Device[j];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return bx(parcel);
    }

    public Object[] newArray(int j)
    {
        return cQ(j);
    }
}
