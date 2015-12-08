// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore;

import com.adobe.ave.drm.DRMManager;
import com.adobe.ave.drm.DRMMetadata;
import com.adobe.ave.drm.DRMOperationErrorCallback;
import com.adobe.mediacore.logging.Log;
import com.adobe.mediacore.logging.Logger;
import com.adobe.mediacore.utils.TimeRange;

public class DRMMetadataInfo
{

    public static final long INVALID_TIME_RANGE_START_POSITION_AVE = -1000L;
    public static final long INVALID_TIME_RANGE_START_POSITION_PSDK = -1L;
    private static final String LOG_TAG = (new StringBuilder()).append("[PSDK]::").append(com/adobe/mediacore/DRMMetadataInfo.getSimpleName()).toString();
    private static Logger _logger = Log.getLogger(LOG_TAG);
    private final DRMMetadata _drmMetadata;
    private final long _prefetchDeadline;
    private TimeRange _timeRange;

    protected DRMMetadataInfo(DRMMetadata drmmetadata, TimeRange timerange, long l)
    {
        _drmMetadata = drmmetadata;
        _timeRange = timerange;
        _prefetchDeadline = l;
    }

    public static DRMMetadataInfo createDRMMetadataInfo(DRMManager drmmanager, byte abyte0[], int i, long l, boolean flag)
    {
        if (drmmanager == null)
        {
            _logger.e((new StringBuilder()).append(LOG_TAG).append("#createDRMMetadataInfo").toString(), "DRMManager is null.");
            return null;
        }
        abyte0 = drmmanager.createMetadataFromBytes(abyte0, new DRMOperationErrorCallback() {

            public void OperationError(long l1, long l2, Exception exception)
            {
                DRMMetadataInfo._logger.e((new StringBuilder()).append(DRMMetadataInfo.LOG_TAG).append("#createDRMMetadataInfo").toString(), (new StringBuilder()).append("Error loading DRM metadata: ").append(l1).append(" 0x").append(Long.toHexString(l2)).toString());
            }

        });
        if (abyte0 == null)
        {
            _logger.e((new StringBuilder()).append(LOG_TAG).append("#createDRMMetadataInfo").toString(), "DRMMetadata is null.");
            return null;
        }
        if (l == -1000L)
        {
            drmmanager = TimeRange.createRange(-1L, 0L);
            l = -1L;
        } else
        {
            drmmanager = TimeRange.createRange(l, 0x7fffffffL);
        }
        return new DRMMetadataInfo(abyte0, drmmanager, l);
    }

    public boolean equals(Object obj)
    {
        if (obj == this)
        {
            return true;
        }
        if (obj == null || !(obj instanceof DRMMetadataInfo))
        {
            return false;
        } else
        {
            obj = (DRMMetadataInfo)obj;
            return getDRMMetadata().getLicenseId().equals(((DRMMetadataInfo) (obj)).getDRMMetadata().getLicenseId());
        }
    }

    public DRMMetadata getDRMMetadata()
    {
        return _drmMetadata;
    }

    public long getPrefetchTimestamp()
    {
        return _prefetchDeadline;
    }

    public TimeRange getTimeRange()
    {
        return _timeRange;
    }

    public int hashCode()
    {
        return getDRMMetadata().getLicenseId().hashCode();
    }

    public void setTimeRange(TimeRange timerange)
    {
        _timeRange = timerange;
    }

    public String toString()
    {
        return (new StringBuilder()).append("DRMMetadataInfo { range begin: ").append(getTimeRange().getBegin()).append(", ").append("end: ").append(getTimeRange().getEnd()).append(", ").append("prefetchDeadline: ").append(getPrefetchTimestamp()).append(", ").append(" }").toString();
    }



}
