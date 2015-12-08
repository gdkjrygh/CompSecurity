// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo.greendao.swap;

import com.fitbit.data.domain.TimeSeriesObject;
import com.fitbit.data.repo.as;
import com.fitbit.data.repo.greendao.mapping.EntityMapper;
import com.fitbit.data.repo.greendao.mapping.SwapTimeSeriesMapper;
import com.fitbit.util.o;
import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.query.DeleteQuery;
import de.greenrobot.dao.query.DeleteQueryExt;
import de.greenrobot.dao.query.Query;
import de.greenrobot.dao.query.QueryBuilder;
import de.greenrobot.dao.query.WhereCondition;
import java.util.Date;
import java.util.List;

// Referenced classes of package com.fitbit.data.repo.greendao.swap:
//            AbstractSwapEntityGreenDaoRepository, SwapTimeSeriesObject, DaoSession

public class SwapTimeSeriesGreenDaoRepository extends AbstractSwapEntityGreenDaoRepository
    implements as
{

    public SwapTimeSeriesGreenDaoRepository()
    {
    }

    protected EntityMapper createMapper(DaoSession daosession)
    {
        return new SwapTimeSeriesMapper();
    }

    public void deleteByForeignId(com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType timeseriesresourcetype, long l)
    {
        getEntityDao().queryBuilder().where(SwapTimeSeriesObjectDao.Properties.ObjectType.eq(Integer.valueOf(timeseriesresourcetype.getCode())), new WhereCondition[] {
            SwapTimeSeriesObjectDao.Properties.ForeignId.eq(Long.valueOf(l))
        }).buildDelete().executeDeleteWithoutDetachingEntities();
    }

    public void deleteByTypeBeforeDate(com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType timeseriesresourcetype, Date date)
    {
        date = o.a(date);
        (new DeleteQueryExt(getEntityDao().queryBuilder().where(SwapTimeSeriesObjectDao.Properties.ObjectType.eq(Integer.valueOf(timeseriesresourcetype.getCode())), new WhereCondition[] {
            SwapTimeSeriesObjectDao.Properties.DateTime.lt(date)
        }).buildDelete())).executeDeleteAndClearCache();
    }

    public void deleteByTypeBetweenDates(com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType timeseriesresourcetype, Date date, Date date1)
    {
        (new DeleteQueryExt(getEntityDao().queryBuilder().where(SwapTimeSeriesObjectDao.Properties.ObjectType.eq(Integer.valueOf(timeseriesresourcetype.getCode())), new WhereCondition[] {
            SwapTimeSeriesObjectDao.Properties.DateTime.ge(date), SwapTimeSeriesObjectDao.Properties.DateTime.le(date1)
        }).buildDelete())).executeDeleteAndClearCache();
    }

    public List getByForeignId(com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType timeseriesresourcetype, long l)
    {
        return fromDbEntities(getEntityDao().queryBuilder().where(SwapTimeSeriesObjectDao.Properties.ObjectType.eq(Integer.valueOf(timeseriesresourcetype.getCode())), new WhereCondition[] {
            SwapTimeSeriesObjectDao.Properties.ForeignId.eq(Long.valueOf(l))
        }).orderAsc(new Property[] {
            SwapTimeSeriesObjectDao.Properties.DateTime
        }).build().list());
    }

    public List getByType(com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType timeseriesresourcetype)
    {
        return getEntitiesWhereAnd(SwapTimeSeriesObjectDao.Properties.ObjectType.eq(Integer.valueOf(timeseriesresourcetype.getCode())), new WhereCondition[0]);
    }

    public List getByType(com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType timeseriesresourcetype, Date date, Date date1)
    {
        date = o.a(date);
        date1 = o.e(date1);
        return fromDbEntities(getEntityDao().queryBuilder().where(SwapTimeSeriesObjectDao.Properties.ObjectType.eq(Integer.valueOf(timeseriesresourcetype.getCode())), new WhereCondition[] {
            SwapTimeSeriesObjectDao.Properties.DateTime.ge(date), SwapTimeSeriesObjectDao.Properties.DateTime.le(date1)
        }).orderAsc(new Property[] {
            SwapTimeSeriesObjectDao.Properties.DateTime
        }).build().list());
    }

    public TimeSeriesObject getByTypeAfterDate(com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType timeseriesresourcetype, Date date)
    {
        date = o.e(date);
        timeseriesresourcetype = getEntityDao().queryBuilder().where(SwapTimeSeriesObjectDao.Properties.ObjectType.eq(Integer.valueOf(timeseriesresourcetype.getCode())), new WhereCondition[] {
            SwapTimeSeriesObjectDao.Properties.DateTime.ge(date)
        }).orderAsc(new Property[] {
            SwapTimeSeriesObjectDao.Properties.DateTime
        }).limit(1).build().list();
        date = getMapper();
        if (timeseriesresourcetype.isEmpty())
        {
            timeseriesresourcetype = null;
        } else
        {
            timeseriesresourcetype = (SwapTimeSeriesObject)timeseriesresourcetype.get(0);
        }
        return (TimeSeriesObject)date.fromDbEntity(timeseriesresourcetype);
    }

    public List getByTypeAndDate(com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType timeseriesresourcetype, Date date)
    {
        Date date1 = o.a(date);
        date = o.e(date);
        return getEntitiesWhereAnd(SwapTimeSeriesObjectDao.Properties.ObjectType.eq(Integer.valueOf(timeseriesresourcetype.getCode())), new WhereCondition[] {
            SwapTimeSeriesObjectDao.Properties.DateTime.ge(date1), SwapTimeSeriesObjectDao.Properties.DateTime.le(date)
        });
    }

    public TimeSeriesObject getByTypeBeforeDate(com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType timeseriesresourcetype, Date date)
    {
        date = o.a(date);
        timeseriesresourcetype = getEntityDao().queryBuilder().where(SwapTimeSeriesObjectDao.Properties.ObjectType.eq(Integer.valueOf(timeseriesresourcetype.getCode())), new WhereCondition[] {
            SwapTimeSeriesObjectDao.Properties.DateTime.le(date)
        }).orderDesc(new Property[] {
            SwapTimeSeriesObjectDao.Properties.DateTime
        }).limit(1).build().list();
        date = getMapper();
        if (timeseriesresourcetype.isEmpty())
        {
            timeseriesresourcetype = null;
        } else
        {
            timeseriesresourcetype = (SwapTimeSeriesObject)timeseriesresourcetype.get(0);
        }
        return (TimeSeriesObject)date.fromDbEntity(timeseriesresourcetype);
    }

    public List getByTypeForTime(com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType timeseriesresourcetype, Date date, Date date1)
    {
        return fromDbEntities(getEntityDao().queryBuilder().where(SwapTimeSeriesObjectDao.Properties.ObjectType.eq(Integer.valueOf(timeseriesresourcetype.getCode())), new WhereCondition[] {
            SwapTimeSeriesObjectDao.Properties.DateTime.ge(date), SwapTimeSeriesObjectDao.Properties.DateTime.le(date1)
        }).orderAsc(new Property[] {
            SwapTimeSeriesObjectDao.Properties.DateTime
        }).build().list());
    }

    protected AbstractDao getDaoFrom(DaoSession daosession)
    {
        return daosession.getSwapTimeSeriesObjectDao();
    }

    public String getName()
    {
        return getClass().getName();
    }

    protected Long getPkFrom(SwapTimeSeriesObject swaptimeseriesobject)
    {
        return swaptimeseriesobject.getId();
    }

    protected volatile Long getPkFrom(Object obj)
    {
        return getPkFrom((SwapTimeSeriesObject)obj);
    }
}
