// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.overlay;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.ads.internal.InterstitialAdParameterParcel;
import com.google.android.gms.ads.internal.client.a;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.b.d;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.cc;
import com.google.android.gms.internal.ch;
import com.google.android.gms.internal.hi;

// Referenced classes of package com.google.android.gms.ads.internal.overlay:
//            e, f, j, AdLauncherIntentInfoParcel

public final class AdOverlayInfoParcel
    implements SafeParcelable
{

    public static final e CREATOR = new e();
    public final int a;
    public final AdLauncherIntentInfoParcel b;
    public final a c;
    public final f d;
    public final hi e;
    public final cc f;
    public final String g;
    public final boolean h;
    public final String i;
    public final j j;
    public final int k;
    public final int l;
    public final String m;
    public final VersionInfoParcel n;
    public final ch o;
    public final String p;
    public final InterstitialAdParameterParcel q;

    AdOverlayInfoParcel(int i1, AdLauncherIntentInfoParcel adlauncherintentinfoparcel, IBinder ibinder, IBinder ibinder1, IBinder ibinder2, IBinder ibinder3, String s, 
            boolean flag, String s1, IBinder ibinder4, int j1, int k1, String s2, VersionInfoParcel versioninfoparcel, 
            IBinder ibinder5, String s3, InterstitialAdParameterParcel interstitialadparameterparcel)
    {
        a = i1;
        b = adlauncherintentinfoparcel;
        c = (a)com.google.android.gms.b.d.a(com.google.android.gms.b.c.a.a(ibinder));
        d = (f)com.google.android.gms.b.d.a(com.google.android.gms.b.c.a.a(ibinder1));
        e = (hi)com.google.android.gms.b.d.a(com.google.android.gms.b.c.a.a(ibinder2));
        f = (cc)com.google.android.gms.b.d.a(com.google.android.gms.b.c.a.a(ibinder3));
        g = s;
        h = flag;
        i = s1;
        j = (j)com.google.android.gms.b.d.a(com.google.android.gms.b.c.a.a(ibinder4));
        k = j1;
        l = k1;
        m = s2;
        n = versioninfoparcel;
        o = (ch)com.google.android.gms.b.d.a(com.google.android.gms.b.c.a.a(ibinder5));
        p = s3;
        q = interstitialadparameterparcel;
    }

    public AdOverlayInfoParcel(a a1, f f1, j j1, hi hi1, int i1, VersionInfoParcel versioninfoparcel, String s, 
            InterstitialAdParameterParcel interstitialadparameterparcel)
    {
        a = 4;
        b = null;
        c = a1;
        d = f1;
        e = hi1;
        f = null;
        g = null;
        h = false;
        i = null;
        j = j1;
        k = i1;
        l = 1;
        m = null;
        n = versioninfoparcel;
        o = null;
        p = s;
        q = interstitialadparameterparcel;
    }

    public AdOverlayInfoParcel(a a1, f f1, j j1, hi hi1, boolean flag, int i1, VersionInfoParcel versioninfoparcel)
    {
        a = 4;
        b = null;
        c = a1;
        d = f1;
        e = hi1;
        f = null;
        g = null;
        h = flag;
        i = null;
        j = j1;
        k = i1;
        l = 2;
        m = null;
        n = versioninfoparcel;
        o = null;
        p = null;
        q = null;
    }

    public AdOverlayInfoParcel(a a1, f f1, cc cc1, j j1, hi hi1, boolean flag, int i1, 
            String s, VersionInfoParcel versioninfoparcel, ch ch1)
    {
        a = 4;
        b = null;
        c = a1;
        d = f1;
        e = hi1;
        f = cc1;
        g = null;
        h = flag;
        i = null;
        j = j1;
        k = i1;
        l = 3;
        m = s;
        n = versioninfoparcel;
        o = ch1;
        p = null;
        q = null;
    }

    public AdOverlayInfoParcel(a a1, f f1, cc cc1, j j1, hi hi1, boolean flag, int i1, 
            String s, String s1, VersionInfoParcel versioninfoparcel, ch ch1)
    {
        a = 4;
        b = null;
        c = a1;
        d = f1;
        e = hi1;
        f = cc1;
        g = s1;
        h = flag;
        i = s;
        j = j1;
        k = i1;
        l = 3;
        m = null;
        n = versioninfoparcel;
        o = ch1;
        p = null;
        q = null;
    }

    public AdOverlayInfoParcel(AdLauncherIntentInfoParcel adlauncherintentinfoparcel, a a1, f f1, j j1, VersionInfoParcel versioninfoparcel)
    {
        a = 4;
        b = adlauncherintentinfoparcel;
        c = a1;
        d = f1;
        e = null;
        f = null;
        g = null;
        h = false;
        i = null;
        j = j1;
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
        com.google.android.gms.ads.internal.overlay.e.a(this, parcel, i1);
    }

}
