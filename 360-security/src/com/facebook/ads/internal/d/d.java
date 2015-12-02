// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads.internal.d;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.View;
import com.facebook.ads.AdSize;
import com.facebook.ads.e;
import com.facebook.ads.internal.adapters.m;
import com.facebook.ads.internal.c;
import com.facebook.ads.internal.config.a;
import com.facebook.ads.internal.config.b;
import com.facebook.ads.internal.server.AdPlacementType;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.facebook.ads.internal.d:
//            e

public class d
{

    protected String a;
    protected String b;
    protected View c;
    protected AdPlacementType d;
    protected a e;
    public Context f;
    public b g;
    Map h;
    public com.facebook.ads.internal.e i;
    public boolean j;
    private c k;
    private int l;
    private AdSize m;

    public d(Context context, String s, AdSize adsize, com.facebook.ads.internal.e e1, c c1, int i1, boolean flag)
    {
        a = s;
        m = adsize;
        i = e1;
        e = com.facebook.ads.internal.config.a.a(e1);
        k = c1;
        l = i1;
        j = flag;
        s = com.facebook.ads.internal.util.a.a();
        if (s != null)
        {
            h = s;
        }
        b(context);
    }

    public static Map a(Context context)
    {
        HashMap hashmap = new HashMap();
        hashmap.put("VIEWABLE", "1");
        hashmap.put("SCHEMA", "json");
        hashmap.put("SDK", "android");
        hashmap.put("SDK_VERSION", "4.2.0");
        hashmap.put("LOCALE", Locale.getDefault().toString());
        float f1 = context.getResources().getDisplayMetrics().density;
        int i1 = context.getResources().getDisplayMetrics().widthPixels;
        int j1 = context.getResources().getDisplayMetrics().heightPixels;
        hashmap.put("DENSITY", String.valueOf(f1));
        hashmap.put("SCREEN_WIDTH", String.valueOf((int)((float)i1 / f1)));
        hashmap.put("SCREEN_HEIGHT", String.valueOf((int)((float)j1 / f1)));
        hashmap.put("IDFA", e.n);
        if (e.o)
        {
            context = "0";
        } else
        {
            context = "1";
        }
        hashmap.put("IDFA_FLAG", context);
        hashmap.put("ATTRIBUTION_ID", com.facebook.ads.internal.d.e.m);
        hashmap.put("OS", "Android");
        hashmap.put("OSVERS", com.facebook.ads.internal.d.e.a);
        hashmap.put("BUNDLE", e.d);
        hashmap.put("APPNAME", com.facebook.ads.internal.d.e.e);
        hashmap.put("APPVERS", e.f);
        hashmap.put("APPBUILD", String.valueOf(e.g));
        hashmap.put("CARRIER", e.h);
        hashmap.put("MAKE", com.facebook.ads.internal.d.e.b);
        hashmap.put("MODEL", com.facebook.ads.internal.d.e.c);
        hashmap.put("COPPA", String.valueOf(com.facebook.ads.e.b()));
        hashmap.put("SDK_CAPABILITY", com.facebook.ads.internal.d.b());
        return hashmap;
    }

    private void b(Context context)
    {
        f = context;
        com.facebook.ads.internal.d.e.a(context);
        g = new b(context);
        h();
    }

    private void h()
    {
        if (e == null)
        {
            e = a.a;
        }
        static class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[com.facebook.ads.internal.config.a.values().length];
                try
                {
                    a[a.c.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[a.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[a.d.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (com.facebook.ads.internal.d._cls1.a[e.ordinal()])
        {
        default:
            d = AdPlacementType.UNKNOWN;
            return;

        case 1: // '\001'
            d = AdPlacementType.INTERSTITIAL;
            return;

        case 2: // '\002'
            d = AdPlacementType.BANNER;
            return;

        case 3: // '\003'
            d = AdPlacementType.NATIVE;
            break;
        }
    }

    public String a()
    {
        return a;
    }

    public a b()
    {
        return e;
    }

    public AdSize c()
    {
        return m;
    }

    public int d()
    {
        return l;
    }

    public boolean e()
    {
        return a != null;
    }

    public boolean f()
    {
        boolean flag = false;
        if (b != null && b.length() >= 0)
        {
            int i1;
            try
            {
                i1 = Integer.parseInt(b);
            }
            catch (NumberFormatException numberformatexception)
            {
                com.facebook.ads.internal.c.a.d((new StringBuilder()).append("Invalid PUBLISHER_ID passed ").append(b).toString());
                return false;
            }
            if (i1 > 0)
            {
                flag = true;
            }
            return flag;
        } else
        {
            com.facebook.ads.internal.c.a.d("No PUBLISHER_ID passed");
            return false;
        }
    }

    public Map g()
    {
        HashMap hashmap;
        hashmap = new HashMap();
        if (h != null)
        {
            java.util.Map.Entry entry;
            for (Iterator iterator = h.entrySet().iterator(); iterator.hasNext(); hashmap.put(entry.getKey(), entry.getValue().toString()))
            {
                entry = (java.util.Map.Entry)iterator.next();
            }

        }
        hashmap.remove("PLACEMENT_ID");
        hashmap.remove("PUBLISHER_ID");
        Iterator iterator1;
        java.util.Map.Entry entry1;
        if (e())
        {
            hashmap.put("PLACEMENT_ID", a);
        } else
        if (f())
        {
            hashmap.put("PUBLISHER_ID", b);
        }
        if (d != AdPlacementType.UNKNOWN)
        {
            hashmap.put("PLACEMENT_TYPE", d.toString().toLowerCase());
        } else
        {
            hashmap.remove("PLACEMENT_TYPE");
        }
        for (iterator1 = a(f).entrySet().iterator(); iterator1.hasNext(); hashmap.put(entry1.getKey(), entry1.getValue()))
        {
            entry1 = (java.util.Map.Entry)iterator1.next();
        }

        hashmap.remove("WIDTH");
        hashmap.remove("HEIGHT");
        if (c == null || c.getWidth() <= 0 || c.getHeight() <= 0) goto _L2; else goto _L1
_L1:
        float f1 = f.getResources().getDisplayMetrics().density;
        hashmap.put("WIDTH", String.valueOf((int)((float)c.getWidth() / f1)));
        hashmap.put("HEIGHT", String.valueOf((int)((float)c.getHeight() / f1)));
_L4:
        hashmap.put("ADAPTERS", com.facebook.ads.internal.adapters.m.a(d));
        if (i != null)
        {
            hashmap.put("TEMPLATE_ID", String.valueOf(i.a()));
        }
        if (k != null)
        {
            hashmap.put("REQUEST_TYPE", String.valueOf(k.a()));
        }
        if (j)
        {
            hashmap.put("TEST_MODE", "1");
        }
        if (l != 0)
        {
            hashmap.put("NUM_ADS_REQUESTED", String.valueOf(l));
        }
        hashmap.put("CLIENT_EVENTS", com.facebook.ads.internal.util.d.a());
        return hashmap;
_L2:
        if (m != null)
        {
            hashmap.put("WIDTH", String.valueOf(m.getWidth()));
            hashmap.put("HEIGHT", String.valueOf(m.getHeight()));
        }
        if (true) goto _L4; else goto _L3
_L3:
    }
}
