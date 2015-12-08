// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.api;

import android.app.Application;
import android.content.pm.PackageManager;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.api:
//            UriRegistry

public final class  extends Binding
    implements Provider
{

    private Binding application;
    private Binding packageManager;

    public final void attach(Linker linker)
    {
        packageManager = linker.requestBinding("android.content.pm.PackageManager", com/google/android/apps/wallet/api/UriRegistry, getClass().getClassLoader());
        application = linker.requestBinding("android.app.Application", com/google/android/apps/wallet/api/UriRegistry, getClass().getClassLoader());
    }

    public final UriRegistry get()
    {
        return new UriRegistry((PackageManager)packageManager.get(), (Application)application.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(packageManager);
        set.add(application);
    }

    public ()
    {
        super("com.google.android.apps.wallet.api.UriRegistry", "members/com.google.android.apps.wallet.api.UriRegistry", true, com/google/android/apps/wallet/api/UriRegistry);
    }
}
