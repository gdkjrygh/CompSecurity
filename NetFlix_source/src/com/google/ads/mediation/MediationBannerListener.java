// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.ads.mediation;


// Referenced classes of package com.google.ads.mediation:
//            MediationBannerAdapter

public interface MediationBannerListener
{

    public abstract void onClick(MediationBannerAdapter mediationbanneradapter);

    public abstract void onDismissScreen(MediationBannerAdapter mediationbanneradapter);

    public abstract void onFailedToReceiveAd(MediationBannerAdapter mediationbanneradapter, com.google.ads.AdRequest.ErrorCode errorcode);

    public abstract void onLeaveApplication(MediationBannerAdapter mediationbanneradapter);

    public abstract void onPresentScreen(MediationBannerAdapter mediationbanneradapter);

    public abstract void onReceivedAd(MediationBannerAdapter mediationbanneradapter);
}
