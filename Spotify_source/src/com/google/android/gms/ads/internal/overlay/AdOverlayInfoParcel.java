// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.overlay;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import bfe;
import bhr;
import bhs;
import bhz;
import byc;
import bye;
import cde;
import cdo;
import ckw;
import com.google.android.gms.ads.internal.InterstitialAdParameterParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.ads.internal.overlay:
//            AdLauncherIntentInfoParcel

public final class AdOverlayInfoParcel
    implements SafeParcelable
{

    public static final bhr CREATOR = new bhr();
    public final int a;
    public final AdLauncherIntentInfoParcel b;
    public final bfe c;
    public final bhs d;
    public final ckw e;
    public final cde f;
    public final String g;
    public final boolean h;
    public final String i;
    public final bhz j;
    public final int k;
    public final int l;
    public final String m;
    public final VersionInfoParcel n;
    public final cdo o;
    public final String p;
    public final InterstitialAdParameterParcel q;

    public AdOverlayInfoParcel(int i1, AdLauncherIntentInfoParcel adlauncherintentinfoparcel, IBinder ibinder, IBinder ibinder1, IBinder ibinder2, IBinder ibinder3, String s, 
            boolean flag, String s1, IBinder ibinder4, int j1, int k1, String s2, VersionInfoParcel versioninfoparcel, 
            IBinder ibinder5, String s3, InterstitialAdParameterParcel interstitialadparameterparcel)
    {
        a = i1;
        b = adlauncherintentinfoparcel;
        c = (bfe)bye.a(byc.a(ibinder));
        d = (bhs)bye.a(byc.a(ibinder1));
        e = (ckw)bye.a(byc.a(ibinder2));
        f = (cde)bye.a(byc.a(ibinder3));
        g = s;
        h = flag;
        i = s1;
        j = (bhz)bye.a(byc.a(ibinder4));
        k = j1;
        l = k1;
        m = s2;
        n = versioninfoparcel;
        o = (cdo)bye.a(byc.a(ibinder5));
        p = s3;
        q = interstitialadparameterparcel;
    }

    public AdOverlayInfoParcel(bfe bfe1, bhs bhs1, bhz bhz1, ckw ckw1, int i1, VersionInfoParcel versioninfoparcel, String s, 
            InterstitialAdParameterParcel interstitialadparameterparcel)
    {
        a = 4;
        b = null;
        c = bfe1;
        d = bhs1;
        e = ckw1;
        f = null;
        g = null;
        h = false;
        i = null;
        j = bhz1;
        k = i1;
        l = 1;
        m = null;
        n = versioninfoparcel;
        o = null;
        p = s;
        q = interstitialadparameterparcel;
    }

    public AdOverlayInfoParcel(bfe bfe1, bhs bhs1, bhz bhz1, ckw ckw1, boolean flag, int i1, VersionInfoParcel versioninfoparcel)
    {
        a = 4;
        b = null;
        c = bfe1;
        d = bhs1;
        e = ckw1;
        f = null;
        g = null;
        h = flag;
        i = null;
        j = bhz1;
        k = i1;
        l = 2;
        m = null;
        n = versioninfoparcel;
        o = null;
        p = null;
        q = null;
    }

    public AdOverlayInfoParcel(bfe bfe1, bhs bhs1, cde cde1, bhz bhz1, ckw ckw1, boolean flag, int i1, 
            String s, VersionInfoParcel versioninfoparcel, cdo cdo1)
    {
        a = 4;
        b = null;
        c = bfe1;
        d = bhs1;
        e = ckw1;
        f = cde1;
        g = null;
        h = flag;
        i = null;
        j = bhz1;
        k = i1;
        l = 3;
        m = s;
        n = versioninfoparcel;
        o = cdo1;
        p = null;
        q = null;
    }

    public AdOverlayInfoParcel(bfe bfe1, bhs bhs1, cde cde1, bhz bhz1, ckw ckw1, boolean flag, int i1, 
            String s, String s1, VersionInfoParcel versioninfoparcel, cdo cdo1)
    {
        a = 4;
        b = null;
        c = bfe1;
        d = bhs1;
        e = ckw1;
        f = cde1;
        g = s1;
        h = flag;
        i = s;
        j = bhz1;
        k = i1;
        l = 3;
        m = null;
        n = versioninfoparcel;
        o = cdo1;
        p = null;
        q = null;
    }

    public AdOverlayInfoParcel(AdLauncherIntentInfoParcel adlauncherintentinfoparcel, bfe bfe1, bhs bhs1, bhz bhz1, VersionInfoParcel versioninfoparcel)
    {
        a = 4;
        b = adlauncherintentinfoparcel;
        c = bfe1;
        d = bhs1;
        e = null;
        f = null;
        g = null;
        h = false;
        i = null;
        j = bhz1;
        k = -1;
        l = 4;
        m = null;
        n = versioninfoparcel;
        o = null;
        p = null;
        q = null;
    }

    public static AdOverlayInfoParcel a(Intent intent)
    {
        try
        {
            intent = intent.getBundleExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
            intent.setClassLoader(com/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel.getClassLoader());
            intent = (AdOverlayInfoParcel)intent.getParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            return null;
        }
        return intent;
    }

    public static void a(Intent intent, AdOverlayInfoParcel adoverlayinfoparcel)
    {
        Bundle bundle = new Bundle(1);
        bundle.putParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", adoverlayinfoparcel);
        intent.putExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", bundle);
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i1)
    {
        bhr.a(this, parcel, i1);
    }

}
