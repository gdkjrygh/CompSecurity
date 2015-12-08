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

public static final class xr
{

    private final com.google.android.gms.internal.r.le le = new com.google.android.gms.internal.r.le();
    private int xl;
    private int xm;
    private int xn;
    private int xo;
    private int xp;
    private int xq;
    private int xr;
    private int xs;
    private String xt;
    private int xu;
    private String xv;
    private int xw;
    private int xx;
    private String xy;

    static int a(xr xr1)
    {
        return xr1.xl;
    }

    static int b(xl xl1)
    {
        return xl1.xm;
    }

    static int c(xm xm1)
    {
        return xm1.xn;
    }

    static int d(xn xn1)
    {
        return xn1.xo;
    }

    static int e(xo xo1)
    {
        return xo1.xp;
    }

    static int f(xp xp1)
    {
        return xp1.xq;
    }

    static int g(xq xq1)
    {
        return xq1.xr;
    }

    static int h(xr xr1)
    {
        return xr1.xs;
    }

    static String i(xs xs1)
    {
        return xs1.xt;
    }

    static int j(xt xt1)
    {
        return xt1.xu;
    }

    static String k(xu xu1)
    {
        return xu1.xv;
    }

    static int l(xv xv1)
    {
        return xv1.xw;
    }

    static int m(xw xw1)
    {
        return xw1.xx;
    }

    static String n(xx xx1)
    {
        return xx1.xy;
    }

    static com.google.android.gms.internal.r o(xy xy1)
    {
        return xy1.le;
    }

    public le addCustomEventExtrasBundle(Class class1, Bundle bundle)
    {
        le.le(class1, bundle);
        return this;
    }

    public le addNetworkExtras(NetworkExtras networkextras)
    {
        le.le(networkextras);
        return this;
    }

    public le addNetworkExtrasBundle(Class class1, Bundle bundle)
    {
        le.le(class1, bundle);
        return this;
    }

    public le addTestDevice(String s)
    {
        le.le(s);
        return this;
    }

    public SearchAdRequest build()
    {
        return new SearchAdRequest(this, null);
    }

    public le setAnchorTextColor(int i1)
    {
        xl = i1;
        return this;
    }

    public xl setBackgroundColor(int i1)
    {
        xm = i1;
        xn = Color.argb(0, 0, 0, 0);
        xo = Color.argb(0, 0, 0, 0);
        return this;
    }

    public xo setBackgroundGradient(int i1, int j1)
    {
        xm = Color.argb(0, 0, 0, 0);
        xn = j1;
        xo = i1;
        return this;
    }

    public xo setBorderColor(int i1)
    {
        xp = i1;
        return this;
    }

    public xp setBorderThickness(int i1)
    {
        xq = i1;
        return this;
    }

    public xq setBorderType(int i1)
    {
        xr = i1;
        return this;
    }

    public xr setCallButtonColor(int i1)
    {
        xs = i1;
        return this;
    }

    public xs setCustomChannels(String s)
    {
        xt = s;
        return this;
    }

    public xt setDescriptionTextColor(int i1)
    {
        xu = i1;
        return this;
    }

    public xu setFontFace(String s)
    {
        xv = s;
        return this;
    }

    public xv setHeaderTextColor(int i1)
    {
        xw = i1;
        return this;
    }

    public xw setHeaderTextSize(int i1)
    {
        xx = i1;
        return this;
    }

    public xx setLocation(Location location)
    {
        le.le(location);
        return this;
    }

    public le setQuery(String s)
    {
        xy = s;
        return this;
    }

    public xy tagForChildDirectedTreatment(boolean flag)
    {
        le.le(flag);
        return this;
    }

    public ()
    {
        xr = 0;
    }
}
