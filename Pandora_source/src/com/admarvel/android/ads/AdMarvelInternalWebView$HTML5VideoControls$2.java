// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.admarvel.android.ads;

import android.app.Activity;
import android.view.View;
import java.lang.ref.WeakReference;

// Referenced classes of package com.admarvel.android.ads:
//            AdMarvelInternalWebView, AdMarvelActivity, AdMarvelInternalWebViewPrivateListener, AdMarvelInterstitialAds, 
//            AdMarvelInterstitialAdListenerImpl

class val.adMarvelInternalWebView
    implements android.view.oControls._cls2
{

    final val.adMarvelInternalWebView this$1;
    private final AdMarvelInternalWebView val$adMarvelInternalWebView;

    public void onClick(View view)
    {
        view = (Activity)cess._mth1(this._cls1.this).get();
        if (view != null && (view instanceof AdMarvelActivity))
        {
            AdMarvelActivity admarvelactivity = (AdMarvelActivity)view;
            if (admarvelactivity.isTwoPartExpandable())
            {
                if (AdMarvelInternalWebView.getListener(val$adMarvelInternalWebView.GUID) != null)
                {
                    AdMarvelInternalWebView.getListener(val$adMarvelInternalWebView.GUID).onCloseTwoPartExpand();
                }
                view.finish();
            } else
            {
                boolean flag = AdMarvelInterstitialAds.getListener().onCloseInterstitialAd();
                admarvelactivity.updateCloseInterstialAdCounter();
                if (admarvelactivity.interstitialCloseCallback != null && admarvelactivity.interstitialCloseCallback.length() > 0)
                {
                    val$adMarvelInternalWebView.loadUrl((new StringBuilder("javascript:")).append(admarvelactivity.interstitialCloseCallback).append("()").toString());
                }
                if (!flag)
                {
                    view.finish();
                }
                if (admarvelactivity.getAdCloseCount() > 2)
                {
                    admarvelactivity.finish();
                    return;
                }
            }
        }
    }

    ()
    {
        this$1 = final_;
        val$adMarvelInternalWebView = AdMarvelInternalWebView.this;
        super();
    }
}
