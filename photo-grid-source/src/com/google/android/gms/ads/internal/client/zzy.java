// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.ads.internal.util.client.zza;
import com.google.android.gms.ads.mediation.NetworkExtras;
import com.google.android.gms.ads.search.SearchAdRequest;
import java.util.Collections;
import java.util.Date;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.ads.internal.client:
//            zzl, zzm

public final class zzy
{

    public static final String DEVICE_ID_EMULATOR = zzl.zzcF().zzaE("emulator");
    private final Date a;
    private final String b;
    private final int c;
    private final Set d;
    private final Location e;
    private final boolean f;
    private final Bundle g;
    private final Map h;
    private final String i;
    private final String j;
    private final SearchAdRequest k;
    private final int l;
    private final Set m;
    private final Bundle n;
    private final Set o;

    public zzy(zza zza1)
    {
        this(zza1, null);
    }

    public zzy(zza zza1, SearchAdRequest searchadrequest)
    {
        a = zza.a(zza1);
        b = zza.b(zza1);
        c = zza.c(zza1);
        d = Collections.unmodifiableSet(zza.d(zza1));
        e = zza.e(zza1);
        f = zza.f(zza1);
        g = zza.g(zza1);
        h = Collections.unmodifiableMap(zza.h(zza1));
        i = zza.i(zza1);
        j = zza.j(zza1);
        k = searchadrequest;
        l = zza.k(zza1);
        m = Collections.unmodifiableSet(zza.l(zza1));
        n = zza.m(zza1);
        o = Collections.unmodifiableSet(zza.n(zza1));
    }

    public static void updateCorrelator()
    {
        zzl.zzcH().zzcL();
    }

    public final Date getBirthday()
    {
        return a;
    }

    public final String getContentUrl()
    {
        return b;
    }

    public final Bundle getCustomEventExtrasBundle(Class class1)
    {
        Bundle bundle = g.getBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter");
        if (bundle != null)
        {
            return bundle.getBundle(class1.getClass().getName());
        } else
        {
            return null;
        }
    }

    public final Bundle getCustomTargeting()
    {
        return n;
    }

    public final int getGender()
    {
        return c;
    }

    public final Set getKeywords()
    {
        return d;
    }

    public final Location getLocation()
    {
        return e;
    }

    public final boolean getManualImpressionsEnabled()
    {
        return f;
    }

    public final NetworkExtras getNetworkExtras(Class class1)
    {
        return (NetworkExtras)h.get(class1);
    }

    public final Bundle getNetworkExtrasBundle(Class class1)
    {
        return g.getBundle(class1.getName());
    }

    public final String getPublisherProvidedId()
    {
        return i;
    }

    public final boolean isTestDevice(Context context)
    {
        return m.contains(zzl.zzcF().zzQ(context));
    }

    public final String zzcM()
    {
        return j;
    }

    public final SearchAdRequest zzcN()
    {
        return k;
    }

    public final Map zzcO()
    {
        return h;
    }

    public final Bundle zzcP()
    {
        return g;
    }

    public final int zzcQ()
    {
        return l;
    }

    public final Set zzcR()
    {
        return o;
    }


    private class zza
    {

        private final HashSet a = new HashSet();
        private final Bundle b = new Bundle();
        private final HashMap c = new HashMap();
        private final HashSet d = new HashSet();
        private final Bundle e = new Bundle();
        private final HashSet f = new HashSet();
        private Date g;
        private String h;
        private int i;
        private Location j;
        private boolean k;
        private String l;
        private String m;
        private int n;

        static Date a(zza zza1)
        {
            return zza1.g;
        }

        static String b(zza zza1)
        {
            return zza1.h;
        }

        static int c(zza zza1)
        {
            return zza1.i;
        }

        static HashSet d(zza zza1)
        {
            return zza1.a;
        }

        static Location e(zza zza1)
        {
            return zza1.j;
        }

        static boolean f(zza zza1)
        {
            return zza1.k;
        }

        static Bundle g(zza zza1)
        {
            return zza1.b;
        }

        static HashMap h(zza zza1)
        {
            return zza1.c;
        }

        static String i(zza zza1)
        {
            return zza1.l;
        }

        static String j(zza zza1)
        {
            return zza1.m;
        }

        static int k(zza zza1)
        {
            return zza1.n;
        }

        static HashSet l(zza zza1)
        {
            return zza1.d;
        }

        static Bundle m(zza zza1)
        {
            return zza1.e;
        }

        static HashSet n(zza zza1)
        {
            return zza1.f;
        }

        public final void setManualImpressionsEnabled(boolean flag)
        {
            k = flag;
        }

        public final void zzF(String s)
        {
            a.add(s);
        }

        public final void zzG(String s)
        {
            d.add(s);
        }

        public final void zzH(String s)
        {
            d.remove(s);
        }

        public final void zzI(String s)
        {
            h = s;
        }

        public final void zzJ(String s)
        {
            l = s;
        }

        public final void zzK(String s)
        {
            m = s;
        }

        public final void zzL(String s)
        {
            f.add(s);
        }

        public final void zza(NetworkExtras networkextras)
        {
            if (networkextras instanceof AdMobExtras)
            {
                zza(com/google/ads/mediation/admob/AdMobAdapter, ((AdMobExtras)networkextras).getExtras());
                return;
            } else
            {
                c.put(networkextras.getClass(), networkextras);
                return;
            }
        }

        public final void zza(Class class1, Bundle bundle)
        {
            b.putBundle(class1.getName(), bundle);
        }

        public final void zza(Date date)
        {
            g = date;
        }

        public final void zzb(Location location)
        {
            j = location;
        }

        public final void zzb(Class class1, Bundle bundle)
        {
            if (b.getBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter") == null)
            {
                b.putBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter", new Bundle());
            }
            b.getBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter").putBundle(class1.getName(), bundle);
        }

        public final void zzb(String s, String s1)
        {
            e.putString(s, s1);
        }

        public final void zzj(boolean flag)
        {
            int i1;
            if (flag)
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            n = i1;
        }

        public final void zzm(int i1)
        {
            i = i1;
        }

        public zza()
        {
            i = -1;
            k = false;
            n = -1;
        }
    }

}
