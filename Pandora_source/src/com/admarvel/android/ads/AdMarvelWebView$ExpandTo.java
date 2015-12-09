// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.admarvel.android.ads;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.admarvel.android.ads:
//            AdMarvelWebView, AdMarvelInternalWebView, AdMarvelWebViewListener, Version, 
//            AdMarvelAd

private static class adMarvelAd
    implements Runnable
{

    private final WeakReference activityReference;
    private final AdMarvelAd adMarvelAd;
    private final WeakReference adMarvelWebViewReference;
    private int height;
    private int width;
    private int x;
    private int y;

    public void run()
    {
        Object obj;
        AdMarvelInternalWebView admarvelinternalwebview;
        android.widget..ExpandTo expandto;
        int i;
        int j;
        float f;
        Activity activity;
        ViewGroup viewgroup;
        RelativeLayout relativelayout;
        Object obj1;
        Object obj2;
        FrameLayout framelayout;
        try
        {
            obj = (AdMarvelWebView)adMarvelWebViewReference.get();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            ((Exception) (obj)).printStackTrace();
            return;
        }
        if (obj == null)
        {
            return;
        }
        activity = (Activity)activityReference.get();
        if (activity == null) goto _L2; else goto _L1
_L1:
        viewgroup = (ViewGroup)activity.getWindow().findViewById(0x1020002);
        admarvelinternalwebview = (AdMarvelInternalWebView)((AdMarvelWebView) (obj)).findViewWithTag((new StringBuilder(String.valueOf(((AdMarvelWebView) (obj)).GUID))).append("INTERNAL").toString());
        if (admarvelinternalwebview == null) goto _L2; else goto _L3
_L3:
        if (admarvelinternalwebview.isSignalShutdown()) goto _L2; else goto _L4
_L4:
        admarvelinternalwebview.isAdExpanding = true;
        obj1 = new FrameLayout(((AdMarvelWebView) (obj)).getContext());
        ((FrameLayout) (obj1)).setTag((new StringBuilder(String.valueOf(((AdMarvelWebView) (obj)).GUID))).append("EXPAND_BG").toString());
        ((FrameLayout) (obj1)).setOnTouchListener(new android.view.View.OnTouchListener() {

            final AdMarvelWebView.ExpandTo this$1;

            public boolean onTouch(View view1, MotionEvent motionevent)
            {
                return true;
            }

            
            {
                this$1 = AdMarvelWebView.ExpandTo.this;
                super();
            }
        });
        obj2 = new android.widget.<init>(-1, -1);
        relativelayout = new RelativeLayout(((AdMarvelWebView) (obj)).getContext());
        relativelayout.setTag((new StringBuilder(String.valueOf(((AdMarvelWebView) (obj)).GUID))).append("EXPAND_LAYOUT").toString());
        expandto = new android.widget.<init>(width, height);
        if (x != 0) goto _L6; else goto _L5
_L5:
        expandto.gravity = 1;
_L9:
        relativelayout.setGravity(1);
        expandto.leftMargin = x;
        expandto.topMargin = y;
        j = ((AdMarvelWebView) (obj)).getChildCount();
        i = 0;
          goto _L7
_L10:
        framelayout = new FrameLayout(((AdMarvelWebView) (obj)).getContext());
        framelayout.setTag((new StringBuilder(String.valueOf(((AdMarvelWebView) (obj)).GUID))).append("EXPAND_PLACE_HOLDER").toString());
        ((AdMarvelWebView) (obj)).addView(framelayout, i, new android.widget.ms(admarvelinternalwebview.getWidth(), admarvelinternalwebview.getHeight()));
        ((AdMarvelWebView) (obj)).removeView(admarvelinternalwebview);
        if (admarvelinternalwebview == null)
        {
            break MISSING_BLOCK_LABEL_362;
        }
        admarvelinternalwebview.expandTo(x, y, width, height);
        relativelayout.addView(admarvelinternalwebview);
        AdMarvelWebView.access$13(((AdMarvelWebView) (obj)), true);
        ((FrameLayout) (obj1)).addView(relativelayout, expandto);
        viewgroup.addView(((View) (obj1)), ((android.view.ew) (obj2)));
        relativelayout.bringToFront();
        if (AdMarvelWebView.access$14(((AdMarvelWebView) (obj))) && !AdMarvelWebView.access$15(((AdMarvelWebView) (obj))))
        {
            obj1 = new LinearLayout(((AdMarvelWebView) (obj)).getContext());
            ((LinearLayout) (obj1)).setBackgroundColor(0);
            ((LinearLayout) (obj1)).setTag((new StringBuilder(String.valueOf(((AdMarvelWebView) (obj)).GUID))).append("BTN_CLOSE").toString());
            obj2 = new android.widget.ms(-2, -2);
            i = viewgroup.getMeasuredHeight();
            j = viewgroup.getMeasuredWidth();
            f = TypedValue.applyDimension(1, 30F, ((AdMarvelWebView) (obj)).getContext().getResources().getDisplayMetrics());
            AdMarvelWebView.access$17(((LinearLayout) (obj1)), ((android.widget.ms) (obj2)), AdMarvelWebView.access$16(((AdMarvelWebView) (obj))), x, y, width, height, j, i, (int)f);
            ((LinearLayout) (obj1)).addView(new on(((AdMarvelWebView) (obj)).getContext(), ((AdMarvelWebView) (obj))));
            relativelayout.addView(((View) (obj1)));
            AdMarvelWebView.access$18(((AdMarvelWebView) (obj)), true);
            AdMarvelWebView.access$19(((AdMarvelWebView) (obj)), new onListenerPrivate(((AdMarvelWebView) (obj)), activity, 3));
            if (AdMarvelWebView.access$20(((AdMarvelWebView) (obj))).canDetectOrientation())
            {
                AdMarvelWebView.access$20(((AdMarvelWebView) (obj))).enable();
            }
        }
        viewgroup.invalidate();
        viewgroup.requestLayout();
        ((AdMarvelWebView) (obj)).fullScreenMode.set(true);
        ((AdMarvelWebView) (obj)).invalidate();
        ((AdMarvelWebView) (obj)).requestLayout();
        if (AdMarvelWebView.getListener(((AdMarvelWebView) (obj)).GUID) != null)
        {
            AdMarvelWebView.getListener(((AdMarvelWebView) (obj)).GUID).onExpand();
        }
        ((AdMarvelWebView) (obj)).invalidate();
        ((AdMarvelWebView) (obj)).requestLayout();
        admarvelinternalwebview.isAdExpanding = false;
        return;
_L6:
        if (Version.getAndroidSDKVersion() >= 11) goto _L9; else goto _L8
_L8:
        expandto.gravity = 48;
          goto _L9
_L11:
        View view = ((AdMarvelWebView) (obj)).getChildAt(i);
        if (view == admarvelinternalwebview)
        {
            break; /* Loop/switch isn't completed */
        }
        i++;
        continue; /* Loop/switch isn't completed */
_L2:
        return;
_L7:
        if (i < j) goto _L11; else goto _L10
    }

    public _cls1.this._cls1(AdMarvelWebView admarvelwebview, Activity activity, int i, int j, int k, int l, AdMarvelAd admarvelad)
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
        adMarvelAd = admarvelad;
    }

    public adMarvelAd(AdMarvelWebView admarvelwebview, Activity activity, int i, int j, AdMarvelAd admarvelad)
    {
        width = 0;
        height = 0;
        x = 0;
        y = 0;
        adMarvelWebViewReference = new WeakReference(admarvelwebview);
        activityReference = new WeakReference(activity);
        width = i;
        height = j;
        adMarvelAd = admarvelad;
    }
}
