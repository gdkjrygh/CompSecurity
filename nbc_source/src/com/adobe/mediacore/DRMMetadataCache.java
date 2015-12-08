// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore;

import com.adobe.ave.Timeline;
import com.adobe.mediacore.logging.Log;
import com.adobe.mediacore.logging.Logger;
import com.adobe.mediacore.utils.TimeRange;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.adobe.mediacore:
//            DRMMetadataInfo

final class DRMMetadataCache
{

    private static final String LOG_TAG = (new StringBuilder()).append("[PSDK]::").append(com/adobe/mediacore/DRMMetadataCache.getSimpleName()).toString();
    private static final Logger _logger = Log.getLogger(LOG_TAG);
    private List _drmMetadataInfos;
    private List _internalDrmMetadataInfos;

    public DRMMetadataCache()
    {
        _internalDrmMetadataInfos = Collections.synchronizedList(new ArrayList());
        _drmMetadataInfos = Collections.emptyList();
    }

    boolean addDRMMetadata(DRMMetadataInfo drmmetadatainfo)
    {
        boolean flag = false;
        this;
        JVM INSTR monitorenter ;
        int i = _internalDrmMetadataInfos.indexOf(drmmetadatainfo);
        if (i == -1) goto _L2; else goto _L1
_L1:
        long l;
        long l2;
        l = ((DRMMetadataInfo)_internalDrmMetadataInfos.get(i)).getTimeRange().getBegin();
        l2 = drmmetadatainfo.getTimeRange().getBegin();
        if (l != l2) goto _L4; else goto _L3
_L3:
        boolean flag1 = false;
_L10:
        this;
        JVM INSTR monitorexit ;
        return flag1;
_L4:
        _internalDrmMetadataInfos.remove(i);
_L2:
        if (drmmetadatainfo.getTimeRange().getBegin() != -1L) goto _L6; else goto _L5
_L5:
        _internalDrmMetadataInfos.add(0, drmmetadatainfo);
        flag1 = true;
        continue; /* Loop/switch isn't completed */
_L6:
        i = _internalDrmMetadataInfos.size() - 1;
_L8:
        int j;
        j = ((flag) ? 1 : 0);
        if (i < 0)
        {
            break MISSING_BLOCK_LABEL_166;
        }
        TimeRange timerange = ((DRMMetadataInfo)_internalDrmMetadataInfos.get(i)).getTimeRange();
        if (drmmetadatainfo.getTimeRange().getBegin() <= timerange.getBegin())
        {
            break MISSING_BLOCK_LABEL_253;
        }
        j = i + 1;
        if (j <= 0)
        {
            break MISSING_BLOCK_LABEL_230;
        }
        DRMMetadataInfo drmmetadatainfo1 = (DRMMetadataInfo)_internalDrmMetadataInfos.get(j - 1);
        if (drmmetadatainfo1.getTimeRange().getBegin() != -1L)
        {
            long l1 = drmmetadatainfo1.getTimeRange().getBegin();
            drmmetadatainfo1.setTimeRange(TimeRange.createRange(l1, drmmetadatainfo.getTimeRange().getBegin() - l1));
        }
        _internalDrmMetadataInfos.add(j, drmmetadatainfo);
        _drmMetadataInfos = null;
        flag1 = true;
        continue; /* Loop/switch isn't completed */
        i--;
        if (true) goto _L8; else goto _L7
_L7:
        drmmetadatainfo;
        throw drmmetadatainfo;
        if (true) goto _L10; else goto _L9
_L9:
    }

    public List getDRMMetadataInfos()
    {
        this;
        JVM INSTR monitorenter ;
        List list;
        if (_drmMetadataInfos == null)
        {
            _drmMetadataInfos = Collections.unmodifiableList(_internalDrmMetadataInfos);
        }
        list = _drmMetadataInfos;
        this;
        JVM INSTR monitorexit ;
        return list;
        Exception exception;
        exception;
        throw exception;
    }

    public void reset()
    {
        this;
        JVM INSTR monitorenter ;
        _internalDrmMetadataInfos.clear();
        _drmMetadataInfos = Collections.emptyList();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    void update(Timeline timeline, long l)
    {
        this;
        JVM INSTR monitorenter ;
        if (timeline != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        timeline = new ArrayList();
        Iterator iterator = _internalDrmMetadataInfos.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            DRMMetadataInfo drmmetadatainfo = (DRMMetadataInfo)iterator.next();
            if (drmmetadatainfo.getTimeRange().getBegin() != -1L && drmmetadatainfo.getTimeRange().getEnd() < l)
            {
                timeline.add(drmmetadatainfo);
            }
        } while (true);
        break MISSING_BLOCK_LABEL_95;
        timeline;
        throw timeline;
        if (timeline.size() > 0)
        {
            _internalDrmMetadataInfos.removeAll(timeline);
            _logger.i((new StringBuilder()).append(LOG_TAG).append("#update").toString(), (new StringBuilder()).append("Removed ").append(timeline.size()).append(" old DRMMetadataInfo.").toString());
        }
        _drmMetadataInfos = null;
          goto _L1
    }

}
