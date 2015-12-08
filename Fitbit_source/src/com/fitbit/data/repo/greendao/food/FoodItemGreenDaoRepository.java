// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo.greendao.food;

import com.fitbit.data.domain.Entity;
import com.fitbit.data.domain.FoodItem;
import com.fitbit.data.domain.h;
import com.fitbit.data.repo.greendao.AbstractEntityGreenDaoRepository;
import com.fitbit.data.repo.greendao.DaoFactory;
import com.fitbit.data.repo.greendao.EntityProperties;
import com.fitbit.data.repo.greendao.mapping.EntityMapper;
import com.fitbit.data.repo.greendao.mapping.FoodItemMapper;
import com.fitbit.data.repo.greendao.mapping.LightServingMapper;
import com.fitbit.data.repo.t;
import com.fitbit.util.w;
import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.AbstractDaoSession;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.query.DeleteQuery;
import de.greenrobot.dao.query.DeleteQueryExt;
import de.greenrobot.dao.query.Query;
import de.greenrobot.dao.query.QueryBuilder;
import de.greenrobot.dao.query.WhereCondition;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.fitbit.data.repo.greendao.food:
//            LightServing, LightServingDao, DaoSession, FoodItemDao, 
//            FoodItem

public class FoodItemGreenDaoRepository extends AbstractEntityGreenDaoRepository
    implements t
{

    private LightServingDao lightServingDao;
    private LightServingMapper lightServingMapper;

    public FoodItemGreenDaoRepository()
    {
    }

    private void addAllServingUnits(FoodItem fooditem)
    {
        Object obj;
        for (Iterator iterator = fooditem.b().iterator(); iterator.hasNext(); lightServingDao.insert(obj))
        {
            obj = (h)iterator.next();
            obj = lightServingMapper.toDbEntity(((h) (obj)));
            ((LightServing) (obj)).setId(null);
            ((LightServing) (obj)).setFoodId(fooditem.getEntityId());
        }

    }

    private boolean hasServingUnits(FoodItem fooditem)
    {
        return fooditem.b() != null && !fooditem.b().isEmpty();
    }

    private void removeAllServingUnits(FoodItem fooditem)
    {
        if (!fooditem.isNew())
        {
            lightServingDao.queryBuilder().where(LightServingDao.Properties.FoodId.eq(fooditem.getEntityId()), new WhereCondition[0]).buildDelete().executeDeleteWithoutDetachingEntities();
        }
    }

    public volatile void add(Entity entity)
    {
        add((FoodItem)entity);
    }

    public void add(FoodItem fooditem)
    {
        super.add(fooditem);
        addAllServingUnits(fooditem);
    }

    public void addAll(final List entities)
    {
        getEntityDao().getSession().runInTx(new Runnable() {

            final FoodItemGreenDaoRepository this$0;
            final List val$entities;

            public void run()
            {
                FoodItem fooditem;
                for (Iterator iterator = entities.iterator(); iterator.hasNext(); add(fooditem))
                {
                    fooditem = (FoodItem)iterator.next();
                }

            }

            
            {
                this$0 = FoodItemGreenDaoRepository.this;
                entities = list;
                super();
            }
        });
    }

    public void clear(boolean flag)
    {
        super.clear(flag);
        if (!flag)
        {
            lightServingDao.deleteAll();
            return;
        }
        ArrayList arraylist = new ArrayList();
        for (Iterator iterator = getPendingEntries().iterator(); iterator.hasNext(); arraylist.add(((FoodItem)iterator.next()).getEntityId())) { }
        (new DeleteQueryExt(lightServingDao.queryBuilder().where(LightServingDao.Properties.FoodId.notIn(arraylist), new WhereCondition[0]).buildDelete())).executeDeleteAndClearCache();
    }

    protected AbstractDaoSession createDaoSession()
    {
        return DaoFactory.getInstance().getFoodSession();
    }

    protected EntityMapper createMapper(AbstractDaoSession abstractdaosession)
    {
        abstractdaosession = (DaoSession)abstractdaosession;
        lightServingMapper = new LightServingMapper(abstractdaosession);
        return new FoodItemMapper(abstractdaosession);
    }

    public volatile void delete(Entity entity)
    {
        delete((FoodItem)entity);
    }

    public void delete(FoodItem fooditem)
    {
        removeAllServingUnits(fooditem);
        super.delete(fooditem);
    }

    public transient FoodItem getByEntityId(long l, com.fitbit.data.domain.Entity.EntityStatus aentitystatus[])
    {
        return (FoodItem)getDistinctEntityWhere(EntityProperties.Id.eq(Long.valueOf(l)), new WhereCondition[] {
            FoodItemDao.Properties.EntityStatus.notIn((Object[])w.a(aentitystatus))
        });
    }

    public transient FoodItem getByServerId(long l, com.fitbit.data.domain.Entity.EntityStatus aentitystatus[])
    {
        return (FoodItem)getDistinctEntityWhere(EntityProperties.ServerId.eq(Long.valueOf(l)), new WhereCondition[] {
            FoodItemDao.Properties.EntityStatus.notIn((Object[])w.a(aentitystatus))
        });
    }

    public List getCustomFood()
    {
        return fromDbEntities(getEntityDao().queryBuilder().where(FoodItemDao.Properties.IsCustom.eq(Boolean.valueOf(true)), new WhereCondition[] {
            FoodItemDao.Properties.EntityStatus.notEq(Integer.valueOf(com.fitbit.data.domain.Entity.EntityStatus.PENDING_DELETE.getCode()))
        }).build().list());
    }

    protected AbstractDao getDaoFrom(AbstractDaoSession abstractdaosession)
    {
        abstractdaosession = (DaoSession)abstractdaosession;
        lightServingDao = abstractdaosession.getLightServingDao();
        return abstractdaosession.getFoodItemDao();
    }

    protected Long getPkFrom(com.fitbit.data.repo.greendao.food.FoodItem fooditem)
    {
        return ((FoodItemDao)getEntityDao()).getKey(fooditem);
    }

    protected volatile Long getPkFrom(Object obj)
    {
        return getPkFrom((com.fitbit.data.repo.greendao.food.FoodItem)obj);
    }

    public volatile void save(Entity entity)
    {
        save((FoodItem)entity);
    }

    public void save(FoodItem fooditem)
    {
        boolean flag = hasServingUnits(fooditem);
        if (flag)
        {
            removeAllServingUnits(fooditem);
        }
        super.save(fooditem);
        if (flag)
        {
            addAllServingUnits(fooditem);
        }
    }

    public void saveAll(final Iterable entities)
    {
        getEntityDao().getSession().runInTx(new Runnable() {

            final FoodItemGreenDaoRepository this$0;
            final Iterable val$entities;

            public void run()
            {
                FoodItem fooditem;
                for (Iterator iterator = entities.iterator(); iterator.hasNext(); save(fooditem))
                {
                    fooditem = (FoodItem)iterator.next();
                }

            }

            
            {
                this$0 = FoodItemGreenDaoRepository.this;
                entities = iterable;
                super();
            }
        });
    }

    public void unpopulateAll()
    {
        List list = getAll();
        for (Iterator iterator = list.iterator(); iterator.hasNext(); ((FoodItem)iterator.next()).d(false)) { }
        saveAll(list);
    }
}
