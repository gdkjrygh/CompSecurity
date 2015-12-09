// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.http;

import android.app.Application;
import com.squareup.okhttp.OkHttpClient;
import dagger.internal.Binding;
import dagger.internal.Linker;
import dagger.internal.ProvidesBinding;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.http:
//            HttpModule

public static final class setLibrary extends ProvidesBinding
    implements Provider
{

    private Binding application;
    private final HttpModule module;

    public final void attach(Linker linker)
    {
        application = linker.requestBinding("android.app.Application", com/google/android/apps/wallet/http/HttpModule, getClass().getClassLoader());
    }

    public final OkHttpClient get()
    {
        HttpModule httpmodule = module;
        return HttpModule.getOkHttpClient((Application)application.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(application);
    }

    public (HttpModule httpmodule)
    {
        super("com.squareup.okhttp.OkHttpClient", false, "com.google.android.apps.wallet.http.HttpModule", "getOkHttpClient");
        module = httpmodule;
        setLibrary(true);
    }
}
