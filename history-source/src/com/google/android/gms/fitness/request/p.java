// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.request;

import android.app.PendingIntent;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.location.LocationRequest;

// Referenced classes of package com.google.android.gms.fitness.request:
//            o

public class p
    implements android.os.Parcelable.Creator
{

    public p()
    {
    }

    static void a(o o1, Parcel parcel, int i)
    {
        int j = b.H(parcel);
        b.a(parcel, 1, o1.getDataSource(), i, false);
        b.c(parcel, 1000, o1.getVersionCode());
        b.a(parcel, 2, o1.getDataType(), i, false);
        b.a(parcel, 3, o1.kg(), false);
        b.c(parcel, 4, o1.VX);
        b.c(parcel, 5, o1.VY);
        b.a(parcel, 6, o1.jI());
        b.a(parcel, 7, o1.kd());
        b.a(parcel, 8, o1.kb(), i, false);
        b.a(parcel, 9, o1.kc());
        b.c(parcel, 10, o1.getAccuracyMode());
        b.c(parcel, 11, o1.ke(), false);
        b.a(parcel, 12, o1.kf());
        b.H(parcel, j);
    }

    public o bQ(Parcel parcel)
    {
        int i1 = com.google.android.gms.common.internal.safeparcel.a.G(parcel);
        int l = 0;
        DataSource datasource = null;
        DataType datatype = null;
        android.os.IBinder ibinder = null;
        int k = 0;
        int j = 0;
        long l4 = 0L;
        long l3 = 0L;
        PendingIntent pendingintent = null;
        long l2 = 0L;
        int i = 0;
        java.util.ArrayList arraylist = null;
        long l1 = 0L;
        do
        {
            if (parcel.dataPosition() < i1)
            {
                int j1 = com.google.android.gms.common.internal.safeparcel.a.F(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.aH(j1))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, j1);
                    break;

                case 1: // '\001'
                    datasource = (DataSource)com.google.android.gms.common.internal.safeparcel.a.a(parcel, j1, DataSource.CREATOR);
                    break;

                case 1000: 
                    l = com.google.android.gms.common.internal.safeparcel.a.g(parcel, j1);
                    break;

                case 2: // '\002'
                    datatype = (DataType)com.google.android.gms.common.internal.safeparcel.a.a(parcel, j1, DataType.CREATOR);
                    break;

                case 3: // '\003'
                    ibinder = com.google.android.gms.common.internal.safeparcel.a.p(parcel, j1);
                    break;

                case 4: // '\004'
                    k = com.google.android.gms.common.internal.safeparcel.a.g(parcel, j1);
                    break;

                case 5: // '\005'
                    j = com.google.android.gms.common.internal.safeparcel.a.g(parcel, j1);
                    break;

                case 6: // '\006'
                    l4 = com.google.android.gms.common.internal.safeparcel.a.i(parcel, j1);
                    break;

                case 7: // '\007'
                    l3 = com.google.android.gms.common.internal.safeparcel.a.i(parcel, j1);
                    break;

                case 8: // '\b'
                    pendingintent = (PendingIntent)com.google.android.gms.common.internal.safeparcel.a.a(parcel, j1, PendingIntent.CREATOR);
                    break;

                case 9: // '\t'
                    l2 = com.google.android.gms.common.internal.safeparcel.a.i(parcel, j1);
                    break;

                case 10: // '\n'
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, j1);
                    break;

                case 11: // '\013'
                    arraylist = com.google.android.gms.common.internal.safeparcel.a.c(parcel, j1, LocationRequest.CREATOR);
                    break;

                case 12: // '\f'
                    l1 = com.google.android.gms.common.internal.safeparcel.a.i(parcel, j1);
                    break;
                }
            } else
            if (parcel.dataPosition() != i1)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(i1).toString(), parcel);
            } else
            {
                return new o(l, datasource, datatype, ibinder, k, j, l4, l3, pendingintent, l2, i, arraylist, l1);
            }
        } while (true);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return bQ(parcel);
    }

    public o[] dk(int i)
    {
        return new o[i];
    }

    public Object[] newArray(int i)
    {
        return dk(i);
    }
}
