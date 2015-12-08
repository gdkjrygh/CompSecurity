// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore;

import com.adobe.mediacore.logging.Log;
import com.adobe.mediacore.logging.Logger;
import com.adobe.mediacore.timeline.advertising.AdPolicyMode;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.adobe.mediacore:
//            VideoEngineDispatcher, VideoEngineAdapter, MediaPlayerItem, TimelineMonitor, 
//            PlaybackRateEvent, MediaPlayer, SeekAdjustCompletedListener, SeekCompletedListener

public class TrickPlayManager
{

    private static final String LOG_TAG = (new StringBuilder()).append("[PSDK]::").append(com/adobe/mediacore/TrickPlayManager.getSimpleName()).toString();
    public static final float NORMAL_PLAYBACK_RATE = 1F;
    public static final float PAUSE_PLAYBACK_RATE = 0F;
    private static final Logger _logger = Log.getLogger(LOG_TAG);
    private float _currentPlaybackRate;
    private VideoEngineDispatcher _dispatcher;
    private VideoEngineAdapter _engine;
    private long _initialTrickPlayPosition;
    private MediaPlayerItem _item;
    private long _lastUpdatedTime;
    private boolean _pendingRatePlayingEvent;
    private MediaPlayer _player;
    private boolean _returningFromTrickPlay;
    private final SeekAdjustCompletedListener _seekAdjustCompletedListener = new SeekAdjustCompletedListener() {

        final TrickPlayManager this$0;

        public void onAdjustCompleted(long l)
        {
            if (_seekAdjustCompletedListener != null)
            {
                _dispatcher.removeEventListener(MediaPlayerEvent.Type.SEEK_ADJUST_COMPLETED, _seekAdjustCompletedListener);
            }
            _engine.seek(VideoEngineTimeline.TimeMapping.create(-1, l));
            if (_currentPlaybackRate == 0.0F)
            {
                TrickPlayManager._logger.i((new StringBuilder()).append(TrickPlayManager.LOG_TAG).append("#changePlaybackRate").toString(), (new StringBuilder()).append("returning to pause mode, position: ").append(l).toString());
                _player.pause();
            } else
            if (_currentPlaybackRate == 1.0F)
            {
                TrickPlayManager._logger.i((new StringBuilder()).append(TrickPlayManager.LOG_TAG).append("#changePlaybackRate").toString(), (new StringBuilder()).append("returning to play mode, position: ").append(l).toString());
                _player.play();
            } else
            {
                TrickPlayManager._logger.i((new StringBuilder()).append(TrickPlayManager.LOG_TAG).append("#changePlaybackRate").toString(), (new StringBuilder()).append("returning to slow motion mode, position: ").append(l).toString());
                changeRateWithoutRemovingAds(_currentPlaybackRate);
            }
            _returningFromTrickPlay = false;
            _initialTrickPlayPosition = -1L;
        }

            
            {
                this$0 = TrickPlayManager.this;
                super();
            }
    };
    private TimelineMonitor _timelineMonitor;

    public TrickPlayManager(MediaPlayer mediaplayer, MediaPlayerItem mediaplayeritem, VideoEngineAdapter videoengineadapter, TimelineMonitor timelinemonitor, VideoEngineDispatcher videoenginedispatcher)
    {
        _currentPlaybackRate = 1.0F;
        _returningFromTrickPlay = false;
        _pendingRatePlayingEvent = false;
        _lastUpdatedTime = 0L;
        _initialTrickPlayPosition = -1L;
        _player = mediaplayer;
        _engine = videoengineadapter;
        _timelineMonitor = timelinemonitor;
        _dispatcher = videoenginedispatcher;
        _item = mediaplayeritem;
        addEventListeners();
    }

    private void addEventListeners()
    {
        _dispatcher.addEventListener(MediaPlayerEvent.Type.SEEK_COMPLETED, new SeekCompletedListener() {

            final TrickPlayManager this$0;

            public void onCompleted(long l)
            {
                if (_returningFromTrickPlay)
                {
                    _returningFromTrickPlay = false;
                    _dispatcher.dispatch(PlaybackRateEvent.createRatePlayingEvent(1.0F));
                }
            }

            
            {
                this$0 = TrickPlayManager.this;
                super();
            }
        });
    }

    private void changeRateWithoutRemovingAds(float f)
    {
        _logger.i((new StringBuilder()).append(LOG_TAG).append("#changeRate").toString(), "switching from one slow motion rate to another slow motion rate");
        f = getActualRate(f);
        _engine.enableTrickPlay(f, false);
        _pendingRatePlayingEvent = true;
        _currentPlaybackRate = f;
    }

    private float getActualRate(float f)
    {
        float f1;
        float f2;
        Iterator iterator;
        iterator = _item.getAvailablePlaybackRates().iterator();
        f2 = -1F;
        f1 = f;
_L2:
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        float f6 = ((Float)iterator.next()).floatValue();
        if (f * f6 <= 0.0F || f6 == 1.0F || f6 == 0.0F)
        {
            break MISSING_BLOCK_LABEL_117;
        }
        float f3 = Math.abs(Math.abs(f) - Math.abs(f6));
        if (f3 >= f2 && f2 != -1F)
        {
            break MISSING_BLOCK_LABEL_117;
        }
        f2 = f6;
        f1 = f3;
_L3:
        float f4 = f2;
        f2 = f1;
        f1 = f4;
        if (true) goto _L2; else goto _L1
_L1:
        return f1;
        float f5 = f1;
        f1 = f2;
        f2 = f5;
          goto _L3
    }

