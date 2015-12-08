// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player;

import com.google.gson.Gson;
import com.nbcsports.liveextra.ApplicationComponent;
import com.nbcsports.liveextra.ads.NbcAuditudeConfiguration_Factory;
import com.nbcsports.liveextra.analytics.AkamaiAnalytics_Factory;
import com.nbcsports.liveextra.analytics.OmniturePlayerAnalytics_Factory;
import com.nbcsports.liveextra.analytics.PlayerAnalyticsModule;
import com.nbcsports.liveextra.analytics.PlayerAnalyticsModule_AkamaiFactory;
import com.nbcsports.liveextra.analytics.PlayerAnalyticsModule_ConvivaFactory;
import com.nbcsports.liveextra.analytics.PlayerAnalyticsModule_ConvivaProxyFactory;
import com.nbcsports.liveextra.analytics.PlayerAnalyticsModule_OmnitureFactory;
import com.nbcsports.liveextra.analytics.PlayerAnalyticsModule_StreamsenseFactory;
import com.nbcsports.liveextra.analytics.StreamSenseAnalytics_Factory;
import com.nbcsports.liveextra.analytics.conviva.ConvivaAnalytics_Factory;
import com.nbcsports.liveextra.content.FavoriteService;
import com.nbcsports.liveextra.content.overlay.OverlayContentService_Factory;
import com.nbcsports.liveextra.library.configuration.Configuration;
import com.nbcsports.liveextra.library.preferences.AppPreferences;
import com.nbcsports.liveextra.library.tve.AuthService;
import com.nbcsports.liveextra.player.PlayerConfigurationModule;
import com.nbcsports.liveextra.player.PlayerConfigurationModule_ProviderFactory;
import com.nbcsports.liveextra.ui.core.CaptionStyle;
import com.nbcsports.liveextra.ui.player.dataviews.DataViewModule;
import com.nbcsports.liveextra.ui.player.dataviews.DataViewModule_EngineFactory;
import com.nbcsports.liveextra.ui.player.dataviews.PanelBottom;
import com.nbcsports.liveextra.ui.player.dataviews.PanelBottom_MembersInjector;
import com.nbcsports.liveextra.ui.player.dataviews.PanelSide;
import com.nbcsports.liveextra.ui.player.dataviews.PanelSide_MembersInjector;
import com.nbcsports.liveextra.ui.player.dataviews.PanelTop;
import com.nbcsports.liveextra.ui.player.dataviews.PanelTop_MembersInjector;
import com.nbcsports.liveextra.ui.player.premierleague.PremierLeagueComponent;
import com.nbcsports.liveextra.ui.player.premierleague.PremierLeagueEngine;
import com.nbcsports.liveextra.ui.player.premierleague.PremierLeagueEngine_MembersInjector;
import com.nbcsports.liveextra.ui.player.premierleague.PremierLeagueModule;
import com.nbcsports.liveextra.ui.player.premierleague.PremierLeagueModule_EngineFactory;
import com.nbcsports.liveextra.ui.player.premierleague.PremierLeagueModule_SplashDataFactory;
import com.nbcsports.liveextra.ui.player.premierleague.events.EventItemPresenter_Factory;
import com.nbcsports.liveextra.ui.player.premierleague.events.EventItemView;
import com.nbcsports.liveextra.ui.player.premierleague.events.EventItemView_MembersInjector;
import com.nbcsports.liveextra.ui.player.premierleague.events.EventsPresenter_Factory;
import com.nbcsports.liveextra.ui.player.premierleague.events.EventsTimelineProvider_Factory;
import com.nbcsports.liveextra.ui.player.premierleague.events.EventsView;
import com.nbcsports.liveextra.ui.player.premierleague.events.EventsView_MembersInjector;
import com.nbcsports.liveextra.ui.player.premierleague.gameinfo.GameInfoPresenter_Factory;
import com.nbcsports.liveextra.ui.player.premierleague.gameinfo.GameInfoProvider_Factory;
import com.nbcsports.liveextra.ui.player.premierleague.gameinfo.GameInformationView;
import com.nbcsports.liveextra.ui.player.premierleague.gameinfo.GameInformationView_MembersInjector;
import com.nbcsports.liveextra.ui.player.premierleague.gameinfo.MatchScorePresenter_Factory;
import com.nbcsports.liveextra.ui.player.premierleague.gameinfo.MatchScoreView;
import com.nbcsports.liveextra.ui.player.premierleague.gameinfo.MatchScoreView_MembersInjector;
import com.nbcsports.liveextra.ui.player.premierleague.gameinfo.TeamBoxScoreProvider_Factory;
import com.nbcsports.liveextra.ui.player.premierleague.gameinfo.TeamInfoProvider_Factory;
import com.nbcsports.liveextra.ui.player.premierleague.league.LeagueInfoProvider_Factory;
import com.nbcsports.liveextra.ui.player.premierleague.playbyplay.PlayByPlayPresenter_Factory;
import com.nbcsports.liveextra.ui.player.premierleague.playbyplay.PlayByPlayProvider_Factory;
import com.nbcsports.liveextra.ui.player.premierleague.playbyplay.PlayByPlayView;
import com.nbcsports.liveextra.ui.player.premierleague.playbyplay.PlayByPlayView_MembersInjector;
import com.nbcsports.liveextra.ui.player.premierleague.playbyplay.PlayItemPresenter_Factory;
import com.nbcsports.liveextra.ui.player.premierleague.playbyplay.PlayItemView;
import com.nbcsports.liveextra.ui.player.premierleague.playbyplay.PlayItemView_MembersInjector;
import com.nbcsports.liveextra.ui.player.premierleague.player.PlayerBoxScoreProvider_Factory;
import com.nbcsports.liveextra.ui.player.premierleague.player.PlayerCardsPresenter_Factory;
import com.nbcsports.liveextra.ui.player.premierleague.player.PlayerCardsView;
import com.nbcsports.liveextra.ui.player.premierleague.player.PlayerCardsView_MembersInjector;
import com.nbcsports.liveextra.ui.player.premierleague.player.PlayerInfoProvider_Factory;
import com.nbcsports.liveextra.ui.player.premierleague.player.PlayerItemPresenter_Factory;
import com.nbcsports.liveextra.ui.player.premierleague.player.PlayerItemView;
import com.nbcsports.liveextra.ui.player.premierleague.player.PlayerItemView_MembersInjector;
import com.nbcsports.liveextra.ui.player.premierleague.player.PlayerSeasonStatsProvider_Factory;
import com.nbcsports.liveextra.ui.player.premierleague.schedule.ScheduleItemPresenter_Factory;
import com.nbcsports.liveextra.ui.player.premierleague.schedule.ScheduleItemView;
import com.nbcsports.liveextra.ui.player.premierleague.schedule.ScheduleItemView_MembersInjector;
import com.nbcsports.liveextra.ui.player.premierleague.schedule.SchedulePresenter_Factory;
import com.nbcsports.liveextra.ui.player.premierleague.schedule.ScheduleProvider_Factory;
import com.nbcsports.liveextra.ui.player.premierleague.schedule.ScheduleService_Factory;
import com.nbcsports.liveextra.ui.player.premierleague.schedule.ScheduleView;
import com.nbcsports.liveextra.ui.player.premierleague.schedule.ScheduleView_MembersInjector;
import com.nbcsports.liveextra.ui.player.premierleague.standings.LiveTableProvider_Factory;
import com.nbcsports.liveextra.ui.player.premierleague.standings.StandingsItemView;
import com.nbcsports.liveextra.ui.player.premierleague.standings.StandingsLiveProvider_Factory;
import com.nbcsports.liveextra.ui.player.premierleague.standings.StandingsPresenter_Factory;
import com.nbcsports.liveextra.ui.player.premierleague.standings.StandingsView;
import com.nbcsports.liveextra.ui.player.premierleague.standings.StandingsView_MembersInjector;
import com.nbcsports.liveextra.ui.player.premierleague.stats.StatsPresenter_Factory;
import com.nbcsports.liveextra.ui.player.premierleague.stats.StatsView;
import com.nbcsports.liveextra.ui.player.premierleague.stats.StatsView_MembersInjector;
import com.nbcsports.liveextra.ui.player.premierleague.stats.TerritorialBreakdownProvider_Factory;
import com.phunware.nbc.sochi.fragments.TempPassDialogFragment;
import com.phunware.nbc.sochi.fragments.TempPassDialogFragment_MembersInjector;
import com.phunware.nbc.sochi.metrics.TrackingHelper;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.picasso.Picasso;
import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import dagger.internal.ScopedProvider;
import dagger.internal.SetFactory;
import javax.inject.Provider;

