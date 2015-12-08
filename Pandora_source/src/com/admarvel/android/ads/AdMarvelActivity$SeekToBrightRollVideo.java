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

private static class currentTime
    implements Runnable
{

    private final WeakReference adMarvelActivityReference;
    private final WeakReference adMarvelInternalWebViewReference;
    private float currentTime;

    public void run()
    {
        Object obj;
        Object obj1;
        obj = (AdMarvelActivity)adMarvelActivityReference.get();
        obj1 = (AdMarvelInternalWebView)adMarvelInternalWebViewReference.get();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_101;
        }
        if (obj1 == null)
        {
            return;
        }
        obj1 = (RelativeLayout)((AdMarvelActivity) (obj)).findViewById(AdMarvelActivity.LAYOUT_VIEW_ID);
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_101;
        }
        obj = (AdMarvelVideoView)((RelativeLayout) (obj1)).findViewWithTag((new StringBuilder(String.valueOf(AdMarvelActivity.access$5(((AdMarvelActivity) (obj)))))).append("BR_VIDEO").toString());
        if (obj != null)
        {
            try
            {
                ((AdMarvelVideoView) (obj)).seekTo((int)(currentTime * 1000F));
                return;
            }
            catch (Exception exception)
            {
                Logging.log(Log.getStackTraceString(exception));
            }
        }
    }

    public (AdMarvelActivity admarvelactivity, AdMarvelInternalWebView admarvelinternalwebview, float f)
    {
        adMarvelActivityReference = new WeakReference(admarvelactivity);
        adMarvelInternalWebViewReference = new WeakReference(admarvelinternalwebview);
        currentTime = f;
    }
}
