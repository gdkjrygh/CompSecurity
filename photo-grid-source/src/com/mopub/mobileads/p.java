// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.mobileads;

import com.mopub.common.logging.MoPubLog;

// Referenced classes of package com.mopub.mobileads:
//            MoPubErrorCode, CustomEventInterstitialAdapter

final class p
    implements Runnable
{

    final CustomEventInterstitialAdapter a;

    p(CustomEventInterstitialAdapter customeventinterstitialadapter)
    {
        a = customeventinterstitialadapter;
        super();
    }

    public final void run()
    {
        MoPubLog.d("Third-party network timed out.");
        a.onInterstitialFailed(MoPubErrorCode.NETWORK_TIMEOUT);
        a.c();
    }
}
