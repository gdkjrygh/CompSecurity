// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.admarvel.android.ads;

import android.os.Handler;
import android.os.Message;
import android.widget.RelativeLayout;
import com.admarvel.android.util.Logging;
import java.lang.ref.WeakReference;

// Referenced classes of package com.admarvel.android.ads:
//            AdMarvelActivity, AdMarvelInterstitialAds, AdMarvelInterstitialAdListenerImpl, AdMarvelInternalWebView

class this._cls0 extends Handler
{

    final AdMarvelActivity this$0;

    public void handleMessage(Message message)
    {
        if (progressDialogReference == null) goto _L2; else goto _L1
_L1:
        message = (MarvelProgressDialog)progressDialogReference.get();
_L4:
        if (message == null)
        {
            break MISSING_BLOCK_LABEL_36;
        }
        message.signalShutdown();
        message.dismiss();
        if (!AdMarvelActivity.access$2(AdMarvelActivity.this))
        {
            break MISSING_BLOCK_LABEL_205;
        }
        message = AdMarvelActivity.this;
        AdMarvelActivity.access$4(message, AdMarvelActivity.access$3(message) + 1);
        if (!AdMarvelInterstitialAds.getListener().onCloseInterstitialAd())
        {
            finish();
        }
        if (interstitialCloseCallback == null || interstitialCloseCallback.length() <= 0)
        {
            break MISSING_BLOCK_LABEL_186;
        }
        message = (RelativeLayout)findViewById(AdMarvelActivity.LAYOUT_VIEW_ID);
        if (message == null)
        {
            break MISSING_BLOCK_LABEL_186;
        }
        message = (AdMarvelInternalWebView)message.findViewWithTag((new StringBuilder(String.valueOf(AdMarvelActivity.access$5(AdMarvelActivity.this)))).append("WEBVIEW").toString());
        if (message == null)
        {
            break MISSING_BLOCK_LABEL_186;
        }
        message.loadUrl((new StringBuilder("javascript:")).append(interstitialCloseCallback).append("()").toString());
        if (AdMarvelActivity.access$3(AdMarvelActivity.this) > 2)
        {
            finish();
            return;
        }
        break MISSING_BLOCK_LABEL_236;
        try
        {
            finish();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Message message)
        {
            Logging.log((new StringBuilder("Nullpointer exception occured in close")).append(message.getMessage()).toString());
        }
        return;
_L2:
        message = null;
        if (true) goto _L4; else goto _L3
_L3:
    }

    View()
    {
        this$0 = AdMarvelActivity.this;
        super();
    }
}
