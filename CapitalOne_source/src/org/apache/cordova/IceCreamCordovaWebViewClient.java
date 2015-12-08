// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.cordova;

import android.app.Activity;
import android.content.res.AssetManager;
import android.net.Uri;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import java.io.IOException;
import org.apache.cordova.api.CordovaInterface;
import org.apache.cordova.api.LOG;

// Referenced classes of package org.apache.cordova:
//            CordovaWebViewClient, CordovaWebView

public class IceCreamCordovaWebViewClient extends CordovaWebViewClient
{

    public IceCreamCordovaWebViewClient(CordovaInterface cordovainterface)
    {
        super(cordovainterface);
    }

    public IceCreamCordovaWebViewClient(CordovaInterface cordovainterface, CordovaWebView cordovawebview)
    {
        super(cordovainterface, cordovawebview);
    }

    private WebResourceResponse generateWebResourceResponse(String s)
    {
        String s1;
        if (!s.startsWith("file:///android_asset/"))
        {
            break MISSING_BLOCK_LABEL_120;
        }
        s1 = s.replaceFirst("file:///android_asset/", "");
        if (!s1.contains("?")) goto _L2; else goto _L1
_L1:
        s = s1.split("\\?")[0];
_L4:
        s1 = null;
        if (s.endsWith(".html"))
        {
            s1 = "text/html";
        }
        s = new WebResourceResponse(s1, "UTF-8", cordova.getActivity().getAssets().open(Uri.parse(s).getPath(), 2));
        return s;
_L2:
        s = s1;
        if (s1.contains("#"))
        {
            s = s1.split("#")[0];
        }
        if (true) goto _L4; else goto _L3
_L3:
        s;
        LOG.e("generateWebResourceResponse", s.getMessage(), s);
        return null;
    }

    public WebResourceResponse shouldInterceptRequest(WebView webview, String s)
    {
        if (s.contains("?") || s.contains("#"))
        {
            return generateWebResourceResponse(s);
        } else
        {
            return super.shouldInterceptRequest(webview, s);
        }
    }
}
