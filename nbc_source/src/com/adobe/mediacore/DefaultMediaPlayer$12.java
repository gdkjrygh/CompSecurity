// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore;

import com.adobe.mediacore.logging.Logger;

// Referenced classes of package com.adobe.mediacore:
//            VideoStateChangedListener, DefaultMediaPlayer, MediaPlayerState, MediaPlayerEvent, 
//            VideoEngineDispatcher, TimelineMonitor, MediaPlayerNotification

class this._cls0
    implements VideoStateChangedListener
{

    final DefaultMediaPlayer this$0;

    public void onStateChanged(MediaPlayerState mediaplayerstate, MediaPlayerNotification mediaplayernotification)
    {
        if (DefaultMediaPlayer.access$1700(DefaultMediaPlayer.this) != e.ERROR) goto _L2; else goto _L1
_L1:
        DefaultMediaPlayer.access$1600(DefaultMediaPlayer.this).w((new StringBuilder()).append(DefaultMediaPlayer.access$1400()).append("#onStateChanged").toString(), "Ignore event as media player is in ERROR state.");
_L4:
        return;
_L2:
        switch (.SwitchMap.com.adobe.mediacore.MediaPlayerState[mediaplayerstate.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            DefaultMediaPlayer.access$1600(DefaultMediaPlayer.this).i((new StringBuilder()).append(DefaultMediaPlayer.access$1400()).append("#onPlayPaused").toString(), "Playback paused.");
            return;

        case 2: // '\002'
            DefaultMediaPlayer.access$1600(DefaultMediaPlayer.this).i((new StringBuilder()).append(DefaultMediaPlayer.access$1400()).append("#onPlayStart").toString(), "Playback started.");
            if (!DefaultMediaPlayer.access$600(DefaultMediaPlayer.this))
            {
                DefaultMediaPlayer.access$700(DefaultMediaPlayer.this);
            }
            DefaultMediaPlayer.access$100(DefaultMediaPlayer.this).dispatch(new MediaPlayerEvent(PLAY_START));
            if (getStatus() == e.COMPLETE)
            {
                setStatus(e.PLAYING, null);
                return;
            }
            break;

        case 3: // '\003'
            DefaultMediaPlayer.access$1600(DefaultMediaPlayer.this).i((new StringBuilder()).append(DefaultMediaPlayer.access$1400()).append("#onPlaybackComplete").toString(), "Playback completed.");
            if (DefaultMediaPlayer.access$900(DefaultMediaPlayer.this) != null)
            {
                DefaultMediaPlayer.access$900(DefaultMediaPlayer.this).updateCurrentAdInfo(null);
            }
            DefaultMediaPlayer.access$2200(DefaultMediaPlayer.this);
            setStatus(e.COMPLETE, null);
            DefaultMediaPlayer.access$100(DefaultMediaPlayer.this).dispatch(new MediaPlayerEvent(PLAY_COMPLETE));
            return;

        case 4: // '\004'
            DefaultMediaPlayer.access$1600(DefaultMediaPlayer.this).i((new StringBuilder()).append(DefaultMediaPlayer.access$1400()).append("#onStateChanged").toString(), "Playback suspended");
            setStatus(e.SUSPENDED, null);
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    n()
    {
        this$0 = DefaultMediaPlayer.this;
        super();
    }
}
