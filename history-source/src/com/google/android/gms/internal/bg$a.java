// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.location.Location;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.NetworkExtras;
import com.google.android.gms.ads.mediation.admob.AdMobExtras;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;

// Referenced classes of package com.google.android.gms.internal:
//            bg

public static final class oC
{

    private Date d;
    private Location h;
    private String oA;
    private int oC;
    private final HashSet oE = new HashSet();
    private final HashMap oF = new HashMap();
    private final HashSet oG = new HashSet();
    private String ov;
    private int ow;
    private boolean ox;
    private final Bundle oy = new Bundle();

    static Date a(oC oc)
    {
        return oc.d;
    }

    static String b(d d1)
    {
        return d1.ov;
    }

    static int c(ov ov1)
    {
        return ov1.ow;
    }

    static HashSet d(ow ow1)
    {
        return ow1.oE;
    }

    static Location e(oE oe)
    {
        return oe.h;
    }

    static boolean f(h h1)
    {
        return h1.ox;
    }

    static Bundle g(ox ox1)
    {
        return ox1.oy;
    }

    static HashMap h(oy oy1)
    {
        return oy1.oF;
    }

    static String i(oF of)
    {
        return of.oA;
    }

    static int j(oA oa)
    {
        return oa.oC;
    }

    static HashSet k(oC oc)
    {
        return oc.oG;
    }

    public void a(Location location)
    {
        h = location;
    }

    public void a(NetworkExtras networkextras)
    {
        if (networkextras instanceof AdMobExtras)
        {
            a(com/google/ads/mediation/admob/AdMobAdapter, ((AdMobExtras)networkextras).getExtras());
            return;
        } else
        {
            oF.put(networkextras.getClass(), networkextras);
            return;
        }
    }

    public void a(Class class1, Bundle bundle)
    {
        oy.putBundle(class1.getName(), bundle);
    }

    public void a(Date date)
    {
        d = date;
    }

    public void b(Class class1, Bundle bundle)
    {
        if (oy.getBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter") == null)
        {
            oy.putBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter", new Bundle());
        }
        oy.getBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter").putBundle(class1.getName(), bundle);
    }

    public void h(int l)
    {
        ow = l;
    }

    public void i(boolean flag)
    {
        ox = flag;
    }

    public void j(boolean flag)
    {
        int l;
        if (flag)
        {
            l = 1;
        } else
        {
            l = 0;
        }
        oC = l;
    }

    public void r(String s1)
    {
        oE.add(s1);
    }

    public void s(String s1)
    {
        oG.add(s1);
    }

    public void t(String s1)
    {
        ov = s1;
    }

    public void u(String s1)
    {
        oA = s1;
    }

    public NetworkExtras()
    {
        ow = -1;
        ox = false;
        oC = -1;
    }
}
