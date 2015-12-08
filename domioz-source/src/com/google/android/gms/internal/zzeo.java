// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.b.k;
import com.google.android.gms.b.m;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.internal:
//            cu, s, cv, fl, 
//            av, da, bh, zzek, 
//            zzhy, zzx

public final class zzeo
    implements SafeParcelable
{

    public static final cu CREATOR = new cu();
    public final int a;
    public final zzek b;
    public final s c;
    public final cv d;
    public final fl e;
    public final av f;
    public final String g;
    public final boolean h;
    public final String i;
    public final da j;
    public final int k;
    public final int l;
    public final String m;
    public final zzhy n;
    public final bh o;
    public final String p;
    public final zzx q;

    zzeo(int i1, zzek zzek, IBinder ibinder, IBinder ibinder1, IBinder ibinder2, IBinder ibinder3, String s1, 
            boolean flag, String s2, IBinder ibinder4, int j1, int k1, String s3, zzhy zzhy, 
            IBinder ibinder5, String s4, zzx zzx)
    {
        a = i1;
        b = zzek;
        c = (s)com.google.android.gms.b.m.a(com.google.android.gms.b.k.a(ibinder));
        d = (cv)com.google.android.gms.b.m.a(com.google.android.gms.b.k.a(ibinder1));
        e = (fl)com.google.android.gms.b.m.a(com.google.android.gms.b.k.a(ibinder2));
        f = (av)com.google.android.gms.b.m.a(com.google.android.gms.b.k.a(ibinder3));
        g = s1;
        h = flag;
        i = s2;
        j = (da)com.google.android.gms.b.m.a(com.google.android.gms.b.k.a(ibinder4));
        k = j1;
        l = k1;
        m = s3;
        n = zzhy;
        o = (bh)com.google.android.gms.b.m.a(com.google.android.gms.b.k.a(ibinder5));
        p = s4;
        q = zzx;
    }

    public zzeo(s s1, cv cv1, av av1, da da1, fl fl1, boolean flag, int i1, 
            String s2, zzhy zzhy, bh bh1)
    {
        a = 4;
        b = null;
        c = s1;
        d = cv1;
        e = fl1;
        f = av1;
        g = null;
        h = flag;
        i = null;
        j = da1;
        k = i1;
        l = 3;
        m = s2;
        n = zzhy;
        o = bh1;
        p = null;
        q = null;
    }

    public zzeo(s s1, cv cv1, av av1, da da1, fl fl1, boolean flag, int i1, 
            String s2, String s3, zzhy zzhy, bh bh1)
    {
        a = 4;
        b = null;
        c = s1;
        d = cv1;
        e = fl1;
        f = av1;
        g = s3;
        h = flag;
        i = s2;
        j = da1;
        k = i1;
        l = 3;
        m = null;
        n = zzhy;
        o = bh1;
        p = null;
        q = null;
    }

    public zzeo(s s1, cv cv1, da da1, fl fl1, boolean flag, int i1, zzhy zzhy)
    {
        a = 4;
        b = null;
        c = s1;
        d = cv1;
        e = fl1;
        f = null;
        g = null;
        h = flag;
        i = null;
        j = da1;
        k = i1;
        l = 2;
        m = null;
        n = zzhy;
        o = null;
        p = null;
        q = null;
    }

    public zzeo(zzek zzek, s s1, cv cv1, da da1, zzhy zzhy)
    {
        a = 4;
        b = zzek;
        c = s1;
        d = cv1;
        e = null;
        f = null;
        g = null;
        h = false;
        i = null;
        j = da1;
        k = -1;
        l = 4;
        m = null;
        n = zzhy;
        o = null;
        p = null;
        q = null;
    }

    public static zzeo a(Intent intent)
    {
        try
        {
            intent = intent.getBundleExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
            intent.setClassLoader(com/google/android/gms/internal/zzeo.getClassLoader());
            intent = (zzeo)intent.getParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            return null;
        }
        return intent;
    }

    public static void a(Intent intent, zzeo zzeo1)
    {
        Bundle bundle = new Bundle(1);
        bundle.putParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", zzeo1);
        intent.putExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", bundle);
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i1)
    {
        cu.a(this, parcel, i1);
    }

}
