// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.mraid;

import android.view.View;
import com.mopub.mobileads.AdViewController;
import com.mopub.mobileads.MoPubErrorCode;

// Referenced classes of package com.mopub.mraid:
//            MraidBanner

final class a
    implements MraidController.MraidListener
{

    final MraidBanner a;

    a(MraidBanner mraidbanner)
    {
        a = mraidbanner;
        super();
    }

    public final void onClose()
    {
        MraidBanner.a(a).onBannerCollapsed();
    }

    public final void onExpand()
    {
        MraidBanner.a(a).onBannerExpanded();
        MraidBanner.a(a).onBannerClicked();
    }

    public final void onFailedToLoad()
    {
        MraidBanner.a(a).onBannerFailed(MoPubErrorCode.MRAID_LOAD_ERROR);
    }

    public final void onLoaded(View view)
    {
        AdViewController.setShouldHonorServerDimensions(view);
        MraidBanner.a(a).onBannerLoaded(view);
    }

    public final void onOpen()
    {
        MraidBanner.a(a).onBannerClicked();
    }
}
