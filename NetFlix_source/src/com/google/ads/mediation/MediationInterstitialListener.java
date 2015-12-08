// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.ads.mediation;


// Referenced classes of package com.google.ads.mediation:
//            MediationInterstitialAdapter

public interface MediationInterstitialListener
{

    public abstract void onDismissScreen(MediationInterstitialAdapter mediationinterstitialadapter);

    public abstract void onFailedToReceiveAd(MediationInterstitialAdapter mediationinterstitialadapter, com.google.ads.AdRequest.ErrorCode errorcode);

    public abstract void onLeaveApplication(MediationInterstitialAdapter mediationinterstitialadapter);

    public abstract void onPresentScreen(MediationInterstitialAdapter mediationinterstitialadapter);

    public abstract void onReceivedAd(MediationInterstitialAdapter mediationinterstitialadapter);
}
