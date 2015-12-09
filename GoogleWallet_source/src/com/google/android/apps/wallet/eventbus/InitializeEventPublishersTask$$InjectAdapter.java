// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.eventbus;

import dagger.Lazy;
import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import java.util.concurrent.Executor;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.eventbus:
//            InitializeEventPublishersTask, EventPublishersInitializationState

public final class  extends Binding
    implements MembersInjector, Provider
{

    private Binding eventPublishers;
    private Binding executor;
    private Binding initializationState;

    public final void attach(Linker linker)
    {
        eventPublishers = linker.requestBinding("dagger.Lazy<java.util.Set<com.google.android.apps.wallet.eventbus.InitializedEventPublisher>>", com/google/android/apps/wallet/eventbus/InitializeEventPublishersTask, getClass().getClassLoader());
        initializationState = linker.requestBinding("com.google.android.apps.wallet.eventbus.EventPublishersInitializationState", com/google/android/apps/wallet/eventbus/InitializeEventPublishersTask, getClass().getClassLoader());
        executor = linker.requestBinding("@com.google.android.apps.wallet.util.async.BindingAnnotations$Parallel()/java.util.concurrent.Executor", com/google/android/apps/wallet/eventbus/InitializeEventPublishersTask, getClass().getClassLoader());
    }

    public final InitializeEventPublishersTask get()
    {
        InitializeEventPublishersTask initializeeventpublisherstask = new InitializeEventPublishersTask();
        injectMembers(initializeeventpublisherstask);
        return initializeeventpublisherstask;
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set1.add(eventPublishers);
        set1.add(initializationState);
        set1.add(executor);
    }

    public final void injectMembers(InitializeEventPublishersTask initializeeventpublisherstask)
    {
        initializeeventpublisherstask.eventPublishers = (Lazy)eventPublishers.get();
        initializeeventpublisherstask.initializationState = (EventPublishersInitializationState)initializationState.get();
        initializeeventpublisherstask.executor = (Executor)executor.get();
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((InitializeEventPublishersTask)obj);
    }

    public ()
    {
        super("com.google.android.apps.wallet.eventbus.InitializeEventPublishersTask", "members/com.google.android.apps.wallet.eventbus.InitializeEventPublishersTask", false, com/google/android/apps/wallet/eventbus/InitializeEventPublishersTask);
    }
}
