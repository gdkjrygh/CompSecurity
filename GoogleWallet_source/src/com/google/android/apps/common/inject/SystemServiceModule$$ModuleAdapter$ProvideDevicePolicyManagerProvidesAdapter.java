// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.common.inject;

import android.app.admin.DevicePolicyManager;
import android.content.Context;
import dagger.internal.Binding;
import dagger.internal.Linker;
import dagger.internal.ProvidesBinding;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.common.inject:
//            SystemServiceModule

public static final class setLibrary extends ProvidesBinding
    implements Provider
{

    private Binding context;
    private final SystemServiceModule module;

    public final void attach(Linker linker)
    {
        context = linker.requestBinding("@com.google.android.apps.common.inject.annotation.ApplicationContext()/android.content.Context", com/google/android/apps/common/inject/SystemServiceModule, getClass().getClassLoader());
    }

    public final DevicePolicyManager get()
    {
        SystemServiceModule systemservicemodule = module;
        return SystemServiceModule.provideDevicePolicyManager((Context)context.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(context);
    }

    public (SystemServiceModule systemservicemodule)
    {
        super("android.app.admin.DevicePolicyManager", false, "com.google.android.apps.common.inject.SystemServiceModule", "provideDevicePolicyManager");
        module = systemservicemodule;
        setLibrary(true);
    }
}
