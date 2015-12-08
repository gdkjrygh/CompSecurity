// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player.premierleague.standings;

import com.google.gson.Gson;
import com.nbcsports.liveextra.content.models.overlay.premierleague.GameInfo;
import com.nbcsports.liveextra.content.models.overlay.premierleague.PremiereLeagueFeedName;
import com.nbcsports.liveextra.content.models.overlay.premierleague.Standings;
import com.nbcsports.liveextra.content.overlay.OverlayPollingSubscriber;
import com.nbcsports.liveextra.ui.player.premierleague.PremierLeagueEngine;
import com.nbcsports.liveextra.ui.player.premierleague.core.PremierLeaguePollingProvider;
import com.nbcsports.liveextra.ui.player.premierleague.gameinfo.GameInfoProvider;
import com.squareup.okhttp.OkHttpClient;
import org.apache.commons.collections4.CollectionUtils;
import rx.Observable;
import rx.Subscriber;
import rx.Subscription;
import rx.functions.Func1;
import timber.log.Timber;

public class StandingsLiveProvider extends PremierLeaguePollingProvider
{
    public static class StandingsLiveSubscriber extends OverlayPollingSubscriber
    {

        protected boolean shouldUseCache()
        {
            return false;
        }

        public StandingsLiveSubscriber(OkHttpClient okhttpclient, Gson gson)
        {
            super(okhttpclient, gson, com/nbcsports/liveextra/content/models/overlay/premierleague/Standings);
        }
    }


    private final Subscription gameSubscription;
    private int season;
    private int week;

    public StandingsLiveProvider(PremierLeagueEngine premierleagueengine, final StandingsLiveSubscriber subscriber, GameInfoProvider gameinfoprovider)
    {
        super(premierleagueengine, subscriber, PremiereLeagueFeedName.StandingsLive);
        gameSubscription = gameinfoprovider.getGameInfo().subscribe(new Subscriber() {

            final StandingsLiveProvider this$0;
            final StandingsLiveSubscriber val$subscriber;

            public void onCompleted()
            {
            }

            public void onError(Throwable throwable)
            {
                Timber.d(throwable, "Error getting game info", new Object[0]);
            }

            public void onNext(GameInfo gameinfo)
            {
                if (gameinfo == null || gameinfo.getSeason() == 0 || gameinfo.getWeek() == 0)
                {
                    return;
                } else
                {
                    season = gameinfo.getSeason();
                    week = gameinfo.getWeek();
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
                this$0 = StandingsLiveProvider.this;
                subscriber = standingslivesubscriber;
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

            final StandingsLiveProvider this$0;

            public volatile Object call(Object obj)
            {
                return call((Standings)obj);
            }

            public Observable call(Standings standings)
            {
                if (standings == null || CollectionUtils.isEmpty(standings.getWeeks()))
                {
                    return null;
                } else
                {
                    return Observable.from(standings.getWeeks());
                }
            }

            
            {
                this$0 = StandingsLiveProvider.this;
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
            builder.appendQueryParameter("wk", String.valueOf(week - 1));
            return builder;
        }
    }

    public void showGoLive(boolean flag)
    {
    }


/*
    static int access$002(StandingsLiveProvider standingsliveprovider, int i)
    {
        standingsliveprovider.season = i;
        return i;
    }

*/


/*
    static int access$102(StandingsLiveProvider standingsliveprovider, int i)
    {
        standingsliveprovider.week = i;
        return i;
    }

*/
}
