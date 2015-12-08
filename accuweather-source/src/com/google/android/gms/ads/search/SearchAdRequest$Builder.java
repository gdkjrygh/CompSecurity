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

public static final class tf
{

    private final com.google.android.gms.internal.r.kr kr = new com.google.android.gms.internal.r.kr();
    private int sZ;
    private int ta;
    private int tb;
    private int tc;
    private int td;
    private int te;
    private int tf;
    private int tg;
    private String th;
    private int ti;
    private String tj;
    private int tk;
    private int tl;
    private String tm;

    static int a(tf tf1)
    {
        return tf1.sZ;
    }

    static int b(sZ sz)
    {
        return sz.ta;
    }

    static int c(ta ta1)
    {
        return ta1.tb;
    }

    static int d(tb tb1)
    {
        return tb1.tc;
    }

    static int e(tc tc1)
    {
        return tc1.td;
    }

    static int f(td td1)
    {
        return td1.te;
    }

    static int g(te te1)
    {
        return te1.tf;
    }

    static int h(tf tf1)
    {
        return tf1.tg;
    }

    static String i(tg tg1)
    {
        return tg1.th;
    }

    static int j(th th1)
    {
        return th1.ti;
    }

    static String k(ti ti1)
    {
        return ti1.tj;
    }

    static int l(tj tj1)
    {
        return tj1.tk;
    }

    static int m(tk tk1)
    {
        return tk1.tl;
    }

    static String n(tl tl1)
    {
        return tl1.tm;
    }

    static com.google.android.gms.internal.r o(tm tm1)
    {
        return tm1.kr;
    }

    public kr addCustomEventExtrasBundle(Class class1, Bundle bundle)
    {
        kr.kr(class1, bundle);
        return this;
    }

    public kr addNetworkExtras(NetworkExtras networkextras)
    {
        kr.kr(networkextras);
        return this;
    }

    public kr addNetworkExtrasBundle(Class class1, Bundle bundle)
    {
        kr.kr(class1, bundle);
        return this;
    }

    public kr addTestDevice(String s)
    {
        kr.kr(s);
        return this;
    }

    public SearchAdRequest build()
    {
        return new SearchAdRequest(this, null);
    }

    public kr setAnchorTextColor(int i1)
    {
        sZ = i1;
        return this;
    }

    public sZ setBackgroundColor(int i1)
    {
        ta = i1;
        tb = Color.argb(0, 0, 0, 0);
        tc = Color.argb(0, 0, 0, 0);
        return this;
    }

    public tc setBackgroundGradient(int i1, int j1)
    {
        ta = Color.argb(0, 0, 0, 0);
        tb = j1;
        tc = i1;
        return this;
    }

    public tc setBorderColor(int i1)
    {
        td = i1;
        return this;
    }

    public td setBorderThickness(int i1)
    {
        te = i1;
        return this;
    }

    public te setBorderType(int i1)
    {
        tf = i1;
        return this;
    }

    public tf setCallButtonColor(int i1)
    {
        tg = i1;
        return this;
    }

    public tg setCustomChannels(String s)
    {
        th = s;
        return this;
    }

    public th setDescriptionTextColor(int i1)
    {
        ti = i1;
        return this;
    }

    public ti setFontFace(String s)
    {
        tj = s;
        return this;
    }

    public tj setHeaderTextColor(int i1)
    {
        tk = i1;
        return this;
    }

    public tk setHeaderTextSize(int i1)
    {
        tl = i1;
        return this;
    }

    public tl setLocation(Location location)
    {
        kr.kr(location);
        return this;
    }

    public kr setQuery(String s)
    {
        tm = s;
        return this;
    }

    public tm tagForChildDirectedTreatment(boolean flag)
    {
        kr.kr(flag);
        return this;
    }

    public ()
    {
        tf = 0;
    }
}
