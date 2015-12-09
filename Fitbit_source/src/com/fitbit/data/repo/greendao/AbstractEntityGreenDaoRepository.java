// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo.greendao;

import com.fitbit.data.domain.Entity;
import com.fitbit.data.repo.a;
import com.fitbit.data.repo.greendao.mapping.EntityMapper;
import com.fitbit.util.at;
import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.AbstractDaoSession;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.query.DeleteQueryExt;
import de.greenrobot.dao.query.Query;
import de.greenrobot.dao.query.QueryBuilder;
import de.greenrobot.dao.query.WhereCondition;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

// Referenced classes of package com.fitbit.data.repo.greendao:
//            EntityProperties, DaoFactory

public abstract class AbstractEntityGreenDaoRepository extends a
{

    private AbstractDao entityDao;
    private EntityMapper mapper;

    public AbstractEntityGreenDaoRepository()
    {
        configure(createDaoSession());
    }

    private Iterable prepareAll(Iterable iterable)
    {
        for (Iterator iterator = iterable.iterator(); iterator.hasNext(); prepareEntity((Entity)iterator.next())) { }
        return iterable;
    }

    public void addAll(List list)
    {
        if (list == null || list.size() == 0)
        {
            return;
        }
        prepareAll(list);
        List list1 = toDbEntities(list, false);
        entityDao.insertInTx(list1);
        for (int i = 0; i < list1.size(); i++)
        {
            ((Entity)list.get(i)).setEntityId(getPkFrom(list1.get(i)));
        }

        informListeners();
    }

    public void clear(boolean flag)
    {
        if (flag)
        {
            (new DeleteQueryExt(entityDao.queryBuilder().where(EntityProperties.EntityStatus.eq(Integer.valueOf(com.fitbit.data.domain.Entity.EntityStatus.SYNCED.getCode())), new WhereCondition[0]).buildDelete())).executeDeleteAndClearCache();
            return;
        } else
        {
            entityDao.deleteAll();
            return;
        }
    }

    public void configure(AbstractDaoSession abstractdaosession)
    {
        if (mapper == null)
        {
            mapper = createMapper(abstractdaosession);
        }
        entityDao = getDaoFrom(abstractdaosession);
    }

    protected AbstractDaoSession createDaoSession()
    {
        return DaoFactory.getInstance().getDaoSession();
    }

    protected abstract EntityMapper createMapper(AbstractDaoSession abstractdaosession);

    public void delete(Entity entity)
    {
        if (entity == null)
        {
            return;
        } else
        {
            entityDao.deleteByKey(entity.getEntityId());
            informListeners();
            return;
        }
    }

    protected void doAdd(Entity entity)
    {
        if (entity == null)
        {
            return;
        } else
        {
            Object obj = mapper.toDbEntity(entity);
            entity.setEntityId(Long.valueOf(entityDao.insert(obj)));
            return;
        }
    }

    protected List fromDbEntities(List list)
    {
        ArrayList arraylist = new ArrayList();
        Object obj;
        for (list = list.iterator(); list.hasNext(); arraylist.add(mapper.fromDbEntity(obj)))
        {
            obj = list.next();
        }

        return arraylist;
    }

    public transient List get(com.fitbit.data.domain.Entity.EntityStatus aentitystatus[])
    {
        return getEntitiesWhereAnd(EntityProperties.EntityStatus.in((Object[])at.a(aentitystatus)), new WhereCondition[0]);
    }

    public List getAll()
    {
        return fromDbEntities(entityDao.loadAll());
    }

    public Entity getById(long l)
    {
        return (Entity)mapper.fromDbEntity(entityDao.load(Long.valueOf(l)));
    }

    public Entity getByServerId(long l)
    {
        return getDistinctEntityWhere(EntityProperties.ServerId.eq(Long.valueOf(l)), new WhereCondition[0]);
    }

    public List getByServerId(List list)
    {
        return getEntitiesWhereAnd(EntityProperties.ServerId.in(list), new WhereCondition[0]);
    }

    public Entity getByUUID(UUID uuid)
    {
        return getDistinctEntityWhere(EntityProperties.Uuid.eq(uuid.toString()), new WhereCondition[0]);
    }

    protected abstract AbstractDao getDaoFrom(AbstractDaoSession abstractdaosession);

    protected transient Entity getDistinctEntityWhere(WhereCondition wherecondition, WhereCondition awherecondition[])
    {
        wherecondition = ((WhereCondition) (entityDao.queryBuilder().where(wherecondition, awherecondition).unique()));
        return (Entity)mapper.fromDbEntity(wherecondition);
    }

    protected transient List getEntitiesWhereAnd(Property property, WhereCondition wherecondition, WhereCondition awherecondition[])
    {
        return fromDbEntities(entityDao.queryBuilder().where(wherecondition, awherecondition).orderAsc(new Property[] {
            property
        }).build().list());
    }

    protected transient List getEntitiesWhereAnd(WhereCondition wherecondition, WhereCondition awherecondition[])
    {
        return fromDbEntities(entityDao.queryBuilder().where(wherecondition, awherecondition).build().list());
    }

    public AbstractDao getEntityDao()
    {
        return entityDao;
    }

    public EntityMapper getMapper()
    {
        return mapper;
    }

    public String getName()
    {
        return entityDao.getTablename();
    }

    public List getPendingEntries()
    {
        return getEntitiesWhereAnd(EntityProperties.EntityStatus.notEq(Integer.valueOf(com.fitbit.data.domain.Entity.EntityStatus.SYNCED.getCode())), new WhereCondition[0]);
    }

    protected abstract Long getPkFrom(Object obj);

    public void runInTransaction(Runnable runnable)
    {
        entityDao.getSession().runInTx(runnable);
    }

    public void save(Entity entity)
    {
        if (entity == null)
        {
            return;
        } else
        {
            prepareEntity(entity);
            entity = ((Entity) (mapper.toDbEntity(entity, entityDao.load(entity.getEntityId()))));
            entityDao.update(entity);
            informListeners();
            return;
        }
    }

    public void saveAll(Iterable iterable)
    {
        if (iterable == null || !iterable.iterator().hasNext())
        {
            return;
        } else
        {
            iterable = toDbEntities(prepareAll(iterable), true);
            entityDao.updateInTx(iterable);
            informListeners();
            return;
        }
    }

    protected List toDbEntities(Iterable iterable, boolean flag)
    {
        ArrayList arraylist = new ArrayList();
        Entity entity;
        for (iterable = iterable.iterator(); iterable.hasNext(); arraylist.add(mapper.toDbEntity(entity)))
        {
            entity = (Entity)iterable.next();
        }

        return arraylist;
    }
}
