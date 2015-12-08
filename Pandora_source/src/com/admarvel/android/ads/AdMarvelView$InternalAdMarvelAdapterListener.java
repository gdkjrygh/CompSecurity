// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.admarvel.android.ads;

import android.os.Handler;
import java.io.File;
import java.lang.ref.WeakReference;

// Referenced classes of package com.admarvel.android.ads:
//            AdMarvelAdapterListener, AdMarvelView, AdMarvelAd, AdMarvelViewListenerImpl

private static class adMarvelViewReference
    implements AdMarvelAdapterListener
{

    private AdMarvelAd adMarvelAd;
    private final WeakReference adMarvelViewReference;

    public void onClickAd(String s)
    {
        AdMarvelView admarvelview = (AdMarvelView)adMarvelViewReference.get();
        if (admarvelview == null)
        {
            return;
        } else
        {
            AdMarvelView.access$7(admarvelview).onClickAd(admarvelview.getContext(), admarvelview, s, adMarvelAd.getSiteId(), adMarvelAd.getId(), adMarvelAd.getTargetParams(), adMarvelAd.getIpAddress());
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
            AdMarvelView.access$12(admarvelview, false);
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
            AdMarvelView.access$12(admarvelview, true);
            AdMarvelView.access$7(admarvelview).onExpand();
            return;
        }
    }

    public void onFailedToReceiveAd(int i, adMarvelViewReference admarvelviewreference)
    {
        AdMarvelView admarvelview = (AdMarvelView)adMarvelViewReference.get();
        if (admarvelview != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        AdMarvelAd admarvelad = AdMarvelView.access$11(admarvelview);
        AdMarvelView.access$9(admarvelview).post(new adMarvelViewReference(admarvelview));
        boolean flag = false;
        int j = ((flag) ? 1 : 0);
        if (!admarvelad.getRetry().equals(Boolean.valueOf(true)))
        {
            continue; /* Loop/switch isn't completed */
        }
        j = ((flag) ? 1 : 0);
        if (admarvelad.getRetrynum() > admarvelad.getMaxretries())
        {
            continue; /* Loop/switch isn't completed */
        }
        j = admarvelad.getRetrynum();
        String s = admarvelad.getExcluded();
        File file;
        if (admarvelad.getExcluded() == null)
        {
            s = admarvelad.getBannerid();
        } else
        if (admarvelad.getExcluded().length() > 0)
        {
            s = (new StringBuilder(String.valueOf(s))).append(",").append(admarvelad.getBannerid()).toString();
        } else
        {
            s = admarvelad.getBannerid();
        }
        file = null;
        if (AdMarvelView.cachedDirectory != null)
        {
            file = new File(AdMarvelView.cachedDirectory);
        }
        if (admarvelview.getContext() != null)
        {
            AdMarvelView.access$9(admarvelview).post(new nit>(file, admarvelview.getContext(), admarvelad.getTargetParams(), admarvelad.getPartnerId(), admarvelad.getSiteId(), admarvelad.getAndroidId(), admarvelad.getOrientation(), admarvelad.getDeviceConnectivity(), admarvelview, j + 1, s, AdMarvelView.access$9(admarvelview)));
        }
        j = 1;
        if (j != 0) goto _L1; else goto _L3
_L3:
        AdMarvelView.access$7(admarvelview).onFailedToReceiveAd(admarvelview.getContext(), admarvelview, i, admarvelviewreference, admarvelad.getSiteId(), admarvelad.getId(), admarvelad.getTargetParams(), admarvelad.getIpAddress());
        return;
    }

    public void onReceiveAd()
    {
        AdMarvelView admarvelview = (AdMarvelView)adMarvelViewReference.get();
        if (admarvelview == null)
        {
            return;
        } else
        {
            AdMarvelView.access$9(admarvelview).post(new adMarvelViewReference(admarvelview, AdMarvelView.access$11(admarvelview)));
            return;
        }
    }

    public (AdMarvelView admarvelview)
    {
        adMarvelViewReference = new WeakReference(admarvelview);
        adMarvelAd = AdMarvelView.access$11((AdMarvelView)adMarvelViewReference.get());
    }
}
