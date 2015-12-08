// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.wallet.wobs:
//            LoyaltyPointsBalance

public final class d
    implements android.os.Parcelable.Creator
{

    public d()
    {
    }

    static void a(LoyaltyPointsBalance loyaltypointsbalance, Parcel parcel, int i)
    {
        i = b.bU(parcel);
        b.c(parcel, 1, loyaltypointsbalance.getVersionCode());
        b.c(parcel, 2, loyaltypointsbalance.aVR);
        b.a(parcel, 3, loyaltypointsbalance.aVS, false);
        b.a(parcel, 4, loyaltypointsbalance.aVT);
        b.a(parcel, 5, loyaltypointsbalance.aVU, false);
        b.a(parcel, 6, loyaltypointsbalance.aVV);
        b.c(parcel, 7, loyaltypointsbalance.aVW);
        b.J(parcel, i);
    }

    private static LoyaltyPointsBalance ix(Parcel parcel)
    {
        String s = null;
        int j = 0;
        int l = com.google.android.gms.common.internal.safeparcel.a.bT(parcel);
        double d1 = 0.0D;
        long l1 = 0L;
        int i = -1;
        String s1 = null;
        int k = 0;
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
                    k = com.google.android.gms.common.internal.safeparcel.a.g(parcel, i1);
                    break;

                case 2: // '\002'
                    j = com.google.android.gms.common.internal.safeparcel.a.g(parcel, i1);
                    break;

                case 3: // '\003'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.p(parcel, i1);
                    break;

                case 4: // '\004'
                    d1 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, i1);
                    break;

                case 5: // '\005'
                    s = com.google.android.gms.common.internal.safeparcel.a.p(parcel, i1);
                    break;

                case 6: // '\006'
                    l1 = com.google.android.gms.common.internal.safeparcel.a.i(parcel, i1);
                    break;

                case 7: // '\007'
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, i1);
                    break;
                }
            } else
            if (parcel.dataPosition() != l)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder("Overread allowed size end=")).append(l).toString(), parcel);
            } else
            {
                return new LoyaltyPointsBalance(k, j, s1, d1, s, l1, i);
            }
        } while (true);
    }

    private static LoyaltyPointsBalance[] lx(int i)
    {
        return new LoyaltyPointsBalance[i];
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return ix(parcel);
    }

    public final Object[] newArray(int i)
    {
        return lx(i);
    }
}
