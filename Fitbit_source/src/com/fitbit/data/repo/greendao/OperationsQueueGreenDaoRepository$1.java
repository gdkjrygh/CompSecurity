// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo.greendao;

import com.fitbit.data.domain.Operation;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.fitbit.data.repo.greendao:
//            OperationsQueueGreenDaoRepository

class val.ops
    implements Runnable
{

    final OperationsQueueGreenDaoRepository this$0;
    final List val$ops;

    public void run()
    {
        Operation operation;
        for (Iterator iterator = val$ops.iterator(); iterator.hasNext(); save(operation))
        {
            operation = (Operation)iterator.next();
        }

    }

    ()
    {
        this$0 = final_operationsqueuegreendaorepository;
        val$ops = List.this;
        super();
    }
}
