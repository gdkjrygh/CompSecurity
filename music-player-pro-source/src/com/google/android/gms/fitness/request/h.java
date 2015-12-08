// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.request;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.fitness.data.DataType;

// Referenced classes of package com.google.android.gms.fitness.request:
//            DataSourcesRequest

public class h
    implements android.os.Parcelable.Creator
{

    public h()
    {
    }

    static void a(DataSourcesRequest datasourcesrequest, Parcel parcel, int i)
    {
        i = b.H(parcel);
        b.c(parcel, 1, datasourcesrequest.getDataTypes(), false);
        b.c(parcel, 1000, datasourcesrequest.getVersionCode());
        b.a(parcel, 2, datasourcesrequest.jZ(), false);
        b.a(parcel, 3, datasourcesrequest.jY());
        b.H(parcel, i);
    }

    public DataSourcesRequest bM(Parcel parcel)
    {
        java.util.ArrayList arraylist1 = null;
        boolean flag = false;
        int j = com.google.android.gms.common.internal.safeparcel.a.G(parcel);
        java.util.ArrayList arraylist = null;
        int i = 0;
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
                    arraylist = com.google.android.gms.common.internal.safeparcel.a.c(parcel, k, DataType.CREATOR);
                    break;

                case 1000: 
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, k);
                    break;

                case 2: // '\002'
                    arraylist1 = com.google.android.gms.common.internal.safeparcel.a.B(parcel, k);
                    break;

                case 3: // '\003'
                    flag = com.google.android.gms.common.internal.safeparcel.a.c(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new DataSourcesRequest(i, arraylist, arraylist1, flag);
            }
        } while (true);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return bM(parcel);
    }

    public DataSourcesRequest[] dg(int i)
    {
        return new DataSourcesRequest[i];
    }

    public Object[] newArray(int i)
    {
        return dg(i);
    }
}
