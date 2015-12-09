// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.internal:
//            qp

public final class qq
    implements android.os.Parcelable.Creator
{

    public qq()
    {
    }

    static void a(qp qp1, Parcel parcel, int i)
    {
        i = b.bU(parcel);
        b.a(parcel, 1, qp1.getAccountName(), false);
        b.c(parcel, 1000, qp1.getVersionCode());
        b.a(parcel, 2, qp1.qD(), false);
        b.J(parcel, i);
    }

    public static qp gG(Parcel parcel)
    {
        String s1 = null;
        int j = com.google.android.gms.common.internal.safeparcel.a.bT(parcel);
        int i = 0;
        String s = null;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = com.google.android.gms.common.internal.safeparcel.a.bS(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.dk(k))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, k);
                    break;

                case 1: // '\001'
                    s = com.google.android.gms.common.internal.safeparcel.a.p(parcel, k);
                    break;

                case 1000: 
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, k);
                    break;

                case 2: // '\002'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.p(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new qp(i, s, s1);
            }
        } while (true);
    }

    private static qp[] jh(int i)
    {
        return new qp[i];
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return gG(parcel);
    }

    public final Object[] newArray(int i)
    {
        return jh(i);
    }
}
