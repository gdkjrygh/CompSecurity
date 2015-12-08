// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo.greendao.mapping;

import com.fitbit.data.domain.BodyFatLogEntry;
import com.fitbit.util.w;
import com.fitbit.weight.Fat;

// Referenced classes of package com.fitbit.data.repo.greendao.mapping:
//            EntityMapper, MappingUtils

public class BodyFatMapper
    implements EntityMapper
{

    public BodyFatMapper()
    {
    }

    public BodyFatLogEntry fromDbEntity(com.fitbit.data.repo.greendao.logging.BodyFatLogEntry bodyfatlogentry)
    {
        if (bodyfatlogentry == null)
        {
            return null;
        } else
        {
            BodyFatLogEntry bodyfatlogentry1 = new BodyFatLogEntry();
            bodyfatlogentry1.setEntityId(bodyfatlogentry.getId());
            bodyfatlogentry1.setServerId(bodyfatlogentry.getServerId().longValue());
            bodyfatlogentry1.setLogDate(bodyfatlogentry.getLogDate());
            bodyfatlogentry1.a(new Fat(bodyfatlogentry.getValue().doubleValue()));
            bodyfatlogentry1.setTimeCreated(bodyfatlogentry.getTimeCreated());
            bodyfatlogentry1.setTimeUpdated(bodyfatlogentry.getTimeUpdated());
            bodyfatlogentry1.setUuid(MappingUtils.uuidFromString(bodyfatlogentry.getUuid()));
            bodyfatlogentry1.setEntityStatus((com.fitbit.data.domain.Entity.EntityStatus)w.a(bodyfatlogentry.getEntityStatus().intValue(), com/fitbit/data/domain/Entity$EntityStatus));
            return bodyfatlogentry1;
        }
    }

    public volatile Object fromDbEntity(Object obj)
    {
        return fromDbEntity((com.fitbit.data.repo.greendao.logging.BodyFatLogEntry)obj);
    }

    public com.fitbit.data.repo.greendao.logging.BodyFatLogEntry toDbEntity(BodyFatLogEntry bodyfatlogentry)
    {
        return toDbEntity(bodyfatlogentry, new com.fitbit.data.repo.greendao.logging.BodyFatLogEntry());
    }

    public com.fitbit.data.repo.greendao.logging.BodyFatLogEntry toDbEntity(BodyFatLogEntry bodyfatlogentry, com.fitbit.data.repo.greendao.logging.BodyFatLogEntry bodyfatlogentry1)
    {
        if (bodyfatlogentry == null)
        {
            return null;
        }
        com.fitbit.data.repo.greendao.logging.BodyFatLogEntry bodyfatlogentry2 = bodyfatlogentry1;
        if (bodyfatlogentry1 == null)
        {
            bodyfatlogentry2 = new com.fitbit.data.repo.greendao.logging.BodyFatLogEntry();
        }
        if (bodyfatlogentry2.getId() == null)
        {
            bodyfatlogentry2.setId(bodyfatlogentry.getEntityId());
        }
        bodyfatlogentry2.setServerId(Long.valueOf(bodyfatlogentry.getServerId()));
        bodyfatlogentry2.setLogDate(bodyfatlogentry.getLogDate());
        bodyfatlogentry2.setValue(Double.valueOf(bodyfatlogentry.a().b()));
        bodyfatlogentry2.setTimeCreated(bodyfatlogentry.getTimeCreated());
        bodyfatlogentry2.setTimeUpdated(bodyfatlogentry.getTimeUpdated());
        bodyfatlogentry2.setUuid(MappingUtils.uuidToString(bodyfatlogentry.getUuid()));
        bodyfatlogentry2.setEntityStatus(Integer.valueOf(bodyfatlogentry.getEntityStatus().getCode()));
        return bodyfatlogentry2;
    }

    public volatile Object toDbEntity(Object obj)
    {
        return toDbEntity((BodyFatLogEntry)obj);
    }

    public volatile Object toDbEntity(Object obj, Object obj1)
    {
        return toDbEntity((BodyFatLogEntry)obj, (com.fitbit.data.repo.greendao.logging.BodyFatLogEntry)obj1);
    }
}
