// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo.greendao.food;

import com.fitbit.data.repo.greendao.AbstractEntityGreenDaoRepository;
import com.fitbit.data.repo.greendao.DaoFactory;
import com.fitbit.data.repo.greendao.mapping.EntityMapper;
import com.fitbit.data.repo.greendao.mapping.FoodRelationMapper;
import com.fitbit.data.repo.x;
import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.AbstractDaoSession;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.query.Query;
import de.greenrobot.dao.query.QueryBuilder;
import de.greenrobot.dao.query.WhereCondition;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.fitbit.data.repo.greendao.food:
//            DaoSession, FoodRelation

public class FoodRelationGreenDaoRepository extends AbstractEntityGreenDaoRepository
    implements x
{

    public FoodRelationGreenDaoRepository()
    {
    }

    protected AbstractDaoSession createDaoSession()
    {
        return DaoFactory.getInstance().getFoodSession();
    }

    protected EntityMapper createMapper(AbstractDaoSession abstractdaosession)
    {
        return new FoodRelationMapper((DaoSession)abstractdaosession);
    }

    protected AbstractDao getDaoFrom(AbstractDaoSession abstractdaosession)
    {
        return ((DaoSession)abstractdaosession).getFoodRelationDao();
    }

    public List getFrequentFood(int i)
    {
        QueryBuilder querybuilder = getEntityDao().queryBuilder().where(FoodRelationDao.Properties.Group.eq(Integer.valueOf(com.fitbit.data.domain.FoodRelation.FoodRelationType.FREQUENT.getCode())), new WhereCondition[0]).orderAsc(new Property[] {
            FoodRelationDao.Properties.DisplayIndex
        });
        if (i >= 0)
        {
            querybuilder.limit(i);
        }
        return fromDbEntities(querybuilder.build().list());
    }

    protected Long getPkFrom(FoodRelation foodrelation)
    {
        return foodrelation.getId();
    }

    protected volatile Long getPkFrom(Object obj)
    {
        return getPkFrom((FoodRelation)obj);
    }

    public List getRecentFood(int i)
    {
        Object obj = getEntityDao().queryBuilder().where(FoodRelationDao.Properties.Group.eq(Integer.valueOf(com.fitbit.data.domain.FoodRelation.FoodRelationType.RECENT.getCode())), new WhereCondition[0]).orderAsc(new Property[] {
            FoodRelationDao.Properties.DisplayIndex
        });
        if (i >= 0)
        {
            ((QueryBuilder) (obj)).limit(i);
        }
        obj = ((QueryBuilder) (obj)).build();
        if (((Query) (obj)).list() != null)
        {
            Iterator iterator = ((Query) (obj)).list().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                FoodRelation foodrelation = (FoodRelation)iterator.next();
                if (foodrelation.getFoodItem() == null)
                {
                    getEntityDao().delete(foodrelation);
                }
            } while (true);
        }
        return fromDbEntities(((Query) (obj)).list());
    }
}
