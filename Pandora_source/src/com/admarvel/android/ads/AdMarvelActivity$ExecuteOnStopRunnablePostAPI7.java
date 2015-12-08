// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.admarvel.android.ads;

import android.os.Handler;
import android.os.PowerManager;
import android.util.Log;
import android.widget.RelativeLayout;
import com.admarvel.android.util.Logging;

// Referenced classes of package com.admarvel.android.ads:
//            AdMarvelActivity, AdMarvelInternalWebView, AdMarvelVideoView

private class <init>
    implements Runnable
{

    final AdMarvelActivity this$0;

    public void run()
    {
        Object obj = (PowerManager)getSystemService("power");
        if (isFinishing() || obj == null)
        {
            break MISSING_BLOCK_LABEL_329;
        }
        if (!((PowerManager) (obj)).isScreenOn())
        {
            break MISSING_BLOCK_LABEL_329;
        }
        obj = (RelativeLayout)findViewById(AdMarvelActivity.LAYOUT_VIEW_ID);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_160;
        }
        AdMarvelInternalWebView admarvelinternalwebview;
        try
        {
            admarvelinternalwebview = (AdMarvelInternalWebView)((RelativeLayout) (obj)).findViewWithTag((new StringBuilder(String.valueOf(AdMarvelActivity.access$5(AdMarvelActivity.this)))).append("WEBVIEW").toString());
        }
        catch (Exception exception)
        {
            Logging.log(Log.getStackTraceString(exception));
            AdMarvelActivity.access$19(AdMarvelActivity.this).sendEmptyMessage(0);
            return;
        }
        if (admarvelinternalwebview == null)
        {
            break MISSING_BLOCK_LABEL_160;
        }
        if (!admarvelinternalwebview.isSignalShutdown() && admarvelinternalwebview.visibilityCallback != null && admarvelinternalwebview.visibilityCallback.length() > 0 && admarvelinternalwebview.isViewDisplayed)
        {
            admarvelinternalwebview.injectJavaScript((new StringBuilder(String.valueOf(admarvelinternalwebview.visibilityCallback))).append("(").append(false).append(")").toString());
            admarvelinternalwebview.isViewDisplayed = false;
        }
        if (!isAdMarvelVideo || (AdMarvelVideoView)((RelativeLayout)findViewById(AdMarvelActivity.LAYOUT_VIEW_ID)).findViewWithTag((new StringBuilder(String.valueOf(AdMarvelActivity.access$5(AdMarvelActivity.this)))).append("BR_VIDEO").toString()) == null || !AdMarvelActivity.access$20(AdMarvelActivity.this))
        {
            break MISSING_BLOCK_LABEL_329;
        }
        if (interstitialCloseCallback == null || interstitialCloseCallback.length() <= 0 || obj == null)
        {
            break MISSING_BLOCK_LABEL_322;
        }
        obj = (AdMarvelInternalWebView)((RelativeLayout) (obj)).findViewWithTag((new StringBuilder(String.valueOf(AdMarvelActivity.access$5(AdMarvelActivity.this)))).append("WEBVIEW").toString());
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_322;
        }
        ((AdMarvelInternalWebView) (obj)).loadUrl((new StringBuilder("javascript:")).append(interstitialCloseCallback).append("()").toString());
        closeActivity();
    }

    private ()
    {
        this$0 = AdMarvelActivity.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
