// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.util.async;

import dagger.internal.Binding;
import dagger.internal.Linker;
import dagger.internal.ProvidesBinding;
import java.util.Set;
import java.util.concurrent.Executor;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.util.async:
//            UtilAsyncModule, SequentialExecutor

public static final class setLibrary extends ProvidesBinding
    implements Provider
{

    private Binding executor;
    private final UtilAsyncModule module;

    public final void attach(Linker linker)
    {
        executor = linker.requestBinding("com.google.android.apps.wallet.util.async.SequentialExecutor", com/google/android/apps/wallet/util/async/UtilAsyncModule, getClass().getClassLoader());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final Executor get()
    {
        UtilAsyncModule utilasyncmodule = module;
        return UtilAsyncModule.getSequentialThreadExecutor((SequentialExecutor)executor.get());
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(executor);
    }

    public y(UtilAsyncModule utilasyncmodule)
    {
        super("@com.google.android.apps.wallet.util.async.BindingAnnotations$Sequential()/java.util.concurrent.Executor", false, "com.google.android.apps.wallet.util.async.UtilAsyncModule", "getSequentialThreadExecutor");
        module = utilasyncmodule;
        setLibrary(true);
    }
}