    private boolean isWithinNormalPlaybackRateRange(float f)
    {
        return f >= 0.0F && f <= 1.0F;
    }

    public void changePlaybackRate(float f)
    {
        boolean flag;
        boolean flag1;
label0:
        {
            boolean flag2 = false;
            if (f == _currentPlaybackRate)
            {
                _logger.i((new StringBuilder()).append(LOG_TAG).append("#changePlaybackRate").toString(), "this rate has been already set.");
                return;
            }
            boolean flag3;
            if (!isWithinNormalPlaybackRateRange(_currentPlaybackRate) && isWithinNormalPlaybackRateRange(f))
            {
                flag3 = true;
            } else
            {
                flag3 = false;
            }
            _returningFromTrickPlay = flag3;
            if (isWithinNormalPlaybackRateRange(_currentPlaybackRate) && isWithinNormalPlaybackRateRange(f))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            flag1 = flag2;
            if (!isWithinNormalPlaybackRateRange(_currentPlaybackRate))
            {
                break label0;
            }
            if (f <= 1.0F)
            {
                flag1 = flag2;
                if (f >= -1F)
                {
                    break label0;
                }
            }
            flag1 = true;
        }
        if (!flag && _timelineMonitor.isPlayingAdBreak())
        {
            _logger.w((new StringBuilder()).append(LOG_TAG).append("#changePlaybackRate").toString(), "Rate cannot be changed during ad breaks.");
            return;
        }
        _dispatcher.dispatch(PlaybackRateEvent.createRateSelectedEvent(f));
        if (flag)
        {
            _currentPlaybackRate = f;
            if (f == 0.0F)
            {
                _player.pause();
                return;
            }
            if (f == 1.0F)
            {
                _player.play();
                return;
            } else
            {
                changeRateWithoutRemovingAds(f);
                return;
            }
        }
        if (_returningFromTrickPlay)
        {
            _logger.i((new StringBuilder()).append(LOG_TAG).append("#changePlaybackRate").toString(), "returning back from trick-play mode to playback rate");
            _engine.pause();
            long l = _engine.getCurrentTime();
            _engine.returnFromTrickPlay();
            _timelineMonitor.enableAdBreaks();
            VideoEngineTimeline.TimeMapping timemapping = VideoEngineTimeline.TimeMapping.create(-1, _engine.getVirtualTimeForLocalTime(l));
            _logger.i((new StringBuilder()).append(LOG_TAG).append("#changePlaybackRate").toString(), (new StringBuilder()).append("returning to normal mode,  current time=").append(_engine.getCurrentTime()).append(", desired position=").append(timemapping.getTime()).append(", begin=").append(_initialTrickPlayPosition).toString());
            _currentPlaybackRate = f;
            if (_seekAdjustCompletedListener != null)
            {
                _dispatcher.addEventListener(MediaPlayerEvent.Type.SEEK_ADJUST_COMPLETED, _seekAdjustCompletedListener);
            }
            _timelineMonitor.adjustSeekPosition(timemapping, _initialTrickPlayPosition, AdPolicyMode.TRICK_PLAY);
            return;
        }
        if (flag1)
        {
            _logger.i((new StringBuilder()).append(LOG_TAG).append("#changePlaybackRate").toString(), "switching to trick-play mode from allowed playback rate range");
            if (_initialTrickPlayPosition == -1L)
            {
                _initialTrickPlayPosition = _engine.getCurrentTime();
            }
            f = getActualRate(f);
            _timelineMonitor.skipAdBreaks();
            _engine.enableTrickPlay(f, true);
            _pendingRatePlayingEvent = true;
            _currentPlaybackRate = f;
            return;
        } else
        {
            _logger.i((new StringBuilder()).append(LOG_TAG).append("#changePlaybackRate").toString(), "switching from one trick-play rate to another trick-play rate");
            changeRateWithoutRemovingAds(f);
            return;
        }
    }

    public float getCurrentPlaybackRate()
    {
        return _currentPlaybackRate;
    }

    public boolean isReturningFromTrickPlay()
    {
        return _returningFromTrickPlay;
    }

    public boolean trickPlayEnabled()
    {
        return !isWithinNormalPlaybackRateRange(_currentPlaybackRate);
    }

    public void update(long l)
    {
        if (l != _lastUpdatedTime && _pendingRatePlayingEvent)
        {
            _pendingRatePlayingEvent = false;
            _dispatcher.dispatch(PlaybackRateEvent.createRatePlayingEvent(_currentPlaybackRate));
        }
        _lastUpdatedTime = l;
    }

    public void updatePlaybackRate(float f)
    {
        _currentPlaybackRate = f;
    }




/*
    static boolean access$002(TrickPlayManager trickplaymanager, boolean flag)
    {
        trickplaymanager._returningFromTrickPlay = flag;
        return flag;
    }

*/










/*
    static long access$902(TrickPlayManager trickplaymanager, long l)
    {
        trickplaymanager._initialTrickPlayPosition = l;
        return l;
    }

*/
}
