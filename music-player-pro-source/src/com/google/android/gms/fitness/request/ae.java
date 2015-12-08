// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.request;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.fitness.request:
//            ad

public class ae
    implements android.os.Parcelable.Creator
{

    public ae()
    {
    }

    static void a(ad ad1, Parcel parcel, int i)
    {
        i = b.H(parcel);
        b.a(parcel, 1, ad1.km(), false);
        b.c(parcel, 1000, ad1.getVersionCode());
        b.H(parcel, i);
    }

    public ad bZ(Parcel parcel)
    {
        int j = com.google.android.gms.common.internal.safeparcel.a.G(parcel);
        int i = 0;
        android.os.IBinder ibinder = null;
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
                    ibinder = com.google.android.gms.common.internal.safeparcel.a.p(parcel, k);
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
                return new ad(i, ibinder);
            }
        } while (true);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return bZ(parcel);
    }

    public ad[] du(int i)
    {
        return new ad[i];
    }

    public Object[] newArray(int i)
    {
        return du(i);
    }
}
