// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.eventbus;

import dagger.Lazy;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

// Referenced classes of package com.google.android.apps.wallet.eventbus:
//            EventPublishersInitializationState, InitializedEventPublisher

public class InitializeEventPublishersTask
    implements Callable
{

    Lazy eventPublishers;
    Executor executor;
    EventPublishersInitializationState initializationState;

    public InitializeEventPublishersTask()
    {
    }

    private Void call()
    {
        executor.execute(new Runnable() {

            final InitializeEventPublishersTask this$0;

            public final void run()
            {
                if (initializationState.areEventPublishersInitialized())
                {
                    return;
                }
                for (Iterator iterator = ((Set)eventPublishers.get()).iterator(); iterator.hasNext(); ((InitializedEventPublisher)iterator.next()).initialize()) { }
                initializationState.eventPublishersInitialized();
            }

            
            {
                this$0 = InitializeEventPublishersTask.this;
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
