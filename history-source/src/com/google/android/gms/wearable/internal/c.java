// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.content.IntentFilter;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            b

public class c
    implements android.os.Parcelable.Creator
{

    public c()
    {
    }

    static void a(com.google.android.gms.wearable.internal.b b1, Parcel parcel, int i)
    {
        int j = b.H(parcel);
        b.c(parcel, 1, b1.CK);
        b.a(parcel, 2, b1.rm(), false);
        b.a(parcel, 3, b1.axw, i, false);
        b.H(parcel, j);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return eo(parcel);
    }

    public com.google.android.gms.wearable.internal.b eo(Parcel parcel)
    {
        IntentFilter aintentfilter[] = null;
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
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, k);
                    break;

                case 2: // '\002'
                    ibinder = com.google.android.gms.common.internal.safeparcel.a.p(parcel, k);
                    break;

                case 3: // '\003'
                    aintentfilter = (IntentFilter[])com.google.android.gms.common.internal.safeparcel.a.b(parcel, k, IntentFilter.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new com.google.android.gms.wearable.internal.b(i, ibinder, aintentfilter);
            }
        } while (true);
    }

    public com.google.android.gms.wearable.internal.b[] gx(int i)
    {
        return new com.google.android.gms.wearable.internal.b[i];
    }

    public Object[] newArray(int i)
    {
        return gx(i);
    }
}
