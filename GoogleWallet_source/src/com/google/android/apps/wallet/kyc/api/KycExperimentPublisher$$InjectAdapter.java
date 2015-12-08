// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.kyc.api;

import android.content.SharedPreferences;
import android.os.Handler;
import com.google.android.apps.wallet.eventbus.EventBus;
import com.google.android.apps.wallet.network.NetworkConnectivityReturnChecker;
import com.google.android.apps.wallet.util.async.ActionExecutor;
import com.google.android.apps.wallet.util.async.ThreadChecker;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.kyc.api:
//            KycExperimentPublisher, KycClient

public final class  extends Binding
    implements Provider
{

    private Binding actionExecutor;
    private Binding eventBus;
    private Binding handler;
    private Binding kycClient;
    private Binding networkConnectivityReturnChecker;
    private Binding sharedPreferences;
    private Binding threadChecker;

    public final void attach(Linker linker)
    {
        eventBus = linker.requestBinding("com.google.android.apps.wallet.eventbus.EventBus", com/google/android/apps/wallet/kyc/api/KycExperimentPublisher, getClass().getClassLoader());
        actionExecutor = linker.requestBinding("com.google.android.apps.wallet.util.async.ActionExecutor", com/google/android/apps/wallet/kyc/api/KycExperimentPublisher, getClass().getClassLoader());
        kycClient = linker.requestBinding("com.google.android.apps.wallet.kyc.api.KycClient", com/google/android/apps/wallet/kyc/api/KycExperimentPublisher, getClass().getClassLoader());
        sharedPreferences = linker.requestBinding("android.content.SharedPreferences", com/google/android/apps/wallet/kyc/api/KycExperimentPublisher, getClass().getClassLoader());
        networkConnectivityReturnChecker = linker.requestBinding("com.google.android.apps.wallet.network.NetworkConnectivityReturnChecker", com/google/android/apps/wallet/kyc/api/KycExperimentPublisher, getClass().getClassLoader());
        threadChecker = linker.requestBinding("com.google.android.apps.wallet.util.async.ThreadChecker", com/google/android/apps/wallet/kyc/api/KycExperimentPublisher, getClass().getClassLoader());
        handler = linker.requestBinding("@com.google.android.apps.wallet.inject.BindingAnnotations$MainThreadHandler()/android.os.Handler", com/google/android/apps/wallet/kyc/api/KycExperimentPublisher, getClass().getClassLoader());
    }

    public final KycExperimentPublisher get()
    {
        return new KycExperimentPublisher((EventBus)eventBus.get(), (ActionExecutor)actionExecutor.get(), (KycClient)kycClient.get(), (SharedPreferences)sharedPreferences.get(), (NetworkConnectivityReturnChecker)networkConnectivityReturnChecker.get(), (ThreadChecker)threadChecker.get(), (Handler)handler.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(eventBus);
        set.add(actionExecutor);
        set.add(kycClient);
        set.add(sharedPreferences);
        set.add(networkConnectivityReturnChecker);
        set.add(threadChecker);
        set.add(handler);
    }

    public ()
    {
        super("com.google.android.apps.wallet.kyc.api.KycExperimentPublisher", "members/com.google.android.apps.wallet.kyc.api.KycExperimentPublisher", true, com/google/android/apps/wallet/kyc/api/KycExperimentPublisher);
    }
}
