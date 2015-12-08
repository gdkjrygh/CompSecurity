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
//            gr

public final class bg
{
    public static final class a
    {

        private Date d;
        private Location h;
        private String ol;
        private int om;
        private boolean on;
        private final Bundle oo = new Bundle();
        private String oq;
        private int os;
        private final HashSet ou = new HashSet();
        private final HashMap ov = new HashMap();
        private final HashSet ow = new HashSet();

        static Date a(a a1)
        {
            return a1.d;
        }

        static String b(a a1)
        {
            return a1.ol;
        }

        static int c(a a1)
        {
            return a1.om;
        }

        static HashSet d(a a1)
        {
            return a1.ou;
        }

        static Location e(a a1)
        {
            return a1.h;
        }

        static boolean f(a a1)
        {
            return a1.on;
        }

        static Bundle g(a a1)
        {
            return a1.oo;
        }

        static HashMap h(a a1)
        {
            return a1.ov;
        }

        static String i(a a1)
        {
            return a1.oq;
        }

        static int j(a a1)
        {
            return a1.os;
        }

        static HashSet k(a a1)
        {
            return a1.ow;
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
                ov.put(networkextras.getClass(), networkextras);
                return;
            }
        }

        public void a(Class class1, Bundle bundle)
        {
            oo.putBundle(class1.getName(), bundle);
        }

        public void a(Date date)
        {
            d = date;
        }

        public void b(Class class1, Bundle bundle)
        {
            if (oo.getBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter") == null)
            {
                oo.putBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter", new Bundle());
            }
            oo.getBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter").putBundle(class1.getName(), bundle);
        }

        public void g(int l)
        {
            om = l;
        }

        public void g(boolean flag)
        {
            on = flag;
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
            os = l;
        }

        public void r(String s1)
        {
            ou.add(s1);
        }

        public void s(String s1)
        {
            ow.add(s1);
        }

        public void t(String s1)
        {
            ol = s1;
        }

        public void u(String s1)
        {
            oq = s1;
        }

        public a()
        {
            om = -1;
            on = false;
            os = -1;
        }
    }


    public static final String DEVICE_ID_EMULATOR = gr.R("emulator");
    private final Date d;
    private final Set f;
    private final Location h;
    private final String ol;
    private final int om;
    private final boolean on;
    private final Bundle oo;
    private final Map op;
    private final String oq;
    private final SearchAdRequest or;
    private final int os;
    private final Set ot;

    public bg(a a1)
    {
        this(a1, null);
    }

    public bg(a a1, SearchAdRequest searchadrequest)
    {
        d = a.a(a1);
        ol = a.b(a1);
        om = a.c(a1);
        f = Collections.unmodifiableSet(a.d(a1));
        h = a.e(a1);
        on = a.f(a1);
        oo = a.g(a1);
        op = Collections.unmodifiableMap(a.h(a1));
        oq = a.i(a1);
        or = searchadrequest;
        os = a.j(a1);
        ot = Collections.unmodifiableSet(a.k(a1));
    }

    public SearchAdRequest bd()
    {
        return or;
    }

    public Map be()
    {
        return op;
    }

    public Bundle bf()
    {
        return oo;
    }

    public int bg()
    {
        return os;
    }

    public Date getBirthday()
    {
        return d;
    }

    public String getContentUrl()
    {
        return ol;
    }

    public Bundle getCustomEventExtrasBundle(Class class1)
    {
        Bundle bundle = oo.getBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter");
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
        return om;
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
        return on;
    }

    public NetworkExtras getNetworkExtras(Class class1)
    {
        return (NetworkExtras)op.get(class1);
    }

    public Bundle getNetworkExtrasBundle(Class class1)
    {
        return oo.getBundle(class1.getName());
    }

    public String getPublisherProvidedId()
    {
        return oq;
    }

    public boolean isTestDevice(Context context)
    {
        return ot.contains(gr.v(context));
    }

}
