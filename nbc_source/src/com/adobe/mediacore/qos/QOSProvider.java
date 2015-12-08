// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore.qos;

import android.content.Context;
import com.adobe.mediacore.MediaPlayer;
import com.adobe.mediacore.MediaPlayerNotification;
import com.adobe.mediacore.metadata.TimedMetadata;
import com.adobe.mediacore.qos.metrics.BufferingMetrics;
import com.adobe.mediacore.qos.metrics.PlaybackLoadMetrics;
import com.adobe.mediacore.qos.metrics.PlaybackMetrics;
import com.adobe.mediacore.qos.metrics.PlaybackSessionMetrics;
import com.adobe.mediacore.qos.metrics.SeekMetrics;

// Referenced classes of package com.adobe.mediacore.qos:
//            DeviceInformation, PlaybackInformation, LoadInfo

public final class QOSProvider
{

    private BufferingMetrics _bufferingMetrics;
    private final DeviceInformation _deviceInformation;
    private MediaPlayer _mediaPlayer;
    private final com.adobe.mediacore.MediaPlayer.PlaybackEventListener _playbackListener = new com.adobe.mediacore.MediaPlayer.PlaybackEventListener() {

        final QOSProvider this$0;

        public void onPlayComplete()
        {
        }

        public void onPlayStart()
        {
            _playbackLoadMetrics.recordTimeToFirstFrame();
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
            static class _cls3
            {

                static final int $SwitchMap$com$adobe$mediacore$MediaPlayer$PlayerState[];

                static 
                {
                    $SwitchMap$com$adobe$mediacore$MediaPlayer$PlayerState = new int[com.adobe.mediacore.MediaPlayer.PlayerState.values().length];
                    try
                    {
                        $SwitchMap$com$adobe$mediacore$MediaPlayer$PlayerState[com.adobe.mediacore.MediaPlayer.PlayerState.INITIALIZING.ordinal()] = 1;
                    }
                    catch (NoSuchFieldError nosuchfielderror3) { }
                    try
                    {
                        $SwitchMap$com$adobe$mediacore$MediaPlayer$PlayerState[com.adobe.mediacore.MediaPlayer.PlayerState.INITIALIZED.ordinal()] = 2;
                    }
                    catch (NoSuchFieldError nosuchfielderror2) { }
                    try
                    {
                        $SwitchMap$com$adobe$mediacore$MediaPlayer$PlayerState[com.adobe.mediacore.MediaPlayer.PlayerState.PREPARED.ordinal()] = 3;
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

            switch (_cls3..SwitchMap.com.adobe.mediacore.MediaPlayer.PlayerState[playerstate.ordinal()])
            {
            default:
                return;

            case 1: // '\001'
                _playbackLoadMetrics.recordPlaybackInit();
                return;

            case 2: // '\002'
                _playbackLoadMetrics.recordPlaybackLoad();
                return;

            case 3: // '\003'
                _playbackLoadMetrics.recordTimeToPrepare();
                return;

            case 4: // '\004'
                _playbackLoadMetrics.recordPlaybackStart();
                break;
            }
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
                this$0 = QOSProvider.this;
                super();
            }
    };
    private PlaybackLoadMetrics _playbackLoadMetrics;
    private PlaybackMetrics _playbackMetrics;
    private PlaybackSessionMetrics _playbackSessionMetrics;
    private final com.adobe.mediacore.MediaPlayer.QOSEventListener _qosListener = new com.adobe.mediacore.MediaPlayer.QOSEventListener() {

        final QOSProvider this$0;

        public void onBufferComplete()
        {
            _bufferingMetrics.recordBufferFull();
        }

        public void onBufferStart()
        {
            _bufferingMetrics.recordBufferEmpty();
        }

        public void onLoadInfo(LoadInfo loadinfo)
        {
        }

        public void onOperationFailed(com.adobe.mediacore.MediaPlayerNotification.Warning warning)
        {
            if (warning != null)
            {
                if (warning.getCode() == com.adobe.mediacore.MediaPlayerNotification.ErrorCode.SEEK_ERROR)
                {
                    _seekMetrics.recordSeekComplete(com.adobe.mediacore.qos.metrics.SeekMetrics.Result.FAIL);
                    return;
                }
                warning = warning.getInnerNotification();
                while (warning != null) 
                {
                    if (warning.getCode() == com.adobe.mediacore.MediaPlayerNotification.ErrorCode.SEEK_ERROR)
                    {
                        _seekMetrics.recordSeekComplete(com.adobe.mediacore.qos.metrics.SeekMetrics.Result.FAIL);
                        return;
                    }
                    warning = warning.getInnerNotification();
                }
            }
        }

        public void onSeekComplete(long l)
        {
            _seekMetrics.recordSeekComplete(com.adobe.mediacore.qos.metrics.SeekMetrics.Result.SUCCESS);
        }

        public void onSeekStart()
        {
            _seekMetrics.recordSeekStart();
        }

            
            {
                this$0 = QOSProvider.this;
                super();
            }
    };
    private SeekMetrics _seekMetrics;

    public QOSProvider(Context context)
    {
        _deviceInformation = new DeviceInformation(context);
    }

    public void attachMediaPlayer(MediaPlayer mediaplayer)
    {
        if (mediaplayer == null)
        {
            throw new IllegalArgumentException("Provided media player can not be null.");
        }
        if (_mediaPlayer != null)
        {
            detachMediaPlayer();
        }
        _mediaPlayer = mediaplayer;
        _playbackMetrics = _mediaPlayer.getPlaybackMetrics();
        _playbackLoadMetrics = new PlaybackLoadMetrics();
        _playbackSessionMetrics = new PlaybackSessionMetrics();
        _bufferingMetrics = new BufferingMetrics();
        _seekMetrics = new SeekMetrics();
        _mediaPlayer.addEventListener(com.adobe.mediacore.MediaPlayer.Event.QOS, _qosListener);
        _mediaPlayer.addEventListener(com.adobe.mediacore.MediaPlayer.Event.PLAYBACK, _playbackListener);
    }

    public void detachMediaPlayer()
    {
        if (_mediaPlayer != null)
        {
            _bufferingMetrics = null;
            _seekMetrics = null;
            _playbackLoadMetrics = null;
            _playbackSessionMetrics = null;
            _playbackMetrics = null;
            _mediaPlayer.removeEventListener(com.adobe.mediacore.MediaPlayer.Event.QOS, _qosListener);
            _mediaPlayer.removeEventListener(com.adobe.mediacore.MediaPlayer.Event.PLAYBACK, _playbackListener);
            _mediaPlayer = null;
        }
    }

    public DeviceInformation getDeviceInformation()
    {
        return _deviceInformation;
    }

    public PlaybackInformation getPlaybackInformation()
    {
        if (_mediaPlayer == null)
        {
            throw new IllegalStateException("Playback information is available only when a media player is attached to this qos provided.");
        } else
        {
            return new PlaybackInformation(_playbackLoadMetrics.getTimeToFirstByte(), _playbackLoadMetrics.getTimeToLoad(), _playbackLoadMetrics.getTimeToStart(), _playbackLoadMetrics.getTimeToFirstFrame(), _playbackLoadMetrics.getTimeToPrepare(), _playbackLoadMetrics.getTimeToFail(), _playbackSessionMetrics.getSecondsPlayed(), _playbackSessionMetrics.getSecondsSpent(), _playbackMetrics.getFrameRate(), _playbackMetrics.getDroppedFramesCount(), _playbackMetrics.getBitrate(), _playbackMetrics.getBufferTime(), _playbackMetrics.getBufferLength(), _bufferingMetrics.getEmptyBufferCount(), _bufferingMetrics.getTotalBufferingTime(), _seekMetrics.getLastSeekTime());
        }
    }

    public void updateMetrics(MediaPlayer mediaplayer)
    {
        if (mediaplayer == null)
        {
            throw new IllegalArgumentException("Provided media player can not be null.");
        } else
        {
            _mediaPlayer = mediaplayer;
            _playbackMetrics = _mediaPlayer.getPlaybackMetrics();
            return;
        }
    }



}
