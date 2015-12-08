// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo.greendao.mapping;

import com.fitbit.data.domain.SleepLogEntry;
import com.fitbit.util.w;

// Referenced classes of package com.fitbit.data.repo.greendao.mapping:
//            EntityMapper, MappingUtils

public class SleepLogEntryMapper
    implements EntityMapper
{

    public SleepLogEntryMapper()
    {
    }

    public SleepLogEntry fromDbEntity(com.fitbit.data.repo.greendao.logging.SleepLogEntry sleeplogentry)
    {
        if (sleeplogentry == null)
        {
            return null;
        } else
        {
            SleepLogEntry sleeplogentry1 = new SleepLogEntry();
            sleeplogentry1.setEntityId(sleeplogentry.getId());
            sleeplogentry1.setServerId(sleeplogentry.getServerId().longValue());
            sleeplogentry1.setLogDate(sleeplogentry.getLogDate());
            sleeplogentry1.a(sleeplogentry.getStartTime());
            sleeplogentry1.setTimeCreated(sleeplogentry.getTimeCreated());
            sleeplogentry1.setTimeUpdated(sleeplogentry.getTimeUpdated());
            sleeplogentry1.setUuid(MappingUtils.uuidFromString(sleeplogentry.getUuid()));
            sleeplogentry1.setEntityStatus((com.fitbit.data.domain.Entity.EntityStatus)w.a(sleeplogentry.getEntityStatus().intValue(), com/fitbit/data/domain/Entity$EntityStatus));
            sleeplogentry1.f(sleeplogentry.getAwakeningsCount().intValue());
            sleeplogentry1.a(sleeplogentry.getDuration().intValue());
            sleeplogentry1.a(sleeplogentry.getEfficiency().floatValue());
            sleeplogentry1.a(sleeplogentry.getIsMainSleep().booleanValue());
            sleeplogentry1.e(sleeplogentry.getMinutesAfterWakeup().intValue());
            sleeplogentry1.c(sleeplogentry.getMinutesAsleep().intValue());
            sleeplogentry1.d(sleeplogentry.getMinutesAwake().intValue());
            sleeplogentry1.b(sleeplogentry.getMinutesToFallAsleep().intValue());
            sleeplogentry1.i(sleeplogentry.getTimeInBed().intValue());
            sleeplogentry1.g(sleeplogentry.getAwakeCount().intValue());
            sleeplogentry1.h(sleeplogentry.getRestlessCount().intValue());
            return sleeplogentry1;
        }
    }

    public volatile Object fromDbEntity(Object obj)
    {
        return fromDbEntity((com.fitbit.data.repo.greendao.logging.SleepLogEntry)obj);
    }

    public com.fitbit.data.repo.greendao.logging.SleepLogEntry toDbEntity(SleepLogEntry sleeplogentry)
    {
        return toDbEntity(sleeplogentry, new com.fitbit.data.repo.greendao.logging.SleepLogEntry());
    }

    public com.fitbit.data.repo.greendao.logging.SleepLogEntry toDbEntity(SleepLogEntry sleeplogentry, com.fitbit.data.repo.greendao.logging.SleepLogEntry sleeplogentry1)
    {
        if (sleeplogentry == null)
        {
            return null;
        }
        com.fitbit.data.repo.greendao.logging.SleepLogEntry sleeplogentry2 = sleeplogentry1;
        if (sleeplogentry1 == null)
        {
            sleeplogentry2 = new com.fitbit.data.repo.greendao.logging.SleepLogEntry();
        }
        if (sleeplogentry2.getId() == null)
        {
            sleeplogentry2.setId(sleeplogentry.getEntityId());
        }
        sleeplogentry2.setServerId(Long.valueOf(sleeplogentry.getServerId()));
        sleeplogentry2.setStartTime(sleeplogentry.a());
        sleeplogentry2.setTimeCreated(sleeplogentry.getTimeCreated());
        sleeplogentry2.setTimeUpdated(sleeplogentry.getTimeUpdated());
        sleeplogentry2.setUuid(MappingUtils.uuidToString(sleeplogentry.getUuid()));
        sleeplogentry2.setEntityStatus(Integer.valueOf(sleeplogentry.getEntityStatus().getCode()));
        sleeplogentry2.setLogDate(sleeplogentry.getLogDate());
        sleeplogentry2.setAwakeningsCount(Integer.valueOf(sleeplogentry.j()));
        sleeplogentry2.setDuration(Integer.valueOf(sleeplogentry.e()));
        sleeplogentry2.setEfficiency(Double.valueOf(sleeplogentry.d()));
        sleeplogentry2.setIsMainSleep(Boolean.valueOf(sleeplogentry.c()));
        sleeplogentry2.setMinutesAfterWakeup(Integer.valueOf(sleeplogentry.i()));
        sleeplogentry2.setMinutesAsleep(Integer.valueOf(sleeplogentry.g()));
        sleeplogentry2.setMinutesAwake(Integer.valueOf(sleeplogentry.h()));
        sleeplogentry2.setMinutesToFallAsleep(Integer.valueOf(sleeplogentry.f()));
        sleeplogentry2.setTimeInBed(Integer.valueOf(sleeplogentry.m()));
        sleeplogentry2.setAwakeCount(Integer.valueOf(sleeplogentry.k()));
        sleeplogentry2.setRestlessCount(Integer.valueOf(sleeplogentry.l()));
        return sleeplogentry2;
    }

    public volatile Object toDbEntity(Object obj)
    {
        return toDbEntity((SleepLogEntry)obj);
    }

    public volatile Object toDbEntity(Object obj, Object obj1)
    {
        return toDbEntity((SleepLogEntry)obj, (com.fitbit.data.repo.greendao.logging.SleepLogEntry)obj1);
    }
}
