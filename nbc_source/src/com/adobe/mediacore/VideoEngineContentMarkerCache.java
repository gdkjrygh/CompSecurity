// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore;

import com.adobe.mediacore.logging.Log;
import com.adobe.mediacore.logging.Logger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.adobe.mediacore:
//            ContentMarkerEvent, VideoEngineDispatcher

final class VideoEngineContentMarkerCache
{
    static class MarkerInfo
    {

        private final int _contentId;
        private final long _duration;
        private boolean _eventDispatched;
        private final long _timestamp;

        public int getContentId()
        {
            return _contentId;
        }

        long getDuration()
        {
            return _duration;
        }

        public long getTimestamp()
        {
            return _timestamp;
        }

        public boolean isEventDispatched()
        {
            return _eventDispatched;
        }

        public void setEventDispatched(boolean flag)
        {
            _eventDispatched = flag;
        }

        public MarkerInfo(int i, long l, long l1)
        {
            _timestamp = l;
            _contentId = i;
            _duration = l1;
        }
    }


    private static final long INVALID_TIME = -1L;
    private static final String LOG_TAG = (new StringBuilder()).append("[PSDK]::").append(com/adobe/mediacore/VideoEngineContentMarkerCache.getSimpleName()).toString();
    private boolean _allEventsDispatched;
    private final Logger _logger;
    private final int _mainContentId;
    private final List _markerInfos = new ArrayList();
    private final VideoEngineDispatcher _videoEngineDispatcher;

    public VideoEngineContentMarkerCache(VideoEngineDispatcher videoenginedispatcher, int i)
    {
        _logger = Log.getLogger(LOG_TAG);
        _videoEngineDispatcher = videoenginedispatcher;
        _mainContentId = i;
    }

    public void addMarker(VideoEngineTimeline.TimeMapping timemapping, int i, long l)
    {
label0:
        {
            synchronized (_markerInfos)
            {
                if (timemapping.getTime() != -1L)
                {
                    break label0;
                }
            }
            return;
        }
        _markerInfos.add(new MarkerInfo(i, timemapping.getTime(), l));
        list;
        JVM INSTR monitorexit ;
        return;
        timemapping;
        list;
        JVM INSTR monitorexit ;
        throw timemapping;
    }

    public boolean containsMarkerFor(long l)
    {
label0:
        {
            synchronized (_markerInfos)
            {
                if (!_markerInfos.isEmpty())
                {
                    break label0;
                }
            }
            return false;
        }
        Iterator iterator = _markerInfos.iterator();
        MarkerInfo markerinfo;
        do
        {
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_93;
            }
            markerinfo = (MarkerInfo)iterator.next();
        } while (l < markerinfo.getTimestamp() || l >= markerinfo.getTimestamp() + markerinfo.getDuration());
        list;
        JVM INSTR monitorexit ;
        return true;
        exception;
        list;
        JVM INSTR monitorexit ;
        throw exception;
        list;
        JVM INSTR monitorexit ;
        return false;
    }

    public void dispatchEvents(long l)
    {
label0:
        {
            synchronized (_markerInfos)
            {
                if (!_markerInfos.isEmpty() && !_allEventsDispatched)
                {
                    break label0;
                }
            }
            return;
        }
        Iterator iterator;
        _allEventsDispatched = true;
        iterator = _markerInfos.iterator();
_L4:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        MarkerInfo markerinfo = (MarkerInfo)iterator.next();
        if (l < markerinfo.getTimestamp() || l >= markerinfo.getTimestamp() + markerinfo.getDuration()) goto _L4; else goto _L3
_L3:
        boolean flag = true;
_L10:
        iterator = _markerInfos.iterator();
_L8:
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_415;
        }
        markerinfo = (MarkerInfo)iterator.next();
        _allEventsDispatched = false;
        boolean flag1;
        if (l >= markerinfo.getTimestamp() && l < markerinfo.getTimestamp() + markerinfo.getDuration())
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_298;
        }
        if (markerinfo.isEventDispatched())
        {
            break MISSING_BLOCK_LABEL_298;
        }
        _logger.i((new StringBuilder()).append(LOG_TAG).append("#dispatchEvents").toString(), (new StringBuilder()).append("Dispatching event for contentId [").append(markerinfo.getContentId()).append("] at time [").append(markerinfo.getTimestamp()).append("], when current time is [").append(l).append("]").toString());
        markerinfo.setEventDispatched(true);
        _videoEngineDispatcher.dispatch(ContentMarkerEvent.createContentMarkerEvent(markerinfo.getContentId(), markerinfo.getTimestamp()));
        list;
        JVM INSTR monitorexit ;
        return;
        exception;
        list;
        JVM INSTR monitorexit ;
        throw exception;
        if (flag1) goto _L6; else goto _L5
_L5:
        if (markerinfo.isEventDispatched())
        {
            markerinfo.setEventDispatched(false);
        }
_L6:
        if (flag) goto _L8; else goto _L7
_L7:
        _logger.i((new StringBuilder()).append(LOG_TAG).append("#dispatchEvents").toString(), (new StringBuilder()).append("Dispatching event for contentId [").append(_mainContentId).append("] at time [").append(l).append("], when current time is [").append(l).append("]").toString());
        _videoEngineDispatcher.dispatch(ContentMarkerEvent.createContentMarkerEvent(_mainContentId, l));
          goto _L8
        list;
        JVM INSTR monitorexit ;
        return;
_L2:
        flag = false;
        if (true) goto _L10; else goto _L9
_L9:
    }

}
