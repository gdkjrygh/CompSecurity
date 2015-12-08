// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.request;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.fitness.data.DataType;

// Referenced classes of package com.google.android.gms.fitness.request:
//            StartBleScanRequest

public class ac
    implements android.os.Parcelable.Creator
{

    public ac()
    {
    }

    static void a(StartBleScanRequest startblescanrequest, Parcel parcel, int i)
    {
        i = b.D(parcel);
        b.c(parcel, 1, startblescanrequest.getDataTypes(), false);
        b.c(parcel, 1000, startblescanrequest.getVersionCode());
        b.a(parcel, 2, startblescanrequest.jC(), false);
        b.c(parcel, 3, startblescanrequest.getTimeoutSecs());
        b.H(parcel, i);
    }

    public StartBleScanRequest bQ(Parcel parcel)
    {
        android.os.IBinder ibinder = null;
        int j = 0;
        int k = com.google.android.gms.common.internal.safeparcel.a.C(parcel);
        java.util.ArrayList arraylist = null;
        int i = 0;
        do
        {
            if (parcel.dataPosition() < k)
            {
                int l = com.google.android.gms.common.internal.safeparcel.a.B(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.aD(l))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, l);
                    break;

                case 1: // '\001'
                    arraylist = com.google.android.gms.common.internal.safeparcel.a.c(parcel, l, DataType.CREATOR);
                    break;

                case 1000: 
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l);
                    break;

                case 2: // '\002'
                    ibinder = com.google.android.gms.common.internal.safeparcel.a.p(parcel, l);
                    break;

                case 3: // '\003'
                    j = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(k).toString(), parcel);
            } else
            {
                return new StartBleScanRequest(i, arraylist, ibinder, j);
            }
        } while (true);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return bQ(parcel);
    }

    public StartBleScanRequest[] di(int i)
    {
        return new StartBleScanRequest[i];
    }

    public Object[] newArray(int i)
    {
        return di(i);
    }
}
