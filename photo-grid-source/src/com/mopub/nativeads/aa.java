// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.nativeads;

import com.mopub.common.logging.MoPubLog;

// Referenced classes of package com.mopub.nativeads:
//            MoPubStreamAdPlacer

final class aa
    implements PositioningSource.PositioningListener
{

    final MoPubStreamAdPlacer a;

    aa(MoPubStreamAdPlacer mopubstreamadplacer)
    {
        a = mopubstreamadplacer;
        super();
    }

    public final void onFailed()
    {
        MoPubLog.d("Unable to show ads because ad positions could not be loaded from the MoPub ad server.");
    }

    public final void onLoad(MoPubNativeAdPositioning.MoPubClientPositioning mopubclientpositioning)
    {
        a.a(mopubclientpositioning);
    }
}
