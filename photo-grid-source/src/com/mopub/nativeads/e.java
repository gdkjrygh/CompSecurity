// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.nativeads;

import android.os.Handler;

// Referenced classes of package com.mopub.nativeads:
//            PositioningSource, MoPubNativeAdPositioning, f

final class e
    implements PositioningSource
{

    private final Handler a = new Handler();
    private final MoPubNativeAdPositioning.MoPubClientPositioning b;

    e(MoPubNativeAdPositioning.MoPubClientPositioning mopubclientpositioning)
    {
        b = MoPubNativeAdPositioning.a(mopubclientpositioning);
    }

    static MoPubNativeAdPositioning.MoPubClientPositioning a(e e1)
    {
        return e1.b;
    }

    public final void loadPositions(String s, PositioningSource.PositioningListener positioninglistener)
    {
        a.post(new f(this, positioninglistener));
    }
}
