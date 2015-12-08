// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player.premierleague.gameinfo;

import android.util.Pair;
import android.view.View;
import com.nbcsports.liveextra.content.models.overlay.premierleague.GameInfo;
import com.nbcsports.liveextra.content.models.overlay.premierleague.LeagueInfo;
import com.nbcsports.liveextra.content.models.overlay.premierleague.MajorEventsTimeline;
import com.nbcsports.liveextra.ui.player.PlayerPresenter;
import com.nbcsports.liveextra.ui.player.premierleague.PremierLeagueEngine;
import com.nbcsports.liveextra.ui.player.premierleague.core.PremierLeagueOverlayPresenter;
import com.nbcsports.liveextra.ui.player.premierleague.core.TimeUtils;
import com.nbcsports.liveextra.ui.player.premierleague.events.EventsTimelineProvider;
import com.nbcsports.liveextra.ui.player.premierleague.league.LeagueInfoProvider;
import com.nbcsports.liveextra.ui.player.premierleague.standings.StandingsLiveProvider;
import com.nbcsports.liveextra.ui.player.premierleague.standings.StandingsViewModel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.collections4.Predicate;
import org.joda.time.DateTime;
import org.joda.time.Minutes;
import org.joda.time.Seconds;
import rx.Observable;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.functions.Func1;
import rx.functions.Func2;
import rx.schedulers.Schedulers;
import timber.log.Timber;

// Referenced classes of package com.nbcsports.liveextra.ui.player.premierleague.gameinfo:
//            GameInfoProvider, TeamBoxScoreProvider, TeamInfoProvider, MatchInfoViewModel, 
//            MatchScoreView

public class MatchScorePresenter extends PremierLeagueOverlayPresenter
{

    private final GameInfoProvider gameInfoProvider;
    private final LeagueInfoProvider leagueInfoProvider;
    private final TeamBoxScoreProvider scoreProvider;
    private final StandingsLiveProvider standingsProvider;
    private final TeamInfoProvider teamInfoProvider;
    private final EventsTimelineProvider timelineProvider;

    public MatchScorePresenter(PremierLeagueEngine premierleagueengine, PlayerPresenter playerpresenter, GameInfoProvider gameinfoprovider, TeamInfoProvider teaminfoprovider, TeamBoxScoreProvider teamboxscoreprovider, LeagueInfoProvider leagueinfoprovider, EventsTimelineProvider eventstimelineprovider, 
            StandingsLiveProvider standingsliveprovider)
    {
        super(premierleagueengine, playerpresenter);
        gameInfoProvider = gameinfoprovider;
        teamInfoProvider = teaminfoprovider;
        scoreProvider = teamboxscoreprovider;
        leagueInfoProvider = leagueinfoprovider;
        timelineProvider = eventstimelineprovider;
        standingsProvider = standingsliveprovider;
    }

