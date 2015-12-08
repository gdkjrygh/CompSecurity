// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.analytics.conviva;

import com.adobe.mediacore.MediaPlayer;
import com.adobe.mediacore.MediaPlayerItem;
import com.adobe.mediacore.MediaPlayerNotification;
import com.adobe.mediacore.MediaResource;
import com.adobe.mediacore.Version;
import com.adobe.mediacore.qos.metrics.PlaybackMetrics;
import com.adobe.mediacore.timeline.advertising.AdBreak;
import com.adobe.mediacore.utils.TimeRange;
import com.conviva.ConvivaStreamerProxy;
import com.conviva.LivePass;
import com.conviva.StreamerError;
import com.conviva.monitor.IMonitorNotifier;
import com.nbcsports.liveextra.library.player.AdPlaybackEventListenerStub;
import com.nbcsports.liveextra.library.player.PlaybackEventListenerStub;
import com.nbcsports.liveextra.library.player.QosEventListenerStub;
import java.util.HashMap;

public class PrimetimeCustomMediaPlayerProxy
    implements ConvivaStreamerProxy
{

    private com.adobe.mediacore.MediaPlayer.EventListener adListener;
    private long duration;
    private boolean isInAdBreak;
    private boolean isMonitored;
    private IMonitorNotifier notifier;
    private com.adobe.mediacore.MediaPlayer.EventListener playbackListener;
    private final MediaPlayer player;
    private com.adobe.mediacore.MediaPlayer.EventListener qosListener;
    private int sessionId;

    public PrimetimeCustomMediaPlayerProxy(MediaPlayer mediaplayer)
    {
        playbackListener = new PlaybackEventListenerStub() {

            final PrimetimeCustomMediaPlayerProxy this$0;

            public void onPlayStart()
            {
                super.onPlayStart();
                setPlayingState(3);
            }

            public void onStateChanged(com.adobe.mediacore.MediaPlayer.PlayerState playerstate, MediaPlayerNotification mediaplayernotification)
            {
                super.onStateChanged(playerstate, mediaplayernotification);
                static class _cls4
                {

                    static final int $SwitchMap$com$adobe$mediacore$MediaPlayer$PlayerState[];

                    static 
                    {
                        $SwitchMap$com$adobe$mediacore$MediaPlayer$PlayerState = new int[com.adobe.mediacore.MediaPlayer.PlayerState.values().length];
                        try
                        {
                            $SwitchMap$com$adobe$mediacore$MediaPlayer$PlayerState[com.adobe.mediacore.MediaPlayer.PlayerState.PLAYING.ordinal()] = 1;
                        }
                        catch (NoSuchFieldError nosuchfielderror3) { }
                        try
                        {
                            $SwitchMap$com$adobe$mediacore$MediaPlayer$PlayerState[com.adobe.mediacore.MediaPlayer.PlayerState.PAUSED.ordinal()] = 2;
                        }
                        catch (NoSuchFieldError nosuchfielderror2) { }
                        try
                        {
                            $SwitchMap$com$adobe$mediacore$MediaPlayer$PlayerState[com.adobe.mediacore.MediaPlayer.PlayerState.COMPLETE.ordinal()] = 3;
                        }
                        catch (NoSuchFieldError nosuchfielderror1) { }
                        try
                        {
                            $SwitchMap$com$adobe$mediacore$MediaPlayer$PlayerState[com.adobe.mediacore.MediaPlayer.PlayerState.ERROR.ordinal()] = 4;
                        }
                        catch (NoSuchFieldError nosuchfielderror)
                        {
                            return;
                        }
                    }
                }

                _cls4..SwitchMap.com.adobe.mediacore.MediaPlayer.PlayerState[playerstate.ordinal()];
                JVM INSTR tableswitch 1 4: default 44
            //                           1 45
            //                           2 64
            //                           3 84
            //                           4 103;
                   goto _L1 _L2 _L3 _L4 _L5
_L1:
                return;
_L2:
                if (isMonitored)
                {
                    setPlayingState(3);
                    return;
                }
                continue; /* Loop/switch isn't completed */
_L3:
                if (isMonitored)
                {
                    setPlayingState(12);
                    return;
                }
                continue; /* Loop/switch isn't completed */
_L4:
                if (isMonitored)
                {
                    setPlayingState(1);
                    return;
                }
                continue; /* Loop/switch isn't completed */
_L5:
                if (mediaplayernotification.getType().equals(com.adobe.mediacore.MediaPlayerNotification.EntryType.ERROR) && notifier != null)
                {
                    notifier.OnError(StreamerError.makeUnscopedError(Long.toString(mediaplayernotification.getCode().getCode()), 1));
                    return;
                }
                if (true) goto _L1; else goto _L6
_L6:
            }

            
            {
                this$0 = PrimetimeCustomMediaPlayerProxy.this;
                super();
            }
        };
        adListener = new AdPlaybackEventListenerStub() {

            final PrimetimeCustomMediaPlayerProxy this$0;

            public void onAdBreakComplete(AdBreak adbreak)
            {
                super.onAdBreakComplete(adbreak);
                LivePass.adEnd(sessionId);
                isInAdBreak = false;
                setPlayingState(3);
            }

            public void onAdBreakStart(AdBreak adbreak)
            {
                super.onAdBreakStart(adbreak);
                isInAdBreak = true;
                LivePass.adStart(sessionId);
                setPlayingState(98);
            }

            
            {
                this$0 = PrimetimeCustomMediaPlayerProxy.this;
                super();
            }
        };
        qosListener = new QosEventListenerStub() {

            final PrimetimeCustomMediaPlayerProxy this$0;

            public void onBufferComplete()
            {
                super.onBufferComplete();
                setPlayingState(3);
            }

            public void onBufferStart()
            {
                super.onBufferStart();
                setPlayingState(6);
            }

            
            {
                this$0 = PrimetimeCustomMediaPlayerProxy.this;
                super();
            }
        };
        player = mediaplayer;
        mediaplayer.addEventListener(com.adobe.mediacore.MediaPlayer.Event.PLAYBACK, playbackListener);
        mediaplayer.addEventListener(com.adobe.mediacore.MediaPlayer.Event.AD_PLAYBACK, adListener);
        mediaplayer.addEventListener(com.adobe.mediacore.MediaPlayer.Event.QOS, qosListener);
    }

    private void setPlayingState(int i)
    {
        if (notifier == null)
        {
            return;
        }
        boolean flag;
        if (i != 98 && i != 100)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        isMonitored = flag;
        notifier.SetPlayingState(i);
    }

    private void updateDuration(long l)
    {
        if (l > 0L && notifier != null)
        {
            HashMap hashmap = new HashMap();
            hashmap.put("duration", String.valueOf(duration));
            notifier.OnMetadata(hashmap);
        }
    }

    public void Cleanup()
    {
        notifier = null;
        sessionId = -1;
        if (player != null && player.getStatus() != com.adobe.mediacore.MediaPlayer.PlayerState.RELEASED)
        {
            player.removeEventListener(com.adobe.mediacore.MediaPlayer.Event.PLAYBACK, playbackListener);
            player.removeEventListener(com.adobe.mediacore.MediaPlayer.Event.AD_PLAYBACK, adListener);
            player.removeEventListener(com.adobe.mediacore.MediaPlayer.Event.QOS, qosListener);
        }
    }

    public int GetBufferLengthMs()
    {
        if (player != null && player.getPlaybackMetrics() != null)
        {
            return (int)player.getPlaybackMetrics().getBufferLength();
        } else
        {
            return -1;
        }
    }

    public int GetCapabilities()
    {
        return 23;
    }

    public int GetDroppedFrames()
    {
        if (player != null && player.getPlaybackMetrics() != null)
        {
            return (int)player.getPlaybackMetrics().getDroppedFramesCount();
        } else
        {
            return -1;
        }
    }

    public int GetIsLive()
    {
        return player == null || player.getCurrentItem() == null || !player.getCurrentItem().isLive() ? 0 : 1;
    }

    public int GetMinBufferLengthMs()
    {
        return -1;
    }

    public int GetPlayheadTimeMs()
    {
        if (player == null)
        {
            return -1;
        }
        if (isMonitored)
        {
            Object obj = player.getPlaybackMetrics();
            if (obj != null)
            {
                long l = ((PlaybackMetrics) (obj)).getBitrate();
                if (l > 0L && notifier != null)
                {
                    notifier.SetStream((int)(l / 1000L), null, null);
                }
            }
            obj = player.getPlaybackRange();
            if (obj != null && duration <= 0L)
            {
                duration = ((TimeRange) (obj)).getDuration();
                if (duration > 0L)
                {
                    updateDuration(duration);
                }
            }
        }
        return (int)player.getCurrentTime();
    }

    public double GetRenderedFrameRate()
    {
        if (player != null && player.getPlaybackMetrics() != null)
        {
            return (double)player.getPlaybackMetrics().getFrameRate();
        } else
        {
            return -1D;
        }
    }

    public String GetServerAddress()
    {
        if (player != null && player.getCurrentItem() != null && player.getCurrentItem().getResource() != null)
        {
            return player.getCurrentItem().getResource().getUrl();
        } else
        {
            return null;
        }
    }

    public int GetStartingBufferLengthMs()
    {
        return -1;
    }

    public String GetStreamerType()
    {
        return getClass().getSimpleName();
    }

    public String GetStreamerVersion()
    {
        return Version.getVersion();
    }

    public void setMonitoringNotifier(IMonitorNotifier imonitornotifier)
    {
        notifier = imonitornotifier;
    }

    public void setSessionId(int i)
    {
        sessionId = i;
    }





/*
    static boolean access$302(PrimetimeCustomMediaPlayerProxy primetimecustommediaplayerproxy, boolean flag)
    {
        primetimecustommediaplayerproxy.isInAdBreak = flag;
        return flag;
    }

*/

}
