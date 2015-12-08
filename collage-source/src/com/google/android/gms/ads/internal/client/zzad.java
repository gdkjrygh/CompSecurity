// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.ads.internal.client:
//            MobileAdsSettingsParcel

public class zzad
    implements android.os.Parcelable.Creator
{

    public zzad()
    {
    }

    static void zza(MobileAdsSettingsParcel mobileadssettingsparcel, Parcel parcel, int i)
    {
        i = b.a(parcel);
        b.a(parcel, 1, mobileadssettingsparcel.versionCode);
        b.a(parcel, 2, mobileadssettingsparcel.zzty);
        b.a(parcel, 3, mobileadssettingsparcel.zztz, false);
        b.a(parcel, i);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzd(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzn(i);
    }

    public MobileAdsSettingsParcel zzd(Parcel parcel)
    {
        boolean flag = false;
        int j = a.b(parcel);
        String s = null;
        int i = 0;
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
                    flag = a.c(parcel, k);
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
                return new MobileAdsSettingsParcel(i, flag, s);
            }
        } while (true);
    }

    public MobileAdsSettingsParcel[] zzn(int i)
    {
        return new MobileAdsSettingsParcel[i];
    }
}
