// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo.greendao.mapping;

import com.fitbit.data.domain.Alarm;
import com.fitbit.data.domain.device.Device;

// Referenced classes of package com.fitbit.data.repo.greendao.mapping:
//            EntityMapper

public class AlarmMapper
    implements EntityMapper
{

    public AlarmMapper()
    {
    }

    public Alarm fromDbEntity(com.fitbit.data.repo.greendao.Alarm alarm)
    {
        if (alarm == null)
        {
            return null;
        }
        Alarm alarm1 = new Alarm();
        alarm1.setEntityStatus(com.fitbit.data.domain.Entity.EntityStatus.valueOf(alarm.getEntityStatus().intValue()));
        alarm1.setServerId(alarm.getServerId().longValue());
        alarm1.setEntityId(alarm.getId());
        alarm1.b(alarm.getEnabled().booleanValue());
        alarm1.c(alarm.getRecurring().booleanValue());
        alarm1.a(alarm.getLabel());
        alarm1.a(alarm.getSnoozeCount().intValue());
        alarm1.a(alarm.getSnoozeLength().longValue());
        alarm1.d(alarm.getSyncedToDevice().booleanValue());
        alarm1.a(alarm.getTime());
        alarm1.b(alarm.getVibePattern());
        alarm1.b(alarm.getDaysOfWeek().intValue());
        alarm1.e(alarm.getDeleted().booleanValue());
        long l;
        boolean flag;
        if (alarm.getDeviceId() == null)
        {
            l = -1L;
        } else
        {
            l = alarm.getDeviceId().longValue();
        }
        alarm1.b(l);
        if (alarm.getStayVisible() == null)
        {
            flag = false;
        } else
        {
            flag = alarm.getStayVisible().booleanValue();
        }
        alarm1.a(flag);
        return alarm1;
    }

    public volatile Object fromDbEntity(Object obj)
    {
        return fromDbEntity((com.fitbit.data.repo.greendao.Alarm)obj);
    }

    public com.fitbit.data.repo.greendao.Alarm toDbEntity(Alarm alarm)
    {
        return toDbEntity(alarm, new com.fitbit.data.repo.greendao.Alarm());
    }

    public com.fitbit.data.repo.greendao.Alarm toDbEntity(Alarm alarm, com.fitbit.data.repo.greendao.Alarm alarm1)
    {
        if (alarm == null)
        {
            alarm1 = null;
        } else
        {
            com.fitbit.data.repo.greendao.Alarm alarm2 = alarm1;
            if (alarm1 == null)
            {
                alarm2 = new com.fitbit.data.repo.greendao.Alarm();
            }
            if (alarm2.getId() == null)
            {
                alarm2.setId(alarm.getEntityId());
            }
            alarm2.setEntityStatus(Integer.valueOf(alarm.getEntityStatus().getCode()));
            alarm2.setServerId(Long.valueOf(alarm.getServerId()));
            alarm2.setEnabled(Boolean.valueOf(alarm.a()));
            alarm2.setRecurring(Boolean.valueOf(alarm.c()));
            alarm2.setLabel(alarm.d());
            alarm2.setSnoozeCount(Integer.valueOf(alarm.e()));
            alarm2.setSnoozeLength(Long.valueOf(alarm.f()));
            alarm2.setSyncedToDevice(Boolean.valueOf(alarm.g()));
            alarm2.setTime(alarm.h());
            alarm2.setVibePattern(alarm.i());
            alarm2.setDaysOfWeek(Integer.valueOf(alarm.j()));
            alarm2.setDeleted(Boolean.valueOf(alarm.l()));
            alarm2.setStayVisible(Boolean.valueOf(alarm.b()));
            alarm1 = alarm2;
            if (alarm.k() != null)
            {
                alarm2.setDeviceId(alarm.k().getEntityId());
                return alarm2;
            }
        }
        return alarm1;
    }

    public volatile Object toDbEntity(Object obj)
    {
        return toDbEntity((Alarm)obj);
    }

    public volatile Object toDbEntity(Object obj, Object obj1)
    {
        return toDbEntity((Alarm)obj, (com.fitbit.data.repo.greendao.Alarm)obj1);
    }
}
