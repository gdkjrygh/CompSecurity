// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.data;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.fitness.data:
//            DataSource, DataType, Device, a

public class g
    implements android.os.Parcelable.Creator
{

    public g()
    {
    }

    static void a(DataSource datasource, Parcel parcel, int i)
    {
        int j = b.H(parcel);
        b.a(parcel, 1, datasource.getDataType(), i, false);
        b.c(parcel, 1000, datasource.getVersionCode());
        b.a(parcel, 2, datasource.getName(), false);
        b.c(parcel, 3, datasource.getType());
        b.a(parcel, 4, datasource.getDevice(), i, false);
        b.a(parcel, 5, datasource.jx(), i, false);
        b.a(parcel, 6, datasource.getStreamName(), false);
        b.a(parcel, 7, datasource.jz());
        b.H(parcel, j);
    }

    public DataSource bv(Parcel parcel)
    {
        boolean flag = false;
        String s = null;
        int k = com.google.android.gms.common.internal.safeparcel.a.G(parcel);
        com.google.android.gms.fitness.data.a a1 = null;
        Device device = null;
        int i = 0;
        String s1 = null;
        DataType datatype = null;
        int j = 0;
        do
        {
            if (parcel.dataPosition() < k)
            {
                int l = com.google.android.gms.common.internal.safeparcel.a.F(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.aH(l))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, l);
                    break;

                case 1: // '\001'
                    datatype = (DataType)com.google.android.gms.common.internal.safeparcel.a.a(parcel, l, DataType.CREATOR);
                    break;

                case 1000: 
                    j = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l);
                    break;

                case 2: // '\002'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, l);
                    break;

                case 3: // '\003'
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l);
                    break;

                case 4: // '\004'
                    device = (Device)com.google.android.gms.common.internal.safeparcel.a.a(parcel, l, Device.CREATOR);
                    break;

                case 5: // '\005'
                    a1 = (com.google.android.gms.fitness.data.a)com.google.android.gms.common.internal.safeparcel.a.a(parcel, l, a.CREATOR);
                    break;

                case 6: // '\006'
                    s = com.google.android.gms.common.internal.safeparcel.a.o(parcel, l);
                    break;

                case 7: // '\007'
                    flag = com.google.android.gms.common.internal.safeparcel.a.c(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(k).toString(), parcel);
            } else
            {
                return new DataSource(j, datatype, s1, i, device, a1, s, flag);
            }
        } while (true);
    }

    public DataSource[] cO(int i)
    {
        return new DataSource[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return bv(parcel);
    }

    public Object[] newArray(int i)
    {
        return cO(i);
    }
}
