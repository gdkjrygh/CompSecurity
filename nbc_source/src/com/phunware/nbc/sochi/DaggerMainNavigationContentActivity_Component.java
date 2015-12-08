// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.phunware.nbc.sochi;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.gson.Gson;
import com.nbcsports.liveextra.ApplicationComponent;
import com.nbcsports.liveextra.ads.AdManager_Factory;
import com.nbcsports.liveextra.content.ContentService;
import com.nbcsports.liveextra.content.FavoriteService;
import com.nbcsports.liveextra.library.configuration.Configuration;
import com.nbcsports.liveextra.library.preferences.AppPreferences;
import com.nbcsports.liveextra.library.tve.AnvatoService_Factory;
import com.nbcsports.liveextra.library.tve.AuthService;
import com.nbcsports.liveextra.library.tve.BlackoutService_Factory;
import com.nbcsports.liveextra.library.tve.MvpdLookups;
import com.nbcsports.liveextra.library.tve.PlaybackDelegate;
import com.nbcsports.liveextra.library.tve.PlaybackDelegate_MembersInjector;
import com.nbcsports.liveextra.ui.core.BaseFragment_MembersInjector;
import com.nbcsports.liveextra.ui.main.core.AssetViewModelTransformer_Factory;
import com.nbcsports.liveextra.ui.main.core.ContentListView_MembersInjector;
import com.nbcsports.liveextra.ui.main.core.DefaultItemView;
import com.nbcsports.liveextra.ui.main.core.DefaultItemView_MembersInjector;
import com.nbcsports.liveextra.ui.main.core.HeaderViewHolder;
import com.nbcsports.liveextra.ui.main.core.HeaderViewHolder_MembersInjector;
import com.nbcsports.liveextra.ui.main.core.SectionSelector_Factory;
import com.nbcsports.liveextra.ui.main.favorites.FavoritesListPresenter_Factory;
import com.nbcsports.liveextra.ui.main.favorites.FavoritesListView;
import com.nbcsports.liveextra.ui.main.favorites.FavoritesListView_MembersInjector;
import com.nbcsports.liveextra.ui.main.highlights.HighlightsListPresenter_Factory;
import com.nbcsports.liveextra.ui.main.highlights.HighlightsListView;
import com.nbcsports.liveextra.ui.main.highlights.HighlightsListView_MembersInjector;
import com.nbcsports.liveextra.ui.main.home.HomeListPresenter_Factory;
import com.nbcsports.liveextra.ui.main.home.HomeListView;
import com.nbcsports.liveextra.ui.main.home.HomeListView_MembersInjector;
import com.nbcsports.liveextra.ui.main.replay.FullEventReplayListPresenter_Factory;
import com.nbcsports.liveextra.ui.main.replay.FullEventReplayListView;
import com.nbcsports.liveextra.ui.main.replay.FullEventReplayListView_MembersInjector;
import com.nbcsports.liveextra.ui.main.schedule.ScheduleListPresenter_Factory;
import com.nbcsports.liveextra.ui.main.schedule.ScheduleListView;
import com.nbcsports.liveextra.ui.main.schedule.ScheduleListView_MembersInjector;
import com.nbcsports.liveextra.ui.main.showcase.ShowcasePagerView;
import com.nbcsports.liveextra.ui.main.showcase.ShowcasePagerView_MembersInjector;
import com.nbcsports.liveextra.ui.main.showcase.ShowcasePresenter_Factory;
import com.nbcsports.liveextra.ui.tutorial.TutorialDialogFragment;
import com.nbcsports.liveextra.ui.tutorial.TutorialDialogFragment_MembersInjector;
import com.phunware.nbc.sochi.fragments.DetailActionDialogFragment;
import com.phunware.nbc.sochi.fragments.DetailActionDialogFragment_MembersInjector;
import com.phunware.nbc.sochi.fragments.EventReplayFragment;
import com.phunware.nbc.sochi.fragments.EventReplayFragment_MembersInjector;
import com.phunware.nbc.sochi.fragments.FavoritesFragment;
import com.phunware.nbc.sochi.fragments.FavoritesFragment_MembersInjector;
import com.phunware.nbc.sochi.fragments.HighlightsFragment;
import com.phunware.nbc.sochi.fragments.HighlightsFragment_MembersInjector;
import com.phunware.nbc.sochi.fragments.HomeFragment;
import com.phunware.nbc.sochi.fragments.HomeFragment_MembersInjector;
import com.phunware.nbc.sochi.fragments.PlayerActionDialogFragment;
import com.phunware.nbc.sochi.fragments.PlayerActionDialogFragment_MembersInjector;
import com.phunware.nbc.sochi.fragments.ScheduleFragment;
import com.phunware.nbc.sochi.fragments.ScheduleFragment_MembersInjector;
import com.phunware.nbc.sochi.fragments.ShowcaseFragment;
import com.phunware.nbc.sochi.fragments.ShowcaseFragment_MembersInjector;
import com.phunware.nbc.sochi.fragments.SochiApplicationSettingsFragment;
import com.phunware.nbc.sochi.fragments.SochiApplicationSettingsFragment_MembersInjector;
import com.phunware.nbc.sochi.fragments.SportFilterListFragment;
import com.phunware.nbc.sochi.fragments.SportFilterListFragment_MembersInjector;
import com.phunware.nbc.sochi.fragments.SportGridTabletFragment;
import com.phunware.nbc.sochi.fragments.SportGridTabletFragment_MembersInjector;
import com.phunware.nbc.sochi.metrics.TrackingHelper;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.picasso.Picasso;
import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import dagger.internal.ScopedProvider;
import javax.inject.Provider;

