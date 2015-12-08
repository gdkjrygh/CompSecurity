// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.admarvel.android.ads;

import java.lang.ref.WeakReference;

// Referenced classes of package com.admarvel.android.ads:
//            AdMarvelInternalWebViewPrivateListener, AdMarvelWebView, AdMarvelInternalWebView, AdMarvelWebViewListener

private static class adMarvelWebViewReference
    implements AdMarvelInternalWebViewPrivateListener
{

    private final WeakReference adMarvelWebViewReference;

    public void onCloseInAppBrowser(String s)
    {
        AdMarvelWebView admarvelwebview = (AdMarvelWebView)adMarvelWebViewReference.get();
        if (admarvelwebview != null)
        {
            if ((s = (AdMarvelInternalWebView)admarvelwebview.findViewWithTag((new StringBuilder(String.valueOf(s))).append("INTERNAL").toString())) != null && ((AdMarvelInternalWebView) (s)).mInAppBrowserCloseCallback != null && ((AdMarvelInternalWebView) (s)).mInAppBrowserCloseCallback.length() > 0)
            {
                s.loadUrl((new StringBuilder("javascript:")).append(((AdMarvelInternalWebView) (s)).mInAppBrowserCloseCallback).append("()").toString());
                return;
            }
        }
    }

    public void onCloseTwoPartExpand()
    {
        AdMarvelWebView admarvelwebview = (AdMarvelWebView)adMarvelWebViewReference.get();
        AdMarvelInternalWebView admarvelinternalwebview;
        if (admarvelwebview != null)
        {
            if ((admarvelinternalwebview = (AdMarvelInternalWebView)admarvelwebview.findViewWithTag((new StringBuilder(String.valueOf(admarvelwebview.GUID))).append("INTERNAL").toString())) != null)
            {
                AdMarvelWebView.access$30(admarvelwebview, false);
                AdMarvelWebView.access$31(admarvelwebview, false);
                if (AdMarvelWebView.getListener(admarvelwebview.GUID) != null)
                {
                    AdMarvelWebView.getListener(admarvelwebview.GUID).onClose();
                }
                if (admarvelwebview.mCloseCallback != null)
                {
                    admarvelinternalwebview.loadUrl((new StringBuilder("javascript:")).append(admarvelwebview.mCloseCallback).append("()").toString());
                    return;
                }
            }
        }
    }

    public (AdMarvelWebView admarvelwebview)
    {
        adMarvelWebViewReference = new WeakReference(admarvelwebview);
    }
}
