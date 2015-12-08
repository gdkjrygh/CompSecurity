// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.analytics;

import com.adobe.mediacore.timeline.advertising.Ad;
import com.adobe.mediacore.timeline.advertising.AdBreak;
import com.nbcsports.liveextra.library.player.AdPlaybackEventListenerStub;

// Referenced classes of package com.nbcsports.liveextra.analytics:
//            StreamSenseAnalytics

class tenerStub extends AdPlaybackEventListenerStub
{

    final StreamSenseAnalytics this$0;

    public void onAdComplete(AdBreak adbreak, Ad ad)
    {
        super.onAdComplete(adbreak, ad);
        setClip(null);
    }

    public void onAdStart(AdBreak adbreak, Ad ad)
    {
        super.onAdStart(adbreak, ad);
        setClip(Integer.valueOf((int)adbreak.size()));
    }

    tenerStub()
    {
        this$0 = StreamSenseAnalytics.this;
        super();
    }
}
