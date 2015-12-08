// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.data;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.fitness.data:
//            Subscription, DataSource, DataType

public class s
    implements android.os.Parcelable.Creator
{

    public s()
    {
    }

    static void a(Subscription subscription, Parcel parcel, int i)
    {
        int j = b.H(parcel);
        b.a(parcel, 1, subscription.getDataSource(), i, false);
        b.c(parcel, 1000, subscription.getVersionCode());
        b.a(parcel, 2, subscription.getDataType(), i, false);
        b.a(parcel, 3, subscription.jI());
        b.c(parcel, 4, subscription.getAccuracyMode());
        b.H(parcel, j);
    }

    public Subscription bE(Parcel parcel)
    {
        DataType datatype = null;
        int i = 0;
        int k = com.google.android.gms.common.internal.safeparcel.a.G(parcel);
        long l1 = 0L;
        DataSource datasource = null;
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
                    datasource = (DataSource)com.google.android.gms.common.internal.safeparcel.a.a(parcel, l, DataSource.CREATOR);
                    break;

                case 1000: 
                    j = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l);
                    break;

                case 2: // '\002'
                    datatype = (DataType)com.google.android.gms.common.internal.safeparcel.a.a(parcel, l, DataType.CREATOR);
                    break;

                case 3: // '\003'
                    l1 = com.google.android.gms.common.internal.safeparcel.a.i(parcel, l);
                    break;

                case 4: // '\004'
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(k).toString(), parcel);
            } else
            {
                return new Subscription(j, datasource, datatype, l1, i);
            }
        } while (true);
    }

    public Subscription[] cY(int i)
    {
        return new Subscription[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return bE(parcel);
    }

    public Object[] newArray(int i)
    {
        return cY(i);
    }
}
