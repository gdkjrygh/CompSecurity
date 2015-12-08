// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.internal:
//            ld

public final class le
    implements android.os.Parcelable.Creator
{

    public le()
    {
    }

    static void a(ld ld1, Parcel parcel, int i)
    {
        i = b.bU(parcel);
        b.c(parcel, 1, ld1.mVersionCode);
        b.a(parcel, 2, ld1.WP, false);
        b.c(parcel, 3, ld1.WQ);
        b.J(parcel, i);
    }

    public static ld bX(Parcel parcel)
    {
        int j = 0;
        int k = com.google.android.gms.common.internal.safeparcel.a.bT(parcel);
        String s = null;
        int i = 0;
        do
        {
            if (parcel.dataPosition() < k)
            {
                int l = com.google.android.gms.common.internal.safeparcel.a.bS(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.dk(l))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, l);
                    break;

                case 1: // '\001'
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l);
                    break;

                case 2: // '\002'
                    s = com.google.android.gms.common.internal.safeparcel.a.p(parcel, l);
                    break;

                case 3: // '\003'
                    j = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
            } else
            {
                return new ld(i, s, j);
            }
        } while (true);
    }

    private static ld[] dp(int i)
    {
        return new ld[i];
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return bX(parcel);
    }

    public final Object[] newArray(int i)
    {
        return dp(i);
    }
}
