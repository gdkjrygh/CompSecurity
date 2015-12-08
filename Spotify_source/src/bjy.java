// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import com.google.android.gms.ads.internal.reward.mediation.client.RewardItemParcel;
import com.google.android.gms.common.internal.safeparcel.zza;

public final class bjy
    implements android.os.Parcelable.Creator
{

    public bjy()
    {
    }

    public static RewardItemParcel a(Parcel parcel)
    {
        int j = 0;
        int k = zza.a(parcel);
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
                    zza.b(parcel, l);
                    break;

                case 1: // '\001'
                    i = zza.e(parcel, l);
                    break;

                case 2: // '\002'
                    s = zza.h(parcel, l);
                    break;

                case 3: // '\003'
                    j = zza.e(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
            } else
            {
                return new RewardItemParcel(i, s, j);
            }
        } while (true);
    }

    public static void a(RewardItemParcel rewarditemparcel, Parcel parcel)
    {
        int i = brp.a(parcel, 20293);
        brp.b(parcel, 1, rewarditemparcel.a);
        brp.a(parcel, 2, rewarditemparcel.b);
        brp.b(parcel, 3, rewarditemparcel.c);
        brp.b(parcel, i);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public final Object[] newArray(int i)
    {
        return new RewardItemParcel[i];
    }
}