// Referenced classes of package com.nbcsports.liveextra.ui.player:
//            PlayerPresenter_Factory, AltCamPresenter_Factory, PlayerActivity_MembersInjector, PlayerView_MembersInjector, 
//            PlayerControlBar_MembersInjector, ActionBarSponsorView_MembersInjector, AltCamOverlay_MembersInjector, PlayerToolbar_MembersInjector, 
//            PlayerQosOverlayView_MembersInjector, AdOverlay_MembersInjector, PlayerActivity, ActionBarSponsorView, 
//            AdOverlay, AltCamOverlay, PlayerControlBar, PlayerQosOverlayView, 
//            PlayerToolbar, PlayerView

public final class DaggerPlayerActivity_Component
    implements PlayerActivity.Component
{
    public static final class Builder
    {

        private ApplicationComponent applicationComponent;
        private DataViewModule dataViewModule;
        private PlayerActivity.Module module;
        private PlayerAnalyticsModule playerAnalyticsModule;
        private PlayerConfigurationModule playerConfigurationModule;

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

        public PlayerActivity.Component build()
        {
            if (module == null)
            {
                throw new IllegalStateException("module must be set");
            }
            if (dataViewModule == null)
            {
                dataViewModule = new DataViewModule();
            }
            if (playerConfigurationModule == null)
            {
                playerConfigurationModule = new PlayerConfigurationModule();
            }
            if (playerAnalyticsModule == null)
            {
                playerAnalyticsModule = new PlayerAnalyticsModule();
            }
            if (applicationComponent == null)
            {
                throw new IllegalStateException("applicationComponent must be set");
            } else
            {
                return new DaggerPlayerActivity_Component(this);
            }
        }

        public Builder dataViewModule(DataViewModule dataviewmodule)
        {
            if (dataviewmodule == null)
            {
                throw new NullPointerException("dataViewModule");
            } else
            {
                dataViewModule = dataviewmodule;
                return this;
            }
        }

        public Builder module(PlayerActivity.Module module1)
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

        public Builder playerAnalyticsModule(PlayerAnalyticsModule playeranalyticsmodule)
        {
            if (playeranalyticsmodule == null)
            {
                throw new NullPointerException("playerAnalyticsModule");
            } else
            {
                playerAnalyticsModule = playeranalyticsmodule;
                return this;
            }
        }

        public Builder playerConfigurationModule(PlayerConfigurationModule playerconfigurationmodule)
        {
            if (playerconfigurationmodule == null)
            {
                throw new NullPointerException("playerConfigurationModule");
            } else
            {
                playerConfigurationModule = playerconfigurationmodule;
                return this;
            }
        }






        private Builder()
        {
        }

    }

    private final class PremierLeagueComponentImpl
        implements PremierLeagueComponent
    {

        private MembersInjector actionBarSponsorViewMembersInjector;
        private MembersInjector adOverlayMembersInjector;
        private MembersInjector altCamOverlayMembersInjector;
        private Provider engineProvider;
        private Provider eventItemPresenterProvider;
        private MembersInjector eventItemViewMembersInjector;
        private Provider eventsPresenterProvider;
        private Provider eventsTimelineProvider;
        private MembersInjector eventsViewMembersInjector;
        private Provider gameInfoPresenterProvider;
        private Provider gameInfoProvider;
        private Provider gameInfoSubscriberProvider;
        private MembersInjector gameInformationViewMembersInjector;
        private Provider leagueInfoProvider;
        private Provider leagueInfoSubscriberProvider;
        private Provider liveTableProvider;
        private Provider liveTableSubscriberProvider;
        private Provider majorEventsTimelineSubscriberProvider;
        private Provider matchScorePresenterProvider;
        private MembersInjector matchScoreViewMembersInjector;
        private Provider overlayContentServiceProvider;
        private MembersInjector panelBottomMembersInjector;
        private MembersInjector panelBottomMembersInjector1;
        private MembersInjector panelSideMembersInjector;
        private MembersInjector panelTopMembersInjector;
        private MembersInjector panelTopMembersInjector1;
        private Provider playByPlayPresenterProvider;
        private Provider playByPlayProvider;
        private Provider playByPlaySubscriberProvider;
        private MembersInjector playByPlayViewMembersInjector;
        private Provider playItemPresenterProvider;
        private MembersInjector playItemViewMembersInjector;
        private MembersInjector playerActivityMembersInjector;
        private Provider playerBoxScoreProvider;
        private Provider playerBoxScoreSubscriberProvider;
        private Provider playerCardsPresenterProvider;
        private MembersInjector playerCardsViewMembersInjector;
        private MembersInjector playerControlBarMembersInjector;
        private Provider playerInfoProvider;
        private Provider playerInfoSubscriberProvider;
        private Provider playerItemPresenterProvider;
        private MembersInjector playerItemViewMembersInjector;
        private MembersInjector playerQosOverlayViewMembersInjector;
        private Provider playerSeasonStatsProvider;
        private Provider playerSeasonStatsSubscriberProvider;
        private MembersInjector playerToolbarMembersInjector;
        private MembersInjector playerViewMembersInjector;
        private MembersInjector premierLeagueEngineMembersInjector;
        private final PremierLeagueModule premierLeagueModule;
        private Provider scheduleItemPresenterProvider;
        private MembersInjector scheduleItemViewMembersInjector;
        private Provider schedulePresenterProvider;
        private Provider scheduleProvider;
        private Provider scheduleServiceProvider;
        private Provider scheduleSubscriberProvider;
        private MembersInjector scheduleViewMembersInjector;
        private Provider setOfPlayerAnalyticsProvider;
        private Provider splashDataProvider;
        private Provider standingsLiveProvider;
        private Provider standingsLiveSubscriberProvider;
        private Provider standingsPresenterProvider;
        private MembersInjector standingsViewMembersInjector;
        private Provider statsPresenterProvider;
        private MembersInjector statsViewMembersInjector;
        private Provider teamBoxScoreProvider;
        private Provider teamBoxScoreSubscriberProvider;
        private Provider teamInfoProvider;
        private Provider teamInfoSubscriberProvider;
        private MembersInjector tempPassDialogFragmentMembersInjector;
        private Provider territorialBreakdownProvider;
        private Provider territorialBreakdownSubscriberProvider;
        final DaggerPlayerActivity_Component this$0;

        private void initialize()
        {
            overlayContentServiceProvider = ScopedProvider.create(OverlayContentService_Factory.create(okHttpClientProvider));
            premierLeagueEngineMembersInjector = PremierLeagueEngine_MembersInjector.create(gsonProvider, overlayContentServiceProvider, viewModelProvider);
            engineProvider = ScopedProvider.create(PremierLeagueModule_EngineFactory.create(premierLeagueModule));
            gameInfoSubscriberProvider = ScopedProvider.create(com.nbcsports.liveextra.ui.player.premierleague.gameinfo.GameInfoProvider.GameInfoSubscriber_Factory.create(MembersInjectors.noOp(), okHttpClientProvider, gsonProvider));
            gameInfoProvider = ScopedProvider.create(GameInfoProvider_Factory.create(MembersInjectors.noOp(), engineProvider, gameInfoSubscriberProvider));
            gameInfoPresenterProvider = ScopedProvider.create(GameInfoPresenter_Factory.create(MembersInjectors.noOp(), engineProvider, playerPresenterProvider, gameInfoProvider));
            gameInformationViewMembersInjector = GameInformationView_MembersInjector.create(MembersInjectors.noOp(), gameInfoPresenterProvider);
            teamInfoSubscriberProvider = ScopedProvider.create(com.nbcsports.liveextra.ui.player.premierleague.gameinfo.TeamInfoProvider.TeamInfoSubscriber_Factory.create(MembersInjectors.noOp(), okHttpClientProvider, gsonProvider));
            teamInfoProvider = ScopedProvider.create(TeamInfoProvider_Factory.create(MembersInjectors.noOp(), engineProvider, teamInfoSubscriberProvider));
            teamBoxScoreSubscriberProvider = ScopedProvider.create(com.nbcsports.liveextra.ui.player.premierleague.gameinfo.TeamBoxScoreProvider.TeamBoxScoreSubscriber_Factory.create(MembersInjectors.noOp(), okHttpClientProvider, gsonProvider));
            teamBoxScoreProvider = ScopedProvider.create(TeamBoxScoreProvider_Factory.create(MembersInjectors.noOp(), engineProvider, teamBoxScoreSubscriberProvider));
            leagueInfoSubscriberProvider = ScopedProvider.create(com.nbcsports.liveextra.ui.player.premierleague.league.LeagueInfoProvider.LeagueInfoSubscriber_Factory.create(MembersInjectors.noOp(), okHttpClientProvider, gsonProvider));
            leagueInfoProvider = LeagueInfoProvider_Factory.create(MembersInjectors.noOp(), engineProvider, leagueInfoSubscriberProvider);
            majorEventsTimelineSubscriberProvider = ScopedProvider.create(com.nbcsports.liveextra.ui.player.premierleague.events.EventsTimelineProvider.MajorEventsTimelineSubscriber_Factory.create(MembersInjectors.noOp(), okHttpClientProvider, gsonProvider));
            eventsTimelineProvider = ScopedProvider.create(EventsTimelineProvider_Factory.create(MembersInjectors.noOp(), engineProvider, majorEventsTimelineSubscriberProvider));
            standingsLiveSubscriberProvider = ScopedProvider.create(com.nbcsports.liveextra.ui.player.premierleague.standings.StandingsLiveProvider.StandingsLiveSubscriber_Factory.create(MembersInjectors.noOp(), okHttpClientProvider, gsonProvider));
            standingsLiveProvider = ScopedProvider.create(StandingsLiveProvider_Factory.create(MembersInjectors.noOp(), engineProvider, standingsLiveSubscriberProvider, gameInfoProvider));
            matchScorePresenterProvider = ScopedProvider.create(MatchScorePresenter_Factory.create(MembersInjectors.noOp(), engineProvider, playerPresenterProvider, gameInfoProvider, teamInfoProvider, teamBoxScoreProvider, leagueInfoProvider, eventsTimelineProvider, standingsLiveProvider));
            matchScoreViewMembersInjector = MatchScoreView_MembersInjector.create(MembersInjectors.noOp(), matchScorePresenterProvider, picassoProvider);
            playByPlaySubscriberProvider = ScopedProvider.create(com.nbcsports.liveextra.ui.player.premierleague.playbyplay.PlayByPlayProvider.PlayByPlaySubscriber_Factory.create(MembersInjectors.noOp(), okHttpClientProvider, gsonProvider));
            playByPlayProvider = ScopedProvider.create(PlayByPlayProvider_Factory.create(MembersInjectors.noOp(), engineProvider, playByPlaySubscriberProvider));
            playByPlayPresenterProvider = ScopedProvider.create(PlayByPlayPresenter_Factory.create(MembersInjectors.noOp(), engineProvider, playerPresenterProvider, playByPlayProvider));
            playByPlayViewMembersInjector = PlayByPlayView_MembersInjector.create(MembersInjectors.noOp(), playByPlayPresenterProvider);
            playItemPresenterProvider = ScopedProvider.create(PlayItemPresenter_Factory.create(MembersInjectors.noOp(), engineProvider, playerPresenterProvider));
            playItemViewMembersInjector = PlayItemView_MembersInjector.create(MembersInjectors.noOp(), playItemPresenterProvider);
            playerInfoSubscriberProvider = ScopedProvider.create(com.nbcsports.liveextra.ui.player.premierleague.player.PlayerInfoProvider.PlayerInfoSubscriber_Factory.create(MembersInjectors.noOp(), okHttpClientProvider, gsonProvider));
            playerInfoProvider = ScopedProvider.create(PlayerInfoProvider_Factory.create(MembersInjectors.noOp(), engineProvider, playerInfoSubscriberProvider));
            playerCardsPresenterProvider = ScopedProvider.create(PlayerCardsPresenter_Factory.create(MembersInjectors.noOp(), engineProvider, playerPresenterProvider, teamInfoProvider, playerInfoProvider, teamBoxScoreProvider));
            playerCardsViewMembersInjector = PlayerCardsView_MembersInjector.create(MembersInjectors.noOp(), playerCardsPresenterProvider);
        }

        private void initialize1()
        {
            playerSeasonStatsSubscriberProvider = ScopedProvider.create(com.nbcsports.liveextra.ui.player.premierleague.player.PlayerSeasonStatsProvider.PlayerSeasonStatsSubscriber_Factory.create(MembersInjectors.noOp(), okHttpClientProvider, gsonProvider));
            playerSeasonStatsProvider = ScopedProvider.create(PlayerSeasonStatsProvider_Factory.create(MembersInjectors.noOp(), engineProvider, playerSeasonStatsSubscriberProvider, gameInfoProvider));
            playerBoxScoreSubscriberProvider = ScopedProvider.create(com.nbcsports.liveextra.ui.player.premierleague.player.PlayerBoxScoreProvider.PlayerBoxScoreSubscriber_Factory.create(MembersInjectors.noOp(), okHttpClientProvider, gsonProvider));
            playerBoxScoreProvider = ScopedProvider.create(PlayerBoxScoreProvider_Factory.create(MembersInjectors.noOp(), engineProvider, playerBoxScoreSubscriberProvider));
            playerItemPresenterProvider = PlayerItemPresenter_Factory.create(MembersInjectors.noOp(), engineProvider, playerPresenterProvider, eventsTimelineProvider, teamInfoProvider, playerSeasonStatsProvider, playerBoxScoreProvider);
            playerItemViewMembersInjector = PlayerItemView_MembersInjector.create(MembersInjectors.noOp(), playerItemPresenterProvider);
            liveTableSubscriberProvider = ScopedProvider.create(com.nbcsports.liveextra.ui.player.premierleague.standings.LiveTableProvider.LiveTableSubscriber_Factory.create(MembersInjectors.noOp(), okHttpClientProvider, gsonProvider));
            liveTableProvider = ScopedProvider.create(LiveTableProvider_Factory.create(MembersInjectors.noOp(), engineProvider, liveTableSubscriberProvider, gameInfoProvider, leagueInfoProvider));
            standingsPresenterProvider = ScopedProvider.create(StandingsPresenter_Factory.create(MembersInjectors.noOp(), engineProvider, playerPresenterProvider, liveTableProvider, leagueInfoProvider));
            standingsViewMembersInjector = StandingsView_MembersInjector.create(MembersInjectors.noOp(), standingsPresenterProvider, appPreferencesProvider);
            territorialBreakdownSubscriberProvider = ScopedProvider.create(com.nbcsports.liveextra.ui.player.premierleague.stats.TerritorialBreakdownProvider.TerritorialBreakdownSubscriber_Factory.create(MembersInjectors.noOp(), okHttpClientProvider, gsonProvider));
            territorialBreakdownProvider = ScopedProvider.create(TerritorialBreakdownProvider_Factory.create(MembersInjectors.noOp(), engineProvider, territorialBreakdownSubscriberProvider, eventsTimelineProvider));
            statsPresenterProvider = ScopedProvider.create(StatsPresenter_Factory.create(MembersInjectors.noOp(), engineProvider, playerPresenterProvider, teamInfoProvider, teamBoxScoreProvider, territorialBreakdownProvider));
            statsViewMembersInjector = StatsView_MembersInjector.create(MembersInjectors.noOp(), statsPresenterProvider);
            scheduleSubscriberProvider = ScopedProvider.create(com.nbcsports.liveextra.ui.player.premierleague.schedule.ScheduleProvider.ScheduleSubscriber_Factory.create(MembersInjectors.noOp(), okHttpClientProvider, gsonProvider));
            scheduleProvider = ScopedProvider.create(ScheduleProvider_Factory.create(MembersInjectors.noOp(), engineProvider, scheduleSubscriberProvider));
            schedulePresenterProvider = ScopedProvider.create(SchedulePresenter_Factory.create(MembersInjectors.noOp(), engineProvider, playerPresenterProvider, scheduleProvider));
            scheduleViewMembersInjector = ScheduleView_MembersInjector.create(MembersInjectors.noOp(), schedulePresenterProvider);
            splashDataProvider = PremierLeagueModule_SplashDataFactory.create(premierLeagueModule);
            scheduleServiceProvider = ScopedProvider.create(ScheduleService_Factory.create(okHttpClientProvider, gsonProvider, splashDataProvider));
            scheduleItemPresenterProvider = ScheduleItemPresenter_Factory.create(MembersInjectors.noOp(), scheduleServiceProvider);
            scheduleItemViewMembersInjector = ScheduleItemView_MembersInjector.create(MembersInjectors.noOp(), picassoProvider, scheduleItemPresenterProvider);
            eventsPresenterProvider = ScopedProvider.create(EventsPresenter_Factory.create(MembersInjectors.noOp(), engineProvider, playerPresenterProvider, teamInfoProvider, eventsTimelineProvider));
            eventsViewMembersInjector = EventsView_MembersInjector.create(MembersInjectors.noOp(), eventsPresenterProvider, viewModelProvider, engineProvider);
            eventItemPresenterProvider = EventItemPresenter_Factory.create(MembersInjectors.noOp(), engineProvider, playerPresenterProvider, teamInfoProvider, playerInfoProvider);
            eventItemViewMembersInjector = EventItemView_MembersInjector.create(MembersInjectors.noOp(), eventItemPresenterProvider);
            panelBottomMembersInjector = com.nbcsports.liveextra.ui.player.premierleague.PanelBottom_MembersInjector.create(MembersInjectors.noOp(), viewModelProvider);
            panelTopMembersInjector = com.nbcsports.liveextra.ui.player.premierleague.PanelTop_MembersInjector.create(MembersInjectors.noOp(), appPreferencesProvider);
            setOfPlayerAnalyticsProvider = SetFactory.create(new Provider[] {
                setOfPlayerAnalyticsContribution1Provider, setOfPlayerAnalyticsContribution2Provider, setOfPlayerAnalyticsContribution3Provider, setOfPlayerAnalyticsContribution4Provider
            });
        }

        private void initialize2()
        {
            playerActivityMembersInjector = PlayerActivity_MembersInjector.create(MembersInjectors.noOp(), okHttpClientProvider, entitlementServiceProvider, configurationProvider, picassoProvider, systemUiHelperProvider, setOfPlayerAnalyticsProvider, altCamPresenterProvider, playerPresenterProvider, playerProvider, DaggerPlayerActivity_Component.this.engineProvider);
            playerViewMembersInjector = PlayerView_MembersInjector.create(MembersInjectors.noOp(), playerActivityProvider, picassoProvider, configurationProvider, providerProvider, captionStyleProvider, trackingHelperProvider, entitlementServiceProvider, playerProvider, playerPresenterProvider);
            playerControlBarMembersInjector = PlayerControlBar_MembersInjector.create(MembersInjectors.noOp(), playerProvider, favoritesProvider, appPreferencesProvider, viewModelProvider, altCamPresenterProvider, playerPresenterProvider);
            actionBarSponsorViewMembersInjector = ActionBarSponsorView_MembersInjector.create(MembersInjectors.noOp(), picassoProvider, viewModelProvider, configurationProvider);
            altCamOverlayMembersInjector = AltCamOverlay_MembersInjector.create(MembersInjectors.noOp(), altCamPresenterProvider, playerPresenterProvider, playerProvider);
            tempPassDialogFragmentMembersInjector = TempPassDialogFragment_MembersInjector.create(MembersInjectors.noOp(), entitlementServiceProvider);
            playerToolbarMembersInjector = PlayerToolbar_MembersInjector.create(MembersInjectors.noOp(), entitlementServiceProvider, playerPresenterProvider);
            panelTopMembersInjector1 = PanelTop_MembersInjector.create(MembersInjectors.noOp(), DaggerPlayerActivity_Component.this.engineProvider, viewModelProvider);
            panelBottomMembersInjector1 = PanelBottom_MembersInjector.create(MembersInjectors.noOp(), DaggerPlayerActivity_Component.this.engineProvider, viewModelProvider);
            panelSideMembersInjector = PanelSide_MembersInjector.create(MembersInjectors.noOp(), DaggerPlayerActivity_Component.this.engineProvider, viewModelProvider);
            playerQosOverlayViewMembersInjector = PlayerQosOverlayView_MembersInjector.create(MembersInjectors.noOp(), playerProvider, playerPresenterProvider);
            adOverlayMembersInjector = AdOverlay_MembersInjector.create(MembersInjectors.noOp(), playerProvider);
        }

        public void inject(com.nbcsports.liveextra.ui.player.premierleague.PanelBottom panelbottom)
        {
            panelBottomMembersInjector.injectMembers(panelbottom);
        }

        public void inject(com.nbcsports.liveextra.ui.player.premierleague.PanelSide panelside)
        {
            MembersInjectors.noOp().injectMembers(panelside);
        }

        public void inject(com.nbcsports.liveextra.ui.player.premierleague.PanelTop paneltop)
        {
            panelTopMembersInjector.injectMembers(paneltop);
        }

        public void inject(PremierLeagueEngine premierleagueengine)
        {
            premierLeagueEngineMembersInjector.injectMembers(premierleagueengine);
        }

        public void inject(EventItemView eventitemview)
        {
            eventItemViewMembersInjector.injectMembers(eventitemview);
        }

        public void inject(EventsView eventsview)
        {
            eventsViewMembersInjector.injectMembers(eventsview);
        }

        public void inject(GameInformationView gameinformationview)
        {
            gameInformationViewMembersInjector.injectMembers(gameinformationview);
        }

        public void inject(MatchScoreView matchscoreview)
        {
            matchScoreViewMembersInjector.injectMembers(matchscoreview);
        }

        public void inject(PlayByPlayView playbyplayview)
        {
            playByPlayViewMembersInjector.injectMembers(playbyplayview);
        }

        public void inject(PlayItemView playitemview)
        {
            playItemViewMembersInjector.injectMembers(playitemview);
        }

        public void inject(PlayerCardsView playercardsview)
        {
            playerCardsViewMembersInjector.injectMembers(playercardsview);
        }

        public void inject(PlayerItemView playeritemview)
        {
            playerItemViewMembersInjector.injectMembers(playeritemview);
        }

        public void inject(ScheduleItemView scheduleitemview)
        {
            scheduleItemViewMembersInjector.injectMembers(scheduleitemview);
        }

        public void inject(ScheduleView scheduleview)
        {
            scheduleViewMembersInjector.injectMembers(scheduleview);
        }

        public void inject(StandingsItemView standingsitemview)
        {
            MembersInjectors.noOp().injectMembers(standingsitemview);
        }

        public void inject(StandingsView standingsview)
        {
            standingsViewMembersInjector.injectMembers(standingsview);
        }

        public void inject(StatsView statsview)
        {
            statsViewMembersInjector.injectMembers(statsview);
        }

        private PremierLeagueComponentImpl(PremierLeagueModule premierleaguemodule)
        {
            this$0 = DaggerPlayerActivity_Component.this;
            super();
            if (premierleaguemodule == null)
            {
                throw new NullPointerException();
            } else
            {
                premierLeagueModule = premierleaguemodule;
                initialize();
                initialize1();
                initialize2();
                return;
            }
        }

    }


    static final boolean $assertionsDisabled;
    private MembersInjector actionBarSponsorViewMembersInjector;
    private MembersInjector adOverlayMembersInjector;
    private Provider akamaiAnalyticsProvider;
    private MembersInjector altCamOverlayMembersInjector;
    private Provider altCamPresenterProvider;
    private Provider appPreferencesProvider;
    private Provider captionStyleProvider;
    private Provider configurationProvider;
    private Provider contextProvider;
    private Provider convivaAnalyticsProvider;
    private Provider convivaProxyProvider;
    private Provider engineProvider;
    private Provider entitlementServiceProvider;
    private Provider favoritesProvider;
    private Provider gsonProvider;
    private Provider okHttpClientProvider;
    private Provider omniturePlayerAnalyticsProvider;
    private MembersInjector panelBottomMembersInjector;
    private MembersInjector panelSideMembersInjector;
    private MembersInjector panelTopMembersInjector;
    private Provider picassoProvider;
    private MembersInjector playerActivityMembersInjector;
    private Provider playerActivityProvider;
    private MembersInjector playerControlBarMembersInjector;
    private Provider playerPresenterProvider;
    private Provider playerProvider;
    private MembersInjector playerQosOverlayViewMembersInjector;
    private MembersInjector playerToolbarMembersInjector;
    private MembersInjector playerViewMembersInjector;
    private Provider providerProvider;
    private Provider setOfPlayerAnalyticsContribution1Provider;
    private Provider setOfPlayerAnalyticsContribution2Provider;
    private Provider setOfPlayerAnalyticsContribution3Provider;
    private Provider setOfPlayerAnalyticsContribution4Provider;
    private Provider setOfPlayerAnalyticsProvider;
    private Provider streamSenseAnalyticsProvider;
    private Provider systemUiHelperProvider;
    private MembersInjector tempPassDialogFragmentMembersInjector;
    private Provider trackingHelperProvider;
    private Provider viewModelProvider;

    private DaggerPlayerActivity_Component(Builder builder1)
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
        okHttpClientProvider = new Factory() {

            private final ApplicationComponent applicationComponent;
            final DaggerPlayerActivity_Component this$0;
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
                this$0 = DaggerPlayerActivity_Component.this;
                builder = builder1;
                super();
                applicationComponent = builder.applicationComponent;
            }
        };
        entitlementServiceProvider = new Factory() {

            private final ApplicationComponent applicationComponent;
            final DaggerPlayerActivity_Component this$0;
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
                this$0 = DaggerPlayerActivity_Component.this;
                builder = builder1;
                super();
                applicationComponent = builder.applicationComponent;
            }
        };
        configurationProvider = new Factory() {

            private final ApplicationComponent applicationComponent;
            final DaggerPlayerActivity_Component this$0;
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
                this$0 = DaggerPlayerActivity_Component.this;
                builder = builder1;
                super();
                applicationComponent = builder.applicationComponent;
            }
        };
        picassoProvider = new Factory() {

            private final ApplicationComponent applicationComponent;
            final DaggerPlayerActivity_Component this$0;
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
                this$0 = DaggerPlayerActivity_Component.this;
                builder = builder1;
                super();
                applicationComponent = builder.applicationComponent;
            }
        };
        systemUiHelperProvider = ScopedProvider.create(PlayerActivity.Module_SystemUiHelperFactory.create(builder.module));
        viewModelProvider = ScopedProvider.create(PlayerActivity.Module_ViewModelFactory.create(builder.module));
        streamSenseAnalyticsProvider = ScopedProvider.create(StreamSenseAnalytics_Factory.create(viewModelProvider));
        trackingHelperProvider = new Factory() {

            private final ApplicationComponent applicationComponent;
            final DaggerPlayerActivity_Component this$0;
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
                this$0 = DaggerPlayerActivity_Component.this;
                builder = builder1;
                super();
                applicationComponent = builder.applicationComponent;
            }
        };
        omniturePlayerAnalyticsProvider = ScopedProvider.create(OmniturePlayerAnalytics_Factory.create(viewModelProvider, trackingHelperProvider));
        contextProvider = ScopedProvider.create(PlayerActivity.Module_ContextFactory.create(builder.module));
        playerProvider = ScopedProvider.create(PlayerActivity.Module_PlayerFactory.create(builder.module));
        convivaProxyProvider = PlayerAnalyticsModule_ConvivaProxyFactory.create(builder.playerAnalyticsModule, playerProvider);
        convivaAnalyticsProvider = ScopedProvider.create(ConvivaAnalytics_Factory.create(contextProvider, viewModelProvider, entitlementServiceProvider, convivaProxyProvider));
        akamaiAnalyticsProvider = AkamaiAnalytics_Factory.create(contextProvider, viewModelProvider);
        setOfPlayerAnalyticsContribution1Provider = ScopedProvider.create(PlayerAnalyticsModule_StreamsenseFactory.create(builder.playerAnalyticsModule, streamSenseAnalyticsProvider));
        setOfPlayerAnalyticsContribution2Provider = ScopedProvider.create(PlayerAnalyticsModule_OmnitureFactory.create(builder.playerAnalyticsModule, omniturePlayerAnalyticsProvider));
        setOfPlayerAnalyticsContribution3Provider = ScopedProvider.create(PlayerAnalyticsModule_ConvivaFactory.create(builder.playerAnalyticsModule, convivaAnalyticsProvider));
        setOfPlayerAnalyticsContribution4Provider = ScopedProvider.create(PlayerAnalyticsModule_AkamaiFactory.create(builder.playerAnalyticsModule, akamaiAnalyticsProvider));
        setOfPlayerAnalyticsProvider = SetFactory.create(new Provider[] {
            setOfPlayerAnalyticsContribution1Provider, setOfPlayerAnalyticsContribution2Provider, setOfPlayerAnalyticsContribution3Provider, setOfPlayerAnalyticsContribution4Provider
        });
        playerActivityProvider = ScopedProvider.create(PlayerActivity.Module_PlayerActivityFactory.create(builder.module));
        appPreferencesProvider = new Factory() {

            private final ApplicationComponent applicationComponent;
            final DaggerPlayerActivity_Component this$0;
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
                this$0 = DaggerPlayerActivity_Component.this;
                builder = builder1;
                super();
                applicationComponent = builder.applicationComponent;
            }
        };
        favoritesProvider = new Factory() {

            private final ApplicationComponent applicationComponent;
            final DaggerPlayerActivity_Component this$0;
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
                this$0 = DaggerPlayerActivity_Component.this;
                builder = builder1;
                super();
                applicationComponent = builder.applicationComponent;
            }
        };
        engineProvider = ScopedProvider.create(DataViewModule_EngineFactory.create(builder.dataViewModule, contextProvider, viewModelProvider));
        playerPresenterProvider = ScopedProvider.create(PlayerPresenter_Factory.create(MembersInjectors.noOp(), playerActivityProvider, playerProvider, systemUiHelperProvider, appPreferencesProvider, viewModelProvider, favoritesProvider, engineProvider));
        altCamPresenterProvider = ScopedProvider.create(AltCamPresenter_Factory.create(MembersInjectors.noOp(), contextProvider, playerPresenterProvider));
        playerActivityMembersInjector = PlayerActivity_MembersInjector.create(MembersInjectors.noOp(), okHttpClientProvider, entitlementServiceProvider, configurationProvider, picassoProvider, systemUiHelperProvider, setOfPlayerAnalyticsProvider, altCamPresenterProvider, playerPresenterProvider, playerProvider, engineProvider);
        providerProvider = ScopedProvider.create(PlayerConfigurationModule_ProviderFactory.create(builder.playerConfigurationModule, NbcAuditudeConfiguration_Factory.create()));
        captionStyleProvider = new Factory() {

            private final ApplicationComponent applicationComponent;
            final DaggerPlayerActivity_Component this$0;
            final Builder val$builder;

            public CaptionStyle get()
            {
                CaptionStyle captionstyle = applicationComponent.captionStyle();
                if (captionstyle == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return captionstyle;
                }
            }

            public volatile Object get()
            {
                return get();
            }

            
            {
                this$0 = DaggerPlayerActivity_Component.this;
                builder = builder1;
                super();
                applicationComponent = builder.applicationComponent;
            }
        };
        playerViewMembersInjector = PlayerView_MembersInjector.create(MembersInjectors.noOp(), playerActivityProvider, picassoProvider, configurationProvider, providerProvider, captionStyleProvider, trackingHelperProvider, entitlementServiceProvider, playerProvider, playerPresenterProvider);
        playerControlBarMembersInjector = PlayerControlBar_MembersInjector.create(MembersInjectors.noOp(), playerProvider, favoritesProvider, appPreferencesProvider, viewModelProvider, altCamPresenterProvider, playerPresenterProvider);
        actionBarSponsorViewMembersInjector = ActionBarSponsorView_MembersInjector.create(MembersInjectors.noOp(), picassoProvider, viewModelProvider, configurationProvider);
        altCamOverlayMembersInjector = AltCamOverlay_MembersInjector.create(MembersInjectors.noOp(), altCamPresenterProvider, playerPresenterProvider, playerProvider);
        tempPassDialogFragmentMembersInjector = TempPassDialogFragment_MembersInjector.create(MembersInjectors.noOp(), entitlementServiceProvider);
        playerToolbarMembersInjector = PlayerToolbar_MembersInjector.create(MembersInjectors.noOp(), entitlementServiceProvider, playerPresenterProvider);
        panelTopMembersInjector = PanelTop_MembersInjector.create(MembersInjectors.noOp(), engineProvider, viewModelProvider);
        panelBottomMembersInjector = PanelBottom_MembersInjector.create(MembersInjectors.noOp(), engineProvider, viewModelProvider);
        panelSideMembersInjector = PanelSide_MembersInjector.create(MembersInjectors.noOp(), engineProvider, viewModelProvider);
        playerQosOverlayViewMembersInjector = PlayerQosOverlayView_MembersInjector.create(MembersInjectors.noOp(), playerProvider, playerPresenterProvider);
        adOverlayMembersInjector = AdOverlay_MembersInjector.create(MembersInjectors.noOp(), playerProvider);
        gsonProvider = new Factory() {

            private final ApplicationComponent applicationComponent;
            final DaggerPlayerActivity_Component this$0;
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
                this$0 = DaggerPlayerActivity_Component.this;
                builder = builder1;
                super();
                applicationComponent = builder.applicationComponent;
            }
        };
    }

    public PlayerActivity activity()
    {
        return (PlayerActivity)playerActivityProvider.get();
    }

    public void inject(ActionBarSponsorView actionbarsponsorview)
    {
        actionBarSponsorViewMembersInjector.injectMembers(actionbarsponsorview);
    }

    public void inject(AdOverlay adoverlay)
    {
        adOverlayMembersInjector.injectMembers(adoverlay);
    }

    public void inject(AltCamOverlay altcamoverlay)
    {
        altCamOverlayMembersInjector.injectMembers(altcamoverlay);
    }

    public void inject(PlayerActivity playeractivity)
    {
        playerActivityMembersInjector.injectMembers(playeractivity);
    }

    public void inject(PlayerControlBar playercontrolbar)
    {
        playerControlBarMembersInjector.injectMembers(playercontrolbar);
    }

    public void inject(PlayerQosOverlayView playerqosoverlayview)
    {
        playerQosOverlayViewMembersInjector.injectMembers(playerqosoverlayview);
    }

    public void inject(PlayerToolbar playertoolbar)
    {
        playerToolbarMembersInjector.injectMembers(playertoolbar);
    }

    public void inject(PlayerView playerview)
    {
        playerViewMembersInjector.injectMembers(playerview);
    }

    public void inject(PanelBottom panelbottom)
    {
        panelBottomMembersInjector.injectMembers(panelbottom);
    }

    public void inject(PanelSide panelside)
    {
        panelSideMembersInjector.injectMembers(panelside);
    }

    public void inject(PanelTop paneltop)
    {
        panelTopMembersInjector.injectMembers(paneltop);
    }

    public void inject(TempPassDialogFragment temppassdialogfragment)
    {
        tempPassDialogFragmentMembersInjector.injectMembers(temppassdialogfragment);
    }

    public PremierLeagueComponent premierLeague(PremierLeagueModule premierleaguemodule)
    {
        return new PremierLeagueComponentImpl(premierleaguemodule);
    }

    static 
    {
        boolean flag;
        if (!com/nbcsports/liveextra/ui/player/DaggerPlayerActivity_Component.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }





















}
