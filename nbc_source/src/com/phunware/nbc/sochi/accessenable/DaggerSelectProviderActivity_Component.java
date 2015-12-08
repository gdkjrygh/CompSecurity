// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.phunware.nbc.sochi.accessenable;

import com.nbcsports.liveextra.ApplicationComponent;
import com.nbcsports.liveextra.ads.AdManager_Factory;
import com.nbcsports.liveextra.library.configuration.Configuration;
import com.nbcsports.liveextra.library.tve.AuthService;
import com.nbcsports.liveextra.library.tve.MvpdLookups;
import com.nbcsports.liveextra.ui.core.BaseFragment_MembersInjector;
import com.phunware.nbc.sochi.metrics.TrackingHelper;
import com.squareup.picasso.Picasso;
import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import dagger.internal.ScopedProvider;
import javax.inject.Provider;

// Referenced classes of package com.phunware.nbc.sochi.accessenable:
//            SelectProviderActivity_MembersInjector, SelectProviderFragment_MembersInjector, ProviderDialogFragment_MembersInjector, SelectProviderActivity, 
//            ProviderDialogFragment, SelectProviderFragment

public final class DaggerSelectProviderActivity_Component
    implements SelectProviderActivity.Component
{
    public static final class Builder
    {

        private ApplicationComponent applicationComponent;
        private SelectProviderActivity.Module module;

        public Builder applicationComponent(ApplicationComponent applicationcomponent)
        {
            if (applicationcomponent == null)
            {
                throw new NullPointerException("applicationComponent");
            } else
            {
                applicationComponent = applicationcomponent;
                return this;
            }
        }

        public SelectProviderActivity.Component build()
        {
            if (module == null)
            {
                throw new IllegalStateException("module must be set");
            }
            if (applicationComponent == null)
            {
                throw new IllegalStateException("applicationComponent must be set");
            } else
            {
                return new DaggerSelectProviderActivity_Component(this);
            }
        }

        public Builder module(SelectProviderActivity.Module module1)
        {
            if (module1 == null)
            {
                throw new NullPointerException("module");
            } else
            {
                module = module1;
                return this;
            }
        }



        private Builder()
        {
        }

    }


    static final boolean $assertionsDisabled;
    private Provider activityProvider;
    private MembersInjector baseFragmentMembersInjector;
    private Provider configurationProvider;
    private Provider entitlementServiceProvider;
    private Provider lookupsProvider;
    private Provider picassoProvider;
    private MembersInjector providerDialogFragmentMembersInjector;
    private MembersInjector selectProviderActivityMembersInjector;
    private MembersInjector selectProviderFragmentMembersInjector;
    private Provider trackingHelperProvider;

    private DaggerSelectProviderActivity_Component(Builder builder1)
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

    private void initialize(final Builder builder)
    {
        entitlementServiceProvider = new Factory() {

            private final ApplicationComponent applicationComponent;
            final DaggerSelectProviderActivity_Component this$0;
            final Builder val$builder;

            public AuthService get()
            {
                AuthService authservice = applicationComponent.entitlementService();
                if (authservice == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return authservice;
                }
            }

            public volatile Object get()
            {
                return get();
            }

            
            {
                this$0 = DaggerSelectProviderActivity_Component.this;
                builder = builder1;
                super();
                applicationComponent = builder.applicationComponent;
            }
        };
        trackingHelperProvider = new Factory() {

            private final ApplicationComponent applicationComponent;
            final DaggerSelectProviderActivity_Component this$0;
            final Builder val$builder;

            public TrackingHelper get()
            {
                TrackingHelper trackinghelper = applicationComponent.trackingHelper();
                if (trackinghelper == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return trackinghelper;
                }
            }

            public volatile Object get()
            {
                return get();
            }

            
            {
                this$0 = DaggerSelectProviderActivity_Component.this;
                builder = builder1;
                super();
                applicationComponent = builder.applicationComponent;
            }
        };
        selectProviderActivityMembersInjector = SelectProviderActivity_MembersInjector.create(MembersInjectors.noOp(), entitlementServiceProvider, trackingHelperProvider);
        picassoProvider = new Factory() {

            private final ApplicationComponent applicationComponent;
            final DaggerSelectProviderActivity_Component this$0;
            final Builder val$builder;

            public Picasso get()
            {
                Picasso picasso = applicationComponent.picasso();
                if (picasso == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return picasso;
                }
            }

            public volatile Object get()
            {
                return get();
            }

            
            {
                this$0 = DaggerSelectProviderActivity_Component.this;
                builder = builder1;
                super();
                applicationComponent = builder.applicationComponent;
            }
        };
        baseFragmentMembersInjector = BaseFragment_MembersInjector.create(MembersInjectors.noOp(), entitlementServiceProvider, picassoProvider, AdManager_Factory.create());
        lookupsProvider = new Factory() {

            private final ApplicationComponent applicationComponent;
            final DaggerSelectProviderActivity_Component this$0;
            final Builder val$builder;

            public MvpdLookups get()
            {
                MvpdLookups mvpdlookups = applicationComponent.lookups();
                if (mvpdlookups == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return mvpdlookups;
                }
            }

            public volatile Object get()
            {
                return get();
            }

            
            {
                this$0 = DaggerSelectProviderActivity_Component.this;
                builder = builder1;
                super();
                applicationComponent = builder.applicationComponent;
            }
        };
        configurationProvider = new Factory() {

            private final ApplicationComponent applicationComponent;
            final DaggerSelectProviderActivity_Component this$0;
            final Builder val$builder;

            public Configuration get()
            {
                Configuration configuration = applicationComponent.configuration();
                if (configuration == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return configuration;
                }
            }

            public volatile Object get()
            {
                return get();
            }

            
            {
                this$0 = DaggerSelectProviderActivity_Component.this;
                builder = builder1;
                super();
                applicationComponent = builder.applicationComponent;
            }
        };
        selectProviderFragmentMembersInjector = SelectProviderFragment_MembersInjector.create(baseFragmentMembersInjector, lookupsProvider, configurationProvider, entitlementServiceProvider);
        providerDialogFragmentMembersInjector = ProviderDialogFragment_MembersInjector.create(MembersInjectors.noOp(), configurationProvider, entitlementServiceProvider, picassoProvider, trackingHelperProvider);
        activityProvider = ScopedProvider.create(SelectProviderActivity.Module_ActivityFactory.create(builder.module));
    }

    public SelectProviderActivity activity()
    {
        return (SelectProviderActivity)activityProvider.get();
    }

    public void inject(ProviderDialogFragment providerdialogfragment)
    {
        providerDialogFragmentMembersInjector.injectMembers(providerdialogfragment);
    }

    public void inject(SelectProviderActivity selectprovideractivity)
    {
        selectProviderActivityMembersInjector.injectMembers(selectprovideractivity);
    }

    public void inject(SelectProviderFragment selectproviderfragment)
    {
        selectProviderFragmentMembersInjector.injectMembers(selectproviderfragment);
    }

    static 
    {
        boolean flag;
        if (!com/phunware/nbc/sochi/accessenable/DaggerSelectProviderActivity_Component.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
