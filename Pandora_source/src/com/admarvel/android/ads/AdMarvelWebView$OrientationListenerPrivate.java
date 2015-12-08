// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.admarvel.android.ads;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.util.TypedValue;
import android.view.OrientationEventListener;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import java.lang.ref.WeakReference;

// Referenced classes of package com.admarvel.android.ads:
//            AdMarvelWebView

private static class activityReference extends OrientationEventListener
{

    private final WeakReference activityReference;
    private final WeakReference adMarvelWebViewReference;
    private int lastOrientation;

    public void onOrientationChanged(final int orientation)
    {
        if (lastOrientation == -1)
        {
            lastOrientation = orientation;
        } else
        if (Math.abs(orientation - lastOrientation) >= 90 && Math.abs(orientation - lastOrientation) <= 270)
        {
            final AdMarvelWebView adMarvelWebView = (AdMarvelWebView)adMarvelWebViewReference.get();
            if (adMarvelWebView != null)
            {
                AdMarvelWebView.access$1(adMarvelWebView).postDelayed(new Runnable() {

                    final AdMarvelWebView.OrientationListenerPrivate this$1;
                    private final AdMarvelWebView val$adMarvelWebView;
                    private final int val$orientation;

                    public void run()
                    {
                        Object obj;
                        Object obj1;
                        obj = (Activity)activityReference.get();
                        if (obj == null || !AdMarvelWebView.access$21(adMarvelWebView))
                        {
                            break MISSING_BLOCK_LABEL_204;
                        }
                        obj = (ViewGroup)((Activity) (obj)).getWindow().findViewById(0x1020002);
                        obj1 = (RelativeLayout)((ViewGroup) (obj)).findViewWithTag((new StringBuilder(String.valueOf(adMarvelWebView.GUID))).append("EXPAND_LAYOUT").toString());
                        if (obj1 != null) goto _L2; else goto _L1
_L1:
                        return;
_L2:
                        LinearLayout linearlayout;
                        obj1 = (android.widget.FrameLayout.LayoutParams)((RelativeLayout) (obj1)).getLayoutParams();
                        linearlayout = (LinearLayout)((ViewGroup) (obj)).findViewWithTag((new StringBuilder(String.valueOf(adMarvelWebView.GUID))).append("BTN_CLOSE").toString());
                        if (linearlayout == null) goto _L1; else goto _L3
_L3:
                        android.widget.RelativeLayout.LayoutParams layoutparams = (android.widget.RelativeLayout.LayoutParams)linearlayout.getLayoutParams();
                        int i = ((ViewGroup) (obj)).getHeight();
                        int j = ((ViewGroup) (obj)).getWidth();
                        float f = TypedValue.applyDimension(1, 30F, adMarvelWebView.getContext().getResources().getDisplayMetrics());
                        AdMarvelWebView.access$17(linearlayout, layoutparams, AdMarvelWebView.access$16(adMarvelWebView), ((android.widget.FrameLayout.LayoutParams) (obj1)).leftMargin, ((android.widget.FrameLayout.LayoutParams) (obj1)).topMargin, ((android.widget.FrameLayout.LayoutParams) (obj1)).width, ((android.widget.FrameLayout.LayoutParams) (obj1)).height, j, i, (int)f);
                        lastOrientation = orientation;
                        return;
                    }

            
            {
                this$1 = AdMarvelWebView.OrientationListenerPrivate.this;
                adMarvelWebView = admarvelwebview;
                orientation = i;
                super();
            }
                }, 500L);
                return;
            }
        }
    }



    public _cls1.val.orientation(AdMarvelWebView admarvelwebview, Activity activity, int i)
    {
        super(activity, i);
        lastOrientation = -1;
        adMarvelWebViewReference = new WeakReference(admarvelwebview);
        activityReference = new WeakReference(activity);
    }
}
