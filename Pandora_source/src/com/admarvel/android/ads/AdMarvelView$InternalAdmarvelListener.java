// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.admarvel.android.ads;

import android.os.Handler;
import java.lang.ref.WeakReference;

// Referenced classes of package com.admarvel.android.ads:
//            AdMarvelWebViewListener, AdMarvelView, AdMarvelAd, AdMarvelViewListenerImpl, 
//            AdMarvelWebView

private static class adMarvelViewReference
    implements AdMarvelWebViewListener
{

    private final WeakReference adMarvelViewReference;

    public void onClickAd(AdMarvelAd admarvelad, String s)
    {
        AdMarvelView admarvelview = (AdMarvelView)adMarvelViewReference.get();
        if (admarvelview == null)
        {
            return;
        } else
        {
            AdMarvelView.access$7(admarvelview).onClickAd(admarvelview.getContext(), admarvelview, s, admarvelad.getSiteId(), admarvelad.getId(), admarvelad.getTargetParams(), admarvelad.getIpAddress());
            return;
        }
    }

    public void onClose()
    {
        AdMarvelView admarvelview = (AdMarvelView)adMarvelViewReference.get();
        if (admarvelview == null)
        {
            return;
        } else
        {
            AdMarvelView.access$7(admarvelview).onClose();
            return;
        }
    }

    public void onExpand()
    {
        AdMarvelView admarvelview = (AdMarvelView)adMarvelViewReference.get();
        if (admarvelview == null)
        {
            return;
        } else
        {
            AdMarvelView.access$7(admarvelview).onExpand();
            return;
        }
    }

    public void onFailedToReceiveAd(AdMarvelWebView admarvelwebview, AdMarvelAd admarvelad, int i, adMarvelViewReference admarvelviewreference)
    {
        admarvelwebview = (AdMarvelView)adMarvelViewReference.get();
        if (admarvelwebview != null)
        {
            android.view.View view = admarvelwebview.findViewWithTag("PENDING");
            if (view != null)
            {
                admarvelwebview.removeView(view);
            }
            if (admarvelad != null)
            {
                AdMarvelView.access$7(admarvelwebview).onFailedToReceiveAd(admarvelwebview.getContext(), admarvelwebview, i, admarvelviewreference, admarvelad.getSiteId(), admarvelad.getId(), admarvelad.getTargetParams(), admarvelad.getIpAddress());
                return;
            }
        }
    }

    public void onReceiveAd(AdMarvelWebView admarvelwebview, AdMarvelAd admarvelad)
    {
        admarvelwebview = (AdMarvelView)adMarvelViewReference.get();
        if (admarvelwebview == null)
        {
            return;
        } else
        {
            AdMarvelView.access$9(admarvelwebview).post(new (admarvelwebview, admarvelad));
            return;
        }
    }

    public (AdMarvelView admarvelview)
    {
        adMarvelViewReference = new WeakReference(admarvelview);
    }
}
