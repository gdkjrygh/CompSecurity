// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.data;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.fitness.data:
//            DataType, Field

public class h
    implements android.os.Parcelable.Creator
{

    public h()
    {
    }

    static void a(DataType datatype, Parcel parcel, int i)
    {
        i = b.H(parcel);
        b.a(parcel, 1, datatype.getName(), false);
        b.c(parcel, 1000, datatype.getVersionCode());
        b.c(parcel, 2, datatype.getFields(), false);
        b.H(parcel, i);
    }

    public DataType bw(Parcel parcel)
    {
        java.util.ArrayList arraylist = null;
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
                    arraylist = com.google.android.gms.common.internal.safeparcel.a.c(parcel, k, Field.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new DataType(i, s, arraylist);
            }
        } while (true);
    }

    public DataType[] cP(int i)
    {
        return new DataType[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return bw(parcel);
    }

    public Object[] newArray(int i)
    {
        return cP(i);
    }
}
