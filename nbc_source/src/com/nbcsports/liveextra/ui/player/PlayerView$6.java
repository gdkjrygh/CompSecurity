// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player;

import com.adobe.mediacore.MediaPlayer;
import com.adobe.mediacore.timeline.advertising.Ad;
import com.adobe.mediacore.timeline.advertising.AdBreak;
import com.adobe.mediacore.timeline.advertising.AdClick;
import org.joda.time.DateTime;
import timber.log.Timber;

// Referenced classes of package com.nbcsports.liveextra.ui.player:
//            PlayerView

class this._cls0
    implements com.adobe.mediacore.dPlaybackEventListener
{

    final PlayerView this$0;

    private void completeAdBreak(AdBreak adbreak)
    {
        if (adbreak.getType().equals(com.adobe.mediacore.timeline.advertising.PRE_ROLL))
        {
            PlayerView.access$502(PlayerView.this, adbreak.getDuration());
            PlayerView.access$1302(PlayerView.this, false);
        }
    }

    public void onAdBreakComplete(AdBreak adbreak)
    {
        Timber.d("AD BREAK COMPLETE CALL", new Object[0]);
        Timber.d("Ad Break Current Time: %s", new Object[] {
            new DateTime(player.getLocalTime())
        });
        completeAdBreak(adbreak);
    }

    public void onAdBreakSkipped(AdBreak adbreak)
    {
        Timber.d("AD BREAK SKIPPED", new Object[0]);
        completeAdBreak(adbreak);
    }

    public void onAdBreakStart(AdBreak adbreak)
    {
        Timber.d((new StringBuilder()).append("adBreak.getDuration(): ").append(adbreak.getDuration()).toString(), new Object[0]);
        Timber.d((new StringBuilder()).append("adBreak.getInitialReplaceDuration(): ").append(adbreak.getInitialReplaceDuration()).toString(), new Object[0]);
        Timber.d((new StringBuilder()).append("adBreak.getReplaceDuration(): ").append(adbreak.getReplaceDuration()).toString(), new Object[0]);
        if (adbreak.getType().equals(com.adobe.mediacore.timeline.advertising.PRE_ROLL))
        {
            if (PlayerView.access$500(PlayerView.this) > 0.0D)
            {
                Timber.d("ADBreak playing again!", new Object[0]);
            }
            PlayerView.access$1302(PlayerView.this, true);
        }
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
            Timber.d("AD START CALL", new Object[0]);
            return;
        }
    }

    k()
    {
        this$0 = PlayerView.this;
        super();
    }
}
