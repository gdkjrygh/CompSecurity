// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.init;

import android.app.Application;
import android.os.SystemClock;
import com.google.android.apps.wallet.logging.WLog;
import com.google.android.apps.wallet.userscope.UserInjector;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Callable;

public abstract class InitializerTaskManager
{

    private static final String TAG = com/google/android/apps/wallet/init/InitializerTaskManager.getSimpleName();
    private final Application application;
    private final Set successfulTasks = Collections.newSetFromMap(Maps.newConcurrentMap());

    public InitializerTaskManager(Application application1)
    {
        application = application1;
    }

    private void runTask(Class class1)
        throws Exception
    {
        WLog.ifmt(TAG, "%s: start", new Object[] {
            class1
        });
        long l = SystemClock.elapsedRealtime();
        ((Callable)UserInjector.get(class1, application)).call();
        WLog.ifmt(TAG, "%s: done, elapsed: %s ms", new Object[] {
            class1, Long.valueOf(SystemClock.elapsedRealtime() - l)
        });
    }

    public final void clearSuccessfulTasks()
    {
        successfulTasks.clear();
    }

    protected abstract ImmutableList getAllNecessaryTasks();

    public final boolean initializerTasksComplete()
    {
        return successfulTasks.containsAll(getAllNecessaryTasks());
    }

    public final void runTasks()
        throws Exception
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = initializerTasksComplete();
        if (!flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        Object obj;
        obj = getAllNecessaryTasks();
        WLog.ifmt(TAG, "submitting %s", new Object[] {
            obj
        });
        obj = ((Iterable) (obj)).iterator();
        while (((Iterator) (obj)).hasNext()) 
        {
            Class class1 = (Class)((Iterator) (obj)).next();
            runTask(class1);
            successfulTasks.add(class1);
        }
        if (true) goto _L1; else goto _L3
_L3:
        Object obj1;
        obj1;
        successfulTasks.clear();
        throw obj1;
        obj1;
        this;
        JVM INSTR monitorexit ;
        throw obj1;
    }

}
