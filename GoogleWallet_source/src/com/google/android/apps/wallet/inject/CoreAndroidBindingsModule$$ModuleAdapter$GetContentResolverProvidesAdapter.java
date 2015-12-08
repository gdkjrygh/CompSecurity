// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.inject;

import android.app.Application;
import android.content.ContentResolver;
import dagger.internal.Binding;
import dagger.internal.Linker;
import dagger.internal.ProvidesBinding;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.inject:
//            CoreAndroidBindingsModule

public static final class setLibrary extends ProvidesBinding
    implements Provider
{

    private Binding application;
    private final CoreAndroidBindingsModule module;

    public final void attach(Linker linker)
    {
        application = linker.requestBinding("android.app.Application", com/google/android/apps/wallet/inject/CoreAndroidBindingsModule, getClass().getClassLoader());
    }

    public final ContentResolver get()
    {
        CoreAndroidBindingsModule coreandroidbindingsmodule = module;
        return CoreAndroidBindingsModule.getContentResolver((Application)application.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(application);
    }

    public (CoreAndroidBindingsModule coreandroidbindingsmodule)
    {
        super("android.content.ContentResolver", false, "com.google.android.apps.wallet.inject.CoreAndroidBindingsModule", "getContentResolver");
        module = coreandroidbindingsmodule;
        setLibrary(true);
    }
}
