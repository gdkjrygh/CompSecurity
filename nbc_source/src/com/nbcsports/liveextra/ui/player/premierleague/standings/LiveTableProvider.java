// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player.premierleague.standings;

import com.google.gson.Gson;
import com.nbcsports.liveextra.content.models.overlay.premierleague.GameInfo;
import com.nbcsports.liveextra.content.models.overlay.premierleague.LeagueInfo;
import com.nbcsports.liveextra.content.models.overlay.premierleague.PremiereLeagueFeedName;
import com.nbcsports.liveextra.content.models.overlay.premierleague.Standings;
import com.nbcsports.liveextra.content.overlay.OverlayPollingSubscriber;
import com.nbcsports.liveextra.ui.player.premierleague.PremierLeagueEngine;
import com.nbcsports.liveextra.ui.player.premierleague.core.PremierLeaguePollingProvider;
import com.nbcsports.liveextra.ui.player.premierleague.gameinfo.GameInfoProvider;
import com.nbcsports.liveextra.ui.player.premierleague.league.LeagueInfoProvider;
import com.squareup.okhttp.OkHttpClient;
import java.util.List;
import org.apache.commons.collections4.CollectionUtils;
import rx.Observable;
import rx.Subscriber;
import rx.Subscription;
import rx.functions.Func1;
import timber.log.Timber;

public class LiveTableProvider extends PremierLeaguePollingProvider
{
    public static class LiveTableSubscriber extends OverlayPollingSubscriber
    {

        protected boolean shouldUseCache()
        {
            return false;
        }

        public LiveTableSubscriber(OkHttpClient okhttpclient, Gson gson)
        {
            super(okhttpclient, gson, com/nbcsports/liveextra/content/models/overlay/premierleague/Standings);
        }
    }


    private final Subscription gameSubscription;
    private int season;
    private int week;

    public LiveTableProvider(PremierLeagueEngine premierleagueengine, final LiveTableSubscriber subscriber, GameInfoProvider gameinfoprovider, LeagueInfoProvider leagueinfoprovider)
    {
        super(premierleagueengine, subscriber, PremiereLeagueFeedName.StandingsLive);
        gameSubscription = gameinfoprovider.getGameInfo().subscribe(new Subscriber() {

            final LiveTableProvider this$0;
            final LiveTableSubscriber val$subscriber;

            public void onCompleted()
            {
            }

            public void onError(Throwable throwable)
            {
                Timber.d(throwable, "Error getting game info", new Object[0]);
            }

            public void onNext(GameInfo gameinfo)
            {
                if (gameinfo == null || gameinfo.getSeason() == 0 || gameinfo.getMaxWeek() == 0)
                {
                    return;
                } else
                {
                    season = gameinfo.getSeason();
                    week = gameinfo.getMaxWeek();
                    subscriber.kick();
                    unsubscribe();
                    return;
                }
            }

            public volatile void onNext(Object obj)
            {
                onNext((GameInfo)obj);
            }

            
            {
                this$0 = LiveTableProvider.this;
                subscriber = livetablesubscriber;
                super();
            }
        });
        leagueinfoprovider.getLeagueInfo().subscribe(new Subscriber() {

            final LiveTableProvider this$0;
            final LiveTableSubscriber val$subscriber;

            public void onCompleted()
            {
            }

            public void onError(Throwable throwable)
            {
            }

            public void onNext(LeagueInfo leagueinfo)
            {
                if (leagueinfo == null || CollectionUtils.isEmpty(leagueinfo.getTeams()))
                {
                    return;
                } else
                {
                    subscriber.kick();
                    unsubscribe();
                    return;
                }
            }

            public volatile void onNext(Object obj)
            {
                onNext((LeagueInfo)obj);
            }

            
            {
                this$0 = LiveTableProvider.this;
                subscriber = livetablesubscriber;
                super();
            }
        });
    }

    protected void finalize()
        throws Throwable
    {
        super.finalize();
        if (gameSubscription != null)
        {
            gameSubscription.unsubscribe();
        }
    }

    public Observable getStandings()
    {
        return getObservable().flatMap(new Func1() {

            final LiveTableProvider this$0;

            public volatile Object call(Object obj)
            {
                return call((Standings)obj);
            }

            public Observable call(Standings standings)
            {
                if (standings == null || CollectionUtils.isEmpty(standings.getWeeks()))
                {
                    Timber.d("GetStandings returned no data", new Object[0]);
                    return null;
                } else
                {
                    Timber.d("Returning current week standings", new Object[0]);
                    return Observable.just((com.nbcsports.liveextra.content.models.overlay.premierleague.Standings.Week)standings.getWeeks().get(0));
                }
            }

            
            {
                this$0 = LiveTableProvider.this;
                super();
            }
        });
    }

    protected android.net.Uri.Builder getUrlBuilder()
    {
        android.net.Uri.Builder builder = super.getUrlBuilder();
        if (builder == null)
        {
            return null;
        }
        if (season == 0 || week == 0)
        {
            Timber.d((new StringBuilder()).append("GameInfo is unavailable, cannot continue retrieving ").append(getPollingSubscriber().getResultClass().getSimpleName()).toString(), new Object[0]);
            return null;
        } else
        {
            builder.appendQueryParameter("season", String.valueOf(season));
            builder.appendQueryParameter("wk", String.valueOf(week));
            return builder;
        }
    }

    public void showGoLive(boolean flag)
    {
    }


/*
    static int access$002(LiveTableProvider livetableprovider, int i)
    {
        livetableprovider.season = i;
        return i;
    }

*/


/*
    static int access$102(LiveTableProvider livetableprovider, int i)
    {
        livetableprovider.week = i;
        return i;
    }

*/
}
