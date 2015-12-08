// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.advertising.android;

import android.text.TextUtils;
import java.net.URI;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

// Referenced classes of package com.microsoft.advertising.android:
//            AdWebView, av, ab, bx, 
//            h, ai, az, be, 
//            an, bb

private final class a
{

    Map a;
    final AdWebView b;
    private AdWebView c;

    private static Map a(String s)
    {
        HashMap hashmap = new HashMap();
        if (TextUtils.isEmpty(s)) goto _L2; else goto _L1
_L1:
        String as[];
        int j;
        as = s.split("\\&");
        j = as.length;
        int i = 0;
          goto _L3
_L7:
        s = as[i].split("\\=");
        if (s.length <= 0) goto _L5; else goto _L4
_L4:
        Object obj = s[0];
        String s1;
        try
        {
            if (s.length <= 1 || s[1].equalsIgnoreCase("undefined"))
            {
                break MISSING_BLOCK_LABEL_122;
            }
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            av.c("AdWebView", (new StringBuilder("There was an error parsing the querystring: ")).append(s.toString()).toString());
            return hashmap;
        }
        s1 = s[1];
        s = s1;
        if (s1.toLowerCase().contains("skype"))
        {
            s = s1.replace("+", "%2B");
        }
        s = URLDecoder.decode(s, "UTF-8");
_L6:
        hashmap.put(obj, s);
_L5:
        i++;
        continue; /* Loop/switch isn't completed */
        s = null;
          goto _L6
_L3:
        if (i < j) goto _L7; else goto _L2
_L2:
        return hashmap;
    }

    static void a(a a1, String s)
    {
        av.a("ormmaDispatch", (new StringBuilder("ormma operation: ")).append(s).toString());
        String s1;
        az az1;
        Map map;
        try
        {
            s = new URI(s);
            if (!"ormma".equalsIgnoreCase(s.getScheme()))
            {
                break MISSING_BLOCK_LABEL_547;
            }
            if (AdWebView.k(a1.b) != null)
            {
                AdWebView.k(a1.b).e_();
                AdWebView.l(a1.b);
            }
            s1 = s.getHost();
            if (TextUtils.isEmpty(s1))
            {
                break MISSING_BLOCK_LABEL_547;
            }
            if (AdWebView.m(a1.b) != null && s1.equalsIgnoreCase("adAnchorReady"))
            {
                AdWebView.m(a1.b).d_();
                AdWebView.n(a1.b);
            }
            map = a(s.getRawQuery());
            if (s1.equalsIgnoreCase("service"))
            {
                s1 = (String)map.get("name");
            }
            if (ab.a().b("webContainerEvents") && ("open".equalsIgnoreCase(s1) || "request".equals(s1)))
            {
                s = new h(a1.b.a, com.microsoft.advertising.android.a.);
                s.a("webContainerMethod", s1);
                s.a("webContainerMethodParams", new TreeMap(map));
                a1.b.j().b(s);
            }
            az1 = (az)a1.a.get(s1);
        }
        // Misplaced declaration of an exception variable
        catch (a a1)
        {
            av.c("AdWebView", (new StringBuilder("There was an error dispatching the operation: ")).append(a1.toString()).toString());
            return;
        }
        s = az1;
        if (az1 != null) goto _L2; else goto _L1
_L1:
        if (!s1.equalsIgnoreCase("setShakeProperties") && !s1.equalsIgnoreCase("tiltChange") && !s1.equalsIgnoreCase("shake") && !s1.equalsIgnoreCase("headingChange")) goto _L4; else goto _L3
_L3:
        AdWebView.a(a1.b, new be(a1.c));
        a1.a.put("setShakeProperties", AdWebView.i(a1.b));
        a1.a.put("tiltChange", AdWebView.i(a1.b));
        a1.a.put("shake", AdWebView.i(a1.b));
        a1.a.put("headingChange", AdWebView.i(a1.b));
        s = AdWebView.i(a1.b);
_L2:
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_433;
        }
        av.b("Flow", String.format("ExecuteOrmmaOperation: %s : %s", new Object[] {
            s1, map.toString()
        }));
        s.a(s1, map);
        a1.c.k().a(String.format("window.ormmaview.nativeCallComplete('%s');", new Object[] {
            s1
        }));
        return;
_L4:
        s = az1;
        if (s1.equalsIgnoreCase("locationChange"))
        {
            AdWebView.a(a1.b, new bb(a1.c));
            a1.a.put("locationChange", AdWebView.j(a1.b));
            s = AdWebView.j(a1.b);
        }
        if (true) goto _L2; else goto _L5
_L5:
    }

    public (AdWebView adwebview, AdWebView adwebview1)
    {
        b = adwebview;
        super();
        c = adwebview1;
        a = new HashMap();
        a.put("close", AdWebView.f(adwebview));
        a.put("expand", AdWebView.f(adwebview));
        a.put("open", AdWebView.f(adwebview));
        a.put("playAudio", AdWebView.f(adwebview));
        a.put("playVideo", AdWebView.f(adwebview));
        a.put("resize", AdWebView.f(adwebview));
        a.put("show", AdWebView.f(adwebview));
        a.put("useCustomClose", AdWebView.f(adwebview));
        a.put("locationChange", null);
        a.put("request", AdWebView.g(adwebview));
        a.put("setShakeProperties", null);
        a.put("tiltChange", null);
        a.put("shake", null);
        a.put("headingChange", null);
        a.put("adError", AdWebView.h(adwebview));
        a.put("ormmaLog", AdWebView.h(adwebview));
        a.put("publisherMessage", AdWebView.h(adwebview));
        a.put("setuserengaged", AdWebView.h(adwebview));
        a.put("addEventListener", AdWebView.h(adwebview));
        a.put("removeEventListener", AdWebView.h(adwebview));
    }
}
