// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.reward.mediation.client;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.ads.internal.reward.mediation.client:
//            RewardItemParcel

public class zzc
    implements android.os.Parcelable.Creator
{

    public zzc()
    {
    }

    static void zza(RewardItemParcel rewarditemparcel, Parcel parcel, int i)
    {
        i = b.a(parcel);
        b.a(parcel, 1, rewarditemparcel.versionCode);
        b.a(parcel, 2, rewarditemparcel.type, false);
        b.a(parcel, 3, rewarditemparcel.zzGE);
        b.a(parcel, i);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzp(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzK(i);
    }

    public RewardItemParcel[] zzK(int i)
    {
        return new RewardItemParcel[i];
    }

    public RewardItemParcel zzp(Parcel parcel)
    {
        int j = 0;
        int k = a.b(parcel);
        String s = null;
        int i = 0;
        do
        {
            if (parcel.dataPosition() < k)
            {
                int l = a.a(parcel);
                switch (a.a(l))
                {
                default:
                    a.b(parcel, l);
                    break;

                case 1: // '\001'
                    i = a.d(parcel, l);
                    break;

                case 2: // '\002'
                    s = a.g(parcel, l);
                    break;

                case 3: // '\003'
                    j = a.d(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(k).toString(), parcel);
            } else
            {
                return new RewardItemParcel(i, s, j);
            }
        } while (true);
    }
}
