// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads.internal.dto;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import com.facebook.ads.AdSettings;
import com.facebook.ads.AdSize;
import com.facebook.ads.internal.adapters.f;
import com.facebook.ads.internal.c;
import com.facebook.ads.internal.config.a;
import com.facebook.ads.internal.config.b;
import com.facebook.ads.internal.e;
import com.facebook.ads.internal.server.AdPlacementType;
import com.facebook.ads.internal.util.AdInternalSettings;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.facebook.ads.internal.dto:
//            e

public class d
{

    protected String a;
    protected AdPlacementType b;
    protected a c;
    public Context d;
    public b e;
    public e f;
    public boolean g;
    private c h;
    private int i;
    private AdSize j;

    public d(Context context, String s, AdSize adsize, e e1, c c1, int k, boolean flag)
    {
        a = s;
        j = adsize;
        f = e1;
        c = com.facebook.ads.internal.config.a.a(e1);
        h = c1;
        i = k;
        g = flag;
        a(context);
    }

    private void a(Context context)
    {
        d = context;
        com.facebook.ads.internal.dto.e.a(context);
        e = new b(context);
        f();
    }

    private void a(Map map, String s, String s1)
    {
        if (AdInternalSettings.shouldUseLiveRailEndpoint())
        {
            map.put((new StringBuilder("LR_")).append(s).toString(), s1);
            return;
        } else
        {
            map.put(s, s1);
            return;
        }
    }

    private static Map b(Context context)
    {
        HashMap hashmap = new HashMap();
        hashmap.put("VIEWABLE", "1");
        hashmap.put("SCHEMA", "json");
        hashmap.put("SDK", "android");
        hashmap.put("SDK_VERSION", "4.4.1");
        hashmap.put("LOCALE", Locale.getDefault().toString());
        float f1 = context.getResources().getDisplayMetrics().density;
        int k = context.getResources().getDisplayMetrics().widthPixels;
        int l = context.getResources().getDisplayMetrics().heightPixels;
        hashmap.put("DENSITY", String.valueOf(f1));
        hashmap.put("SCREEN_WIDTH", String.valueOf((int)((float)k / f1)));
        hashmap.put("SCREEN_HEIGHT", String.valueOf((int)((float)l / f1)));
        hashmap.put("IDFA", e.n);
        if (e.o)
        {
            context = "0";
        } else
        {
            context = "1";
        }
        hashmap.put("IDFA_FLAG", context);
        hashmap.put("ATTRIBUTION_ID", e.m);
        hashmap.put("OS", "Android");
        hashmap.put("OSVERS", com.facebook.ads.internal.dto.e.a);
        hashmap.put("BUNDLE", e.d);
        hashmap.put("APPNAME", com.facebook.ads.internal.dto.e.e);
        hashmap.put("APPVERS", com.facebook.ads.internal.dto.e.f);
        hashmap.put("APPBUILD", String.valueOf(e.g));
        hashmap.put("CARRIER", e.h);
        hashmap.put("MAKE", com.facebook.ads.internal.dto.e.b);
        hashmap.put("MODEL", com.facebook.ads.internal.dto.e.c);
        hashmap.put("COPPA", String.valueOf(AdSettings.isChildDirected()));
        hashmap.put("SDK_CAPABILITY", com.facebook.ads.internal.d.b());
        return hashmap;
    }

    private void f()
    {
        if (c == null)
        {
            c = a.a;
        }
        switch (com.facebook.ads.internal.dto._cls1.a[c.ordinal()])
        {
        default:
            b = AdPlacementType.UNKNOWN;
            return;

        case 1: // '\001'
            b = AdPlacementType.INTERSTITIAL;
            return;

        case 2: // '\002'
            b = AdPlacementType.BANNER;
            return;

        case 3: // '\003'
            b = AdPlacementType.NATIVE;
            break;
        }
    }

    public String a()
    {
        return a;
    }

    public a b()
    {
        return c;
    }

    public AdSize c()
    {
        return j;
    }

    public int d()
    {
        return i;
    }

    public Map e()
    {
        HashMap hashmap = new HashMap();
        a(hashmap, "PLACEMENT_ID", a);
        if (b != AdPlacementType.UNKNOWN)
        {
            a(hashmap, "PLACEMENT_TYPE", b.toString().toLowerCase());
        }
        java.util.Map.Entry entry;
        for (Iterator iterator = b(d).entrySet().iterator(); iterator.hasNext(); a(hashmap, (String)entry.getKey(), (String)entry.getValue()))
        {
            entry = (java.util.Map.Entry)iterator.next();
        }

        if (j != null)
        {
            a(hashmap, "WIDTH", String.valueOf(j.getWidth()));
            a(hashmap, "HEIGHT", String.valueOf(j.getHeight()));
        }
        a(hashmap, "ADAPTERS", com.facebook.ads.internal.adapters.f.a(b));
        if (f != null)
        {
            a(hashmap, "TEMPLATE_ID", String.valueOf(f.a()));
        }
        if (h != null)
        {
            a(hashmap, "REQUEST_TYPE", String.valueOf(h.a()));
        }
        if (g)
        {
            a(hashmap, "TEST_MODE", "1");
        }
        if (i != 0)
        {
            a(hashmap, "NUM_ADS_REQUESTED", String.valueOf(i));
        }
        a(hashmap, "CLIENT_EVENTS", com.facebook.ads.internal.util.c.a());
        return hashmap;
    }

    private class _cls1
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

}
