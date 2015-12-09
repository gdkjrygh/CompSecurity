// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo.greendao.mapping;

import com.fitbit.data.repo.greendao.mobiletrack.PedometerMinuteData;
import com.fitbit.util.w;

// Referenced classes of package com.fitbit.data.repo.greendao.mapping:
//            EntityMapper, MappingUtils

public class PedometerMinuteDataMapper
    implements EntityMapper
{

    PedometerMinuteData data;

    public PedometerMinuteDataMapper()
    {
    }

    public com.fitbit.data.domain.PedometerMinuteData fromDbEntity(PedometerMinuteData pedometerminutedata)
    {
        if (pedometerminutedata == null)
        {
            return null;
        } else
        {
            Object obj = com.fitbit.data.domain.PedometerMinuteData.PedometerMinuteType.valueOf(pedometerminutedata.getMinuteType().intValue());
            obj = new com.fitbit.data.domain.PedometerMinuteData(pedometerminutedata.getTimestamp(), pedometerminutedata.getStepsCount(), pedometerminutedata.getMetsCount(), ((com.fitbit.data.domain.PedometerMinuteData.PedometerMinuteType) (obj)));
            ((com.fitbit.data.domain.PedometerMinuteData) (obj)).setUuid(MappingUtils.uuidFromString(pedometerminutedata.getUuid()));
            ((com.fitbit.data.domain.PedometerMinuteData) (obj)).setTimeCreated(pedometerminutedata.getTimeCreated());
            ((com.fitbit.data.domain.PedometerMinuteData) (obj)).setTimeUpdated(pedometerminutedata.getTimeUpdated());
            ((com.fitbit.data.domain.PedometerMinuteData) (obj)).setServerId(pedometerminutedata.getServerId().longValue());
            ((com.fitbit.data.domain.PedometerMinuteData) (obj)).setEntityStatus((com.fitbit.data.domain.Entity.EntityStatus)w.a(pedometerminutedata.getEntityStatus().intValue(), com/fitbit/data/domain/Entity$EntityStatus));
            ((com.fitbit.data.domain.PedometerMinuteData) (obj)).setEntityId(pedometerminutedata.getId());
            return ((com.fitbit.data.domain.PedometerMinuteData) (obj));
        }
    }

    public volatile Object fromDbEntity(Object obj)
    {
        return fromDbEntity((PedometerMinuteData)obj);
    }

    public PedometerMinuteData toDbEntity(com.fitbit.data.domain.PedometerMinuteData pedometerminutedata)
    {
        return toDbEntity(pedometerminutedata, new PedometerMinuteData());
    }

    public PedometerMinuteData toDbEntity(com.fitbit.data.domain.PedometerMinuteData pedometerminutedata, PedometerMinuteData pedometerminutedata1)
    {
        if (pedometerminutedata == null)
        {
            return null;
        }
        PedometerMinuteData pedometerminutedata2 = pedometerminutedata1;
        if (pedometerminutedata1 == null)
        {
            pedometerminutedata2 = new PedometerMinuteData();
        }
        pedometerminutedata2.setTimestamp(pedometerminutedata.a());
        pedometerminutedata2.setStepsCount(pedometerminutedata.b());
        pedometerminutedata2.setMetsCount(pedometerminutedata.c());
        pedometerminutedata2.setMinuteType(Integer.valueOf(pedometerminutedata.d().getCode()));
        pedometerminutedata2.setUuid(MappingUtils.uuidToString(pedometerminutedata.getUuid()));
        pedometerminutedata2.setTimeCreated(pedometerminutedata.getTimeCreated());
        pedometerminutedata2.setTimeUpdated(pedometerminutedata.getTimeUpdated());
        pedometerminutedata2.setServerId(Long.valueOf(pedometerminutedata.getServerId()));
        pedometerminutedata2.setEntityStatus(Integer.valueOf(pedometerminutedata.getEntityStatus().getCode()));
        pedometerminutedata2.setId(Long.valueOf(pedometerminutedata.a()));
        return pedometerminutedata2;
    }

    public volatile Object toDbEntity(Object obj)
    {
        return toDbEntity((com.fitbit.data.domain.PedometerMinuteData)obj);
    }

    public volatile Object toDbEntity(Object obj, Object obj1)
    {
        return toDbEntity((com.fitbit.data.domain.PedometerMinuteData)obj, (PedometerMinuteData)obj1);
    }
}
