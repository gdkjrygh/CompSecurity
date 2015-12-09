// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo.greendao.activity;

import com.fitbit.data.domain.ActivityLogEntry;
import com.fitbit.data.domain.Entity;
import com.fitbit.data.repo.d;
import com.fitbit.data.repo.greendao.AbstractEntityGreenDaoRepository;
import com.fitbit.data.repo.greendao.DaoFactory;
import com.fitbit.data.repo.greendao.mapping.ActivityLogEntryMapper;
import com.fitbit.data.repo.greendao.mapping.EntityMapper;
import com.fitbit.util.o;
import com.fitbit.util.w;
import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.AbstractDaoSession;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.query.DeleteQueryExt;
import de.greenrobot.dao.query.Query;
import de.greenrobot.dao.query.QueryBuilder;
import de.greenrobot.dao.query.WhereCondition;
import java.util.Date;
import java.util.List;

// Referenced classes of package com.fitbit.data.repo.greendao.activity:
//            DaoSession, ActivityLogEntryDao, ActivityLogEntry

public class ActivityLogEntryGreenDaoRepository extends AbstractEntityGreenDaoRepository
    implements d
{

    public ActivityLogEntryGreenDaoRepository()
    {
    }

    private transient List getOlderThan(Date date, int i, int j, com.fitbit.data.domain.Entity.EntityStatus aentitystatus[])
    {
        return fromDbEntities(getEntityDao().queryBuilder().where(ActivityLogEntryDao.Properties.LogDate.le(date), new WhereCondition[] {
            ActivityLogEntryDao.Properties.EntityStatus.notIn((Object[])w.a(aentitystatus))
        }).orderDesc(new Property[] {
            ActivityLogEntryDao.Properties.LogDate
        }).offset(i).limit(j).build().listLazy());
    }

    protected AbstractDaoSession createDaoSession()
    {
        return DaoFactory.getInstance().getActivityDBSession();
    }

    protected EntityMapper createMapper(AbstractDaoSession abstractdaosession)
    {
        return new ActivityLogEntryMapper((DaoSession)abstractdaosession);
    }

    public void delete(ActivityLogEntry activitylogentry)
    {
        super.delete(activitylogentry);
    }

    public volatile void delete(Entity entity)
    {
        delete((ActivityLogEntry)entity);
    }

    public void deleteAll(Iterable iterable)
    {
        super.deleteAll(iterable);
    }

    public void deleteByDate(Date date, boolean flag)
    {
        Date date1 = o.a(date);
        Date date2 = o.e(date);
        date = null;
        if (flag)
        {
            date = ActivityLogEntryDao.Properties.EntityStatus.eq(Integer.valueOf(com.fitbit.data.domain.Entity.EntityStatus.SYNCED.getCode()));
        }
        (new DeleteQueryExt(getEntityDao().queryBuilder().where(ActivityLogEntryDao.Properties.LogDate.between(date1, date2), new WhereCondition[] {
            date
        }).buildDelete())).executeDeleteAndClearCache();
    }

    public void deleteOlderThanDate(Date date, boolean flag)
    {
        date = o.a(date);
        QueryBuilder querybuilder = getEntityDao().queryBuilder();
        WhereCondition wherecondition = ActivityLogEntryDao.Properties.LogDate.lt(date);
        if (flag)
        {
            date = ActivityLogEntryDao.Properties.EntityStatus.eq(Integer.valueOf(com.fitbit.data.domain.Entity.EntityStatus.SYNCED.getCode()));
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
        return fromDbEntities(getEntityDao().queryBuilder().where(ActivityLogEntryDao.Properties.LogDate.between(date1, date), new WhereCondition[] {
            ActivityLogEntryDao.Properties.EntityStatus.notIn((Object[])w.a(aentitystatus))
        }).orderDesc(new Property[] {
            ActivityLogEntryDao.Properties.LogDate
        }).build().listLazy());
    }

    protected AbstractDao getDaoFrom(AbstractDaoSession abstractdaosession)
    {
        return ((DaoSession)abstractdaosession).getActivityLogEntryDao();
    }

    public ActivityLogEntry getLastActivityLogEntry(long l)
    {
        List list = fromDbEntities(getEntityDao().queryBuilder().where(ActivityLogEntryDao.Properties.ActivityItemServerId.eq(Long.valueOf(l)), new WhereCondition[0]).orderDesc(new Property[] {
            ActivityLogEntryDao.Properties.TimeUpdated, ActivityLogEntryDao.Properties.LogDate
        }).limit(1).build().list());
        if (list.size() > 0)
        {
            return (ActivityLogEntry)list.get(0);
        } else
        {
            return null;
        }
    }

    public transient List getOlderThan(Date date, int i, int j, Integer integer, com.fitbit.data.domain.Entity.EntityStatus aentitystatus[])
    {
        date = o.a(date);
        if (integer == null)
        {
            return getOlderThan(date, i, j, aentitystatus);
        } else
        {
            return fromDbEntities(getEntityDao().queryBuilder().where(ActivityLogEntryDao.Properties.LogDate.le(date), new WhereCondition[] {
                ActivityLogEntryDao.Properties.EntityStatus.notIn((Object[])w.a(aentitystatus)), ActivityLogEntryDao.Properties.ActivityItemServerId.eq(integer)
            }).orderDesc(new Property[] {
                ActivityLogEntryDao.Properties.LogDate
            }).offset(i).limit(j).build().listLazy());
        }
    }

    protected Long getPkFrom(com.fitbit.data.repo.greendao.activity.ActivityLogEntry activitylogentry)
    {
        return ((ActivityLogEntryDao)getEntityDao()).getKey(activitylogentry);
    }

    protected volatile Long getPkFrom(Object obj)
    {
        return getPkFrom((com.fitbit.data.repo.greendao.activity.ActivityLogEntry)obj);
    }
}
