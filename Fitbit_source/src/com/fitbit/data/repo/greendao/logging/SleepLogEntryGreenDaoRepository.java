// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo.greendao.logging;

import com.fitbit.data.domain.Entity;
import com.fitbit.data.domain.SleepLogEntry;
import com.fitbit.data.repo.aq;
import com.fitbit.data.repo.greendao.AbstractEntityGreenDaoRepository;
import com.fitbit.data.repo.greendao.DaoFactory;
import com.fitbit.data.repo.greendao.DaoSession;
import com.fitbit.data.repo.greendao.TimeSeriesObject;
import com.fitbit.data.repo.greendao.TimeSeriesObjectDao;
import com.fitbit.data.repo.greendao.mapping.EntityMapper;
import com.fitbit.data.repo.greendao.mapping.SleepLogEntryMapper;
import com.fitbit.data.repo.greendao.mapping.TimeSeriesMapper;
import com.fitbit.util.o;
import com.fitbit.util.w;
import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.AbstractDaoSession;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.query.DeleteQuery;
import de.greenrobot.dao.query.DeleteQueryExt;
import de.greenrobot.dao.query.Query;
import de.greenrobot.dao.query.QueryBuilder;
import de.greenrobot.dao.query.WhereCondition;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.fitbit.data.repo.greendao.logging:
//            DaoSession, SleepLogEntry

