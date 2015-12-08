// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.nativeads;


// Referenced classes of package com.mopub.nativeads:
//            MoPubNativeAdLoadedListener, MoPubAdAdapter

final class m
    implements MoPubNativeAdLoadedListener
{

    final MoPubAdAdapter a;

    m(MoPubAdAdapter mopubadadapter)
    {
        a = mopubadadapter;
        super();
    }

    public final void onAdLoaded(int i)
    {
        a.a(i);
    }

    public final void onAdRemoved(int i)
    {
        a.b(i);
    }
}
