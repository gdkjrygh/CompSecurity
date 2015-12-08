// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.request;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Messenger;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.google.android.gms.ads.internal.request:
//            f, CapabilityParcel

public final class AdRequestInfoParcel
    implements SafeParcelable
{
    public static final class a
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

        public a(Bundle bundle, AdRequestParcel adrequestparcel, AdSizeParcel adsizeparcel, String s1, ApplicationInfo applicationinfo, PackageInfo packageinfo, String s2, 
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


    public static final f CREATOR = new f();
    public final List A;
    public final String B;
    public final NativeAdOptionsParcel C;
    public final List D;
    public final long E;
    public final CapabilityParcel F;
    public final int a;
    public final Bundle b;
    public final AdRequestParcel c;
    public final AdSizeParcel d;
    public final String e;
    public final ApplicationInfo f;
    public final PackageInfo g;
    public final String h;
    public final String i;
    public final String j;
    public final VersionInfoParcel k;
    public final Bundle l;
    public final int m;
    public final List n;
    public final Bundle o;
    public final boolean p;
    public final Messenger q;
    public final int r;
    public final int s;
    public final float t;
    public final String u;
    public final boolean v;
    public final int w;
    public final String x;
    public final long y;
    public final String z;

    AdRequestInfoParcel(int i1, Bundle bundle, AdRequestParcel adrequestparcel, AdSizeParcel adsizeparcel, String s1, ApplicationInfo applicationinfo, PackageInfo packageinfo, 
            String s2, String s3, String s4, VersionInfoParcel versioninfoparcel, Bundle bundle1, int j1, List list, 
            Bundle bundle2, boolean flag, Messenger messenger, int k1, int l1, float f1, String s5, 
            boolean flag1, int i2, String s6, long l2, String s7, List list1, 
            String s8, NativeAdOptionsParcel nativeadoptionsparcel, List list2, long l3, CapabilityParcel capabilityparcel)
    {
        a = i1;
        b = bundle;
        c = adrequestparcel;
        d = adsizeparcel;
        e = s1;
        f = applicationinfo;
        g = packageinfo;
        h = s2;
        i = s3;
        j = s4;
        k = versioninfoparcel;
        l = bundle1;
        m = j1;
        n = list;
        if (list2 == null)
        {
            bundle = Collections.emptyList();
        } else
        {
            bundle = Collections.unmodifiableList(list2);
        }
        D = bundle;
        o = bundle2;
        p = flag;
        q = messenger;
        r = k1;
        s = l1;
        t = f1;
        u = s5;
        v = flag1;
        w = i2;
        x = s6;
        y = l2;
        z = s7;
        if (list1 == null)
        {
            bundle = Collections.emptyList();
        } else
        {
            bundle = Collections.unmodifiableList(list1);
        }
        A = bundle;
        B = s8;
        C = nativeadoptionsparcel;
        E = l3;
        F = capabilityparcel;
    }

    private AdRequestInfoParcel(Bundle bundle, AdRequestParcel adrequestparcel, AdSizeParcel adsizeparcel, String s1, ApplicationInfo applicationinfo, PackageInfo packageinfo, String s2, 
            String s3, String s4, VersionInfoParcel versioninfoparcel, Bundle bundle1, int i1, List list, List list1, 
            Bundle bundle2, boolean flag, Messenger messenger, int j1, int k1, float f1, String s5, 
            boolean flag1, int l1, String s6, long l2, String s7, List list2, 
            String s8, NativeAdOptionsParcel nativeadoptionsparcel, long l3, CapabilityParcel capabilityparcel)
    {
        this(11, bundle, adrequestparcel, adsizeparcel, s1, applicationinfo, packageinfo, s2, s3, s4, versioninfoparcel, bundle1, i1, list, bundle2, flag, messenger, j1, k1, f1, s5, flag1, l1, s6, l2, s7, list2, s8, nativeadoptionsparcel, list1, l3, capabilityparcel);
    }

    public AdRequestInfoParcel(a a1, String s1, String s2, long l1)
    {
        this(a1.a, a1.b, a1.c, a1.d, a1.e, a1.f, s1, a1.g, a1.h, a1.j, a1.i, a1.k, a1.l, a1.m, a1.n, a1.o, a1.p, a1.q, a1.r, a1.s, a1.t, a1.u, a1.v, s2, a1.w, a1.x, a1.y, a1.z, a1.A, l1, a1.B);
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i1)
    {
        com.google.android.gms.ads.internal.request.f.a(this, parcel, i1);
    }

}
