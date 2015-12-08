// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore;

import com.adobe.mediacore.logging.Log;
import com.adobe.mediacore.logging.Logger;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

// Referenced classes of package com.adobe.mediacore:
//            VideoEngineTimelineProxy

final class VideoEngineHoldManager
{

    private static final String LOG_TAG = (new StringBuilder()).append("[PSDK]::").append(com/adobe/mediacore/VideoEngineHoldManager.getSimpleName()).toString();
    private static final Logger _logger = Log.getLogger(LOG_TAG);
    private final Set _holdPositions = new TreeSet();
    private final VideoEngineTimelineProxy _videoEngineTimelineProxy;

    public VideoEngineHoldManager(VideoEngineTimelineProxy videoenginetimelineproxy)
    {
        _videoEngineTimelineProxy = videoenginetimelineproxy;
    }

    public void addHoldPostion(long l)
    {
        if (!_holdPositions.contains(Long.valueOf(l)))
        {
            _logger.i((new StringBuilder()).append(LOG_TAG).append("#addHoldPosition").toString(), (new StringBuilder()).append("Adding in backend new hold positon ").append(l).toString());
            _holdPositions.add(Long.valueOf(l));
        }
    }

    public long removeHoldFor(long l)
    {
        this;
        JVM INSTR monitorenter ;
        if (!_holdPositions.contains(Long.valueOf(l))) goto _L2; else goto _L1
_L1:
        Iterator iterator;
        _logger.i((new StringBuilder()).append(LOG_TAG).append("#removeHoldFor").toString(), (new StringBuilder()).append("Removing HOLD at ").append(l).toString());
        _holdPositions.remove(Long.valueOf(l));
        iterator = _holdPositions.iterator();
_L6:
        if (!iterator.hasNext()) goto _L4; else goto _L3
_L3:
        l = ((Long)iterator.next()).longValue();
        if (!_videoEngineTimelineProxy.setHoldAt(l)) goto _L6; else goto _L5
_L5:
        _logger.i((new StringBuilder()).append(LOG_TAG).append("#removeHoldFor").toString(), (new StringBuilder()).append("Moved HOLD position to ").append(l).toString());
_L9:
        this;
        JVM INSTR monitorexit ;
        return l;
_L4:
        if (!_videoEngineTimelineProxy.setHoldAt(0L))
        {
            break MISSING_BLOCK_LABEL_224;
        }
        _logger.i((new StringBuilder()).append(LOG_TAG).append("#removeHoldFor").toString(), "No hold is active anymore.");
        l = -1L;
        continue; /* Loop/switch isn't completed */
        _logger.e((new StringBuilder()).append(LOG_TAG).append("#removeHoldFor").toString(), "Unable to remove hold!");
          goto _L7
_L2:
        _logger.i((new StringBuilder()).append(LOG_TAG).append("#removeHoldFor").toString(), (new StringBuilder()).append("Unable to remove HOLD at [").append(l).append("]. Position does not exist in internal list.").toString());
          goto _L7
        Exception exception;
        exception;
        throw exception;
_L7:
        l = -1L;
        if (true) goto _L9; else goto _L8
_L8:
    }

}
