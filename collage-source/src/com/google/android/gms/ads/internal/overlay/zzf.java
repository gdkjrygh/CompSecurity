// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.overlay;

import android.os.Parcel;
import com.google.android.gms.ads.internal.InterstitialAdParameterParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.ads.internal.overlay:
//            AdOverlayInfoParcel, AdLauncherIntentInfoParcel

public class zzf
    implements android.os.Parcelable.Creator
{

    public zzf()
    {
    }

    static void zza(AdOverlayInfoParcel adoverlayinfoparcel, Parcel parcel, int i)
    {
        int j = b.a(parcel);
        b.a(parcel, 1, adoverlayinfoparcel.versionCode);
        b.a(parcel, 2, adoverlayinfoparcel.zzAO, i, false);
        b.a(parcel, 3, adoverlayinfoparcel.zzeE(), false);
        b.a(parcel, 4, adoverlayinfoparcel.zzeF(), false);
        b.a(parcel, 5, adoverlayinfoparcel.zzeG(), false);
        b.a(parcel, 6, adoverlayinfoparcel.zzeH(), false);
        b.a(parcel, 7, adoverlayinfoparcel.zzAT, false);
        b.a(parcel, 8, adoverlayinfoparcel.zzAU);
        b.a(parcel, 9, adoverlayinfoparcel.zzAV, false);
        b.a(parcel, 10, adoverlayinfoparcel.zzeJ(), false);
        b.a(parcel, 11, adoverlayinfoparcel.orientation);
        b.a(parcel, 12, adoverlayinfoparcel.zzAX);
        b.a(parcel, 13, adoverlayinfoparcel.url, false);
        b.a(parcel, 14, adoverlayinfoparcel.zzqb, i, false);
        b.a(parcel, 15, adoverlayinfoparcel.zzeI(), false);
        b.a(parcel, 17, adoverlayinfoparcel.zzBa, i, false);
        b.a(parcel, 16, adoverlayinfoparcel.zzAZ, false);
        b.a(parcel, j);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzh(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzw(i);
    }

    public AdOverlayInfoParcel zzh(Parcel parcel)
    {
        int l = a.b(parcel);
        int k = 0;
        AdLauncherIntentInfoParcel adlauncherintentinfoparcel = null;
        android.os.IBinder ibinder5 = null;
        android.os.IBinder ibinder4 = null;
        android.os.IBinder ibinder3 = null;
        android.os.IBinder ibinder2 = null;
        String s3 = null;
        boolean flag = false;
        String s2 = null;
        android.os.IBinder ibinder1 = null;
        int j = 0;
        int i = 0;
        String s1 = null;
        VersionInfoParcel versioninfoparcel = null;
        android.os.IBinder ibinder = null;
        String s = null;
        InterstitialAdParameterParcel interstitialadparameterparcel = null;
        do
        {
            if (parcel.dataPosition() < l)
            {
                int i1 = a.a(parcel);
                switch (a.a(i1))
                {
                default:
                    a.b(parcel, i1);
                    break;

                case 1: // '\001'
                    k = a.d(parcel, i1);
                    break;

                case 2: // '\002'
                    adlauncherintentinfoparcel = (AdLauncherIntentInfoParcel)a.a(parcel, i1, AdLauncherIntentInfoParcel.CREATOR);
                    break;

                case 3: // '\003'
                    ibinder5 = a.h(parcel, i1);
                    break;

                case 4: // '\004'
                    ibinder4 = a.h(parcel, i1);
                    break;

                case 5: // '\005'
                    ibinder3 = a.h(parcel, i1);
                    break;

                case 6: // '\006'
                    ibinder2 = a.h(parcel, i1);
                    break;

                case 7: // '\007'
                    s3 = a.g(parcel, i1);
                    break;

                case 8: // '\b'
                    flag = a.c(parcel, i1);
                    break;

                case 9: // '\t'
                    s2 = a.g(parcel, i1);
                    break;

                case 10: // '\n'
                    ibinder1 = a.h(parcel, i1);
                    break;

                case 11: // '\013'
                    j = a.d(parcel, i1);
                    break;

                case 12: // '\f'
                    i = a.d(parcel, i1);
                    break;

                case 13: // '\r'
                    s1 = a.g(parcel, i1);
                    break;

                case 14: // '\016'
                    versioninfoparcel = (VersionInfoParcel)a.a(parcel, i1, VersionInfoParcel.CREATOR);
                    break;

                case 15: // '\017'
                    ibinder = a.h(parcel, i1);
                    break;

                case 17: // '\021'
                    interstitialadparameterparcel = (InterstitialAdParameterParcel)a.a(parcel, i1, InterstitialAdParameterParcel.CREATOR);
                    break;

                case 16: // '\020'
                    s = a.g(parcel, i1);
                    break;
                }
            } else
            if (parcel.dataPosition() != l)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(l).toString(), parcel);
            } else
            {
                return new AdOverlayInfoParcel(k, adlauncherintentinfoparcel, ibinder5, ibinder4, ibinder3, ibinder2, s3, flag, s2, ibinder1, j, i, s1, versioninfoparcel, ibinder, s, interstitialadparameterparcel);
            }
        } while (true);
    }

    public AdOverlayInfoParcel[] zzw(int i)
    {
        return new AdOverlayInfoParcel[i];
    }
}
