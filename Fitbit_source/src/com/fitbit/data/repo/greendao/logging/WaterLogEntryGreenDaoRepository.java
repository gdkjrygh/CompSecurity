// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo.greendao.logging;

import com.fitbit.data.repo.aw;
import com.fitbit.data.repo.greendao.AbstractEntityGreenDaoRepository;
import com.fitbit.data.repo.greendao.DaoFactory;
import com.fitbit.data.repo.greendao.mapping.EntityMapper;
import com.fitbit.data.repo.greendao.mapping.WaterLogEntryMapper;
import com.fitbit.util.o;
import com.fitbit.util.w;
import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.AbstractDaoSession;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.query.DeleteQueryExt;
import de.greenrobot.dao.query.QueryBuilder;
import de.greenrobot.dao.query.WhereCondition;
import java.util.Date;
import java.util.List;

// Referenced classes of package com.fitbit.data.repo.greendao.logging:
//            DaoSession, WaterLogEntryDao, WaterLogEntry

public class WaterLogEntryGreenDaoRepository extends AbstractEntityGreenDaoRepository
    implements aw
{

    public WaterLogEntryGreenDaoRepository()
    {
    }

    protected AbstractDaoSession createDaoSession()
    {
        return DaoFactory.getInstance().getLoggingSession();
    }

    protected EntityMapper createMapper(AbstractDaoSession abstractdaosession)
    {
        return new WaterLogEntryMapper();
    }

    public void deleteByDate(Date date, boolean flag)
    {
        Object obj = o.a(date);
        date = o.e(date);
        QueryBuilder querybuilder = getEntityDao().queryBuilder();
        obj = WaterLogEntryDao.Properties.LogDate.between(obj, date);
        if (flag)
        {
            date = WaterLogEntryDao.Properties.EntityStatus.eq(Integer.valueOf(com.fitbit.data.domain.Entity.EntityStatus.SYNCED.getCode()));
        } else
        {
            date = null;
        }
        (new DeleteQueryExt(querybuilder.where(((WhereCondition) (obj)), new WhereCondition[] {
            date
        }).buildDelete())).executeDeleteAndClearCache();
    }

    public void deleteOlderThanDate(Date date, boolean flag)
    {
        date = o.a(date);
        QueryBuilder querybuilder = getEntityDao().queryBuilder();
        WhereCondition wherecondition = WaterLogEntryDao.Properties.LogDate.lt(date);
        if (flag)
        {
            date = WaterLogEntryDao.Properties.EntityStatus.eq(Integer.valueOf(com.fitbit.data.domain.Entity.EntityStatus.SYNCED.getCode()));
        } else
        {
            date = null;
        }
        (new DeleteQueryExt(querybuilder.where(wherecondition, new WhereCondition[] {
            date
        }).buildDelete())).executeDeleteAndClearCache();
    }

    public transient List getByDate(Date date, com.fitbit.data.domain.Entity.EntityStatus aentitystatus[])
    {
        Date date1 = o.a(date);
        date = o.e(date);
        return getEntitiesWhereAnd(WaterLogEntryDao.Properties.LogDate.ge(date1), new WhereCondition[] {
            WaterLogEntryDao.Properties.LogDate.le(date), WaterLogEntryDao.Properties.EntityStatus.notIn((Object[])w.a(aentitystatus))
        });
    }

    protected AbstractDao getDaoFrom(AbstractDaoSession abstractdaosession)
    {
        return ((DaoSession)abstractdaosession).getWaterLogEntryDao();
    }

    public transient List getEntriesBetweenDates(Date date, Date date1, com.fitbit.data.domain.Entity.EntityStatus aentitystatus[])
    {
        return getEntitiesWhereAnd(WaterLogEntryDao.Properties.LogDate.ge(date), new WhereCondition[] {
            WaterLogEntryDao.Properties.LogDate.le(date1), WaterLogEntryDao.Properties.EntityStatus.notIn((Object[])w.a(aentitystatus))
        });
    }

    protected Long getPkFrom(WaterLogEntry waterlogentry)
    {
        return ((WaterLogEntryDao)getEntityDao()).getKey(waterlogentry);
    }

    protected volatile Long getPkFrom(Object obj)
    {
        return getPkFrom((WaterLogEntry)obj);
    }
}
