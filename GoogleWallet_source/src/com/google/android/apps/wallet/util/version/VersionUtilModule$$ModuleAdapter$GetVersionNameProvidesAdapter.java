// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.util.version;

import android.app.Application;
import dagger.internal.Binding;
import dagger.internal.Linker;
import dagger.internal.ProvidesBinding;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.util.version:
//            VersionUtilModule

public static final class setLibrary extends ProvidesBinding
    implements Provider
{

    private Binding application;
    private final VersionUtilModule module;

    public final void attach(Linker linker)
    {
        application = linker.requestBinding("android.app.Application", com/google/android/apps/wallet/util/version/VersionUtilModule, getClass().getClassLoader());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final String get()
    {
        VersionUtilModule versionutilmodule = module;
        return VersionUtilModule.getVersionName((Application)application.get());
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(application);
    }

    public (VersionUtilModule versionutilmodule)
    {
        super("@com.google.android.apps.wallet.util.version.BindingAnnotations$VersionName()/java.lang.String", false, "com.google.android.apps.wallet.util.version.VersionUtilModule", "getVersionName");
        module = versionutilmodule;
        setLibrary(true);
    }
}
