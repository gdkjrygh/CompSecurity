// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.cloud;

import com.mopub.mobileads.MoPubErrorCode;
import com.mopub.mobileads.MoPubView;

// Referenced classes of package com.roidapp.photogrid.cloud:
//            a

final class c
    implements com.mopub.mobileads.MoPubView.BannerAdListener
{

    final a a;

    c(a a1)
    {
        a = a1;
        super();
    }

    public final void onBannerClicked(MoPubView mopubview)
    {
        com.roidapp.photogrid.cloud.a.a(com.roidapp.photogrid.cloud.a.b(a), 4, 7);
    }

    public final void onBannerCollapsed(MoPubView mopubview)
    {
    }

    public final void onBannerExpanded(MoPubView mopubview)
    {
    }

    public final void onBannerFailed(MoPubView mopubview, MoPubErrorCode mopuberrorcode)
    {
        if (com.roidapp.photogrid.cloud.a.f(a) != null)
        {
            com.roidapp.photogrid.cloud.a.f(a).destroy();
            com.roidapp.photogrid.cloud.a.g(a);
        }
        com.roidapp.photogrid.cloud.a.a(a);
    }

    public final void onBannerLoaded(MoPubView mopubview)
    {
        com.roidapp.photogrid.cloud.a.a(com.roidapp.photogrid.cloud.a.b(a), 1, 7);
    }
}
