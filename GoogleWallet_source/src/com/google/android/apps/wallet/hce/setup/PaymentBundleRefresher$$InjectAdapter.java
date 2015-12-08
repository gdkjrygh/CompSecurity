// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.hce.setup;

import android.app.AlarmManager;
import android.app.Application;
import android.content.SharedPreferences;
import com.google.android.apps.wallet.base.java.System;
import com.google.android.apps.wallet.hce.database.HceLibraryDatabase;
import com.google.android.apps.wallet.hce.setup.setupstate.NfcPaymentSetupManager;
import com.google.android.apps.wallet.userevents.UserEventLogger;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.hce.setup:
//            PaymentBundleRefresher

public final class  extends Binding
    implements Provider
{

    private Binding alarmManager;
    private Binding application;
    private Binding gcmNetworkManager;
    private Binding getHceFrontingInstrumentTask;
    private Binding hceDb;
    private Binding nfcPaymentSetupManager;
    private Binding system;
    private Binding userEventLogger;
    private Binding userPrefs;

    public final void attach(Linker linker)
    {
        application = linker.requestBinding("android.app.Application", com/google/android/apps/wallet/hce/setup/PaymentBundleRefresher, getClass().getClassLoader());
        userEventLogger = linker.requestBinding("com.google.android.apps.wallet.userevents.UserEventLogger", com/google/android/apps/wallet/hce/setup/PaymentBundleRefresher, getClass().getClassLoader());
        nfcPaymentSetupManager = linker.requestBinding("com.google.android.apps.wallet.hce.setup.setupstate.NfcPaymentSetupManager", com/google/android/apps/wallet/hce/setup/PaymentBundleRefresher, getClass().getClassLoader());
        getHceFrontingInstrumentTask = linker.requestBinding("javax.inject.Provider<com.google.android.apps.wallet.hce.rpc.GetHceFrontingInstrumentTask>", com/google/android/apps/wallet/hce/setup/PaymentBundleRefresher, getClass().getClassLoader());
        userPrefs = linker.requestBinding("android.content.SharedPreferences", com/google/android/apps/wallet/hce/setup/PaymentBundleRefresher, getClass().getClassLoader());
        hceDb = linker.requestBinding("com.google.android.apps.wallet.hce.database.HceLibraryDatabase", com/google/android/apps/wallet/hce/setup/PaymentBundleRefresher, getClass().getClassLoader());
        gcmNetworkManager = linker.requestBinding("javax.inject.Provider<com.google.android.gms.gcm.GcmNetworkManager>", com/google/android/apps/wallet/hce/setup/PaymentBundleRefresher, getClass().getClassLoader());
        system = linker.requestBinding("com.google.android.apps.wallet.base.java.System", com/google/android/apps/wallet/hce/setup/PaymentBundleRefresher, getClass().getClassLoader());
        alarmManager = linker.requestBinding("android.app.AlarmManager", com/google/android/apps/wallet/hce/setup/PaymentBundleRefresher, getClass().getClassLoader());
    }

    public final PaymentBundleRefresher get()
    {
        return new PaymentBundleRefresher((Application)application.get(), (UserEventLogger)userEventLogger.get(), (NfcPaymentSetupManager)nfcPaymentSetupManager.get(), (Provider)getHceFrontingInstrumentTask.get(), (SharedPreferences)userPrefs.get(), (HceLibraryDatabase)hceDb.get(), (Provider)gcmNetworkManager.get(), (System)system.get(), (AlarmManager)alarmManager.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(application);
        set.add(userEventLogger);
        set.add(nfcPaymentSetupManager);
        set.add(getHceFrontingInstrumentTask);
        set.add(userPrefs);
        set.add(hceDb);
        set.add(gcmNetworkManager);
        set.add(system);
        set.add(alarmManager);
    }

    public ()
    {
        super("com.google.android.apps.wallet.hce.setup.PaymentBundleRefresher", "members/com.google.android.apps.wallet.hce.setup.PaymentBundleRefresher", true, com/google/android/apps/wallet/hce/setup/PaymentBundleRefresher);
    }
}
