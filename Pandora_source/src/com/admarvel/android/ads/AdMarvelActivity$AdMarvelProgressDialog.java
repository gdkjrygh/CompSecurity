// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.admarvel.android.ads;

import android.app.ProgressDialog;
import android.content.Context;
import android.widget.RelativeLayout;
import java.lang.ref.WeakReference;

// Referenced classes of package com.admarvel.android.ads:
//            AdMarvelActivity, FullScreenControls, AdMarvelInternalWebView

static class  extends ProgressDialog
{

    private static signalShutdown dialog = null;
    private WeakReference adMarvelActivityReference;
    private boolean signalShutdown;

    public static void destroyInstance()
    {
        if (dialog != null && dialog.isShowing())
        {
            dialog.dismiss();
        }
        dialog = null;
    }

    static dialog getInstance()
    {
        return dialog;
    }

    static dialog newInstance(AdMarvelActivity admarvelactivity)
    {
        com/admarvel/android/ads/AdMarvelActivity$AdMarvelProgressDialog;
        JVM INSTR monitorenter ;
        if (dialog != null) goto _L2; else goto _L1
_L1:
        dialog = new <init>(admarvelactivity);
        dialog.signalShutdown = false;
        dialog.adMarvelActivityReference = new WeakReference(admarvelactivity);
        admarvelactivity = dialog;
_L4:
        com/admarvel/android/ads/AdMarvelActivity$AdMarvelProgressDialog;
        JVM INSTR monitorexit ;
        return admarvelactivity;
_L2:
        admarvelactivity = dialog;
        if (true) goto _L4; else goto _L3
_L3:
        admarvelactivity;
        throw admarvelactivity;
    }

    protected void onStop()
    {
        super.onStop();
        Object obj;
        if (adMarvelActivityReference != null)
        {
            obj = (AdMarvelActivity)adMarvelActivityReference.get();
        } else
        {
            obj = null;
        }
        if (obj != null)
        {
            AdMarvelActivity.access$0(((AdMarvelActivity) (obj)), false);
            RelativeLayout relativelayout = (RelativeLayout)((AdMarvelActivity) (obj)).findViewById(AdMarvelActivity.LAYOUT_VIEW_ID);
            if (relativelayout != null)
            {
                FullScreenControls fullscreencontrols = (FullScreenControls)relativelayout.findViewWithTag((new StringBuilder(String.valueOf(AdMarvelActivity.access$5(((AdMarvelActivity) (obj)))))).append("CONTROLS").toString());
                obj = (AdMarvelInternalWebView)relativelayout.findViewWithTag((new StringBuilder(String.valueOf(AdMarvelActivity.access$5(((AdMarvelActivity) (obj)))))).append("WEBVIEW").toString());
                if (!signalShutdown)
                {
                    if (fullscreencontrols != null && obj != null)
                    {
                        ((AdMarvelInternalWebView) (obj)).clearHistory();
                        ((AdMarvelInternalWebView) (obj)).setVisibility(0);
                        fullscreencontrols.setVisibility(0);
                        relativelayout.requestLayout();
                        return;
                    }
                } else
                {
                    if (obj != null)
                    {
                        ((AdMarvelInternalWebView) (obj)).stopLoading();
                        ((AdMarvelInternalWebView) (obj)).signalShutdown();
                        ((AdMarvelInternalWebView) (obj)).setVisibility(8);
                    }
                    if (fullscreencontrols != null)
                    {
                        fullscreencontrols.setVisibility(8);
                    }
                    relativelayout.requestLayout();
                    return;
                }
            }
        }
    }

    public void signalShutdown()
    {
        signalShutdown = true;
    }


    private (Context context)
    {
        super(context);
    }
}
