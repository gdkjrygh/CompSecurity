// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.admarvel.android.ads;

import android.app.Activity;
import android.view.View;
import java.lang.ref.WeakReference;

// Referenced classes of package com.admarvel.android.ads:
//            FullScreenControls, AdMarvelActivity, AdMarvelInterstitialAds, AdMarvelInterstitialAdListenerImpl, 
//            AdMarvelInternalWebView, AdMarvelInternalWebViewPrivateListener

class this._cls0
    implements android.view.nControls._cls1
{

    final FullScreenControls this$0;

    public void onClick(View view)
    {
        view = (Activity)FullScreenControls.access$0(FullScreenControls.this).get();
        if (view != null && (view instanceof AdMarvelActivity))
        {
            view = (AdMarvelActivity)view;
            if (view.isInterstitial())
            {
                AdMarvelInterstitialAds.getListener().onCloseInterstitialAd();
            } else
            {
                view.finish();
            }
            if (AdMarvelInternalWebView.getListener(GUID) != null)
            {
                AdMarvelInternalWebView.getListener(GUID).onCloseInAppBrowser(GUID);
            }
        }
    }

    ewPrivateListener()
    {
        this$0 = FullScreenControls.this;
        super();
    }
}
