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
//            ch, u, cj, ey, 
//            bb, cm, be, ew, 
//            w, cf

public final class ci
    implements SafeParcelable
{

    public static final ch CREATOR = new ch();
    public final ew kO;
    public final String nZ;
    public final String oA;
    public final cm oB;
    public final int oC;
    public final be oD;
    public final String oE;
    public final w oF;
    public final int orientation;
    public final cf ot;
    public final u ou;
    public final cj ov;
    public final ey ow;
    public final bb ox;
    public final String oy;
    public final boolean oz;
    public final int versionCode;

    ci(int i, cf cf, IBinder ibinder, IBinder ibinder1, IBinder ibinder2, IBinder ibinder3, String s, 
            boolean flag, String s1, IBinder ibinder4, int j, int k, String s2, ew ew, 
            IBinder ibinder5, String s3, w w)
    {
        versionCode = i;
        ot = cf;
        ou = (u)e.e(com.google.android.gms.dynamic.d.a.ag(ibinder));
        ov = (cj)e.e(com.google.android.gms.dynamic.d.a.ag(ibinder1));
        ow = (ey)e.e(com.google.android.gms.dynamic.d.a.ag(ibinder2));
        ox = (bb)e.e(com.google.android.gms.dynamic.d.a.ag(ibinder3));
        oy = s;
        oz = flag;
        oA = s1;
        oB = (cm)e.e(com.google.android.gms.dynamic.d.a.ag(ibinder4));
        orientation = j;
        oC = k;
        nZ = s2;
        kO = ew;
        oD = (be)e.e(com.google.android.gms.dynamic.d.a.ag(ibinder5));
        oE = s3;
        oF = w;
    }

    public ci(cf cf, u u1, cj cj1, cm cm1, ew ew)
    {
        versionCode = 4;
        ot = cf;
        ou = u1;
        ov = cj1;
        ow = null;
        ox = null;
        oy = null;
        oz = false;
        oA = null;
        oB = cm1;
        orientation = -1;
        oC = 4;
        nZ = null;
        kO = ew;
        oD = null;
        oE = null;
        oF = null;
    }

    public ci(u u1, cj cj1, bb bb1, cm cm1, ey ey1, boolean flag, int i, 
            String s, ew ew, be be1)
    {
        versionCode = 4;
        ot = null;
        ou = u1;
        ov = cj1;
        ow = ey1;
        ox = bb1;
        oy = null;
        oz = flag;
        oA = null;
        oB = cm1;
        orientation = i;
        oC = 3;
        nZ = s;
        kO = ew;
        oD = be1;
        oE = null;
        oF = null;
    }

    public ci(u u1, cj cj1, bb bb1, cm cm1, ey ey1, boolean flag, int i, 
            String s, String s1, ew ew, be be1)
    {
        versionCode = 4;
        ot = null;
        ou = u1;
        ov = cj1;
        ow = ey1;
        ox = bb1;
        oy = s1;
        oz = flag;
        oA = s;
        oB = cm1;
        orientation = i;
        oC = 3;
        nZ = null;
        kO = ew;
        oD = be1;
        oE = null;
        oF = null;
    }

    public ci(u u1, cj cj1, cm cm1, ey ey1, int i, ew ew, String s, 
            w w)
    {
        versionCode = 4;
        ot = null;
        ou = u1;
        ov = cj1;
        ow = ey1;
        ox = null;
        oy = null;
        oz = false;
        oA = null;
        oB = cm1;
        orientation = i;
        oC = 1;
        nZ = null;
        kO = ew;
        oD = null;
        oE = s;
        oF = w;
    }

    public ci(u u1, cj cj1, cm cm1, ey ey1, boolean flag, int i, ew ew)
    {
        versionCode = 4;
        ot = null;
        ou = u1;
        ov = cj1;
        ow = ey1;
        ox = null;
        oy = null;
        oz = flag;
        oA = null;
        oB = cm1;
        orientation = i;
        oC = 2;
        nZ = null;
        kO = ew;
        oD = null;
        oE = null;
        oF = null;
    }

    public static ci a(Intent intent)
    {
        try
        {
            intent = intent.getBundleExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
            intent.setClassLoader(com/google/android/gms/internal/ci.getClassLoader());
            intent = (ci)intent.getParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            return null;
        }
        return intent;
    }

    public static void a(Intent intent, ci ci1)
    {
        Bundle bundle = new Bundle(1);
        bundle.putParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", ci1);
        intent.putExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", bundle);
    }

    IBinder aP()
    {
        return e.h(ou).asBinder();
    }

    IBinder aQ()
    {
        return e.h(ov).asBinder();
    }

    IBinder aR()
    {
        return e.h(ow).asBinder();
    }

    IBinder aS()
    {
        return e.h(ox).asBinder();
    }

    IBinder aT()
    {
        return e.h(oD).asBinder();
    }

    IBinder aU()
    {
        return e.h(oB).asBinder();
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        ch.a(this, parcel, i);
    }

}
