// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.wobs.provider;

import android.content.Context;
import dagger.internal.Binding;
import dagger.internal.Linker;
import dagger.internal.ProvidesBinding;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.wobs.provider:
//            LayoutContextParametersModule

public static final class setLibrary extends ProvidesBinding
    implements Provider
{

    private Binding context;
    private final LayoutContextParametersModule module;

    public final void attach(Linker linker)
    {
        context = linker.requestBinding("@com.google.android.apps.common.inject.annotation.ApplicationContext()/android.content.Context", com/google/android/apps/wallet/wobs/provider/LayoutContextParametersModule, getClass().getClassLoader());
    }

    public final com.google.wallet.proto.etersProvidesAdapter get()
    {
        LayoutContextParametersModule layoutcontextparametersmodule = module;
        return LayoutContextParametersModule.provideContextParameters((Context)context.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(context);
    }

    public (LayoutContextParametersModule layoutcontextparametersmodule)
    {
        super("com.google.wallet.proto.NanoWalletWobl$LayoutContextParameters", true, "com.google.android.apps.wallet.wobs.provider.LayoutContextParametersModule", "provideContextParameters");
        module = layoutcontextparametersmodule;
        setLibrary(true);
    }
}
