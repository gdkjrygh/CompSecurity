// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.conviva.streamerProxies.adobe;

import com.adobe.mediacore.MediaPlayer;
import com.adobe.mediacore.MediaPlayerNotification;
import com.adobe.mediacore.Version;
import com.adobe.mediacore.metadata.TimedMetadata;
import com.adobe.mediacore.qos.LoadInfo;
import com.adobe.mediacore.qos.metrics.PlaybackMetrics;
import com.adobe.mediacore.utils.TimeRange;
import com.conviva.ConvivaStreamerProxy;
import com.conviva.StreamerError;
import com.conviva.monitor.IMonitorNotifier;
import com.conviva.utils.PlatformUtils;
import java.util.HashMap;
import java.util.Map;

public class PrimeTimeDefaultMediaPlayerProxy
    implements ConvivaStreamerProxy
{

    private String LOG_TAG;
    protected long _duration;
    private boolean _mBuffering;
    protected MediaPlayer _mPlayer;
    protected IMonitorNotifier _notifier;
    protected PlatformUtils _utils;
    private final com.adobe.mediacore.MediaPlayer.PlaybackEventListener playbackEventListener = new com.adobe.mediacore.MediaPlayer.PlaybackEventListener() {

        final PrimeTimeDefaultMediaPlayerProxy this$0;

        public void onPlayComplete()
        {
        }

        public void onPlayStart()
        {
        }

        public void onPrepared()
        {
        }

        public void onProfileChanged(long l, long l1)
        {
        }

        public void onRatePlaying(float f)
        {
        }

        public void onRateSelected(float f)
        {
        }

        public void onReplaceMediaPlayerItem()
        {
        }

        public void onSizeAvailable(long l, long l1)
        {
        }

        public void onStateChanged(com.adobe.mediacore.MediaPlayer.PlayerState playerstate, MediaPlayerNotification mediaplayernotification)
        {
            _cls3..SwitchMap.com.adobe.mediacore.MediaPlayer.PlayerState[playerstate.ordinal()];
            JVM INSTR tableswitch 1 1: default 28
        //                       1 29;
               goto _L1 _L2
_L1:
            return;
_L2:
            if (mediaplayernotification == null) goto _L1; else goto _L3
_L3:
            try
            {
                for (; mediaplayernotification.getInnerNotification() != null; mediaplayernotification = mediaplayernotification.getInnerNotification()) { }
            }
            // Misplaced declaration of an exception variable
            catch (com.adobe.mediacore.MediaPlayer.PlayerState playerstate)
            {
                return;
            }
            onError((new StringBuilder()).append("[").append(mediaplayernotification.getCode()).append("]").append(mediaplayernotification.getDescription()).toString());
            return;
        }

        public void onTimedMetadata(TimedMetadata timedmetadata)
        {
        }

        public void onTimelineUpdated()
        {
        }

        public void onUpdated()
        {
        }

            
            {
                this$0 = PrimeTimeDefaultMediaPlayerProxy.this;
                super();
            }
    };
    private final com.adobe.mediacore.MediaPlayer.QOSEventListener qosEventListener = new com.adobe.mediacore.MediaPlayer.QOSEventListener() {

        final PrimeTimeDefaultMediaPlayerProxy this$0;

        public void onBufferComplete()
        {
            _mBuffering = false;
        }

        public void onBufferStart()
        {
            updatePlayerSate(6);
            _mBuffering = true;
        }

        public void onLoadInfo(LoadInfo loadinfo)
        {
        }

        public void onOperationFailed(com.adobe.mediacore.MediaPlayerNotification.Warning warning)
        {
        }

        public void onSeekComplete(long l)
        {
        }

        public void onSeekStart()
        {
        }

            
            {
                this$0 = PrimeTimeDefaultMediaPlayerProxy.this;
                super();
            }
    };

    public PrimeTimeDefaultMediaPlayerProxy(MediaPlayer mediaplayer)
        throws Exception
    {
        _mPlayer = null;
        _utils = null;
        _notifier = null;
        _duration = -1L;
        _mBuffering = false;
        LOG_TAG = "PrimeTimeDefaultMediaPlayerProxy";
        _mPlayer = mediaplayer;
        _utils = PlatformUtils.getInstance();
        updatePlayerSate(100);
        _mPlayer.addEventListener(com.adobe.mediacore.MediaPlayer.Event.QOS, qosEventListener);
        _mPlayer.addEventListener(com.adobe.mediacore.MediaPlayer.Event.PLAYBACK, playbackEventListener);
    }

    private void updateDuration(long l)
    {
        if (l > 0L && _notifier != null)
        {
            HashMap hashmap = new HashMap();
            hashmap.put("duration", String.valueOf(_duration));
            _notifier.OnMetadata(hashmap);
        }
    }

    private void updatePlayerSate(int i)
    {
        if (_notifier != null)
        {
            _notifier.SetPlayingState(i);
        }
    }

    public void Cleanup()
    {
        Log("PrimeTime CSP cleanup");
        _notifier = null;
        if (_mPlayer != null)
        {
            _mPlayer.removeEventListener(com.adobe.mediacore.MediaPlayer.Event.QOS, qosEventListener);
            _mPlayer.removeEventListener(com.adobe.mediacore.MediaPlayer.Event.PLAYBACK, playbackEventListener);
            _mPlayer = null;
        }
    }

    public int GetBufferLengthMs()
    {
        return -1;
    }

    public int GetCapabilities()
    {
        return 7;
    }

    public int GetDroppedFrames()
    {
        return -1;
    }

    public int GetIsLive()
    {
        return 0;
    }

    public int GetMinBufferLengthMs()
    {
        return -1;
    }

    public int GetPlayheadTimeMs()
    {
        if (_mPlayer == null)
        {
            return -1;
        }
        long l = _mPlayer.getPlaybackMetrics().getBitrate();
        if (l > 0L && _notifier != null)
        {
            _notifier.SetStream((int)(l / 1000L), null, null);
        }
        static class _cls3
        {

            static final int $SwitchMap$com$adobe$mediacore$MediaPlayer$PlayerState[];

            static 
            {
                $SwitchMap$com$adobe$mediacore$MediaPlayer$PlayerState = new int[com.adobe.mediacore.MediaPlayer.PlayerState.values().length];
                try
                {
                    $SwitchMap$com$adobe$mediacore$MediaPlayer$PlayerState[com.adobe.mediacore.MediaPlayer.PlayerState.ERROR.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$com$adobe$mediacore$MediaPlayer$PlayerState[com.adobe.mediacore.MediaPlayer.PlayerState.COMPLETE.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$adobe$mediacore$MediaPlayer$PlayerState[com.adobe.mediacore.MediaPlayer.PlayerState.PAUSED.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$adobe$mediacore$MediaPlayer$PlayerState[com.adobe.mediacore.MediaPlayer.PlayerState.PLAYING.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls3..SwitchMap.com.adobe.mediacore.MediaPlayer.PlayerState[_mPlayer.getStatus().ordinal()];
        JVM INSTR tableswitch 2 4: default 96
    //                   2 149
    //                   3 157
    //                   4 166;
           goto _L1 _L2 _L3 _L4
_L1:
        if (_duration <= 0L)
        {
            _duration = _mPlayer.getPlaybackRange().getDuration();
            if (_duration > 0L)
            {
                updateDuration(_duration);
            }
        }
        return (int)_mPlayer.getCurrentTime();
_L2:
        updatePlayerSate(1);
        continue; /* Loop/switch isn't completed */
_L3:
        updatePlayerSate(12);
        continue; /* Loop/switch isn't completed */
_L4:
        if (!_mBuffering)
        {
            updatePlayerSate(3);
        } else
        {
            updatePlayerSate(6);
        }
        if (true) goto _L1; else goto _L5
_L5:
    }

    public double GetRenderedFrameRate()
    {
        if (_mPlayer != null)
        {
            return (double)_mPlayer.getPlaybackMetrics().getFrameRate();
        } else
        {
            return -1D;
        }
    }

    public String GetServerAddress()
    {
        return null;
    }

    public int GetStartingBufferLengthMs()
    {
        return -1;
    }

    public String GetStreamerType()
    {
        return "PrimeTimeDefaultMediaPlayer";
    }

    public String GetStreamerVersion()
    {
        return Version.getVersion();
    }

    public void Log(String s)
    {
        if (_notifier != null)
        {
            _notifier.Log(s);
        } else
        {
            _utils.log(s);
        }
        logInfo(s);
    }

    public void logInfo(String s)
    {
    }

    public void onError(String s)
    {
        if (_notifier != null)
        {
            s = StreamerError.makeUnscopedError(s, 1);
            _notifier.OnError(s);
        }
    }

    public void setMonitoringNotifier(IMonitorNotifier imonitornotifier)
    {
        _notifier = imonitornotifier;
    }


/*
    static boolean access$002(PrimeTimeDefaultMediaPlayerProxy primetimedefaultmediaplayerproxy, boolean flag)
    {
        primetimedefaultmediaplayerproxy._mBuffering = flag;
        return flag;
    }

*/

}
