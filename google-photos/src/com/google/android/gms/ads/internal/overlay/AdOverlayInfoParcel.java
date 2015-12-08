// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.overlay;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.ads.internal.InterstitialAdParameterParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import jpb;
import jpc;
import k;
import kol;
import kon;
import kxu;

// Referenced classes of package com.google.android.gms.ads.internal.overlay:
//            AdLauncherIntentInfoParcel

public final class AdOverlayInfoParcel
    implements SafeParcelable
{

    public static final jpb CREATOR = new jpb();
    public final int a;
    public final AdLauncherIntentInfoParcel b;
    public final k c;
    public final jpc d;
    public final kxu e;
    public final k f;
    public final String g;
    public final boolean h;
    public final String i;
    public final k j;
    public final int k;
    public final int l;
    public final String m;
    public final VersionInfoParcel n;
    public final k o;
    public final String p;
    public final InterstitialAdParameterParcel q;

    public AdOverlayInfoParcel(int i1, AdLauncherIntentInfoParcel adlauncherintentinfoparcel, IBinder ibinder, IBinder ibinder1, IBinder ibinder2, IBinder ibinder3, String s, 
            boolean flag, String s1, IBinder ibinder4, int j1, int k1, String s2, VersionInfoParcel versioninfoparcel, 
            IBinder ibinder5, String s3, InterstitialAdParameterParcel interstitialadparameterparcel)
    {
        a = i1;
        b = adlauncherintentinfoparcel;
        c = (k)kon.a(kol.a(ibinder));
        d = (jpc)kon.a(kol.a(ibinder1));
        e = (kxu)kon.a(kol.a(ibinder2));
        f = (k)kon.a(kol.a(ibinder3));
        g = s;
        h = flag;
        i = s1;
        j = (k)kon.a(kol.a(ibinder4));
        k = j1;
        l = k1;
        m = s2;
        n = versioninfoparcel;
        o = (k)kon.a(kol.a(ibinder5));
        p = s3;
        q = interstitialadparameterparcel;
    }

    public AdOverlayInfoParcel(AdLauncherIntentInfoParcel adlauncherintentinfoparcel, k k1, jpc jpc1, k k2, VersionInfoParcel versioninfoparcel)
    {
        a = 4;
        b = adlauncherintentinfoparcel;
        c = k1;
        d = jpc1;
        e = null;
        f = null;
        g = null;
        h = false;
        i = null;
        j = k2;
        k = -1;
        l = 4;
        m = null;
        n = versioninfoparcel;
        o = null;
        p = null;
        q = null;
    }

    public AdOverlayInfoParcel(k k1, jpc jpc1, k k2, k k3, kxu kxu1, boolean flag, int i1, 
            String s, VersionInfoParcel versioninfoparcel, k k4)
    {
        a = 4;
        b = null;
        c = k1;
        d = jpc1;
        e = kxu1;
        f = k2;
        g = null;
        h = flag;
        i = null;
        j = k3;
        k = i1;
        l = 3;
        m = s;
        n = versioninfoparcel;
        o = k4;
        p = null;
        q = null;
    }

    public AdOverlayInfoParcel(k k1, jpc jpc1, k k2, k k3, kxu kxu1, boolean flag, int i1, 
            String s, String s1, VersionInfoParcel versioninfoparcel, k k4)
    {
        a = 4;
        b = null;
        c = k1;
        d = jpc1;
        e = kxu1;
        f = k2;
        g = s1;
        h = flag;
        i = s;
        j = k3;
        k = i1;
        l = 3;
        m = null;
        n = versioninfoparcel;
        o = k4;
        p = null;
        q = null;
    }

    public AdOverlayInfoParcel(k k1, jpc jpc1, k k2, kxu kxu1, boolean flag, int i1, VersionInfoParcel versioninfoparcel)
    {
        a = 4;
        b = null;
        c = k1;
        d = jpc1;
        e = kxu1;
        f = null;
        g = null;
        h = flag;
        i = null;
        j = k2;
        k = i1;
        l = 2;
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
        jpb.a(this, parcel, i1);
    }

}
