// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.eventbus;

import dagger.Lazy;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.android.apps.wallet.eventbus:
//            InitializeEventPublishersTask, EventPublishersInitializationState, InitializedEventPublisher

final class this._cls0
    implements Runnable
{

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

    te()
    {
        this$0 = InitializeEventPublishersTask.this;
        super();
    }
}
