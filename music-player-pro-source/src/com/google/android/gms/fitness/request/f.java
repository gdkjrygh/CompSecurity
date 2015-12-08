// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.request;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.fitness.data.DataSet;

// Referenced classes of package com.google.android.gms.fitness.request:
//            e

public class f
    implements android.os.Parcelable.Creator
{

    public f()
    {
    }

    static void a(e e1, Parcel parcel, int i)
    {
        int j = b.H(parcel);
        b.a(parcel, 1, e1.jH(), i, false);
        b.c(parcel, 1000, e1.getVersionCode());
        b.H(parcel, j);
    }

    public e bK(Parcel parcel)
    {
        int j = com.google.android.gms.common.internal.safeparcel.a.G(parcel);
        int i = 0;
        DataSet dataset = null;
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
                    dataset = (DataSet)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, DataSet.CREATOR);
                    break;

                case 1000: 
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new e(i, dataset);
            }
        } while (true);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return bK(parcel);
    }

    public e[] de(int i)
    {
        return new e[i];
    }

    public Object[] newArray(int i)
    {
        return de(i);
    }
}
