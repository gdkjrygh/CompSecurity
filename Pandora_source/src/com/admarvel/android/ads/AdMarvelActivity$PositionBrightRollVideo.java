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

private static class hRatio
    implements Runnable
{

    private final WeakReference adMarvelActivityReference;
    private final WeakReference adMarvelInternalWebViewReference;
    private float hRatio;
    private float wRatio;
    private float xRatio;
    private float yRatio;

    public void run()
    {
        Object obj;
        AdMarvelActivity admarvelactivity;
        admarvelactivity = (AdMarvelActivity)adMarvelActivityReference.get();
        obj = (AdMarvelInternalWebView)adMarvelInternalWebViewReference.get();
        if (admarvelactivity == null)
        {
            break MISSING_BLOCK_LABEL_185;
        }
        if (obj == null)
        {
            return;
        }
        RelativeLayout relativelayout;
        ((AdMarvelInternalWebView) (obj)).loadUrl("javascript:console.log(\"Window Innerwidth \"+window.innerWidth);");
        relativelayout = (RelativeLayout)admarvelactivity.findViewById(AdMarvelActivity.LAYOUT_VIEW_ID);
        obj = null;
        if (relativelayout == null)
        {
            break MISSING_BLOCK_LABEL_84;
        }
        obj = (AdMarvelVideoView)relativelayout.findViewWithTag((new StringBuilder(String.valueOf(AdMarvelActivity.access$5(admarvelactivity)))).append("BR_VIDEO").toString());
        if (obj != null)
        {
            try
            {
                if (AdMarvelActivity.access$29(admarvelactivity) != null)
                {
                    int i = relativelayout.getWidth();
                    int j = relativelayout.getHeight();
                    android.widget.RollVideo rollvideo = (android.widget.)((AdMarvelVideoView) (obj)).getLayoutParams();
                    rollvideo.ms = (int)((float)i * wRatio);
                    rollvideo.wRatio = (int)((float)j * hRatio);
                    rollvideo.hRatio = (int)((float)i * xRatio);
                    rollvideo.xRatio = (int)((float)j * yRatio);
                    ((AdMarvelVideoView) (obj)).setLayoutParams(rollvideo);
                    ((AdMarvelVideoView) (obj)).forceLayout();
                    return;
                }
            }
            catch (Exception exception)
            {
                Logging.log(Log.getStackTraceString(exception));
            }
        }
    }

    public (AdMarvelActivity admarvelactivity, AdMarvelInternalWebView admarvelinternalwebview, float f, float f1, float f2, float f3)
    {
        adMarvelActivityReference = new WeakReference(admarvelactivity);
        adMarvelInternalWebViewReference = new WeakReference(admarvelinternalwebview);
        xRatio = f;
        yRatio = f1;
        wRatio = f2;
        hRatio = f3;
    }
}
