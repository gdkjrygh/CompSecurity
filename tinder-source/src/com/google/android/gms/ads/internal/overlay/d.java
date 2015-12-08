// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.overlay;

import android.os.Parcel;
import com.google.android.gms.ads.internal.InterstitialAdParameterParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.dynamic.b;

// Referenced classes of package com.google.android.gms.ads.internal.overlay:
//            AdOverlayInfoParcel, AdLauncherIntentInfoParcel

public final class d
    implements android.os.Parcelable.Creator
{

    public d()
    {
    }

    static void a(AdOverlayInfoParcel adoverlayinfoparcel, Parcel parcel, int i)
    {
        int j = com.google.android.gms.common.internal.safeparcel.a.a(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1, adoverlayinfoparcel.a);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 2, adoverlayinfoparcel.b, i);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 3, b.a(adoverlayinfoparcel.c).asBinder());
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 4, b.a(adoverlayinfoparcel.d).asBinder());
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 5, b.a(adoverlayinfoparcel.e).asBinder());
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 6, b.a(adoverlayinfoparcel.f).asBinder());
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 7, adoverlayinfoparcel.g);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 8, adoverlayinfoparcel.h);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 9, adoverlayinfoparcel.i);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 10, b.a(adoverlayinfoparcel.j).asBinder());
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 11, adoverlayinfoparcel.k);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 12, adoverlayinfoparcel.l);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 13, adoverlayinfoparcel.m);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 14, adoverlayinfoparcel.n, i);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 15, b.a(adoverlayinfoparcel.o).asBinder());
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 17, adoverlayinfoparcel.q, i);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 16, adoverlayinfoparcel.p);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        int l = zza.a(parcel);
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
                int i1 = parcel.readInt();
                switch (0xffff & i1)
                {
                default:
                    zza.b(parcel, i1);
                    break;

                case 1: // '\001'
                    k = zza.e(parcel, i1);
                    break;

                case 2: // '\002'
                    adlauncherintentinfoparcel = (AdLauncherIntentInfoParcel)zza.a(parcel, i1, AdLauncherIntentInfoParcel.CREATOR);
                    break;

                case 3: // '\003'
                    ibinder5 = zza.m(parcel, i1);
                    break;

                case 4: // '\004'
                    ibinder4 = zza.m(parcel, i1);
                    break;

                case 5: // '\005'
                    ibinder3 = zza.m(parcel, i1);
                    break;

                case 6: // '\006'
                    ibinder2 = zza.m(parcel, i1);
                    break;

                case 7: // '\007'
                    s3 = zza.l(parcel, i1);
                    break;

                case 8: // '\b'
                    flag = zza.c(parcel, i1);
                    break;

                case 9: // '\t'
                    s2 = zza.l(parcel, i1);
                    break;

                case 10: // '\n'
                    ibinder1 = zza.m(parcel, i1);
                    break;

                case 11: // '\013'
                    j = zza.e(parcel, i1);
                    break;

                case 12: // '\f'
                    i = zza.e(parcel, i1);
                    break;

                case 13: // '\r'
                    s1 = zza.l(parcel, i1);
                    break;

                case 14: // '\016'
                    versioninfoparcel = (VersionInfoParcel)zza.a(parcel, i1, VersionInfoParcel.CREATOR);
                    break;

                case 15: // '\017'
                    ibinder = zza.m(parcel, i1);
                    break;

                case 17: // '\021'
                    interstitialadparameterparcel = (InterstitialAdParameterParcel)zza.a(parcel, i1, InterstitialAdParameterParcel.CREATOR);
                    break;

                case 16: // '\020'
                    s = zza.l(parcel, i1);
                    break;
                }
            } else
            if (parcel.dataPosition() != l)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder("Overread allowed size end=")).append(l).toString(), parcel);
            } else
            {
                return new AdOverlayInfoParcel(k, adlauncherintentinfoparcel, ibinder5, ibinder4, ibinder3, ibinder2, s3, flag, s2, ibinder1, j, i, s1, versioninfoparcel, ibinder, s, interstitialadparameterparcel);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new AdOverlayInfoParcel[i];
    }
}
