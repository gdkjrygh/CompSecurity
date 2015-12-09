// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo.greendao.mapping;

import com.fitbit.data.domain.Operation;
import com.fitbit.data.repo.greendao.OperationsQueue;
import com.fitbit.util.w;

// Referenced classes of package com.fitbit.data.repo.greendao.mapping:
//            EntityMapper

public class OperationMapper
    implements EntityMapper
{

    public OperationMapper()
    {
    }

    public Operation fromDbEntity(OperationsQueue operationsqueue)
    {
        if (operationsqueue == null)
        {
            return null;
        } else
        {
            Operation operation = new Operation();
            operation.a(operationsqueue.getId());
            operation.a(operationsqueue.getForeignId().longValue());
            operation.a((com.fitbit.data.domain.Operation.OperationType)w.a(operationsqueue.getType().intValue(), com/fitbit/data/domain/Operation$OperationType));
            operation.a(operationsqueue.getTableName());
            operation.a(operationsqueue.getError().booleanValue());
            return operation;
        }
    }

    public volatile Object fromDbEntity(Object obj)
    {
        return fromDbEntity((OperationsQueue)obj);
    }

    public OperationsQueue toDbEntity(Operation operation)
    {
        return toDbEntity(operation, new OperationsQueue());
    }

    public OperationsQueue toDbEntity(Operation operation, OperationsQueue operationsqueue)
    {
        if (operationsqueue == null)
        {
            return null;
        } else
        {
            operationsqueue.setId(operation.e());
            operationsqueue.setForeignId(Long.valueOf(operation.c()));
            operationsqueue.setTableName(operation.b());
            operationsqueue.setType(Integer.valueOf(operation.a().getCode()));
            operationsqueue.setError(Boolean.valueOf(operation.d()));
            return operationsqueue;
        }
    }

    public volatile Object toDbEntity(Object obj)
    {
        return toDbEntity((Operation)obj);
    }

    public volatile Object toDbEntity(Object obj, Object obj1)
    {
        return toDbEntity((Operation)obj, (OperationsQueue)obj1);
    }
}
