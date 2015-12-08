// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player.premierleague.stats;

import android.databinding.ObservableArrayList;
import android.databinding.ObservableInt;
import android.graphics.Color;
import com.nbcsports.liveextra.content.models.overlay.premierleague.TeamBoxScore;
import com.nbcsports.liveextra.content.models.overlay.premierleague.TeamInfo;
import com.nbcsports.liveextra.ui.player.PlayerPresenter;
import com.nbcsports.liveextra.ui.player.premierleague.PremierLeagueEngine;
import com.nbcsports.liveextra.ui.player.premierleague.core.PremierLeagueOverlayBindingPresenter;
import com.nbcsports.liveextra.ui.player.premierleague.gameinfo.TeamBoxScoreProvider;
import com.nbcsports.liveextra.ui.player.premierleague.gameinfo.TeamInfoProvider;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.List;
import org.apache.commons.collections4.CollectionUtils;
import rx.Observable;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Func2;
import timber.log.Timber;

// Referenced classes of package com.nbcsports.liveextra.ui.player.premierleague.stats:
//            TerritorialBreakdownProvider, StatsItemViewModel

public class StatsPresenter extends PremierLeagueOverlayBindingPresenter
{

    private String awayColor;
    private final TeamBoxScoreProvider boxScoreProvider;
    private String homeColor;
    private final TeamInfoProvider teamInfoProvider;
    private final TerritorialBreakdownProvider territorialProvider;

    public StatsPresenter(PremierLeagueEngine premierleagueengine, PlayerPresenter playerpresenter, TeamInfoProvider teaminfoprovider, TeamBoxScoreProvider teamboxscoreprovider, TerritorialBreakdownProvider territorialbreakdownprovider)
    {
        super(premierleagueengine, playerpresenter);
        teamInfoProvider = teaminfoprovider;
        boxScoreProvider = teamboxscoreprovider;
        territorialProvider = territorialbreakdownprovider;
    }

    private String getTeamColor(com.nbcsports.liveextra.content.models.overlay.premierleague.TeamInfo.Team team)
    {
        return (new StringBuilder()).append("#").append(team.getRgb()).toString();
    }

    private void loadStats()
    {
        addSubscription(Observable.combineLatest(teamInfoProvider.getTeamInfo(), boxScoreProvider.getTeamBoxScore(), new Func2() {

            final StatsPresenter this$0;

            public volatile Object call(Object obj, Object obj1)
            {
                return call((TeamInfo)obj, (List)obj1);
            }

            public List call(TeamInfo teaminfo, List list)
            {
                List list1 = list;
                if (CollectionUtils.isEmpty(list))
                {
                    list1 = Arrays.asList(new com.nbcsports.liveextra.content.models.overlay.premierleague.TeamBoxScore.Score[] {
                        TeamBoxScore.DEFAULT_HOME, TeamBoxScore.DEFAULT_AWAY
                    });
                }
                homeColor = getTeamColor(teaminfo.getTeamHome());
                awayColor = getTeamColor(teaminfo.getTeamAway());
                return StatsItemViewModel.getStats(list1, homeColor, awayColor);
            }

            
            {
                this$0 = StatsPresenter.this;
                super();
            }
        }).observeOn(AndroidSchedulers.mainThread()).subscribe(new Subscriber() {

            final StatsPresenter this$0;

            public void onCompleted()
            {
            }

            public void onError(Throwable throwable)
            {
                Timber.d(throwable, "Error setting stats", new Object[0]);
            }

            public volatile void onNext(Object obj)
            {
                onNext((List)obj);
            }

            public void onNext(List list)
            {
                if (!hasBinder() || CollectionUtils.isEmpty(list))
                {
                    return;
                } else
                {
                    ((StatsView.Binder)StatsPresenter.this.StatsView$Binder).statsList.clear();
                    ((StatsView.Binder)StatsPresenter.this.StatsView$Binder).statsList.addAll(list);
                    return;
                }
            }

            
            {
                this$0 = StatsPresenter.this;
                super();
            }
        }));
    }

