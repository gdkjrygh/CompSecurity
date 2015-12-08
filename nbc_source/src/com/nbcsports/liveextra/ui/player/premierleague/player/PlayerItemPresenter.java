// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player.premierleague.player;

import android.databinding.ObservableBoolean;
import android.databinding.ObservableField;
import android.databinding.ObservableInt;
import com.nbcsports.liveextra.ui.player.PlayerPresenter;
import com.nbcsports.liveextra.ui.player.premierleague.PremierLeagueEngine;
import com.nbcsports.liveextra.ui.player.premierleague.core.PremierLeagueOverlayBindingPresenter;
import com.nbcsports.liveextra.ui.player.premierleague.events.EventViewModel;
import com.nbcsports.liveextra.ui.player.premierleague.events.EventsTimelineProvider;
import com.nbcsports.liveextra.ui.player.premierleague.gameinfo.MatchInfoViewModel;
import com.nbcsports.liveextra.ui.player.premierleague.gameinfo.TeamInfoProvider;
import java.util.List;
import rx.Observable;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Func1;
import timber.log.Timber;

// Referenced classes of package com.nbcsports.liveextra.ui.player.premierleague.player:
//            PlayerBoxScoreProvider, PlayerBoxScoreViewModel, PlayerBioViewModel, PlayerSeasonStatsProvider, 
//            PlayerSeasonStatsViewModel

