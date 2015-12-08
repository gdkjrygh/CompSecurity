// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.wallet.wobs:
//            LoyaltyPointsBalance

public class zzd
    implements android.os.Parcelable.Creator
{

    public zzd()
    {
    }

    static void a(LoyaltyPointsBalance loyaltypointsbalance, Parcel parcel, int i)
    {
        i = zzb.a(parcel);
        zzb.a(parcel, 1, loyaltypointsbalance.a());
        zzb.a(parcel, 2, loyaltypointsbalance.a);
        zzb.a(parcel, 3, loyaltypointsbalance.b, false);
        zzb.a(parcel, 4, loyaltypointsbalance.c);
        zzb.a(parcel, 5, loyaltypointsbalance.d, false);
        zzb.a(parcel, 6, loyaltypointsbalance.e);
        zzb.a(parcel, 7, loyaltypointsbalance.f);
        zzb.a(parcel, i);
    }

    public LoyaltyPointsBalance a(Parcel parcel)
    {
        String s = null;
        int j = 0;
        int l = zza.b(parcel);
        double d = 0.0D;
        long l1 = 0L;
        int i = -1;
        String s1 = null;
        int k = 0;
        do
        {
            if (parcel.dataPosition() < l)
            {
                int i1 = zza.a(parcel);
                switch (zza.a(i1))
                {
                default:
                    zza.b(parcel, i1);
                    break;

                case 1: // '\001'
                    k = zza.f(parcel, i1);
                    break;

                case 2: // '\002'
                    j = zza.f(parcel, i1);
                    break;

                case 3: // '\003'
                    s1 = zza.m(parcel, i1);
                    break;

                case 4: // '\004'
                    d = zza.k(parcel, i1);
                    break;

                case 5: // '\005'
                    s = zza.m(parcel, i1);
                    break;

                case 6: // '\006'
                    l1 = zza.h(parcel, i1);
                    break;

                case 7: // '\007'
                    i = zza.f(parcel, i1);
                    break;
                }
            } else
            if (parcel.dataPosition() != l)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(l).toString(), parcel);
            } else
            {
                return new LoyaltyPointsBalance(k, j, s1, d, s, l1, i);
            }
        } while (true);
    }

    public LoyaltyPointsBalance[] a(int i)
    {
        return new LoyaltyPointsBalance[i];
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
