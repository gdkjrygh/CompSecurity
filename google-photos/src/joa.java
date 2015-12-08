// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import com.google.android.gms.ads.internal.client.MobileAdsSettingsParcel;

public final class joa
    implements android.os.Parcelable.Creator
{

    public joa()
    {
    }

    public static MobileAdsSettingsParcel a(Parcel parcel)
    {
        boolean flag = false;
        int j = b.b(parcel);
        String s = null;
        int i = 0;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = parcel.readInt();
                switch (0xffff & k)
                {
                default:
                    b.b(parcel, k);
                    break;

                case 1: // '\001'
                    i = b.e(parcel, k);
                    break;

                case 2: // '\002'
                    flag = b.c(parcel, k);
                    break;

                case 3: // '\003'
                    s = b.i(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new ao((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new MobileAdsSettingsParcel(i, flag, s);
            }
        } while (true);
    }

    public static void a(MobileAdsSettingsParcel mobileadssettingsparcel, Parcel parcel)
    {
        int i = b.q(parcel, 20293);
        b.c(parcel, 1, mobileadssettingsparcel.a);
        b.a(parcel, 2, mobileadssettingsparcel.b);
        b.a(parcel, 3, mobileadssettingsparcel.c, false);
        b.r(parcel, i);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public final Object[] newArray(int i)
    {
        return new MobileAdsSettingsParcel[i];
    }
}
