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
//            eu, do, hk, ex, 
//            ey

public class fc extends WebViewClient
{

    private final ex lN;
    private final String sT;
    private boolean sU;
    private final do sV;

    public fc(do do1, ex ex1, String s)
    {
        sT = G(s);
        sU = false;
        lN = ex1;
        sV = do1;
    }

    private String G(String s)
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
        eu.A(indexoutofboundsexception.getMessage());
        return s;
    }

    protected boolean F(String s)
    {
        s = G(s);
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
            eu.z("Passback received");
            sV.bp();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            eu.A(s.getMessage());
            return false;
        }
        return true;
        if (TextUtils.isEmpty(sT)) goto _L1; else goto _L3
_L3:
        obj1 = new URI(sT);
        s = ((URI) (obj1)).getHost();
        s1 = ((URI) (obj)).getHost();
        obj1 = ((URI) (obj1)).getPath();
        obj = ((URI) (obj)).getPath();
        if (!hk.equal(s, s1) || !hk.equal(obj1, obj)) goto _L1; else goto _L4
_L4:
        eu.z("Passback received");
        sV.bp();
        return true;
    }

    public void onLoadResource(WebView webview, String s)
    {
        eu.z((new StringBuilder()).append("JavascriptAdWebViewClient::onLoadResource: ").append(s).toString());
        if (!F(s))
        {
            lN.cb().onLoadResource(lN, s);
        }
    }

    public void onPageFinished(WebView webview, String s)
    {
        eu.z((new StringBuilder()).append("JavascriptAdWebViewClient::onPageFinished: ").append(s).toString());
        if (!sU)
        {
            sV.bo();
            sU = true;
        }
    }

    public boolean shouldOverrideUrlLoading(WebView webview, String s)
    {
        eu.z((new StringBuilder()).append("JavascriptAdWebViewClient::shouldOverrideUrlLoading: ").append(s).toString());
        if (F(s))
        {
            eu.z("shouldOverrideUrlLoading: received passback url");
            return true;
        } else
        {
            return lN.cb().shouldOverrideUrlLoading(lN, s);
        }
    }
}
