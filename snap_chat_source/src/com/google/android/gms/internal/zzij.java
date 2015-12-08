// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.text.TextUtils;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.common.internal.zzw;
import java.net.URI;
import java.net.URISyntaxException;

// Referenced classes of package com.google.android.gms.internal:
//            zzhx, zzic, zzid, zzfz

public class zzij extends WebViewClient
{

    private final String zzAp;
    private boolean zzAq;
    private final zzfz zzAr;
    private final zzic zzmu;

    public zzij(zzfz zzfz1, zzic zzic1, String s)
    {
        zzAp = zzag(s);
        zzAq = false;
        zzmu = zzic1;
        zzAr = zzfz1;
    }

    private String zzag(String s)
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
        zzhx.zzZ(indexoutofboundsexception.getMessage());
        return s;
    }

    public void onLoadResource(WebView webview, String s)
    {
        zzhx.zzY((new StringBuilder("JavascriptAdWebViewClient::onLoadResource: ")).append(s).toString());
        if (!zzaf(s))
        {
            zzmu.zzeG().onLoadResource(zzmu.getWebView(), s);
        }
    }

    public void onPageFinished(WebView webview, String s)
    {
        zzhx.zzY((new StringBuilder("JavascriptAdWebViewClient::onPageFinished: ")).append(s).toString());
        if (!zzAq)
        {
            zzAr.zzdC();
            zzAq = true;
        }
    }

    public boolean shouldOverrideUrlLoading(WebView webview, String s)
    {
        zzhx.zzY((new StringBuilder("JavascriptAdWebViewClient::shouldOverrideUrlLoading: ")).append(s).toString());
        if (zzaf(s))
        {
            zzhx.zzY("shouldOverrideUrlLoading: received passback url");
            return true;
        } else
        {
            return zzmu.zzeG().shouldOverrideUrlLoading(zzmu.getWebView(), s);
        }
    }

    protected boolean zzaf(String s)
    {
        s = zzag(s);
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
            zzhx.zzY("Passback received");
            zzAr.zzdD();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            zzhx.zzZ(s.getMessage());
            return false;
        }
        return true;
        if (TextUtils.isEmpty(zzAp)) goto _L1; else goto _L3
_L3:
        obj1 = new URI(zzAp);
        s = ((URI) (obj1)).getHost();
        s1 = ((URI) (obj)).getHost();
        obj1 = ((URI) (obj1)).getPath();
        obj = ((URI) (obj)).getPath();
        if (!zzw.equal(s, s1) || !zzw.equal(obj1, obj)) goto _L1; else goto _L4
_L4:
        zzhx.zzY("Passback received");
        zzAr.zzdD();
        return true;
    }
}
