// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.di.components;

import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import com.google.gson.Gson;
import com.pinterest.activity.contacts.InviterManager;
import com.pinterest.activity.contacts.InviterManager_Factory;
import com.pinterest.api.ApiCacheStore_Factory;
import com.pinterest.api.remote.ApiServices;
import com.pinterest.api.remote.ApiServices_Factory;
import com.pinterest.api.remote.ConfigurationApi_Factory;
import com.pinterest.api.remote.SendApi_Factory;
import com.pinterest.di.modules.ApiBaseModule_ProvideOkHttpClientFactory;
import com.pinterest.di.modules.ApiBaseModule_ProvideRetrofitFactory;
import com.pinterest.di.modules.ApiModule_ProvideCommerceApiServiceFactory;
import com.pinterest.di.modules.ApplicationModule_ProvideApplicationContextFactory;
import com.pinterest.di.modules.ApplicationModule_ProvidesApplicationFactory;
import com.pinterest.di.modules.ApplicationModule_ProvidesGsonFactory;
import com.pinterest.di.modules.ApplicationModule_ProvidesResourcesFactory;
import com.pinterest.di.modules.DeviceModule_ProvideClockFactory;
import com.pinterest.di.modules.DeviceModule_ProvidePreferencesManagerFactory;
import com.pinterest.network.api.CommerceApiService;
import dagger.internal.MembersInjectors;
import dagger.internal.ScopedProvider;
import javax.inject.Provider;

// Referenced classes of package com.pinterest.di.components:
//            ApplicationComponent

public final class DaggerApplicationComponent
    implements ApplicationComponent
{

    static final boolean a;
    private Provider b;
    private Provider c;
    private Provider d;
    private Provider e;
    private Provider f;
    private Provider g;
    private Provider h;
    private Provider i;
    private Provider j;
    private Provider k;
    private Provider l;
    private Provider m;
    private Provider n;
    private Provider o;

    private DaggerApplicationComponent(Builder builder)
    {
        if (!a && builder == null)
        {
            throw new AssertionError();
        } else
        {
            b = ScopedProvider.a(ApplicationModule_ProvideApplicationContextFactory.a(Builder.a(builder)));
            c = ScopedProvider.a(ApplicationModule_ProvidesApplicationFactory.a(Builder.a(builder)));
            d = ScopedProvider.a(ApiBaseModule_ProvideOkHttpClientFactory.a(Builder.b(builder)));
            e = ScopedProvider.a(ApiBaseModule_ProvideRetrofitFactory.a(Builder.b(builder), d));
            f = ScopedProvider.a(ApiModule_ProvideCommerceApiServiceFactory.a(Builder.c(builder), e));
            g = ScopedProvider.a(DeviceModule_ProvidePreferencesManagerFactory.a(Builder.d(builder)));
            h = ScopedProvider.a(ConfigurationApi_Factory.a(g));
            i = ScopedProvider.a(ApiCacheStore_Factory.a());
            j = ScopedProvider.a(SendApi_Factory.a(MembersInjectors.a(), i));
            k = ScopedProvider.a(ApiServices_Factory.a(h, j));
            l = ScopedProvider.a(DeviceModule_ProvideClockFactory.a(Builder.d(builder)));
            m = ScopedProvider.a(InviterManager_Factory.create(l, g));
            n = ScopedProvider.a(ApplicationModule_ProvidesGsonFactory.a(Builder.a(builder)));
            o = ScopedProvider.a(ApplicationModule_ProvidesResourcesFactory.a(Builder.a(builder)));
            return;
        }
    }

    DaggerApplicationComponent(Builder builder, byte byte0)
    {
        this(builder);
    }

    public static Builder a()
    {
        return new Builder((byte)0);
    }

    public final ApiServices apiServices()
    {
        return (ApiServices)k.get();
    }

    public final Application application()
    {
        return (Application)c.get();
    }

    public final CommerceApiService commerceApiService()
    {
        return (CommerceApiService)f.get();
    }

    public final Context context()
    {
        return (Context)b.get();
    }

    public final Gson gson()
    {
        return (Gson)n.get();
    }

    public final InviterManager inviterManager()
    {
        return (InviterManager)m.get();
    }

    public final Resources resources()
    {
        return (Resources)o.get();
    }

    static 
    {
        boolean flag;
        if (!com/pinterest/di/components/DaggerApplicationComponent.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }

    private class Builder
    {

        private ApplicationModule a;
        private ApiModule b;
        private DeviceModule c;
        private ApiBaseModule d;

        static ApplicationModule a(Builder builder)
        {
            return builder.a;
        }

        static ApiBaseModule b(Builder builder)
        {
            return builder.d;
        }

        static ApiModule c(Builder builder)
        {
            return builder.b;
        }

        static DeviceModule d(Builder builder)
        {
            return builder.c;
        }

        public final ApplicationComponent a()
        {
            if (a == null)
            {
                throw new IllegalStateException("applicationModule must be set");
            }
            if (b == null)
            {
                b = new ApiModule();
            }
            if (c == null)
            {
                c = new DeviceModule();
            }
            if (d == null)
            {
                d = new ApiBaseModule();
            }
            return new DaggerApplicationComponent(this, (byte)0);
        }

        public final Builder a(ApplicationModule applicationmodule)
        {
            a = applicationmodule;
            return this;
        }

        private Builder()
        {
        }

        Builder(byte byte0)
        {
            this();
        }
    }

}
