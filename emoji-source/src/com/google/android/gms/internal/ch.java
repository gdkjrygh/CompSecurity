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
//            cg, t, ci, ex, 
//            ba, cl, bd, ev, 
//            v, ce

public final class ch
    implements SafeParcelable
{

    public static final cg CREATOR = new cg();
    public final ev kQ;
    public final String oA;
    public final boolean oB;
    public final String oC;
    public final cl oD;
    public final int oE;
    public final bd oF;
    public final String oG;
    public final v oH;
    public final String ob;
    public final int orientation;
    public final ce ov;
    public final t ow;
    public final ci ox;
    public final ex oy;
    public final ba oz;
    public final int versionCode;

    ch(int i, ce ce, IBinder ibinder, IBinder ibinder1, IBinder ibinder2, IBinder ibinder3, String s, 
            boolean flag, String s1, IBinder ibinder4, int j, int k, String s2, ev ev, 
            IBinder ibinder5, String s3, v v)
    {
        versionCode = i;
        ov = ce;
        ow = (t)e.e(com.google.android.gms.dynamic.d.a.ag(ibinder));
        ox = (ci)e.e(com.google.android.gms.dynamic.d.a.ag(ibinder1));
        oy = (ex)e.e(com.google.android.gms.dynamic.d.a.ag(ibinder2));
        oz = (ba)e.e(com.google.android.gms.dynamic.d.a.ag(ibinder3));
        oA = s;
        oB = flag;
        oC = s1;
        oD = (cl)e.e(com.google.android.gms.dynamic.d.a.ag(ibinder4));
        orientation = j;
        oE = k;
        ob = s2;
        kQ = ev;
        oF = (bd)e.e(com.google.android.gms.dynamic.d.a.ag(ibinder5));
        oG = s3;
        oH = v;
    }

    public ch(ce ce, t t1, ci ci1, cl cl1, ev ev)
    {
        versionCode = 4;
        ov = ce;
        ow = t1;
        ox = ci1;
        oy = null;
        oz = null;
        oA = null;
        oB = false;
        oC = null;
        oD = cl1;
        orientation = -1;
        oE = 4;
        ob = null;
        kQ = ev;
        oF = null;
        oG = null;
        oH = null;
    }

    public ch(t t1, ci ci1, ba ba1, cl cl1, ex ex1, boolean flag, int i, 
            String s, ev ev, bd bd1)
    {
        versionCode = 4;
        ov = null;
        ow = t1;
        ox = ci1;
        oy = ex1;
        oz = ba1;
        oA = null;
        oB = flag;
        oC = null;
        oD = cl1;
        orientation = i;
        oE = 3;
        ob = s;
        kQ = ev;
        oF = bd1;
        oG = null;
        oH = null;
    }

    public ch(t t1, ci ci1, ba ba1, cl cl1, ex ex1, boolean flag, int i, 
            String s, String s1, ev ev, bd bd1)
    {
        versionCode = 4;
        ov = null;
        ow = t1;
        ox = ci1;
        oy = ex1;
        oz = ba1;
        oA = s1;
        oB = flag;
        oC = s;
        oD = cl1;
        orientation = i;
        oE = 3;
        ob = null;
        kQ = ev;
        oF = bd1;
        oG = null;
        oH = null;
    }

    public ch(t t1, ci ci1, cl cl1, ex ex1, int i, ev ev, String s, 
            v v)
    {
        versionCode = 4;
        ov = null;
        ow = t1;
        ox = ci1;
        oy = ex1;
        oz = null;
        oA = null;
        oB = false;
        oC = null;
        oD = cl1;
        orientation = i;
        oE = 1;
        ob = null;
        kQ = ev;
        oF = null;
        oG = s;
        oH = v;
    }

    public ch(t t1, ci ci1, cl cl1, ex ex1, boolean flag, int i, ev ev)
    {
        versionCode = 4;
        ov = null;
        ow = t1;
        ox = ci1;
        oy = ex1;
        oz = null;
        oA = null;
        oB = flag;
        oC = null;
        oD = cl1;
        orientation = i;
        oE = 2;
        ob = null;
        kQ = ev;
        oF = null;
        oG = null;
        oH = null;
    }

    public static ch a(Intent intent)
    {
        try
        {
            intent = intent.getBundleExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
            intent.setClassLoader(com/google/android/gms/internal/ch.getClassLoader());
            intent = (ch)intent.getParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            return null;
        }
        return intent;
    }

    public static void a(Intent intent, ch ch1)
    {
        Bundle bundle = new Bundle(1);
        bundle.putParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", ch1);
        intent.putExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", bundle);
    }

    IBinder aU()
    {
        return e.h(ow).asBinder();
    }

    IBinder aV()
    {
        return e.h(ox).asBinder();
    }

    IBinder aW()
    {
        return e.h(oy).asBinder();
    }

    IBinder aX()
    {
        return e.h(oz).asBinder();
    }

    IBinder aY()
    {
        return e.h(oF).asBinder();
    }

    IBinder aZ()
    {
        return e.h(oD).asBinder();
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        cg.a(this, parcel, i);
    }

}
