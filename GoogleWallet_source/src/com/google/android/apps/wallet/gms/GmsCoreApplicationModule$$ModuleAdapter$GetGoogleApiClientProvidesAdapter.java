// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.gms;

import android.app.Application;
import com.google.android.gms.common.api.GoogleApiClient;
import dagger.internal.Binding;
import dagger.internal.Linker;
import dagger.internal.ProvidesBinding;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.gms:
//            GmsCoreApplicationModule

public static final class setLibrary extends ProvidesBinding
    implements Provider
{

    private Binding application;
    private final GmsCoreApplicationModule module;

    public final void attach(Linker linker)
    {
        application = linker.requestBinding("android.app.Application", com/google/android/apps/wallet/gms/GmsCoreApplicationModule, getClass().getClassLoader());
    }

    public final GoogleApiClient get()
    {
        GmsCoreApplicationModule gmscoreapplicationmodule = module;
        return GmsCoreApplicationModule.getGoogleApiClient((Application)application.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(application);
    }

    public (GmsCoreApplicationModule gmscoreapplicationmodule)
    {
        super("@com.google.android.apps.wallet.gms.BindingAnnotations$PeopleClient()/com.google.android.gms.common.api.GoogleApiClient", false, "com.google.android.apps.wallet.gms.GmsCoreApplicationModule", "getGoogleApiClient");
        module = gmscoreapplicationmodule;
        setLibrary(true);
    }
}
