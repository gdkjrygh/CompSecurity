// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo.greendao.mapping;

import com.fitbit.data.domain.TimeZone;

// Referenced classes of package com.fitbit.data.repo.greendao.mapping:
//            EntityMapper

public class TimeZoneMapper
    implements EntityMapper
{

    public TimeZoneMapper()
    {
    }

    public TimeZone fromDbEntity(com.fitbit.data.repo.greendao.TimeZone timezone)
    {
        if (timezone == null)
        {
            return null;
        } else
        {
            return new TimeZone(timezone.getTimeZoneId(), timezone.getName(), timezone.getOffset().longValue());
        }
    }

    public volatile Object fromDbEntity(Object obj)
    {
        return fromDbEntity((com.fitbit.data.repo.greendao.TimeZone)obj);
    }

    public com.fitbit.data.repo.greendao.TimeZone toDbEntity(TimeZone timezone)
    {
        return toDbEntity(timezone, new com.fitbit.data.repo.greendao.TimeZone());
    }

    public com.fitbit.data.repo.greendao.TimeZone toDbEntity(TimeZone timezone, com.fitbit.data.repo.greendao.TimeZone timezone1)
    {
        if (timezone == null)
        {
            return null;
        }
        com.fitbit.data.repo.greendao.TimeZone timezone2 = timezone1;
        if (timezone1 == null)
        {
            timezone2 = new com.fitbit.data.repo.greendao.TimeZone();
        }
        if (timezone2.getId() == null)
        {
            timezone2.setId(timezone.getEntityId());
        }
        timezone2.setTimeZoneId(timezone.c());
        timezone2.setEntityStatus(Integer.valueOf(timezone.getEntityStatus().getCode()));
        timezone2.setName(timezone.a());
        timezone2.setOffset(Long.valueOf(timezone.b()));
        return timezone2;
    }

    public volatile Object toDbEntity(Object obj)
    {
        return toDbEntity((TimeZone)obj);
    }

    public volatile Object toDbEntity(Object obj, Object obj1)
    {
        return toDbEntity((TimeZone)obj, (com.fitbit.data.repo.greendao.TimeZone)obj1);
    }
}
