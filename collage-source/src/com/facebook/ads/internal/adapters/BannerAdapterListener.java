// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads.internal.adapters;

import android.view.View;
import com.facebook.ads.AdError;

// Referenced classes of package com.facebook.ads.internal.adapters:
//            BannerAdapter

public interface BannerAdapterListener
{

    public abstract void onBannerAdClicked(BannerAdapter banneradapter);

    public abstract void onBannerAdExpanded(BannerAdapter banneradapter);

    public abstract void onBannerAdLoaded(BannerAdapter banneradapter, View view);

    public abstract void onBannerAdMinimized(BannerAdapter banneradapter);

    public abstract void onBannerError(BannerAdapter banneradapter, AdError aderror);

    public abstract void onBannerLoggingImpression(BannerAdapter banneradapter);
}
