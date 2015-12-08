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
//            AdMarvelActivity, AdMarvelVideoView

private static class adMarvelActivityReference
    implements Runnable
{

    private final WeakReference adMarvelActivityReference;

    public void run()
    {
        AdMarvelActivity admarvelactivity = (AdMarvelActivity)adMarvelActivityReference.get();
        if (admarvelactivity == null)
        {
            return;
        }
        RelativeLayout relativelayout;
        AdMarvelVideoView admarvelvideoview;
        admarvelactivity.isBrightRollVideoLoaded = false;
        relativelayout = (RelativeLayout)admarvelactivity.findViewById(AdMarvelActivity.LAYOUT_VIEW_ID);
        admarvelvideoview = (AdMarvelVideoView)relativelayout.findViewWithTag((new StringBuilder(String.valueOf(AdMarvelActivity.access$5(admarvelactivity)))).append("BR_VIDEO").toString());
        if (admarvelvideoview == null)
        {
            break MISSING_BLOCK_LABEL_75;
        }
        admarvelvideoview.stopPlayback();
        relativelayout.removeView(admarvelvideoview);
        if (AdMarvelActivity.access$29(admarvelactivity) != null)
        {
            AdMarvelActivity.access$7(admarvelactivity).removeCallbacks(AdMarvelActivity.access$29(admarvelactivity));
            AdMarvelActivity.access$30(admarvelactivity, null);
            return;
        }
        break MISSING_BLOCK_LABEL_107;
        Exception exception;
        exception;
        Logging.log(Log.getStackTraceString(exception));
    }

    public (AdMarvelActivity admarvelactivity)
    {
        adMarvelActivityReference = new WeakReference(admarvelactivity);
    }
}
