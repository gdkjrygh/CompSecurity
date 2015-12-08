// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player;

import com.nbcsports.liveextra.content.overlay.OverlayContentService_Factory;
import com.nbcsports.liveextra.ui.player.dataviews.PanelSide_MembersInjector;
import com.nbcsports.liveextra.ui.player.premierleague.PanelBottom;
import com.nbcsports.liveextra.ui.player.premierleague.PanelBottom_MembersInjector;
import com.nbcsports.liveextra.ui.player.premierleague.PanelSide;
import com.nbcsports.liveextra.ui.player.premierleague.PanelTop;
import com.nbcsports.liveextra.ui.player.premierleague.PanelTop_MembersInjector;
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
import com.phunware.nbc.sochi.fragments.TempPassDialogFragment_MembersInjector;
import dagger.MembersInjector;
import dagger.internal.MembersInjectors;
import dagger.internal.ScopedProvider;
import dagger.internal.SetFactory;
import javax.inject.Provider;

// Referenced classes of package com.nbcsports.liveextra.ui.player:
//            DaggerPlayerActivity_Component, PlayerActivity_MembersInjector, PlayerView_MembersInjector, PlayerControlBar_MembersInjector, 
//            ActionBarSponsorView_MembersInjector, AltCamOverlay_MembersInjector, PlayerToolbar_MembersInjector, PlayerQosOverlayView_MembersInjector, 
//            AdOverlay_MembersInjector

