// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo.greendao;

import com.fitbit.data.domain.Operation;
import com.fitbit.data.repo.aj;
import com.fitbit.data.repo.greendao.mapping.EntityMapper;
import com.fitbit.data.repo.greendao.mapping.OperationMapper;
import com.fitbit.e.a;
import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.AbstractDaoSession;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.query.DeleteQuery;
import de.greenrobot.dao.query.Query;
import de.greenrobot.dao.query.QueryBuilder;
import de.greenrobot.dao.query.WhereCondition;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.fitbit.data.repo.greendao:
//            DaoFactory, DaoSession, OperationsQueue

public class OperationsQueueGreenDaoRepository
    implements aj
{

    private static final String TAG = "OperationsQueueGreenDaoRepository";
    private final AbstractDao entityDao = DaoFactory.getInstance().getDaoSession().getOperationsQueueDao();
    private final EntityMapper mapper = new OperationMapper();

    public OperationsQueueGreenDaoRepository()
    {
    }

    public void add(Operation operation)
    {
        operation.a(Long.valueOf(entityDao.insert(mapper.toDbEntity(operation))));
        a.a("OperationsQueueGreenDaoRepository", (new StringBuilder()).append("Adding operation ").append(operation.b()).append(" ").append(operation.e()).append(" Stacktrace: ").append(a.a(Thread.currentThread().getStackTrace())).toString().replace('\n', '|'), new Object[0]);
    }

    public void addAll(final List ops)
    {
        entityDao.getSession().runInTx(new Runnable() {

            final OperationsQueueGreenDaoRepository this$0;
            final List val$ops;

            public void run()
            {
                Operation operation;
                for (Iterator iterator = ops.iterator(); iterator.hasNext(); add(operation))
                {
                    operation = (Operation)iterator.next();
                }

            }

            
            {
                this$0 = OperationsQueueGreenDaoRepository.this;
                ops = list;
                super();
            }
        });
    }

    public void clearOperationQueueFor(Long long1, String s)
    {
        entityDao.queryBuilder().where(OperationsQueueDao.Properties.ForeignId.eq(long1), new WhereCondition[] {
            OperationsQueueDao.Properties.TableName.eq(s)
        }).buildDelete().executeDeleteWithoutDetachingEntities();
    }

    public void delete(Operation operation)
    {
        if (operation != null)
        {
            a.a("OperationsQueueGreenDaoRepository", (new StringBuilder()).append("Deleting operation ").append(operation.b()).append(" ").append(operation.e()).append(" Stacktrace: ").append(a.a(Thread.currentThread().getStackTrace())).toString().replace('\n', '|'), new Object[0]);
        }
        operation = (OperationsQueue)entityDao.load(operation.e());
        if (operation != null)
        {
            entityDao.delete(operation);
        }
    }

    public void deleteAll(final List ops)
    {
        entityDao.getSession().runInTx(new Runnable() {

            final OperationsQueueGreenDaoRepository this$0;
            final List val$ops;

            public void run()
            {
                Operation operation;
                for (Iterator iterator = ops.iterator(); iterator.hasNext(); delete(operation))
                {
                    operation = (Operation)iterator.next();
                }

            }

            
            {
                this$0 = OperationsQueueGreenDaoRepository.this;
                ops = list;
                super();
            }
        });
    }

    public List getAllOperationsWithCreationOrder()
    {
        Object obj = entityDao.queryBuilder().orderAsc(new Property[] {
            OperationsQueueDao.Properties.Id
        }).build();
        ArrayList arraylist = new ArrayList();
        OperationsQueue operationsqueue;
        for (obj = ((Query) (obj)).list().iterator(); ((Iterator) (obj)).hasNext(); arraylist.add(mapper.fromDbEntity(operationsqueue)))
        {
            operationsqueue = (OperationsQueue)((Iterator) (obj)).next();
        }

        return arraylist;
    }

    protected void save(Operation operation)
    {
        if (operation == null)
        {
            return;
        } else
        {
            a.a("OperationsQueueGreenDaoRepository", (new StringBuilder()).append("Saving operation ").append(operation.b()).append(" ").append(operation.e()).append(" Stacktrace: ").append(a.a(Thread.currentThread().getStackTrace())).toString().replace('\n', '|'), new Object[0]);
            operation = (OperationsQueue)mapper.toDbEntity(operation, entityDao.load(operation.e()));
            entityDao.update(operation);
            return;
        }
    }

    public void saveAll(final List ops)
    {
        entityDao.getSession().runInTx(new Runnable() {

            final OperationsQueueGreenDaoRepository this$0;
            final List val$ops;

            public void run()
            {
                Operation operation;
                for (Iterator iterator = ops.iterator(); iterator.hasNext(); save(operation))
                {
                    operation = (Operation)iterator.next();
                }

            }

            
            {
                this$0 = OperationsQueueGreenDaoRepository.this;
                ops = list;
                super();
            }
        });
    }
}
