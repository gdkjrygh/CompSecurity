// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.init;

import com.google.android.apps.wallet.globalresources.GlobalResourcesSyncManager;
import com.google.android.apps.wallet.wobs.api.WobsColdStartSyncer;
import dagger.Lazy;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

public class CombinedSyncTask
    implements Callable
{

    private final Executor executor;
    private final Lazy globalResourcesSyncManager;
    private final Lazy wobsColdStartSyncer;

    CombinedSyncTask(Lazy lazy, Lazy lazy1, Executor executor1)
    {
        globalResourcesSyncManager = lazy;
        wobsColdStartSyncer = lazy1;
        executor = executor1;
    }

    private Void call()
    {
        executor.execute(new Runnable() {

            final CombinedSyncTask this$0;

            public final void run()
            {
                ((GlobalResourcesSyncManager)globalResourcesSyncManager.get()).enablePeriodicSync();
            }

            
            {
                this$0 = CombinedSyncTask.this;
                super();
            }
        });
        executor.execute(new Runnable() {

            final CombinedSyncTask this$0;

            public final void run()
            {
                ((WobsColdStartSyncer)wobsColdStartSyncer.get()).sync();
            }

            
            {
                this$0 = CombinedSyncTask.this;
                super();
            }
        });
        return null;
    }

    public volatile Object call()
        throws Exception
    {
        return call();
    }


}