// Referenced classes of package com.phunware.nbc.sochi:
//            MainNavigationContentActivity_MembersInjector, MainNavigationContentActivity

public final class DaggerMainNavigationContentActivity_Component
    implements MainNavigationContentActivity.Component
{
    public static final class Builder
    {

        private ApplicationComponent applicationComponent;
        private MainNavigationContentActivity.Module module;

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

        public MainNavigationContentActivity.Component build()
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
                return new DaggerMainNavigationContentActivity_Component(this);
            }
        }

        public Builder module(MainNavigationContentActivity.Module module1)
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
    private Provider anvatoProvider;
    private Provider anvatoServiceProvider;
    private Provider appPreferencesProvider;
    private Provider assetViewModelTransformerProvider;
    private MembersInjector baseContentFragmentMembersInjector;
    private MembersInjector baseFragmentMembersInjector;
    private Provider blackoutServiceProvider;
    private Provider configurationProvider;
    private MembersInjector contentListViewMembersInjector;
    private Provider contentServiceProvider;
    private Provider contextProvider;
    private MembersInjector defaultItemViewMembersInjector;
    private MembersInjector detailActionDialogFragmentMembersInjector;
    private Provider entitlementServiceProvider;
    private MembersInjector eventReplayFragmentMembersInjector;
    private MembersInjector favoritesFragmentMembersInjector;
    private Provider favoritesListPresenterProvider;
    private MembersInjector favoritesListViewMembersInjector;
    private Provider favoritesProvider;
    private Provider fullEventReplayListPresenterProvider;
    private MembersInjector fullEventReplayListViewMembersInjector;
    private Provider gsonProvider;
    private MembersInjector headerViewHolderMembersInjector;
    private MembersInjector highlightsFragmentMembersInjector;
    private Provider highlightsListPresenterProvider;
    private MembersInjector highlightsListViewMembersInjector;
    private MembersInjector homeFragmentMembersInjector;
    private Provider homeListPresenterProvider;
    private MembersInjector homeListViewMembersInjector;
    private Provider lookupsProvider;
    private MembersInjector mainNavigationContentActivityMembersInjector;
    private Provider okHttpClientProvider;
    private Provider picassoProvider;
    private MembersInjector playbackDelegateMembersInjector;
    private MembersInjector playerActionDialogFragmentMembersInjector;
    private Provider preferencesProvider;
    private MembersInjector scheduleFragmentMembersInjector;
    private Provider scheduleListPresenterProvider;
    private MembersInjector scheduleListViewMembersInjector;
    private Provider sectionSelectorProvider;
    private MembersInjector showcaseFragmentMembersInjector;
    private MembersInjector showcasePagerViewMembersInjector;
    private Provider showcasePresenterProvider;
    private MembersInjector sochiApplicationSettingsFragmentMembersInjector;
    private MembersInjector sportFilterListFragmentMembersInjector;
    private MembersInjector sportGridTabletFragmentMembersInjector;
    private Provider sportProvider;
    private Provider trackingHelperProvider;
    private MembersInjector tutorialDialogFragmentMembersInjector;

    private DaggerMainNavigationContentActivity_Component(Builder builder1)
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
        configurationProvider = new Factory() {

            private final ApplicationComponent applicationComponent;
            final DaggerMainNavigationContentActivity_Component this$0;
            final Builder val$builder;

            public Configuration get()
            {
                Configuration configuration1 = applicationComponent.configuration();
                if (configuration1 == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return configuration1;
                }
            }

            public volatile Object get()
            {
                return get();
            }

            
            {
                this$0 = DaggerMainNavigationContentActivity_Component.this;
                builder = builder1;
                super();
                applicationComponent = builder.applicationComponent;
            }
        };
        contentServiceProvider = new Factory() {

            private final ApplicationComponent applicationComponent;
            final DaggerMainNavigationContentActivity_Component this$0;
            final Builder val$builder;

            public ContentService get()
            {
                ContentService contentservice = applicationComponent.contentService();
                if (contentservice == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return contentservice;
                }
            }

            public volatile Object get()
            {
                return get();
            }

            
            {
                this$0 = DaggerMainNavigationContentActivity_Component.this;
                builder = builder1;
                super();
                applicationComponent = builder.applicationComponent;
            }
        };
        contextProvider = ScopedProvider.create(MainNavigationContentActivity.Module_ContextFactory.create(builder.module));
        assetViewModelTransformerProvider = AssetViewModelTransformer_Factory.create(MembersInjectors.noOp(), contextProvider);
        sportProvider = MainNavigationContentActivity.Module_SportFactory.create(builder.module);
        showcasePresenterProvider = ScopedProvider.create(ShowcasePresenter_Factory.create(contentServiceProvider, assetViewModelTransformerProvider, sportProvider));
        showcasePagerViewMembersInjector = ShowcasePagerView_MembersInjector.create(MembersInjectors.noOp(), configurationProvider, showcasePresenterProvider);
        sectionSelectorProvider = ScopedProvider.create(SectionSelector_Factory.create(MembersInjectors.noOp(), contextProvider));
        trackingHelperProvider = new Factory() {

            private final ApplicationComponent applicationComponent;
            final DaggerMainNavigationContentActivity_Component this$0;
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
                this$0 = DaggerMainNavigationContentActivity_Component.this;
                builder = builder1;
                super();
                applicationComponent = builder.applicationComponent;
            }
        };
        entitlementServiceProvider = new Factory() {

            private final ApplicationComponent applicationComponent;
            final DaggerMainNavigationContentActivity_Component this$0;
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
                this$0 = DaggerMainNavigationContentActivity_Component.this;
                builder = builder1;
                super();
                applicationComponent = builder.applicationComponent;
            }
        };
        mainNavigationContentActivityMembersInjector = MainNavigationContentActivity_MembersInjector.create(MembersInjectors.noOp(), sectionSelectorProvider, configurationProvider, trackingHelperProvider, entitlementServiceProvider);
        favoritesProvider = new Factory() {

            private final ApplicationComponent applicationComponent;
            final DaggerMainNavigationContentActivity_Component this$0;
            final Builder val$builder;

            public FavoriteService get()
            {
                FavoriteService favoriteservice = applicationComponent.favorites();
                if (favoriteservice == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return favoriteservice;
                }
            }

            public volatile Object get()
            {
                return get();
            }

            
            {
                this$0 = DaggerMainNavigationContentActivity_Component.this;
                builder = builder1;
                super();
                applicationComponent = builder.applicationComponent;
            }
        };
        contentListViewMembersInjector = ContentListView_MembersInjector.create(MembersInjectors.noOp(), favoritesProvider);
        homeListPresenterProvider = ScopedProvider.create(HomeListPresenter_Factory.create(MembersInjectors.noOp(), contentServiceProvider, assetViewModelTransformerProvider, showcasePresenterProvider, sportProvider));
        homeListViewMembersInjector = HomeListView_MembersInjector.create(contentListViewMembersInjector, homeListPresenterProvider);
        highlightsListPresenterProvider = ScopedProvider.create(HighlightsListPresenter_Factory.create(MembersInjectors.noOp(), contentServiceProvider, assetViewModelTransformerProvider, sportProvider));
        highlightsListViewMembersInjector = HighlightsListView_MembersInjector.create(contentListViewMembersInjector, highlightsListPresenterProvider);
        fullEventReplayListPresenterProvider = ScopedProvider.create(FullEventReplayListPresenter_Factory.create(MembersInjectors.noOp(), contentServiceProvider, assetViewModelTransformerProvider, sportProvider));
        fullEventReplayListViewMembersInjector = FullEventReplayListView_MembersInjector.create(contentListViewMembersInjector, fullEventReplayListPresenterProvider);
        scheduleListPresenterProvider = ScopedProvider.create(ScheduleListPresenter_Factory.create(MembersInjectors.noOp(), contentServiceProvider, assetViewModelTransformerProvider, sportProvider));
        scheduleListViewMembersInjector = ScheduleListView_MembersInjector.create(contentListViewMembersInjector, scheduleListPresenterProvider);
        favoritesListPresenterProvider = ScopedProvider.create(FavoritesListPresenter_Factory.create(MembersInjectors.noOp(), contentServiceProvider, assetViewModelTransformerProvider, favoritesProvider));
        favoritesListViewMembersInjector = FavoritesListView_MembersInjector.create(contentListViewMembersInjector, favoritesListPresenterProvider);
        picassoProvider = new Factory() {

            private final ApplicationComponent applicationComponent;
            final DaggerMainNavigationContentActivity_Component this$0;
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
                this$0 = DaggerMainNavigationContentActivity_Component.this;
                builder = builder1;
                super();
                applicationComponent = builder.applicationComponent;
            }
        };
        baseFragmentMembersInjector = BaseFragment_MembersInjector.create(MembersInjectors.noOp(), entitlementServiceProvider, picassoProvider, AdManager_Factory.create());
        preferencesProvider = new Factory() {

            private final ApplicationComponent applicationComponent;
            final DaggerMainNavigationContentActivity_Component this$0;
            final Builder val$builder;

            public SharedPreferences get()
            {
                SharedPreferences sharedpreferences = applicationComponent.preferences();
                if (sharedpreferences == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return sharedpreferences;
                }
            }

            public volatile Object get()
            {
                return get();
            }

            
            {
                this$0 = DaggerMainNavigationContentActivity_Component.this;
                builder = builder1;
                super();
                applicationComponent = builder.applicationComponent;
            }
        };
        appPreferencesProvider = new Factory() {

            private final ApplicationComponent applicationComponent;
            final DaggerMainNavigationContentActivity_Component this$0;
            final Builder val$builder;

            public AppPreferences get()
            {
                AppPreferences apppreferences = applicationComponent.appPreferences();
                if (apppreferences == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return apppreferences;
                }
            }

            public volatile Object get()
            {
                return get();
            }

            
            {
                this$0 = DaggerMainNavigationContentActivity_Component.this;
                builder = builder1;
                super();
                applicationComponent = builder.applicationComponent;
            }
        };
        okHttpClientProvider = new Factory() {

            private final ApplicationComponent applicationComponent;
            final DaggerMainNavigationContentActivity_Component this$0;
            final Builder val$builder;

            public OkHttpClient get()
            {
                OkHttpClient okhttpclient = applicationComponent.okHttpClient();
                if (okhttpclient == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return okhttpclient;
                }
            }

            public volatile Object get()
            {
                return get();
            }

            
            {
                this$0 = DaggerMainNavigationContentActivity_Component.this;
                builder = builder1;
                super();
                applicationComponent = builder.applicationComponent;
            }
        };
        sochiApplicationSettingsFragmentMembersInjector = SochiApplicationSettingsFragment_MembersInjector.create(baseFragmentMembersInjector, entitlementServiceProvider, configurationProvider, preferencesProvider, appPreferencesProvider, okHttpClientProvider);
        detailActionDialogFragmentMembersInjector = DetailActionDialogFragment_MembersInjector.create(MembersInjectors.noOp(), entitlementServiceProvider, picassoProvider, favoritesProvider, configurationProvider);
        baseContentFragmentMembersInjector = MembersInjectors.delegatingTo(baseFragmentMembersInjector);
        eventReplayFragmentMembersInjector = EventReplayFragment_MembersInjector.create(baseContentFragmentMembersInjector, fullEventReplayListPresenterProvider);
        highlightsFragmentMembersInjector = HighlightsFragment_MembersInjector.create(baseContentFragmentMembersInjector, highlightsListPresenterProvider);
        homeFragmentMembersInjector = HomeFragment_MembersInjector.create(baseContentFragmentMembersInjector, homeListPresenterProvider);
        scheduleFragmentMembersInjector = ScheduleFragment_MembersInjector.create(baseContentFragmentMembersInjector, scheduleListPresenterProvider);
        favoritesFragmentMembersInjector = FavoritesFragment_MembersInjector.create(baseFragmentMembersInjector, favoritesListPresenterProvider, trackingHelperProvider);
        playerActionDialogFragmentMembersInjector = PlayerActionDialogFragment_MembersInjector.create(MembersInjectors.noOp(), entitlementServiceProvider);
        gsonProvider = new Factory() {

            private final ApplicationComponent applicationComponent;
            final DaggerMainNavigationContentActivity_Component this$0;
            final Builder val$builder;

            public Gson get()
            {
                Gson gson = applicationComponent.gson();
                if (gson == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return gson;
                }
            }

            public volatile Object get()
            {
                return get();
            }

            
            {
                this$0 = DaggerMainNavigationContentActivity_Component.this;
                builder = builder1;
                super();
                applicationComponent = builder.applicationComponent;
            }
        };
        blackoutServiceProvider = BlackoutService_Factory.create(MembersInjectors.noOp(), okHttpClientProvider, gsonProvider, contextProvider);
        anvatoProvider = new Factory() {

            private final ApplicationComponent applicationComponent;
            final DaggerMainNavigationContentActivity_Component this$0;
            final Builder val$builder;

            public com.nbcsports.liveextra.library.tve.Anvato.API get()
            {
                com.nbcsports.liveextra.library.tve.Anvato.API api = applicationComponent.anvato();
                if (api == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return api;
                }
            }

            public volatile Object get()
            {
                return get();
            }

            
            {
                this$0 = DaggerMainNavigationContentActivity_Component.this;
                builder = builder1;
                super();
                applicationComponent = builder.applicationComponent;
            }
        };
        anvatoServiceProvider = AnvatoService_Factory.create(MembersInjectors.noOp(), anvatoProvider, entitlementServiceProvider, contextProvider);
        lookupsProvider = new Factory() {

            private final ApplicationComponent applicationComponent;
            final DaggerMainNavigationContentActivity_Component this$0;
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
                this$0 = DaggerMainNavigationContentActivity_Component.this;
                builder = builder1;
                super();
                applicationComponent = builder.applicationComponent;
            }
        };
        playbackDelegateMembersInjector = PlaybackDelegate_MembersInjector.create(MembersInjectors.noOp(), configurationProvider, entitlementServiceProvider, blackoutServiceProvider, anvatoServiceProvider, lookupsProvider, trackingHelperProvider);
        showcaseFragmentMembersInjector = ShowcaseFragment_MembersInjector.create(baseFragmentMembersInjector, picassoProvider, configurationProvider);
        sportFilterListFragmentMembersInjector = SportFilterListFragment_MembersInjector.create(MembersInjectors.noOp(), configurationProvider);
        sportGridTabletFragmentMembersInjector = SportGridTabletFragment_MembersInjector.create(MembersInjectors.noOp(), picassoProvider, configurationProvider);
        defaultItemViewMembersInjector = DefaultItemView_MembersInjector.create(MembersInjectors.noOp(), picassoProvider, configurationProvider, favoritesProvider);
        tutorialDialogFragmentMembersInjector = TutorialDialogFragment_MembersInjector.create(MembersInjectors.noOp(), picassoProvider);
        headerViewHolderMembersInjector = HeaderViewHolder_MembersInjector.create(MembersInjectors.noOp(), picassoProvider);
        activityProvider = ScopedProvider.create(MainNavigationContentActivity.Module_ActivityFactory.create(builder.module));
    }

    public MainNavigationContentActivity activity()
    {
        return (MainNavigationContentActivity)activityProvider.get();
    }

    public Configuration configuration()
    {
        return (Configuration)configurationProvider.get();
    }

    public Context context()
    {
        return (Context)contextProvider.get();
    }

    public void inject(PlaybackDelegate playbackdelegate)
    {
        playbackDelegateMembersInjector.injectMembers(playbackdelegate);
    }

    public void inject(DefaultItemView defaultitemview)
    {
        defaultItemViewMembersInjector.injectMembers(defaultitemview);
    }

    public void inject(HeaderViewHolder headerviewholder)
    {
        headerViewHolderMembersInjector.injectMembers(headerviewholder);
    }

    public void inject(FavoritesListView favoriteslistview)
    {
        favoritesListViewMembersInjector.injectMembers(favoriteslistview);
    }

    public void inject(HighlightsListView highlightslistview)
    {
        highlightsListViewMembersInjector.injectMembers(highlightslistview);
    }

    public void inject(HomeListView homelistview)
    {
        homeListViewMembersInjector.injectMembers(homelistview);
    }

    public void inject(FullEventReplayListView fulleventreplaylistview)
    {
        fullEventReplayListViewMembersInjector.injectMembers(fulleventreplaylistview);
    }

    public void inject(ScheduleListView schedulelistview)
    {
        scheduleListViewMembersInjector.injectMembers(schedulelistview);
    }

    public void inject(ShowcasePagerView showcasepagerview)
    {
        showcasePagerViewMembersInjector.injectMembers(showcasepagerview);
    }

    public void inject(TutorialDialogFragment tutorialdialogfragment)
    {
        tutorialDialogFragmentMembersInjector.injectMembers(tutorialdialogfragment);
    }

    public void inject(MainNavigationContentActivity mainnavigationcontentactivity)
    {
        mainNavigationContentActivityMembersInjector.injectMembers(mainnavigationcontentactivity);
    }

    public void inject(DetailActionDialogFragment detailactiondialogfragment)
    {
        detailActionDialogFragmentMembersInjector.injectMembers(detailactiondialogfragment);
    }

    public void inject(EventReplayFragment eventreplayfragment)
    {
        eventReplayFragmentMembersInjector.injectMembers(eventreplayfragment);
    }

    public void inject(FavoritesFragment favoritesfragment)
    {
        favoritesFragmentMembersInjector.injectMembers(favoritesfragment);
    }

    public void inject(HighlightsFragment highlightsfragment)
    {
        highlightsFragmentMembersInjector.injectMembers(highlightsfragment);
    }

    public void inject(HomeFragment homefragment)
    {
        homeFragmentMembersInjector.injectMembers(homefragment);
    }

    public void inject(PlayerActionDialogFragment playeractiondialogfragment)
    {
        playerActionDialogFragmentMembersInjector.injectMembers(playeractiondialogfragment);
    }

    public void inject(ScheduleFragment schedulefragment)
    {
        scheduleFragmentMembersInjector.injectMembers(schedulefragment);
    }

    public void inject(ShowcaseFragment showcasefragment)
    {
        showcaseFragmentMembersInjector.injectMembers(showcasefragment);
    }

    public void inject(SochiApplicationSettingsFragment sochiapplicationsettingsfragment)
    {
        sochiApplicationSettingsFragmentMembersInjector.injectMembers(sochiapplicationsettingsfragment);
    }

    public void inject(SportFilterListFragment sportfilterlistfragment)
    {
        sportFilterListFragmentMembersInjector.injectMembers(sportfilterlistfragment);
    }

    public void inject(SportGridTabletFragment sportgridtabletfragment)
    {
        sportGridTabletFragmentMembersInjector.injectMembers(sportgridtabletfragment);
    }

    static 
    {
        boolean flag;
        if (!com/phunware/nbc/sochi/DaggerMainNavigationContentActivity_Component.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
