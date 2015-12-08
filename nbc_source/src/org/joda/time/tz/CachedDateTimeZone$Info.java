// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.joda.time.tz;

import org.joda.time.DateTimeZone;

// Referenced classes of package org.joda.time.tz:
//            CachedDateTimeZone

private static final class iZoneRef
{

    private String iNameKey;
    getStandardOffset iNextInfo;
    private int iOffset;
    public final long iPeriodStart;
    private int iStandardOffset;
    public final DateTimeZone iZoneRef;

    public String getNameKey(long l)
    {
        if (iNextInfo == null || l < iNextInfo.iPeriodStart)
        {
            if (iNameKey == null)
            {
                iNameKey = iZoneRef.getNameKey(iPeriodStart);
            }
            return iNameKey;
        } else
        {
            return iNextInfo.getNameKey(l);
        }
    }

    public int getOffset(long l)
    {
        if (iNextInfo == null || l < iNextInfo.iPeriodStart)
        {
            if (iOffset == 0x80000000)
            {
                iOffset = iZoneRef.getOffset(iPeriodStart);
            }
            return iOffset;
        } else
        {
            return iNextInfo.getOffset(l);
        }
    }

    public int getStandardOffset(long l)
    {
        if (iNextInfo == null || l < iNextInfo.iPeriodStart)
        {
            if (iStandardOffset == 0x80000000)
            {
                iStandardOffset = iZoneRef.getStandardOffset(iPeriodStart);
            }
            return iStandardOffset;
        } else
        {
            return iNextInfo.getStandardOffset(l);
        }
    }

    (DateTimeZone datetimezone, long l)
    {
        iOffset = 0x80000000;
        iStandardOffset = 0x80000000;
        iPeriodStart = l;
        iZoneRef = datetimezone;
    }
}
