// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.recurringtopup;

import dagger.internal.Binding;
import dagger.internal.Linker;
import dagger.internal.ProvidesBinding;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.recurringtopup:
//            RecurringTopupModule, RecurringTopupEligibilityPublisher, RecurringTopupPublisher

public static final class setLibrary extends ProvidesBinding
    implements Provider
{

    private final RecurringTopupModule module;
    private Binding recurringTopupEligibilityPublisher;
    private Binding recurringTopupPublisher;

    public final void attach(Linker linker)
    {
        recurringTopupEligibilityPublisher = linker.requestBinding("com.google.android.apps.wallet.recurringtopup.RecurringTopupEligibilityPublisher", com/google/android/apps/wallet/recurringtopup/RecurringTopupModule, getClass().getClassLoader());
        recurringTopupPublisher = linker.requestBinding("com.google.android.apps.wallet.recurringtopup.RecurringTopupPublisher", com/google/android/apps/wallet/recurringtopup/RecurringTopupModule, getClass().getClassLoader());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final Set get()
    {
        RecurringTopupModule recurringtopupmodule = module;
        return RecurringTopupModule.getInitializedEventPublishers((RecurringTopupEligibilityPublisher)recurringTopupEligibilityPublisher.get(), (RecurringTopupPublisher)recurringTopupPublisher.get());
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(recurringTopupEligibilityPublisher);
        set.add(recurringTopupPublisher);
    }

    public (RecurringTopupModule recurringtopupmodule)
    {
        super("java.util.Set<com.google.android.apps.wallet.eventbus.InitializedEventPublisher>", false, "com.google.android.apps.wallet.recurringtopup.RecurringTopupModule", "getInitializedEventPublishers");
        module = recurringtopupmodule;
        setLibrary(true);
    }
}
