// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.reward.client;

import android.os.Parcel;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.zza;

// Referenced classes of package com.google.android.gms.ads.internal.reward.client:
//            RewardedVideoAdRequestParcel

public final class c
    implements android.os.Parcelable.Creator
{

    public c()
    {
    }

    static void a(RewardedVideoAdRequestParcel rewardedvideoadrequestparcel, Parcel parcel, int i)
    {
        int j = com.google.android.gms.common.internal.safeparcel.a.a(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1, rewardedvideoadrequestparcel.a);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 2, rewardedvideoadrequestparcel.b, i);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 3, rewardedvideoadrequestparcel.c);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        int j = zza.a(parcel);
        AdRequestParcel adrequestparcel = null;
        int i = 0;
        String s = null;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = parcel.readInt();
                switch (0xffff & k)
                {
                default:
                    zza.b(parcel, k);
                    break;

                case 1: // '\001'
                    i = zza.e(parcel, k);
                    break;

                case 2: // '\002'
                    adrequestparcel = (AdRequestParcel)zza.a(parcel, k, AdRequestParcel.CREATOR);
                    break;

                case 3: // '\003'
                    s = zza.l(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new RewardedVideoAdRequestParcel(i, adrequestparcel, s);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new RewardedVideoAdRequestParcel[i];
    }
}
