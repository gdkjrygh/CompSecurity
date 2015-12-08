// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra;

import air.com.nbcuni.com.nbcsports.liveextra.MainSupportWrapperActivity;
import air.com.nbcuni.com.nbcsports.liveextra.MainSupportWrapperActivity_MembersInjector;
import android.app.Application;
import android.content.SharedPreferences;
import com.google.gson.Gson;
import com.nbcsports.liveextra.content.ContentService;
import com.nbcsports.liveextra.content.ContentService_Factory;
import com.nbcsports.liveextra.content.FavoriteService;
import com.nbcsports.liveextra.content.FavoriteService_Factory;
import com.nbcsports.liveextra.core.CustomRxExecutionHook_Factory;
import com.nbcsports.liveextra.core.CustomRxJavaErrorHandler_Factory;
import com.nbcsports.liveextra.library.configuration.Configuration;
import com.nbcsports.liveextra.library.configuration.ConfigurationModule;
import com.nbcsports.liveextra.library.configuration.ConfigurationModule_ConfigurationFactory;
import com.nbcsports.liveextra.library.configuration.ConfigurationPollingSubscriber_Factory;
import com.nbcsports.liveextra.library.configuration.ConfigurationProvider;
import com.nbcsports.liveextra.library.configuration.ConfigurationProvider_Factory;
import com.nbcsports.liveextra.library.configuration.RuntimeConfiguration_Factory;
import com.nbcsports.liveextra.library.core.DataModule;
import com.nbcsports.liveextra.library.core.DataModule_AnvatoFactory;
import com.nbcsports.liveextra.library.core.DataModule_AnvatoGsonFactory;
import com.nbcsports.liveextra.library.core.DataModule_GsonFactory;
import com.nbcsports.liveextra.library.core.DataModule_OkHttpClientFactory;
import com.nbcsports.liveextra.library.preferences.AppPreferences;
import com.nbcsports.liveextra.library.preferences.AppPreferences_Factory;
import com.nbcsports.liveextra.library.preferences.PreferencesModule;
import com.nbcsports.liveextra.library.preferences.PreferencesModule_PreferencesFactory;
import com.nbcsports.liveextra.library.tve.Anvato_Factory;
import com.nbcsports.liveextra.library.tve.AuthModule;
import com.nbcsports.liveextra.library.tve.AuthModule_AccessEnablerFactory;
import com.nbcsports.liveextra.library.tve.AuthService;
import com.nbcsports.liveextra.library.tve.AuthService_Factory;
import com.nbcsports.liveextra.library.tve.MvpdLookups;
import com.nbcsports.liveextra.library.tve.MvpdLookups_Factory;
import com.nbcsports.liveextra.ui.core.CaptionStyle;
import com.nbcsports.liveextra.ui.core.CaptionStyle_Factory;
import com.nbcsports.liveextra.urbanairship.AirTrafficController_Factory;
import com.phunware.nbc.sochi.FAQActivity;
import com.phunware.nbc.sochi.FAQActivity_MembersInjector;
import com.phunware.nbc.sochi.NBCSportsApplication;
import com.phunware.nbc.sochi.NBCSportsApplication_MembersInjector;
import com.phunware.nbc.sochi.caption.caption.CaptionPreviewHelper;
import com.phunware.nbc.sochi.caption.caption.CaptionPreviewHelper_Factory;
import com.phunware.nbc.sochi.metrics.TrackingHelper;
import com.phunware.nbc.sochi.metrics.TrackingHelper_Factory;
import com.phunware.nbc.sochi.services.FavoriteReminderService;
import com.phunware.nbc.sochi.services.FavoriteReminderService_MembersInjector;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.picasso.Picasso;
import dagger.MembersInjector;
import dagger.internal.MembersInjectors;
import dagger.internal.ScopedProvider;
import javax.inject.Provider;

// Referenced classes of package com.nbcsports.liveextra:
//            ApplicationComponent, ApplicationModule_ContextFactory, ApplicationModule_ConfigurationUrlFactory, ApplicationModule_ApplicationFactory, 
//            ApplicationModule_PicassoFactory, ApplicationModule

