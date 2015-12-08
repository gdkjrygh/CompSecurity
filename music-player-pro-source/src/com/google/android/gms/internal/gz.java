// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.text.TextUtils;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.net.URI;
import java.net.URISyntaxException;

// Referenced classes of package com.google.android.gms.internal:
//            gr, fb, jv, gu, 
//            gv

public class gz extends WebViewClient
{

    private final gu mo;
    private final String xr;
    private boolean xs;
    private final fb xt;

    public gz(fb fb1, gu gu1, String s)
    {
        xr = Z(s);
        xs = false;
        mo = gu1;
        xt = fb1;
    }

    private String Z(String s)
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
        gr.T(indexoutofboundsexception.getMessage());
        return s;
    }

    protected boolean Y(String s)
    {
        s = Z(s);
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
            gr.S("Passback received");
            xt.cG();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            gr.T(s.getMessage());
            return false;
        }
        return true;
        if (TextUtils.isEmpty(xr)) goto _L1; else goto _L3
_L3:
        obj1 = new URI(xr);
        s = ((URI) (obj1)).getHost();
        s1 = ((URI) (obj)).getHost();
        obj1 = ((URI) (obj1)).getPath();
        obj = ((URI) (obj)).getPath();
        if (!jv.equal(s, s1) || !jv.equal(obj1, obj)) goto _L1; else goto _L4
_L4:
        gr.S("Passback received");
        xt.cG();
        return true;
    }

    public void onLoadResource(WebView webview, String s)
    {
        gr.S((new StringBuilder()).append("JavascriptAdWebViewClient::onLoadResource: ").append(s).toString());
        if (!Y(s))
        {
            mo.dD().onLoadResource(mo, s);
        }
    }

    public void onPageFinished(WebView webview, String s)
    {
        gr.S((new StringBuilder()).append("JavascriptAdWebViewClient::onPageFinished: ").append(s).toString());
        if (!xs)
        {
            xt.cF();
            xs = true;
        }
    }

    public boolean shouldOverrideUrlLoading(WebView webview, String s)
    {
        gr.S((new StringBuilder()).append("JavascriptAdWebViewClient::shouldOverrideUrlLoading: ").append(s).toString());
        if (Y(s))
        {
            gr.S("shouldOverrideUrlLoading: received passback url");
            return true;
        } else
        {
            return mo.dD().shouldOverrideUrlLoading(mo, s);
        }
    }
}
