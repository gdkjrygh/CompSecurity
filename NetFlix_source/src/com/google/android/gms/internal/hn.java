// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.internal:
//            hm

public class hn
    implements android.os.Parcelable.Creator
{

    public hn()
    {
    }

    static void a(hm hm1, Parcel parcel, int i)
    {
        i = b.p(parcel);
        b.a(parcel, 1, hm1.Rd, false);
        b.c(parcel, 1000, hm1.xH);
        b.F(parcel, i);
    }

    public hm aG(Parcel parcel)
    {
        int j = com.google.android.gms.common.internal.safeparcel.a.o(parcel);
        int i = 0;
        String s = null;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = com.google.android.gms.common.internal.safeparcel.a.n(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.R(k))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, k);
                    break;

                case 1: // '\001'
                    s = com.google.android.gms.common.internal.safeparcel.a.n(parcel, k);
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
                return new hm(i, s);
            }
        } while (true);
    }

    public hm[] bH(int i)
    {
        return new hm[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return aG(parcel);
    }

    public Object[] newArray(int i)
    {
        return bH(i);
    }
}
