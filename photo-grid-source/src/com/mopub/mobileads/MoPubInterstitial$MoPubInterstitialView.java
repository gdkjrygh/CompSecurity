// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.mobileads;

import android.content.Context;
import android.text.TextUtils;
import com.mopub.common.AdFormat;
import com.mopub.common.logging.MoPubLog;
import com.mopub.mobileads.factories.CustomEventInterstitialAdapterFactory;
import java.util.Map;

// Referenced classes of package com.mopub.mobileads:
//            MoPubView, AdViewController, MoPubInterstitial, MoPubErrorCode, 
//            CustomEventInterstitialAdapter

public class setAutorefreshEnabled extends MoPubView
{

    final MoPubInterstitial a;

    protected final void a()
    {
        MoPubLog.d("Tracking impression for interstitial.");
        if (b != null)
        {
            b.g();
        }
    }

    protected final void a(MoPubErrorCode mopuberrorcode)
    {
        if (MoPubInterstitial.b(a) != null)
        {
            MoPubInterstitial.b(a).onInterstitialFailed(a, mopuberrorcode);
        }
    }

    protected final void a(String s, Map map)
    {
        if (b == null)
        {
            return;
        }
        if (TextUtils.isEmpty(s))
        {
            MoPubLog.d("Couldn't invoke custom event because the server did not specify one.");
            b(MoPubErrorCode.ADAPTER_NOT_FOUND);
            return;
        }
        if (MoPubInterstitial.a(a) != null)
        {
            MoPubInterstitial.a(a).c();
        }
        MoPubLog.d("Loading custom event interstitial adapter.");
        MoPubInterstitial.a(a, CustomEventInterstitialAdapterFactory.create(a, s, map, b.getBroadcastIdentifier(), b.getAdReport()));
        MoPubInterstitial.a(a).a(a);
        MoPubInterstitial.a(a).a();
    }

    public AdFormat getAdFormat()
    {
        return AdFormat.INTERSTITIAL;
    }

    public Factory(MoPubInterstitial mopubinterstitial, Context context)
    {
        a = mopubinterstitial;
        super(context);
        setAutorefreshEnabled(false);
    }
}
