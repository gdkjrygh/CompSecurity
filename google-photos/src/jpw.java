// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import com.google.android.gms.ads.internal.reward.mediation.client.RewardItemParcel;

public final class jpw
    implements android.os.Parcelable.Creator
{

    public jpw()
    {
    }

    public static RewardItemParcel a(Parcel parcel)
    {
        int j = 0;
        int k = b.b(parcel);
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
                    b.b(parcel, l);
                    break;

                case 1: // '\001'
                    i = b.e(parcel, l);
                    break;

                case 2: // '\002'
                    s = b.i(parcel, l);
                    break;

                case 3: // '\003'
                    j = b.e(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new ao((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
            } else
            {
                return new RewardItemParcel(i, s, j);
            }
        } while (true);
    }

    public static void a(RewardItemParcel rewarditemparcel, Parcel parcel)
    {
        int i = b.q(parcel, 20293);
        b.c(parcel, 1, rewarditemparcel.a);
        b.a(parcel, 2, rewarditemparcel.b, false);
        b.c(parcel, 3, rewarditemparcel.c);
        b.r(parcel, i);
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
