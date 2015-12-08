// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.service;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.fitness.data.DataSource;

// Referenced classes of package com.google.android.gms.fitness.service:
//            FitnessSensorServiceRequest

public class a
    implements android.os.Parcelable.Creator
{

    public a()
    {
    }

    static void a(FitnessSensorServiceRequest fitnesssensorservicerequest, Parcel parcel, int i)
    {
        int j = b.H(parcel);
        b.a(parcel, 1, fitnesssensorservicerequest.getDataSource(), i, false);
        b.c(parcel, 1000, fitnesssensorservicerequest.getVersionCode());
        b.a(parcel, 2, fitnesssensorservicerequest.kg(), false);
        b.a(parcel, 3, fitnesssensorservicerequest.jI());
        b.a(parcel, 4, fitnesssensorservicerequest.kx());
        b.H(parcel, j);
    }

    public FitnessSensorServiceRequest ck(Parcel parcel)
    {
        long l = 0L;
        android.os.IBinder ibinder = null;
        int j = com.google.android.gms.common.internal.safeparcel.a.G(parcel);
        int i = 0;
        long l1 = 0L;
        DataSource datasource = null;
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
                    datasource = (DataSource)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, DataSource.CREATOR);
                    break;

                case 1000: 
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, k);
                    break;

                case 2: // '\002'
                    ibinder = com.google.android.gms.common.internal.safeparcel.a.p(parcel, k);
                    break;

                case 3: // '\003'
                    l1 = com.google.android.gms.common.internal.safeparcel.a.i(parcel, k);
                    break;

                case 4: // '\004'
                    l = com.google.android.gms.common.internal.safeparcel.a.i(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new FitnessSensorServiceRequest(i, datasource, ibinder, l1, l);
            }
        } while (true);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return ck(parcel);
    }

    public FitnessSensorServiceRequest[] dF(int i)
    {
        return new FitnessSensorServiceRequest[i];
    }

    public Object[] newArray(int i)
    {
        return dF(i);
    }
}
