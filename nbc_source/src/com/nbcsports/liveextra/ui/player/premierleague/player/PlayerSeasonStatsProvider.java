// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player.premierleague.player;

import com.google.gson.Gson;
import com.nbcsports.liveextra.content.models.overlay.premierleague.GameInfo;
import com.nbcsports.liveextra.content.models.overlay.premierleague.PlayerSeasonStats;
import com.nbcsports.liveextra.content.models.overlay.premierleague.PremiereLeagueFeedName;
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

public class PlayerSeasonStatsProvider extends PremierLeaguePollingProvider
{
    public static class PlayerSeasonStatsSubscriber extends OverlayPollingSubscriber
    {

        public PlayerSeasonStatsSubscriber(OkHttpClient okhttpclient, Gson gson)
        {
            super(okhttpclient, gson, com/nbcsports/liveextra/content/models/overlay/premierleague/PlayerSeasonStats);
        }
    }


    private final Subscription gameSubscription;
    private int season;

    public PlayerSeasonStatsProvider(PremierLeagueEngine premierleagueengine, final PlayerSeasonStatsSubscriber subscriber, GameInfoProvider gameinfoprovider)
    {
        super(premierleagueengine, subscriber, PremiereLeagueFeedName.PlayerSeasonStats);
        gameSubscription = gameinfoprovider.getGameInfo().subscribe(new Subscriber() {

            final PlayerSeasonStatsProvider this$0;
            final PlayerSeasonStatsSubscriber val$subscriber;

            public void onCompleted()
            {
            }

            public void onError(Throwable throwable)
            {
                Timber.d(throwable, "", new Object[0]);
            }

            public void onNext(GameInfo gameinfo)
            {
                if (gameinfo == null || gameinfo.getSeason() == 0)
                {
                    return;
                } else
                {
                    season = gameinfo.getSeason();
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
                this$0 = PlayerSeasonStatsProvider.this;
                subscriber = playerseasonstatssubscriber;
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

    public Observable getPlayerSeasonStats(final int pid)
    {
        return getObservable().flatMap(new Func1() {

            final PlayerSeasonStatsProvider this$0;

            public volatile Object call(Object obj)
            {
                return call((PlayerSeasonStats)obj);
            }

            public Observable call(PlayerSeasonStats playerseasonstats)
            {
                if (playerseasonstats == null || CollectionUtils.isEmpty(playerseasonstats.getStats()))
                {
                    return Observable.empty();
                } else
                {
                    return Observable.from(playerseasonstats.getStats());
                }
            }

            
            {
                this$0 = PlayerSeasonStatsProvider.this;
                super();
            }
        }).filter(new Func1() {

            final PlayerSeasonStatsProvider this$0;
            final int val$pid;

            public Boolean call(com.nbcsports.liveextra.content.models.overlay.premierleague.PlayerSeasonStats.Stat stat)
            {
                boolean flag;
                if (stat.getPid() == pid)
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
                return call((com.nbcsports.liveextra.content.models.overlay.premierleague.PlayerSeasonStats.Stat)obj);
            }

            
            {
                this$0 = PlayerSeasonStatsProvider.this;
                pid = i;
                super();
            }
        });
    }

    protected android.net.Uri.Builder getUrlBuilder()
    {
        android.net.Uri.Builder builder = super.getUrlBuilder();
        if (season == 0)
        {
            Timber.d((new StringBuilder()).append("GameInfo is unavailable, cannot continue retrieving ").append(getPollingSubscriber().getResultClass().getSimpleName()).toString(), new Object[0]);
        }
        builder.appendQueryParameter("season", String.valueOf(season));
        return builder;
    }

    public void showGoLive(boolean flag)
    {
    }


/*
    static int access$002(PlayerSeasonStatsProvider playerseasonstatsprovider, int i)
    {
        playerseasonstatsprovider.season = i;
        return i;
    }

*/
}
