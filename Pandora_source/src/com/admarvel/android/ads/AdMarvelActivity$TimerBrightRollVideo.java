// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.admarvel.android.ads;

import android.os.Handler;
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
        if (admarvelactivity == null) goto _L2; else goto _L1
_L1:
        if (admarvelinternalwebview == null)
        {
            return;
        }
        AdMarvelVideoView admarvelvideoview = (AdMarvelVideoView)((RelativeLayout)admarvelactivity.findViewById(AdMarvelActivity.LAYOUT_VIEW_ID)).findViewWithTag((new StringBuilder(String.valueOf(AdMarvelActivity.access$5(admarvelactivity)))).append("BR_VIDEO").toString());
        if (admarvelinternalwebview == null || admarvelvideoview == null) goto _L4; else goto _L3
_L3:
        if (!admarvelactivity.isAdMarvelVideo) goto _L6; else goto _L5
_L5:
        if (AdMarvelActivity.access$33(admarvelactivity) != null && AdMarvelActivity.access$33(admarvelactivity).length() > 0)
        {
            admarvelinternalwebview.loadUrl((new StringBuilder("javascript:")).append(AdMarvelActivity.access$33(admarvelactivity)).append("(").append((float)admarvelvideoview.getCurrentPosition() / 1000F).append(")").toString());
        }
_L4:
        try
        {
            AdMarvelActivity.access$7(admarvelactivity).postDelayed(AdMarvelActivity.access$29(admarvelactivity), 1000L);
            return;
        }
        catch (Exception exception)
        {
            Logging.log(Log.getStackTraceString(exception));
        }
        return;
_L6:
        admarvelinternalwebview.loadUrl((new StringBuilder("javascript:AdApp.videoView().setCurrentTime(")).append(admarvelvideoview.getCurrentPosition() / 1000).append(")").toString());
        continue; /* Loop/switch isn't completed */
        Exception exception1;
        exception1;
        exception1.printStackTrace();
        if (true) goto _L4; else goto _L2
_L2:
    }

    public (AdMarvelActivity admarvelactivity, AdMarvelInternalWebView admarvelinternalwebview)
    {
        adMarvelActivityReference = new WeakReference(admarvelactivity);
        adMarvelInternalWebViewReference = new WeakReference(admarvelinternalwebview);
    }
}
