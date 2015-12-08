// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.purchaserecord;

import com.google.android.apps.wallet.eventbus.EventBus;
import com.google.android.apps.wallet.util.async.ActionExecutor;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.purchaserecord:
//            IncomingMoneyRequestsManager, PurchaseRecordManager

public final class  extends Binding
    implements Provider
{

    private Binding actionExecutor;
    private Binding eventBus;
    private Binding purchaseRecordManager;

    public final void attach(Linker linker)
    {
        eventBus = linker.requestBinding("com.google.android.apps.wallet.eventbus.EventBus", com/google/android/apps/wallet/purchaserecord/IncomingMoneyRequestsManager, getClass().getClassLoader());
        actionExecutor = linker.requestBinding("com.google.android.apps.wallet.util.async.ActionExecutor", com/google/android/apps/wallet/purchaserecord/IncomingMoneyRequestsManager, getClass().getClassLoader());
        purchaseRecordManager = linker.requestBinding("com.google.android.apps.wallet.purchaserecord.PurchaseRecordManager", com/google/android/apps/wallet/purchaserecord/IncomingMoneyRequestsManager, getClass().getClassLoader());
    }

    public final IncomingMoneyRequestsManager get()
    {
        return new IncomingMoneyRequestsManager((EventBus)eventBus.get(), (ActionExecutor)actionExecutor.get(), (PurchaseRecordManager)purchaseRecordManager.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(eventBus);
        set.add(actionExecutor);
        set.add(purchaseRecordManager);
    }

    public ()
    {
        super("com.google.android.apps.wallet.purchaserecord.IncomingMoneyRequestsManager", "members/com.google.android.apps.wallet.purchaserecord.IncomingMoneyRequestsManager", true, com/google/android/apps/wallet/purchaserecord/IncomingMoneyRequestsManager);
    }
}
