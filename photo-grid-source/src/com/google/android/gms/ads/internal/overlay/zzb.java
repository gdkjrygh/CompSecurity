// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.overlay;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;

// Referenced classes of package com.google.android.gms.ads.internal.overlay:
//            AdLauncherIntentInfoParcel

public class zzb
    implements android.os.Parcelable.Creator
{

    public zzb()
    {
    }

    static void a(AdLauncherIntentInfoParcel adlauncherintentinfoparcel, Parcel parcel)
    {
        int i = c.a(parcel);
        c.a(parcel, 1, adlauncherintentinfoparcel.versionCode);
        c.a(parcel, 2, adlauncherintentinfoparcel.intentAction, false);
        c.a(parcel, 3, adlauncherintentinfoparcel.url, false);
        c.a(parcel, 4, adlauncherintentinfoparcel.mimeType, false);
        c.a(parcel, 5, adlauncherintentinfoparcel.packageName, false);
        c.a(parcel, 6, adlauncherintentinfoparcel.zzAL, false);
        c.a(parcel, 7, adlauncherintentinfoparcel.zzAM, false);
        c.a(parcel, 8, adlauncherintentinfoparcel.zzAN, false);
        c.a(parcel, i);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzf(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzs(i);
    }

    public AdLauncherIntentInfoParcel zzf(Parcel parcel)
    {
        String s = null;
        int j = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
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
                int k = parcel.readInt();
                switch (0xffff & k)
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, k);
                    break;

                case 1: // '\001'
                    i = com.google.android.gms.common.internal.safeparcel.a.d(parcel, k);
                    break;

                case 2: // '\002'
                    s6 = com.google.android.gms.common.internal.safeparcel.a.j(parcel, k);
                    break;

                case 3: // '\003'
                    s5 = com.google.android.gms.common.internal.safeparcel.a.j(parcel, k);
                    break;

                case 4: // '\004'
                    s4 = com.google.android.gms.common.internal.safeparcel.a.j(parcel, k);
                    break;

                case 5: // '\005'
                    s3 = com.google.android.gms.common.internal.safeparcel.a.j(parcel, k);
                    break;

                case 6: // '\006'
                    s2 = com.google.android.gms.common.internal.safeparcel.a.j(parcel, k);
                    break;

                case 7: // '\007'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.j(parcel, k);
                    break;

                case 8: // '\b'
                    s = com.google.android.gms.common.internal.safeparcel.a.j(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new b((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
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
