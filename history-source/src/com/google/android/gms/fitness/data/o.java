// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.data;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.fitness.data:
//            RawDataSet, RawDataPoint

public class o
    implements android.os.Parcelable.Creator
{

    public o()
    {
    }

    static void a(RawDataSet rawdataset, Parcel parcel, int i)
    {
        i = b.H(parcel);
        b.c(parcel, 1, rawdataset.UJ);
        b.c(parcel, 1000, rawdataset.CK);
        b.c(parcel, 2, rawdataset.UL);
        b.c(parcel, 3, rawdataset.UM, false);
        b.a(parcel, 4, rawdataset.Uc);
        b.H(parcel, i);
    }

    public RawDataSet bB(Parcel parcel)
    {
        boolean flag = false;
        int l = com.google.android.gms.common.internal.safeparcel.a.G(parcel);
        java.util.ArrayList arraylist = null;
        int i = 0;
        int j = 0;
        int k = 0;
        do
        {
            if (parcel.dataPosition() < l)
            {
                int i1 = com.google.android.gms.common.internal.safeparcel.a.F(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.aH(i1))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, i1);
                    break;

                case 1: // '\001'
                    j = com.google.android.gms.common.internal.safeparcel.a.g(parcel, i1);
                    break;

                case 1000: 
                    k = com.google.android.gms.common.internal.safeparcel.a.g(parcel, i1);
                    break;

                case 2: // '\002'
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, i1);
                    break;

                case 3: // '\003'
                    arraylist = com.google.android.gms.common.internal.safeparcel.a.c(parcel, i1, RawDataPoint.CREATOR);
                    break;

                case 4: // '\004'
                    flag = com.google.android.gms.common.internal.safeparcel.a.c(parcel, i1);
                    break;
                }
            } else
            if (parcel.dataPosition() != l)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(l).toString(), parcel);
            } else
            {
                return new RawDataSet(k, j, i, arraylist, flag);
            }
        } while (true);
    }

    public RawDataSet[] cU(int i)
    {
        return new RawDataSet[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return bB(parcel);
    }

    public Object[] newArray(int i)
    {
        return cU(i);
    }
}
