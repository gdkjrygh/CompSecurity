// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.adsdk;


// Referenced classes of package com.amobee.adsdk:
//            AmobeeInterstitial

public interface AmobeeInterstitialListener
{

    public abstract void interstitialClicked(AmobeeInterstitial amobeeinterstitial);

    public abstract void interstitialClosed(AmobeeInterstitial amobeeinterstitial);

    public abstract void interstitialFailed(AmobeeInterstitial amobeeinterstitial);

    public abstract void interstitialRecieved(AmobeeInterstitial amobeeinterstitial);
}
