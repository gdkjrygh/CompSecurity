// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import com.google.android.gms.ads.internal.InterstitialAdParameterParcel;
import com.google.android.gms.ads.internal.overlay.AdLauncherIntentInfoParcel;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

public final class jpb
    implements android.os.Parcelable.Creator
{

    public jpb()
    {
    }

    public static void a(AdOverlayInfoParcel adoverlayinfoparcel, Parcel parcel, int i)
    {
        int j = b.q(parcel, 20293);
        b.c(parcel, 1, adoverlayinfoparcel.a);
        b.a(parcel, 2, adoverlayinfoparcel.b, i, false);
        b.a(parcel, 3, kon.a(adoverlayinfoparcel.c).asBinder(), false);
        b.a(parcel, 4, kon.a(adoverlayinfoparcel.d).asBinder(), false);
        b.a(parcel, 5, kon.a(adoverlayinfoparcel.e).asBinder(), false);
        b.a(parcel, 6, kon.a(adoverlayinfoparcel.f).asBinder(), false);
        b.a(parcel, 7, adoverlayinfoparcel.g, false);
        b.a(parcel, 8, adoverlayinfoparcel.h);
        b.a(parcel, 9, adoverlayinfoparcel.i, false);
        b.a(parcel, 10, kon.a(adoverlayinfoparcel.j).asBinder(), false);
        b.c(parcel, 11, adoverlayinfoparcel.k);
        b.c(parcel, 12, adoverlayinfoparcel.l);
        b.a(parcel, 13, adoverlayinfoparcel.m, false);
        b.a(parcel, 14, adoverlayinfoparcel.n, i, false);
        b.a(parcel, 15, kon.a(adoverlayinfoparcel.o).asBinder(), false);
        b.a(parcel, 17, adoverlayinfoparcel.q, i, false);
        b.a(parcel, 16, adoverlayinfoparcel.p, false);
        b.r(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        int l = b.b(parcel);
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
                    b.b(parcel, i1);
                    break;

                case 1: // '\001'
                    k = b.e(parcel, i1);
                    break;

                case 2: // '\002'
                    adlauncherintentinfoparcel = (AdLauncherIntentInfoParcel)b.a(parcel, i1, AdLauncherIntentInfoParcel.CREATOR);
                    break;

                case 3: // '\003'
                    ibinder5 = b.j(parcel, i1);
                    break;

                case 4: // '\004'
                    ibinder4 = b.j(parcel, i1);
                    break;

                case 5: // '\005'
                    ibinder3 = b.j(parcel, i1);
                    break;

                case 6: // '\006'
                    ibinder2 = b.j(parcel, i1);
                    break;

                case 7: // '\007'
                    s3 = b.i(parcel, i1);
                    break;

                case 8: // '\b'
                    flag = b.c(parcel, i1);
                    break;

                case 9: // '\t'
                    s2 = b.i(parcel, i1);
                    break;

                case 10: // '\n'
                    ibinder1 = b.j(parcel, i1);
                    break;

                case 11: // '\013'
                    j = b.e(parcel, i1);
                    break;

                case 12: // '\f'
                    i = b.e(parcel, i1);
                    break;

                case 13: // '\r'
                    s1 = b.i(parcel, i1);
                    break;

                case 14: // '\016'
                    versioninfoparcel = (VersionInfoParcel)b.a(parcel, i1, VersionInfoParcel.CREATOR);
                    break;

                case 15: // '\017'
                    ibinder = b.j(parcel, i1);
                    break;

                case 17: // '\021'
                    interstitialadparameterparcel = (InterstitialAdParameterParcel)b.a(parcel, i1, InterstitialAdParameterParcel.CREATOR);
                    break;

                case 16: // '\020'
                    s = b.i(parcel, i1);
                    break;
                }
            } else
            if (parcel.dataPosition() != l)
            {
                throw new ao((new StringBuilder("Overread allowed size end=")).append(l).toString(), parcel);
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
