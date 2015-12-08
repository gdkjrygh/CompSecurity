// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.mobileads;


// Referenced classes of package com.mopub.mobileads:
//            MoPubErrorCode

interface q
{

    public abstract void onCustomEventInterstitialClicked();

    public abstract void onCustomEventInterstitialDismissed();

    public abstract void onCustomEventInterstitialFailed(MoPubErrorCode mopuberrorcode);

    public abstract void onCustomEventInterstitialLoaded();

    public abstract void onCustomEventInterstitialShown();
}
