// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo.greendao.food;

import com.fitbit.data.domain.Entity;
import com.fitbit.data.domain.FoodLogEntry;
import com.fitbit.data.repo.greendao.AbstractEntityGreenDaoRepository;
import com.fitbit.data.repo.greendao.DaoFactory;
import com.fitbit.data.repo.greendao.EntityProperties;
import com.fitbit.data.repo.greendao.mapping.EntityMapper;
import com.fitbit.data.repo.greendao.mapping.FoodLogEntryMapper;
import com.fitbit.data.repo.v;
import com.fitbit.util.o;
import com.fitbit.util.w;
import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.AbstractDaoSession;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.query.DeleteQueryExt;
import de.greenrobot.dao.query.Query;
import de.greenrobot.dao.query.QueryBuilder;
import de.greenrobot.dao.query.WhereCondition;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

// Referenced classes of package com.fitbit.data.repo.greendao.food:
//            DaoSession, FoodLogEntry, FoodItemDao, FoodLogEntryDao

public class FoodLogEntryGreenDaoRepository extends AbstractEntityGreenDaoRepository
    implements v
{

    private DaoSession daoSession;

    public FoodLogEntryGreenDaoRepository()
    {
    }

    public void clear(boolean flag)
    {
        super.clear(flag);
    }

    protected DaoSession createDaoSession()
    {
        daoSession = DaoFactory.getInstance().getFoodSession();
        return daoSession;
    }

    protected volatile AbstractDaoSession createDaoSession()
    {
        return createDaoSession();
    }

    protected EntityMapper createMapper(AbstractDaoSession abstractdaosession)
    {
        return new FoodLogEntryMapper((DaoSession)abstractdaosession);
    }

    public volatile void delete(Entity entity)
    {
        delete((FoodLogEntry)entity);
    }

    public void delete(FoodLogEntry foodlogentry)
    {
        super.delete(foodlogentry);
    }

    public void deleteByCurrentDate(Date date, boolean flag)
    {
        Date date1 = (Date)date.clone();
        date1.setTime(date.getTime() - 1000L);
        Date date2 = (Date)date.clone();
        date2.setTime(date.getTime() + 1000L);
        date = new ArrayList();
        if (flag)
        {
            date.add(FoodLogEntryDao.Properties.EntityStatus.eq(Integer.valueOf(com.fitbit.data.domain.Entity.EntityStatus.SYNCED.getCode())));
        }
        (new DeleteQueryExt(getEntityDao().queryBuilder().where(FoodLogEntryDao.Properties.LogDate.between(date1, date2), (WhereCondition[])date.toArray(new WhereCondition[0])).buildDelete())).executeDeleteAndClearCache();
    }

    public void deleteByDate(Date date, boolean flag)
    {
        Date date1 = o.a(date);
        date = o.e(date);
        ArrayList arraylist = new ArrayList();
        if (flag)
        {
            arraylist.add(FoodLogEntryDao.Properties.EntityStatus.eq(Integer.valueOf(com.fitbit.data.domain.Entity.EntityStatus.SYNCED.getCode())));
        }
        (new DeleteQueryExt(getEntityDao().queryBuilder().where(FoodLogEntryDao.Properties.LogDate.between(date1, date), (WhereCondition[])arraylist.toArray(new WhereCondition[0])).buildDelete())).executeDeleteAndClearCache();
    }

    public void deleteOlderThanDate(Date date, boolean flag)
    {
        date = o.a(date);
        ArrayList arraylist = new ArrayList();
        if (flag)
        {
            arraylist.add(FoodLogEntryDao.Properties.EntityStatus.eq(Integer.valueOf(com.fitbit.data.domain.Entity.EntityStatus.SYNCED.getCode())));
        }
        (new DeleteQueryExt(getEntityDao().queryBuilder().where(FoodLogEntryDao.Properties.LogDate.lt(date), (WhereCondition[])arraylist.toArray(new WhereCondition[0])).buildDelete())).executeDeleteAndClearCache();
    }

    public List getAll()
    {
        return super.getAll();
    }

    public transient List getByDate(Date date, com.fitbit.data.domain.Entity.EntityStatus aentitystatus[])
    {
        Date date1 = o.a(date);
        date = o.e(date);
        return fromDbEntities(getEntityDao().queryBuilder().where(FoodLogEntryDao.Properties.LogDate.between(date1, date), new WhereCondition[] {
            FoodLogEntryDao.Properties.EntityStatus.notIn((Object[])w.a(aentitystatus))
        }).build().list());
    }

    public volatile Entity getById(long l)
    {
        return getById(l);
    }

    public FoodLogEntry getById(long l)
    {
        com.fitbit.data.repo.greendao.food.FoodLogEntry foodlogentry = (com.fitbit.data.repo.greendao.food.FoodLogEntry)getEntityDao().load(Long.valueOf(l));
        if (foodlogentry != null && !foodlogentry.getIsQuickCaloriesAdd().booleanValue() && foodlogentry.getFoodItem() != null)
        {
            daoSession.getFoodItemDao().refresh(foodlogentry.getFoodItem());
        }
        return (FoodLogEntry)getMapper().fromDbEntity(foodlogentry);
    }

    public volatile Entity getByServerId(long l)
    {
        return getByServerId(l);
    }

    public FoodLogEntry getByServerId(long l)
    {
        return (FoodLogEntry)getDistinctEntityWhere(EntityProperties.ServerId.eq(Long.valueOf(l)), new WhereCondition[0]);
    }

    protected AbstractDao getDaoFrom(AbstractDaoSession abstractdaosession)
    {
        return ((DaoSession)abstractdaosession).getFoodLogEntryDao();
    }

    public List getEntriesBetweenDates(Date date, Date date1)
    {
        date = o.a(date);
        date1 = o.e(date1);
        return fromDbEntities(getEntityDao().queryBuilder().orderDesc(new Property[] {
            FoodLogEntryDao.Properties.LogDate
        }).where(FoodLogEntryDao.Properties.LogDate.between(date, date1), new WhereCondition[] {
            FoodLogEntryDao.Properties.EntityStatus.eq(Integer.valueOf(com.fitbit.data.domain.Entity.EntityStatus.SYNCED.getCode()))
        }).build().list());
    }

    public FoodLogEntry getEntryClosesToDateFromPast(Date date)
    {
        date = o.e(date);
        date = getEntityDao().queryBuilder().limit(1).orderDesc(new Property[] {
            FoodLogEntryDao.Properties.LogDate
        }).where(FoodLogEntryDao.Properties.LogDate.le(date), new WhereCondition[] {
            FoodLogEntryDao.Properties.EntityStatus.notEq(Integer.valueOf(com.fitbit.data.domain.Entity.EntityStatus.PENDING_DELETE.getCode()))
        }).build();
        return (FoodLogEntry)getMapper().fromDbEntity(date.unique());
    }

    public FoodLogEntry getLastFoodLogEntry(long l)
    {
        Query query = getEntityDao().queryBuilder().orderDesc(new Property[] {
            FoodLogEntryDao.Properties.LogDate
        }).limit(1).where(FoodLogEntryDao.Properties.FoodId.eq(Long.valueOf(l)), new WhereCondition[] {
            FoodLogEntryDao.Properties.EntityStatus.eq(Integer.valueOf(com.fitbit.data.domain.Entity.EntityStatus.SYNCED.getCode()))
        }).build();
        return (FoodLogEntry)getMapper().fromDbEntity(query.unique());
    }

    public List getPendingEntries()
    {
        return getEntitiesWhereAnd(EntityProperties.EntityStatus.notEq(Integer.valueOf(com.fitbit.data.domain.Entity.EntityStatus.SYNCED.getCode())), new WhereCondition[0]);
    }

    protected Long getPkFrom(com.fitbit.data.repo.greendao.food.FoodLogEntry foodlogentry)
    {
        return ((FoodLogEntryDao)getEntityDao()).getKey(foodlogentry);
    }

    protected volatile Long getPkFrom(Object obj)
    {
        return getPkFrom((com.fitbit.data.repo.greendao.food.FoodLogEntry)obj);
    }
}
