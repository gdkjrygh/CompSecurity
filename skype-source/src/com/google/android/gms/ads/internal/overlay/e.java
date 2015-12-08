// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.overlay;

import android.os.Parcel;
import com.google.android.gms.ads.internal.InterstitialAdParameterParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.b.c;
import com.google.android.gms.b.d;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.ads.internal.overlay:
//            AdOverlayInfoParcel, AdLauncherIntentInfoParcel

public final class e
    implements android.os.Parcelable.Creator
{

    public e()
    {
    }

    static void a(AdOverlayInfoParcel adoverlayinfoparcel, Parcel parcel, int i)
    {
        int j = b.a(parcel);
        b.a(parcel, 1, adoverlayinfoparcel.a);
        b.a(parcel, 2, adoverlayinfoparcel.b, i);
        b.a(parcel, 3, d.a(adoverlayinfoparcel.c).asBinder());
        b.a(parcel, 4, d.a(adoverlayinfoparcel.d).asBinder());
        b.a(parcel, 5, d.a(adoverlayinfoparcel.e).asBinder());
        b.a(parcel, 6, d.a(adoverlayinfoparcel.f).asBinder());
        b.a(parcel, 7, adoverlayinfoparcel.g);
        b.a(parcel, 8, adoverlayinfoparcel.h);
        b.a(parcel, 9, adoverlayinfoparcel.i);
        b.a(parcel, 10, d.a(adoverlayinfoparcel.j).asBinder());
        b.a(parcel, 11, adoverlayinfoparcel.k);
        b.a(parcel, 12, adoverlayinfoparcel.l);
        b.a(parcel, 13, adoverlayinfoparcel.m);
        b.a(parcel, 14, adoverlayinfoparcel.n, i);
        b.a(parcel, 15, d.a(adoverlayinfoparcel.o).asBinder());
        b.a(parcel, 17, adoverlayinfoparcel.q, i);
        b.a(parcel, 16, adoverlayinfoparcel.p);
        b.a(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        int l = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
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
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, i1);
                    break;

                case 1: // '\001'
                    k = com.google.android.gms.common.internal.safeparcel.a.f(parcel, i1);
                    break;

                case 2: // '\002'
                    adlauncherintentinfoparcel = (AdLauncherIntentInfoParcel)com.google.android.gms.common.internal.safeparcel.a.a(parcel, i1, AdLauncherIntentInfoParcel.CREATOR);
                    break;

                case 3: // '\003'
                    ibinder5 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, i1);
                    break;

                case 4: // '\004'
                    ibinder4 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, i1);
                    break;

                case 5: // '\005'
                    ibinder3 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, i1);
                    break;

                case 6: // '\006'
                    ibinder2 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, i1);
                    break;

                case 7: // '\007'
                    s3 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, i1);
                    break;

                case 8: // '\b'
                    flag = com.google.android.gms.common.internal.safeparcel.a.c(parcel, i1);
                    break;

                case 9: // '\t'
                    s2 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, i1);
                    break;

                case 10: // '\n'
                    ibinder1 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, i1);
                    break;

                case 11: // '\013'
                    j = com.google.android.gms.common.internal.safeparcel.a.f(parcel, i1);
                    break;

                case 12: // '\f'
                    i = com.google.android.gms.common.internal.safeparcel.a.f(parcel, i1);
                    break;

                case 13: // '\r'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, i1);
                    break;

                case 14: // '\016'
                    versioninfoparcel = (VersionInfoParcel)com.google.android.gms.common.internal.safeparcel.a.a(parcel, i1, VersionInfoParcel.CREATOR);
                    break;

                case 15: // '\017'
                    ibinder = com.google.android.gms.common.internal.safeparcel.a.m(parcel, i1);
                    break;

                case 17: // '\021'
                    interstitialadparameterparcel = (InterstitialAdParameterParcel)com.google.android.gms.common.internal.safeparcel.a.a(parcel, i1, InterstitialAdParameterParcel.CREATOR);
                    break;

                case 16: // '\020'
                    s = com.google.android.gms.common.internal.safeparcel.a.l(parcel, i1);
                    break;
                }
            } else
            if (parcel.dataPosition() != l)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder("Overread allowed size end=")).append(l).toString(), parcel);
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