    private void loadClock()
    {
        addSubscription(timelineProvider.getMajorEventsTimeline().flatMap(new Func1() {

            final MatchScorePresenter this$0;

            public volatile Object call(Object obj)
            {
                return call((MajorEventsTimeline)obj);
            }

            public Observable call(MajorEventsTimeline majoreventstimeline)
            {
                if (majoreventstimeline == null)
                {
                    return null;
                }
                majoreventstimeline = new ArrayList(majoreventstimeline.getEvents());
                CollectionUtils.filter(majoreventstimeline, new Predicate() );
                if (majoreventstimeline.isEmpty())
                {
                    return Observable.just(null);
                } else
                {
                    return Observable.just((com.nbcsports.liveextra.content.models.overlay.premierleague.MajorEventsTimeline.TimelineEvent)majoreventstimeline.get(majoreventstimeline.size() - 1));
                }
            }

            
            {
                this$0 = MatchScorePresenter.this;
                super();
            }
        }).map(new Func1() {

            final MatchScorePresenter this$0;

            public volatile Object call(Object obj)
            {
                return call((com.nbcsports.liveextra.content.models.overlay.premierleague.MajorEventsTimeline.TimelineEvent)obj);
            }

            public String call(com.nbcsports.liveextra.content.models.overlay.premierleague.MajorEventsTimeline.TimelineEvent timelineevent)
            {
                if (timelineevent == null || 
// JavaClassFileOutputException: get_constant: invalid tag

            
            {
                this$0 = MatchScorePresenter.this;
                super();
            }
        }).observeOn(AndroidSchedulers.mainThread()).subscribe(new Subscriber() ));
    }

    private void loadGameInfo()
    {
        addSubscription(gameInfoProvider.getGameInfo().map(new Func1() {

            final MatchScorePresenter this$0;

            public Integer call(GameInfo gameinfo)
            {
                if (gameinfo == null)
                {
                    return null;
                } else
                {
                    return Integer.valueOf(gameinfo.getWeek());
                }
            }

            public volatile Object call(Object obj)
            {
                return call((GameInfo)obj);
            }

            
            {
                this$0 = MatchScorePresenter.this;
                super();
            }
        }).observeOn(AndroidSchedulers.mainThread()).subscribe(new Subscriber() ));
    }

    private void loadScore()
    {
        addSubscription(scoreProvider.getScore().subscribeOn(Schedulers.newThread()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Subscriber() ));
    }

    private void loadStandings(final MatchInfoViewModel viewModel)
    {
        addSubscription(Observable.combineLatest(standingsProvider.getStandings(), leagueInfoProvider.getLeagueInfo(), new Func2() {

            final MatchScorePresenter this$0;

            public volatile Object call(Object obj, Object obj1)
            {
                return call((com.nbcsports.liveextra.content.models.overlay.premierleague.Standings.Week)obj, (LeagueInfo)obj1);
            }

            public List call(com.nbcsports.liveextra.content.models.overlay.premierleague.Standings.Week week, LeagueInfo leagueinfo)
            {
                ArrayList arraylist = new ArrayList();
                week = new ArrayList(week.getTeams());
                leagueinfo = new ArrayList(leagueinfo.getTeams());
                Iterator iterator = week.iterator();
                while (iterator.hasNext()) 
                {
                    com.nbcsports.liveextra.content.models.overlay.premierleague.Standings.Team team = (com.nbcsports.liveextra.content.models.overlay.premierleague.Standings.Team)iterator.next();
                    week = (com.nbcsports.liveextra.content.models.overlay.premierleague.LeagueInfo.LeagueTeam)CollectionUtils.find(leagueinfo, team. new Predicate() {

                        final _cls8 this$1;
                        final com.nbcsports.liveextra.content.models.overlay.premierleague.Standings.Team val$team;

                        public boolean evaluate(com.nbcsports.liveextra.content.models.overlay.premierleague.LeagueInfo.LeagueTeam leagueteam)
                        {
                            return team.getTeamId() == leagueteam.getTeamId();
                        }

                        public volatile boolean evaluate(Object obj)
                        {
                            return evaluate((com.nbcsports.liveextra.content.models.overlay.premierleague.LeagueInfo.LeagueTeam)obj);
                        }

            
            {
                this$1 = final__pcls8;
                team = com.nbcsports.liveextra.content.models.overlay.premierleague.Standings.Team.this;
                super();
            }
                    });
                    if (week != null)
                    {
                        week = week.getName();
                    } else
                    {
                        week = "---";
                    }
                    arraylist.add(new StandingsViewModel(team, week));
                }
                Collections.sort(arraylist);
                return arraylist;
            }

            
            {
                this$0 = MatchScorePresenter.this;
                super();
            }
        }).flatMap(new Func1() {

            final MatchScorePresenter this$0;
            final MatchInfoViewModel val$viewModel;

            public volatile Object call(Object obj)
            {
                return call((List)obj);
            }

            public Observable call(List list)
            {
                StandingsViewModel standingsviewmodel = (StandingsViewModel)CollectionUtils.find(list, new Predicate() {

                    final _cls7 this$1;

                    public boolean evaluate(StandingsViewModel standingsviewmodel)
                    {
                        return standingsviewmodel.getId() == viewModel.getHome().getTeamId();
                    }

                    public volatile boolean evaluate(Object obj)
                    {
                        return evaluate((StandingsViewModel)obj);
                    }

            
            {
                this$1 = _cls7.this;
                super();
            }
                });
                StandingsViewModel standingsviewmodel1 = (StandingsViewModel)CollectionUtils.find(list, new Predicate() {

                    final _cls7 this$1;

                    public boolean evaluate(StandingsViewModel standingsviewmodel)
                    {
                        return standingsviewmodel.getId() == viewModel.getAway().getTeamId();
                    }

                    public volatile boolean evaluate(Object obj)
                    {
                        return evaluate((StandingsViewModel)obj);
                    }

            
            {
                this$1 = _cls7.this;
                super();
            }
                });
                standingsviewmodel.setViewPos(list.indexOf(standingsviewmodel) + 1);
                standingsviewmodel1.setViewPos(list.indexOf(standingsviewmodel1) + 1);
                return Observable.just(new Pair(standingsviewmodel, standingsviewmodel1));
            }

            
            {
                this$0 = MatchScorePresenter.this;
                viewModel = matchinfoviewmodel;
                super();
            }
        }).observeOn(AndroidSchedulers.mainThread()).subscribe(new Subscriber() {

            final MatchScorePresenter this$0;
            final MatchInfoViewModel val$viewModel;

            public void onCompleted()
            {
            }

            public void onError(Throwable throwable)
            {
                Timber.d(throwable, "", new Object[0]);
            }

            public void onNext(Pair pair)
            {
                if (!hasView() || pair == null)
                {
                    return;
                } else
                {
                    viewModel.getAway().setPoints(((StandingsViewModel)pair.second).getPts());
                    ((MatchScoreView)
// JavaClassFileOutputException: get_constant: invalid tag

            public volatile void onNext(Object obj)
            {
                onNext((Pair)obj);
            }

            
            {
                this$0 = MatchScorePresenter.this;
                viewModel = matchinfoviewmodel;
                super();
            }
        }));
    }

    private void loadTeamInfo()
    {
        addSubscription(teamInfoProvider.getTeamInfo().map(MatchInfoViewModel.fromTeamInfo()).observeOn(AndroidSchedulers.mainThread()).doOnNext(new Action1() {

            final MatchScorePresenter this$0;

            public void call(MatchInfoViewModel matchinfoviewmodel)
            {
                if (matchinfoviewmodel == null)
                {
                    return;
                } else
                {
                    loadStandings(matchinfoviewmodel);
                    return;
                }
            }

            public volatile void call(Object obj)
            {
                call((MatchInfoViewModel)obj);
            }

            
            {
                this$0 = MatchScorePresenter.this;
                super();
            }
        }).subscribe(new Subscriber() ));
    }

    protected void load()
    {
        loadClock();
        loadScore();
        loadGameInfo();
        loadTeamInfo();
    }











}
