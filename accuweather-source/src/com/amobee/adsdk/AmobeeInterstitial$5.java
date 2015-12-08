// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.adsdk;

import android.app.Activity;
import android.view.View;
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
        AmobeeInterstitial.access$7(AmobeeInterstitial.this, false);
        AdManager.getInstance(AmobeeInterstitial.access$4(AmobeeInterstitial.this)).setIsExpanded(false);
        FrameLayout framelayout = (FrameLayout)((FrameLayout)AmobeeInterstitial.access$4(AmobeeInterstitial.this).getWindow().getDecorView().getRootView()).findViewById(AmobeeInterstitial.access$0(AmobeeInterstitial.this));
        if (framelayout == null)
        {
            return;
        }
        if (framelayout.getChildAt(0) != null && (framelayout.getChildAt(0) instanceof AmobeeView))
        {
            AmobeeView amobeeview = (AmobeeView)framelayout.getChildAt(0);
            amobeeview.hideVideo();
            amobeeview.hideMraidInterstitial();
            if (android.os. >= 19)
            {
                amobeeview.loadUrl("about:blank");
                amobeeview.onPause();
            } else
            {
                amobeeview.loadUrl("javascript:var videos = document.getElementsByTagName('video');for (i=0;i<videos.length;i++) {videos[i].pause();}");
                amobeeview.loadUrl("about:blank");
            }
            amobeeview.setOrientationDefault();
            amobeeview.amobeeInterstitial = null;
            amobeeview.mViewState = com.amobee.richmedia.view.HIDDEN;
        }
        framelayout.setVisibility(8);
    }

    iewState()
    {
        this$0 = AmobeeInterstitial.this;
        super();
    }
}
