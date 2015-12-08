// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.mobileads;


// Referenced classes of package com.mopub.mobileads:
//            MoPubErrorCode

public interface Q
{

    public abstract void onInterstitialClicked();

    public abstract void onInterstitialDismissed();

    public abstract void onInterstitialFailed(MoPubErrorCode mopuberrorcode);

    public abstract void onInterstitialLoaded();

    public abstract void onInterstitialShown();

    public abstract void onLeaveApplication();
}
