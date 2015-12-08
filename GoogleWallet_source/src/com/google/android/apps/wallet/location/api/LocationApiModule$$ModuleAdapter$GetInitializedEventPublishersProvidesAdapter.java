// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.location.api;

import com.google.android.apps.wallet.eventbus.InitializedEventPublisher;
import dagger.internal.Binding;
import dagger.internal.Linker;
import dagger.internal.ProvidesBinding;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.location.api:
//            LocationApiModule, GoogleLocationSettingHelper

public static final class setLibrary extends ProvidesBinding
    implements Provider
{

    private Binding helper;
    private final LocationApiModule module;

    public final void attach(Linker linker)
    {
        helper = linker.requestBinding("com.google.android.apps.wallet.location.api.GoogleLocationSettingHelper", com/google/android/apps/wallet/location/api/LocationApiModule, getClass().getClassLoader());
    }

    public final InitializedEventPublisher get()
    {
        LocationApiModule locationapimodule = module;
        return LocationApiModule.getInitializedEventPublishers((GoogleLocationSettingHelper)helper.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(helper);
    }

    public (LocationApiModule locationapimodule)
    {
        super("com.google.android.apps.wallet.eventbus.InitializedEventPublisher", false, "com.google.android.apps.wallet.location.api.LocationApiModule", "getInitializedEventPublishers");
        module = locationapimodule;
        setLibrary(true);
    }
}
