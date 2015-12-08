// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player.premierleague.player;

import com.google.gson.Gson;
import com.nbcsports.liveextra.content.models.overlay.premierleague.PlayerBoxScore;
import com.nbcsports.liveextra.content.models.overlay.premierleague.PremiereLeagueFeedName;
import com.nbcsports.liveextra.content.overlay.OverlayPollingSubscriber;
import com.nbcsports.liveextra.ui.player.premierleague.PremierLeagueEngine;
import com.nbcsports.liveextra.ui.player.premierleague.core.PremierLeaguePollingProvider;
import com.squareup.okhttp.OkHttpClient;
import org.apache.commons.collections4.CollectionUtils;
import rx.Observable;
import rx.functions.Func1;

public class PlayerBoxScoreProvider extends PremierLeaguePollingProvider
{
    public static class PlayerBoxScoreSubscriber extends OverlayPollingSubscriber
    {

        public PlayerBoxScoreSubscriber(OkHttpClient okhttpclient, Gson gson)
        {
            super(okhttpclient, gson, com/nbcsports/liveextra/content/models/overlay/premierleague/PlayerBoxScore);
        }
    }


    public PlayerBoxScoreProvider(PremierLeagueEngine premierleagueengine, PlayerBoxScoreSubscriber playerboxscoresubscriber)
    {
        super(premierleagueengine, playerboxscoresubscriber, PremiereLeagueFeedName.PlayerBoxscore);
    }

    public Observable getPlayerBoxScoreStats(final int pid)
    {
        return getObservable().flatMap(new Func1() {

            final PlayerBoxScoreProvider this$0;

            public volatile Object call(Object obj)
            {
                return call((PlayerBoxScore)obj);
            }

            public Observable call(PlayerBoxScore playerboxscore)
            {
                if (playerboxscore == null || CollectionUtils.isEmpty(playerboxscore.getStats()))
                {
                    return Observable.empty();
                } else
                {
                    return Observable.from(playerboxscore.getStats());
                }
            }

            
            {
                this$0 = PlayerBoxScoreProvider.this;
                super();
            }
        }).filter(new Func1() {

            final PlayerBoxScoreProvider this$0;
            final int val$pid;

            public Boolean call(com.nbcsports.liveextra.content.models.overlay.premierleague.PlayerBoxScore.Stat stat)
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
                return call((com.nbcsports.liveextra.content.models.overlay.premierleague.PlayerBoxScore.Stat)obj);
            }

            
            {
                this$0 = PlayerBoxScoreProvider.this;
                pid = i;
                super();
            }
        });
    }

    public void showGoLive(boolean flag)
    {
    }
}
