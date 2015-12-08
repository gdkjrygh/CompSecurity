// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo.greendao.logging;

import com.fitbit.data.domain.WeightLogEntry;
import com.fitbit.data.repo.ax;
import com.fitbit.data.repo.greendao.AbstractEntityGreenDaoRepository;
import com.fitbit.data.repo.greendao.DaoFactory;
import com.fitbit.data.repo.greendao.mapping.EntityMapper;
import com.fitbit.data.repo.greendao.mapping.WeigntLogEntryMapper;
import com.fitbit.util.o;
import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.AbstractDaoSession;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.query.DeleteQueryExt;
import de.greenrobot.dao.query.Query;
import de.greenrobot.dao.query.QueryBuilder;
import de.greenrobot.dao.query.WhereCondition;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.fitbit.data.repo.greendao.logging:
//            DaoSession, WeightLogEntryDao, WeightLogEntry

public class WeightLogEntryGreenDaoRepository extends AbstractEntityGreenDaoRepository
    implements ax
{

    public WeightLogEntryGreenDaoRepository()
    {
    }

    protected AbstractDaoSession createDaoSession()
    {
        return DaoFactory.getInstance().getLoggingSession();
    }

    protected EntityMapper createMapper(AbstractDaoSession abstractdaosession)
    {
        return new WeigntLogEntryMapper();
    }

    public void deleteByDate(Date date, boolean flag)
    {
        Object obj = o.a(date);
        date = o.e(date);
        QueryBuilder querybuilder = getEntityDao().queryBuilder();
        obj = WeightLogEntryDao.Properties.LogDate.between(obj, date);
        if (flag)
        {
            date = WeightLogEntryDao.Properties.EntityStatus.eq(Integer.valueOf(com.fitbit.data.domain.Entity.EntityStatus.SYNCED.getCode()));
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
        WhereCondition wherecondition = WeightLogEntryDao.Properties.LogDate.lt(date);
        if (flag)
        {
            date = WeightLogEntryDao.Properties.EntityStatus.eq(Integer.valueOf(com.fitbit.data.domain.Entity.EntityStatus.SYNCED.getCode()));
        } else
        {
            date = null;
        }
        (new DeleteQueryExt(querybuilder.where(wherecondition, new WhereCondition[] {
            date
        }).buildDelete())).executeDeleteAndClearCache();
    }

    public WeightLogEntry getBMIForDateOrAfter(Date date)
    {
        date = getEntityDao().queryBuilder().where(WeightLogEntryDao.Properties.LogDate.gt(date), new WhereCondition[] {
            WeightLogEntryDao.Properties.Bmi.gt(Integer.valueOf(0))
        }).orderAsc(new Property[] {
            WeightLogEntryDao.Properties.LogDate
        }).limit(1).build().list();
        if (date.isEmpty())
        {
            return null;
        } else
        {
            return (WeightLogEntry)getMapper().fromDbEntity(date.get(0));
        }
    }

    public WeightLogEntry getBMIForDateOrBefore(Date date)
    {
        date = getEntityDao().queryBuilder().where(WeightLogEntryDao.Properties.LogDate.le(date), new WhereCondition[] {
            WeightLogEntryDao.Properties.Bmi.gt(Integer.valueOf(0))
        }).orderDesc(new Property[] {
            WeightLogEntryDao.Properties.LogDate
        }).limit(1).build().list();
        if (date.isEmpty())
        {
            return null;
        } else
        {
            return (WeightLogEntry)getMapper().fromDbEntity(date.get(0));
        }
    }

    public transient List getByDate(Date date, com.fitbit.data.domain.Entity.EntityStatus aentitystatus[])
    {
        throw new UnsupportedOperationException();
    }

    protected AbstractDao getDaoFrom(AbstractDaoSession abstractdaosession)
    {
        return ((DaoSession)abstractdaosession).getWeightLogEntryDao();
    }

    public WeightLogEntry getFirstWeightLogEntry()
    {
        List list = fromDbEntities(getEntityDao().queryBuilder().orderAsc(new Property[] {
            WeightLogEntryDao.Properties.LogDate
        }).orderAsc(new Property[] {
            WeightLogEntryDao.Properties.TimeUpdated
        }).limit(1).build().list());
        if (list != null && list.size() > 0)
        {
            return (WeightLogEntry)list.get(0);
        } else
        {
            return null;
        }
    }

    public WeightLogEntry getLastWeightLogEntry()
    {
        List list = fromDbEntities(getEntityDao().queryBuilder().orderDesc(new Property[] {
            WeightLogEntryDao.Properties.LogDate
        }).orderDesc(new Property[] {
            WeightLogEntryDao.Properties.TimeUpdated
        }).limit(1).build().list());
        if (list != null && list.size() > 0)
        {
            return (WeightLogEntry)list.get(0);
        } else
        {
            return null;
        }
    }

    public WeightLogEntry getManualLogEntryForDate(Date date)
    {
        for (date = getWeightLogEntriesBetweenDates(o.a(date), o.e(date)).iterator(); date.hasNext();)
        {
            WeightLogEntry weightlogentry = (WeightLogEntry)date.next();
            if (weightlogentry.e())
            {
                return weightlogentry;
            }
        }

        return null;
    }

    protected Long getPkFrom(com.fitbit.data.repo.greendao.logging.WeightLogEntry weightlogentry)
    {
        return ((WeightLogEntryDao)getEntityDao()).getKey(weightlogentry);
    }

    protected volatile Long getPkFrom(Object obj)
    {
        return getPkFrom((com.fitbit.data.repo.greendao.logging.WeightLogEntry)obj);
    }

    public List getWeightLogEntriesBetweenDates(Date date, Date date1)
    {
        return fromDbEntities(getEntityDao().queryBuilder().where(WeightLogEntryDao.Properties.LogDate.between(date, date1), new WhereCondition[0]).orderAsc(new Property[] {
            WeightLogEntryDao.Properties.LogDate
        }).orderAsc(new Property[] {
            WeightLogEntryDao.Properties.TimeUpdated
        }).build().list());
    }

    public WeightLogEntry getWeightLogEntryForDate(Date date)
    {
        date = getWeightLogEntriesBetweenDates(o.a(date), o.e(date));
        if (date.isEmpty())
        {
            return null;
        } else
        {
            return (WeightLogEntry)date.get(date.size() - 1);
        }
    }
}
