// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazon.device.associates;

import android.webkit.WebView;
import java.io.PrintStream;
import java.util.HashMap;

// Referenced classes of package com.amazon.device.associates:
//            bb, ah, i, p, 
//            bq

class ad
{

    ad()
    {
    }

    public static boolean a(WebView webview, String s)
    {
        i j;
        j = (i)((bb)ah.a(com/amazon/device/associates/bb)).j();
        if (s == null || s.trim().contentEquals(""))
        {
            p.c("OverrideLink", (new StringBuilder()).append("Invalid input parameter. Input url ").append(s).toString());
            return false;
        }
        s = s.trim();
        if (!a(s)) goto _L2; else goto _L1
_L1:
        if (!s.contains("amazon.com") || j == null) goto _L4; else goto _L3
_L3:
        System.out.println("Map received");
        if (j.a().containsKey(i.c))
        {
            webview = (String)j.a().get(i.c);
            p.c("OverrideLink", (new StringBuilder()).append("Parameter template: ").append(webview).toString());
        } else
        {
            webview = null;
        }
        if (webview == null) goto _L4; else goto _L5
_L5:
        s = bq.e(s);
        if (s.contains("?"))
        {
            webview = s.concat((new StringBuilder()).append("&").append(webview).toString());
        } else
        {
            webview = s.concat((new StringBuilder()).append("?").append(webview).toString());
        }
_L7:
        p.c("OverrideLink", (new StringBuilder()).append("Loading amazon url in browser with additional parameters: ").append(webview).toString());
        bq.d(webview);
        return true;
_L2:
        p.c("OverrideLink", (new StringBuilder()).append("Loading specified url in webview: ").append(s).toString());
        webview.loadUrl(s);
        return false;
_L4:
        webview = s;
        if (true) goto _L7; else goto _L6
_L6:
    }

    private static boolean a(String s)
    {
        return s != null && (s.matches("^((http|https)://)(www[.])?(amazon[.])(com|ca|cn|de|es|fr|it|in|co[.]jp|co[.]uk)(/)?.*") || s.matches("^((http|https)://)(www[.])?(myhabit|amazonwireless|amazonsupply)([.]com)(/)?.*"));
    }
}
