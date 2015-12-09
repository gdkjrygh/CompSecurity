// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.admarvel.android.ads;

import android.util.Log;
import android.widget.RelativeLayout;
import com.admarvel.android.util.Logging;
import java.lang.ref.WeakReference;

// Referenced classes of package com.admarvel.android.ads:
//            AdMarvelActivity, AdMarvelInternalWebView, AdMarvelVideoView

private static class adMarvelInternalWebViewReference
    implements Runnable
{

    private final WeakReference adMarvelActivityReference;
    private final WeakReference adMarvelInternalWebViewReference;

    public void run()
    {
        AdMarvelActivity admarvelactivity;
        AdMarvelInternalWebView admarvelinternalwebview;
        admarvelactivity = (AdMarvelActivity)adMarvelActivityReference.get();
        admarvelinternalwebview = (AdMarvelInternalWebView)adMarvelInternalWebViewReference.get();
        if (admarvelactivity == null)
        {
            break MISSING_BLOCK_LABEL_146;
        }
        if (admarvelinternalwebview == null)
        {
            return;
        }
        AdMarvelVideoView admarvelvideoview = (AdMarvelVideoView)((RelativeLayout)admarvelactivity.findViewById(AdMarvelActivity.LAYOUT_VIEW_ID)).findViewWithTag((new StringBuilder(String.valueOf(AdMarvelActivity.access$5(admarvelactivity)))).append("BR_VIDEO").toString());
        if (admarvelvideoview != null)
        {
            try
            {
                if (admarvelvideoview.isPlaying())
                {
                    admarvelvideoview.pause();
                    if (admarvelactivity.isAdMarvelVideo && AdMarvelActivity.access$32(admarvelactivity) != null && AdMarvelActivity.access$32(admarvelactivity).length() > 0)
                    {
                        admarvelinternalwebview.loadUrl((new StringBuilder("javascript:")).append(AdMarvelActivity.access$32(admarvelactivity)).append("()").toString());
                        return;
                    }
                }
            }
            catch (Exception exception)
            {
                Logging.log(Log.getStackTraceString(exception));
            }
        }
    }

    public (AdMarvelActivity admarvelactivity, AdMarvelInternalWebView admarvelinternalwebview)
    {
        adMarvelActivityReference = new WeakReference(admarvelactivity);
        adMarvelInternalWebViewReference = new WeakReference(admarvelinternalwebview);
    }
}
