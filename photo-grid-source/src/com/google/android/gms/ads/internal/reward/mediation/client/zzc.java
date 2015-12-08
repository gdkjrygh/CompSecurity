// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.reward.mediation.client;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;

// Referenced classes of package com.google.android.gms.ads.internal.reward.mediation.client:
//            RewardItemParcel

public class zzc
    implements android.os.Parcelable.Creator
{

    public zzc()
    {
    }

    static void a(RewardItemParcel rewarditemparcel, Parcel parcel)
    {
        int i = c.a(parcel);
        c.a(parcel, 1, rewarditemparcel.versionCode);
        c.a(parcel, 2, rewarditemparcel.type, false);
        c.a(parcel, 3, rewarditemparcel.zzHv);
        c.a(parcel, i);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzo(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzL(i);
    }

    public RewardItemParcel[] zzL(int i)
    {
        return new RewardItemParcel[i];
    }

    public RewardItemParcel zzo(Parcel parcel)
    {
        int j = 0;
        int k = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
        String s = null;
        int i = 0;
        do
        {
            if (parcel.dataPosition() < k)
            {
                int l = parcel.readInt();
                switch (0xffff & l)
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, l);
                    break;

                case 1: // '\001'
                    i = com.google.android.gms.common.internal.safeparcel.a.d(parcel, l);
                    break;

                case 2: // '\002'
                    s = com.google.android.gms.common.internal.safeparcel.a.j(parcel, l);
                    break;

                case 3: // '\003'
                    j = com.google.android.gms.common.internal.safeparcel.a.d(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new b((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
            } else
            {
                return new RewardItemParcel(i, s, j);
            }
        } while (true);
    }
}
