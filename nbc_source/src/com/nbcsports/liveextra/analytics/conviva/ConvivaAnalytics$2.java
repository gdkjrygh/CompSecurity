// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.analytics.conviva;

import com.adobe.mediacore.timeline.advertising.AdBreak;
import com.conviva.LivePass;
import com.nbcsports.liveextra.library.player.AdPlaybackEventListenerStub;
import timber.log.Timber;

// Referenced classes of package com.nbcsports.liveextra.analytics.conviva:
//            ConvivaAnalytics

class rStub extends AdPlaybackEventListenerStub
{

    final ConvivaAnalytics this$0;

    public void onAdBreakComplete(AdBreak adbreak)
    {
        super.onAdBreakComplete(adbreak);
        LivePass.adEnd(ConvivaAnalytics.access$300(ConvivaAnalytics.this));
        try
        {
            LivePass.attachStreamer(ConvivaAnalytics.access$300(ConvivaAnalytics.this), ConvivaAnalytics.access$400(ConvivaAnalytics.this));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (AdBreak adbreak)
        {
            Timber.w(adbreak, "Error reattaching player to Conviva session after ad break", new Object[0]);
        }
    }

    public void onAdBreakStart(AdBreak adbreak)
    {
        super.onAdBreakStart(adbreak);
        LivePass.adStart(ConvivaAnalytics.access$300(ConvivaAnalytics.this));
        try
        {
            LivePass.pauseMonitor(ConvivaAnalytics.access$300(ConvivaAnalytics.this));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (AdBreak adbreak)
        {
            Timber.w(adbreak, "Error pausing Conviva session", new Object[0]);
        }
    }

    rStub()
    {
        this$0 = ConvivaAnalytics.this;
        super();
    }
}
