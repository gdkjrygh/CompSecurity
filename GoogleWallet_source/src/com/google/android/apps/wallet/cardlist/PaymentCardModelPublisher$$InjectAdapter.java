// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.cardlist;

import android.os.Handler;
import com.google.android.apps.wallet.base.java.System;
import com.google.android.apps.wallet.eventbus.EventBus;
import com.google.android.apps.wallet.paymentcard.api.CredentialManager;
import com.google.android.apps.wallet.util.async.ActionExecutor;
import com.google.android.apps.wallet.util.async.ThreadChecker;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.cardlist:
//            PaymentCardModelPublisher

public final class  extends Binding
    implements Provider
{

    private Binding actionExecutor;
    private Binding credentialManager;
    private Binding eventBus;
    private Binding handler;
    private Binding system;
    private Binding threadChecker;

    public final void attach(Linker linker)
    {
        eventBus = linker.requestBinding("com.google.android.apps.wallet.eventbus.EventBus", com/google/android/apps/wallet/cardlist/PaymentCardModelPublisher, getClass().getClassLoader());
        credentialManager = linker.requestBinding("com.google.android.apps.wallet.paymentcard.api.CredentialManager", com/google/android/apps/wallet/cardlist/PaymentCardModelPublisher, getClass().getClassLoader());
        actionExecutor = linker.requestBinding("com.google.android.apps.wallet.util.async.ActionExecutor", com/google/android/apps/wallet/cardlist/PaymentCardModelPublisher, getClass().getClassLoader());
        system = linker.requestBinding("com.google.android.apps.wallet.base.java.System", com/google/android/apps/wallet/cardlist/PaymentCardModelPublisher, getClass().getClassLoader());
        handler = linker.requestBinding("@com.google.android.apps.wallet.inject.BindingAnnotations$MainThreadHandler()/android.os.Handler", com/google/android/apps/wallet/cardlist/PaymentCardModelPublisher, getClass().getClassLoader());
        threadChecker = linker.requestBinding("com.google.android.apps.wallet.util.async.ThreadChecker", com/google/android/apps/wallet/cardlist/PaymentCardModelPublisher, getClass().getClassLoader());
    }

    public final PaymentCardModelPublisher get()
    {
        return new PaymentCardModelPublisher((EventBus)eventBus.get(), (CredentialManager)credentialManager.get(), (ActionExecutor)actionExecutor.get(), (System)system.get(), (Handler)handler.get(), (ThreadChecker)threadChecker.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(eventBus);
        set.add(credentialManager);
        set.add(actionExecutor);
        set.add(system);
        set.add(handler);
        set.add(threadChecker);
    }

    public ()
    {
        super("com.google.android.apps.wallet.cardlist.PaymentCardModelPublisher", "members/com.google.android.apps.wallet.cardlist.PaymentCardModelPublisher", true, com/google/android/apps/wallet/cardlist/PaymentCardModelPublisher);
    }
}
