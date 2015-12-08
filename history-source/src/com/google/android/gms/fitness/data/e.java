// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.data;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.fitness.data:
//            DataPoint, DataSource, Value

public class e
    implements android.os.Parcelable.Creator
{

    public e()
    {
    }

    static void a(DataPoint datapoint, Parcel parcel, int i)
    {
        int j = b.H(parcel);
        b.a(parcel, 1, datapoint.getDataSource(), i, false);
        b.c(parcel, 1000, datapoint.getVersionCode());
        b.a(parcel, 3, datapoint.getTimestampNanos());
        b.a(parcel, 4, datapoint.ju());
        b.a(parcel, 5, datapoint.jr(), i, false);
        b.a(parcel, 6, datapoint.getOriginalDataSource(), i, false);
        b.a(parcel, 7, datapoint.js());
        b.a(parcel, 8, datapoint.jt());
        b.H(parcel, j);
    }

    public DataPoint bt(Parcel parcel)
    {
        int j = com.google.android.gms.common.internal.safeparcel.a.G(parcel);
        int i = 0;
        DataSource datasource1 = null;
        long l3 = 0L;
        long l2 = 0L;
        Value avalue[] = null;
        DataSource datasource = null;
        long l1 = 0L;
        long l = 0L;
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
                    datasource1 = (DataSource)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, DataSource.CREATOR);
                    break;

                case 1000: 
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, k);
                    break;

                case 3: // '\003'
                    l3 = com.google.android.gms.common.internal.safeparcel.a.i(parcel, k);
                    break;

                case 4: // '\004'
                    l2 = com.google.android.gms.common.internal.safeparcel.a.i(parcel, k);
                    break;

                case 5: // '\005'
                    avalue = (Value[])com.google.android.gms.common.internal.safeparcel.a.b(parcel, k, Value.CREATOR);
                    break;

                case 6: // '\006'
                    datasource = (DataSource)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, DataSource.CREATOR);
                    break;

                case 7: // '\007'
                    l1 = com.google.android.gms.common.internal.safeparcel.a.i(parcel, k);
                    break;

                case 8: // '\b'
                    l = com.google.android.gms.common.internal.safeparcel.a.i(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new DataPoint(i, datasource1, l3, l2, avalue, datasource, l1, l);
            }
        } while (true);
    }

    public DataPoint[] cM(int i)
    {
        return new DataPoint[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return bt(parcel);
    }

    public Object[] newArray(int i)
    {
        return cM(i);
    }
}
