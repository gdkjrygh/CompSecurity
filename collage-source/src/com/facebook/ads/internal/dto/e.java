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
import com.facebook.ads.internal.d;
import com.facebook.ads.internal.server.AdPlacementType;
import com.facebook.ads.internal.util.AdInternalSettings;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.facebook.ads.internal.dto:
//            b, f

public class e
{

    protected String a;
    protected AdPlacementType b;
    protected b c;
    public Context d;
    public com.facebook.ads.internal.e e;
    public boolean f;
    private c g;
    private int h;
    private AdSize i;

    public e(Context context, String s, AdSize adsize, com.facebook.ads.internal.e e1, c c1, int j, boolean flag)
    {
        a = s;
        i = adsize;
        e = e1;
        c = com.facebook.ads.internal.dto.b.a(e1);
        g = c1;
        h = j;
        f = flag;
        a(context);
    }

    private void a(Context context)
    {
        d = context;
        com.facebook.ads.internal.dto.f.a(context);
        f();
    }

    private void a(Map map, String s, String s1)
    {
        if (AdInternalSettings.shouldUseLiveRailEndpoint())
        {
            map.put((new StringBuilder()).append("LR_").append(s).toString(), s1);
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
        hashmap.put("SDK_VERSION", "4.6.0");
        hashmap.put("LOCALE", Locale.getDefault().toString());
        float f1 = context.getResources().getDisplayMetrics().density;
        int j = context.getResources().getDisplayMetrics().widthPixels;
        int k = context.getResources().getDisplayMetrics().heightPixels;
        hashmap.put("DENSITY", String.valueOf(f1));
        hashmap.put("SCREEN_WIDTH", String.valueOf((int)((float)j / f1)));
        hashmap.put("SCREEN_HEIGHT", String.valueOf((int)((float)k / f1)));
        hashmap.put("IDFA", f.n);
        if (f.o)
        {
            context = "0";
        } else
        {
            context = "1";
        }
        hashmap.put("IDFA_FLAG", context);
        hashmap.put("ATTRIBUTION_ID", f.m);
        hashmap.put("OS", "Android");
        hashmap.put("OSVERS", f.a);
        hashmap.put("BUNDLE", com.facebook.ads.internal.dto.f.d);
        hashmap.put("APPNAME", f.e);
        hashmap.put("APPVERS", com.facebook.ads.internal.dto.f.f);
        hashmap.put("APPBUILD", String.valueOf(f.g));
        hashmap.put("CARRIER", f.h);
        hashmap.put("MAKE", f.b);
        hashmap.put("MODEL", com.facebook.ads.internal.dto.f.c);
        hashmap.put("COPPA", String.valueOf(AdSettings.isChildDirected()));
        hashmap.put("SDK_CAPABILITY", com.facebook.ads.internal.d.b());
        return hashmap;
    }

    private void f()
    {
        if (c == null)
        {
            c = b.a;
        }
        static class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[com.facebook.ads.internal.dto.b.values().length];
                try
                {
                    a[com.facebook.ads.internal.dto.b.c.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[b.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[com.facebook.ads.internal.dto.b.d.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1.a[c.ordinal()])
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

    public b b()
    {
        return c;
    }

    public AdSize c()
    {
        return i;
    }

    public int d()
    {
        return h;
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

        if (i != null)
        {
            a(hashmap, "WIDTH", String.valueOf(i.getWidth()));
            a(hashmap, "HEIGHT", String.valueOf(i.getHeight()));
        }
        a(hashmap, "ADAPTERS", com.facebook.ads.internal.adapters.f.a(b));
        if (e != null)
        {
            a(hashmap, "TEMPLATE_ID", String.valueOf(e.a()));
        }
        if (g != null)
        {
            a(hashmap, "REQUEST_TYPE", String.valueOf(g.a()));
        }
        if (f)
        {
            a(hashmap, "TEST_MODE", "1");
        }
        if (h != 0)
        {
            a(hashmap, "NUM_ADS_REQUESTED", String.valueOf(h));
        }
        a(hashmap, "CLIENT_EVENTS", com.facebook.ads.internal.util.c.a());
        return hashmap;
    }
}