public class PlayerItemPresenter extends PremierLeagueOverlayBindingPresenter
    implements com.nbcsports.liveextra.ui.player.premierleague.PremierLeagueEngine.Listener
{

    private final PlayerBoxScoreProvider boxScoreProvider;
    private com.nbcsports.liveextra.content.models.overlay.premierleague.PlayerInfo.Player player;
    private final PlayerSeasonStatsProvider seasonStatsProvider;
    private final TeamInfoProvider teamInfoProvider;
    private final EventsTimelineProvider timelineProvider;

    public PlayerItemPresenter(PremierLeagueEngine premierleagueengine, PlayerPresenter playerpresenter, EventsTimelineProvider eventstimelineprovider, TeamInfoProvider teaminfoprovider, PlayerSeasonStatsProvider playerseasonstatsprovider, PlayerBoxScoreProvider playerboxscoreprovider)
    {
        super(premierleagueengine, playerpresenter);
        timelineProvider = eventstimelineprovider;
        teamInfoProvider = teaminfoprovider;
        seasonStatsProvider = playerseasonstatsprovider;
        boxScoreProvider = playerboxscoreprovider;
    }

    private void setInGameStats()
    {
        addSubscription(boxScoreProvider.getPlayerBoxScoreStats(player.getPid()).map(PlayerBoxScoreViewModel.fromFeed()).onBackpressureDrop().observeOn(AndroidSchedulers.mainThread()).subscribe(new Subscriber() {

            final PlayerItemPresenter this$0;

            public void onCompleted()
            {
            }

            public void onError(Throwable throwable)
            {
                Timber.d(throwable, "", new Object[0]);
            }

            public void onNext(PlayerBoxScoreViewModel playerboxscoreviewmodel)
            {
                if (!hasBinder() || playerboxscoreviewmodel == null)
                {
                    return;
                } else
                {
                    ((PlayerItemView.Binder)
// JavaClassFileOutputException: get_constant: invalid tag

            public volatile void onNext(Object obj)
            {
                onNext((PlayerBoxScoreViewModel)obj);
            }

            
            {
                this$0 = PlayerItemPresenter.this;
                super();
            }
        }));
    }

    private void setPlayerInfo()
    {
        if (!hasBinder())
        {
            return;
        } else
        {
            PlayerBioViewModel playerbioviewmodel = PlayerBioViewModel.fromPlayer(player);
            ((PlayerItemView.Binder)binder).playerId.set(playerbioviewmodel.id);
            ((PlayerItemView.Binder)binder).country.set(playerbioviewmodel.country);
            ((PlayerItemView.Binder)binder).dateOfBirth.set(playerbioviewmodel.dateOfBirth);
            ((PlayerItemView.Binder)binder).firstName.set(playerbioviewmodel.getFirstName());
            ((PlayerItemView.Binder)binder).lastName.set(playerbioviewmodel.getLastName());
            ((PlayerItemView.Binder)binder).isGoalkeeper.set(playerbioviewmodel.isGoalkeeper());
            ((PlayerItemView.Binder)binder).height.set(playerbioviewmodel.height.intValue());
            ((PlayerItemView.Binder)binder).weight.set(playerbioviewmodel.weight.intValue());
            ((PlayerItemView.Binder)binder).jersey.set(playerbioviewmodel.jersey.intValue());
            ((PlayerItemView.Binder)binder).position.set(playerbioviewmodel.position);
            return;
        }
    }

    private void setSeasonStats()
    {
        addSubscription(seasonStatsProvider.getPlayerSeasonStats(player.getPid()).map(PlayerSeasonStatsViewModel.fromFeed()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Subscriber() {

            final PlayerItemPresenter this$0;

            public void onCompleted()
            {
            }

            public void onError(Throwable throwable)
            {
                Timber.d(throwable, "", new Object[0]);
            }

            public void onNext(PlayerSeasonStatsViewModel playerseasonstatsviewmodel)
            {
                if (!hasBinder() || playerseasonstatsviewmodel == null)
                {
                    return;
                } else
                {
                    ((PlayerItemView.Binder)
// JavaClassFileOutputException: get_constant: invalid tag

            public volatile void onNext(Object obj)
            {
                onNext((PlayerSeasonStatsViewModel)obj);
            }

            
            {
                this$0 = PlayerItemPresenter.this;
                super();
            }
        }));
    }

    private void setTeamInfo()
    {
        addSubscription(teamInfoProvider.getTeamInfo().map(MatchInfoViewModel.fromTeamInfo()).map(MatchInfoViewModel.toTeamViewModel(player.getHa())).observeOn(AndroidSchedulers.mainThread()).subscribe(new Subscriber() {

            final PlayerItemPresenter this$0;

            public void onCompleted()
            {
            }

            public void onError(Throwable throwable)
            {
                Timber.d(throwable, "", new Object[0]);
            }

            public void onNext(com.nbcsports.liveextra.ui.player.premierleague.gameinfo.MatchInfoViewModel.TeamViewModel teamviewmodel)
            {
                if (!hasBinder() || teamviewmodel == null)
                {
                    return;
                } else
                {
                    ((PlayerItemView.Binder)
// JavaClassFileOutputException: get_constant: invalid tag

            public volatile void onNext(Object obj)
            {
                onNext((com.nbcsports.liveextra.ui.player.premierleague.gameinfo.MatchInfoViewModel.TeamViewModel)obj);
            }

            
            {
                this$0 = PlayerItemPresenter.this;
                super();
            }
        }));
    }

    private void setYellowRedCard()
    {
        com.nbcsports.liveextra.content.models.overlay.premierleague.MajorEventsTimeline.TimelineEvent timelineevent = new TimelineEvent();
        timelineevent.setEventType("Card");
        timelineevent.setPid(player.getPid());
        addSubscription(timelineProvider.getEvents().flatMap(new Func1() {

            final PlayerItemPresenter this$0;

            public volatile Object call(Object obj)
            {
                return call((List)obj);
            }

            public Observable call(List list)
            {
                return Observable.from(list);
            }

            
            {
                this$0 = PlayerItemPresenter.this;
                super();
            }
        }).filter(new Func1() {

            final PlayerItemPresenter this$0;

            public Boolean call(com.nbcsports.liveextra.content.models.overlay.premierleague.MajorEventsTimeline.TimelineEvent timelineevent1)
            {
                boolean flag;
                if (timelineevent1.getPid() == player.getPid() && timelineevent1.getEventType().equals("Card"))
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                return Boolean.valueOf(flag);
            }

            public volatile Object call(Object obj)
            {
                return call((com.nbcsports.liveextra.content.models.overlay.premierleague.MajorEventsTimeline.TimelineEvent)obj);
            }

            
            {
                this$0 = PlayerItemPresenter.this;
                super();
            }
        }).onBackpressureDrop().observeOn(AndroidSchedulers.mainThread()).subscribe(new Subscriber() {

            final PlayerItemPresenter this$0;

            public void onCompleted()
            {
            }

            public void onError(Throwable throwable)
            {
                Timber.d(throwable, "", new Object[0]);
            }

            public void onNext(com.nbcsports.liveextra.content.models.overlay.premierleague.MajorEventsTimeline.TimelineEvent timelineevent1)
            {
                if (!hasBinder() || timelineevent1 == null)
                {
                    return;
                }
                if (timelineevent1.getType().contains("Red") || timelineevent1.getType().contains(EventViewModel.SECOND_YELLOW_CARD))
                {
                    ((PlayerItemView.Binder)contains).redCard.set(true);
                    ((PlayerItemView.Binder)contains).yellowCard.set(false);
                    return;
                }
                if (timelineevent1.getType().contains("Yellow"))
                {
                    ((PlayerItemView.Binder)contains).redCard.set(false);
                    ((PlayerItemView.Binder)contains).yellowCard.set(true);
                    return;
                } else
                {
                    ((PlayerItemView.Binder)contains).redCard.set(false);
                    ((PlayerItemView.Binder)contains).yellowCard.set(false);
                    return;
                }
            }

            public volatile void onNext(Object obj)
            {
                onNext((com.nbcsports.liveextra.content.models.overlay.premierleague.MajorEventsTimeline.TimelineEvent)obj);
            }

            
            {
                this$0 = PlayerItemPresenter.this;
                super();
            }
        }));
    }

    public void load()
    {
        setPlayerInfo();
        setTeamInfo();
        setInGameStats();
        setSeasonStats();
        setYellowRedCard();
    }

    public void setPlayer(com.nbcsports.liveextra.content.models.overlay.premierleague.PlayerInfo.Player player1)
    {
        player = player1;
    }











}
