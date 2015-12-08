// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.request;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;

// Referenced classes of package com.google.android.gms.fitness.request:
//            aj

public class ak
    implements android.os.Parcelable.Creator
{

    public ak()
    {
    }

    static void a(aj aj1, Parcel parcel, int i)
    {
        int j = b.H(parcel);
        b.a(parcel, 1, aj1.getDataType(), i, false);
        b.c(parcel, 1000, aj1.getVersionCode());
        b.a(parcel, 2, aj1.getDataSource(), i, false);
        b.H(parcel, j);
    }

    public aj cc(Parcel parcel)
    {
        DataSource datasource = null;
        int j = com.google.android.gms.common.internal.safeparcel.a.G(parcel);
        int i = 0;
        DataType datatype = null;
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
                    datatype = (DataType)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, DataType.CREATOR);
                    break;

                case 1000: 
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, k);
                    break;

                case 2: // '\002'
                    datasource = (DataSource)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, DataSource.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new aj(i, datatype, datasource);
            }
        } while (true);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return cc(parcel);
    }

    public aj[] dx(int i)
    {
        return new aj[i];
    }

    public Object[] newArray(int i)
    {
        return dx(i);
    }
}