private final class <init>
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
        overlayContentServiceProvider = ScopedProvider.create(OverlayContentService_Factory.create(DaggerPlayerActivity_Component.access$800(DaggerPlayerActivity_Component.this)));
        premierLeagueEngineMembersInjector = PremierLeagueEngine_MembersInjector.create(DaggerPlayerActivity_Component.access$900(DaggerPlayerActivity_Component.this), overlayContentServiceProvider, DaggerPlayerActivity_Component.access$1000(DaggerPlayerActivity_Component.this));
        engineProvider = ScopedProvider.create(PremierLeagueModule_EngineFactory.create(premierLeagueModule));
        gameInfoSubscriberProvider = ScopedProvider.create(com.nbcsports.liveextra.ui.player.premierleague.gameinfo.der(MembersInjectors.noOp(), DaggerPlayerActivity_Component.access$800(DaggerPlayerActivity_Component.this), DaggerPlayerActivity_Component.access$900(DaggerPlayerActivity_Component.this)));
        gameInfoProvider = ScopedProvider.create(GameInfoProvider_Factory.create(MembersInjectors.noOp(), engineProvider, gameInfoSubscriberProvider));
        gameInfoPresenterProvider = ScopedProvider.create(GameInfoPresenter_Factory.create(MembersInjectors.noOp(), engineProvider, DaggerPlayerActivity_Component.access$1100(DaggerPlayerActivity_Component.this), gameInfoProvider));
        gameInformationViewMembersInjector = GameInformationView_MembersInjector.create(MembersInjectors.noOp(), gameInfoPresenterProvider);
        teamInfoSubscriberProvider = ScopedProvider.create(com.nbcsports.liveextra.ui.player.premierleague.gameinfo.der(MembersInjectors.noOp(), DaggerPlayerActivity_Component.access$800(DaggerPlayerActivity_Component.this), DaggerPlayerActivity_Component.access$900(DaggerPlayerActivity_Component.this)));
        teamInfoProvider = ScopedProvider.create(TeamInfoProvider_Factory.create(MembersInjectors.noOp(), engineProvider, teamInfoSubscriberProvider));
        teamBoxScoreSubscriberProvider = ScopedProvider.create(com.nbcsports.liveextra.ui.player.premierleague.gameinfo.(MembersInjectors.noOp(), DaggerPlayerActivity_Component.access$800(DaggerPlayerActivity_Component.this), DaggerPlayerActivity_Component.access$900(DaggerPlayerActivity_Component.this)));
        teamBoxScoreProvider = ScopedProvider.create(TeamBoxScoreProvider_Factory.create(MembersInjectors.noOp(), engineProvider, teamBoxScoreSubscriberProvider));
        leagueInfoSubscriberProvider = ScopedProvider.create(com.nbcsports.liveextra.ui.player.premierleague.league.rovider(MembersInjectors.noOp(), DaggerPlayerActivity_Component.access$800(DaggerPlayerActivity_Component.this), DaggerPlayerActivity_Component.access$900(DaggerPlayerActivity_Component.this)));
        leagueInfoProvider = LeagueInfoProvider_Factory.create(MembersInjectors.noOp(), engineProvider, leagueInfoSubscriberProvider);
        majorEventsTimelineSubscriberProvider = ScopedProvider.create(com.nbcsports.liveextra.ui.player.premierleague.events.ry.create(MembersInjectors.noOp(), DaggerPlayerActivity_Component.access$800(DaggerPlayerActivity_Component.this), DaggerPlayerActivity_Component.access$900(DaggerPlayerActivity_Component.this)));
        eventsTimelineProvider = ScopedProvider.create(EventsTimelineProvider_Factory.create(MembersInjectors.noOp(), engineProvider, majorEventsTimelineSubscriberProvider));
        standingsLiveSubscriberProvider = ScopedProvider.create(com.nbcsports.liveextra.ui.player.premierleague.standings.te(MembersInjectors.noOp(), DaggerPlayerActivity_Component.access$800(DaggerPlayerActivity_Component.this), DaggerPlayerActivity_Component.access$900(DaggerPlayerActivity_Component.this)));
        standingsLiveProvider = ScopedProvider.create(StandingsLiveProvider_Factory.create(MembersInjectors.noOp(), engineProvider, standingsLiveSubscriberProvider, gameInfoProvider));
        matchScorePresenterProvider = ScopedProvider.create(MatchScorePresenter_Factory.create(MembersInjectors.noOp(), engineProvider, DaggerPlayerActivity_Component.access$1100(DaggerPlayerActivity_Component.this), gameInfoProvider, teamInfoProvider, teamBoxScoreProvider, leagueInfoProvider, eventsTimelineProvider, standingsLiveProvider));
        matchScoreViewMembersInjector = MatchScoreView_MembersInjector.create(MembersInjectors.noOp(), matchScorePresenterProvider, DaggerPlayerActivity_Component.access$1200(DaggerPlayerActivity_Component.this));
        playByPlaySubscriberProvider = ScopedProvider.create(com.nbcsports.liveextra.ui.player.premierleague.playbyplay.der(MembersInjectors.noOp(), DaggerPlayerActivity_Component.access$800(DaggerPlayerActivity_Component.this), DaggerPlayerActivity_Component.access$900(DaggerPlayerActivity_Component.this)));
        playByPlayProvider = ScopedProvider.create(PlayByPlayProvider_Factory.create(MembersInjectors.noOp(), engineProvider, playByPlaySubscriberProvider));
        playByPlayPresenterProvider = ScopedProvider.create(PlayByPlayPresenter_Factory.create(MembersInjectors.noOp(), engineProvider, DaggerPlayerActivity_Component.access$1100(DaggerPlayerActivity_Component.this), playByPlayProvider));
        playByPlayViewMembersInjector = PlayByPlayView_MembersInjector.create(MembersInjectors.noOp(), playByPlayPresenterProvider);
        playItemPresenterProvider = ScopedProvider.create(PlayItemPresenter_Factory.create(MembersInjectors.noOp(), engineProvider, DaggerPlayerActivity_Component.access$1100(DaggerPlayerActivity_Component.this)));
        playItemViewMembersInjector = PlayItemView_MembersInjector.create(MembersInjectors.noOp(), playItemPresenterProvider);
        playerInfoSubscriberProvider = ScopedProvider.create(com.nbcsports.liveextra.ui.player.premierleague.player.rovider(MembersInjectors.noOp(), DaggerPlayerActivity_Component.access$800(DaggerPlayerActivity_Component.this), DaggerPlayerActivity_Component.access$900(DaggerPlayerActivity_Component.this)));
        playerInfoProvider = ScopedProvider.create(PlayerInfoProvider_Factory.create(MembersInjectors.noOp(), engineProvider, playerInfoSubscriberProvider));
        playerCardsPresenterProvider = ScopedProvider.create(PlayerCardsPresenter_Factory.create(MembersInjectors.noOp(), engineProvider, DaggerPlayerActivity_Component.access$1100(DaggerPlayerActivity_Component.this), teamInfoProvider, playerInfoProvider, teamBoxScoreProvider));
        playerCardsViewMembersInjector = PlayerCardsView_MembersInjector.create(MembersInjectors.noOp(), playerCardsPresenterProvider);
    }

    private void initialize1()
    {
        playerSeasonStatsSubscriberProvider = ScopedProvider.create(com.nbcsports.liveextra.ui.player.premierleague.player.ory.create(MembersInjectors.noOp(), DaggerPlayerActivity_Component.access$800(DaggerPlayerActivity_Component.this), DaggerPlayerActivity_Component.access$900(DaggerPlayerActivity_Component.this)));
        playerSeasonStatsProvider = ScopedProvider.create(PlayerSeasonStatsProvider_Factory.create(MembersInjectors.noOp(), engineProvider, playerSeasonStatsSubscriberProvider, gameInfoProvider));
        playerBoxScoreSubscriberProvider = ScopedProvider.create(com.nbcsports.liveextra.ui.player.premierleague.player.eate(MembersInjectors.noOp(), DaggerPlayerActivity_Component.access$800(DaggerPlayerActivity_Component.this), DaggerPlayerActivity_Component.access$900(DaggerPlayerActivity_Component.this)));
        playerBoxScoreProvider = ScopedProvider.create(PlayerBoxScoreProvider_Factory.create(MembersInjectors.noOp(), engineProvider, playerBoxScoreSubscriberProvider));
        playerItemPresenterProvider = PlayerItemPresenter_Factory.create(MembersInjectors.noOp(), engineProvider, DaggerPlayerActivity_Component.access$1100(DaggerPlayerActivity_Component.this), eventsTimelineProvider, teamInfoProvider, playerSeasonStatsProvider, playerBoxScoreProvider);
        playerItemViewMembersInjector = PlayerItemView_MembersInjector.create(MembersInjectors.noOp(), playerItemPresenterProvider);
        liveTableSubscriberProvider = ScopedProvider.create(com.nbcsports.liveextra.ui.player.premierleague.standings.der(MembersInjectors.noOp(), DaggerPlayerActivity_Component.access$800(DaggerPlayerActivity_Component.this), DaggerPlayerActivity_Component.access$900(DaggerPlayerActivity_Component.this)));
        liveTableProvider = ScopedProvider.create(LiveTableProvider_Factory.create(MembersInjectors.noOp(), engineProvider, liveTableSubscriberProvider, gameInfoProvider, leagueInfoProvider));
        standingsPresenterProvider = ScopedProvider.create(StandingsPresenter_Factory.create(MembersInjectors.noOp(), engineProvider, DaggerPlayerActivity_Component.access$1100(DaggerPlayerActivity_Component.this), liveTableProvider, leagueInfoProvider));
        standingsViewMembersInjector = StandingsView_MembersInjector.create(MembersInjectors.noOp(), standingsPresenterProvider, DaggerPlayerActivity_Component.access$1300(DaggerPlayerActivity_Component.this));
        territorialBreakdownSubscriberProvider = ScopedProvider.create(com.nbcsports.liveextra.ui.player.premierleague.stats.r_Factory.create(MembersInjectors.noOp(), DaggerPlayerActivity_Component.access$800(DaggerPlayerActivity_Component.this), DaggerPlayerActivity_Component.access$900(DaggerPlayerActivity_Component.this)));
        territorialBreakdownProvider = ScopedProvider.create(TerritorialBreakdownProvider_Factory.create(MembersInjectors.noOp(), engineProvider, territorialBreakdownSubscriberProvider, eventsTimelineProvider));
        statsPresenterProvider = ScopedProvider.create(StatsPresenter_Factory.create(MembersInjectors.noOp(), engineProvider, DaggerPlayerActivity_Component.access$1100(DaggerPlayerActivity_Component.this), teamInfoProvider, teamBoxScoreProvider, territorialBreakdownProvider));
        statsViewMembersInjector = StatsView_MembersInjector.create(MembersInjectors.noOp(), statsPresenterProvider);
        scheduleSubscriberProvider = ScopedProvider.create(com.nbcsports.liveextra.ui.player.premierleague.schedule.der(MembersInjectors.noOp(), DaggerPlayerActivity_Component.access$800(DaggerPlayerActivity_Component.this), DaggerPlayerActivity_Component.access$900(DaggerPlayerActivity_Component.this)));
        scheduleProvider = ScopedProvider.create(ScheduleProvider_Factory.create(MembersInjectors.noOp(), engineProvider, scheduleSubscriberProvider));
        schedulePresenterProvider = ScopedProvider.create(SchedulePresenter_Factory.create(MembersInjectors.noOp(), engineProvider, DaggerPlayerActivity_Component.access$1100(DaggerPlayerActivity_Component.this), scheduleProvider));
        scheduleViewMembersInjector = ScheduleView_MembersInjector.create(MembersInjectors.noOp(), schedulePresenterProvider);
        splashDataProvider = PremierLeagueModule_SplashDataFactory.create(premierLeagueModule);
        scheduleServiceProvider = ScopedProvider.create(ScheduleService_Factory.create(DaggerPlayerActivity_Component.access$800(DaggerPlayerActivity_Component.this), DaggerPlayerActivity_Component.access$900(DaggerPlayerActivity_Component.this), splashDataProvider));
        scheduleItemPresenterProvider = ScheduleItemPresenter_Factory.create(MembersInjectors.noOp(), scheduleServiceProvider);
        scheduleItemViewMembersInjector = ScheduleItemView_MembersInjector.create(MembersInjectors.noOp(), DaggerPlayerActivity_Component.access$1200(DaggerPlayerActivity_Component.this), scheduleItemPresenterProvider);
        eventsPresenterProvider = ScopedProvider.create(EventsPresenter_Factory.create(MembersInjectors.noOp(), engineProvider, DaggerPlayerActivity_Component.access$1100(DaggerPlayerActivity_Component.this), teamInfoProvider, eventsTimelineProvider));
        eventsViewMembersInjector = EventsView_MembersInjector.create(MembersInjectors.noOp(), eventsPresenterProvider, DaggerPlayerActivity_Component.access$1000(DaggerPlayerActivity_Component.this), engineProvider);
        eventItemPresenterProvider = EventItemPresenter_Factory.create(MembersInjectors.noOp(), engineProvider, DaggerPlayerActivity_Component.access$1100(DaggerPlayerActivity_Component.this), teamInfoProvider, playerInfoProvider);
        eventItemViewMembersInjector = EventItemView_MembersInjector.create(MembersInjectors.noOp(), eventItemPresenterProvider);
        panelBottomMembersInjector = PanelBottom_MembersInjector.create(MembersInjectors.noOp(), DaggerPlayerActivity_Component.access$1000(DaggerPlayerActivity_Component.this));
        panelTopMembersInjector = PanelTop_MembersInjector.create(MembersInjectors.noOp(), DaggerPlayerActivity_Component.access$1300(DaggerPlayerActivity_Component.this));
        setOfPlayerAnalyticsProvider = SetFactory.create(new Provider[] {
            DaggerPlayerActivity_Component.access$1400(DaggerPlayerActivity_Component.this), DaggerPlayerActivity_Component.access$1500(DaggerPlayerActivity_Component.this), DaggerPlayerActivity_Component.access$1600(DaggerPlayerActivity_Component.this), DaggerPlayerActivity_Component.access$1700(DaggerPlayerActivity_Component.this)
        });
    }

    private void initialize2()
    {
        playerActivityMembersInjector = PlayerActivity_MembersInjector.create(MembersInjectors.noOp(), DaggerPlayerActivity_Component.access$800(DaggerPlayerActivity_Component.this), DaggerPlayerActivity_Component.access$1800(DaggerPlayerActivity_Component.this), DaggerPlayerActivity_Component.access$1900(DaggerPlayerActivity_Component.this), DaggerPlayerActivity_Component.access$1200(DaggerPlayerActivity_Component.this), DaggerPlayerActivity_Component.access$2000(DaggerPlayerActivity_Component.this), setOfPlayerAnalyticsProvider, DaggerPlayerActivity_Component.access$2100(DaggerPlayerActivity_Component.this), DaggerPlayerActivity_Component.access$1100(DaggerPlayerActivity_Component.this), DaggerPlayerActivity_Component.access$2200(DaggerPlayerActivity_Component.this), DaggerPlayerActivity_Component.access$2300(DaggerPlayerActivity_Component.this));
        playerViewMembersInjector = PlayerView_MembersInjector.create(MembersInjectors.noOp(), DaggerPlayerActivity_Component.access$2400(DaggerPlayerActivity_Component.this), DaggerPlayerActivity_Component.access$1200(DaggerPlayerActivity_Component.this), DaggerPlayerActivity_Component.access$1900(DaggerPlayerActivity_Component.this), DaggerPlayerActivity_Component.access$2500(DaggerPlayerActivity_Component.this), DaggerPlayerActivity_Component.access$2600(DaggerPlayerActivity_Component.this), DaggerPlayerActivity_Component.access$2700(DaggerPlayerActivity_Component.this), DaggerPlayerActivity_Component.access$1800(DaggerPlayerActivity_Component.this), DaggerPlayerActivity_Component.access$2200(DaggerPlayerActivity_Component.this), DaggerPlayerActivity_Component.access$1100(DaggerPlayerActivity_Component.this));
        playerControlBarMembersInjector = PlayerControlBar_MembersInjector.create(MembersInjectors.noOp(), DaggerPlayerActivity_Component.access$2200(DaggerPlayerActivity_Component.this), DaggerPlayerActivity_Component.access$2800(DaggerPlayerActivity_Component.this), DaggerPlayerActivity_Component.access$1300(DaggerPlayerActivity_Component.this), DaggerPlayerActivity_Component.access$1000(DaggerPlayerActivity_Component.this), DaggerPlayerActivity_Component.access$2100(DaggerPlayerActivity_Component.this), DaggerPlayerActivity_Component.access$1100(DaggerPlayerActivity_Component.this));
        actionBarSponsorViewMembersInjector = ActionBarSponsorView_MembersInjector.create(MembersInjectors.noOp(), DaggerPlayerActivity_Component.access$1200(DaggerPlayerActivity_Component.this), DaggerPlayerActivity_Component.access$1000(DaggerPlayerActivity_Component.this), DaggerPlayerActivity_Component.access$1900(DaggerPlayerActivity_Component.this));
        altCamOverlayMembersInjector = AltCamOverlay_MembersInjector.create(MembersInjectors.noOp(), DaggerPlayerActivity_Component.access$2100(DaggerPlayerActivity_Component.this), DaggerPlayerActivity_Component.access$1100(DaggerPlayerActivity_Component.this), DaggerPlayerActivity_Component.access$2200(DaggerPlayerActivity_Component.this));
        tempPassDialogFragmentMembersInjector = TempPassDialogFragment_MembersInjector.create(MembersInjectors.noOp(), DaggerPlayerActivity_Component.access$1800(DaggerPlayerActivity_Component.this));
        playerToolbarMembersInjector = PlayerToolbar_MembersInjector.create(MembersInjectors.noOp(), DaggerPlayerActivity_Component.access$1800(DaggerPlayerActivity_Component.this), DaggerPlayerActivity_Component.access$1100(DaggerPlayerActivity_Component.this));
        panelTopMembersInjector1 = com.nbcsports.liveextra.ui.player.dataviews.PanelTop_MembersInjector.create(MembersInjectors.noOp(), DaggerPlayerActivity_Component.access$2300(DaggerPlayerActivity_Component.this), DaggerPlayerActivity_Component.access$1000(DaggerPlayerActivity_Component.this));
        panelBottomMembersInjector1 = com.nbcsports.liveextra.ui.player.dataviews.PanelBottom_MembersInjector.create(MembersInjectors.noOp(), DaggerPlayerActivity_Component.access$2300(DaggerPlayerActivity_Component.this), DaggerPlayerActivity_Component.access$1000(DaggerPlayerActivity_Component.this));
        panelSideMembersInjector = PanelSide_MembersInjector.create(MembersInjectors.noOp(), DaggerPlayerActivity_Component.access$2300(DaggerPlayerActivity_Component.this), DaggerPlayerActivity_Component.access$1000(DaggerPlayerActivity_Component.this));
        playerQosOverlayViewMembersInjector = PlayerQosOverlayView_MembersInjector.create(MembersInjectors.noOp(), DaggerPlayerActivity_Component.access$2200(DaggerPlayerActivity_Component.this), DaggerPlayerActivity_Component.access$1100(DaggerPlayerActivity_Component.this));
        adOverlayMembersInjector = AdOverlay_MembersInjector.create(MembersInjectors.noOp(), DaggerPlayerActivity_Component.access$2200(DaggerPlayerActivity_Component.this));
    }

    public void inject(PanelBottom panelbottom)
    {
        panelBottomMembersInjector.injectMembers(panelbottom);
    }

    public void inject(PanelSide panelside)
    {
        MembersInjectors.noOp().injectMembers(panelside);
    }

    public void inject(PanelTop paneltop)
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

    private _Factory(PremierLeagueModule premierleaguemodule)
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

    initialize2(PremierLeagueModule premierleaguemodule, initialize2 initialize2_1)
    {
        this(premierleaguemodule);
    }
}
