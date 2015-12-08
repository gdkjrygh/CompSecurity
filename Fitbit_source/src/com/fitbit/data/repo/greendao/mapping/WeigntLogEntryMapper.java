// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo.greendao.mapping;

import com.fitbit.data.domain.WeightLogEntry;
import com.fitbit.util.w;
import com.fitbit.weight.Weight;

// Referenced classes of package com.fitbit.data.repo.greendao.mapping:
//            EntityMapper, MappingUtils

public class WeigntLogEntryMapper
    implements EntityMapper
{

    public WeigntLogEntryMapper()
    {
    }

    public WeightLogEntry fromDbEntity(com.fitbit.data.repo.greendao.logging.WeightLogEntry weightlogentry)
    {
        if (weightlogentry == null)
        {
            return null;
        } else
        {
            WeightLogEntry weightlogentry1 = new WeightLogEntry();
            weightlogentry1.setEntityId(weightlogentry.getId());
            weightlogentry1.setServerId(weightlogentry.getServerId().longValue());
            weightlogentry1.setLogDate(weightlogentry.getLogDate());
            weightlogentry1.a(new Weight(weightlogentry.getValue().doubleValue(), com.fitbit.data.domain.WeightLogEntry.WeightUnits.GRAMS));
            weightlogentry1.setTimeCreated(weightlogentry.getTimeCreated());
            weightlogentry1.setTimeUpdated(weightlogentry.getTimeUpdated());
            weightlogentry1.setUuid(MappingUtils.uuidFromString(weightlogentry.getUuid()));
            weightlogentry1.setEntityStatus((com.fitbit.data.domain.Entity.EntityStatus)w.a(weightlogentry.getEntityStatus().intValue(), com/fitbit/data/domain/Entity$EntityStatus));
            weightlogentry1.a(weightlogentry.getBmi().doubleValue());
            return weightlogentry1;
        }
    }

    public volatile Object fromDbEntity(Object obj)
    {
        return fromDbEntity((com.fitbit.data.repo.greendao.logging.WeightLogEntry)obj);
    }

    public com.fitbit.data.repo.greendao.logging.WeightLogEntry toDbEntity(WeightLogEntry weightlogentry)
    {
        return toDbEntity(weightlogentry, new com.fitbit.data.repo.greendao.logging.WeightLogEntry());
    }

    public com.fitbit.data.repo.greendao.logging.WeightLogEntry toDbEntity(WeightLogEntry weightlogentry, com.fitbit.data.repo.greendao.logging.WeightLogEntry weightlogentry1)
    {
        if (weightlogentry == null)
        {
            return null;
        }
        com.fitbit.data.repo.greendao.logging.WeightLogEntry weightlogentry2 = weightlogentry1;
        if (weightlogentry1 == null)
        {
            weightlogentry2 = new com.fitbit.data.repo.greendao.logging.WeightLogEntry();
        }
        if (weightlogentry2.getId() == null)
        {
            weightlogentry2.setId(weightlogentry.getEntityId());
        }
        weightlogentry2.setServerId(Long.valueOf(weightlogentry.getServerId()));
        weightlogentry2.setLogDate(weightlogentry.getLogDate());
        weightlogentry2.setValue(Double.valueOf(weightlogentry.a().a(com.fitbit.data.domain.WeightLogEntry.WeightUnits.GRAMS).b()));
        weightlogentry2.setTimeCreated(weightlogentry.getTimeCreated());
        weightlogentry2.setTimeUpdated(weightlogentry.getTimeUpdated());
        weightlogentry2.setEntityStatus(Integer.valueOf(weightlogentry.getEntityStatus().getCode()));
        weightlogentry2.setBmi(Double.valueOf(weightlogentry.b()));
        return weightlogentry2;
    }

    public volatile Object toDbEntity(Object obj)
    {
        return toDbEntity((WeightLogEntry)obj);
    }

    public volatile Object toDbEntity(Object obj, Object obj1)
    {
        return toDbEntity((WeightLogEntry)obj, (com.fitbit.data.repo.greendao.logging.WeightLogEntry)obj1);
    }
}
