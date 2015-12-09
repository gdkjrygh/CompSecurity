// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.text.TextUtils;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.common.internal.y;
import java.net.URI;
import java.net.URISyntaxException;

// Referenced classes of package com.google.android.gms.internal:
//            zzfx, hs, ht

public class hz extends WebViewClient
{

    private final String a;
    private boolean b;
    private final hs c;
    private final zzfx d;

    public hz(zzfx zzfx1, hs hs1, String s)
    {
        a = b(s);
        b = false;
        c = hs1;
        d = zzfx1;
    }

    private String b(String s)
    {
        if (!TextUtils.isEmpty(s)) goto _L2; else goto _L1
_L1:
        return s;
_L2:
        if (!s.endsWith("/")) goto _L1; else goto _L3
_L3:
        String s1 = s.substring(0, s.length() - 1);
        return s1;
        IndexOutOfBoundsException indexoutofboundsexception;
        indexoutofboundsexception;
        zzb.e(indexoutofboundsexception.getMessage());
        return s;
    }

    protected boolean a(String s)
    {
        s = b(s);
        if (!TextUtils.isEmpty(s)) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        String s1;
        Object obj;
        Object obj1;
        try
        {
            obj = new URI(s);
            if (!"passback".equals(((URI) (obj)).getScheme()))
            {
                continue; /* Loop/switch isn't completed */
            }
            zzb.zzaC("Passback received");
            d.b();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            zzb.e(s.getMessage());
            return false;
        }
        return true;
        if (TextUtils.isEmpty(a)) goto _L1; else goto _L3
_L3:
        obj1 = new URI(a);
        s = ((URI) (obj1)).getHost();
        s1 = ((URI) (obj)).getHost();
        obj1 = ((URI) (obj1)).getPath();
        obj = ((URI) (obj)).getPath();
        if (!y.a(s, s1) || !y.a(obj1, obj)) goto _L1; else goto _L4
_L4:
        zzb.zzaC("Passback received");
        d.b();
        return true;
    }

    public void onLoadResource(WebView webview, String s)
    {
        zzb.zzaC((new StringBuilder()).append("JavascriptAdWebViewClient::onLoadResource: ").append(s).toString());
        if (!a(s))
        {
            c.i().onLoadResource(c.getWebView(), s);
        }
    }

    public void onPageFinished(WebView webview, String s)
    {
        zzb.zzaC((new StringBuilder()).append("JavascriptAdWebViewClient::onPageFinished: ").append(s).toString());
        if (!b)
        {
            d.a();
            b = true;
        }
    }

    public boolean shouldOverrideUrlLoading(WebView webview, String s)
    {
        zzb.zzaC((new StringBuilder()).append("JavascriptAdWebViewClient::shouldOverrideUrlLoading: ").append(s).toString());
        if (a(s))
        {
            zzb.zzaC("shouldOverrideUrlLoading: received passback url");
            return true;
        } else
        {
            return c.i().shouldOverrideUrlLoading(c.getWebView(), s);
        }
    }
}
