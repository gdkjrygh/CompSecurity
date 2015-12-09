// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.text.TextUtils;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.common.internal.zzu;
import java.net.URI;
import java.net.URISyntaxException;

// Referenced classes of package com.google.android.gms.internal:
//            zzgd, zzge, zzec

public class zzgl extends WebViewClient
{

    private final String zzDF;
    private boolean zzDG;
    private final zzec zzDH;
    private final zzgd zznp;

    public zzgl(zzec zzec1, zzgd zzgd1, String s)
    {
        zzDF = zzas(s);
        zzDG = false;
        zznp = zzgd1;
        zzDH = zzec1;
    }

    private String zzas(String s)
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
        zzb.zzak(indexoutofboundsexception.getMessage());
        return s;
    }

    public void onLoadResource(WebView webview, String s)
    {
        zzb.zzaj((new StringBuilder()).append("JavascriptAdWebViewClient::onLoadResource: ").append(s).toString());
        if (!zzar(s))
        {
            zznp.zzft().onLoadResource(zznp.getWebView(), s);
        }
    }

    public void onPageFinished(WebView webview, String s)
    {
        zzb.zzaj((new StringBuilder()).append("JavascriptAdWebViewClient::onPageFinished: ").append(s).toString());
        if (!zzDG)
        {
            zzDH.zzec();
            zzDG = true;
        }
    }

    public boolean shouldOverrideUrlLoading(WebView webview, String s)
    {
        zzb.zzaj((new StringBuilder()).append("JavascriptAdWebViewClient::shouldOverrideUrlLoading: ").append(s).toString());
        if (zzar(s))
        {
            zzb.zzaj("shouldOverrideUrlLoading: received passback url");
            return true;
        } else
        {
            return zznp.zzft().shouldOverrideUrlLoading(zznp.getWebView(), s);
        }
    }

    protected boolean zzar(String s)
    {
        s = zzas(s);
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
            zzb.zzaj("Passback received");
            zzDH.zzed();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            zzb.zzak(s.getMessage());
            return false;
        }
        return true;
        if (TextUtils.isEmpty(zzDF)) goto _L1; else goto _L3
_L3:
        obj1 = new URI(zzDF);
        s = ((URI) (obj1)).getHost();
        s1 = ((URI) (obj)).getHost();
        obj1 = ((URI) (obj1)).getPath();
        obj = ((URI) (obj)).getPath();
        if (!zzu.equal(s, s1) || !zzu.equal(obj1, obj)) goto _L1; else goto _L4
_L4:
        zzb.zzaj("Passback received");
        zzDH.zzed();
        return true;
    }
}
