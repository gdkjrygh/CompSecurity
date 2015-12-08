// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player.premierleague.standings;

import android.view.View;
import com.nbcsports.liveextra.content.models.overlay.premierleague.LeagueInfo;
import com.nbcsports.liveextra.ui.player.PlayerPresenter;
import com.nbcsports.liveextra.ui.player.premierleague.PremierLeagueEngine;
import com.nbcsports.liveextra.ui.player.premierleague.core.PremierLeagueOverlayPresenter;
import com.nbcsports.liveextra.ui.player.premierleague.league.LeagueInfoProvider;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.collections4.Predicate;
import rx.Observable;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Func2;
import timber.log.Timber;

// Referenced classes of package com.nbcsports.liveextra.ui.player.premierleague.standings:
//            LiveTableProvider, StandingsView, StandingsViewModel

public class StandingsPresenter extends PremierLeagueOverlayPresenter
{

    private final LeagueInfoProvider leagueInfoProvider;
    private final LiveTableProvider provider;

    public StandingsPresenter(PremierLeagueEngine premierleagueengine, PlayerPresenter playerpresenter, LiveTableProvider livetableprovider, LeagueInfoProvider leagueinfoprovider)
    {
        super(premierleagueengine, playerpresenter);
        provider = livetableprovider;
        leagueInfoProvider = leagueinfoprovider;
    }

    protected void load()
    {
        addSubscription(Observable.combineLatest(provider.getStandings(), leagueInfoProvider.getLeagueInfo(), new Func2() {

            final StandingsPresenter this$0;

            public volatile Object call(Object obj, Object obj1)
            {
                return call((com.nbcsports.liveextra.content.models.overlay.premierleague.Standings.Week)obj, (LeagueInfo)obj1);
            }

            public List call(com.nbcsports.liveextra.content.models.overlay.premierleague.Standings.Week week, LeagueInfo leagueinfo)
            {
                ArrayList arraylist = new ArrayList();
                week = week.getTeams();
                leagueinfo = leagueinfo.getTeams();
                Iterator iterator = week.iterator();
                while (iterator.hasNext()) 
                {
                    com.nbcsports.liveextra.content.models.overlay.premierleague.Standings.Team team = (com.nbcsports.liveextra.content.models.overlay.premierleague.Standings.Team)iterator.next();
                    week = (com.nbcsports.liveextra.content.models.overlay.premierleague.LeagueInfo.LeagueTeam)CollectionUtils.find(leagueinfo, team. new Predicate() {

                        final _cls2 this$1;
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
                this$1 = final__pcls2;
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
                this$0 = StandingsPresenter.this;
                super();
            }
        }).onBackpressureBuffer().observeOn(AndroidSchedulers.mainThread()).subscribe(new Subscriber() {

            final StandingsPresenter this$0;

            public void onCompleted()
            {
            }

            public void onError(Throwable throwable)
            {
                Timber.d(throwable, "", new Object[0]);
            }

            public volatile void onNext(Object obj)
            {
                onNext((List)obj);
            }

            public void onNext(List list)
            {
                if (
// JavaClassFileOutputException: get_constant: invalid tag

            
            {
                this$0 = StandingsPresenter.this;
                super();
            }
        }));
    }


}
