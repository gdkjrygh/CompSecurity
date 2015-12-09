// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.chimera;

import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// Referenced classes of package com.google.android.gms.chimera:
//            BaseAsyncOperationService

public abstract class AsyncOperationService extends BaseAsyncOperationService
{

    protected final ExecutorService mExecutorService;

    public AsyncOperationService(String s, BaseAsyncOperationService.AsyncOperationQueue asyncoperationqueue)
    {
        this(s, asyncoperationqueue, 500L);
    }

    protected AsyncOperationService(String s, BaseAsyncOperationService.AsyncOperationQueue asyncoperationqueue, long l)
    {
        super(s, asyncoperationqueue, l);
        mExecutorService = Executors.newSingleThreadExecutor(new NamedThreadFactory((new StringBuilder("AOS[")).append(mName).append("]").toString()));
    }

    protected AsyncOperationService(String s, BaseAsyncOperationService.AsyncOperationQueue asyncoperationqueue, long l, ExecutorService executorservice)
    {
        super(s, asyncoperationqueue, l);
        mExecutorService = executorservice;
    }

    public void onDestroy()
    {
        super.onDestroy();
        mExecutorService.shutdown();
    }

    public final void scheduleOperationTask(BaseAsyncOperationService.OperationTask operationtask)
    {
        mExecutorService.execute(operationtask);
    }
}
