// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.reward.client;

import android.os.Parcel;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.ads.internal.reward.client:
//            RewardedVideoAdRequestParcel

public class zzh
    implements android.os.Parcelable.Creator
{

    public zzh()
    {
    }

    static void zza(RewardedVideoAdRequestParcel rewardedvideoadrequestparcel, Parcel parcel, int i)
    {
        int j = b.a(parcel);
        b.a(parcel, 1, rewardedvideoadrequestparcel.versionCode);
        b.a(parcel, 2, rewardedvideoadrequestparcel.zzDy, i, false);
        b.a(parcel, 3, rewardedvideoadrequestparcel.zzpZ, false);
        b.a(parcel, j);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzo(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzI(i);
    }

    public RewardedVideoAdRequestParcel[] zzI(int i)
    {
        return new RewardedVideoAdRequestParcel[i];
    }

    public RewardedVideoAdRequestParcel zzo(Parcel parcel)
    {
        String s = null;
        int j = a.b(parcel);
        int i = 0;
        AdRequestParcel adrequestparcel = null;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = a.a(parcel);
                switch (a.a(k))
                {
                default:
                    a.b(parcel, k);
                    break;

                case 1: // '\001'
                    i = a.d(parcel, k);
                    break;

                case 2: // '\002'
                    adrequestparcel = (AdRequestParcel)a.a(parcel, k, AdRequestParcel.CREATOR);
                    break;

                case 3: // '\003'
                    s = a.g(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new RewardedVideoAdRequestParcel(i, adrequestparcel, s);
            }
        } while (true);
    }
}
