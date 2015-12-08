// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.text.TextUtils;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.common.internal.n;
import java.net.URI;
import java.net.URISyntaxException;

// Referenced classes of package com.google.android.gms.internal:
//            gs, fc, gv, gw

public class ha extends WebViewClient
{

    private final gv md;
    private final String xc;
    private boolean xd;
    private final fc xe;

    public ha(fc fc1, gv gv1, String s)
    {
        xc = Z(s);
        xd = false;
        md = gv1;
        xe = fc1;
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
        gs.T(indexoutofboundsexception.getMessage());
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
            gs.S("Passback received");
            xe.cz();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            gs.T(s.getMessage());
            return false;
        }
        return true;
        if (TextUtils.isEmpty(xc)) goto _L1; else goto _L3
_L3:
        obj1 = new URI(xc);
        s = ((URI) (obj1)).getHost();
        s1 = ((URI) (obj)).getHost();
        obj1 = ((URI) (obj1)).getPath();
        obj = ((URI) (obj)).getPath();
        if (!n.equal(s, s1) || !n.equal(obj1, obj)) goto _L1; else goto _L4
_L4:
        gs.S("Passback received");
        xe.cz();
        return true;
    }

    public void onLoadResource(WebView webview, String s)
    {
        gs.S((new StringBuilder()).append("JavascriptAdWebViewClient::onLoadResource: ").append(s).toString());
        if (!Y(s))
        {
            md.du().onLoadResource(md, s);
        }
    }

    public void onPageFinished(WebView webview, String s)
    {
        gs.S((new StringBuilder()).append("JavascriptAdWebViewClient::onPageFinished: ").append(s).toString());
        if (!xd)
        {
            xe.cy();
            xd = true;
        }
    }

    public boolean shouldOverrideUrlLoading(WebView webview, String s)
    {
        gs.S((new StringBuilder()).append("JavascriptAdWebViewClient::shouldOverrideUrlLoading: ").append(s).toString());
        if (Y(s))
        {
            gs.S("shouldOverrideUrlLoading: received passback url");
            return true;
        } else
        {
            return md.du().shouldOverrideUrlLoading(md, s);
        }
    }
}
