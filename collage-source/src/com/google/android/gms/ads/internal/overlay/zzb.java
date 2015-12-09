// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.overlay;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.ads.internal.overlay:
//            AdLauncherIntentInfoParcel

public class zzb
    implements android.os.Parcelable.Creator
{

    public zzb()
    {
    }

    static void zza(AdLauncherIntentInfoParcel adlauncherintentinfoparcel, Parcel parcel, int i)
    {
        i = b.a(parcel);
        b.a(parcel, 1, adlauncherintentinfoparcel.versionCode);
        b.a(parcel, 2, adlauncherintentinfoparcel.intentAction, false);
        b.a(parcel, 3, adlauncherintentinfoparcel.url, false);
        b.a(parcel, 4, adlauncherintentinfoparcel.mimeType, false);
        b.a(parcel, 5, adlauncherintentinfoparcel.packageName, false);
        b.a(parcel, 6, adlauncherintentinfoparcel.zzzY, false);
        b.a(parcel, 7, adlauncherintentinfoparcel.zzzZ, false);
        b.a(parcel, 8, adlauncherintentinfoparcel.zzAa, false);
        b.a(parcel, i);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzg(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzs(i);
    }

    public AdLauncherIntentInfoParcel zzg(Parcel parcel)
    {
        String s = null;
        int j = a.b(parcel);
        int i = 0;
        String s1 = null;
        String s2 = null;
        String s3 = null;
        String s4 = null;
        String s5 = null;
        String s6 = null;
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
                    s6 = a.g(parcel, k);
                    break;

                case 3: // '\003'
                    s5 = a.g(parcel, k);
                    break;

                case 4: // '\004'
                    s4 = a.g(parcel, k);
                    break;

                case 5: // '\005'
                    s3 = a.g(parcel, k);
                    break;

                case 6: // '\006'
                    s2 = a.g(parcel, k);
                    break;

                case 7: // '\007'
                    s1 = a.g(parcel, k);
                    break;

                case 8: // '\b'
                    s = a.g(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new AdLauncherIntentInfoParcel(i, s6, s5, s4, s3, s2, s1, s);
            }
        } while (true);
    }

    public AdLauncherIntentInfoParcel[] zzs(int i)
    {
        return new AdLauncherIntentInfoParcel[i];
    }
}
