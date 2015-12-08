// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.dynamic.d;
import com.google.android.gms.dynamic.e;

// Referenced classes of package com.google.android.gms.internal:
//            dq, t, ds, gu, 
//            cb, dv, ce, gs, 
//            do, y

public final class dr
    implements SafeParcelable
{

    public static final dq CREATOR = new dq();
    public final gs lO;
    public final int orientation;
    public final String rH;
    public final do sb;
    public final t sc;
    public final ds sd;
    public final gu se;
    public final cb sf;
    public final String sg;
    public final boolean sh;
    public final String si;
    public final dv sj;
    public final int sk;
    public final ce sl;
    public final String sm;
    public final y sn;
    public final int versionCode;

    dr(int i, do do1, IBinder ibinder, IBinder ibinder1, IBinder ibinder2, IBinder ibinder3, String s, 
            boolean flag, String s1, IBinder ibinder4, int j, int k, String s2, gs gs, 
            IBinder ibinder5, String s3, y y)
    {
        versionCode = i;
        sb = do1;
        sc = (t)e.f(com.google.android.gms.dynamic.d.a.ap(ibinder));
        sd = (ds)e.f(com.google.android.gms.dynamic.d.a.ap(ibinder1));
        se = (gu)e.f(com.google.android.gms.dynamic.d.a.ap(ibinder2));
        sf = (cb)e.f(com.google.android.gms.dynamic.d.a.ap(ibinder3));
        sg = s;
        sh = flag;
        si = s1;
        sj = (dv)e.f(com.google.android.gms.dynamic.d.a.ap(ibinder4));
        orientation = j;
        sk = k;
        rH = s2;
        lO = gs;
        sl = (ce)e.f(com.google.android.gms.dynamic.d.a.ap(ibinder5));
        sm = s3;
        sn = y;
    }

    public dr(do do1, t t1, ds ds1, dv dv1, gs gs)
    {
        versionCode = 4;
        sb = do1;
        sc = t1;
        sd = ds1;
        se = null;
        sf = null;
        sg = null;
        sh = false;
        si = null;
        sj = dv1;
        orientation = -1;
        sk = 4;
        rH = null;
        lO = gs;
        sl = null;
        sm = null;
        sn = null;
    }

    public dr(t t1, ds ds1, cb cb1, dv dv1, gu gu1, boolean flag, int i, 
            String s, gs gs, ce ce1)
    {
        versionCode = 4;
        sb = null;
        sc = t1;
        sd = ds1;
        se = gu1;
        sf = cb1;
        sg = null;
        sh = flag;
        si = null;
        sj = dv1;
        orientation = i;
        sk = 3;
        rH = s;
        lO = gs;
        sl = ce1;
        sm = null;
        sn = null;
    }

    public dr(t t1, ds ds1, cb cb1, dv dv1, gu gu1, boolean flag, int i, 
            String s, String s1, gs gs, ce ce1)
    {
        versionCode = 4;
        sb = null;
        sc = t1;
        sd = ds1;
        se = gu1;
        sf = cb1;
        sg = s1;
        sh = flag;
        si = s;
        sj = dv1;
        orientation = i;
        sk = 3;
        rH = null;
        lO = gs;
        sl = ce1;
        sm = null;
        sn = null;
    }

    public dr(t t1, ds ds1, dv dv1, gu gu1, int i, gs gs, String s, 
            y y)
    {
        versionCode = 4;
        sb = null;
        sc = t1;
        sd = ds1;
        se = gu1;
        sf = null;
        sg = null;
        sh = false;
        si = null;
        sj = dv1;
        orientation = i;
        sk = 1;
        rH = null;
        lO = gs;
        sl = null;
        sm = s;
        sn = y;
    }

    public dr(t t1, ds ds1, dv dv1, gu gu1, boolean flag, int i, gs gs)
    {
        versionCode = 4;
        sb = null;
        sc = t1;
        sd = ds1;
        se = gu1;
        sf = null;
        sg = null;
        sh = flag;
        si = null;
        sj = dv1;
        orientation = i;
        sk = 2;
        rH = null;
        lO = gs;
        sl = null;
        sm = null;
        sn = null;
    }

    public static void a(Intent intent, dr dr1)
    {
        Bundle bundle = new Bundle(1);
        bundle.putParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", dr1);
        intent.putExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", bundle);
    }

    public static dr b(Intent intent)
    {
        try
        {
            intent = intent.getBundleExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
            intent.setClassLoader(com/google/android/gms/internal/dr.getClassLoader());
            intent = (dr)intent.getParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            return null;
        }
        return intent;
    }

    IBinder ck()
    {
        return e.k(sc).asBinder();
    }

    IBinder cl()
    {
        return e.k(sd).asBinder();
    }

    IBinder cm()
    {
        return e.k(se).asBinder();
    }

    IBinder cn()
    {
        return e.k(sf).asBinder();
    }

    IBinder co()
    {
        return e.k(sl).asBinder();
    }

    IBinder cp()
    {
        return e.k(sj).asBinder();
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        dq.a(this, parcel, i);
    }

}
