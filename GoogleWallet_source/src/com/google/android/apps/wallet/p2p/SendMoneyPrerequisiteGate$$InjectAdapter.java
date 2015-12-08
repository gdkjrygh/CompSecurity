// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.p2p;

import android.support.v4.app.FragmentActivity;
import com.google.android.apps.wallet.config.featurecontrol.FeatureManager;
import com.google.android.apps.wallet.eventbus.EventBus;
import com.google.android.apps.wallet.widgets.progressspinner.FullScreenProgressSpinnerManager;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.p2p:
//            SendMoneyPrerequisiteGate

public final class nnerManager extends Binding
    implements Provider
{

    private Binding activity;
    private Binding eventBus;
    private Binding featureManager;
    private Binding fullScreenProgressSpinnerManager;

    public final void attach(Linker linker)
    {
        activity = linker.requestBinding("android.support.v4.app.FragmentActivity", com/google/android/apps/wallet/p2p/SendMoneyPrerequisiteGate, getClass().getClassLoader());
        eventBus = linker.requestBinding("com.google.android.apps.wallet.eventbus.EventBus", com/google/android/apps/wallet/p2p/SendMoneyPrerequisiteGate, getClass().getClassLoader());
        fullScreenProgressSpinnerManager = linker.requestBinding("com.google.android.apps.wallet.widgets.progressspinner.FullScreenProgressSpinnerManager", com/google/android/apps/wallet/p2p/SendMoneyPrerequisiteGate, getClass().getClassLoader());
        featureManager = linker.requestBinding("com.google.android.apps.wallet.config.featurecontrol.FeatureManager", com/google/android/apps/wallet/p2p/SendMoneyPrerequisiteGate, getClass().getClassLoader());
    }

    public final SendMoneyPrerequisiteGate get()
    {
        return new SendMoneyPrerequisiteGate((FragmentActivity)activity.get(), (EventBus)eventBus.get(), (FullScreenProgressSpinnerManager)fullScreenProgressSpinnerManager.get(), (FeatureManager)featureManager.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(activity);
        set.add(eventBus);
        set.add(fullScreenProgressSpinnerManager);
        set.add(featureManager);
    }

    public nnerManager()
    {
        super("com.google.android.apps.wallet.p2p.SendMoneyPrerequisiteGate", "members/com.google.android.apps.wallet.p2p.SendMoneyPrerequisiteGate", false, com/google/android/apps/wallet/p2p/SendMoneyPrerequisiteGate);
    }
}
