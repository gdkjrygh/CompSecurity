// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.mobileads;


// Referenced classes of package com.mopub.mobileads:
//            MoPubInterstitial, MoPubErrorCode

public interface 
{

    public abstract void onInterstitialClicked(MoPubInterstitial mopubinterstitial);

    public abstract void onInterstitialDismissed(MoPubInterstitial mopubinterstitial);

    public abstract void onInterstitialFailed(MoPubInterstitial mopubinterstitial, MoPubErrorCode mopuberrorcode);

    public abstract void onInterstitialLoaded(MoPubInterstitial mopubinterstitial);

    public abstract void onInterstitialShown(MoPubInterstitial mopubinterstitial);
}
