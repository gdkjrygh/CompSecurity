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
//            eu

public final class au
{
    public static final class a
    {

        private Date d;
        private Location h;
        private String mi;
        private int mj;
        private boolean mk;
        private final Bundle ml = new Bundle();
        private String mn;
        private int mp;
        private final HashSet mr = new HashSet();
        private final HashMap ms = new HashMap();
        private final HashSet mt = new HashSet();

        static Date a(a a1)
        {
            return a1.d;
        }

        static String b(a a1)
        {
            return a1.mi;
        }

        static int c(a a1)
        {
            return a1.mj;
        }

        static HashSet d(a a1)
        {
            return a1.mr;
        }

        static Location e(a a1)
        {
            return a1.h;
        }

        static boolean f(a a1)
        {
            return a1.mk;
        }

        static Bundle g(a a1)
        {
            return a1.ml;
        }

        static HashMap h(a a1)
        {
            return a1.ms;
        }

        static String i(a a1)
        {
            return a1.mn;
        }

        static int j(a a1)
        {
            return a1.mp;
        }

        static HashSet k(a a1)
        {
            return a1.mt;
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
                ms.put(networkextras.getClass(), networkextras);
                return;
            }
        }

        public void a(Class class1, Bundle bundle)
        {
            ml.putBundle(class1.getName(), bundle);
        }

        public void a(Date date)
        {
            d = date;
        }

        public void b(Class class1, Bundle bundle)
        {
            if (ml.getBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter") == null)
            {
                ml.putBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter", new Bundle());
            }
            ml.getBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter").putBundle(class1.getName(), bundle);
        }

        public void e(int l)
        {
            mj = l;
        }

        public void g(String s)
        {
            mr.add(s);
        }

        public void g(boolean flag)
        {
            mk = flag;
        }

        public void h(String s)
        {
            mt.add(s);
        }

        public void h(boolean flag)
        {
            int l;
            if (flag)
            {
                l = 1;
            } else
            {
                l = 0;
            }
            mp = l;
        }

        public void i(String s)
        {
            mi = s;
        }

        public void j(String s)
        {
            mn = s;
        }

        public a()
        {
            mj = -1;
            mk = false;
            mp = -1;
        }
    }


    public static final String DEVICE_ID_EMULATOR = eu.y("emulator");
    private final Date d;
    private final Set f;
    private final Location h;
    private final String mi;
    private final int mj;
    private final boolean mk;
    private final Bundle ml;
    private final Map mm;
    private final String mn;
    private final SearchAdRequest mo;
    private final int mp;
    private final Set mq;

    public au(a a1)
    {
        this(a1, null);
    }

    public au(a a1, SearchAdRequest searchadrequest)
    {
        d = a.a(a1);
        mi = a.b(a1);
        mj = a.c(a1);
        f = Collections.unmodifiableSet(a.d(a1));
        h = a.e(a1);
        mk = a.f(a1);
        ml = a.g(a1);
        mm = Collections.unmodifiableMap(a.h(a1));
        mn = a.i(a1);
        mo = searchadrequest;
        mp = a.j(a1);
        mq = Collections.unmodifiableSet(a.k(a1));
    }

    public SearchAdRequest aC()
    {
        return mo;
    }

    public Map aD()
    {
        return mm;
    }

    public Bundle aE()
    {
        return ml;
    }

    public int aF()
    {
        return mp;
    }

    public Date getBirthday()
    {
        return d;
    }

    public String getContentUrl()
    {
        return mi;
    }

    public Bundle getCustomEventExtrasBundle(Class class1)
    {
        Bundle bundle = ml.getBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter");
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
        return mj;
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
        return mk;
    }

    public NetworkExtras getNetworkExtras(Class class1)
    {
        return (NetworkExtras)mm.get(class1);
    }

    public Bundle getNetworkExtrasBundle(Class class1)
    {
        return ml.getBundle(class1.getName());
    }

    public String getPublisherProvidedId()
    {
        return mn;
    }

    public boolean isTestDevice(Context context)
    {
        return mq.contains(eu.o(context));
    }

}
