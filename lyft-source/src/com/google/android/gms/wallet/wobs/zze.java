// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.wallet.wobs:
//            LoyaltyPoints, LoyaltyPointsBalance, TimeInterval

public class zze
    implements android.os.Parcelable.Creator
{

    public zze()
    {
    }

    static void a(LoyaltyPoints loyaltypoints, Parcel parcel, int i)
    {
        int j = zzb.a(parcel);
        zzb.a(parcel, 1, loyaltypoints.a());
        zzb.a(parcel, 2, loyaltypoints.a, false);
        zzb.a(parcel, 3, loyaltypoints.b, i, false);
        zzb.a(parcel, 4, loyaltypoints.c, false);
        zzb.a(parcel, 5, loyaltypoints.d, i, false);
        zzb.a(parcel, j);
    }

    public LoyaltyPoints a(Parcel parcel)
    {
        TimeInterval timeinterval = null;
        int j = zza.b(parcel);
        int i = 0;
        String s = null;
        LoyaltyPointsBalance loyaltypointsbalance = null;
        String s1 = null;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = zza.a(parcel);
                switch (zza.a(k))
                {
                default:
                    zza.b(parcel, k);
                    break;

                case 1: // '\001'
                    i = zza.f(parcel, k);
                    break;

                case 2: // '\002'
                    s1 = zza.m(parcel, k);
                    break;

                case 3: // '\003'
                    loyaltypointsbalance = (LoyaltyPointsBalance)zza.a(parcel, k, LoyaltyPointsBalance.CREATOR);
                    break;

                case 4: // '\004'
                    s = zza.m(parcel, k);
                    break;

                case 5: // '\005'
                    timeinterval = (TimeInterval)zza.a(parcel, k, TimeInterval.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new LoyaltyPoints(i, s1, loyaltypointsbalance, s, timeinterval);
            }
        } while (true);
    }

    public LoyaltyPoints[] a(int i)
    {
        return new LoyaltyPoints[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public Object[] newArray(int i)
    {
        return a(i);
    }
}
