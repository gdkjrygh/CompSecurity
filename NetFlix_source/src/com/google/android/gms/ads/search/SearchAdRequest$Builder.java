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

public static final class rX
{

    private final com.google.android.gms.internal.r.kq kq = new com.google.android.gms.internal.r.kq();
    private int rR;
    private int rS;
    private int rT;
    private int rU;
    private int rV;
    private int rW;
    private int rX;
    private int rY;
    private String rZ;
    private int sa;
    private String sb;
    private int sc;
    private int sd;
    private String se;

    static int a(rX rx)
    {
        return rx.rR;
    }

    static int b(rR rr)
    {
        return rr.rS;
    }

    static int c(rS rs)
    {
        return rs.rT;
    }

    static int d(rT rt)
    {
        return rt.rU;
    }

    static int e(rU ru)
    {
        return ru.rV;
    }

    static int f(rV rv)
    {
        return rv.rW;
    }

    static int g(rW rw)
    {
        return rw.rX;
    }

    static int h(rX rx)
    {
        return rx.rY;
    }

    static String i(rY ry)
    {
        return ry.rZ;
    }

    static int j(rZ rz)
    {
        return rz.sa;
    }

    static String k(sa sa1)
    {
        return sa1.sb;
    }

    static int l(sb sb1)
    {
        return sb1.sc;
    }

    static int m(sc sc1)
    {
        return sc1.sd;
    }

    static String n(sd sd1)
    {
        return sd1.se;
    }

    static com.google.android.gms.internal.r o(se se1)
    {
        return se1.kq;
    }

    public kq addNetworkExtras(NetworkExtras networkextras)
    {
        kq.kq(networkextras);
        return this;
    }

    public kq addNetworkExtrasBundle(Class class1, Bundle bundle)
    {
        kq.kq(class1, bundle);
        return this;
    }

    public kq addTestDevice(String s)
    {
        kq.kq(s);
        return this;
    }

    public SearchAdRequest build()
    {
        return new SearchAdRequest(this, null);
    }

    public kq setAnchorTextColor(int i1)
    {
        rR = i1;
        return this;
    }

    public rR setBackgroundColor(int i1)
    {
        rS = i1;
        rT = Color.argb(0, 0, 0, 0);
        rU = Color.argb(0, 0, 0, 0);
        return this;
    }

    public rU setBackgroundGradient(int i1, int j1)
    {
        rS = Color.argb(0, 0, 0, 0);
        rT = j1;
        rU = i1;
        return this;
    }

    public rU setBorderColor(int i1)
    {
        rV = i1;
        return this;
    }

    public rV setBorderThickness(int i1)
    {
        rW = i1;
        return this;
    }

    public rW setBorderType(int i1)
    {
        rX = i1;
        return this;
    }

    public rX setCallButtonColor(int i1)
    {
        rY = i1;
        return this;
    }

    public rY setCustomChannels(String s)
    {
        rZ = s;
        return this;
    }

    public rZ setDescriptionTextColor(int i1)
    {
        sa = i1;
        return this;
    }

    public sa setFontFace(String s)
    {
        sb = s;
        return this;
    }

    public sb setHeaderTextColor(int i1)
    {
        sc = i1;
        return this;
    }

    public sc setHeaderTextSize(int i1)
    {
        sd = i1;
        return this;
    }

    public sd setLocation(Location location)
    {
        kq.kq(location);
        return this;
    }

    public kq setQuery(String s)
    {
        se = s;
        return this;
    }

    public se tagForChildDirectedTreatment(boolean flag)
    {
        kq.kq(flag);
        return this;
    }

    public ()
    {
        rX = 0;
    }
}
