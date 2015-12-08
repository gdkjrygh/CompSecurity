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
//            DataReadRequest

public class g
    implements android.os.Parcelable.Creator
{

    public g()
    {
    }

    static void a(DataReadRequest datareadrequest, Parcel parcel, int i)
    {
        int j = b.H(parcel);
        b.c(parcel, 1, datareadrequest.getDataTypes(), false);
        b.c(parcel, 1000, datareadrequest.getVersionCode());
        b.c(parcel, 2, datareadrequest.getDataSources(), false);
        b.a(parcel, 3, datareadrequest.jo());
        b.a(parcel, 4, datareadrequest.jp());
        b.c(parcel, 5, datareadrequest.getAggregatedDataTypes(), false);
        b.c(parcel, 6, datareadrequest.getAggregatedDataSources(), false);
        b.c(parcel, 7, datareadrequest.getBucketType());
        b.a(parcel, 8, datareadrequest.jX());
        b.a(parcel, 9, datareadrequest.getActivityDataSource(), i, false);
        b.c(parcel, 10, datareadrequest.getLimit());
        b.a(parcel, 12, datareadrequest.jW());
        b.a(parcel, 13, datareadrequest.jV());
        b.H(parcel, j);
    }

    public DataReadRequest bL(Parcel parcel)
    {
        int l = com.google.android.gms.common.internal.safeparcel.a.G(parcel);
        int k = 0;
        java.util.ArrayList arraylist3 = null;
        java.util.ArrayList arraylist2 = null;
        long l3 = 0L;
        long l2 = 0L;
        java.util.ArrayList arraylist1 = null;
        java.util.ArrayList arraylist = null;
        int j = 0;
        long l1 = 0L;
        DataSource datasource = null;
        int i = 0;
        boolean flag1 = false;
        boolean flag = false;
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
                    arraylist3 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, i1, DataType.CREATOR);
                    break;

                case 1000: 
                    k = com.google.android.gms.common.internal.safeparcel.a.g(parcel, i1);
                    break;

                case 2: // '\002'
                    arraylist2 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, i1, DataSource.CREATOR);
                    break;

                case 3: // '\003'
                    l3 = com.google.android.gms.common.internal.safeparcel.a.i(parcel, i1);
                    break;

                case 4: // '\004'
                    l2 = com.google.android.gms.common.internal.safeparcel.a.i(parcel, i1);
                    break;

                case 5: // '\005'
                    arraylist1 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, i1, DataType.CREATOR);
                    break;

                case 6: // '\006'
                    arraylist = com.google.android.gms.common.internal.safeparcel.a.c(parcel, i1, DataSource.CREATOR);
                    break;

                case 7: // '\007'
                    j = com.google.android.gms.common.internal.safeparcel.a.g(parcel, i1);
                    break;

                case 8: // '\b'
                    l1 = com.google.android.gms.common.internal.safeparcel.a.i(parcel, i1);
                    break;

                case 9: // '\t'
                    datasource = (DataSource)com.google.android.gms.common.internal.safeparcel.a.a(parcel, i1, DataSource.CREATOR);
                    break;

                case 10: // '\n'
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, i1);
                    break;

                case 12: // '\f'
                    flag1 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, i1);
                    break;

                case 13: // '\r'
                    flag = com.google.android.gms.common.internal.safeparcel.a.c(parcel, i1);
                    break;
                }
            } else
            if (parcel.dataPosition() != l)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(l).toString(), parcel);
            } else
            {
                return new DataReadRequest(k, arraylist3, arraylist2, l3, l2, arraylist1, arraylist, j, l1, datasource, i, flag1, flag);
            }
        } while (true);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return bL(parcel);
    }

    public DataReadRequest[] df(int i)
    {
        return new DataReadRequest[i];
    }

    public Object[] newArray(int i)
    {
        return df(i);
    }
}
