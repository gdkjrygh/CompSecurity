// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.util.async;

import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import java.util.concurrent.Executor;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.util.async:
//            SequentialExecutor

public final class Q extends Binding
    implements Provider
{

    private Binding parallelExecutor;

    public final void attach(Linker linker)
    {
        parallelExecutor = linker.requestBinding("@com.google.android.apps.wallet.util.async.BindingAnnotations$Parallel()/java.util.concurrent.Executor", com/google/android/apps/wallet/util/async/SequentialExecutor, getClass().getClassLoader());
    }

    public final SequentialExecutor get()
    {
        return new SequentialExecutor((Executor)parallelExecutor.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(parallelExecutor);
    }

    public Q()
    {
        super("com.google.android.apps.wallet.util.async.SequentialExecutor", "members/com.google.android.apps.wallet.util.async.SequentialExecutor", false, com/google/android/apps/wallet/util/async/SequentialExecutor);
    }
}
