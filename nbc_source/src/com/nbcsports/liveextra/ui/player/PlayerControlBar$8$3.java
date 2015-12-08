// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player;

import android.view.View;
import android.widget.ImageButton;
import android.widget.SeekBar;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.adobe.mediacore.MediaPlayer;
import com.adobe.mediacore.MediaPlayerItem;
import com.adobe.mediacore.MediaPlayerNotification;
import com.adobe.mediacore.metadata.TimedMetadata;
import com.adobe.mediacore.utils.TimeRange;
import com.nbcsports.liveextra.library.player.PlaybackEventListenerStub;
import com.nbcsports.liveextra.library.preferences.AppPreferences;
import java.util.List;
import rx.Subscription;

// Referenced classes of package com.nbcsports.liveextra.ui.player:
//            PlayerControlBar, SeekBarOverlay

class this._cls1
    implements butterknife..PlayerControlBar._cls8._cls3
{

    final apply this$1;

    public volatile void apply(View view, int i)
    {
        apply((ImageButton)view, i);
    }

    public void apply(ImageButton imagebutton, int i)
    {
        imagebutton.setImageResource(0x7f020134);
    }

    tenerStub()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class com/nbcsports/liveextra/ui/player/PlayerControlBar$8

/* anonymous class */
    class PlayerControlBar._cls8 extends PlaybackEventListenerStub
    {

        final PlayerControlBar this$0;

        public void onPlayStart()
        {
            super.onPlayStart();
            PlayerControlBar.access$202(PlayerControlBar.this, true);
        }

        public void onPrepared()
        {
            super.onPrepared();
            seekbar.setMax((int)player.getPlaybackRange().getDuration());
        }

        public void onStateChanged(com.adobe.mediacore.MediaPlayer.PlayerState playerstate, MediaPlayerNotification mediaplayernotification)
        {
            boolean flag;
            byte byte0;
            flag = false;
            byte0 = 4;
            if (playButtons != null) goto _L2; else goto _L1
_L1:
            return;
_L2:
            switch (PlayerControlBar._cls13.$SwitchMap$com$adobe$mediacore$MediaPlayer$PlayerState[playerstate.ordinal()])
            {
            default:
                return;

            case 1: // '\001'
                ButterKnife.apply(playButtons, new PlayerControlBar._cls8._cls1());
                return;

            case 2: // '\002'
                if (playBar != null)
                {
                    playBar.setVisibility(8);
                }
                // fall through

            case 3: // '\003'
                ButterKnife.apply(playButtons, new PlayerControlBar._cls8._cls2());
                PlayerControlBar.access$602(PlayerControlBar.this, player.getCurrentItem());
                playerstate = seekbar;
                int i;
                if (PlayerControlBar.access$600(PlayerControlBar.this).isLive())
                {
                    i = 4;
                } else
                {
                    i = 0;
                }
                playerstate.setVisibility(i);
                playerstate = seekbarOverlay;
                if (PlayerControlBar.access$600(PlayerControlBar.this).isLive())
                {
                    i = 4;
                } else
                {
                    i = 0;
                }
                playerstate.setVisibility(i);
                playerstate = durationClock;
                if (PlayerControlBar.access$600(PlayerControlBar.this).isLive())
                {
                    i = byte0;
                } else
                {
                    i = 0;
                }
                playerstate.setVisibility(i);
                playerstate = skipPrevButton;
                if (PlayerControlBar.access$600(PlayerControlBar.this).isLive())
                {
                    i = 8;
                } else
                {
                    i = 0;
                }
                playerstate.setVisibility(i);
                playerstate = ccButton;
                if (PlayerControlBar.access$600(PlayerControlBar.this).getClosedCaptionsTracks().size() > 0)
                {
                    i = ((flag) ? 1 : 0);
                } else
                {
                    i = 8;
                }
                playerstate.setVisibility(i);
                ccButton.setSelected(preferences.enableClosedCaptions());
                mediaplayernotification = player;
                if (preferences.enableClosedCaptions())
                {
                    playerstate = com.adobe.mediacore.MediaPlayer.Visibility.VISIBLE;
                } else
                {
                    playerstate = com.adobe.mediacore.MediaPlayer.Visibility.INVISIBLE;
                }
                mediaplayernotification.setCCVisibility(playerstate);
                return;

            case 4: // '\004'
                PlayerControlBar.access$802(PlayerControlBar.this, playerstate);
                PlayerControlBar.access$300(PlayerControlBar.this);
                ButterKnife.apply(playButtons, new PlayerControlBar._cls8._cls3());
                if (PlayerControlBar.access$000(PlayerControlBar.this) == null || PlayerControlBar.access$000(PlayerControlBar.this).isUnsubscribed())
                {
                    postDelayed(new PlayerControlBar._cls8._cls4(), 500L);
                }
                hide();
                return;

            case 5: // '\005'
                PlayerControlBar.access$802(PlayerControlBar.this, playerstate);
                ButterKnife.apply(playButtons, new PlayerControlBar._cls8._cls5());
                if (PlayerControlBar.access$000(PlayerControlBar.this) != null)
                {
                    PlayerControlBar.access$000(PlayerControlBar.this).unsubscribe();
                }
                show();
                removeCallbacks(PlayerControlBar.access$1000(PlayerControlBar.this));
                return;

            case 6: // '\006'
                PlayerControlBar.access$802(PlayerControlBar.this, playerstate);
                ButterKnife.apply(playButtons, new PlayerControlBar._cls8._cls6());
                seekbar.setVisibility(4);
                seekbarOverlay.setVisibility(4);
                durationClock.setVisibility(4);
                playClock.setVisibility(4);
                if (ccButton.getVisibility() == 0)
                {
                    ccButton.setVisibility(4);
                }
                if (aaButton.getVisibility() == 0)
                {
                    aaButton.setVisibility(4);
                }
                if (skipPrevButton.getVisibility() == 0)
                {
                    skipPrevButton.setVisibility(4);
                }
                show();
                removeCallbacks(PlayerControlBar.access$1000(PlayerControlBar.this));
                return;

            case 7: // '\007'
                ButterKnife.apply(playButtons, new PlayerControlBar._cls8._cls7());
                return;

            case 8: // '\b'
                break;
            }
            if (true) goto _L1; else goto _L3
_L3:
        }

        public void onTimedMetadata(TimedMetadata timedmetadata)
        {
            super.onTimedMetadata(timedmetadata);
            seekbarOverlay.updateCues(timedmetadata);
        }

        public void onTimelineUpdated()
        {
            super.onTimelineUpdated();
            if (player == null || PlayerControlBar.access$600(PlayerControlBar.this).isLive())
            {
                return;
            } else
            {
                seekbarOverlay.updateMarkers(player.getTimeline(), player.getPlaybackRange().getDuration());
                return;
            }
        }

            
            {
                this$0 = PlayerControlBar.this;
                super();
            }

        // Unreferenced inner class com/nbcsports/liveextra/ui/player/PlayerControlBar$8$1

/* anonymous class */
        class PlayerControlBar._cls8._cls1
            implements butterknife.ButterKnife.Action
        {

            final PlayerControlBar._cls8 this$1;

            public volatile void apply(View view, int i)
            {
                apply((ImageButton)view, i);
            }

            public void apply(ImageButton imagebutton, int i)
            {
                imagebutton.setImageDrawable(null);
            }

                    
                    {
                        this$1 = PlayerControlBar._cls8.this;
                        super();
                    }
        }


        // Unreferenced inner class com/nbcsports/liveextra/ui/player/PlayerControlBar$8$2

/* anonymous class */
        class PlayerControlBar._cls8._cls2
            implements butterknife.ButterKnife.Action
        {

            final PlayerControlBar._cls8 this$1;

            public volatile void apply(View view, int i)
            {
                apply((ImageButton)view, i);
            }

            public void apply(ImageButton imagebutton, int i)
            {
                imagebutton.setImageDrawable(null);
            }

                    
                    {
                        this$1 = PlayerControlBar._cls8.this;
                        super();
                    }
        }


        // Unreferenced inner class com/nbcsports/liveextra/ui/player/PlayerControlBar$8$4

/* anonymous class */
        class PlayerControlBar._cls8._cls4
            implements Runnable
        {

            final PlayerControlBar._cls8 this$1;

            public void run()
            {
                PlayerControlBar.access$002(this$0, PlayerControlBar.access$900(this$0));
            }

                    
                    {
                        this$1 = PlayerControlBar._cls8.this;
                        super();
                    }
        }


        // Unreferenced inner class com/nbcsports/liveextra/ui/player/PlayerControlBar$8$5

/* anonymous class */
        class PlayerControlBar._cls8._cls5
            implements butterknife.ButterKnife.Action
        {

            final PlayerControlBar._cls8 this$1;

            public volatile void apply(View view, int i)
            {
                apply((ImageButton)view, i);
            }

            public void apply(ImageButton imagebutton, int i)
            {
                imagebutton.setImageResource(0x7f020135);
            }

                    
                    {
                        this$1 = PlayerControlBar._cls8.this;
                        super();
                    }
        }


        // Unreferenced inner class com/nbcsports/liveextra/ui/player/PlayerControlBar$8$6

/* anonymous class */
        class PlayerControlBar._cls8._cls6
            implements butterknife.ButterKnife.Action
        {

            final PlayerControlBar._cls8 this$1;

            public volatile void apply(View view, int i)
            {
                apply((ImageButton)view, i);
            }

            public void apply(ImageButton imagebutton, int i)
            {
                imagebutton.setImageResource(0x7f020136);
            }

                    
                    {
                        this$1 = PlayerControlBar._cls8.this;
                        super();
                    }
        }


        // Unreferenced inner class com/nbcsports/liveextra/ui/player/PlayerControlBar$8$7

/* anonymous class */
        class PlayerControlBar._cls8._cls7
            implements butterknife.ButterKnife.Action
        {

            final PlayerControlBar._cls8 this$1;

            public volatile void apply(View view, int i)
            {
                apply((ImageButton)view, i);
            }

            public void apply(ImageButton imagebutton, int i)
            {
                imagebutton.setImageResource(0x7f0200b7);
            }

                    
                    {
                        this$1 = PlayerControlBar._cls8.this;
                        super();
                    }
        }

    }

}
