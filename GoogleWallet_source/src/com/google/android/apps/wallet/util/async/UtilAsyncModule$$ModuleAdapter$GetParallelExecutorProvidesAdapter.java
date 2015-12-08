// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.util.async;

import dagger.internal.ProvidesBinding;
import java.util.concurrent.Executor;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.util.async:
//            UtilAsyncModule

public static final class setLibrary extends ProvidesBinding
    implements Provider
{

    private final UtilAsyncModule module;

    public final volatile Object get()
    {
        return get();
    }

    public final Executor get()
    {
        UtilAsyncModule utilasyncmodule = module;
        return UtilAsyncModule.getParallelExecutor();
    }

    public q(UtilAsyncModule utilasyncmodule)
    {
        super("@com.google.android.apps.wallet.util.async.BindingAnnotations$Parallel()/java.util.concurrent.Executor", true, "com.google.android.apps.wallet.util.async.UtilAsyncModule", "getParallelExecutor");
        module = utilasyncmodule;
        setLibrary(true);
    }
}
