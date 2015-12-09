// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.admarvel.android.ads;

import android.widget.RelativeLayout;
import com.admarvel.android.util.Logging;
import java.lang.ref.WeakReference;

// Referenced classes of package com.admarvel.android.ads:
//            AdMarvelInternalWebViewPrivateListener, AdMarvelActivity, AdMarvelInternalWebView

private static class adMarvelActivityReference
    implements AdMarvelInternalWebViewPrivateListener
{

    private final WeakReference adMarvelActivityReference;

    public void onCloseInAppBrowser(String s)
    {
        Object obj = (AdMarvelActivity)adMarvelActivityReference.get();
        if (obj != null)
        {
            if ((obj = (RelativeLayout)((AdMarvelActivity) (obj)).findViewById(AdMarvelActivity.LAYOUT_VIEW_ID)) != null && ((s = (AdMarvelInternalWebView)((RelativeLayout) (obj)).findViewWithTag((new StringBuilder(String.valueOf(s))).append("WEBVIEW").toString())) != null && !s.isSignalShutdown() && ((AdMarvelInternalWebView) (s)).mInAppBrowserCloseCallback != null && ((AdMarvelInternalWebView) (s)).mInAppBrowserCloseCallback.length() > 0))
            {
                s.loadUrl((new StringBuilder("javascript:")).append(((AdMarvelInternalWebView) (s)).mInAppBrowserCloseCallback).append("()").toString());
                return;
            }
        }
    }

    public void onCloseTwoPartExpand()
    {
        Logging.log("AdMarvelActivity: Closing two part expand");
    }

    public (AdMarvelActivity admarvelactivity)
    {
        adMarvelActivityReference = new WeakReference(admarvelactivity);
    }
}
