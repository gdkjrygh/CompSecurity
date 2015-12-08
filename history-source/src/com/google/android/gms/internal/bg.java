// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.NetworkExtras;
import com.google.android.gms.ads.mediation.admob.AdMobExtras;
import com.google.android.gms.ads.search.SearchAdRequest;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.internal:
//            gq

public final class bg
{
    public static final class a
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

        static Date a(a a1)
        {
            return a1.d;
        }

        static String b(a a1)
        {
            return a1.ov;
        }

        static int c(a a1)
        {
            return a1.ow;
        }

        static HashSet d(a a1)
        {
            return a1.oE;
        }

        static Location e(a a1)
        {
            return a1.h;
        }

        static boolean f(a a1)
        {
            return a1.ox;
        }

        static Bundle g(a a1)
        {
            return a1.oy;
        }

        static HashMap h(a a1)
        {
            return a1.oF;
        }

        static String i(a a1)
        {
            return a1.oA;
        }

        static int j(a a1)
        {
            return a1.oC;
        }

        static HashSet k(a a1)
        {
            return a1.oG;
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

        public a()
        {
            ow = -1;
            ox = false;
            oC = -1;
        }
    }


    public static final String DEVICE_ID_EMULATOR = gq.R("emulator");
    private final Date d;
    private final Set f;
    private final Location h;
    private final String oA;
    private final SearchAdRequest oB;
    private final int oC;
    private final Set oD;
    private final String ov;
    private final int ow;
    private final boolean ox;
    private final Bundle oy;
    private final Map oz;

    public bg(a a1)
    {
        this(a1, null);
    }

    public bg(a a1, SearchAdRequest searchadrequest)
    {
        d = a.a(a1);
        ov = a.b(a1);
        ow = a.c(a1);
        f = Collections.unmodifiableSet(a.d(a1));
        h = a.e(a1);
        ox = a.f(a1);
        oy = a.g(a1);
        oz = Collections.unmodifiableMap(a.h(a1));
        oA = a.i(a1);
        oB = searchadrequest;
        oC = a.j(a1);
        oD = Collections.unmodifiableSet(a.k(a1));
    }

    public SearchAdRequest bi()
    {
        return oB;
    }

    public Map bj()
    {
        return oz;
    }

    public Bundle bk()
    {
        return oy;
    }

    public int bl()
    {
        return oC;
    }

    public Date getBirthday()
    {
        return d;
    }

    public String getContentUrl()
    {
        return ov;
    }

    public Bundle getCustomEventExtrasBundle(Class class1)
    {
        Bundle bundle = oy.getBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter");
        if (bundle != null)
        {
            return bundle.getBundle(class1.getClass().getName());
        } else
        {
            return null;
        }
    }

    public int getGender()
    {
        return ow;
    }

    public Set getKeywords()
    {
        return f;
    }

    public Location getLocation()
    {
        return h;
    }

    public boolean getManualImpressionsEnabled()
    {
        return ox;
    }

    public NetworkExtras getNetworkExtras(Class class1)
    {
        return (NetworkExtras)oz.get(class1);
    }

    public Bundle getNetworkExtrasBundle(Class class1)
    {
        return oy.getBundle(class1.getName());
    }

    public String getPublisherProvidedId()
    {
        return oA;
    }

    public boolean isTestDevice(Context context)
    {
        return oD.contains(gq.v(context));
    }

}
