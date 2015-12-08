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
//            CapabilityParcel, AdRequestInfoParcel

public final class f
    implements android.os.Parcelable.Creator
{

    public f()
    {
    }

    public static AdRequestInfoParcel a(Parcel parcel)
    {
        int j1 = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
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
        float f1 = 0.0F;
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
                int k1 = parcel.readInt();
                switch (0xffff & k1)
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, k1);
                    break;

                case 1: // '\001'
                    i1 = com.google.android.gms.common.internal.safeparcel.a.f(parcel, k1);
                    break;

                case 2: // '\002'
                    bundle2 = com.google.android.gms.common.internal.safeparcel.a.n(parcel, k1);
                    break;

                case 3: // '\003'
                    adrequestparcel = (AdRequestParcel)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k1, AdRequestParcel.CREATOR);
                    break;

                case 4: // '\004'
                    adsizeparcel = (AdSizeParcel)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k1, AdSizeParcel.CREATOR);
                    break;

                case 5: // '\005'
                    s7 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, k1);
                    break;

                case 6: // '\006'
                    applicationinfo = (ApplicationInfo)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k1, ApplicationInfo.CREATOR);
                    break;

                case 7: // '\007'
                    packageinfo = (PackageInfo)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k1, PackageInfo.CREATOR);
                    break;

                case 8: // '\b'
                    s6 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, k1);
                    break;

                case 9: // '\t'
                    s5 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, k1);
                    break;

                case 10: // '\n'
                    s4 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, k1);
                    break;

                case 11: // '\013'
                    versioninfoparcel = (VersionInfoParcel)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k1, VersionInfoParcel.CREATOR);
                    break;

                case 12: // '\f'
                    bundle1 = com.google.android.gms.common.internal.safeparcel.a.n(parcel, k1);
                    break;

                case 13: // '\r'
                    l = com.google.android.gms.common.internal.safeparcel.a.f(parcel, k1);
                    break;

                case 14: // '\016'
                    arraylist2 = com.google.android.gms.common.internal.safeparcel.a.t(parcel, k1);
                    break;

                case 15: // '\017'
                    bundle = com.google.android.gms.common.internal.safeparcel.a.n(parcel, k1);
                    break;

                case 17: // '\021'
                    messenger = (Messenger)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k1, Messenger.CREATOR);
                    break;

                case 16: // '\020'
                    flag1 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, k1);
                    break;

                case 19: // '\023'
                    j = com.google.android.gms.common.internal.safeparcel.a.f(parcel, k1);
                    break;

                case 18: // '\022'
                    k = com.google.android.gms.common.internal.safeparcel.a.f(parcel, k1);
                    break;

                case 21: // '\025'
                    s3 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, k1);
                    break;

                case 20: // '\024'
                    f1 = com.google.android.gms.common.internal.safeparcel.a.i(parcel, k1);
                    break;

                case 23: // '\027'
                    i = com.google.android.gms.common.internal.safeparcel.a.f(parcel, k1);
                    break;

                case 22: // '\026'
                    flag = com.google.android.gms.common.internal.safeparcel.a.c(parcel, k1);
                    break;

                case 25: // '\031'
                    l2 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, k1);
                    break;

                case 24: // '\030'
                    s2 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, k1);
                    break;

                case 27: // '\033'
                    arraylist1 = com.google.android.gms.common.internal.safeparcel.a.t(parcel, k1);
                    break;

                case 26: // '\032'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, k1);
                    break;

                case 29: // '\035'
                    nativeadoptionsparcel = (NativeAdOptionsParcel)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k1, NativeAdOptionsParcel.CREATOR);
                    break;

                case 28: // '\034'
                    s = com.google.android.gms.common.internal.safeparcel.a.l(parcel, k1);
                    break;

                case 31: // '\037'
                    l1 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, k1);
                    break;

                case 30: // '\036'
                    arraylist = com.google.android.gms.common.internal.safeparcel.a.t(parcel, k1);
                    break;

                case 32: // ' '
                    capabilityparcel = (CapabilityParcel)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k1, CapabilityParcel.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j1)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder("Overread allowed size end=")).append(j1).toString(), parcel);
            } else
            {
                return new AdRequestInfoParcel(i1, bundle2, adrequestparcel, adsizeparcel, s7, applicationinfo, packageinfo, s6, s5, s4, versioninfoparcel, bundle1, l, arraylist2, bundle, flag1, messenger, k, j, f1, s3, flag, i, s2, l2, s1, arraylist1, s, nativeadoptionsparcel, arraylist, l1, capabilityparcel);
            }
        } while (true);
    }

    static void a(AdRequestInfoParcel adrequestinfoparcel, Parcel parcel, int i)
    {
        int j = b.a(parcel);
        b.a(parcel, 1, adrequestinfoparcel.a);
        b.a(parcel, 2, adrequestinfoparcel.b);
        b.a(parcel, 3, adrequestinfoparcel.c, i);
        b.a(parcel, 4, adrequestinfoparcel.d, i);
        b.a(parcel, 5, adrequestinfoparcel.e);
        b.a(parcel, 6, adrequestinfoparcel.f, i);
        b.a(parcel, 7, adrequestinfoparcel.g, i);
        b.a(parcel, 8, adrequestinfoparcel.h);
        b.a(parcel, 9, adrequestinfoparcel.i);
        b.a(parcel, 10, adrequestinfoparcel.j);
        b.a(parcel, 11, adrequestinfoparcel.k, i);
        b.a(parcel, 12, adrequestinfoparcel.l);
        b.a(parcel, 13, adrequestinfoparcel.m);
        b.b(parcel, 14, adrequestinfoparcel.n);
        b.a(parcel, 15, adrequestinfoparcel.o);
        b.a(parcel, 17, adrequestinfoparcel.q, i);
        b.a(parcel, 16, adrequestinfoparcel.p);
        b.a(parcel, 19, adrequestinfoparcel.s);
        b.a(parcel, 18, adrequestinfoparcel.r);
        b.a(parcel, 21, adrequestinfoparcel.u);
        b.a(parcel, 20, adrequestinfoparcel.t);
        b.a(parcel, 23, adrequestinfoparcel.w);
        b.a(parcel, 22, adrequestinfoparcel.v);
        b.a(parcel, 25, adrequestinfoparcel.y);
        b.a(parcel, 24, adrequestinfoparcel.x);
        b.b(parcel, 27, adrequestinfoparcel.A);
        b.a(parcel, 26, adrequestinfoparcel.z);
        b.a(parcel, 29, adrequestinfoparcel.C, i);
        b.a(parcel, 28, adrequestinfoparcel.B);
        b.a(parcel, 31, adrequestinfoparcel.E);
        b.b(parcel, 30, adrequestinfoparcel.D);
        b.a(parcel, 32, adrequestinfoparcel.F, i);
        b.a(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public final Object[] newArray(int i)
    {
        return new AdRequestInfoParcel[i];
    }
}
