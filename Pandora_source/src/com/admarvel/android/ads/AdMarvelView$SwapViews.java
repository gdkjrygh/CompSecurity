// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.admarvel.android.ads;

import android.view.View;
import android.view.animation.DecelerateInterpolator;
import java.lang.ref.WeakReference;

// Referenced classes of package com.admarvel.android.ads:
//            AdMarvelView, Rotate3dAnimation, AdMarvelAd, AdMarvelViewListenerImpl

private static class adMarvelAd
    implements Runnable
{

    private final AdMarvelAd adMarvelAd;
    private final WeakReference adMarvelViewReference;
    private final WeakReference viewReference;

    public void run()
    {
        if (viewReference != null && adMarvelViewReference != null)
        {
            Object obj = (View)viewReference.get();
            AdMarvelView admarvelview = (AdMarvelView)adMarvelViewReference.get();
            if (admarvelview != null && admarvelview != null)
            {
                View view = admarvelview.findViewWithTag("CURRENT");
                if (view != null)
                {
                    AdMarvelView.access$6(admarvelview);
                    ((View) (obj)).setVisibility(0);
                    ((View) (obj)).setTag("CURRENT");
                    admarvelview.removeAllViews();
                    admarvelview.addView(((View) (obj)));
                    AdMarvelView.access$2(admarvelview, view);
                    if (!AdMarvelView.access$3(admarvelview))
                    {
                        AdMarvelView.access$4(admarvelview, view);
                    }
                    obj = new Rotate3dAnimation(90F, 0.0F, (float)admarvelview.getWidth() / 2.0F, (float)admarvelview.getHeight() / 2.0F, -0.3F * (float)admarvelview.getWidth(), false);
                    ((Rotate3dAnimation) (obj)).setDuration(700L);
                    ((Rotate3dAnimation) (obj)).setFillAfter(true);
                    ((Rotate3dAnimation) (obj)).setInterpolator(new DecelerateInterpolator());
                    admarvelview.startAnimation(((android.view.animation.Animation) (obj)));
                    if (adMarvelAd != null)
                    {
                        AdMarvelView.access$7(admarvelview).onReceiveAd(admarvelview.getContext(), admarvelview, adMarvelAd.getSiteId(), adMarvelAd.getId(), adMarvelAd.getTargetParams(), adMarvelAd.getIpAddress());
                        return;
                    }
                }
            }
        }
    }

    public l(View view, AdMarvelView admarvelview, AdMarvelAd admarvelad)
    {
        viewReference = new WeakReference(view);
        adMarvelViewReference = new WeakReference(admarvelview);
        adMarvelAd = admarvelad;
    }
}
