// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.wobs.provider;

import com.google.android.apps.wallet.eventbus.EventBus;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.wobs.provider:
//            SyncWobsStatusPublisher

public final class Y extends Binding
    implements Provider
{

    private Binding eventBus;

    public final void attach(Linker linker)
    {
        eventBus = linker.requestBinding("com.google.android.apps.wallet.eventbus.EventBus", com/google/android/apps/wallet/wobs/provider/SyncWobsStatusPublisher, getClass().getClassLoader());
    }

    public final SyncWobsStatusPublisher get()
    {
        return new SyncWobsStatusPublisher((EventBus)eventBus.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(eventBus);
    }

    public Y()
    {
        super("com.google.android.apps.wallet.wobs.provider.SyncWobsStatusPublisher", "members/com.google.android.apps.wallet.wobs.provider.SyncWobsStatusPublisher", true, com/google/android/apps/wallet/wobs/provider/SyncWobsStatusPublisher);
    }
}
