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

public final class c
    implements android.os.Parcelable.Creator
{

    public c()
    {
    }

    static void a(RewardedVideoAdRequestParcel rewardedvideoadrequestparcel, Parcel parcel, int i)
    {
        int j = b.a(parcel);
        b.a(parcel, 1, rewardedvideoadrequestparcel.a);
        b.a(parcel, 2, rewardedvideoadrequestparcel.b, i);
        b.a(parcel, 3, rewardedvideoadrequestparcel.c);
        b.a(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        int j = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
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
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, k);
                    break;

                case 1: // '\001'
                    i = com.google.android.gms.common.internal.safeparcel.a.f(parcel, k);
                    break;

                case 2: // '\002'
                    adrequestparcel = (AdRequestParcel)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, AdRequestParcel.CREATOR);
                    break;

                case 3: // '\003'
                    s = com.google.android.gms.common.internal.safeparcel.a.l(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
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
