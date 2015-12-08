// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.nativeads;

import com.mopub.network.AdResponse;

// Referenced classes of package com.mopub.nativeads:
//            MoPubNative, NativeResponse, NativeErrorCode, ad

final class w
    implements CustomEventNative.CustomEventNativeListener
{

    final AdResponse a;
    final MoPubNative b;

    w(MoPubNative mopubnative, AdResponse adresponse)
    {
        b = mopubnative;
        a = adresponse;
        super();
    }

    public final void onNativeAdFailed(NativeErrorCode nativeerrorcode)
    {
        b.a(a.getFailoverUrl());
    }

    public final void onNativeAdLoaded(ad ad)
    {
        android.content.Context context = b.a();
        if (context == null)
        {
            return;
        } else
        {
            MoPubNative.c(b).onNativeLoad(new NativeResponse(context, a.getImpressionTrackingUrl(), a.getClickTrackingUrl(), MoPubNative.a(b), ad, MoPubNative.b(b)));
            return;
        }
    }
}
