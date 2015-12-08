// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.adsdk;

import com.google.android.gms.ads.AdListener;

// Referenced classes of package com.amobee.adsdk:
//            GmsAdsAdapter, AdManager, IAmobeeListener, NetworkHelper

class ener extends AdListener
{

    final GmsAdsAdapter this$0;

    public void onAdClosed()
    {
        fireOnOverlay(false);
        am.setIsExpanded(false);
    }

    public void onAdFailedToLoad(int i)
    {
        if (i == 2)
        {
            fireAdFailed(networkName, false);
            return;
        } else
        {
            fireAdFailed(networkName, true);
            return;
        }
    }

    public void onAdLeftApplication()
    {
        AmobeeAdPlaceholder amobeeadplaceholder = getPlaceHolder();
        am.getAmobeeListener().amobeeOnLeavingApplication(amobeeadplaceholder);
        if (GmsAdsAdapter.access$1(GmsAdsAdapter.this))
        {
            return;
        } else
        {
            NetworkHelper.sendNotification(GmsAdsAdapter.createNotificationURL(29, getCorrelator()));
            GmsAdsAdapter.access$0(GmsAdsAdapter.this, true);
            return;
        }
    }

    public void onAdLoaded()
    {
        am.setPassbackURL("");
        GmsAdsAdapter.access$0(GmsAdsAdapter.this, false);
        fireAdRecieved(networkName);
    }

    public void onAdOpened()
    {
        am.setIsExpanded(true);
        if (GmsAdsAdapter.access$1(GmsAdsAdapter.this))
        {
            AmobeeAdPlaceholder amobeeadplaceholder = getPlaceHolder();
            am.fireOnOverlay(true, amobeeadplaceholder);
            return;
        } else
        {
            fireOnOverlay(true);
            GmsAdsAdapter.access$0(GmsAdsAdapter.this, true);
            return;
        }
    }

    ener()
    {
        this$0 = GmsAdsAdapter.this;
        super();
    }
}
