// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo.greendao;

import com.fitbit.data.domain.DietPlan;
import com.fitbit.data.domain.Entity;
import com.fitbit.data.domain.c;
import com.fitbit.data.repo.greendao.mapping.DietPlanMapper;
import com.fitbit.e.a;
import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.AbstractDaoSession;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.query.DeleteQueryExt;
import de.greenrobot.dao.query.QueryBuilder;
import de.greenrobot.dao.query.WhereCondition;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.Lock;

// Referenced classes of package com.fitbit.data.repo.greendao:
//            AbstractEntityGreenDaoRepository, DietPlanDao, DietPlan

public abstract class EntityWithDietPlanGreenDaoRepository extends AbstractEntityGreenDaoRepository
{

    private DietPlanDao dietPlanDao;
    private DietPlanMapper dietPlanMapper;

    public EntityWithDietPlanGreenDaoRepository()
    {
    }

    private void saveEntityLocal(Entity entity)
    {
        mergeAndSaveDietPlan(entity);
        super.save(entity);
    }

    public void add(Entity entity)
    {
        mergeAndSaveDietPlan(entity);
        super.add(entity);
    }

    public void addAll(final List entities)
    {
        getEntityDao().getSession().runInTx(new Runnable() {

            final EntityWithDietPlanGreenDaoRepository this$0;
            final List val$entities;

            public void run()
            {
                Entity entity;
                for (Iterator iterator = entities.iterator(); iterator.hasNext(); add(entity))
                {
                    entity = (Entity)iterator.next();
                }

            }

            
            {
                this$0 = EntityWithDietPlanGreenDaoRepository.this;
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
            dietPlanDao.deleteAll();
            return;
        } else
        {
            getEntityDao().getSession().runInTx(new Runnable() {

                final EntityWithDietPlanGreenDaoRepository this$0;

                public void run()
                {
                    ArrayList arraylist = new ArrayList();
                    for (Iterator iterator = getPendingEntries().iterator(); iterator.hasNext(); arraylist.add(((c)(Entity)iterator.next()).a().getEntityId())) { }
                    (new DeleteQueryExt(dietPlanDao.queryBuilder().where(DietPlanDao.Properties.Id.notIn(arraylist), new WhereCondition[0]).buildDelete())).executeDeleteAndClearCache();
                }

            
            {
                this$0 = EntityWithDietPlanGreenDaoRepository.this;
                super();
            }
            });
            return;
        }
    }

    public void delete(Entity entity)
    {
        super.delete(entity);
        removeDietPlan(entity);
    }

    public void deleteAll(final Iterable entities)
    {
        getEntityDao().getSession().runInTx(new Runnable() {

            final EntityWithDietPlanGreenDaoRepository this$0;
            final Iterable val$entities;

            public void run()
            {
                Entity entity;
                for (Iterator iterator = entities.iterator(); iterator.hasNext(); delete(entity))
                {
                    entity = (Entity)iterator.next();
                }

            }

            
            {
                this$0 = EntityWithDietPlanGreenDaoRepository.this;
                entities = iterable;
                super();
            }
        });
    }

    public DietPlanDao getDietPlanDao()
    {
        return dietPlanDao;
    }

    public DietPlanMapper getDietPlanMapper()
    {
        return dietPlanMapper;
    }

    protected void mergeAndSaveDietPlan(Entity entity)
    {
        com.fitbit.data.repo.greendao.DietPlan dietplan;
label0:
        {
            if (((c)entity).a() != null)
            {
                Long long1 = ((c)entity).a().getEntityId();
                a.a("EntityWithDietPlanGreenDaoRepository", "dietPlayEntityId %s", new Object[] {
                    long1
                });
                if (long1 == null)
                {
                    dietplan = dietPlanMapper.toDbEntity(((c)entity).a());
                } else
                {
                    dietplan = dietPlanMapper.toDbEntity(((c)entity).a(), (com.fitbit.data.repo.greendao.DietPlan)dietPlanDao.load(long1));
                }
                a.a("EntityWithDietPlanGreenDaoRepository", "newEntity %s", new Object[] {
                    dietplan
                });
                if (long1 == null)
                {
                    break label0;
                }
                dietPlanDao.update(dietplan);
            }
            return;
        }
        long l = dietPlanDao.insert(dietplan);
        a.a("EntityWithDietPlanGreenDaoRepository", "insert %s", new Object[] {
            Long.valueOf(l)
        });
        ((c)entity).a().setEntityId(Long.valueOf(l));
    }

    protected void removeDietPlan(Entity entity)
    {
        if (((c)entity).a() != null && ((c)entity).a().getEntityId() != null)
        {
            dietPlanDao.deleteByKey(((c)entity).a().getEntityId());
        }
    }

    public void save(Entity entity)
    {
        Lock lock;
        lock = ((c)entity).b();
        if (lock == null)
        {
            saveEntityLocal(entity);
            return;
        }
        lock.lock();
        saveEntityLocal(entity);
        lock.unlock();
        return;
        entity;
        lock.unlock();
        throw entity;
    }

    public void saveAll(final Iterable entities)
    {
        getEntityDao().getSession().runInTx(new Runnable() {

            final EntityWithDietPlanGreenDaoRepository this$0;
            final Iterable val$entities;

            public void run()
            {
                Entity entity;
                for (Iterator iterator = entities.iterator(); iterator.hasNext(); save(entity))
                {
                    entity = (Entity)iterator.next();
                }

            }

            
            {
                this$0 = EntityWithDietPlanGreenDaoRepository.this;
                entities = iterable;
                super();
            }
        });
    }

    public void setDietPlanDao(DietPlanDao dietplandao)
    {
        dietPlanDao = dietplandao;
    }

    public void setDietPlanMapper(DietPlanMapper dietplanmapper)
    {
        dietPlanMapper = dietplanmapper;
    }

}
