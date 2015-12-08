// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player;

import com.adobe.mediacore.timeline.advertising.Ad;
import com.adobe.mediacore.timeline.advertising.AdBreak;
import com.adobe.mediacore.timeline.advertising.AdClick;
import com.nbcsports.liveextra.library.player.AdPlaybackEventListenerStub;
import timber.log.Timber;

// Referenced classes of package com.nbcsports.liveextra.ui.player:
//            AltCamOverlay

class ventListenerStub extends AdPlaybackEventListenerStub
{

    final AltCamOverlay this$0;

    public void onAdBreakComplete(AdBreak adbreak)
    {
        AltCamOverlay.access$202(AltCamOverlay.this, false);
        if (!isShowing())
        {
            showIndicator(true);
        }
    }

    public void onAdBreakSkipped(AdBreak adbreak)
    {
        if (!isShowing())
        {
            showIndicator(true);
        }
    }

    public void onAdBreakStart(AdBreak adbreak)
    {
        AltCamOverlay.access$202(AltCamOverlay.this, true);
        hide();
    }

    public void onAdClick(AdBreak adbreak, Ad ad, AdClick adclick)
    {
    }

    public void onAdComplete(AdBreak adbreak, Ad ad)
    {
        Timber.d("AD COMPLETE CALL", new Object[0]);
    }

    public void onAdProgress(AdBreak adbreak, Ad ad, int i)
    {
    }

    public void onAdStart(AdBreak adbreak, Ad ad)
    {
        if (ad == null)
        {
            return;
        } else
        {
            AltCamOverlay.access$202(AltCamOverlay.this, true);
            hide();
            return;
        }
    }

    ventListenerStub()
    {
        this$0 = AltCamOverlay.this;
        super();
    }
}
