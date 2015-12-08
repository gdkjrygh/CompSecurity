// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.admarvel.android.ads;

import android.content.Context;
import android.graphics.Rect;
import android.os.Handler;
import android.os.SystemClock;
import com.admarvel.android.util.Logging;
import java.lang.ref.WeakReference;

// Referenced classes of package com.admarvel.android.ads:
//            AdMarvelInternalWebView, AdMarvelWebView

private class adMarvelWebViewReference
    implements Runnable
{

    private long CALLBACK_TIME_INTERVAL;
    private final WeakReference adMarvelInternalWebViewReference;
    private final WeakReference adMarvelWebViewReference;
    private Rect adViewRect;
    private boolean isVisible;
    private boolean lastVisibleSatatus;
    final AdMarvelInternalWebView this$0;

    public void run()
    {
        AdMarvelInternalWebView admarvelinternalwebview;
        Object obj;
        obj = (AdMarvelWebView)adMarvelWebViewReference.get();
        for (admarvelinternalwebview = (AdMarvelInternalWebView)adMarvelInternalWebViewReference.get(); admarvelinternalwebview == null || obj == null || AdMarvelInternalWebView.access$2(admarvelinternalwebview);)
        {
            return;
        }

        if (((AdMarvelWebView) (obj)).getHeight() == 0 && lastVisibleSatatus != isVisible && !isViewDisplayed)
        {
            isViewDisplayed = true;
            String s1 = (new StringBuilder("javascript:")).append(visibilityCallback).append("(").append(true).append(")").toString();
            Logging.log(s1);
            loadUrl(s1);
            lastVisibleSatatus = isVisible;
        }
        if (obj == null || !((AdMarvelWebView) (obj)).getLocalVisibleRect(adViewRect) || isVisible || isViewDisplayed) goto _L2; else goto _L1
_L1:
        isVisible = true;
        isViewDisplayed = true;
        if (visibilityCallback != null)
        {
            obj = (new StringBuilder("javascript:")).append(visibilityCallback).append("(").append(true).append(")").toString();
            Logging.log(((String) (obj)));
            loadUrl(((String) (obj)));
        }
_L4:
        AdMarvelInternalWebView.access$9(admarvelinternalwebview).removeCallbacks(this);
        AdMarvelInternalWebView.access$9(admarvelinternalwebview).postAtTime(this, SystemClock.uptimeMillis() + CALLBACK_TIME_INTERVAL);
        return;
_L2:
        if (obj != null && !((AdMarvelWebView) (obj)).getLocalVisibleRect(adViewRect) && isVisible && isViewDisplayed)
        {
            isViewDisplayed = false;
            isVisible = false;
            String s = (new StringBuilder("javascript:")).append(visibilityCallback).append("(").append(false).append(")").toString();
            Logging.log(s);
            loadUrl(s);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public (AdMarvelInternalWebView admarvelinternalwebview1, Context context, AdMarvelWebView admarvelwebview)
    {
        this$0 = AdMarvelInternalWebView.this;
        super();
        CALLBACK_TIME_INTERVAL = 500L;
        isVisible = false;
        lastVisibleSatatus = true;
        adViewRect = new Rect();
        adMarvelInternalWebViewReference = new WeakReference(admarvelinternalwebview1);
        adMarvelWebViewReference = new WeakReference(admarvelwebview);
    }
}
