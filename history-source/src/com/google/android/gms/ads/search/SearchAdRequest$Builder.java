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

public static final class xG
{

    private final com.google.android.gms.internal.r.lh lh = new com.google.android.gms.internal.r.lh();
    private int xA;
    private int xB;
    private int xC;
    private int xD;
    private int xE;
    private int xF;
    private int xG;
    private int xH;
    private String xI;
    private int xJ;
    private String xK;
    private int xL;
    private int xM;
    private String xN;

    static int a(xG xg)
    {
        return xg.xA;
    }

    static int b(xA xa)
    {
        return xa.xB;
    }

    static int c(xB xb)
    {
        return xb.xC;
    }

    static int d(xC xc)
    {
        return xc.xD;
    }

    static int e(xD xd)
    {
        return xd.xE;
    }

    static int f(xE xe)
    {
        return xe.xF;
    }

    static int g(xF xf)
    {
        return xf.xG;
    }

    static int h(xG xg)
    {
        return xg.xH;
    }

    static String i(xH xh)
    {
        return xh.xI;
    }

    static int j(xI xi)
    {
        return xi.xJ;
    }

    static String k(xJ xj)
    {
        return xj.xK;
    }

    static int l(xK xk)
    {
        return xk.xL;
    }

    static int m(xL xl)
    {
        return xl.xM;
    }

    static String n(xM xm)
    {
        return xm.xN;
    }

    static com.google.android.gms.internal.r o(xN xn)
    {
        return xn.lh;
    }

    public lh addCustomEventExtrasBundle(Class class1, Bundle bundle)
    {
        lh.lh(class1, bundle);
        return this;
    }

    public lh addNetworkExtras(NetworkExtras networkextras)
    {
        lh.lh(networkextras);
        return this;
    }

    public lh addNetworkExtrasBundle(Class class1, Bundle bundle)
    {
        lh.lh(class1, bundle);
        return this;
    }

    public lh addTestDevice(String s)
    {
        lh.lh(s);
        return this;
    }

    public SearchAdRequest build()
    {
        return new SearchAdRequest(this, null);
    }

    public lh setAnchorTextColor(int i1)
    {
        xA = i1;
        return this;
    }

    public xA setBackgroundColor(int i1)
    {
        xB = i1;
        xC = Color.argb(0, 0, 0, 0);
        xD = Color.argb(0, 0, 0, 0);
        return this;
    }

    public xD setBackgroundGradient(int i1, int j1)
    {
        xB = Color.argb(0, 0, 0, 0);
        xC = j1;
        xD = i1;
        return this;
    }

    public xD setBorderColor(int i1)
    {
        xE = i1;
        return this;
    }

    public xE setBorderThickness(int i1)
    {
        xF = i1;
        return this;
    }

    public xF setBorderType(int i1)
    {
        xG = i1;
        return this;
    }

    public xG setCallButtonColor(int i1)
    {
        xH = i1;
        return this;
    }

    public xH setCustomChannels(String s)
    {
        xI = s;
        return this;
    }

    public xI setDescriptionTextColor(int i1)
    {
        xJ = i1;
        return this;
    }

    public xJ setFontFace(String s)
    {
        xK = s;
        return this;
    }

    public xK setHeaderTextColor(int i1)
    {
        xL = i1;
        return this;
    }

    public xL setHeaderTextSize(int i1)
    {
        xM = i1;
        return this;
    }

    public xM setLocation(Location location)
    {
        lh.lh(location);
        return this;
    }

    public lh setQuery(String s)
    {
        xN = s;
        return this;
    }

    public xN tagForChildDirectedTreatment(boolean flag)
    {
        lh.lh(flag);
        return this;
    }

    public ()
    {
        xG = 0;
    }
}
