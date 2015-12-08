// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore;

import com.adobe.ave.Timeline;
import com.adobe.ave.VideoEngineException;
import com.adobe.mediacore.logging.Log;
import com.adobe.mediacore.logging.Logger;
import com.adobe.mediacore.utils.TimeRange;
import java.util.Hashtable;
import java.util.Map;

// Referenced classes of package com.adobe.mediacore:
//            VideoEngineHoldManager, TimelineHold, VideoEngineTimelineHold, VideoEngineTimeline, 
//            VideoEngineAdapter

final class VideoEngineTimelineProxy
{

    private static final String LOG_TAG = (new StringBuilder()).append("[PSDK]::").append(com/adobe/mediacore/VideoEngineTimelineProxy.getSimpleName()).toString();
    private static final Logger _logger = Log.getLogger(LOG_TAG);
    private long _currentHoldTime;
    private final Timeline _timeline;
    private final Map _timelineHoldMap = new Hashtable();
    private final VideoEngineHoldManager _videoEngineHoldManager;
    private final VideoEngineAdapter.VideoEnginePlaybackMetrics _videoEnginePlaybackMetrics;

    public VideoEngineTimelineProxy(Timeline timeline, VideoEngineAdapter.VideoEnginePlaybackMetrics videoengineplaybackmetrics)
    {
        _currentHoldTime = -1L;
        if (timeline == null)
        {
            throw new IllegalArgumentException("Invalid argument received. Timeline cannot be null");
        }
        if (videoengineplaybackmetrics == null)
        {
            throw new IllegalArgumentException("Invalid argument received. VideoEnginePlaybackMetrics cannot be null");
        } else
        {
            _timeline = timeline;
            _videoEnginePlaybackMetrics = videoengineplaybackmetrics;
            _videoEngineHoldManager = new VideoEngineHoldManager(this);
            return;
        }
    }

    private boolean isInPlaybackRange(long l)
    {
        return _videoEnginePlaybackMetrics.getPlaybackRange().contains(l);
    }

    public void addHoldReference(long l)
    {
        if (_timelineHoldMap.containsKey(Long.valueOf(l)))
        {
            ((TimelineHold)_timelineHoldMap.get(Long.valueOf(l))).addReference(l);
        }
    }

    public void addHoldReference(TimelineHold timelinehold)
    {
        long l = timelinehold.getHoldTime();
        if (!_timelineHoldMap.containsKey(Long.valueOf(l)))
        {
            _timelineHoldMap.put(Long.valueOf(l), timelinehold);
        }
        timelinehold.addReference(l);
    }

    public boolean containsHoldFor(long l)
    {
        return _timelineHoldMap.containsKey(Long.valueOf(l));
    }

    public long getCurrentHoldTime()
    {
        return _currentHoldTime;
    }

    public TimelineHold getHoldAt(long l)
    {
        if (!isInPlaybackRange(l))
        {
            _logger.w((new StringBuilder()).append(LOG_TAG).append("#getHoldAt").toString(), (new StringBuilder()).append("Cannot retrieve HOLD for this time ").append(l).append(". Value given is not in playback range").toString());
        } else
        {
            if (isTimeBeforeReadHead(l))
            {
                _logger.w((new StringBuilder()).append(LOG_TAG).append("#getHoldAt").toString(), (new StringBuilder()).append("Cannot retrieve HOLD for this time ").append(l).append(". Value given is before read head").toString());
                return null;
            }
            if (_currentHoldTime != -1L && l > _currentHoldTime)
            {
                _logger.i((new StringBuilder()).append(LOG_TAG).append("#getHoldAt").toString(), (new StringBuilder()).append("Pending HOLD for time ").append(l).toString());
                _videoEngineHoldManager.addHoldPostion(l);
                return new VideoEngineTimelineHold(this, l);
            }
            if (setHoldAt(l))
            {
                _logger.i((new StringBuilder()).append(LOG_TAG).append("#getHoldAt").toString(), (new StringBuilder()).append("Creating HOLD for time ").append(l).toString());
                VideoEngineTimeline.printTimeline(_timeline);
                VideoEngineAdapter.printLivePlaybackWindowState(_videoEnginePlaybackMetrics);
                _videoEngineHoldManager.addHoldPostion(l);
                _currentHoldTime = l;
                return new VideoEngineTimelineHold(this, l);
            }
        }
        return null;
    }

    public boolean isTimeBeforeReadHead(long l)
    {
        long l1;
        _videoEnginePlaybackMetrics.update();
        l1 = _videoEnginePlaybackMetrics.getReadHead();
        VideoEngineAdapter.printLivePlaybackWindowState(_videoEnginePlaybackMetrics);
        Logger logger = _logger;
        String s = (new StringBuilder()).append(LOG_TAG).append("#isTimeBeforeReadHead").toString();
        StringBuilder stringbuilder = (new StringBuilder()).append("Is time provided [").append(l).append("] before read head [").append(l1).append("] - ");
        boolean flag;
        if (l <= l1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        logger.i(s, stringbuilder.append(flag).toString());
        if (l > 0L) goto _L2; else goto _L1
_L1:
        if (l >= l1) goto _L4; else goto _L3
_L3:
        return true;
_L4:
        return false;
_L2:
        if (l > l1)
        {
            return false;
        }
        if (true) goto _L3; else goto _L5
_L5:
    }

    public void releaseHoldReference(long l)
    {
        if (_timelineHoldMap.containsKey(Long.valueOf(l)))
        {
            ((TimelineHold)_timelineHoldMap.get(Long.valueOf(l))).releaseReference(l);
        }
    }

    protected void removeHoldFor(long l)
    {
        if (_timelineHoldMap.containsKey(Long.valueOf(l)))
        {
            VideoEngineTimeline.printTimeline(_timeline);
            VideoEngineAdapter.printLivePlaybackWindowState(_videoEnginePlaybackMetrics);
            _timelineHoldMap.remove(Long.valueOf(l));
            _currentHoldTime = _videoEngineHoldManager.removeHoldFor(l);
        }
    }

    protected boolean setHoldAt(long l)
    {
        try
        {
            _logger.i((new StringBuilder()).append(LOG_TAG).append("#setHoldAt").toString(), (new StringBuilder()).append("Setting AVE hold at ").append(l).toString());
            _timeline.setHoldAt(l);
        }
        catch (VideoEngineException videoengineexception)
        {
            _logger.w((new StringBuilder()).append(LOG_TAG).append("#setHoldAdt").toString(), (new StringBuilder()).append("VideoEngineException raise while placing HOLD for time ").append(l).toString(), videoengineexception);
            return false;
        }
        return true;
    }

}
