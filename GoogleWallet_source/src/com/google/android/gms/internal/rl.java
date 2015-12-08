// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.internal:
//            rk

public final class rl
    implements android.os.Parcelable.Creator
{

    public rl()
    {
    }

    static void a(rk rk1, Parcel parcel, int i)
    {
        i = b.bU(parcel);
        b.c(parcel, 1, rk1.qI());
        b.c(parcel, 1000, rk1.getVersionCode());
        b.c(parcel, 2, rk1.qJ());
        b.a(parcel, 3, rk1.qK());
        b.J(parcel, i);
    }

    public static rk gJ(Parcel parcel)
    {
        boolean flag = false;
        int l = com.google.android.gms.common.internal.safeparcel.a.bT(parcel);
        int k = 0;
        int j = 0;
        int i = 0;
        do
        {
            if (parcel.dataPosition() < l)
            {
                int i1 = com.google.android.gms.common.internal.safeparcel.a.bS(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.dk(i1))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, i1);
                    break;

                case 1: // '\001'
                    j = com.google.android.gms.common.internal.safeparcel.a.g(parcel, i1);
                    break;

                case 1000: 
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, i1);
                    break;

                case 2: // '\002'
                    k = com.google.android.gms.common.internal.safeparcel.a.g(parcel, i1);
                    break;

                case 3: // '\003'
                    flag = com.google.android.gms.common.internal.safeparcel.a.c(parcel, i1);
                    break;
                }
            } else
            if (parcel.dataPosition() != l)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder("Overread allowed size end=")).append(l).toString(), parcel);
            } else
            {
                return new rk(i, j, k, flag);
            }
        } while (true);
    }

    private static rk[] jm(int i)
    {
        return new rk[i];
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return gJ(parcel);
    }

    public final Object[] newArray(int i)
    {
        return jm(i);
    }
}
