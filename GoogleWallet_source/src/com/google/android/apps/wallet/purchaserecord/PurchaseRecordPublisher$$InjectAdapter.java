// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.purchaserecord;

import com.google.android.apps.wallet.config.appcontrol.AppControl;
import com.google.android.apps.wallet.eventbus.EventBus;
import com.google.android.apps.wallet.util.async.ActionExecutor;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.purchaserecord:
//            PurchaseRecordPublisher, PurchaseRecordManager

public final class  extends Binding
    implements Provider
{

    private Binding actionExecutor;
    private Binding appControl;
    private Binding eventBus;
    private Binding manager;

    public final void attach(Linker linker)
    {
        manager = linker.requestBinding("com.google.android.apps.wallet.purchaserecord.PurchaseRecordManager", com/google/android/apps/wallet/purchaserecord/PurchaseRecordPublisher, getClass().getClassLoader());
        eventBus = linker.requestBinding("com.google.android.apps.wallet.eventbus.EventBus", com/google/android/apps/wallet/purchaserecord/PurchaseRecordPublisher, getClass().getClassLoader());
        actionExecutor = linker.requestBinding("com.google.android.apps.wallet.util.async.ActionExecutor", com/google/android/apps/wallet/purchaserecord/PurchaseRecordPublisher, getClass().getClassLoader());
        appControl = linker.requestBinding("com.google.android.apps.wallet.config.appcontrol.AppControl", com/google/android/apps/wallet/purchaserecord/PurchaseRecordPublisher, getClass().getClassLoader());
    }

    public final PurchaseRecordPublisher get()
    {
        return new PurchaseRecordPublisher((PurchaseRecordManager)manager.get(), (EventBus)eventBus.get(), (ActionExecutor)actionExecutor.get(), (AppControl)appControl.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(manager);
        set.add(eventBus);
        set.add(actionExecutor);
        set.add(appControl);
    }

    public ()
    {
        super("com.google.android.apps.wallet.purchaserecord.PurchaseRecordPublisher", "members/com.google.android.apps.wallet.purchaserecord.PurchaseRecordPublisher", true, com/google/android/apps/wallet/purchaserecord/PurchaseRecordPublisher);
    }
}