public final class DaggerApplicationComponent
    implements ApplicationComponent
{
    public static final class Builder
    {

        private ApplicationModule applicationModule;
        private AuthModule authModule;
        private ConfigurationModule configurationModule;
        private DataModule dataModule;
        private PreferencesModule preferencesModule;

        public Builder applicationModule(ApplicationModule applicationmodule)
        {
            if (applicationmodule == null)
            {
                throw new NullPointerException("applicationModule");
            } else
            {
                applicationModule = applicationmodule;
                return this;
            }
        }

        public Builder authModule(AuthModule authmodule)
        {
            if (authmodule == null)
            {
                throw new NullPointerException("authModule");
            } else
            {
                authModule = authmodule;
                return this;
            }
        }

        public ApplicationComponent build()
        {
            if (applicationModule == null)
            {
                throw new IllegalStateException("applicationModule must be set");
            }
            if (configurationModule == null)
            {
                configurationModule = new ConfigurationModule();
            }
            if (preferencesModule == null)
            {
                preferencesModule = new PreferencesModule();
            }
            if (dataModule == null)
            {
                dataModule = new DataModule();
            }
            if (authModule == null)
            {
                authModule = new AuthModule();
            }
            return new DaggerApplicationComponent(this);
        }

        public Builder configurationModule(ConfigurationModule configurationmodule)
        {
            if (configurationmodule == null)
            {
                throw new NullPointerException("configurationModule");
            } else
            {
                configurationModule = configurationmodule;
                return this;
            }
        }

        public Builder dataModule(DataModule datamodule)
        {
            if (datamodule == null)
            {
                throw new NullPointerException("dataModule");
            } else
            {
                dataModule = datamodule;
                return this;
            }
        }

        public Builder preferencesModule(PreferencesModule preferencesmodule)
        {
            if (preferencesmodule == null)
            {
                throw new NullPointerException("preferencesModule");
            } else
            {
                preferencesModule = preferencesmodule;
                return this;
            }
        }






        private Builder()
        {
        }

    }


    static final boolean $assertionsDisabled;
    private Provider accessEnablerProvider;
    private Provider airTrafficControllerProvider;
    private Provider anvatoGsonProvider;
    private Provider anvatoProvider;
    private Provider anvatoProvider1;
    private Provider appPreferencesProvider;
    private Provider applicationProvider;
    private Provider authServiceProvider;
    private Provider captionPreviewHelperProvider;
    private Provider captionStyleProvider;
    private Provider configurationPollingSubscriberProvider;
    private Provider configurationProvider;
    private Provider configurationProvider1;
    private Provider configurationUrlProvider;
    private Provider contentServiceProvider;
    private Provider contextProvider;
    private Provider customRxExecutionHookProvider;
    private Provider customRxJavaErrorHandlerProvider;
    private MembersInjector fAQActivityMembersInjector;
    private MembersInjector favoriteReminderServiceMembersInjector;
    private Provider favoriteServiceProvider;
    private Provider gsonProvider;
    private MembersInjector mainSupportWrapperActivityMembersInjector;
    private Provider mvpdLookupsProvider;
    private MembersInjector nBCSportsApplicationMembersInjector;
    private Provider okHttpClientProvider;
    private Provider picassoProvider;
    private Provider preferencesProvider;
    private Provider runtimeConfigurationProvider;
    private Provider trackingHelperProvider;

    private DaggerApplicationComponent(Builder builder1)
    {
        if (!$assertionsDisabled && builder1 == null)
        {
            throw new AssertionError();
        } else
        {
            initialize(builder1);
            return;
        }
    }


    public static Builder builder()
    {
        return new Builder();
    }

    private void initialize(Builder builder1)
    {
        contextProvider = ScopedProvider.create(ApplicationModule_ContextFactory.create(builder1.applicationModule));
        okHttpClientProvider = ScopedProvider.create(DataModule_OkHttpClientFactory.create(builder1.dataModule, contextProvider));
        gsonProvider = ScopedProvider.create(DataModule_GsonFactory.create(builder1.dataModule));
        configurationPollingSubscriberProvider = ScopedProvider.create(ConfigurationPollingSubscriber_Factory.create(MembersInjectors.noOp(), okHttpClientProvider, gsonProvider));
        configurationUrlProvider = ApplicationModule_ConfigurationUrlFactory.create(builder1.applicationModule);
        configurationProvider = ScopedProvider.create(ConfigurationProvider_Factory.create(configurationPollingSubscriberProvider, configurationUrlProvider));
        runtimeConfigurationProvider = ScopedProvider.create(RuntimeConfiguration_Factory.create(configurationProvider));
        applicationProvider = ScopedProvider.create(ApplicationModule_ApplicationFactory.create(builder1.applicationModule));
        preferencesProvider = ScopedProvider.create(PreferencesModule_PreferencesFactory.create(builder1.preferencesModule, contextProvider));
        airTrafficControllerProvider = ScopedProvider.create(AirTrafficController_Factory.create(applicationProvider, preferencesProvider));
        trackingHelperProvider = ScopedProvider.create(TrackingHelper_Factory.create(MembersInjectors.noOp(), applicationProvider));
        customRxJavaErrorHandlerProvider = ScopedProvider.create(CustomRxJavaErrorHandler_Factory.create(MembersInjectors.noOp()));
        customRxExecutionHookProvider = ScopedProvider.create(CustomRxExecutionHook_Factory.create(MembersInjectors.noOp()));
        nBCSportsApplicationMembersInjector = NBCSportsApplication_MembersInjector.create(MembersInjectors.noOp(), configurationProvider, runtimeConfigurationProvider, airTrafficControllerProvider, preferencesProvider, trackingHelperProvider, customRxJavaErrorHandlerProvider, customRxExecutionHookProvider);
        mvpdLookupsProvider = ScopedProvider.create(MvpdLookups_Factory.create(configurationProvider, okHttpClientProvider));
        mainSupportWrapperActivityMembersInjector = MainSupportWrapperActivity_MembersInjector.create(MembersInjectors.noOp(), trackingHelperProvider, mvpdLookupsProvider, runtimeConfigurationProvider, okHttpClientProvider);
        fAQActivityMembersInjector = FAQActivity_MembersInjector.create(MembersInjectors.noOp(), trackingHelperProvider);
        favoriteServiceProvider = ScopedProvider.create(FavoriteService_Factory.create());
        favoriteReminderServiceMembersInjector = FavoriteReminderService_MembersInjector.create(MembersInjectors.noOp(), favoriteServiceProvider);
        accessEnablerProvider = ScopedProvider.create(AuthModule_AccessEnablerFactory.create(builder1.authModule, applicationProvider));
        authServiceProvider = ScopedProvider.create(AuthService_Factory.create(accessEnablerProvider, runtimeConfigurationProvider, trackingHelperProvider, mvpdLookupsProvider, okHttpClientProvider, applicationProvider, preferencesProvider));
        configurationProvider1 = ConfigurationModule_ConfigurationFactory.create(builder1.configurationModule, runtimeConfigurationProvider);
        picassoProvider = ScopedProvider.create(ApplicationModule_PicassoFactory.create(builder1.applicationModule));
        appPreferencesProvider = ScopedProvider.create(AppPreferences_Factory.create(preferencesProvider));
        contentServiceProvider = ScopedProvider.create(ContentService_Factory.create(MembersInjectors.noOp(), configurationProvider1, okHttpClientProvider, gsonProvider, contextProvider));
        captionStyleProvider = ScopedProvider.create(CaptionStyle_Factory.create(MembersInjectors.noOp(), applicationProvider, preferencesProvider));
        captionPreviewHelperProvider = CaptionPreviewHelper_Factory.create(configurationProvider1);
        anvatoGsonProvider = ScopedProvider.create(DataModule_AnvatoGsonFactory.create(builder1.dataModule));
        anvatoProvider = Anvato_Factory.create(anvatoGsonProvider, okHttpClientProvider);
        anvatoProvider1 = ScopedProvider.create(DataModule_AnvatoFactory.create(builder1.dataModule, anvatoProvider));
    }

    public com.nbcsports.liveextra.library.tve.Anvato.API anvato()
    {
        return (com.nbcsports.liveextra.library.tve.Anvato.API)anvatoProvider1.get();
    }

    public Gson anvatoGson()
    {
        return (Gson)anvatoGsonProvider.get();
    }

    public AppPreferences appPreferences()
    {
        return (AppPreferences)appPreferencesProvider.get();
    }

    public Application application()
    {
        return (Application)applicationProvider.get();
    }

    public CaptionPreviewHelper captionPreviewHelper()
    {
        return (CaptionPreviewHelper)captionPreviewHelperProvider.get();
    }

    public CaptionStyle captionStyle()
    {
        return (CaptionStyle)captionStyleProvider.get();
    }

    public Configuration configuration()
    {
        return (Configuration)configurationProvider1.get();
    }

    public ConfigurationProvider configurationProvider()
    {
        return (ConfigurationProvider)configurationProvider.get();
    }

    public ContentService contentService()
    {
        return (ContentService)contentServiceProvider.get();
    }

    public AuthService entitlementService()
    {
        return (AuthService)authServiceProvider.get();
    }

    public FavoriteService favorites()
    {
        return (FavoriteService)favoriteServiceProvider.get();
    }

    public Gson gson()
    {
        return (Gson)gsonProvider.get();
    }

    public void inject(MainSupportWrapperActivity mainsupportwrapperactivity)
    {
        mainSupportWrapperActivityMembersInjector.injectMembers(mainsupportwrapperactivity);
    }

    public void inject(FAQActivity faqactivity)
    {
        fAQActivityMembersInjector.injectMembers(faqactivity);
    }

    public void inject(NBCSportsApplication nbcsportsapplication)
    {
        nBCSportsApplicationMembersInjector.injectMembers(nbcsportsapplication);
    }

    public void inject(FavoriteReminderService favoritereminderservice)
    {
        favoriteReminderServiceMembersInjector.injectMembers(favoritereminderservice);
    }

    public MvpdLookups lookups()
    {
        return (MvpdLookups)mvpdLookupsProvider.get();
    }

    public OkHttpClient okHttpClient()
    {
        return (OkHttpClient)okHttpClientProvider.get();
    }

    public Picasso picasso()
    {
        return (Picasso)picassoProvider.get();
    }

    public SharedPreferences preferences()
    {
        return (SharedPreferences)preferencesProvider.get();
    }

    public TrackingHelper trackingHelper()
    {
        return (TrackingHelper)trackingHelperProvider.get();
    }

    static 
    {
        boolean flag;
        if (!com/nbcsports/liveextra/DaggerApplicationComponent.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
