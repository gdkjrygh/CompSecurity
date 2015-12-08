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
//            dw, ct, fo, dz, 
//            ea

public class ee extends WebViewClient
{

    private final dz lC;
    private final String rM;
    private boolean rN;
    private final ct rO;

    public ee(ct ct1, dz dz1, String s)
    {
        rM = B(s);
        rN = false;
        lC = dz1;
        rO = ct1;
    }

    private String B(String s)
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
        dw.w(indexoutofboundsexception.getMessage());
        return s;
    }

    protected boolean A(String s)
    {
        s = B(s);
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
            dw.v("Passback received");
            rO.bb();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            dw.w(s.getMessage());
            return false;
        }
        return true;
        if (TextUtils.isEmpty(rM)) goto _L1; else goto _L3
_L3:
        obj1 = new URI(rM);
        s = ((URI) (obj1)).getHost();
        s1 = ((URI) (obj)).getHost();
        obj1 = ((URI) (obj1)).getPath();
        obj = ((URI) (obj)).getPath();
        if (!fo.equal(s, s1) || !fo.equal(obj1, obj)) goto _L1; else goto _L4
_L4:
        dw.v("Passback received");
        rO.bb();
        return true;
    }

    public void onLoadResource(WebView webview, String s)
    {
        dw.v((new StringBuilder()).append("JavascriptAdWebViewClient::onLoadResource: ").append(s).toString());
        if (!A(s))
        {
            lC.bI().onLoadResource(lC, s);
        }
    }

    public void onPageFinished(WebView webview, String s)
    {
        dw.v((new StringBuilder()).append("JavascriptAdWebViewClient::onPageFinished: ").append(s).toString());
        if (!rN)
        {
            rO.ba();
            rN = true;
        }
    }

    public boolean shouldOverrideUrlLoading(WebView webview, String s)
    {
        dw.v((new StringBuilder()).append("JavascriptAdWebViewClient::shouldOverrideUrlLoading: ").append(s).toString());
        if (A(s))
        {
            dw.v("shouldOverrideUrlLoading: received passback url");
            return true;
        } else
        {
            return lC.bI().shouldOverrideUrlLoading(lC, s);
        }
    }
}
