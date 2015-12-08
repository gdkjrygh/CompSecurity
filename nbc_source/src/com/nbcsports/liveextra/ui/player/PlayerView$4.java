// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player;

import android.widget.ImageView;
import com.adobe.mediacore.MediaPlayer;
import com.adobe.mediacore.MediaPlayerItem;
import com.adobe.mediacore.MediaPlayerNotification;
import com.adobe.mediacore.metadata.TimedMetadata;
import com.nbcsports.liveextra.library.player.PlaybackEventListenerStub;
import com.nbcsports.liveextra.ui.main.core.AssetViewModel;
import org.joda.time.DateTime;
import timber.log.Timber;

// Referenced classes of package com.nbcsports.liveextra.ui.player:
//            PlayerView, PlayerActivity, PlayerFrameLayout

class EventListenerStub extends PlaybackEventListenerStub
{

    final PlayerView this$0;

    public void onPlayComplete()
    {
        activity.keepScreenOn(false);
        if (PlayerView.access$800(PlayerView.this).isLive() && activity != null && !activity.isFinishing())
        {
            activity.finish();
        }
    }

    public void onPlayStart()
    {
        if (!PlayerView.access$600(PlayerView.this).equals(com.adobe.mediacore.layerState.IDLE))
        {
            player.pause();
        }
        Timber.d("Play Start Current Time: %s", new Object[] {
            new DateTime(player.getLocalTime())
        });
        activity.keepScreenOn(true);
        posterArt.setVisibility(8);
        PlayerView.access$700(PlayerView.this);
    }

    public void onPrepared()
    {
        PlayerView.access$300(PlayerView.this);
        MediaPlayerItem mediaplayeritem = player.getCurrentItem();
        Timber.d("OnPrepared Local Time: %s", new Object[] {
            new DateTime(player.getLocalTime())
        });
        if (mediaplayeritem != null)
        {
            if (PlayerView.access$400(PlayerView.this) != null && !mediaplayeritem.isLive())
            {
                Timber.d("OnPrepared Last Known Time: %s", new Object[] {
                    new DateTime(PlayerView.access$400(PlayerView.this))
                });
                player.seekToLocalTime((long)((double)PlayerView.access$400(PlayerView.this).longValue() + PlayerView.access$500(PlayerView.this)));
            }
            if (!PlayerView.access$600(PlayerView.this).equals(com.adobe.mediacore.layerState.PAUSED) && !PlayerView.access$600(PlayerView.this).equals(com.adobe.mediacore.layerState.SUSPENDED))
            {
                player.play();
            }
            PlayerView.access$602(PlayerView.this, com.adobe.mediacore.layerState.IDLE);
        }
    }

    public void onSizeAvailable(long l, long l1)
    {
        if (l1 != PlayerView.access$1000(PlayerView.this) || l != PlayerView.access$1100(PlayerView.this))
        {
            PlayerView.access$1002(PlayerView.this, l1);
            PlayerView.access$1102(PlayerView.this, l);
            setPlayerViewSize(playerFrame.getWidth(), playerFrame.getHeight());
        }
    }

    public void onStateChanged(com.adobe.mediacore.layerState layerstate, MediaPlayerNotification mediaplayernotification)
    {
        switch (.SwitchMap.com.adobe.mediacore.MediaPlayer.PlayerState[layerstate.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            activity.keepScreenOn(false);
            return;

        case 2: // '\002'
            activity.keepScreenOn(true);
            return;

        case 3: // '\003'
            player.prepareToPlay();
            return;

        case 4: // '\004'
            PlayerView.access$902(PlayerView.this, layerstate);
            return;

        case 5: // '\005'
            activity.keepScreenOn(false);
            PlayerView.access$902(PlayerView.this, layerstate);
            return;

        case 6: // '\006'
            activity.keepScreenOn(false);
            posterArt.setVisibility(0);
            PlayerView.access$902(PlayerView.this, layerstate);
            return;

        case 7: // '\007'
            PlayerView.access$200(PlayerView.this, layerstate, mediaplayernotification);
            break;
        }
    }

    public void onTimedMetadata(TimedMetadata timedmetadata)
    {
        super.onTimedMetadata(timedmetadata);
        Timber.d((new StringBuilder()).append("Qos Timed Metadata: ").append(timedmetadata.getMetadata().toString()).toString(), new Object[0]);
    }

    public void onTimelineUpdated()
    {
    }

    yout()
    {
        this$0 = PlayerView.this;
        super();
    }
}
