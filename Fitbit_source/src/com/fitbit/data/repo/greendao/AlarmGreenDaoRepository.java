// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo.greendao;

import com.fitbit.data.domain.Alarm;
import com.fitbit.data.domain.Entity;
import com.fitbit.data.domain.device.Device;
import com.fitbit.data.repo.g;
import com.fitbit.data.repo.greendao.mapping.AlarmMapper;
import com.fitbit.data.repo.greendao.mapping.EntityMapper;
import com.fitbit.util.w;
import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.AbstractDaoSession;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.query.WhereCondition;
import java.util.List;

// Referenced classes of package com.fitbit.data.repo.greendao:
//            AbstractEntityGreenDaoRepository, DaoSession, Alarm

public class AlarmGreenDaoRepository extends AbstractEntityGreenDaoRepository
    implements g
{

    public AlarmGreenDaoRepository()
    {
    }

    protected EntityMapper createMapper(AbstractDaoSession abstractdaosession)
    {
        return new AlarmMapper();
    }

    public void delete(Alarm alarm)
    {
        if (alarm.getEntityStatus() == com.fitbit.data.domain.Entity.EntityStatus.PENDING_DELETE && alarm.l() && alarm.b())
        {
            alarm.setEntityStatus(com.fitbit.data.domain.Entity.EntityStatus.SYNCED);
            save(alarm);
            return;
        } else
        {
            super.delete(alarm);
            return;
        }
    }

    public volatile void delete(Entity entity)
    {
        delete((Alarm)entity);
    }

    public List getAlarmsForDevice(Device device)
    {
        return getEntitiesWhereAnd(AlarmDao.Properties.DeviceId.eq(device.getEntityId()), new WhereCondition[] {
            AlarmDao.Properties.EntityStatus.in((Object[])w.a(new com.fitbit.data.domain.Entity.EntityStatus[] {
                com.fitbit.data.domain.Entity.EntityStatus.SYNCED, com.fitbit.data.domain.Entity.EntityStatus.PENDING_OPERATION, com.fitbit.data.domain.Entity.EntityStatus.PENDING_DELETE
            }))
        });
    }

    public List getAllAlarms()
    {
        return getEntitiesWhereAnd(AlarmDao.Properties.EntityStatus.in((Object[])w.a(new com.fitbit.data.domain.Entity.EntityStatus[] {
            com.fitbit.data.domain.Entity.EntityStatus.SYNCED, com.fitbit.data.domain.Entity.EntityStatus.PENDING_OPERATION, com.fitbit.data.domain.Entity.EntityStatus.PENDING_DELETE
        })), new WhereCondition[0]);
    }

    protected AbstractDao getDaoFrom(AbstractDaoSession abstractdaosession)
    {
        return ((DaoSession)abstractdaosession).getAlarmDao();
    }

    protected Long getPkFrom(com.fitbit.data.repo.greendao.Alarm alarm)
    {
        return alarm.getId();
    }

    protected volatile Long getPkFrom(Object obj)
    {
        return getPkFrom((com.fitbit.data.repo.greendao.Alarm)obj);
    }
}
