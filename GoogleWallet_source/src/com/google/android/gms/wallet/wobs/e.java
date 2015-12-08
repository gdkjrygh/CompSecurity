// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.wallet.wobs:
//            LoyaltyPoints, LoyaltyPointsBalance, TimeInterval

public final class e
    implements android.os.Parcelable.Creator
{

    public e()
    {
    }

    static void a(LoyaltyPoints loyaltypoints, Parcel parcel, int i)
    {
        int j = b.bU(parcel);
        b.c(parcel, 1, loyaltypoints.getVersionCode());
        b.a(parcel, 2, loyaltypoints.label, false);
        b.a(parcel, 3, loyaltypoints.aVP, i, false);
        b.a(parcel, 4, loyaltypoints.type, false);
        b.a(parcel, 5, loyaltypoints.aTU, i, false);
        b.J(parcel, j);
    }

    private static LoyaltyPoints iy(Parcel parcel)
    {
        TimeInterval timeinterval = null;
        int j = com.google.android.gms.common.internal.safeparcel.a.bT(parcel);
        int i = 0;
        String s = null;
        LoyaltyPointsBalance loyaltypointsbalance = null;
        String s1 = null;
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
                    s1 = com.google.android.gms.common.internal.safeparcel.a.p(parcel, k);
                    break;

                case 3: // '\003'
                    loyaltypointsbalance = (LoyaltyPointsBalance)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, LoyaltyPointsBalance.CREATOR);
                    break;

                case 4: // '\004'
                    s = com.google.android.gms.common.internal.safeparcel.a.p(parcel, k);
                    break;

                case 5: // '\005'
                    timeinterval = (TimeInterval)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, TimeInterval.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new LoyaltyPoints(i, s1, loyaltypointsbalance, s, timeinterval);
            }
        } while (true);
    }

    private static LoyaltyPoints[] ly(int i)
    {
        return new LoyaltyPoints[i];
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return iy(parcel);
    }

    public final Object[] newArray(int i)
    {
        return ly(i);
    }
}
