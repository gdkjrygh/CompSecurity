// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cmcm.adsdk.nativead;

import android.content.Context;
import android.text.TextUtils;
import com.cleanmaster.ui.app.utils.MarketContext;
import com.cmcm.a.a.a;
import com.cmcm.adsdk.b.c.b;
import com.facebook.ads.NativeAd;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.cmcm.adsdk.nativead:
//            w, h, t, u, 
//            d

public final class s extends w
{

    public String a[];
    private final int b = 8000;
    private List c;
    private List d;
    private final int e = 3000;
    private final String f = "com.facebook.ad";
    private Context g;
    private int h;
    private AtomicInteger i;
    private AtomicBoolean j;
    private Object k;
    private Timer l;

    public s(Context context, String s1, String s2)
    {
        super(context, s1, "fb");
        a = null;
        c = null;
        d = null;
        h = 0;
        i = new AtomicInteger(0);
        j = new AtomicBoolean(true);
        k = new Object();
        g = context;
        c = new ArrayList();
        d = new ArrayList();
        if (!TextUtils.isEmpty(s2))
        {
            a = s2.split(",");
        }
    }

    static void a(s s1)
    {
        synchronized (s1.k)
        {
            s1.i.set(0);
            if (s1.l != null)
            {
                s1.l.cancel();
                s1.l = null;
            }
        }
        return;
        s1;
        obj;
        JVM INSTR monitorexit ;
        throw s1;
    }

    static void a(s s1, d d1)
    {
        com.cmcm.adsdk.b.c.b.a("FBNativeLoader", "FB notifyClick");
        s1.mNativeAdListener.b(d1);
    }

    static void a(s s1, String s2)
    {
        s1.a(s2);
    }

    private void a(String s1)
    {
        if (!j.get())
        {
            return;
        } else
        {
            com.cmcm.adsdk.b.c.b.a("FBNativeLoader", "FB adFailedToLoad");
            j.set(false);
            mNativeAdListener.a(getAdName(), s1);
            return;
        }
    }

    private static boolean a()
    {
        try
        {
            Class.forName("com.facebook.ads.Ad");
            Class.forName("com.facebook.ads.AdError");
            Class.forName("com.facebook.ads.AdListener");
            Class.forName("com.facebook.ads.NativeAd");
        }
        catch (ClassNotFoundException classnotfoundexception)
        {
            return false;
        }
        return true;
    }

    private boolean a(List list)
    {
        if (list != null && !list.isEmpty())
        {
            removeExpiredAds(list);
            if (!list.isEmpty())
            {
                return true;
            }
        }
        return false;
    }

    private int b()
    {
        int i1;
        if (a == null)
        {
            i1 = 0;
        } else
        {
            i1 = a.length;
        }
        return Math.min(3, i1) - c.size();
    }

    static AtomicInteger b(s s1)
    {
        return s1.i;
    }

    static List c(s s1)
    {
        return s1.c;
    }

    private void c()
    {
        if (i.get() > 0)
        {
            com.cmcm.adsdk.b.c.b.a("FBNativeLoader", "isLoading avoid repeat load");
            return;
        }
        if (a == null || a.length == 0)
        {
            com.cmcm.adsdk.b.c.b.a("FBNativeLoader", "no placementid");
            a("10003");
            return;
        }
        if (mContext == null)
        {
            com.cmcm.adsdk.b.c.b.a("FBNativeLoader", "Context is null");
            a("10003");
            return;
        }
        for (int i1 = 0; i1 < b(); i1++)
        {
            h = h % a.length;
            NativeAd nativead = new NativeAd(new MarketContext(g), a[i1]);
            nativead.setAdListener(new t(this, a[i1]));
            nativead.loadAd();
            i.incrementAndGet();
            h = h + 1;
        }

        synchronized (k)
        {
            if (l == null)
            {
                l = new Timer();
            }
            l.schedule(new u(this), 8000L);
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private void d()
    {
        c();
    }

    static void d(s s1)
    {
        s1.e();
    }

    private void e()
    {
        while (!j.get() || mNativeAdListener == null) 
        {
            return;
        }
        a a1 = null;
        if (a(c))
        {
            a1 = (a)c.get(0);
        }
        a a2 = a1;
        if (a1 == null)
        {
            a2 = a1;
            if (a(d))
            {
                a2 = (a)d.get(0);
            }
        }
        j.set(false);
        mNativeAdListener.a(a2);
    }

    protected final List getAdList(int i1)
    {
        com.cmcm.adsdk.b.c.b.a("FBNativeLoader", "getAd");
        if (!com.cmcm.adsdk.a.d())
        {
            com.cmcm.adsdk.b.c.b.a("FBNativeLoader", "sdk has stop work");
            return null;
        }
        ArrayList arraylist = new ArrayList();
        ArrayList arraylist1 = new ArrayList();
        if (a(c))
        {
            for (int j1 = 0; j1 < Math.min(i1, c.size()); j1++)
            {
                a a1 = (a)c.remove(0);
                if (a1 instanceof d)
                {
                    a1.a();
                }
                arraylist1.add(a1);
            }

        }
        if (arraylist1.size() < i1 && a(d))
        {
            for (int k1 = 0; k1 < Math.min(i1, d.size()); k1++)
            {
                a a2 = (a)d.remove(0);
                if (a2 instanceof d)
                {
                    a2.a();
                }
                arraylist1.add(a2);
            }

        }
        arraylist.addAll(arraylist1);
        d.addAll(arraylist1);
        if (c != null && c.size() < b())
        {
            com.cmcm.adsdk.b.c.b.a("FBNativeLoader", "Adpool is Empty ,to preload Ad");
            d();
        }
        return arraylist;
    }

    public final void loadAd()
    {
        if (!com.cmcm.adsdk.a.d())
        {
            com.cmcm.adsdk.b.c.b.a("FBNativeLoader", "sdk has stop work");
            return;
        }
        j.set(true);
        if (a(c) || a(d))
        {
            com.cmcm.adsdk.b.c.b.a("FBNativeLoader", "adpool has valid ad ");
            e();
            return;
        }
        if (!a())
        {
            com.cmcm.adsdk.b.c.b.a("FBNativeLoader", "fb sdk non-exist ");
            a("10003");
            return;
        } else
        {
            c();
            return;
        }
    }

    protected final void removeAdFromPool(a a1)
    {
    }
}
