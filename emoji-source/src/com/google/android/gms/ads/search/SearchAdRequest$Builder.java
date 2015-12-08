// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.search;

import android.graphics.Color;
import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.ads.mediation.NetworkExtras;

// Referenced classes of package com.google.android.gms.ads.search:
//            SearchAdRequest

public static final class ti
{

    private final com.google.android.gms.internal.r.kt kt = new com.google.android.gms.internal.r.kt();
    private int tc;
    private int td;
    private int te;
    private int tf;
    private int tg;
    private int th;
    private int ti;
    private int tj;
    private String tk;
    private int tl;
    private String tm;
    private int tn;
    private int to;
    private String tp;

    static int a(ti ti1)
    {
        return ti1.tc;
    }

    static int b(tc tc1)
    {
        return tc1.td;
    }

    static int c(td td1)
    {
        return td1.te;
    }

    static int d(te te1)
    {
        return te1.tf;
    }

    static int e(tf tf1)
    {
        return tf1.tg;
    }

    static int f(tg tg1)
    {
        return tg1.th;
    }

    static int g(th th1)
    {
        return th1.ti;
    }

    static int h(ti ti1)
    {
        return ti1.tj;
    }

    static String i(tj tj1)
    {
        return tj1.tk;
    }

    static int j(tk tk1)
    {
        return tk1.tl;
    }

    static String k(tl tl1)
    {
        return tl1.tm;
    }

    static int l(tm tm1)
    {
        return tm1.tn;
    }

    static int m(tn tn1)
    {
        return tn1.to;
    }

    static String n(to to1)
    {
        return to1.tp;
    }

    static com.google.android.gms.internal.r o(tp tp1)
    {
        return tp1.kt;
    }

    public kt addCustomEventExtrasBundle(Class class1, Bundle bundle)
    {
        kt.kt(class1, bundle);
        return this;
    }

    public kt addNetworkExtras(NetworkExtras networkextras)
    {
        kt.kt(networkextras);
        return this;
    }

    public kt addNetworkExtrasBundle(Class class1, Bundle bundle)
    {
        kt.kt(class1, bundle);
        return this;
    }

    public kt addTestDevice(String s)
    {
        kt.kt(s);
        return this;
    }

    public SearchAdRequest build()
    {
        return new SearchAdRequest(this, null);
    }

    public kt setAnchorTextColor(int i1)
    {
        tc = i1;
        return this;
    }

    public tc setBackgroundColor(int i1)
    {
        td = i1;
        te = Color.argb(0, 0, 0, 0);
        tf = Color.argb(0, 0, 0, 0);
        return this;
    }

    public tf setBackgroundGradient(int i1, int j1)
    {
        td = Color.argb(0, 0, 0, 0);
        te = j1;
        tf = i1;
        return this;
    }

    public tf setBorderColor(int i1)
    {
        tg = i1;
        return this;
    }

    public tg setBorderThickness(int i1)
    {
        th = i1;
        return this;
    }

    public th setBorderType(int i1)
    {
        ti = i1;
        return this;
    }

    public ti setCallButtonColor(int i1)
    {
        tj = i1;
        return this;
    }

    public tj setCustomChannels(String s)
    {
        tk = s;
        return this;
    }

    public tk setDescriptionTextColor(int i1)
    {
        tl = i1;
        return this;
    }

    public tl setFontFace(String s)
    {
        tm = s;
        return this;
    }

    public tm setHeaderTextColor(int i1)
    {
        tn = i1;
        return this;
    }

    public tn setHeaderTextSize(int i1)
    {
        to = i1;
        return this;
    }

    public to setLocation(Location location)
    {
        kt.kt(location);
        return this;
    }

    public kt setQuery(String s)
    {
        tp = s;
        return this;
    }

    public tp tagForChildDirectedTreatment(boolean flag)
    {
        kt.kt(flag);
        return this;
    }

    public ()
    {
        ti = 0;
    }
}
