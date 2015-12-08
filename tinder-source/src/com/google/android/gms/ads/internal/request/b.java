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
import com.google.android.gms.common.internal.safeparcel.zza;

// Referenced classes of package com.google.android.gms.ads.internal.request:
//            AdRequestInfoParcel, CapabilityParcel

public final class b
    implements android.os.Parcelable.Creator
{

    public b()
    {
    }

    static void a(AdRequestInfoParcel adrequestinfoparcel, Parcel parcel, int i)
    {
        int j = com.google.android.gms.common.internal.safeparcel.a.a(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1, adrequestinfoparcel.a);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 2, adrequestinfoparcel.b);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 3, adrequestinfoparcel.c, i);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 4, adrequestinfoparcel.d, i);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 5, adrequestinfoparcel.e);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 6, adrequestinfoparcel.f, i);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 7, adrequestinfoparcel.g, i);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 8, adrequestinfoparcel.h);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 9, adrequestinfoparcel.i);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 10, adrequestinfoparcel.j);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 11, adrequestinfoparcel.k, i);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 12, adrequestinfoparcel.l);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 13, adrequestinfoparcel.m);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 14, adrequestinfoparcel.n);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 15, adrequestinfoparcel.o);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 17, adrequestinfoparcel.q, i);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 16, adrequestinfoparcel.p);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 19, adrequestinfoparcel.s);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 18, adrequestinfoparcel.r);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 21, adrequestinfoparcel.u);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 20, adrequestinfoparcel.t);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 25, adrequestinfoparcel.v);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 27, adrequestinfoparcel.x);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 26, adrequestinfoparcel.w);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 29, adrequestinfoparcel.z, i);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 28, adrequestinfoparcel.y);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 31, adrequestinfoparcel.B);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 30, adrequestinfoparcel.A);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 32, adrequestinfoparcel.C, i);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 33, adrequestinfoparcel.D);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        int i1 = zza.a(parcel);
        int l = 0;
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
        int k = 0;
        java.util.ArrayList arraylist2 = null;
        android.os.Bundle bundle = null;
        boolean flag = false;
        Messenger messenger = null;
        int j = 0;
        int i = 0;
        float f = 0.0F;
        String s3 = null;
        long l2 = 0L;
        String s2 = null;
        java.util.ArrayList arraylist1 = null;
        String s1 = null;
        NativeAdOptionsParcel nativeadoptionsparcel = null;
        java.util.ArrayList arraylist = null;
        long l1 = 0L;
        CapabilityParcel capabilityparcel = null;
        String s = null;
        do
        {
            if (parcel.dataPosition() < i1)
            {
                int j1 = parcel.readInt();
                switch (0xffff & j1)
                {
                case 22: // '\026'
                case 23: // '\027'
                case 24: // '\030'
                default:
                    zza.b(parcel, j1);
                    break;

                case 1: // '\001'
                    l = zza.e(parcel, j1);
                    break;

                case 2: // '\002'
                    bundle2 = zza.n(parcel, j1);
                    break;

                case 3: // '\003'
                    adrequestparcel = (AdRequestParcel)zza.a(parcel, j1, AdRequestParcel.CREATOR);
                    break;

                case 4: // '\004'
                    adsizeparcel = (AdSizeParcel)zza.a(parcel, j1, AdSizeParcel.CREATOR);
                    break;

                case 5: // '\005'
                    s7 = zza.l(parcel, j1);
                    break;

                case 6: // '\006'
                    applicationinfo = (ApplicationInfo)zza.a(parcel, j1, ApplicationInfo.CREATOR);
                    break;

                case 7: // '\007'
                    packageinfo = (PackageInfo)zza.a(parcel, j1, PackageInfo.CREATOR);
                    break;

                case 8: // '\b'
                    s6 = zza.l(parcel, j1);
                    break;

                case 9: // '\t'
                    s5 = zza.l(parcel, j1);
                    break;

                case 10: // '\n'
                    s4 = zza.l(parcel, j1);
                    break;

                case 11: // '\013'
                    versioninfoparcel = (VersionInfoParcel)zza.a(parcel, j1, VersionInfoParcel.CREATOR);
                    break;

                case 12: // '\f'
                    bundle1 = zza.n(parcel, j1);
                    break;

                case 13: // '\r'
                    k = zza.e(parcel, j1);
                    break;

                case 14: // '\016'
                    arraylist2 = zza.t(parcel, j1);
                    break;

                case 15: // '\017'
                    bundle = zza.n(parcel, j1);
                    break;

                case 17: // '\021'
                    messenger = (Messenger)zza.a(parcel, j1, Messenger.CREATOR);
                    break;

                case 16: // '\020'
                    flag = zza.c(parcel, j1);
                    break;

                case 19: // '\023'
                    i = zza.e(parcel, j1);
                    break;

                case 18: // '\022'
                    j = zza.e(parcel, j1);
                    break;

                case 21: // '\025'
                    s3 = zza.l(parcel, j1);
                    break;

                case 20: // '\024'
                    f = zza.i(parcel, j1);
                    break;

                case 25: // '\031'
                    l2 = zza.f(parcel, j1);
                    break;

                case 27: // '\033'
                    arraylist1 = zza.t(parcel, j1);
                    break;

                case 26: // '\032'
                    s2 = zza.l(parcel, j1);
                    break;

                case 29: // '\035'
                    nativeadoptionsparcel = (NativeAdOptionsParcel)zza.a(parcel, j1, NativeAdOptionsParcel.CREATOR);
                    break;

                case 28: // '\034'
                    s1 = zza.l(parcel, j1);
                    break;

                case 31: // '\037'
                    l1 = zza.f(parcel, j1);
                    break;

                case 30: // '\036'
                    arraylist = zza.t(parcel, j1);
                    break;

                case 32: // ' '
                    capabilityparcel = (CapabilityParcel)zza.a(parcel, j1, CapabilityParcel.CREATOR);
                    break;

                case 33: // '!'
                    s = zza.l(parcel, j1);
                    break;
                }
            } else
            if (parcel.dataPosition() != i1)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder("Overread allowed size end=")).append(i1).toString(), parcel);
            } else
            {
                return new AdRequestInfoParcel(l, bundle2, adrequestparcel, adsizeparcel, s7, applicationinfo, packageinfo, s6, s5, s4, versioninfoparcel, bundle1, k, arraylist2, bundle, flag, messenger, j, i, f, s3, l2, s2, arraylist1, s1, nativeadoptionsparcel, arraylist, l1, capabilityparcel, s);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new AdRequestInfoParcel[i];
    }
}
