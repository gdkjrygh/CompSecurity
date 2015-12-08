// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.nativeads;


// Referenced classes of package com.mopub.nativeads:
//            ah, MoPubStreamAdPlacer

final class ab
    implements ah
{

    final MoPubStreamAdPlacer a;

    ab(MoPubStreamAdPlacer mopubstreamadplacer)
    {
        a = mopubstreamadplacer;
        super();
    }

    public final void onAdsAvailable()
    {
        a.a();
    }
}
