// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.client;

import android.location.Location;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.NetworkExtras;
import com.google.android.gms.ads.mediation.admob.AdMobExtras;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;

public final class n
{

    private final HashSet a = new HashSet();
    private final Bundle b = new Bundle();
    private final HashMap c = new HashMap();
    private final HashSet d = new HashSet();
    private final Bundle e = new Bundle();
    private final HashSet f = new HashSet();
    private Date g;
    private String h;
    private int i;
    private Location j;
    private boolean k;
    private String l;
    private String m;
    private int n;

    static Date a(n n1)
    {
        return n1.g;
    }

    static String b(g g1)
    {
        return g1.h;
    }

    static int c(h h1)
    {
        return h1.i;
    }

    static HashSet d(i i1)
    {
        return i1.a;
    }

    static Location e(a a1)
    {
        return a1.j;
    }

    static boolean f(j j1)
    {
        return j1.k;
    }

    static Bundle g(k k1)
    {
        return k1.b;
    }

    static HashMap h(b b1)
    {
        return b1.c;
    }

    static String i(c c1)
    {
        return c1.l;
    }

    static String j(l l1)
    {
        return l1.m;
    }

    static int k(m m1)
    {
        return m1.n;
    }

    static HashSet l(n n1)
    {
        return n1.d;
    }

    static Bundle m(d d1)
    {
        return d1.e;
    }

    static HashSet n(e e1)
    {
        return e1.f;
    }

    public final void setManualImpressionsEnabled(boolean flag)
    {
        k = flag;
    }

    public final void zzF(String s)
    {
        a.add(s);
    }

    public final void zzG(String s)
    {
        d.add(s);
    }

    public final void zzH(String s)
    {
        d.remove(s);
    }

    public final void zzI(String s)
    {
        h = s;
    }

    public final void zzJ(String s)
    {
        l = s;
    }

    public final void zzK(String s)
    {
        m = s;
    }

    public final void zzL(String s)
    {
        f.add(s);
    }

    public final void zza(NetworkExtras networkextras)
    {
        if (networkextras instanceof AdMobExtras)
        {
            zza(com/google/ads/mediation/admob/AdMobAdapter, ((AdMobExtras)networkextras).getExtras());
            return;
        } else
        {
            c.put(networkextras.getClass(), networkextras);
            return;
        }
    }

    public final void zza(Class class1, Bundle bundle)
    {
        b.putBundle(class1.getName(), bundle);
    }

    public final void zza(Date date)
    {
        g = date;
    }

    public final void zzb(Location location)
    {
        j = location;
    }

    public final void zzb(Class class1, Bundle bundle)
    {
        if (b.getBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter") == null)
        {
            b.putBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter", new Bundle());
        }
        b.getBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter").putBundle(class1.getName(), bundle);
    }

    public final void zzb(String s, String s1)
    {
        e.putString(s, s1);
    }

    public final void zzj(boolean flag)
    {
        int i1;
        if (flag)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        n = i1;
    }

    public final void zzm(int i1)
    {
        i = i1;
    }

    public ras()
    {
        i = -1;
        k = false;
        n = -1;
    }
}
