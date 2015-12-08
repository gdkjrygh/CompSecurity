// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.data;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.fitness.data:
//            RawDataPoint, Value

public class n
    implements android.os.Parcelable.Creator
{

    public n()
    {
    }

    static void a(RawDataPoint rawdatapoint, Parcel parcel, int i)
    {
        int j = b.H(parcel);
        b.a(parcel, 1, rawdatapoint.Ud);
        b.c(parcel, 1000, rawdatapoint.CK);
        b.a(parcel, 2, rawdatapoint.Ue);
        b.a(parcel, 3, rawdatapoint.Uf, i, false);
        b.c(parcel, 4, rawdatapoint.UJ);
        b.c(parcel, 5, rawdatapoint.UK);
        b.a(parcel, 6, rawdatapoint.Uh);
        b.a(parcel, 7, rawdatapoint.Ui);
        b.H(parcel, j);
    }

    public RawDataPoint bA(Parcel parcel)
    {
        int l = com.google.android.gms.common.internal.safeparcel.a.G(parcel);
        int k = 0;
        long l4 = 0L;
        long l3 = 0L;
        Value avalue[] = null;
        int j = 0;
        int i = 0;
        long l2 = 0L;
        long l1 = 0L;
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
                    l4 = com.google.android.gms.common.internal.safeparcel.a.i(parcel, i1);
                    break;

                case 1000: 
                    k = com.google.android.gms.common.internal.safeparcel.a.g(parcel, i1);
                    break;

                case 2: // '\002'
                    l3 = com.google.android.gms.common.internal.safeparcel.a.i(parcel, i1);
                    break;

                case 3: // '\003'
                    avalue = (Value[])com.google.android.gms.common.internal.safeparcel.a.b(parcel, i1, Value.CREATOR);
                    break;

                case 4: // '\004'
                    j = com.google.android.gms.common.internal.safeparcel.a.g(parcel, i1);
                    break;

                case 5: // '\005'
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, i1);
                    break;

                case 6: // '\006'
                    l2 = com.google.android.gms.common.internal.safeparcel.a.i(parcel, i1);
                    break;

                case 7: // '\007'
                    l1 = com.google.android.gms.common.internal.safeparcel.a.i(parcel, i1);
                    break;
                }
            } else
            if (parcel.dataPosition() != l)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(l).toString(), parcel);
            } else
            {
                return new RawDataPoint(k, l4, l3, avalue, j, i, l2, l1);
            }
        } while (true);
    }

    public RawDataPoint[] cT(int i)
    {
        return new RawDataPoint[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return bA(parcel);
    }

    public Object[] newArray(int i)
    {
        return cT(i);
    }
}
