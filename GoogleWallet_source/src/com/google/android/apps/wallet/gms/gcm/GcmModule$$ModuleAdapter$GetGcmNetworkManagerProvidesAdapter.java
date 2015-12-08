// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.gms.gcm;

import android.app.Application;
import com.google.android.gms.gcm.GcmNetworkManager;
import dagger.internal.Binding;
import dagger.internal.Linker;
import dagger.internal.ProvidesBinding;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.gms.gcm:
//            GcmModule

public static final class setLibrary extends ProvidesBinding
    implements Provider
{

    private Binding application;
    private final GcmModule module;

    public final void attach(Linker linker)
    {
        application = linker.requestBinding("android.app.Application", com/google/android/apps/wallet/gms/gcm/GcmModule, getClass().getClassLoader());
    }

    public final GcmNetworkManager get()
    {
        GcmModule gcmmodule = module;
        return GcmModule.getGcmNetworkManager((Application)application.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(application);
    }

    public i(GcmModule gcmmodule)
    {
        super("com.google.android.gms.gcm.GcmNetworkManager", false, "com.google.android.apps.wallet.gms.gcm.GcmModule", "getGcmNetworkManager");
        module = gcmmodule;
        setLibrary(true);
    }
}
