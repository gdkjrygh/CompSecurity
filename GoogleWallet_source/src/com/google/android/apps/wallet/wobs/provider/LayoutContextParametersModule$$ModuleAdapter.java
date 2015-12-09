// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.wobs.provider;

import android.content.Context;
import dagger.internal.Binding;
import dagger.internal.BindingsGroup;
import dagger.internal.Linker;
import dagger.internal.ModuleAdapter;
import dagger.internal.ProvidesBinding;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.wobs.provider:
//            LayoutContextParametersModule

public final class INCLUDES extends ModuleAdapter
{
    public static final class ProvideContextParametersProvidesAdapter extends ProvidesBinding
        implements Provider
    {

        private Binding context;
        private final LayoutContextParametersModule module;

        public final void attach(Linker linker)
        {
            context = linker.requestBinding("@com.google.android.apps.common.inject.annotation.ApplicationContext()/android.content.Context", com/google/android/apps/wallet/wobs/provider/LayoutContextParametersModule, getClass().getClassLoader());
        }

        public final com.google.wallet.proto.NanoWalletWobl.LayoutContextParameters get()
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

        public ProvideContextParametersProvidesAdapter(LayoutContextParametersModule layoutcontextparametersmodule)
        {
            super("com.google.wallet.proto.NanoWalletWobl$LayoutContextParameters", true, "com.google.android.apps.wallet.wobs.provider.LayoutContextParametersModule", "provideContextParameters");
            module = layoutcontextparametersmodule;
            setLibrary(true);
        }
    }


    private static final Class INCLUDES[] = new Class[0];
    private static final String INJECTS[] = new String[0];
    private static final Class STATIC_INJECTIONS[] = new Class[0];

    public final void getBindings(BindingsGroup bindingsgroup, LayoutContextParametersModule layoutcontextparametersmodule)
    {
        bindingsgroup.contributeProvidesBinding("com.google.wallet.proto.NanoWalletWobl$LayoutContextParameters", new ProvideContextParametersProvidesAdapter(layoutcontextparametersmodule));
    }

    public final volatile void getBindings(BindingsGroup bindingsgroup, Object obj)
    {
        getBindings(bindingsgroup, (LayoutContextParametersModule)obj);
    }

    public final LayoutContextParametersModule newModule()
    {
        return new LayoutContextParametersModule();
    }

    public final volatile Object newModule()
    {
        return newModule();
    }


    public ProvideContextParametersProvidesAdapter.setLibrary()
    {
        super(com/google/android/apps/wallet/wobs/provider/LayoutContextParametersModule, INJECTS, STATIC_INJECTIONS, false, INCLUDES, false, true);
    }
}
