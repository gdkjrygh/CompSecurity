// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.mediation;


// Referenced classes of package com.google.android.gms.ads.mediation:
//            MediationBannerAdapter

public interface MediationBannerListener
{

    public abstract void onAdClicked(MediationBannerAdapter mediationbanneradapter);

    public abstract void onAdClosed(MediationBannerAdapter mediationbanneradapter);

    public abstract void onAdFailedToLoad(MediationBannerAdapter mediationbanneradapter, int i);

    public abstract void onAdLeftApplication(MediationBannerAdapter mediationbanneradapter);

    public abstract void onAdLoaded(MediationBannerAdapter mediationbanneradapter);

    public abstract void onAdOpened(MediationBannerAdapter mediationbanneradapter);
}
