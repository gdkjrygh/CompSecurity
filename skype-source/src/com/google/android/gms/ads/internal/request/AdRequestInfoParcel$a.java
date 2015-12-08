// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.request;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Messenger;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.List;

// Referenced classes of package com.google.android.gms.ads.internal.request:
//            AdRequestInfoParcel, CapabilityParcel

public static final class B
{

    public final NativeAdOptionsParcel A;
    public final CapabilityParcel B;
    public final Bundle a;
    public final AdRequestParcel b;
    public final AdSizeParcel c;
    public final String d;
    public final ApplicationInfo e;
    public final PackageInfo f;
    public final String g;
    public final String h;
    public final Bundle i;
    public final VersionInfoParcel j;
    public final int k;
    public final List l;
    public final List m;
    public final Bundle n;
    public final boolean o;
    public final Messenger p;
    public final int q;
    public final int r;
    public final float s;
    public final String t;
    public final boolean u;
    public final int v;
    public final long w;
    public final String x;
    public final List y;
    public final String z;

    public (Bundle bundle, AdRequestParcel adrequestparcel, AdSizeParcel adsizeparcel, String s1, ApplicationInfo applicationinfo, PackageInfo packageinfo, String s2, 
            String s3, VersionInfoParcel versioninfoparcel, Bundle bundle1, List list, List list1, Bundle bundle2, boolean flag, 
            Messenger messenger, int i1, int j1, float f1, String s4, boolean flag1, int k1, 
            long l1, String s5, List list2, String s6, NativeAdOptionsParcel nativeadoptionsparcel, CapabilityParcel capabilityparcel)
    {
        a = bundle;
        b = adrequestparcel;
        c = adsizeparcel;
        d = s1;
        e = applicationinfo;
        f = packageinfo;
        g = s2;
        h = s3;
        j = versioninfoparcel;
        i = bundle1;
        o = flag;
        p = messenger;
        q = i1;
        r = j1;
        s = f1;
        if (list != null && list.size() > 0)
        {
            k = 3;
            l = list;
            m = list1;
        } else
        {
            k = 0;
            l = null;
            m = null;
        }
        n = bundle2;
        t = s4;
        u = flag1;
        v = k1;
        w = l1;
        x = s5;
        y = list2;
        z = s6;
        A = nativeadoptionsparcel;
        B = capabilityparcel;
    }
}
