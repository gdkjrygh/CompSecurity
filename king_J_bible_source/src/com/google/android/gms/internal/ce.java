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
//            cd, u, cf, dz, 
//            az, ci, bc, dx, 
//            cb

public final class ce
    implements SafeParcelable
{

    public static final cd CREATOR = new cd();
    public final dx kK;
    public final String nO;
    public final cb og;
    public final u oh;
    public final cf oi;
    public final dz oj;
    public final az ok;
    public final String ol;
    public final boolean om;
    public final String on;
    public final ci oo;
    public final int op;
    public final bc oq;
    public final String or;
    public final int orientation;
    public final int versionCode;

    ce(int i, cb cb, IBinder ibinder, IBinder ibinder1, IBinder ibinder2, IBinder ibinder3, String s, 
            boolean flag, String s1, IBinder ibinder4, int j, int k, String s2, dx dx, 
            IBinder ibinder5, String s3)
    {
        versionCode = i;
        og = cb;
        oh = (u)e.d(com.google.android.gms.dynamic.d.a.K(ibinder));
        oi = (cf)e.d(com.google.android.gms.dynamic.d.a.K(ibinder1));
        oj = (dz)e.d(com.google.android.gms.dynamic.d.a.K(ibinder2));
        ok = (az)e.d(com.google.android.gms.dynamic.d.a.K(ibinder3));
        ol = s;
        om = flag;
        on = s1;
        oo = (ci)e.d(com.google.android.gms.dynamic.d.a.K(ibinder4));
        orientation = j;
        op = k;
        nO = s2;
        kK = dx;
        oq = (bc)e.d(com.google.android.gms.dynamic.d.a.K(ibinder5));
        or = s3;
    }

    public ce(cb cb, u u1, cf cf1, ci ci1, dx dx)
    {
        versionCode = 3;
        og = cb;
        oh = u1;
        oi = cf1;
        oj = null;
        ok = null;
        ol = null;
        om = false;
        on = null;
        oo = ci1;
        orientation = -1;
        op = 4;
        nO = null;
        kK = dx;
        oq = null;
        or = null;
    }

    public ce(u u1, cf cf1, az az1, ci ci1, dz dz1, boolean flag, int i, 
            String s, dx dx, bc bc1)
    {
        versionCode = 3;
        og = null;
        oh = u1;
        oi = cf1;
        oj = dz1;
        ok = az1;
        ol = null;
        om = flag;
        on = null;
        oo = ci1;
        orientation = i;
        op = 3;
        nO = s;
        kK = dx;
        oq = bc1;
        or = null;
    }

    public ce(u u1, cf cf1, az az1, ci ci1, dz dz1, boolean flag, int i, 
            String s, String s1, dx dx, bc bc1)
    {
        versionCode = 3;
        og = null;
        oh = u1;
        oi = cf1;
        oj = dz1;
        ok = az1;
        ol = s1;
        om = flag;
        on = s;
        oo = ci1;
        orientation = i;
        op = 3;
        nO = null;
        kK = dx;
        oq = bc1;
        or = null;
    }

    public ce(u u1, cf cf1, ci ci1, dz dz1, int i, dx dx, String s)
    {
        versionCode = 3;
        og = null;
        oh = u1;
        oi = cf1;
        oj = dz1;
        ok = null;
        ol = null;
        om = false;
        on = null;
        oo = ci1;
        orientation = i;
        op = 1;
        nO = null;
        kK = dx;
        oq = null;
        or = s;
    }

    public ce(u u1, cf cf1, ci ci1, dz dz1, boolean flag, int i, dx dx)
    {
        versionCode = 3;
        og = null;
        oh = u1;
        oi = cf1;
        oj = dz1;
        ok = null;
        ol = null;
        om = flag;
        on = null;
        oo = ci1;
        orientation = i;
        op = 2;
        nO = null;
        kK = dx;
        oq = null;
        or = null;
    }

    public static ce a(Intent intent)
    {
        try
        {
            intent = intent.getBundleExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
            intent.setClassLoader(com/google/android/gms/internal/ce.getClassLoader());
            intent = (ce)intent.getParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            return null;
        }
        return intent;
    }

    public static void a(Intent intent, ce ce1)
    {
        Bundle bundle = new Bundle(1);
        bundle.putParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", ce1);
        intent.putExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", bundle);
    }

    IBinder aO()
    {
        return e.h(oh).asBinder();
    }

    IBinder aP()
    {
        return e.h(oi).asBinder();
    }

    IBinder aQ()
    {
        return e.h(oj).asBinder();
    }

    IBinder aR()
    {
        return e.h(ok).asBinder();
    }

    IBinder aS()
    {
        return e.h(oq).asBinder();
    }

    IBinder aT()
    {
        return e.h(oo).asBinder();
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        cd.a(this, parcel, i);
    }

}
