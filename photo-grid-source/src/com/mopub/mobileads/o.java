// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.mobileads;

import com.mopub.common.logging.MoPubLog;

// Referenced classes of package com.mopub.mobileads:
//            MoPubErrorCode, CustomEventBannerAdapter

final class o
    implements Runnable
{

    final CustomEventBannerAdapter a;

    o(CustomEventBannerAdapter customeventbanneradapter)
    {
        a = customeventbanneradapter;
        super();
    }

    public final void run()
    {
        MoPubLog.d("Third-party network timed out.");
        a.onBannerFailed(MoPubErrorCode.NETWORK_TIMEOUT);
        a.b();
    }
}
