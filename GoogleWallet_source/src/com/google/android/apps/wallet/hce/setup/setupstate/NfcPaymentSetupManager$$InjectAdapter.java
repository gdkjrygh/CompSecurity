// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.hce.setup.setupstate;

import android.content.SharedPreferences;
import android.os.Handler;
import com.google.android.apps.wallet.config.featurecontrol.FeatureManager;
import com.google.android.apps.wallet.eventbus.EventBus;
import com.google.android.apps.wallet.hce.database.HceLibraryDatabase;
import com.google.android.apps.wallet.util.async.ActionExecutor;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.hce.setup.setupstate:
//            NfcPaymentSetupManager

public final class  extends Binding
    implements Provider
{

    private Binding actionExecutor;
    private Binding eventBus;
    private Binding featureManager;
    private Binding handler;
    private Binding hceLibraryDatabase;
    private Binding sharedPreferences;

    public final void attach(Linker linker)
    {
        eventBus = linker.requestBinding("com.google.android.apps.wallet.eventbus.EventBus", com/google/android/apps/wallet/hce/setup/setupstate/NfcPaymentSetupManager, getClass().getClassLoader());
        sharedPreferences = linker.requestBinding("android.content.SharedPreferences", com/google/android/apps/wallet/hce/setup/setupstate/NfcPaymentSetupManager, getClass().getClassLoader());
        hceLibraryDatabase = linker.requestBinding("com.google.android.apps.wallet.hce.database.HceLibraryDatabase", com/google/android/apps/wallet/hce/setup/setupstate/NfcPaymentSetupManager, getClass().getClassLoader());
        actionExecutor = linker.requestBinding("com.google.android.apps.wallet.util.async.ActionExecutor", com/google/android/apps/wallet/hce/setup/setupstate/NfcPaymentSetupManager, getClass().getClassLoader());
        handler = linker.requestBinding("@com.google.android.apps.wallet.inject.BindingAnnotations$MainThreadHandler()/android.os.Handler", com/google/android/apps/wallet/hce/setup/setupstate/NfcPaymentSetupManager, getClass().getClassLoader());
        featureManager = linker.requestBinding("com.google.android.apps.wallet.config.featurecontrol.FeatureManager", com/google/android/apps/wallet/hce/setup/setupstate/NfcPaymentSetupManager, getClass().getClassLoader());
    }

    public final NfcPaymentSetupManager get()
    {
        return new NfcPaymentSetupManager((EventBus)eventBus.get(), (SharedPreferences)sharedPreferences.get(), (HceLibraryDatabase)hceLibraryDatabase.get(), (ActionExecutor)actionExecutor.get(), (Handler)handler.get(), (FeatureManager)featureManager.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(eventBus);
        set.add(sharedPreferences);
        set.add(hceLibraryDatabase);
        set.add(actionExecutor);
        set.add(handler);
        set.add(featureManager);
    }

    public ()
    {
        super("com.google.android.apps.wallet.hce.setup.setupstate.NfcPaymentSetupManager", "members/com.google.android.apps.wallet.hce.setup.setupstate.NfcPaymentSetupManager", true, com/google/android/apps/wallet/hce/setup/setupstate/NfcPaymentSetupManager);
    }
}
