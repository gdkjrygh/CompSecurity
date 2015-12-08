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
//            ev, dp, hl, ey, 
//            ez

public class fd extends WebViewClient
{

    private final ey lL;
    private final String sQ;
    private boolean sR;
    private final dp sS;

    public fd(dp dp1, ey ey1, String s)
    {
        sQ = G(s);
        sR = false;
        lL = ey1;
        sS = dp1;
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
        ev.A(indexoutofboundsexception.getMessage());
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
            ev.z("Passback received");
            sS.bk();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            ev.A(s.getMessage());
            return false;
        }
        return true;
        if (TextUtils.isEmpty(sQ)) goto _L1; else goto _L3
_L3:
        obj1 = new URI(sQ);
        s = ((URI) (obj1)).getHost();
        s1 = ((URI) (obj)).getHost();
        obj1 = ((URI) (obj1)).getPath();
        obj = ((URI) (obj)).getPath();
        if (!hl.equal(s, s1) || !hl.equal(obj1, obj)) goto _L1; else goto _L4
_L4:
        ev.z("Passback received");
        sS.bk();
        return true;
    }

    public void onLoadResource(WebView webview, String s)
    {
        ev.z((new StringBuilder()).append("JavascriptAdWebViewClient::onLoadResource: ").append(s).toString());
        if (!F(s))
        {
            lL.bW().onLoadResource(lL, s);
        }
    }

    public void onPageFinished(WebView webview, String s)
    {
        ev.z((new StringBuilder()).append("JavascriptAdWebViewClient::onPageFinished: ").append(s).toString());
        if (!sR)
        {
            sS.bj();
            sR = true;
        }
    }

    public boolean shouldOverrideUrlLoading(WebView webview, String s)
    {
        ev.z((new StringBuilder()).append("JavascriptAdWebViewClient::shouldOverrideUrlLoading: ").append(s).toString());
        if (F(s))
        {
            ev.z("shouldOverrideUrlLoading: received passback url");
            return true;
        } else
        {
            return lL.bW().shouldOverrideUrlLoading(lL, s);
        }
    }
}
