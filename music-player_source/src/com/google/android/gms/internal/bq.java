// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.a.c;
import com.google.android.gms.a.d;
import com.google.android.gms.a.f;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.internal:
//            bu, lj, bv, em, 
//            v, ca, bn, db

public final class bq
    implements SafeParcelable
{

    public static final bu a = new bu();
    public final int b;
    public final bn c;
    public final lj d;
    public final bv e;
    public final em f;
    public final v g;
    public final String h;
    public final boolean i;
    public final String j;
    public final ca k;
    public final int l;
    public final int m;
    public final String n;
    public final db o;

    bq(int i1, bn bn, IBinder ibinder, IBinder ibinder1, IBinder ibinder2, IBinder ibinder3, String s, 
            boolean flag, String s1, IBinder ibinder4, int j1, int k1, String s2, db db)
    {
        b = i1;
        c = bn;
        d = (lj)com.google.android.gms.a.f.a(com.google.android.gms.a.d.a(ibinder));
        e = (bv)com.google.android.gms.a.f.a(com.google.android.gms.a.d.a(ibinder1));
        f = (em)com.google.android.gms.a.f.a(com.google.android.gms.a.d.a(ibinder2));
        g = (v)com.google.android.gms.a.f.a(com.google.android.gms.a.d.a(ibinder3));
        h = s;
        i = flag;
        j = s1;
        k = (ca)com.google.android.gms.a.f.a(com.google.android.gms.a.d.a(ibinder4));
        l = j1;
        m = k1;
        n = s2;
        o = db;
    }

    public bq(bn bn, lj lj1, bv bv1, ca ca1, db db)
    {
        b = 1;
        c = bn;
        d = lj1;
        e = bv1;
        f = null;
        g = null;
        h = null;
        i = false;
        j = null;
        k = ca1;
        l = -1;
        m = 4;
        n = null;
        o = db;
    }

    public bq(lj lj1, bv bv1, ca ca1, em em1, int i1, db db)
    {
        b = 1;
        c = null;
        d = lj1;
        e = bv1;
        f = em1;
        g = null;
        h = null;
        i = false;
        j = null;
        k = ca1;
        l = i1;
        m = 1;
        n = null;
        o = db;
    }

    public bq(lj lj1, bv bv1, ca ca1, em em1, boolean flag, int i1, db db)
    {
        b = 1;
        c = null;
        d = lj1;
        e = bv1;
        f = em1;
        g = null;
        h = null;
        i = flag;
        j = null;
        k = ca1;
        l = i1;
        m = 2;
        n = null;
        o = db;
    }

    public bq(lj lj1, bv bv1, v v1, ca ca1, em em1, boolean flag, int i1, 
            String s, db db)
    {
        b = 1;
        c = null;
        d = lj1;
        e = bv1;
        f = em1;
        g = v1;
        h = null;
        i = flag;
        j = null;
        k = ca1;
        l = i1;
        m = 3;
        n = s;
        o = db;
    }

    public bq(lj lj1, bv bv1, v v1, ca ca1, em em1, boolean flag, int i1, 
            String s, String s1, db db)
    {
        b = 1;
        c = null;
        d = lj1;
        e = bv1;
        f = em1;
        g = v1;
        h = s1;
        i = flag;
        j = s;
        k = ca1;
        l = i1;
        m = 3;
        n = null;
        o = db;
    }

    public static bq a(Intent intent)
    {
        try
        {
            intent = intent.getBundleExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
            intent.setClassLoader(com/google/android/gms/internal/bq.getClassLoader());
            intent = (bq)intent.getParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            return null;
        }
        return intent;
    }

    public static void a(Intent intent, bq bq1)
    {
        Bundle bundle = new Bundle(1);
        bundle.putParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", bq1);
        intent.putExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", bundle);
    }

    final IBinder a()
    {
        return com.google.android.gms.a.f.a(d).asBinder();
    }

    final IBinder b()
    {
        return com.google.android.gms.a.f.a(e).asBinder();
    }

    final IBinder c()
    {
        return com.google.android.gms.a.f.a(f).asBinder();
    }

    final IBinder d()
    {
        return com.google.android.gms.a.f.a(g).asBinder();
    }

    public final int describeContents()
    {
        return 0;
    }

    final IBinder e()
    {
        return com.google.android.gms.a.f.a(k).asBinder();
    }

    public final void writeToParcel(Parcel parcel, int i1)
    {
        bu.a(this, parcel, i1);
    }

}
