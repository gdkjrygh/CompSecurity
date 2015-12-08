// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.frontinginstrument;

import com.google.android.apps.wallet.base.java.System;
import com.google.android.apps.wallet.cardlist.FrontingInstrumentClient;
import com.google.android.apps.wallet.eventbus.EventBus;
import com.google.android.apps.wallet.util.async.ActionExecutor;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.frontinginstrument:
//            TapAndPayModelPublisher, FrontingInstrumentInfoManager

public final class  extends Binding
    implements Provider
{

    private Binding actionExecutor;
    private Binding eventBus;
    private Binding frontingInstrumentClient;
    private Binding frontingInstrumentInfoManager;
    private Binding system;

    public final void attach(Linker linker)
    {
        eventBus = linker.requestBinding("com.google.android.apps.wallet.eventbus.EventBus", com/google/android/apps/wallet/frontinginstrument/TapAndPayModelPublisher, getClass().getClassLoader());
        system = linker.requestBinding("com.google.android.apps.wallet.base.java.System", com/google/android/apps/wallet/frontinginstrument/TapAndPayModelPublisher, getClass().getClassLoader());
        actionExecutor = linker.requestBinding("com.google.android.apps.wallet.util.async.ActionExecutor", com/google/android/apps/wallet/frontinginstrument/TapAndPayModelPublisher, getClass().getClassLoader());
        frontingInstrumentInfoManager = linker.requestBinding("com.google.android.apps.wallet.frontinginstrument.FrontingInstrumentInfoManager", com/google/android/apps/wallet/frontinginstrument/TapAndPayModelPublisher, getClass().getClassLoader());
        frontingInstrumentClient = linker.requestBinding("com.google.android.apps.wallet.cardlist.FrontingInstrumentClient", com/google/android/apps/wallet/frontinginstrument/TapAndPayModelPublisher, getClass().getClassLoader());
    }

    public final TapAndPayModelPublisher get()
    {
        return new TapAndPayModelPublisher((EventBus)eventBus.get(), (System)system.get(), (ActionExecutor)actionExecutor.get(), (FrontingInstrumentInfoManager)frontingInstrumentInfoManager.get(), (FrontingInstrumentClient)frontingInstrumentClient.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(eventBus);
        set.add(system);
        set.add(actionExecutor);
        set.add(frontingInstrumentInfoManager);
        set.add(frontingInstrumentClient);
    }

    public ()
    {
        super("com.google.android.apps.wallet.frontinginstrument.TapAndPayModelPublisher", "members/com.google.android.apps.wallet.frontinginstrument.TapAndPayModelPublisher", true, com/google/android/apps/wallet/frontinginstrument/TapAndPayModelPublisher);
    }
}
