// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player.premierleague.player;

import com.google.gson.Gson;
import com.nbcsports.liveextra.content.models.overlay.premierleague.PlayerInfo;
import com.nbcsports.liveextra.content.models.overlay.premierleague.PremiereLeagueFeedName;
import com.nbcsports.liveextra.content.overlay.OverlayPollingSubscriber;
import com.nbcsports.liveextra.ui.player.premierleague.PremierLeagueEngine;
import com.nbcsports.liveextra.ui.player.premierleague.core.PremierLeaguePollingProvider;
import com.squareup.okhttp.OkHttpClient;
import java.util.ArrayList;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.collections4.Predicate;
import rx.Observable;
import rx.functions.Func1;

public class PlayerInfoProvider extends PremierLeaguePollingProvider
{
    public static class PlayerInfoSubscriber extends OverlayPollingSubscriber
    {

        public PlayerInfoSubscriber(OkHttpClient okhttpclient, Gson gson)
        {
            super(okhttpclient, gson, com/nbcsports/liveextra/content/models/overlay/premierleague/PlayerInfo);
        }
    }


    public PlayerInfoProvider(PremierLeagueEngine premierleagueengine, PlayerInfoSubscriber playerinfosubscriber)
    {
        super(premierleagueengine, playerinfosubscriber, PremiereLeagueFeedName.PlayerInfo);
    }

    public Observable getPlayer(final int pid)
    {
        return getPlayerInfo().flatMap(new Func1() {

            final PlayerInfoProvider this$0;

            public volatile Object call(Object obj)
            {
                return call((PlayerInfo)obj);
            }

            public Observable call(PlayerInfo playerinfo)
            {
                if (playerinfo == null || CollectionUtils.isEmpty(playerinfo.getPlayers()))
                {
                    return Observable.empty();
                } else
                {
                    return Observable.from(new ArrayList(playerinfo.getPlayers()));
                }
            }

            
            {
                this$0 = PlayerInfoProvider.this;
                super();
            }
        }).filter(new Func1() {

            final PlayerInfoProvider this$0;
            final int val$pid;

            public Boolean call(com.nbcsports.liveextra.content.models.overlay.premierleague.PlayerInfo.Player player)
            {
                if (player == null)
                {
                    return null;
                }
                boolean flag;
                if (player.getPid() == pid)
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
                return call((com.nbcsports.liveextra.content.models.overlay.premierleague.PlayerInfo.Player)obj);
            }

            
            {
                this$0 = PlayerInfoProvider.this;
                pid = i;
                super();
            }
        });
    }

    public Observable getPlayerInfo()
    {
        return getObservable();
    }

    public Observable getPlayers(final String key)
    {
        return getPlayerInfo().flatMap(new Func1() {

            final PlayerInfoProvider this$0;
            final String val$key;

            public volatile Object call(Object obj)
            {
                return call((PlayerInfo)obj);
            }

            public Observable call(PlayerInfo playerinfo)
            {
                if (playerinfo == null || CollectionUtils.isEmpty(playerinfo.getPlayers()))
                {
                    return Observable.empty();
                } else
                {
                    playerinfo = new ArrayList(playerinfo.getPlayers());
                    CollectionUtils.filter(playerinfo, new Predicate() {

                        final _cls1 this$1;

                        public boolean evaluate(com.nbcsports.liveextra.content.models.overlay.premierleague.PlayerInfo.Player player)
                        {
                            return player.getHa().equals(key);
                        }

                        public volatile boolean evaluate(Object obj)
                        {
                            return evaluate((com.nbcsports.liveextra.content.models.overlay.premierleague.PlayerInfo.Player)obj);
                        }

            
            {
                this$1 = _cls1.this;
                super();
            }
                    });
                    return Observable.just(playerinfo);
                }
            }

            
            {
                this$0 = PlayerInfoProvider.this;
                key = s;
                super();
            }
        });
    }

    public void showGoLive(boolean flag)
    {
    }
}
