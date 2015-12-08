// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.request;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Messenger;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.ads.internal.request:
//            AdRequestInfoParcel, CapabilityParcel

public class zzf
    implements android.os.Parcelable.Creator
{

    public zzf()
    {
    }

    static void zza(AdRequestInfoParcel adrequestinfoparcel, Parcel parcel, int i)
    {
        int j = b.a(parcel);
        b.a(parcel, 1, adrequestinfoparcel.versionCode);
        b.a(parcel, 2, adrequestinfoparcel.zzDx, false);
        b.a(parcel, 3, adrequestinfoparcel.zzDy, i, false);
        b.a(parcel, 4, adrequestinfoparcel.zzqf, i, false);
        b.a(parcel, 5, adrequestinfoparcel.zzpZ, false);
        b.a(parcel, 6, adrequestinfoparcel.applicationInfo, i, false);
        b.a(parcel, 7, adrequestinfoparcel.zzDz, i, false);
        b.a(parcel, 8, adrequestinfoparcel.zzDA, false);
        b.a(parcel, 9, adrequestinfoparcel.zzDB, false);
        b.a(parcel, 10, adrequestinfoparcel.zzDC, false);
        b.a(parcel, 11, adrequestinfoparcel.zzqb, i, false);
        b.a(parcel, 12, adrequestinfoparcel.zzDD, false);
        b.a(parcel, 13, adrequestinfoparcel.zzDE);
        b.a(parcel, 14, adrequestinfoparcel.zzqv, false);
        b.a(parcel, 15, adrequestinfoparcel.zzDF, false);
        b.a(parcel, 17, adrequestinfoparcel.zzDH, i, false);
        b.a(parcel, 16, adrequestinfoparcel.zzDG);
        b.a(parcel, 19, adrequestinfoparcel.zzDJ);
        b.a(parcel, 18, adrequestinfoparcel.zzDI);
        b.a(parcel, 21, adrequestinfoparcel.zzDL, false);
        b.a(parcel, 20, adrequestinfoparcel.zzDK);
        b.a(parcel, 23, adrequestinfoparcel.zzDN);
        b.a(parcel, 22, adrequestinfoparcel.zzDM);
        b.a(parcel, 25, adrequestinfoparcel.zzDP);
        b.a(parcel, 24, adrequestinfoparcel.zzDO, false);
        b.a(parcel, 27, adrequestinfoparcel.zzDR, false);
        b.a(parcel, 26, adrequestinfoparcel.zzDQ, false);
        b.a(parcel, 29, adrequestinfoparcel.zzqt, i, false);
        b.a(parcel, 28, adrequestinfoparcel.zzpY, false);
        b.a(parcel, 31, adrequestinfoparcel.zzDT);
        b.a(parcel, 30, adrequestinfoparcel.zzDS, false);
        b.a(parcel, 32, adrequestinfoparcel.zzDU, i, false);
        b.a(parcel, j);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzj(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzC(i);
    }

    public AdRequestInfoParcel[] zzC(int i)
    {
        return new AdRequestInfoParcel[i];
    }

    public AdRequestInfoParcel zzj(Parcel parcel)
    {
        int j1 = a.b(parcel);
        int i1 = 0;
        android.os.Bundle bundle2 = null;
        AdRequestParcel adrequestparcel = null;
        AdSizeParcel adsizeparcel = null;
        String s7 = null;
        ApplicationInfo applicationinfo = null;
        PackageInfo packageinfo = null;
        String s6 = null;
        String s5 = null;
        String s4 = null;
        VersionInfoParcel versioninfoparcel = null;
        android.os.Bundle bundle1 = null;
        int l = 0;
        java.util.ArrayList arraylist2 = null;
        android.os.Bundle bundle = null;
        boolean flag1 = false;
        Messenger messenger = null;
        int k = 0;
        int j = 0;
        float f = 0.0F;
        String s3 = null;
        boolean flag = false;
        int i = 0;
        String s2 = null;
        long l2 = 0L;
        String s1 = null;
        java.util.ArrayList arraylist1 = null;
        String s = null;
        NativeAdOptionsParcel nativeadoptionsparcel = null;
        java.util.ArrayList arraylist = null;
        long l1 = 0L;
        CapabilityParcel capabilityparcel = null;
        do
        {
            if (parcel.dataPosition() < j1)
            {
                int k1 = a.a(parcel);
                switch (a.a(k1))
                {
                default:
                    a.b(parcel, k1);
                    break;

                case 1: // '\001'
                    i1 = a.d(parcel, k1);
                    break;

                case 2: // '\002'
                    bundle2 = a.i(parcel, k1);
                    break;

                case 3: // '\003'
                    adrequestparcel = (AdRequestParcel)a.a(parcel, k1, AdRequestParcel.CREATOR);
                    break;

                case 4: // '\004'
                    adsizeparcel = (AdSizeParcel)a.a(parcel, k1, AdSizeParcel.CREATOR);
                    break;

                case 5: // '\005'
                    s7 = a.g(parcel, k1);
                    break;

                case 6: // '\006'
                    applicationinfo = (ApplicationInfo)a.a(parcel, k1, ApplicationInfo.CREATOR);
                    break;

                case 7: // '\007'
                    packageinfo = (PackageInfo)a.a(parcel, k1, PackageInfo.CREATOR);
                    break;

                case 8: // '\b'
                    s6 = a.g(parcel, k1);
                    break;

                case 9: // '\t'
                    s5 = a.g(parcel, k1);
                    break;

                case 10: // '\n'
                    s4 = a.g(parcel, k1);
                    break;

                case 11: // '\013'
                    versioninfoparcel = (VersionInfoParcel)a.a(parcel, k1, VersionInfoParcel.CREATOR);
                    break;

                case 12: // '\f'
                    bundle1 = a.i(parcel, k1);
                    break;

                case 13: // '\r'
                    l = a.d(parcel, k1);
                    break;

                case 14: // '\016'
                    arraylist2 = a.m(parcel, k1);
                    break;

                case 15: // '\017'
                    bundle = a.i(parcel, k1);
                    break;

                case 17: // '\021'
                    messenger = (Messenger)a.a(parcel, k1, Messenger.CREATOR);
                    break;

                case 16: // '\020'
                    flag1 = a.c(parcel, k1);
                    break;

                case 19: // '\023'
                    j = a.d(parcel, k1);
                    break;

                case 18: // '\022'
                    k = a.d(parcel, k1);
                    break;

                case 21: // '\025'
                    s3 = a.g(parcel, k1);
                    break;

                case 20: // '\024'
                    f = a.f(parcel, k1);
                    break;

                case 23: // '\027'
                    i = a.d(parcel, k1);
                    break;

                case 22: // '\026'
                    flag = a.c(parcel, k1);
                    break;

                case 25: // '\031'
                    l2 = a.e(parcel, k1);
                    break;

                case 24: // '\030'
                    s2 = a.g(parcel, k1);
                    break;

                case 27: // '\033'
                    arraylist1 = a.m(parcel, k1);
                    break;

                case 26: // '\032'
                    s1 = a.g(parcel, k1);
                    break;

                case 29: // '\035'
                    nativeadoptionsparcel = (NativeAdOptionsParcel)a.a(parcel, k1, NativeAdOptionsParcel.CREATOR);
                    break;

                case 28: // '\034'
                    s = a.g(parcel, k1);
                    break;

                case 31: // '\037'
                    l1 = a.e(parcel, k1);
                    break;

                case 30: // '\036'
                    arraylist = a.m(parcel, k1);
                    break;

                case 32: // ' '
                    capabilityparcel = (CapabilityParcel)a.a(parcel, k1, CapabilityParcel.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j1)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(j1).toString(), parcel);
            } else
            {
                return new AdRequestInfoParcel(i1, bundle2, adrequestparcel, adsizeparcel, s7, applicationinfo, packageinfo, s6, s5, s4, versioninfoparcel, bundle1, l, arraylist2, bundle, flag1, messenger, k, j, f, s3, flag, i, s2, l2, s1, arraylist1, s, nativeadoptionsparcel, arraylist, l1, capabilityparcel);
            }
        } while (true);
    }
}
