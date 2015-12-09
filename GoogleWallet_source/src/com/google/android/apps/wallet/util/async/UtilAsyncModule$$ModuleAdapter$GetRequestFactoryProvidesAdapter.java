// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.util.async;

import android.os.Handler;
import dagger.internal.Binding;
import dagger.internal.Linker;
import dagger.internal.ProvidesBinding;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.util.async:
//            UtilAsyncModule

public static final class setLibrary extends ProvidesBinding
    implements Provider
{

    private Binding handler;
    private final UtilAsyncModule module;

    public final void attach(Linker linker)
    {
        handler = linker.requestBinding("@com.google.android.apps.wallet.inject.BindingAnnotations$MainThreadHandler()/android.os.Handler", com/google/android/apps/wallet/util/async/UtilAsyncModule, getClass().getClassLoader());
    }

    public final handler get()
    {
        UtilAsyncModule utilasyncmodule = module;
        return UtilAsyncModule.getRequestFactory((Handler)handler.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(handler);
    }

    public (UtilAsyncModule utilasyncmodule)
    {
        super("com.google.android.apps.wallet.util.async.ActionRequests$RequestFactory", false, "com.google.android.apps.wallet.util.async.UtilAsyncModule", "getRequestFactory");
        module = utilasyncmodule;
        setLibrary(true);
    }
}
