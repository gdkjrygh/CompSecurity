// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo.greendao.mapping;

import com.fitbit.data.domain.WaterLogEntry;
import com.fitbit.util.w;
import com.fitbit.water.Water;

// Referenced classes of package com.fitbit.data.repo.greendao.mapping:
//            EntityMapper, MappingUtils

public class WaterLogEntryMapper
    implements EntityMapper
{

    public WaterLogEntryMapper()
    {
    }

    public WaterLogEntry fromDbEntity(com.fitbit.data.repo.greendao.logging.WaterLogEntry waterlogentry)
    {
        if (waterlogentry == null)
        {
            return null;
        } else
        {
            WaterLogEntry waterlogentry1 = new WaterLogEntry();
            waterlogentry1.setEntityId(waterlogentry.getId());
            waterlogentry1.setServerId(waterlogentry.getServerId().longValue());
            waterlogentry1.setLogDate(waterlogentry.getLogDate());
            waterlogentry1.a(new Water(waterlogentry.getValue().doubleValue(), com.fitbit.data.domain.WaterLogEntry.WaterUnits.ML));
            waterlogentry1.setTimeCreated(waterlogentry.getTimeCreated());
            waterlogentry1.setTimeUpdated(waterlogentry.getTimeUpdated());
            waterlogentry1.setUuid(MappingUtils.uuidFromString(waterlogentry.getUuid()));
            waterlogentry1.setEntityStatus((com.fitbit.data.domain.Entity.EntityStatus)w.a(waterlogentry.getEntityStatus().intValue(), com/fitbit/data/domain/Entity$EntityStatus));
            return waterlogentry1;
        }
    }

    public volatile Object fromDbEntity(Object obj)
    {
        return fromDbEntity((com.fitbit.data.repo.greendao.logging.WaterLogEntry)obj);
    }

    public com.fitbit.data.repo.greendao.logging.WaterLogEntry toDbEntity(WaterLogEntry waterlogentry)
    {
        return toDbEntity(waterlogentry, new com.fitbit.data.repo.greendao.logging.WaterLogEntry());
    }

    public com.fitbit.data.repo.greendao.logging.WaterLogEntry toDbEntity(WaterLogEntry waterlogentry, com.fitbit.data.repo.greendao.logging.WaterLogEntry waterlogentry1)
    {
        if (waterlogentry == null)
        {
            return null;
        }
        com.fitbit.data.repo.greendao.logging.WaterLogEntry waterlogentry2 = waterlogentry1;
        if (waterlogentry1 == null)
        {
            waterlogentry2 = new com.fitbit.data.repo.greendao.logging.WaterLogEntry();
        }
        if (waterlogentry2.getId() == null)
        {
            waterlogentry2.setId(waterlogentry.getEntityId());
        }
        waterlogentry2.setServerId(Long.valueOf(waterlogentry.getServerId()));
        waterlogentry2.setLogDate(waterlogentry.getLogDate());
        waterlogentry2.setValue(Double.valueOf(waterlogentry.e().a(com.fitbit.data.domain.WaterLogEntry.WaterUnits.ML).b()));
        waterlogentry2.setTimeCreated(waterlogentry.getTimeCreated());
        waterlogentry2.setTimeUpdated(waterlogentry.getTimeUpdated());
        waterlogentry2.setUuid(MappingUtils.uuidToString(waterlogentry.getUuid()));
        waterlogentry2.setEntityStatus(Integer.valueOf(waterlogentry.getEntityStatus().getCode()));
        return waterlogentry2;
    }

    public volatile Object toDbEntity(Object obj)
    {
        return toDbEntity((WaterLogEntry)obj);
    }

    public volatile Object toDbEntity(Object obj, Object obj1)
    {
        return toDbEntity((WaterLogEntry)obj, (com.fitbit.data.repo.greendao.logging.WaterLogEntry)obj1);
    }
}
