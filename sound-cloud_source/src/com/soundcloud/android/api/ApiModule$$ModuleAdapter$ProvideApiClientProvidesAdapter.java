// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.api;

import com.soundcloud.android.accounts.AccountOperations;
import com.soundcloud.android.ads.AdIdHelper;
import com.soundcloud.android.api.json.JsonTransformer;
import com.soundcloud.android.api.oauth.OAuth;
import com.soundcloud.android.utils.DeviceHelper;
import dagger.a.b;
import dagger.a.l;
import dagger.a.t;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.api:
//            ApiModule, ApiUrlBuilder, UnauthorisedRequestRegistry, ApiClient

public static final class setLibrary extends t
    implements Provider
{

    private b accountOperations;
    private b adIdHelper;
    private b deviceHelper;
    private b httpClient;
    private b jsonTransformer;
    private final ApiModule module;
    private b oAuth;
    private b unauthorisedRequestRegistry;
    private b urlBuilder;

    public final void attach(l l1)
    {
        httpClient = l1.a("com.squareup.okhttp.OkHttpClient", com/soundcloud/android/api/ApiModule, getClass().getClassLoader());
        urlBuilder = l1.a("com.soundcloud.android.api.ApiUrlBuilder", com/soundcloud/android/api/ApiModule, getClass().getClassLoader());
        jsonTransformer = l1.a("com.soundcloud.android.api.json.JsonTransformer", com/soundcloud/android/api/ApiModule, getClass().getClassLoader());
        deviceHelper = l1.a("com.soundcloud.android.utils.DeviceHelper", com/soundcloud/android/api/ApiModule, getClass().getClassLoader());
        adIdHelper = l1.a("com.soundcloud.android.ads.AdIdHelper", com/soundcloud/android/api/ApiModule, getClass().getClassLoader());
        oAuth = l1.a("com.soundcloud.android.api.oauth.OAuth", com/soundcloud/android/api/ApiModule, getClass().getClassLoader());
        unauthorisedRequestRegistry = l1.a("com.soundcloud.android.api.UnauthorisedRequestRegistry", com/soundcloud/android/api/ApiModule, getClass().getClassLoader());
        accountOperations = l1.a("com.soundcloud.android.accounts.AccountOperations", com/soundcloud/android/api/ApiModule, getClass().getClassLoader());
    }

    public final ApiClient get()
    {
        return module.provideApiClient((com.c.a.t)httpClient.get(), (ApiUrlBuilder)urlBuilder.get(), (JsonTransformer)jsonTransformer.get(), (DeviceHelper)deviceHelper.get(), (AdIdHelper)adIdHelper.get(), (OAuth)oAuth.get(), (UnauthorisedRequestRegistry)unauthorisedRequestRegistry.get(), (AccountOperations)accountOperations.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(httpClient);
        set.add(urlBuilder);
        set.add(jsonTransformer);
        set.add(deviceHelper);
        set.add(adIdHelper);
        set.add(oAuth);
        set.add(unauthorisedRequestRegistry);
        set.add(accountOperations);
    }

    public Y(ApiModule apimodule)
    {
        super("com.soundcloud.android.api.ApiClient", false, "com.soundcloud.android.api.ApiModule", "provideApiClient");
        module = apimodule;
        setLibrary(true);
    }
}
