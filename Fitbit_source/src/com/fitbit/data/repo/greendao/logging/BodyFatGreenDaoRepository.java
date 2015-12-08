// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo.greendao.logging;

import com.fitbit.data.domain.BodyFatLogEntry;
import com.fitbit.data.domain.Entity;
import com.fitbit.data.repo.greendao.AbstractEntityGreenDaoRepository;
import com.fitbit.data.repo.greendao.DaoFactory;
import com.fitbit.data.repo.greendao.mapping.BodyFatMapper;
import com.fitbit.data.repo.greendao.mapping.EntityMapper;
import com.fitbit.data.repo.i;
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
//            DaoSession, BodyFatLogEntryDao, BodyFatLogEntry

public class BodyFatGreenDaoRepository extends AbstractEntityGreenDaoRepository
    implements i
{

    public BodyFatGreenDaoRepository()
    {
    }

    public void add(BodyFatLogEntry bodyfatlogentry)
    {
        super.add(bodyfatlogentry);
    }

    public volatile void add(Entity entity)
    {
        add((BodyFatLogEntry)entity);
    }

    public void addAll(List list)
    {
        super.addAll(list);
    }

    protected AbstractDaoSession createDaoSession()
    {
        return DaoFactory.getInstance().getLoggingSession();
    }

    protected EntityMapper createMapper(AbstractDaoSession abstractdaosession)
    {
        return new BodyFatMapper();
    }

    public void delete(BodyFatLogEntry bodyfatlogentry)
    {
        super.delete(bodyfatlogentry);
    }

    public volatile void delete(Entity entity)
    {
        delete((BodyFatLogEntry)entity);
    }

    public void deleteAll(Iterable iterable)
    {
        super.deleteAll(iterable);
    }

    public void deleteByDate(Date date, boolean flag)
    {
        Object obj = o.a(date);
        date = o.e(date);
        QueryBuilder querybuilder = getEntityDao().queryBuilder();
        obj = BodyFatLogEntryDao.Properties.LogDate.between(obj, date);
        if (flag)
        {
            date = BodyFatLogEntryDao.Properties.EntityStatus.eq(Integer.valueOf(com.fitbit.data.domain.Entity.EntityStatus.SYNCED.getCode()));
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
        WhereCondition wherecondition = BodyFatLogEntryDao.Properties.LogDate.lt(date);
        if (flag)
        {
            date = BodyFatLogEntryDao.Properties.EntityStatus.eq(Integer.valueOf(com.fitbit.data.domain.Entity.EntityStatus.SYNCED.getCode()));
        } else
        {
            date = null;
        }
        (new DeleteQueryExt(querybuilder.where(wherecondition, new WhereCondition[] {
            date
        }).buildDelete())).executeDeleteAndClearCache();
    }

    public BodyFatLogEntry getBodyFatEntryForDate(Date date)
    {
        date = getBodyFatsBetweenDates(o.a(date), o.e(date));
        if (date.isEmpty())
        {
            return null;
        } else
        {
            return (BodyFatLogEntry)date.get(date.size() - 1);
        }
    }

    public BodyFatLogEntry getBodyFatEntryForDateExactly(Date date)
    {
        date = getBodyFatsBetweenDates(new Date(date.getTime() - 1000L), new Date(date.getTime() + 1000L));
        if (date.isEmpty())
        {
            return null;
        } else
        {
            return (BodyFatLogEntry)date.get(0);
        }
    }

    public List getBodyFatsBetweenDates(Date date, Date date1)
    {
        return fromDbEntities(getEntityDao().queryBuilder().where(BodyFatLogEntryDao.Properties.LogDate.between(date, date1), new WhereCondition[0]).orderAsc(new Property[] {
            BodyFatLogEntryDao.Properties.LogDate
        }).orderAsc(new Property[] {
            BodyFatLogEntryDao.Properties.TimeUpdated
        }).build().list());
    }

    public transient List getByDate(Date date, com.fitbit.data.domain.Entity.EntityStatus aentitystatus[])
    {
        return null;
    }

    protected AbstractDao getDaoFrom(AbstractDaoSession abstractdaosession)
    {
        return ((DaoSession)abstractdaosession).getBodyFatLogEntryDao();
    }

    public BodyFatLogEntry getFirstBodyFatEntry()
    {
        List list = fromDbEntities(getEntityDao().queryBuilder().orderAsc(new Property[] {
            BodyFatLogEntryDao.Properties.LogDate
        }).orderAsc(new Property[] {
            BodyFatLogEntryDao.Properties.TimeUpdated
        }).limit(1).build().list());
        if (list != null && list.size() > 0)
        {
            return (BodyFatLogEntry)list.get(0);
        } else
        {
            return null;
        }
    }

    public BodyFatLogEntry getManualBodyFatEntryForDate(Date date)
    {
        for (date = getBodyFatsBetweenDates(o.a(date), o.e(date)).iterator(); date.hasNext();)
        {
            BodyFatLogEntry bodyfatlogentry = (BodyFatLogEntry)date.next();
            if (bodyfatlogentry.b())
            {
                return bodyfatlogentry;
            }
        }

        return null;
    }

    protected Long getPkFrom(com.fitbit.data.repo.greendao.logging.BodyFatLogEntry bodyfatlogentry)
    {
        return ((BodyFatLogEntryDao)getEntityDao()).getKey(bodyfatlogentry);
    }

    protected volatile Long getPkFrom(Object obj)
    {
        return getPkFrom((com.fitbit.data.repo.greendao.logging.BodyFatLogEntry)obj);
    }

    public void save(BodyFatLogEntry bodyfatlogentry)
    {
        super.save(bodyfatlogentry);
    }

    public volatile void save(Entity entity)
    {
        save((BodyFatLogEntry)entity);
    }

    public void saveAll(Iterable iterable)
    {
        super.saveAll(iterable);
    }
}
