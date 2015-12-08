// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.mobileads;


// Referenced classes of package com.mopub.mobileads:
//            MoPubView, MoPubErrorCode

public interface 
{

    public abstract void onBannerClicked(MoPubView mopubview);

    public abstract void onBannerCollapsed(MoPubView mopubview);

    public abstract void onBannerExpanded(MoPubView mopubview);

    public abstract void onBannerFailed(MoPubView mopubview, MoPubErrorCode mopuberrorcode);

    public abstract void onBannerLoaded(MoPubView mopubview);
}
