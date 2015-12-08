// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore;

import com.adobe.ave.MediaErrorCode;
import com.adobe.ave.PeriodInfo;
import com.adobe.ave.Timeline;
import com.adobe.ave.VideoEngine;
import com.adobe.ave.VideoEngineException;
import com.adobe.mediacore.logging.Logger;
import com.adobe.mediacore.metadata.Metadata;
import com.adobe.mediacore.metadata.MetadataNode;
import com.adobe.mediacore.qos.metrics.PlaybackMetrics;
import com.adobe.mediacore.utils.TimeRange;

// Referenced classes of package com.adobe.mediacore:
//            VideoEngineAdapter, BufferControlParameters, MediaPlayerEvent, VideoEngineDispatcher, 
//            MediaPlayerNotification, ErrorEvent

protected class this._cls0 extends PlaybackMetrics
{

    private static final int DEFAULT_TARGET_DURATION = 10000;
    private static final long READ_HEAD_DELTA = 0L;
    private long _clientLivePoint;
    private boolean _dispatchedBufferFull;
    private long _readHead;
    private long _savedBufferLength;
    final VideoEngineAdapter this$0;

    private void checkAndDispatchBufferFullEvent()
    {
        if (_dispatchedBufferFull && !hasAllDataBuffered() && _bufferLength <= VideoEngineAdapter.access$1100(VideoEngineAdapter.this).getPlayBufferTime() && _savedBufferLength != _bufferLength)
        {
            _dispatchedBufferFull = false;
        }
        if (!_dispatchedBufferFull)
        {
            _dispatchedBufferFull = false;
            _savedBufferLength = _bufferLength;
            if (isBufferFull())
            {
                _dispatchedBufferFull = true;
                if (VideoEngineAdapter.access$600(VideoEngineAdapter.this) != null)
                {
                    VideoEngineAdapter.access$600(VideoEngineAdapter.this).dispatch(new MediaPlayerEvent(this._fld0));
                    return;
                }
            }
        }
    }

    protected void doUpdate()
    {
        Object obj;
        try
        {
            if (VideoEngineAdapter.access$000(VideoEngineAdapter.this) == null)
            {
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            VideoEngineAdapter.access$200().e((new StringBuilder()).append(VideoEngineAdapter.access$100()).append("#doUpdate").toString(), "Unable to update metrics.", ((Exception) (obj)));
            Object obj1 = MediaPlayerNotification.createErrorNotification(_ERROR, "An error has occurred while attempting to retrieve the QOS information.");
            MetadataNode metadatanode = new MetadataNode();
            metadatanode.setValue("DESCRIPTION", ((VideoEngineException) (obj)).getErrorCode().name());
            ((_ERROR) (obj1))._ERROR(metadatanode);
            long l3;
            long l6;
            if (VideoEngineAdapter.access$600(VideoEngineAdapter.this) != null)
            {
                VideoEngineAdapter.access$600(VideoEngineAdapter.this).dispatch(ErrorEvent.createVideoErrorEvent(((this._cls0) (obj1))));
                return;
            } else
            {
                return;
            }
        }
        if (!VideoEngineAdapter.access$3100(VideoEngineAdapter.this) || VideoEngineAdapter.access$3200(VideoEngineAdapter.this) == null || VideoEngineAdapter.access$3200(VideoEngineAdapter.this)._mth0() == -3L) goto _L2; else goto _L1
_L1:
        if (VideoEngineAdapter.access$3200(VideoEngineAdapter.this)._mth0() != -1) goto _L4; else goto _L3
_L3:
        _time = VideoEngineAdapter.access$3200(VideoEngineAdapter.this)._mth0();
_L9:
        _timeLocal = getLocalTime();
        _bufferLength = VideoEngineAdapter.access$000(VideoEngineAdapter.this).getBufferLength();
        _readHead = _time + _bufferLength + 0L;
        _bufferTime = VideoEngineAdapter.access$1100(VideoEngineAdapter.this).getPlayBufferTime();
        obj = VideoEngineAdapter.access$000(VideoEngineAdapter.this).getTimeline();
        if (obj == null) goto _L6; else goto _L5
_L5:
        long l = Math.min(_time, ((Timeline) (obj)).virtualStartTime);
        _playbackRange = TimeRange.createRange(l, (((Timeline) (obj)).virtualStartTime - l) + ((Timeline) (obj)).virtualDuration);
        if (((Timeline) (obj)).complete != 0) goto _L8; else goto _L7
_L7:
        _clientLivePoint = VideoEngineAdapter.access$000(VideoEngineAdapter.this).getClientLivePoint();
        if (_clientLivePoint >= ((Timeline) (obj)).virtualDuration + ((Timeline) (obj)).virtualStartTime)
        {
            VideoEngineAdapter.access$200().i((new StringBuilder()).append(VideoEngineAdapter.access$100()).append("#DEBUG").toString(), (new StringBuilder()).append("Client live point = ").append(_clientLivePoint).append(" virtual start time = ").append(((Timeline) (obj)).virtualStartTime).append(" virtual end time  = ").append(((Timeline) (obj)).virtualStartTime + ((Timeline) (obj)).virtualDuration).toString());
        }
        long l1 = _clientLivePoint;
        long l4 = ((Timeline) (obj)).virtualStartTime;
        _seekableRange = TimeRange.createRange(((Timeline) (obj)).virtualStartTime, l1 - l4);
_L10:
        long l2 = VideoEngineAdapter.access$000(VideoEngineAdapter.this).getTime();
        long l5 = _bufferLength;
        long l7 = ((Timeline) (obj)).virtualStartTime;
        _bufferedRange = TimeRange.createRange(l2, Math.min(l5, (((Timeline) (obj)).virtualDuration + l7) - VideoEngineAdapter.access$000(VideoEngineAdapter.this).getTime()));
_L6:
        _frameRate = VideoEngineAdapter.access$000(VideoEngineAdapter.this).getQosFrameRate();
        _droppedFramesCount = VideoEngineAdapter.access$000(VideoEngineAdapter.this).getQosDroppedFrameCount();
        _bitrate = VideoEngineAdapter.access$1800(VideoEngineAdapter.this);
        checkAndDispatchBufferFullEvent();
        return;
_L4:
        _time = VideoEngineAdapter.access$3500(VideoEngineAdapter.this);
          goto _L9
_L2:
        _time = VideoEngineAdapter.access$000(VideoEngineAdapter.this).getTime();
          goto _L9
_L8:
        l6 = ((Timeline) (obj)).virtualDuration;
        obj1 = ((Timeline) (obj)).getPeriodInfo(((Timeline) (obj)).lastPeriodIndex);
        l3 = l6;
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_615;
        }
        l3 = l6;
        if (((Timeline) (obj)).virtualStartTime + l6 > ((PeriodInfo) (obj1)).virtualStartTime + ((PeriodInfo) (obj1)).duration)
        {
            l3 = (((PeriodInfo) (obj1)).virtualStartTime + ((PeriodInfo) (obj1)).duration) - ((Timeline) (obj)).virtualStartTime;
        }
        _seekableRange = TimeRange.createRange(((Timeline) (obj)).virtualStartTime, l3);
          goto _L10
    }

    public long getReadHead()
    {
        return _readHead;
    }

    protected ()
    {
        this$0 = VideoEngineAdapter.this;
        super();
    }
}
