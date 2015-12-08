// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.wallet.wobs:
//            TimeInterval

public final class g
    implements android.os.Parcelable.Creator
{

    public g()
    {
    }

    static void a(TimeInterval timeinterval, Parcel parcel, int i)
    {
        i = b.bU(parcel);
        b.c(parcel, 1, timeinterval.getVersionCode());
        b.a(parcel, 2, timeinterval.aVZ);
        b.a(parcel, 3, timeinterval.aWa);
        b.J(parcel, i);
    }

    private static TimeInterval iA(Parcel parcel)
    {
        long l = 0L;
        int j = com.google.android.gms.common.internal.safeparcel.a.bT(parcel);
        int i = 0;
        long l1 = 0L;
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
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, k);
                    break;

                case 2: // '\002'
                    l1 = com.google.android.gms.common.internal.safeparcel.a.i(parcel, k);
                    break;

                case 3: // '\003'
                    l = com.google.android.gms.common.internal.safeparcel.a.i(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new TimeInterval(i, l1, l);
            }
        } while (true);
    }

    private static TimeInterval[] lA(int i)
    {
        return new TimeInterval[i];
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return iA(parcel);
    }

    public final Object[] newArray(int i)
    {
        return lA(i);
    }
}
