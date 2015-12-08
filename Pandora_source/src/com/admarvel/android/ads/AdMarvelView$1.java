// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.admarvel.android.ads;

import android.view.View;
import android.view.animation.Animation;

// Referenced classes of package com.admarvel.android.ads:
//            AdMarvelView, AdMarvelAd

class val.adMarvelAd
    implements android.view.animation.tionListener
{

    final AdMarvelView this$0;
    private final AdMarvelAd val$adMarvelAd;
    private final View val$view;

    public void onAnimationEnd(Animation animation)
    {
        post(new apViews(val$view, AdMarvelView.this, val$adMarvelAd));
    }

    public void onAnimationRepeat(Animation animation)
    {
    }

    public void onAnimationStart(Animation animation)
    {
    }

    apViews()
    {
        this$0 = final_admarvelview;
        val$view = view1;
        val$adMarvelAd = AdMarvelAd.this;
        super();
    }
}
