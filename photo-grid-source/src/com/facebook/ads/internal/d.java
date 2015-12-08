// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads.internal;

import android.text.TextUtils;
import com.facebook.ads.internal.util.AdInternalSettings;
import org.json.JSONArray;

public final class d extends Enum
{

    public static final d a;
    public static final d b;
    public static final d c;
    public static final d d;
    public static final d e;
    public static final d f;
    public static final d g;
    public static final d h;
    public static final d i;
    public static final d j;
    public static final d k;
    public static final d l;
    private static final d n[];
    private static final String o;
    private static final String p;
    private static final d q[];
    private final int m;

    private d(String s, int i1, int j1)
    {
        super(s, i1);
        m = j1;
    }

    public static String b()
    {
        if (AdInternalSettings.shouldUseLiveRailEndpoint())
        {
            return p;
        } else
        {
            return o;
        }
    }

    public static String c()
    {
        return p;
    }

    public static d valueOf(String s)
    {
        return (d)Enum.valueOf(com/facebook/ads/internal/d, s);
    }

    public static d[] values()
    {
        return (d[])q.clone();
    }

    final int a()
    {
        return m;
    }

    public final String toString()
    {
        return String.valueOf(m);
    }

    static 
    {
        int i1 = 0;
        a = new d("APP_AD", 0, 0);
        b = new d("LINK_AD", 1, 1);
        c = new d("APP_AD_V2", 2, 2);
        d = new d("LINK_AD_V2", 3, 3);
        e = new d("APP_ENGAGEMENT_AD", 4, 4);
        f = new d("AD_CHOICES", 5, 5);
        g = new d("JS_TRIGGER", 6, 6);
        h = new d("JS_TRIGGER_NO_AUTO_IMP_LOGGING", 7, 7);
        i = new d("VIDEO_AD", 8, 8);
        j = new d("INLINE_VIDEO_AD", 9, 9);
        k = new d("BANNER_TO_INTERSTITIAL", 10, 10);
        l = new d("NATIVE_CLOSE_BUTTON", 11, 11);
        q = (new d[] {
            a, b, c, d, e, f, g, h, i, j, 
            k, l
        });
        n = (new d[] {
            d, e, f, h, l
        });
        JSONArray jsonarray = new JSONArray();
        d ad[] = n;
        for (int j1 = ad.length; i1 < j1; i1++)
        {
            jsonarray.put(ad[i1].a());
        }

        o = jsonarray.toString();
        p = TextUtils.join(",", n);
    }
}
