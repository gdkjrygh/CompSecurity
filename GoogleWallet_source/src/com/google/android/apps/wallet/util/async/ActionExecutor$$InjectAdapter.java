// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.util.async;

import android.os.Handler;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import java.util.concurrent.Executor;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.util.async:
//            ActionExecutor

public final class  extends Binding
    implements Provider
{

    private Binding executor;
    private Binding handler;
    private Binding requestFactory;

    public final void attach(Linker linker)
    {
        executor = linker.requestBinding("@com.google.android.apps.wallet.util.async.BindingAnnotations$Parallel()/java.util.concurrent.Executor", com/google/android/apps/wallet/util/async/ActionExecutor, getClass().getClassLoader());
        handler = linker.requestBinding("@com.google.android.apps.wallet.inject.BindingAnnotations$MainThreadHandler()/android.os.Handler", com/google/android/apps/wallet/util/async/ActionExecutor, getClass().getClassLoader());
        requestFactory = linker.requestBinding("com.google.android.apps.wallet.util.async.ActionRequests$RequestFactory", com/google/android/apps/wallet/util/async/ActionExecutor, getClass().getClassLoader());
    }

    public final ActionExecutor get()
    {
        return new ActionExecutor((Executor)executor.get(), (Handler)handler.get(), (handler)requestFactory.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(executor);
        set.add(handler);
        set.add(requestFactory);
    }

    public ()
    {
        super("com.google.android.apps.wallet.util.async.ActionExecutor", "members/com.google.android.apps.wallet.util.async.ActionExecutor", false, com/google/android/apps/wallet/util/async/ActionExecutor);
    }
}
