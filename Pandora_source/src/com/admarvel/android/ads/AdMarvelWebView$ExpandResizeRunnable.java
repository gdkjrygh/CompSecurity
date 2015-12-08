// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.admarvel.android.ads;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.admarvel.android.ads:
//            AdMarvelWebView, AdMarvelInternalWebView, AdMarvelWebViewListener

private static class y
    implements Runnable
{

    private final WeakReference activityReference;
    private final WeakReference adMarvelWebViewReference;
    private int height;
    private int width;
    private int x;
    private int y;

    public void run()
    {
        AdMarvelWebView admarvelwebview = (AdMarvelWebView)adMarvelWebViewReference.get();
        if (admarvelwebview != null) goto _L2; else goto _L1
_L1:
        Object obj;
        return;
_L2:
        if ((obj = (Activity)activityReference.get()) == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = (ViewGroup)((Activity) (obj)).getWindow().findViewById(0x1020002);
        Object obj1 = (AdMarvelInternalWebView)((ViewGroup) (obj)).findViewWithTag((new StringBuilder(String.valueOf(admarvelwebview.GUID))).append("INTERNAL").toString());
        if (obj1 == null || ((AdMarvelInternalWebView) (obj1)).isSignalShutdown() || !AdMarvelWebView.access$21(admarvelwebview))
        {
            continue; /* Loop/switch isn't completed */
        }
        Object obj2 = (RelativeLayout)((ViewGroup) (obj)).findViewWithTag((new StringBuilder(String.valueOf(admarvelwebview.GUID))).append("EXPAND_LAYOUT").toString());
        if (obj2 == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        obj2 = (android.widget.ignalShutdown)((RelativeLayout) (obj2)).getLayoutParams();
        if (obj2 != null)
        {
            obj2.ignalShutdown = width;
            obj2.width = height;
            obj2.height = x;
            obj2.x = y;
            if (x != 0)
            {
                obj2.x = 0;
            }
        }
        ((AdMarvelInternalWebView) (obj1)).expandTo(x, y, width, height);
        if (!AdMarvelWebView.access$22(admarvelwebview))
        {
            break; /* Loop/switch isn't completed */
        }
        obj1 = (LinearLayout)((ViewGroup) (obj)).findViewWithTag((new StringBuilder(String.valueOf(admarvelwebview.GUID))).append("BTN_CLOSE").toString());
        if (obj1 == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        obj2 = new android.widget.eRunnable.height(-2, -2);
        int i = ((ViewGroup) (obj)).getMeasuredHeight();
        int j = ((ViewGroup) (obj)).getMeasuredWidth();
        float f = TypedValue.applyDimension(1, 30F, admarvelwebview.getContext().getResources().getDisplayMetrics());
        AdMarvelWebView.access$17(((LinearLayout) (obj1)), ((android.widget.eRunnable.height) (obj2)), AdMarvelWebView.access$16(admarvelwebview), x, y, width, height, j, i, (int)f);
        ((LinearLayout) (obj1)).removeAllViews();
        ((LinearLayout) (obj1)).addView(new height(admarvelwebview.getContext(), admarvelwebview));
        break; /* Loop/switch isn't completed */
        if (true) goto _L1; else goto _L3
_L3:
        AdMarvelWebView.access$23(admarvelwebview, true);
        ((ViewGroup) (obj)).invalidate();
        ((ViewGroup) (obj)).requestLayout();
        admarvelwebview.fullScreenMode.set(true);
        admarvelwebview.invalidate();
        admarvelwebview.requestLayout();
        if (AdMarvelWebView.getListener(admarvelwebview.GUID) != null)
        {
            AdMarvelWebView.getListener(admarvelwebview.GUID).onExpand();
        }
        admarvelwebview.invalidate();
        admarvelwebview.requestLayout();
        return;
    }

    public (AdMarvelWebView admarvelwebview, Activity activity, int i, int j)
    {
        width = 0;
        height = 0;
        x = 0;
        y = 0;
        adMarvelWebViewReference = new WeakReference(admarvelwebview);
        activityReference = new WeakReference(activity);
        width = i;
        height = j;
    }

    public height(AdMarvelWebView admarvelwebview, Activity activity, int i, int j, int k, int l)
    {
        width = 0;
        height = 0;
        x = 0;
        y = 0;
        adMarvelWebViewReference = new WeakReference(admarvelwebview);
        activityReference = new WeakReference(activity);
        width = k;
        height = l;
        x = i;
        y = j;
    }
}
