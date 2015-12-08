// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.ads;

import com.soundcloud.java.optional.Optional;

// Referenced classes of package com.soundcloud.android.ads:
//            AutoValue_ApiAdWrapper, ApiAudioAd, ApiVideoAd, ApiInterstitial

abstract class ApiAdWrapper
{

    ApiAdWrapper()
    {
    }

    public static ApiAdWrapper create(ApiAudioAd apiaudioad)
    {
        return create(apiaudioad, null, null);
    }

    public static ApiAdWrapper create(ApiAudioAd apiaudioad, ApiVideoAd apivideoad, ApiInterstitial apiinterstitial)
    {
        return new AutoValue_ApiAdWrapper(Optional.fromNullable(apiaudioad), Optional.fromNullable(apivideoad), Optional.fromNullable(apiinterstitial));
    }

    public static ApiAdWrapper create(ApiInterstitial apiinterstitial)
    {
        return create(null, null, apiinterstitial);
    }

    public static ApiAdWrapper create(ApiVideoAd apivideoad)
    {
        return create(null, apivideoad, null);
    }

    public abstract Optional getAudioAd();

    public abstract Optional getInterstitial();

    public abstract Optional getVideoAd();
}