public class SleepLogEntryGreenDaoRepository extends AbstractEntityGreenDaoRepository
    implements aq
{

    private TimeSeriesObjectDao timeSeriesDao;
    private TimeSeriesMapper timeSeriesMapper;

    public SleepLogEntryGreenDaoRepository()
    {
        timeSeriesMapper = new TimeSeriesMapper();
    }

    private void addMinuteDataToRepo(SleepLogEntry sleeplogentry)
    {
        if (sleeplogentry.r() != null)
        {
            List list = timeSeriesMapper.toDbEntitites(sleeplogentry.r());
            for (Iterator iterator = list.iterator(); iterator.hasNext(); ((TimeSeriesObject)iterator.next()).setForeignId(sleeplogentry.getEntityId())) { }
            timeSeriesDao.insertInTx(list);
        }
    }

    private void deleteOldMinuteDataFromRepo(SleepLogEntry sleeplogentry)
    {
        if (sleeplogentry.r() != null)
        {
            QueryBuilder querybuilder = timeSeriesDao.queryBuilder();
            querybuilder.where(com.fitbit.data.repo.greendao.TimeSeriesObjectDao.Properties.ForeignId.eq(sleeplogentry.getEntityId()), new WhereCondition[] {
                com.fitbit.data.repo.greendao.TimeSeriesObjectDao.Properties.ObjectType.eq(Integer.valueOf(com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.MINUTES_ASLEEP_INTRADAY.getCode()))
            });
            querybuilder.buildDelete().executeDeleteWithoutDetachingEntities();
        }
    }

    private void populateMinuteData(SleepLogEntry sleeplogentry)
    {
        Object obj = timeSeriesDao.queryBuilder();
        ((QueryBuilder) (obj)).where(com.fitbit.data.repo.greendao.TimeSeriesObjectDao.Properties.ForeignId.eq(sleeplogentry.getEntityId()), new WhereCondition[] {
            com.fitbit.data.repo.greendao.TimeSeriesObjectDao.Properties.ObjectType.eq(Integer.valueOf(com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.MINUTES_ASLEEP_INTRADAY.getCode()))
        });
        obj = ((QueryBuilder) (obj)).list();
        sleeplogentry.a(timeSeriesMapper.fromDbEntities(((List) (obj))));
    }

    private void populateMinuteData(List list)
    {
        SleepLogEntry sleeplogentry;
        Object obj;
        for (list = list.iterator(); list.hasNext(); sleeplogentry.a(timeSeriesMapper.fromDbEntities(((List) (obj)))))
        {
            sleeplogentry = (SleepLogEntry)list.next();
            obj = timeSeriesDao.queryBuilder();
            ((QueryBuilder) (obj)).where(com.fitbit.data.repo.greendao.TimeSeriesObjectDao.Properties.ForeignId.eq(sleeplogentry.getEntityId()), new WhereCondition[] {
                com.fitbit.data.repo.greendao.TimeSeriesObjectDao.Properties.ObjectType.eq(Integer.valueOf(com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.MINUTES_ASLEEP_INTRADAY.getCode()))
            });
            obj = ((QueryBuilder) (obj)).list();
        }

    }

    public volatile void add(Entity entity)
    {
        add((SleepLogEntry)entity);
    }

    public void add(SleepLogEntry sleeplogentry)
    {
        super.add(sleeplogentry);
        if (sleeplogentry.r() != null)
        {
            timeSeriesDao.insertInTx(timeSeriesMapper.toDbEntitites(sleeplogentry.r()));
        }
    }

    public void addAll(List list)
    {
        super.addAll(list);
        for (list = list.iterator(); list.hasNext(); addMinuteDataToRepo((SleepLogEntry)list.next())) { }
    }

    public void configure(AbstractDaoSession abstractdaosession)
    {
        super.configure(abstractdaosession);
        timeSeriesDao = DaoFactory.getInstance().getDaoSession().getTimeSeriesObjectDao();
    }

    protected AbstractDaoSession createDaoSession()
    {
        return DaoFactory.getInstance().getLoggingSession();
    }

    protected EntityMapper createMapper(AbstractDaoSession abstractdaosession)
    {
        return new SleepLogEntryMapper();
    }

    public volatile void delete(Entity entity)
    {
        delete((SleepLogEntry)entity);
    }

    public void delete(SleepLogEntry sleeplogentry)
    {
        super.delete(sleeplogentry);
        deleteOldMinuteDataFromRepo(sleeplogentry);
    }

    public void deleteByDate(Date date, boolean flag)
    {
        throw new UnsupportedOperationException();
    }

    public void deleteOlderThanDate(Date date, boolean flag)
    {
        date = o.a(date);
        QueryBuilder querybuilder = getEntityDao().queryBuilder();
        WhereCondition wherecondition = SleepLogEntryDao.Properties.LogDate.lt(date);
        if (flag)
        {
            date = SleepLogEntryDao.Properties.EntityStatus.eq(Integer.valueOf(com.fitbit.data.domain.Entity.EntityStatus.SYNCED.getCode()));
        } else
        {
            date = null;
        }
        (new DeleteQueryExt(querybuilder.where(wherecondition, new WhereCondition[] {
            date
        }).buildDelete())).executeDeleteAndClearCache();
    }

    public transient List get(com.fitbit.data.domain.Entity.EntityStatus aentitystatus[])
    {
        aentitystatus = super.get(aentitystatus);
        populateMinuteData(aentitystatus);
        return aentitystatus;
    }

    public List getAll()
    {
        List list = super.getAll();
        populateMinuteData(list);
        return list;
    }

    public transient List getByDate(Date date, com.fitbit.data.domain.Entity.EntityStatus aentitystatus[])
    {
        Date date1 = o.d(date);
        date = o.f(date);
        date = fromDbEntities(getEntityDao().queryBuilder().where(SleepLogEntryDao.Properties.LogDate.between(date1, date), new WhereCondition[] {
            SleepLogEntryDao.Properties.EntityStatus.notIn((Object[])w.a(aentitystatus))
        }).orderAsc(new Property[] {
            SleepLogEntryDao.Properties.StartTime
        }).build().list());
        populateMinuteData(date);
        return date;
    }

    public volatile Entity getById(long l)
    {
        return getById(l);
    }

    public SleepLogEntry getById(long l)
    {
        SleepLogEntry sleeplogentry = (SleepLogEntry)super.getById(l);
        if (sleeplogentry != null)
        {
            populateMinuteData(sleeplogentry);
        }
        return sleeplogentry;
    }

    public volatile Entity getByServerId(long l)
    {
        return getByServerId(l);
    }

    public SleepLogEntry getByServerId(long l)
    {
        SleepLogEntry sleeplogentry = (SleepLogEntry)super.getByServerId(l);
        if (sleeplogentry != null)
        {
            populateMinuteData(sleeplogentry);
        }
        return sleeplogentry;
    }

    public List getByServerId(List list)
    {
        list = super.getByServerId(list);
        populateMinuteData(list);
        return list;
    }

    protected AbstractDao getDaoFrom(AbstractDaoSession abstractdaosession)
    {
        return ((com.fitbit.data.repo.greendao.logging.DaoSession)abstractdaosession).getSleepLogEntryDao();
    }

    protected Long getPkFrom(com.fitbit.data.repo.greendao.logging.SleepLogEntry sleeplogentry)
    {
        return sleeplogentry.getId();
    }

    protected volatile Long getPkFrom(Object obj)
    {
        return getPkFrom((com.fitbit.data.repo.greendao.logging.SleepLogEntry)obj);
    }

    public List getSleepLogEntities(Date date, int i, int j)
    {
        date = fromDbEntities(getEntityDao().queryBuilder().offset(i).limit(j).orderDesc(new Property[] {
            SleepLogEntryDao.Properties.StartTime
        }).where(SleepLogEntryDao.Properties.LogDate.le(date), new WhereCondition[] {
            SleepLogEntryDao.Properties.EntityStatus.notEq(Integer.valueOf(com.fitbit.data.domain.Entity.EntityStatus.PENDING_DELETE.getCode()))
        }).build().list());
        populateMinuteData(date);
        return date;
    }

    public List getSleepLogEntriesBetweenDates(Date date, Date date1)
    {
        date = o.d(date);
        date1 = o.f(date1);
        date = fromDbEntities(getEntityDao().queryBuilder().where(SleepLogEntryDao.Properties.LogDate.between(date, date1), new WhereCondition[] {
            SleepLogEntryDao.Properties.EntityStatus.notIn((Object[])w.a(new com.fitbit.data.domain.Entity.EntityStatus[] {
                com.fitbit.data.domain.Entity.EntityStatus.PENDING_DELETE
            }))
        }).orderAsc(new Property[] {
            SleepLogEntryDao.Properties.StartTime
        }).build().list());
        populateMinuteData(date);
        return date;
    }

    public volatile void save(Entity entity)
    {
        save((SleepLogEntry)entity);
    }

    public void save(SleepLogEntry sleeplogentry)
    {
        super.save(sleeplogentry);
        deleteOldMinuteDataFromRepo(sleeplogentry);
        addMinuteDataToRepo(sleeplogentry);
    }

    public void saveAll(Iterable iterable)
    {
        super.saveAll(iterable);
        SleepLogEntry sleeplogentry;
        for (iterable = iterable.iterator(); iterable.hasNext(); addMinuteDataToRepo(sleeplogentry))
        {
            sleeplogentry = (SleepLogEntry)iterable.next();
            deleteOldMinuteDataFromRepo(sleeplogentry);
        }

    }
}