    private void loadTeamInfo()
    {
        addSubscription(teamInfoProvider.getTeamInfo().observeOn(AndroidSchedulers.mainThread()).subscribe(new Subscriber() {

            final StatsPresenter this$0;

            public void onCompleted()
            {
            }

            public void onError(Throwable throwable)
            {
                Timber.d(throwable, "Error setting team data", new Object[0]);
            }

            public void onNext(TeamInfo teaminfo)
            {
                if (!hasBinder() || teaminfo == null)
                {
                    return;
                } else
                {
                    homeColor = getTeamColor(teaminfo.getTeamHome());
                    awayColor = getTeamColor(teaminfo.getTeamAway());
                    ((StatsView.Binder)getTeamAway).homeColor.set(Color.parseColor(homeColor));
                    ((StatsView.Binder)getTeamAway).homeColor.set(Color.parseColor(awayColor));
                    return;
                }
            }

            public volatile void onNext(Object obj)
            {
                onNext((TeamInfo)obj);
            }

            
            {
                this$0 = StatsPresenter.this;
                super();
            }
        }));
    }

    private void loadTerritoryStats()
    {
        addSubscription(territorialProvider.getCurrentInterval().observeOn(AndroidSchedulers.mainThread()).subscribe(new Subscriber() {

            final StatsPresenter this$0;

            public void onCompleted()
            {
            }

            public void onError(Throwable throwable)
            {
                Timber.d(throwable, "Error setting territory stats", new Object[0]);
            }

            public void onNext(com.nbcsports.liveextra.content.models.overlay.premierleague.TerritorialBreakdown.TerritorialInterval territorialinterval)
            {
                if (!hasBinder())
                {
                    return;
                }
                if (territorialinterval == null)
                {
                    ((StatsView.Binder)access$600).ballLocations.clear();
                    ((StatsView.Binder)access$600).ballLocations.addAll(Arrays.asList(new Double[] {
                        Double.valueOf(0.0D), Double.valueOf(0.0D), Double.valueOf(0.0D)
                    }));
                    return;
                } else
                {
                    BigDecimal bigdecimal = new BigDecimal(territorialinterval.getHomePercent() / 100D);
                    bigdecimal.setScale(2, RoundingMode.HALF_EVEN);
                    territorialinterval = new BigDecimal(territorialinterval.getAwayPercent() / 100D);
                    territorialinterval.setScale(2, RoundingMode.HALF_EVEN);
                    double d = bigdecimal.doubleValue();
                    double d1 = territorialinterval.doubleValue();
                    ((StatsView.Binder)access$600).ballLocations.clear();
                    ((StatsView.Binder)access$600).ballLocations.addAll(Arrays.asList(new Double[] {
                        Double.valueOf(bigdecimal.doubleValue()), Double.valueOf(1.0D - d - d1), Double.valueOf(territorialinterval.doubleValue())
                    }));
                    return;
                }
            }

            public volatile void onNext(Object obj)
            {
                onNext((com.nbcsports.liveextra.content.models.overlay.premierleague.TerritorialBreakdown.TerritorialInterval)obj);
            }

            
            {
                this$0 = StatsPresenter.this;
                super();
            }
        }));
    }

    public void load()
    {
        loadTeamInfo();
        loadStats();
        loadTerritoryStats();
    }

    public void onSeek()
    {
        super.onSeek();
        if (hasBinder())
        {
            ((StatsView.Binder)binder).ballLocations.clear();
            ((StatsView.Binder)binder).ballLocations.addAll(Arrays.asList(new Double[] {
                Double.valueOf(0.0D), Double.valueOf(0.0D), Double.valueOf(0.0D)
            }));
        }
    }



/*
    static String access$002(StatsPresenter statspresenter, String s)
    {
        statspresenter.homeColor = s;
        return s;
    }

*/





/*
    static String access$202(StatsPresenter statspresenter, String s)
    {
        statspresenter.awayColor = s;
        return s;
    }

*/







}
