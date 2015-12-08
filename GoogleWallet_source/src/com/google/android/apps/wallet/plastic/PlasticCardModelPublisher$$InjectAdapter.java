// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.plastic;

import android.content.SharedPreferences;
import android.os.Handler;
import com.google.android.apps.wallet.cardlist.FrontingInstrumentClient;
import com.google.android.apps.wallet.config.featurecontrol.FeatureManager;
import com.google.android.apps.wallet.eventbus.EventBus;
import com.google.android.apps.wallet.frontinginstrument.FrontingInstrumentInfoManager;
import com.google.android.apps.wallet.util.async.ActionExecutor;
import com.google.android.apps.wallet.util.async.ThreadChecker;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.plastic:
//            PlasticCardModelPublisher

public final class  extends Binding
    implements Provider
{

    private Binding actionExecutor;
    private Binding eventBus;
    private Binding featureManager;
    private Binding frontingInstrumentInfoManager;
    private Binding handler;
    private Binding instrumentClient;
    private Binding sharedPrefs;
    private Binding threadChecker;

    public final void attach(Linker linker)
    {
        eventBus = linker.requestBinding("com.google.android.apps.wallet.eventbus.EventBus", com/google/android/apps/wallet/plastic/PlasticCardModelPublisher, getClass().getClassLoader());
        actionExecutor = linker.requestBinding("com.google.android.apps.wallet.util.async.ActionExecutor", com/google/android/apps/wallet/plastic/PlasticCardModelPublisher, getClass().getClassLoader());
        handler = linker.requestBinding("@com.google.android.apps.wallet.inject.BindingAnnotations$MainThreadHandler()/android.os.Handler", com/google/android/apps/wallet/plastic/PlasticCardModelPublisher, getClass().getClassLoader());
        threadChecker = linker.requestBinding("com.google.android.apps.wallet.util.async.ThreadChecker", com/google/android/apps/wallet/plastic/PlasticCardModelPublisher, getClass().getClassLoader());
        instrumentClient = linker.requestBinding("com.google.android.apps.wallet.cardlist.FrontingInstrumentClient", com/google/android/apps/wallet/plastic/PlasticCardModelPublisher, getClass().getClassLoader());
        frontingInstrumentInfoManager = linker.requestBinding("com.google.android.apps.wallet.frontinginstrument.FrontingInstrumentInfoManager", com/google/android/apps/wallet/plastic/PlasticCardModelPublisher, getClass().getClassLoader());
        sharedPrefs = linker.requestBinding("android.content.SharedPreferences", com/google/android/apps/wallet/plastic/PlasticCardModelPublisher, getClass().getClassLoader());
        featureManager = linker.requestBinding("com.google.android.apps.wallet.config.featurecontrol.FeatureManager", com/google/android/apps/wallet/plastic/PlasticCardModelPublisher, getClass().getClassLoader());
    }

    public final PlasticCardModelPublisher get()
    {
        return new PlasticCardModelPublisher((EventBus)eventBus.get(), (ActionExecutor)actionExecutor.get(), (Handler)handler.get(), (ThreadChecker)threadChecker.get(), (FrontingInstrumentClient)instrumentClient.get(), (FrontingInstrumentInfoManager)frontingInstrumentInfoManager.get(), (SharedPreferences)sharedPrefs.get(), (FeatureManager)featureManager.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(eventBus);
        set.add(actionExecutor);
        set.add(handler);
        set.add(threadChecker);
        set.add(instrumentClient);
        set.add(frontingInstrumentInfoManager);
        set.add(sharedPrefs);
        set.add(featureManager);
    }

    public ()
    {
        super("com.google.android.apps.wallet.plastic.PlasticCardModelPublisher", "members/com.google.android.apps.wallet.plastic.PlasticCardModelPublisher", true, com/google/android/apps/wallet/plastic/PlasticCardModelPublisher);
    }
}
