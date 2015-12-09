// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo.greendao.food;

import com.fitbit.data.domain.FoodMeasurementUnit;
import com.fitbit.data.repo.greendao.AbstractEntityGreenDaoRepository;
import com.fitbit.data.repo.greendao.DaoFactory;
import com.fitbit.data.repo.greendao.mapping.EntityMapper;
import com.fitbit.data.repo.greendao.mapping.FoodMeasurementUnitMapper;
import com.fitbit.data.repo.w;
import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.AbstractDaoSession;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.query.Query;
import de.greenrobot.dao.query.QueryBuilder;
import de.greenrobot.dao.query.WhereCondition;

// Referenced classes of package com.fitbit.data.repo.greendao.food:
//            FoodMeasurementUnitDao, FoodMeasurementUnit, DaoSession

public class FoodMeasurementUnitGreenDaoRepository extends AbstractEntityGreenDaoRepository
    implements w
{

    public FoodMeasurementUnitGreenDaoRepository()
    {
    }

    static long loadFoodMeasurementUnitId(FoodMeasurementUnitDao foodmeasurementunitdao, FoodMeasurementUnit foodmeasurementunit)
    {
        com.fitbit.data.repo.greendao.food.FoodMeasurementUnit foodmeasurementunit1 = (com.fitbit.data.repo.greendao.food.FoodMeasurementUnit)foodmeasurementunitdao.queryBuilder().where(FoodMeasurementUnitDao.Properties.ServerId.eq(Long.valueOf(foodmeasurementunit.getServerId())), new WhereCondition[0]).build().unique();
        if (foodmeasurementunit1 == null)
        {
            return foodmeasurementunitdao.insert((new FoodMeasurementUnitMapper()).toDbEntity(foodmeasurementunit));
        } else
        {
            return foodmeasurementunit1.getId().longValue();
        }
    }

    public long count()
    {
        return ((FoodMeasurementUnitDao)getEntityDao()).count();
    }

    protected AbstractDaoSession createDaoSession()
    {
        return DaoFactory.getInstance().getFoodSession();
    }

    protected EntityMapper createMapper(AbstractDaoSession abstractdaosession)
    {
        return new FoodMeasurementUnitMapper();
    }

    public FoodMeasurementUnit getByName(String s)
    {
        return (FoodMeasurementUnit)getDistinctEntityWhere(FoodMeasurementUnitDao.Properties.Name.eq(s.trim()), new WhereCondition[0]);
    }

    protected AbstractDao getDaoFrom(AbstractDaoSession abstractdaosession)
    {
        return ((DaoSession)abstractdaosession).getFoodMeasurementUnitDao();
    }

    protected Long getPkFrom(com.fitbit.data.repo.greendao.food.FoodMeasurementUnit foodmeasurementunit)
    {
        return ((FoodMeasurementUnitDao)getEntityDao()).getKey(foodmeasurementunit);
    }

    protected volatile Long getPkFrom(Object obj)
    {
        return getPkFrom((com.fitbit.data.repo.greendao.food.FoodMeasurementUnit)obj);
    }
}
