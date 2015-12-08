// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.adsdk;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import com.amobee.richmedia.view.AmobeeView;

// Referenced classes of package com.amobee.adsdk:
//            AmobeeInterstitial, AdManager

class this._cls0
    implements Runnable
{

    final AmobeeInterstitial this$0;

    public void run()
    {
        Object obj = (ViewGroup)AmobeeInterstitial.access$4(AmobeeInterstitial.this).getWindow().getDecorView().getRootView();
        Object obj1;
        if (((ViewGroup) (obj)).findViewById(AmobeeInterstitial.access$0(AmobeeInterstitial.this)) != null)
        {
            obj1 = (FrameLayout)((ViewGroup) (obj)).findViewById(AmobeeInterstitial.access$0(AmobeeInterstitial.this));
            obj = (AmobeeView)((FrameLayout) (obj1)).getChildAt(0);
            if (android.os. >= 19)
            {
                ((AmobeeView) (obj)).onResume();
            }
            ((AmobeeView) (obj)).requestFocusFromTouch();
        } else
        {
            android.widget.ams ams = new android.widget.ams(-1, -1);
            obj1 = new FrameLayout(AmobeeInterstitial.access$4(AmobeeInterstitial.this));
            ((FrameLayout) (obj1)).setId(AmobeeInterstitial.access$0(AmobeeInterstitial.this));
            ((FrameLayout) (obj1)).setBackgroundColor(-1);
            if (android.os. >= 14)
            {
                ams.setMargins(0, mStatusBarHeight, 0, 0);
            } else
            {
                ((FrameLayout) (obj1)).setPadding(0, mStatusBarHeight, 0, 0);
            }
            ((ViewGroup) (obj)).addView(((View) (obj1)), ams);
            obj = new AmobeeView(AmobeeInterstitial.access$4(AmobeeInterstitial.this));
            ((FrameLayout) (obj1)).addView(((View) (obj)));
        }
        ((FrameLayout) (obj1)).setVisibility(8);
        obj.mViewState = com.amobee.richmedia.view.INTERSTITIAL;
        obj.amobeeInterstitial = AmobeeInterstitial.this;
        ((AmobeeView) (obj)).setLayoutParams(new android.widget.ams(-1, -1));
        obj1 = AdManager.getInstance(AmobeeInterstitial.access$4(AmobeeInterstitial.this));
        ((AmobeeView) (obj)).setUserGestureRequiredToOpenAds(((AdManager) (obj1)).getUserGestureRequiredToOpenAds());
        ((AmobeeView) (obj)).requestFocusFromTouch();
        ((AmobeeView) (obj)).loadString(AmobeeInterstitial.access$5(AmobeeInterstitial.this), null);
        ((AdManager) (obj1)).setImpression(AmobeeInterstitial.access$6(AmobeeInterstitial.this));
    }

    s()
    {
        this$0 = AmobeeInterstitial.this;
        super();
    }
}
