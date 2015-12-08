// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.loyalty.debug;

import com.google.common.base.Objects;
import com.google.protobuf.ByteString;
import java.util.Collections;
import java.util.List;

public final class DebugInfo
{

    private List experimentalInstances;
    private Long imageCompressionTimeInMs;
    private Integer imageSize;
    private Integer requestCount;
    private Integer responseCount;
    private Long serverProcessingTimeInMs;
    private Long timeSinceStartInMs;
    private Long timeToFirstClientResultInMs;
    private Long timeToFirstServerResultInMs;
    private Long timeToFirstValidFrameInMs;

    public DebugInfo()
    {
        experimentalInstances = Collections.emptyList();
    }

    private Long getImageCompressionTimeInMs()
    {
        return imageCompressionTimeInMs;
    }

    public final boolean equals(Object obj)
    {
        if (!super.equals(obj))
        {
            if (obj instanceof DebugInfo)
            {
                if (hashCode() != ((DebugInfo) (obj = (DebugInfo)obj)).hashCode() || !Objects.equal(imageSize, ((DebugInfo) (obj)).imageSize) || !Objects.equal(imageCompressionTimeInMs, ((DebugInfo) (obj)).imageCompressionTimeInMs) || !Objects.equal(requestCount, ((DebugInfo) (obj)).requestCount) || !Objects.equal(responseCount, ((DebugInfo) (obj)).responseCount) || !Objects.equal(serverProcessingTimeInMs, ((DebugInfo) (obj)).serverProcessingTimeInMs) || !Objects.equal(timeSinceStartInMs, ((DebugInfo) (obj)).timeSinceStartInMs) || !Objects.equal(timeToFirstValidFrameInMs, ((DebugInfo) (obj)).timeToFirstValidFrameInMs) || !Objects.equal(timeToFirstClientResultInMs, ((DebugInfo) (obj)).timeToFirstClientResultInMs) || !Objects.equal(timeToFirstServerResultInMs, ((DebugInfo) (obj)).timeToFirstServerResultInMs))
                {
                    return false;
                }
            } else
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        return Objects.hashCode(new Object[] {
            imageSize, getImageCompressionTimeInMs(), requestCount, responseCount, serverProcessingTimeInMs, timeSinceStartInMs, timeToFirstValidFrameInMs, timeToFirstClientResultInMs, timeToFirstServerResultInMs
        });
    }

    public final DebugInfo setCurrentOperationCount(int i, int j)
    {
        requestCount = Integer.valueOf(i);
        responseCount = Integer.valueOf(j);
        return this;
    }

    public final DebugInfo setExperimentalInstances(List list)
    {
        experimentalInstances = list;
        return this;
    }

    public final DebugInfo setRequest(com.google.commerce.ocr.rpc.ServiceProto.RecognizeWobDataRequest recognizewobdatarequest)
    {
        imageSize = Integer.valueOf(recognizewobdatarequest.getImage().getImage().size());
        return this;
    }

    public final DebugInfo setServerProcessingTime(long l)
    {
        serverProcessingTimeInMs = Long.valueOf(l);
        return this;
    }

    public final DebugInfo setTimeSinceStartInMs(long l)
    {
        timeSinceStartInMs = Long.valueOf(l);
        return this;
    }

    public final DebugInfo setTimeToFirstClientResultInMs(Long long1)
    {
        timeToFirstClientResultInMs = long1;
        return this;
    }

    public final DebugInfo setTimeToFirstServerResultInMs(Long long1)
    {
        timeToFirstServerResultInMs = long1;
        return this;
    }

    public final DebugInfo setTimeToFirstValidFrameInMs(Long long1)
    {
        timeToFirstValidFrameInMs = long1;
        return this;
    }
}
