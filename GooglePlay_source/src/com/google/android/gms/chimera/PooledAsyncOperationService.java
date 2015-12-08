// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.chimera;

import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.ExecutorService;

// Referenced classes of package com.google.android.gms.chimera:
//            BaseAsyncOperationService, AsyncOperation

public abstract class PooledAsyncOperationService extends BaseAsyncOperationService
{
    public static abstract class PooledAsyncOperation
        implements AsyncOperation
    {

        public abstract int getAffinity();

        public PooledAsyncOperation()
        {
        }
    }


    protected final SparseArray mThreadPools;

    protected PooledAsyncOperationService(String s, BaseAsyncOperationService.AsyncOperationQueue asyncoperationqueue, SparseArray sparsearray)
    {
        this(s, asyncoperationqueue, sparsearray, 500L);
    }

    public PooledAsyncOperationService(String s, BaseAsyncOperationService.AsyncOperationQueue asyncoperationqueue, SparseArray sparsearray, long l)
    {
        super(s, asyncoperationqueue, l);
        mThreadPools = sparsearray;
        Preconditions.checkNotNull(mThreadPools.get(-1), "Must provide a default affinity pool!");
    }

    public void onDestroy()
    {
        super.onDestroy();
        for (int i = 0; i < mThreadPools.size(); i++)
        {
            ((ExecutorService)mThreadPools.valueAt(i)).shutdown();
        }

    }

    protected final void scheduleOperationTask(BaseAsyncOperationService.OperationTask operationtask)
    {
        int i = -1;
        ExecutorService executorservice;
        ExecutorService executorservice1;
        if (operationtask.mOperation instanceof PooledAsyncOperation)
        {
            i = ((PooledAsyncOperation)operationtask.mOperation).getAffinity();
        } else
        {
            Log.w(mName, "Received operation without affinity assignment, assigned to default pool");
        }
        executorservice1 = (ExecutorService)mThreadPools.get(i);
        executorservice = executorservice1;
        if (executorservice1 == null)
        {
            Log.w(mName, (new StringBuilder("Received unknown affinity: ")).append(i).append(", assigned to default pool").toString());
            executorservice = (ExecutorService)mThreadPools.get(-1);
        }
        executorservice.execute(operationtask);
    }
}
