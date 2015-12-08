// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.dynamic.b;
import com.google.android.gms.dynamic.c;

// Referenced classes of package com.google.android.gms.internal:
//            bg, q, bi, cq, 
//            ag, bl, co, be

public final class bh
    implements SafeParcelable
{

    public static final bg CREATOR = new bg();
    public final co eg;
    public final be fR;
    public final q fS;
    public final bi fT;
    public final cq fU;
    public final ag fV;
    public final String fW;
    public final boolean fX;
    public final String fY;
    public final bl fZ;
    public final String fz;
    public final int ga;
    public final int orientation;
    public final int versionCode;

    bh(int i, be be, IBinder ibinder, IBinder ibinder1, IBinder ibinder2, IBinder ibinder3, String s, 
            boolean flag, String s1, IBinder ibinder4, int j, int k, String s2, co co)
    {
        versionCode = i;
        fR = be;
        fS = (q)c.b(com.google.android.gms.dynamic.b.a.z(ibinder));
        fT = (bi)c.b(com.google.android.gms.dynamic.b.a.z(ibinder1));
        fU = (cq)c.b(com.google.android.gms.dynamic.b.a.z(ibinder2));
        fV = (ag)c.b(com.google.android.gms.dynamic.b.a.z(ibinder3));
        fW = s;
        fX = flag;
        fY = s1;
        fZ = (bl)c.b(com.google.android.gms.dynamic.b.a.z(ibinder4));
        orientation = j;
        ga = k;
        fz = s2;
        eg = co;
    }

    public bh(be be, q q1, bi bi1, bl bl1, co co)
    {
        versionCode = 1;
        fR = be;
        fS = q1;
        fT = bi1;
        fU = null;
        fV = null;
        fW = null;
        fX = false;
        fY = null;
        fZ = bl1;
        orientation = -1;
        ga = 4;
        fz = null;
        eg = co;
    }

    public bh(q q1, bi bi1, ag ag1, bl bl1, cq cq1, boolean flag, int i, 
            String s, co co)
    {
        versionCode = 1;
        fR = null;
        fS = q1;
        fT = bi1;
        fU = cq1;
        fV = ag1;
        fW = null;
        fX = flag;
        fY = null;
        fZ = bl1;
        orientation = i;
        ga = 3;
        fz = s;
        eg = co;
    }

    public bh(q q1, bi bi1, ag ag1, bl bl1, cq cq1, boolean flag, int i, 
            String s, String s1, co co)
    {
        versionCode = 1;
        fR = null;
        fS = q1;
        fT = bi1;
        fU = cq1;
        fV = ag1;
        fW = s1;
        fX = flag;
        fY = s;
        fZ = bl1;
        orientation = i;
        ga = 3;
        fz = null;
        eg = co;
    }

    public bh(q q1, bi bi1, bl bl1, cq cq1, int i, co co)
    {
        versionCode = 1;
        fR = null;
        fS = q1;
        fT = bi1;
        fU = cq1;
        fV = null;
        fW = null;
        fX = false;
        fY = null;
        fZ = bl1;
        orientation = i;
        ga = 1;
        fz = null;
        eg = co;
    }

    public bh(q q1, bi bi1, bl bl1, cq cq1, boolean flag, int i, co co)
    {
        versionCode = 1;
        fR = null;
        fS = q1;
        fT = bi1;
        fU = cq1;
        fV = null;
        fW = null;
        fX = flag;
        fY = null;
        fZ = bl1;
        orientation = i;
        ga = 2;
        fz = null;
        eg = co;
    }

    public static bh a(Intent intent)
    {
        try
        {
            intent = intent.getBundleExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
            intent.setClassLoader(com/google/android/gms/internal/bh.getClassLoader());
            intent = (bh)intent.getParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            return null;
        }
        return intent;
    }

    public static void a(Intent intent, bh bh1)
    {
        Bundle bundle = new Bundle(1);
        bundle.putParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", bh1);
        intent.putExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", bundle);
    }

    IBinder U()
    {
        return c.g(fS).asBinder();
    }

    IBinder V()
    {
        return c.g(fT).asBinder();
    }

    IBinder W()
    {
        return c.g(fU).asBinder();
    }

    IBinder X()
    {
        return c.g(fV).asBinder();
    }

    IBinder Y()
    {
        return c.g(fZ).asBinder();
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        bg.a(this, parcel, i);
    }

}
