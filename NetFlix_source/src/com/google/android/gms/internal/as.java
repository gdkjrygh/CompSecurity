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
//            dv

public final class as
{
    public static final class a
    {

        private Date d;
        private Location h;
        private String lY;
        private int lZ;
        private boolean ma;
        private String md;
        private int mf;
        private final HashSet mh = new HashSet();
        private final HashMap mi = new HashMap();
        private final HashMap mj = new HashMap();
        private final HashSet mk = new HashSet();

        static Date a(a a1)
        {
            return a1.d;
        }

        static String b(a a1)
        {
            return a1.lY;
        }

        static int c(a a1)
        {
            return a1.lZ;
        }

        static HashSet d(a a1)
        {
            return a1.mh;
        }

        static Location e(a a1)
        {
            return a1.h;
        }

        static boolean f(a a1)
        {
            return a1.ma;
        }

        static HashMap g(a a1)
        {
            return a1.mi;
        }

        static HashMap h(a a1)
        {
            return a1.mj;
        }

        static String i(a a1)
        {
            return a1.md;
        }

        static int j(a a1)
        {
            return a1.mf;
        }

        static HashSet k(a a1)
        {
            return a1.mk;
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
                mj.put(networkextras.getClass(), networkextras);
                return;
            }
        }

        public void a(Class class1, Bundle bundle)
        {
            mi.put(class1, bundle);
        }

        public void a(Date date)
        {
            d = date;
        }

        public void d(int l)
        {
            lZ = l;
        }

        public void f(boolean flag)
        {
            ma = flag;
        }

        public void g(String s)
        {
            mh.add(s);
        }

        public void g(boolean flag)
        {
            int l;
            if (flag)
            {
                l = 1;
            } else
            {
                l = 0;
            }
            mf = l;
        }

        public void h(String s)
        {
            mk.add(s);
        }

        public void i(String s)
        {
            lY = s;
        }

        public void j(String s)
        {
            md = s;
        }

        public a()
        {
            lZ = -1;
            ma = false;
            mf = -1;
        }
    }


    public static final String DEVICE_ID_EMULATOR = dv.u("emulator");
    private final Date d;
    private final Set f;
    private final Location h;
    private final String lY;
    private final int lZ;
    private final boolean ma;
    private final Map mb;
    private final Map mc;
    private final String md;
    private final SearchAdRequest me;
    private final int mf;
    private final Set mg;

    public as(a a1)
    {
        this(a1, null);
    }

    public as(a a1, SearchAdRequest searchadrequest)
    {
        d = a.a(a1);
        lY = a.b(a1);
        lZ = a.c(a1);
        f = Collections.unmodifiableSet(a.d(a1));
        h = a.e(a1);
        ma = a.f(a1);
        mb = Collections.unmodifiableMap(a.g(a1));
        mc = Collections.unmodifiableMap(a.h(a1));
        md = a.i(a1);
        me = searchadrequest;
        mf = a.j(a1);
        mg = Collections.unmodifiableSet(a.k(a1));
    }

    public SearchAdRequest aB()
    {
        return me;
    }

    public Map aC()
    {
        return mc;
    }

    public Map aD()
    {
        return mb;
    }

    public int aE()
    {
        return mf;
    }

    public Date getBirthday()
    {
        return d;
    }

    public String getContentUrl()
    {
        return lY;
    }

    public int getGender()
    {
        return lZ;
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
        return ma;
    }

    public NetworkExtras getNetworkExtras(Class class1)
    {
        return (NetworkExtras)mc.get(class1);
    }

    public Bundle getNetworkExtrasBundle(Class class1)
    {
        return (Bundle)mb.get(class1);
    }

    public String getPublisherProvidedId()
    {
        return md;
    }

    public boolean isTestDevice(Context context)
    {
        return mg.contains(dv.l(context));
    }

}
