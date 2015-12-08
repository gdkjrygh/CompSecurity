// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.analytics;

import com.adobe.mediacore.timeline.advertising.Ad;
import com.adobe.mediacore.timeline.advertising.AdBreak;
import com.nbcsports.liveextra.library.player.AdPlaybackEventListenerStub;
import com.nbcsports.liveextra.ui.main.core.AssetViewModel;

// Referenced classes of package com.nbcsports.liveextra.analytics:
//            OmniturePlayerAnalytics

class erStub extends AdPlaybackEventListenerStub
{

    final OmniturePlayerAnalytics this$0;

    public void onAdComplete(AdBreak adbreak, Ad ad)
    {
        super.onAdComplete(adbreak, ad);
        logEvent(1);
        if (OmniturePlayerAnalytics.access$000(OmniturePlayerAnalytics.this).isLive())
        {
            logEvent(2);
            return;
        } else
        {
            logEvent(6);
            return;
        }
    }

    public void onAdStart(AdBreak adbreak, Ad ad)
    {
        super.onAdStart(adbreak, ad);
        logEvent(0);
    }

    erStub()
    {
        this$0 = OmniturePlayerAnalytics.this;
        super();
    }
}
