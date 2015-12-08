// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.cordova;

import android.net.Uri;
import android.webkit.WebResourceResponse;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.xwalk.core.XWalkView;

// Referenced classes of package org.apache.cordova:
//            CordovaWebViewClient, CordovaWebView, Whitelist, CordovaResourceApi, 
//            LOG, CordovaUriHelper, CordovaInterface

public class IceCreamCordovaWebViewClient extends CordovaWebViewClient
{

    private static final String TAG = "IceCreamCordovaWebViewClient";
    private CordovaUriHelper helper;

    public IceCreamCordovaWebViewClient(CordovaInterface cordovainterface)
    {
        super(cordovainterface);
    }

    public IceCreamCordovaWebViewClient(CordovaInterface cordovainterface, CordovaWebView cordovawebview)
    {
        super(cordovainterface, cordovawebview);
    }

    private boolean isUrlHarmful(String s)
    {
        return (s.startsWith("http:") || s.startsWith("https:")) && !appView.getWhitelist().isUrlWhiteListed(s) || s.contains("app_webview");
    }

    private static boolean needsKitKatContentUrlFix(Uri uri)
    {
        return android.os.Build.VERSION.SDK_INT >= 19 && "content".equals(uri.getScheme());
    }

    private static boolean needsSpecialsInAssetUrlFix(Uri uri)
    {
        if (CordovaResourceApi.getUriType(uri) == 1)
        {
            if (uri.getQuery() != null || uri.getFragment() != null)
            {
                return true;
            }
            if (uri.toString().contains("%"))
            {
                switch (android.os.Build.VERSION.SDK_INT)
                {
                default:
                    return false;

                case 14: // '\016'
                case 15: // '\017'
                    return true;
                }
            }
        }
        return false;
    }

    public WebResourceResponse shouldInterceptLoadRequest(XWalkView xwalkview, String s)
    {
label0:
        {
            try
            {
                if (isUrlHarmful(s))
                {
                    LOG.w("IceCreamCordovaWebViewClient", (new StringBuilder()).append("URL blocked by whitelist: ").append(s).toString());
                    return new WebResourceResponse("text/plain", "UTF-8", null);
                }
                xwalkview = appView.getResourceApi();
                s = Uri.parse(s);
                Uri uri = xwalkview.remapUri(s);
                if (s.equals(uri) && !needsSpecialsInAssetUrlFix(s) && !needsKitKatContentUrlFix(s))
                {
                    break label0;
                }
                xwalkview = xwalkview.openForRead(uri, true);
                xwalkview = new WebResourceResponse(((CordovaResourceApi.OpenForReadResult) (xwalkview)).mimeType, "UTF-8", ((CordovaResourceApi.OpenForReadResult) (xwalkview)).inputStream);
            }
            // Misplaced declaration of an exception variable
            catch (XWalkView xwalkview)
            {
                if (!(xwalkview instanceof FileNotFoundException))
                {
                    LOG.e("IceCreamCordovaWebViewClient", "Error occurred while loading a file (returning a 404).", xwalkview);
                }
                return new WebResourceResponse("text/plain", "UTF-8", null);
            }
            return xwalkview;
        }
        return null;
    }
}
