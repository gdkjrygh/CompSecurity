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
//            dl, t, dn, gv, 
//            bw, dq, bz, gt, 
//            dj, x

public final class dm
    implements SafeParcelable
{

    public static final dl CREATOR = new dl();
    public final gt lD;
    public final int orientation;
    public final dj rK;
    public final t rL;
    public final dn rM;
    public final gv rN;
    public final bw rO;
    public final String rP;
    public final boolean rQ;
    public final String rR;
    public final dq rS;
    public final int rT;
    public final bz rU;
    public final String rV;
    public final x rW;
    public final String rq;
    public final int versionCode;

    dm(int i, dj dj, IBinder ibinder, IBinder ibinder1, IBinder ibinder2, IBinder ibinder3, String s, 
            boolean flag, String s1, IBinder ibinder4, int j, int k, String s2, gt gt, 
            IBinder ibinder5, String s3, x x)
    {
        versionCode = i;
        rK = dj;
        rL = (t)e.f(com.google.android.gms.dynamic.d.a.am(ibinder));
        rM = (dn)e.f(com.google.android.gms.dynamic.d.a.am(ibinder1));
        rN = (gv)e.f(com.google.android.gms.dynamic.d.a.am(ibinder2));
        rO = (bw)e.f(com.google.android.gms.dynamic.d.a.am(ibinder3));
        rP = s;
        rQ = flag;
        rR = s1;
        rS = (dq)e.f(com.google.android.gms.dynamic.d.a.am(ibinder4));
        orientation = j;
        rT = k;
        rq = s2;
        lD = gt;
        rU = (bz)e.f(com.google.android.gms.dynamic.d.a.am(ibinder5));
        rV = s3;
        rW = x;
    }

    public dm(dj dj, t t1, dn dn1, dq dq1, gt gt)
    {
        versionCode = 4;
        rK = dj;
        rL = t1;
        rM = dn1;
        rN = null;
        rO = null;
        rP = null;
        rQ = false;
        rR = null;
        rS = dq1;
        orientation = -1;
        rT = 4;
        rq = null;
        lD = gt;
        rU = null;
        rV = null;
        rW = null;
    }

    public dm(t t1, dn dn1, bw bw1, dq dq1, gv gv1, boolean flag, int i, 
            String s, gt gt, bz bz1)
    {
        versionCode = 4;
        rK = null;
        rL = t1;
        rM = dn1;
        rN = gv1;
        rO = bw1;
        rP = null;
        rQ = flag;
        rR = null;
        rS = dq1;
        orientation = i;
        rT = 3;
        rq = s;
        lD = gt;
        rU = bz1;
        rV = null;
        rW = null;
    }

    public dm(t t1, dn dn1, bw bw1, dq dq1, gv gv1, boolean flag, int i, 
            String s, String s1, gt gt, bz bz1)
    {
        versionCode = 4;
        rK = null;
        rL = t1;
        rM = dn1;
        rN = gv1;
        rO = bw1;
        rP = s1;
        rQ = flag;
        rR = s;
        rS = dq1;
        orientation = i;
        rT = 3;
        rq = null;
        lD = gt;
        rU = bz1;
        rV = null;
        rW = null;
    }

    public dm(t t1, dn dn1, dq dq1, gv gv1, int i, gt gt, String s, 
            x x)
    {
        versionCode = 4;
        rK = null;
        rL = t1;
        rM = dn1;
        rN = gv1;
        rO = null;
        rP = null;
        rQ = false;
        rR = null;
        rS = dq1;
        orientation = i;
        rT = 1;
        rq = null;
        lD = gt;
        rU = null;
        rV = s;
        rW = x;
    }

    public dm(t t1, dn dn1, dq dq1, gv gv1, boolean flag, int i, gt gt)
    {
        versionCode = 4;
        rK = null;
        rL = t1;
        rM = dn1;
        rN = gv1;
        rO = null;
        rP = null;
        rQ = flag;
        rR = null;
        rS = dq1;
        orientation = i;
        rT = 2;
        rq = null;
        lD = gt;
        rU = null;
        rV = null;
        rW = null;
    }

    public static void a(Intent intent, dm dm1)
    {
        Bundle bundle = new Bundle(1);
        bundle.putParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", dm1);
        intent.putExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", bundle);
    }

    public static dm b(Intent intent)
    {
        try
        {
            intent = intent.getBundleExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
            intent.setClassLoader(com/google/android/gms/internal/dm.getClassLoader());
            intent = (dm)intent.getParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            return null;
        }
        return intent;
    }

    IBinder cb()
    {
        return e.k(rL).asBinder();
    }

    IBinder cc()
    {
        return e.k(rM).asBinder();
    }

    IBinder cd()
    {
        return e.k(rN).asBinder();
    }

    IBinder ce()
    {
        return e.k(rO).asBinder();
    }

    IBinder cf()
    {
        return e.k(rU).asBinder();
    }

    IBinder cg()
    {
        return e.k(rS).asBinder();
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        dl.a(this, parcel, i);
    }

}
