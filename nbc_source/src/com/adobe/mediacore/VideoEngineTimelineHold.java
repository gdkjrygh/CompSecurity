// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore;

import com.adobe.mediacore.logging.Log;
import com.adobe.mediacore.logging.Logger;

// Referenced classes of package com.adobe.mediacore:
//            TimelineHold, VideoEngineTimelineProxy

final class VideoEngineTimelineHold
    implements TimelineHold
{

    private static final String LOG_TAG = (new StringBuilder()).append("[PSDK]::").append(com/adobe/mediacore/VideoEngineTimelineHold.getSimpleName()).toString();
    private static final Logger _logger = Log.getLogger(LOG_TAG);
    private final long _time;
    private final VideoEngineTimelineProxy _videoEngineTimelineProxy;
    private int referenceCount;

    public VideoEngineTimelineHold(VideoEngineTimelineProxy videoenginetimelineproxy, long l)
    {
        _videoEngineTimelineProxy = videoenginetimelineproxy;
        _time = l;
    }

    public void addReference(long l)
    {
        if (l == _time)
        {
            referenceCount = referenceCount + 1;
            _logger.i((new StringBuilder()).append(LOG_TAG).append("#addReference").toString(), (new StringBuilder()).append("Number of references for HOLD at time = ").append(l).append(" is ").append(referenceCount).toString());
        }
    }

    public long getHoldTime()
    {
        return _time;
    }

    public boolean isReleased()
    {
        return referenceCount == 0;
    }

    public void releaseReference(long l)
    {
        if (l == _time)
        {
            referenceCount = referenceCount - 1;
            _logger.i((new StringBuilder()).append(LOG_TAG).append("#releaseReference").toString(), (new StringBuilder()).append("Number of references for HOLD at time = ").append(l).append(" is ").append(referenceCount).toString());
            if (referenceCount == 0)
            {
                _videoEngineTimelineProxy.removeHoldFor(_time);
            }
        }
    }

}
