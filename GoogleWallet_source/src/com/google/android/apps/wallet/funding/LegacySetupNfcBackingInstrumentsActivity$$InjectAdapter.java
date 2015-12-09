// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.funding;

import com.google.android.apps.wallet.eventbus.EventBus;
import com.google.android.apps.wallet.frontinginstrument.TapAndPayModelPublisher;
import com.google.android.apps.wallet.userevents.UserEventLogger;
import com.google.android.apps.wallet.util.async.ActionExecutor;
import com.google.android.apps.wallet.widgets.progressspinner.FullScreenProgressSpinnerManager;
import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.funding:
//            LegacySetupNfcBackingInstrumentsActivity

public final class vity extends Binding
    implements MembersInjector, Provider
{

    private Binding actionExecutor;
    private Binding eventBus;
    private Binding fullScreenProgressSpinnerManager;
    private com.google.android.apps.wallet.base.activity.allet_funding_LegacySetupNfcBackingInstrumentsActivity nextInjectableAncestor;
    private Binding tapAndPayModelPublisher;
    private Binding userEventLogger;

    public final void attach(Linker linker)
    {
        nextInjectableAncestor.attach(linker);
        userEventLogger = linker.requestBinding("com.google.android.apps.wallet.userevents.UserEventLogger", com/google/android/apps/wallet/funding/LegacySetupNfcBackingInstrumentsActivity, getClass().getClassLoader());
        tapAndPayModelPublisher = linker.requestBinding("com.google.android.apps.wallet.frontinginstrument.TapAndPayModelPublisher", com/google/android/apps/wallet/funding/LegacySetupNfcBackingInstrumentsActivity, getClass().getClassLoader());
        fullScreenProgressSpinnerManager = linker.requestBinding("com.google.android.apps.wallet.widgets.progressspinner.FullScreenProgressSpinnerManager", com/google/android/apps/wallet/funding/LegacySetupNfcBackingInstrumentsActivity, getClass().getClassLoader());
        eventBus = linker.requestBinding("com.google.android.apps.wallet.eventbus.EventBus", com/google/android/apps/wallet/funding/LegacySetupNfcBackingInstrumentsActivity, getClass().getClassLoader());
        actionExecutor = linker.requestBinding("com.google.android.apps.wallet.util.async.ActionExecutor", com/google/android/apps/wallet/funding/LegacySetupNfcBackingInstrumentsActivity, getClass().getClassLoader());
    }

    public final LegacySetupNfcBackingInstrumentsActivity get()
    {
        LegacySetupNfcBackingInstrumentsActivity legacysetupnfcbackinginstrumentsactivity = new LegacySetupNfcBackingInstrumentsActivity();
        injectMembers(legacysetupnfcbackinginstrumentsactivity);
        return legacysetupnfcbackinginstrumentsactivity;
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set1.add(userEventLogger);
        set1.add(tapAndPayModelPublisher);
        set1.add(fullScreenProgressSpinnerManager);
        set1.add(eventBus);
        set1.add(actionExecutor);
        nextInjectableAncestor.getDependencies(null, set1);
    }

    public final void injectMembers(LegacySetupNfcBackingInstrumentsActivity legacysetupnfcbackinginstrumentsactivity)
    {
        legacysetupnfcbackinginstrumentsactivity.userEventLogger = (UserEventLogger)userEventLogger.get();
        legacysetupnfcbackinginstrumentsactivity.tapAndPayModelPublisher = (TapAndPayModelPublisher)tapAndPayModelPublisher.get();
        legacysetupnfcbackinginstrumentsactivity.fullScreenProgressSpinnerManager = (FullScreenProgressSpinnerManager)fullScreenProgressSpinnerManager.get();
        legacysetupnfcbackinginstrumentsactivity.eventBus = (EventBus)eventBus.get();
        legacysetupnfcbackinginstrumentsactivity.actionExecutor = (ActionExecutor)actionExecutor.get();
        nextInjectableAncestor.injectMembers(legacysetupnfcbackinginstrumentsactivity);
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((LegacySetupNfcBackingInstrumentsActivity)obj);
    }

    public apps_wallet_funding_LegacySetupNfcBackingInstrumentsActivity()
    {
        super("com.google.android.apps.wallet.funding.LegacySetupNfcBackingInstrumentsActivity", "members/com.google.android.apps.wallet.funding.LegacySetupNfcBackingInstrumentsActivity", false, com/google/android/apps/wallet/funding/LegacySetupNfcBackingInstrumentsActivity);
        nextInjectableAncestor = new com.google.android.apps.wallet.base.activity.allet_funding_LegacySetupNfcBackingInstrumentsActivity();
    }
}
