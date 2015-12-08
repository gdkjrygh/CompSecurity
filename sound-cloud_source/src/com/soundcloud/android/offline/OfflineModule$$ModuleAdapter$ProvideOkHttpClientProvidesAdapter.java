// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.offline;

import com.soundcloud.android.properties.ApplicationProperties;
import dagger.a.b;
import dagger.a.l;
import dagger.a.t;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.offline:
//            OfflineModule

public static final class setLibrary extends t
    implements Provider
{

    private b applicationProperties;
    private b defaultClient;
    private final OfflineModule module;

    public final void attach(l l1)
    {
        applicationProperties = l1.a("com.soundcloud.android.properties.ApplicationProperties", com/soundcloud/android/offline/OfflineModule, getClass().getClassLoader());
        defaultClient = l1.a("com.squareup.okhttp.OkHttpClient", com/soundcloud/android/offline/OfflineModule, getClass().getClassLoader());
    }

    public final com.c.a.t get()
    {
        return module.provideOkHttpClient((ApplicationProperties)applicationProperties.get(), (com.c.a.t)defaultClient.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(applicationProperties);
        set.add(defaultClient);
    }

    public (OfflineModule offlinemodule)
    {
        super("@javax.inject.Named(value=StrictSSLHttpClient)/com.squareup.okhttp.OkHttpClient", false, "com.soundcloud.android.offline.OfflineModule", "provideOkHttpClient");
        module = offlinemodule;
        setLibrary(false);
    }
}
