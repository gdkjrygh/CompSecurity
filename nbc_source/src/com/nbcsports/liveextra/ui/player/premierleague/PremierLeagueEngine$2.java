// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player.premierleague;

import com.adobe.mediacore.MediaPlayer;
import com.adobe.mediacore.MediaPlayerNotification;
import com.adobe.mediacore.metadata.Metadata;
import com.adobe.mediacore.metadata.TimedMetadata;
import com.adobe.mediacore.qos.metrics.PlaybackMetrics;
import com.nbcsports.liveextra.library.player.PlaybackEventListenerStub;
import com.nbcsports.liveextra.ui.main.core.AssetViewModel;
import com.nbcsports.liveextra.ui.player.premierleague.core.TimeUtils;
import org.joda.time.DateTime;
import timber.log.Timber;

// Referenced classes of package com.nbcsports.liveextra.ui.player.premierleague:
//            PremierLeagueEngine

class > extends PlaybackEventListenerStub
{

    final PremierLeagueEngine this$0;

    public void onStateChanged(com.adobe.mediacore.e e, MediaPlayerNotification mediaplayernotification)
    {
        super.onStateChanged(e, mediaplayernotification);
        .SwitchMap.com.adobe.mediacore.MediaPlayer.PlayerState[e.ordinal()];
        JVM INSTR tableswitch 1 4: default 44
    //                   1 45
    //                   2 63
    //                   3 63
    //                   4 63;
           goto _L1 _L2 _L3 _L3 _L3
_L1:
        return;
_L2:
        if (!PremierLeagueEngine.access$600(PremierLeagueEngine.this))
        {
            PremierLeagueEngine.access$200(PremierLeagueEngine.this);
            return;
        }
          goto _L1
_L3:
        PremierLeagueEngine.access$100(PremierLeagueEngine.this);
        return;
    }

    public void onTimedMetadata(TimedMetadata timedmetadata)
    {
        super.onTimedMetadata(timedmetadata);
        if (PremierLeagueEngine.access$400(PremierLeagueEngine.this) == null)
        {
            if (timedmetadata.getName().equals("#EXT-X-PROGRAM-DATE-TIME"))
            {
                try
                {
                    timedmetadata = DateTime.parse(TimeUtils.normalizeTimestamp(timedmetadata.getMetadata().getValue("DATA")));
                    if (PremierLeagueEngine.access$400(PremierLeagueEngine.this) == null)
                    {
                        PremierLeagueEngine.access$402(PremierLeagueEngine.this, timedmetadata);
                        PremierLeagueEngine.access$502(PremierLeagueEngine.this, PremierLeagueEngine.access$400(PremierLeagueEngine.this));
                        Timber.d((new StringBuilder()).append("Program start time set to: ").append(PremierLeagueEngine.access$500(PremierLeagueEngine.this).toString()).toString(), new Object[0]);
                        PremierLeagueEngine.access$200(PremierLeagueEngine.this);
                    }
                }
                // Misplaced declaration of an exception variable
                catch (TimedMetadata timedmetadata)
                {
                    Timber.d(timedmetadata, "Exception while setting encoderStartTime", new Object[0]);
                }
            }
            if (PremierLeagueEngine.access$400(PremierLeagueEngine.this) == null && PremierLeagueEngine.access$500(PremierLeagueEngine.this) == null && viewModel.isLive())
            {
                PremierLeagueEngine.access$502(PremierLeagueEngine.this, DateTime.now().minus(PremierLeagueEngine.access$300(PremierLeagueEngine.this).getPlaybackMetrics().getTime()));
                Timber.d((new StringBuilder()).append("Program start set from DateTime.now(): ").append(PremierLeagueEngine.access$500(PremierLeagueEngine.this).toString()).toString(), new Object[0]);
                PremierLeagueEngine.access$200(PremierLeagueEngine.this);
                return;
            }
        }
    }

    public void onTimelineUpdated()
    {
        super.onTimelineUpdated();
    }

    ()
    {
        this$0 = PremierLeagueEngine.this;
        super();
    }
}
