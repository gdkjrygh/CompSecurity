// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads.internal.adapters;

import com.facebook.ads.AdError;

// Referenced classes of package com.facebook.ads.internal.adapters:
//            InterstitialAdapter

public interface InterstitialAdapterListener
{

    public abstract void onInterstitialAdClicked(InterstitialAdapter interstitialadapter, String s, boolean flag);

    public abstract void onInterstitialAdDismissed(InterstitialAdapter interstitialadapter);

    public abstract void onInterstitialAdDisplayed(InterstitialAdapter interstitialadapter);

    public abstract void onInterstitialAdLoaded(InterstitialAdapter interstitialadapter);

    public abstract void onInterstitialError(InterstitialAdapter interstitialadapter, AdError aderror);

    public abstract void onInterstitialLoggingImpression(InterstitialAdapter interstitialadapter);
}
